package map.use;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PetCreator value = new PetCreator();
        HumanCreator value1 = new HumanCreator();
        Exit value2 = new Exit();





        Map<Integer , Helper> integerHelperMap = new HashMap<>();
        integerHelperMap.put(value.getMyCode() , value);
        integerHelperMap.put(value1.getMyCode() , value1);
        integerHelperMap.put(value2.getMyCode() , value2);

        while (true){
            System.out.println("Enter what u want");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            Helper helper = integerHelperMap.get(input);
            helper.makeWork();
        }


    }




}
