import {Injectable} from '@angular/core';
import {
  HttpInterceptor,
  HttpRequest,
  HttpResponse,
  HttpHandler,
  HttpEvent,
  HttpErrorResponse
} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {map, catchError} from 'rxjs/operators';
import {AppCargandoService} from '../appBase/cargando/app.cargando.service';

@Injectable()
export class HttpConfigInterceptor implements HttpInterceptor {
  constructor(private cargandoService: AppCargandoService) {
  }

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    const token = 'eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNjAxOTMzOTc1LCJleHAiOjE2MDIwNTM5NzV9.NgNILew5duOUUbNiUhjVkjAxvToGaN66XmWvamfIR6Ew-fsRO_nC38Zkp0WG9emsAssjjYpH-np-t2Kw4Pk4Tg';

    request = request.clone({
      setHeaders: {
        Authorization: 'Bearer ' + token
      }
    });
    return next.handle(request).pipe(
      map((event: HttpEvent<any>) => {
        if (event instanceof HttpResponse) {
        }
        return event;
      }),
      catchError((error: HttpErrorResponse) => {
        if ((error.status === 401) || (error.status === 403)) {

        } else {
        }
        this.cargandoService.detenCargando();
        return throwError(error);
      }));
  }
}
