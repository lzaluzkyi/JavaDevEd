package interface1;

public interface ЗмінювачКаналів {

    String a = "a";

   default void переключитиКаналНа(String назваКаналу){
       System.out.println("Дефолт");
   }

}

