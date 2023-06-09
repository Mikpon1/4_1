/*
Kod bazowy programu Commit4_0: /
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    int exception; 
    System.out.println("1-Dodaj studenta" + "\n" +  "2-Wyświetl liste");
    exception = sc.nextInt();
    
    switch(exception) {
          case 1:

            System.out.println("Podaj Imię: ");
            String imie = sc.next();
            System.out.println("Podaj nazwisko: ");
            String nazwisko = sc.next();
            System.out.println("Podaj wiek: ");
            int wiek = sc.nextInt();
            System.out.println("Podaj datę urodzenia: ");
            String dataUrodzenia = sc.next();
           
    try {
        
      Service s = new Service();
      s.addStudent(new Student(imie, nazwisko, wiek, dataUrodzenia));
      //s.addStudent(new Student("Janusz", 40));

      //var students = s.getStudents();
      //for(Student current : students) {
        //System.out.println(current.ToString());
      //}
    } catch (IOException e) {
  }
        break;
      case 2:
        try{
          Service s = new Service();
          var students = s.getStudents();
          for (Student current : students){
            System.out.println(current.ToString());
          }
          
          }catch (IOException e){
          
          }
}
}
} 
  


