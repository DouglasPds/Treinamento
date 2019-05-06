import { Component, OnInit } from '@angular/core';
import { Pais } from '../pais';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { PaisService } from '../pais.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-pais-form',
  templateUrl: './pais-form.component.html',
  styleUrls: ['./pais-form.component.css']
})
export class PaisFormComponent implements OnInit {

  // Declaração de variáveis
  pais: Pais;

  paisForm: FormGroup;

  titulo: String

  constructor(private paisService: PaisService, private builder: FormBuilder, 
    private router: Router, private route: ActivatedRoute) { }

  ngOnInit() {

    // Instanciar novo pais
    this.pais = new Pais();

    // Obter o ID pela url
    this.pais.id = this.route.snapshot.params['id'];

    // Define o título
    this.titulo = (this.pais.id) ? 'Editar':'Cadastrar';

    // Reactive form
    this.paisForm = this.builder.group({
      id: [],
      nome: ['', Validators.required]
    },{})

    // Busca os dados do pais caso seja o formulário de editar
    if(this.pais.id){
      this.paisService.findById(this.pais.id)
      .subscribe(pais => this.paisForm.patchValue(pais));
    }

  }

  // Método para salvar os dados do formulário
  onSave(pais: Pais) {
    this.paisService.save(pais).subscribe(pais => {
      console.log("País salvo com sucesso!");

      //Redireciona para lista de países
      this.router.navigate(['/pais']);
    });
  }
}
