package interface1;

public class КнопочнийПульт extends Пульт implements ЗмінювачКаналів{


    @Override
    public void переключитиКаналНа(String назваКаналу) {
        System.out.println("Ми переключили канал кнопочним пультом на " + назваКаналу);
    }
}
