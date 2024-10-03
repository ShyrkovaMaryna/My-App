package HomeWork12;

public class Profession {
    private String position;
    private String grade;
    public  Profession (String position, String grade){
        this.position=position;
        this.grade=grade;
    }
    public String getPosition(){
        return position;
    }

    public String getGrade() {
        return grade;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
