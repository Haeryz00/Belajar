package modul1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class demoCalcYearsOld 
{
  private int yourBirthYear;

  public int getYourBirthYear() {
    return yourBirthYear;
  }

  public void setYourBirthYear(int yourBirthYear) {
    this.yourBirthYear = yourBirthYear;
  }
}

public class codelab2 
{
  public static void main(String[] args) {
    demoCalcYearsOld obj = new demoCalcYearsOld();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan tahun kelahiran: ");
    obj.setYourBirthYear(scanner.nextInt());

    LocalDate currentDate = LocalDate.now();
    LocalDate birthdate = LocalDate.of(obj.getYourBirthYear(), 1, 1);
    Period period = Period.between(birthdate, currentDate);

    System.out.println("Umur anda: " + period.getYears());
  }
}