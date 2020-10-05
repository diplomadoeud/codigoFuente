import { Component} from '@angular/core';
import * as $ from 'jquery';


@Component({
    selector: 'app-princroot',
    templateUrl: './appprinc.component.html'
})
export class AppprincComponent  {

    constructor() {
    }

    sidebarActive: boolean;

    onMenuButtonClick(event: Event): void {
        this.sidebarActive = !this.sidebarActive;
        event.preventDefault();
    }


    onMaskClick(event: Event): void {
        this.sidebarActive = !this.sidebarActive;
        if (this.sidebarActive) {
            $('#princ').addClass('layout-overlay-active');
            $('#divmask').addClass('disblock');
        } else {
            $('#princ').removeClass('layout-overlay-active');
            $('#divmask').removeClass('disblock');
        }
        event.preventDefault();
    }

}
