import { Component, OnInit } from '@angular/core';
import { HttpClientService,Student } from '../service/http-client.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  students: Student[];
  constructor(private httpClientService: HttpClientService) { }

  ngOnInit(): void {
    this.httpClientService.getStudents().subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }

  handleSuccessfulResponse(response) {
      this.students = response;
  }

}
