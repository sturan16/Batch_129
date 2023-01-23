package day30exceptionsinterface;
/*
   1)KEndi application'iniza ozel kurallar olusturmak icin kendi exception classlarinizi olusturabilirsiniz.
   2)Olusturdugunuz exception classlar bir i)compile time exception ii) Run time Exception olabilir
   3)"Compile time exception" olsuturmak icin classinizin parenti Exception Class olmaldir.
   4)"Run Time Exception" olusturmak icin classiniz parenti Run time exception Class olmalidir.
   5)Kendi olusturdugumuz exception classlara "Custom Exception Class" denir.

 */

public class InvalidStudentGradeException extends Exception {
    //Kendi urettigimz Exception classı  Exceptionun cocugu yapmamiz gerekir.

    public InvalidStudentGradeException(String mesaj){
        super(mesaj);

    }
}
