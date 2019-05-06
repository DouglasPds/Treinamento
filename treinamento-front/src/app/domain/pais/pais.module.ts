import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PaisRoutingModule } from './pais-routing.module';
import { PaisListComponent } from './pais-list/pais-list.component';

@NgModule({
  declarations: [PaisListComponent],
  imports: [
    CommonModule,
    PaisRoutingModule
  ]
})
export class PaisModule { }
