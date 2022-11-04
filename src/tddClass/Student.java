package tddClass;

public class Student {
    private String name;
    private double average;

    public Student(String myName, double myAvg){
        this.name = myName;


        if(myAvg > 0 && myAvg <= 100){
         this.average = myAvg;
     }
    }

    public Student() {

    }

    public void setName(String myFirstName){
        this.name = myFirstName;
    }

    public String getName(){
        return name;
    }

    public void setAverage(double studentAverage){
        if(average > 0 && average <= 100){
            this.average = average;
        }
    }
    public double getAverage(){
        return average;
    }
    public String getLetterGrade(){
        String letterGrade = "";
        if( average >= 90){
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }
}
