package interface1;

public class НаймолодшаЛюдинаВКімнаті implements ЗмінювачКаналів {


    @Override
    public void переключитиКаналНа(String назваКаналу) {
        if (назваКаналу.equals("ХХХ")){
            return;
        }
        System.out.println("Хтось біжить переключати на " + назваКаналу);
    }

}
