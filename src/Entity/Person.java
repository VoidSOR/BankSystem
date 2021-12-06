package Entity;

// Личность человека

public class Person {

    private String name;

    private int phone;

    private String surname;

    public Person(String name, int phone, String surname) {
        this.name = name;
        this.phone = phone;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
