import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-facility-edit',
  templateUrl: './facility-edit.component.html',
  styleUrls: ['./facility-edit.component.css']
})
export class FacilityEditComponent implements OnInit {
  selectedFacility: string = '';

  changeFacility(facility: string) {
    this.selectedFacility = facility;
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
