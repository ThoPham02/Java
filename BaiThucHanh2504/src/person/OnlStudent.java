package person;

public class OnlStudent extends Student {
    private String nameOfSubject;

    public OnlStudent(String name, int age, String nameOfSchool, String nameOfSubject) {
        this.name = name;
        this.age = age;
        this.nameOfSchool = nameOfSchool;
        this.nameOfSubject = nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ten mon hoc: " + nameOfSubject);
    }
}
