import {Component, Injectable, OnInit, ViewChild} from '@angular/core';
import {AppCargandoService} from '../../appBase/cargando/app.cargando.service';
import {
  subirAnimation
} from '../../animations/listanim.animations';
import {MatTableDataSource} from '@angular/material/table';
import {PaisesService} from '../../services/paises.service';
import {MatPaginator} from '@angular/material/paginator';
import {MatDialog} from '@angular/material/dialog';
import {DialogcreatpaisesComponent} from './diagcreatpaises.component';
import {PaisesModel} from '../../models/paises.model';

@Component({
  templateUrl: './paises.component.html',
  styleUrls: ['./paises.component.scss'],
  animations: [subirAnimation]
})

@Injectable()
export class PaisesComponent implements OnInit {

  constructor(private paisesService: PaisesService, private cargServ: AppCargandoService,  public dialog: MatDialog) {
  }

  dataSource: MatTableDataSource<PaisesModel>;
  displayedColumns: string[] = ['editar', 'idPai', 'nombre', 'abreviatura'];
  @ViewChild(MatPaginator) paginator: MatPaginator;

  ngOnInit(): void {

    this.buscarTodosPaises();
  }

  editar(paisEd: PaisesModel): void {
    const dialogRef = this.dialog.open(DialogcreatpaisesComponent, {
      minWidth: '320px',
      maxWidth: '632px',
      data: { dataed: paisEd}
    });
    dialogRef.afterClosed().subscribe(result => {
      // Se verifica si es diferente de nil para evitar error que ocurre al oprimir Esc
      if (result) {
        if (result.result) {
        }
      }
    });
  }

  buscarTodosPaises(): void {
    this.cargServ.iniciarCargando();

    this.paisesService.listarPaises().subscribe((res: Response) => {
      const data: PaisesModel[] =  res as any;
      this.dataSource = new MatTableDataSource<PaisesModel>(data);
      this.dataSource.paginator = this.paginator;
      this.cargServ.detenCargando();
    });

  }

  createDialog(): void {
    const dialogRef = this.dialog.open(DialogcreatpaisesComponent, {
      minWidth: '320px',
      maxWidth: '632px',
      data: { dataed: null}
    });

    dialogRef.afterClosed().subscribe(result => {
      // Se verifica si es diferente de nil para evitar error que ocurre al oprimir Esc
      if (result) {
        if (result.result) {
          if (result.result === true) {
          }
        }
      }
    });
  }


}
