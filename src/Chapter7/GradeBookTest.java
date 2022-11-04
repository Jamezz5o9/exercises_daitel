package Chapter7;

public class GradeBookTest {
    public static void main(String[] args) {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook myGradeBook = new GradeBook("CSC 101: Introduction to Java programming", gradesArray);
        System.out.printf("Welcome to the grade book %n", myGradeBook.getCourseName());
        myGradeBook.processGrade();
    }
}
