package interface1;

public class РозумовийСпосіб implements ЗмінювачКаналів {

    @Override
    public void переключитиКаналНа(String назваКаналу) {
        System.out.println("Я подумав і канал змінився на " + назваКаналу);
    }
}
