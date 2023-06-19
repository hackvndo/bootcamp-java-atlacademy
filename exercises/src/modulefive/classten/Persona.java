package modulefive.classten;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {

    private int id;
    private String name;
    private int age;
    private LocalDate birthDate;
    private int DNI;

    public Persona(int id, String name, int age, String birthDate, int DNI) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthDate = parseDate(birthDate);
        this.DNI = DNI;
    }

    private LocalDate parseDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getDNI() {
        return DNI;
    }


    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", DNI=" + DNI +
                '}';
    }

    public boolean isMajor() {
        LocalDate currentDate = LocalDate.now();
        LocalDate adultDate = birthDate.plusYears(18);
        return currentDate.isAfter(adultDate);
    }
}
