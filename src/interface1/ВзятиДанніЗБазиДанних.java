package interface1;

import java.util.Random;

public class ВзятиДанніЗБазиДанних {


    public static ЗмінювачКаналів дайЗмінювачі(){
        ЗмінювачКаналів[] змінювачКаналівs = new ЗмінювачКаналів[5];

        змінювачКаналівs[0] = new СенсорнийПульт();
        змінювачКаналівs[1] = new КнопочнийПульт();
        змінювачКаналівs[2] = new НаймолодшаЛюдинаВКімнаті();
        змінювачКаналівs[3] = new РозумовийСпосіб();
        змінювачКаналівs[4] = new TEst();
        Random random = new Random();
        return змінювачКаналівs[random.nextInt(5)];
    }

}
