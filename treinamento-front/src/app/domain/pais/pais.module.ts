import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PaisRoutingModule } from './pais-routing.module';
import { PaisListComponent } from './pais-list/pais-list.component';
import { PaisService } from './pais.service';
import { PaisFormComponent } from './pais-form/pais-form.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [PaisListComponent, PaisFormComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    PaisRoutingModule
  ],
  providers: [PaisService]
})
export class PaisModule { }
