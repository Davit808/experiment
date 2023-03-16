package OOP.Expands;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;
    private long phoneNumber;

    Person(String name, String surname, int age, String address, long phoneNumber) {
        this.name = name;
        this.surname = surname;
        setAge(age);
        this.address = address;
        setPhoneNumber(phoneNumber);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
