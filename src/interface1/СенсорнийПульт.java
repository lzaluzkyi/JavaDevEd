package interface1;

public class СенсорнийПульт extends Пульт implements ЗмінювачКаналів {


    @Override
    public void переключитиКаналНа(String назваКаналу) {
        System.out.println("Ми переключили канал сенсорним пультом на " + назваКаналу);
    }
}
