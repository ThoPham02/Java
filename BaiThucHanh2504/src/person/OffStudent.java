package person;

public class OffStudent extends Student {
    private float score;

    public OffStudent(String name, int age, String nameOfSchool, float score){
        this.name = name;
        this.age = age;
        this.nameOfSchool = nameOfSchool;
        this.score = score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Diem so: " + score);
    }
}
