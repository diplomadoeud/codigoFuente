import {Component, Inject, NgZone, OnInit, ViewChild} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {PaisesService} from '../../services/paises.service';
import {PaisesModel} from '../../models/paises.model';
import {AppCargandoService} from '../../appBase/cargando/app.cargando.service';
import {CreatePaisResponse} from '../../responses/listResponses';


@Component({
  selector: 'app-diagcreatdependencsp-component',
  templateUrl: 'diagcreatpaisescomponent.html'
})
export class DialogcreatpaisesComponent implements OnInit {
  paisForm: FormGroup;
  dataAdded: Array<PaisesModel>;
  selectedpais: PaisesModel;
  paisSubmited: boolean;

  constructor(
    public dialogRef: MatDialogRef<DialogcreatpaisesComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any, private builder: FormBuilder,
    private paisService: PaisesService,  private cargServ: AppCargandoService,
    private ngZone: NgZone) {
    if (data.dataed === null) {
      this.selectedpais = new PaisesModel(null);
    } else {
      this.selectedpais = new PaisesModel(data.dataed);
    }

  }

  public Close(resultad: boolean): void {
    let resultado: any;

    if (resultad === true) {
      resultado = {result: resultad, dataAdded: this.dataAdded};
    } else {
      resultado = {result: resultad, dataAdded: null};
    }
    this.dialogRef.close(resultado);
  }

  onSubmitCrear(): void {
    this.paisSubmited = true;
    if (this.paisForm.invalid) {
      return;
    }
    const PaisesModelEnv = new PaisesModel(this.paisForm.value);
    this.cargServ.iniciarCargando();
    if (this.data.dataed === null) {
      this.paisService.crearPais(PaisesModelEnv).subscribe((res: Response) => {
        const response: CreatePaisResponse = res as any;
        this.cargServ.detenCargando();
        if (response.responseCode === 1) {
          alert('Pais Creado');
          this.dataAdded = response.pais;
          this.Close(true);
        } else {
          alert(response.responseDescription);
        }
      });
    } else  {
      this.paisService.editarPais(PaisesModelEnv).subscribe((res: Response) => {
        const response: CreatePaisResponse = res as any;
        this.cargServ.detenCargando();
        if (response.responseCode === 1) {
          alert('Pais Editado');
          this.dataAdded = response.pais;
          this.Close(true);
        } else {
          alert(response.responseDescription);
        }
      });
    }

  }


  iniciarForm(): void {
    this.paisForm = this.builder.group({
      idPai: [this.selectedpais.idPai, []],
      nombre: [this.selectedpais.nombre, [Validators.required, Validators.maxLength(255)]],
      abreviatura: [this.selectedpais.abreviatura, [Validators.required, Validators.maxLength(3)]]
    });
  }

  ngOnInit(): void {
    this.iniciarForm();
  }


}

