export class PaisesModel {
  idPai: number;
  nombre: string;
  abreviatura: number;
  constructor(json: any = null) {
    if (json !== null) {
      this.idPai = json.idPai;
      this.nombre = json.nombre;
      this.abreviatura = json.abreviatura;
    } else {
      this.idPai = null;
      this.nombre = null;
      this.abreviatura = null;
    }
  }
}
