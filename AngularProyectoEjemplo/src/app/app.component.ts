import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 title : string = '*** Proyecto de Ejemplo en Angular ***';

 objeto : {
   nombre: string,
   edad: number
 }

 constructor(){
   this.objeto = {
    nombre: '',
    edad : 0
  }
 }

 public alerta(){
   alert("Nombre: " + this.objeto.nombre+' Edad: '+this.objeto.edad)
 }
}
