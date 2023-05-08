package dog;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Human mark = new Human("Mark" , 15);
        Human jo = new Human("Jo" , 20);
        mark.setJuice(new Juice("Appele" , "Room"));

        if (mark.isJuiceExist()){
            System.out.println(mark.name + " have " + mark.getJuice().getFruit() + " juice");
            Juice juice = mark.findMyJuice("Room");
            if (juice != null){
                jo.setJuice(juice);
                mark.changeJuiceOwner(jo);
                jo.drinkJuice(101);

            }else {
                System.out.println("Juice wrong position");
            }
        } else {
            System.out.println(mark.name + " didnt have juice");
        }

    }


}
