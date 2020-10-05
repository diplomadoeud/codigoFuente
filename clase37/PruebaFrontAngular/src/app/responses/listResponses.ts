import {PaisesModel} from '../models/paises.model';

export interface CreatePaisResponse {
    responseCode: Number;
    pais: Array<PaisesModel>;
    responseDescription: string;
}
