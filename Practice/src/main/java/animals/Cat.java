package animals;

import java.time.LocalDate;
import java.time.Year;

import static java.time.temporal.ChronoUnit.YEARS;

public class Cat {

    private String name;

    private String colour;

    private LocalDate birthDate;

    public Cat(String name, String colour, String birthDate) {
        this.name = name;
        this.colour = colour;
        this.birthDate = LocalDate.parse(birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return (int) YEARS.between(birthDate, LocalDate.now());
    }

//    public void setAge(int age) {
//        this.birthYear = Year.now().getValue() - age;
//    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
