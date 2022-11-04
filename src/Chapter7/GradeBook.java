package Chapter7;

public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int [] grades){
        this.courseName = courseName;
        this.grades = grades;

    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void processGrade(){

        outputGrade();

        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        outputBarchart();
    }

    public int getMinimum(){
        int lowGrade = grades[0];

            for(int grade: grades){
                if(grade < lowGrade){
                    lowGrade = grade;
                }
            }
        return lowGrade;
    }

    public int getMaximum(){
        int maxGrade = grades[0];

        for(int grade: grades){
            if(grade > maxGrade){
                maxGrade = grade;
            }
        }
        return maxGrade;
    }

    public double getAverage(){
        int total = 0;

        for(int grade : grades){
            total += grade;

        }
        return (double) total/ grades.length;
    }

        public void outputBarchart(){
            System.out.println("Grade distribution");

            int[] frequency = new int[11];

            for(int grade: grades){
                ++frequency[grade / 10];

            }

            for(int count = 0; count < frequency.length; count++){
                if(count == 10){
                    System.out.printf("%5d:  ", 100);
                } else {
                    System.out.printf("%02d-%02d:  ", count * 10, count * 10 + 9);
                }
                for(int stars = 0; stars < frequency[count]; stars++){
                    System.out.print("*");
            }
                System.out.println();
            }
        }
        public void outputGrade(){
            int total = 0;
            System.out.printf("The grades are%n%n");

            for(int student = 0; student < grades.length; student++){
                total += grades[student];
                System.out.println();
                System.out.printf("Student %2d : %3d%n", student + 1, grades[student]);
            }

            System.out.printf("Total:  %d%n", total);
        }
}
