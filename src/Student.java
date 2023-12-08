public class Student extends Human implements Studying{
    public Student(String name, String surname, Integer age, String gender) {
        super(name, surname, age, gender);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(Integer age) {
        super.setAge(age);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    void eating() {
        System.out.println(getName()+" is eating");
    }

    @Override
    void sleeping() {
        System.out.println(getName()+" is sleeping");
    }

    @Override
    public void studying() {
        System.out.println(getName()+" is studing");
    }

    @Override
    public void takingExam() {
        System.out.println(getName()+" is taking exam");
    }
}
