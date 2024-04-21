import java.time.LocalDate;


public class Employee {
    public String fname;
    public String lname;
    public String city;
    public String email;
    public String pesel;

    public int dateofbirth;
    public double salary;

    LocalDate currentDate = LocalDate.now();
    int currentYear = currentDate.getYear();


    public Employee(String fname, String lname, String city, String email, String pesel, int dateofbirth) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.email = email;
        this.pesel = pesel;
        this.dateofbirth = dateofbirth;

    }


    public int calculateSalary() {
        int mainSalary =3000 ;
        int annualBonus = (1000* (currentYear - dateofbirth));
      int salary = mainSalary + annualBonus;
        return salary;
    }
}
