package interface1;

public class TEst implements ЗмінювачКаналів {


    @Override
    public void переключитиКаналНа(String назваКаналу) {
        System.out.println("я канали не переключаю");
        throw new RuntimeException();
    }
}
