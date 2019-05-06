import { Component, OnInit } from '@angular/core';
import { Pais } from '../pais';
import { PaisService } from '../pais.service';

@Component({
  selector: 'app-pais-list',
  templateUrl: './pais-list.component.html',
  styleUrls: ['./pais-list.component.css']
})
export class PaisListComponent implements OnInit {

  // Declarações de variáveis
  paises: Pais[];

  constructor(private paisService: PaisService) { }

  ngOnInit() {

    // Busca paises cadastrados no banco de dados
    this.paisService.findAll().subscribe(paises => this.paises = paises);
  }

}
