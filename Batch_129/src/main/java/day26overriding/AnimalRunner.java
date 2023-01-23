package day26overriding;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat myCat=new Cat();
        myCat.eat();//Animals eat.... der boyle dersek //Cats eat... cat clasinda override yaptik
        myCat.dirnk();//Cats drink...
    }
}
