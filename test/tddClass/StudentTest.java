package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentTest {
    Student student;
    Student student2;

    @BeforeEach
    void setUp(){
         student = new Student("James Jaime", 94);
         student2 = new Student("James Ade", 70);
    }

    @Test
    @DisplayName("Test average score")
    void averageScore(){
        System.out.printf("%s's average score of student a is %s %n", student.getName(), student.getLetterGrade());
        System.out.printf("%s's average score of student a is %s %n", student.getName(), student2.getLetterGrade());
    }
}
