import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-facility-create',
  templateUrl: './facility-create.component.html',
  styleUrls: ['./facility-create.component.css']
})
export class FacilityCreateComponent implements OnInit {
  selectedFacility: string = '';

  changeFacility(facility: string) {
    this.selectedFacility = facility;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
