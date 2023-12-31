abstract class Human {
    private String name;
    private String surname;
    private Integer age;
    private String gender;

    public Human(String name, String surname, Integer age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    void eating() {
        System.out.println("Human is eating");
    }
    void sleeping() {
        System.out.println("Human is sleeping");
    }
}
