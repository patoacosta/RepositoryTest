import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hola',
  templateUrl: './hola.component.html',
  styleUrls: ['./hola.component.css']
})
export class HolaComponent implements OnInit {

  public nombre: string;

  constructor() {
    this.nombre = 'pato';
  }

  ngOnInit(): void {
    // alert(this.nombre)
  }

}
