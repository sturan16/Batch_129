package day30exceptionsinterface;

public class CustomExceptions01 {
    public static void main(String[] args) {
        getStudentGrade(87);
        getTheNumberOfStudents(-45);


    }
    public static void getStudentGrade(int grade){
        if(grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Student's graddes cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                System.err.println(e.getMessage());//System.err.println(e.getMessage());//err. hata mesajlarini kirmizi gostermek icin kullanilir.
            }
        }else {
            System.out.println(grade);
        }
    }
    public static void getTheNumberOfStudents(int numOfStudents){
        if(numOfStudents<0){
            try{
                throw new InvalidNumberException("Student number cannot be negatve");
            }catch (InvalidNumberException e){
                System.err.println(e.getMessage());
            }
        }else {
            System.out.println(numOfStudents);
        }
    }
}
