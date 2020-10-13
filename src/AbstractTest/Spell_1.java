package AbstractTest;

import java.util.Scanner;

public class Spell_1 extends Basic{



    public Spell_1(){
        Scanner input=new Scanner(System.in);
        System.out.println("輸入\"Spell\"");
        String s=input.next();
       setSpllName(s);
    }


    @Override
    void spell() {

        System.out.println(getSpellName()+" spell!");

    }
}
