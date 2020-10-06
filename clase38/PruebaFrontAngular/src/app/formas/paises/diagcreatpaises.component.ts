import {Component, Inject,  OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from '@angular/material/dialog';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {PaisesService} from '../../services/paises.service';
import {PaisesModel} from '../../models/paises.model';
import {AppCargandoService} from '../../appBase/cargando/app.cargando.service';
import {CreatePaisResponse} from '../../responses/listResponses';
import {DialogMessagesComponent} from './diagmessages.component';


@Component({
  selector: 'app-diagcreatdependencsp-component',
  templateUrl: 'diagcreatpaisescomponent.html'
})
export class DialogcreatpaisesComponent implements OnInit {
  paisForm: FormGroup;
  dataAdEd: Array<PaisesModel>;
  selectedpais: PaisesModel;
  paisSubmited: boolean;
  constructor(
    public dialog: MatDialog,
    public dialogRef: MatDialogRef<DialogcreatpaisesComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any, private builder: FormBuilder,
    private paisService: PaisesService,  private cargServ: AppCargandoService) {
    if (data.dataed === null) {
      this.selectedpais = new PaisesModel(null);
    } else {
      this.selectedpais = new PaisesModel(data.dataed);
    }

  }

  public Close(resultad: boolean): void {
    let resultado: any;

    if (resultad === true) {
      resultado = {result: resultad, dataAdEd: this.dataAdEd};
    } else {
      resultado = {result: resultad, dataAdEd: null};
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
          this.dataAdEd = response.pais;
          this.Close(true);
        } else {
          this.dialog.open(DialogMessagesComponent, {
            minWidth: '320px',
            maxWidth: '632px',
            data: {message: response.responseDescription + ' 😅'}
          });
          this.Close(false);
        }
      });
    } else  {
      this.paisService.editarPais(PaisesModelEnv).subscribe((res: Response) => {
        const response: CreatePaisResponse = res as any;
        this.cargServ.detenCargando();
        if (response.responseCode === 1) {
          this.dataAdEd = response.pais;
          this.Close(true);
        } else {
          this.dialog.open(DialogMessagesComponent, {
            minWidth: '320px',
            maxWidth: '632px',
            data: {message: response.responseDescription + ' 😅'}
          });
          this.Close(false);
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

