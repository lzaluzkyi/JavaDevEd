package solid;

public class EngineBuilder {

    public static Engine getEngine(String name){
        if (name.equals("Ferrari")){
            return new Engine("Passed");
        } else if (name.equals("VW")){
            return new Engine("Passed"); }
        else if (name.equals("renault")){
            return new Engine("so so Passed");
        } else {
            return new Engine("not Passed");
        }
    }

}
