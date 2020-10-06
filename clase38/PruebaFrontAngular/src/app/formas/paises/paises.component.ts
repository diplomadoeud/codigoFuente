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
import {DialogMessagesComponent} from './diagmessages.component';
import {DialogConfElimComponent} from './diagconfelim.component';

@Component({
  templateUrl: './paises.component.html',
  styleUrls: ['./paises.component.scss'],
  animations: [subirAnimation]
})

@Injectable()
export class PaisesComponent implements OnInit {

  constructor(private paisesService: PaisesService, private cargServ: AppCargandoService, public dialog: MatDialog) {
  }

  dataPaises: PaisesModel[];
  dataSource: MatTableDataSource<PaisesModel>;
  displayedColumns: string[] = ['editar', 'idPai', 'nombre', 'abreviatura', 'eliminar'];
  @ViewChild(MatPaginator) paginator: MatPaginator;
  indexElEd: number;

  ngOnInit(): void {

    this.cargarTodosPaises();
  }

  createDialog(): void {
    const dialogRef = this.dialog.open(DialogcreatpaisesComponent, {
      minWidth: '320px',
      maxWidth: '632px',
      data: {dataed: null}
    });

    dialogRef.afterClosed().subscribe(result => {
      // Se verifica si es diferente de nil para evitar error que ocurre al oprimir Esc
      if (result) {
        if (result.result) {
          if ((result.result === true) && (result.dataAdEd)) {
            this.dialog.open(DialogMessagesComponent, {
              minWidth: '320px',
              maxWidth: '632px',
              data: {message: 'Pais Creado 😃'}
            });
            this.dataPaises.push(result.dataAdEd);
            this.dataSource = new MatTableDataSource<PaisesModel>(this.dataPaises);
            this.dataSource.paginator = this.paginator;
          }
        }
      }
    });
  }

  eliminar(paisEd: PaisesModel, indexEl: number): void {
    const dialogRef = this.dialog.open(DialogConfElimComponent, {
      minWidth: '320px',
      maxWidth: '632px',
      data: {message: '🤔 ¿Desea Borrar el Pais ' + paisEd.nombre + '?', idPaisElim: paisEd.idPai}
    });
    dialogRef.afterClosed().subscribe(result => {
      // Se verifica si es diferente de nil para evitar error que ocurre al oprimir Esc
      if (result) {
        if (result.result) {
          if ((result.result === true)) {

            this.dialog.open(DialogMessagesComponent, {
              minWidth: '320px',
              maxWidth: '632px',
              data: {message: 'Pais Eliminado 😌'}
            });
            this.dataPaises.splice(indexEl, 1);
            this.dataSource = new MatTableDataSource<PaisesModel>(this.dataPaises);
            this.dataSource.paginator = this.paginator;
          }
        }
      }
    });


  }

  editar(paisEd: PaisesModel, indexEd: number): void {
    this.indexElEd = indexEd;
    const dialogRef = this.dialog.open(DialogcreatpaisesComponent, {
      minWidth: '320px',
      maxWidth: '632px',
      data: {dataed: paisEd}
    });
    dialogRef.afterClosed().subscribe(result => {
      // Se verifica si es diferente de nil para evitar error que ocurre al oprimir Esc
      if (result) {
        if (result.result) {
          if ((result.result === true) && (result.dataAdEd)) {

            this.dialog.open(DialogMessagesComponent, {
              minWidth: '320px',
              maxWidth: '632px',
              data: {message: 'Pais Editado 😃'}
            });
            this.dataPaises[this.indexElEd] = result.dataAdEd;
            this.dataSource = new MatTableDataSource<PaisesModel>(this.dataPaises);
            this.dataSource.paginator = this.paginator;
          }
        }
      }
    });
  }

  cargarTodosPaises(): void {
    this.cargServ.iniciarCargando();

    this.paisesService.listarPaises().subscribe((res: Response) => {
      const data: PaisesModel[] = res as any;
      this.dataPaises = data;
      this.dataSource = new MatTableDataSource<PaisesModel>(this.dataPaises);
      this.dataSource.paginator = this.paginator;
      this.cargServ.detenCargando();
    });

  }


}
