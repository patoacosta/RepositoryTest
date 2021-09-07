  import {Component, OnInit} from '@angular/core';
  import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


@Component({
  selector : "ComponentEjemplo",
  templateUrl : './ComponenteEjemplo.component.html'
})

export class MiComponente implements OnInit{

  // creacion de variables
  public titulo: string;
  public label: any;
  public texto: string;
  bodyText: string = '';

  ngOnInit() {
    console.log("elementos cargados al inicio en \"ngOnInit\"")
  }

  objeto : {
    nombre : string,
    edad : number
  }

  constructor(private modalService: NgbModal) {
    this.titulo = "\nEste es un componente de Ejemplo en Angular";
    this.label = "Asignando este inputText a un objeto en su propiedad (nombre)";
    this.texto = ''

    this.objeto = {
      nombre: '',
      edad : 0
    }
  }

  public alerta(){
    this.objeto.nombre = this.texto
    alert(this.objeto.nombre)
  }

  public alertaModal(){
    alert("Nombre: " + this.objeto.nombre + "\nEdad: " + this.objeto.edad)
    this.modalService.dismissAll()
  }

  public modal(content : any){
    this.modalService.open(content)
  }
  public closeModal(){
    this.modalService.dismissAll()
  }


}
