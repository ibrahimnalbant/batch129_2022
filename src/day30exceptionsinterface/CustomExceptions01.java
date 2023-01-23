package day30exceptionsinterface;

public class CustomExceptions01 {
    public static void main(String[] args) {

        getStudentGrade(87);
        getTheNumberOfStudents(-45);

    }//main

    public static void getStudentGrade(int grade){

        if(grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Student's grades cannot.....");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println(grade);
        }

    }//method
    public static void getTheNumberOfStudents(int numOfStudents){
        if(numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number cannot be negative");//obje olusturuyoruz
            } catch (InvalidNumberException e) {
                System.err.println(e.getMessage());//out'u err yapinca kirmizi yapar
            }
        }else {
            System.out.println(numOfStudents);
        }//else

    }//method2

}//class
