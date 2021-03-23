import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

export class Student {
  constructor(
    public  firstName: string,
    public  lastName: string,
    public  department: string
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor( private httpClient: HttpClient) { }

  getStudents(){
    console.log('Test Call');
    return this.httpClient.get<Student[]>('http://localhost:8080/students/getStudent');
}
}
