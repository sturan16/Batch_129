package day24accessmodifiersinheritance.Animal;

import day23datetimestringbuilder.Snike;

public class AnimalsRunner {
    public static void main(String[] args) {
        Cat myCat=new Cat();
        myCat.meow();
        myCat.drink();
        myCat.eat();

        Snike yourSnike=new Snike();
        yourSnike.tiss();
        yourSnike.eat();
    }
}
