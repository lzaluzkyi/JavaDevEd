package solid;

public class Car {

    private Engine engine;

    private String name;

    public Car(String name) {
        this.name = name;
        Engine engine = EngineBuilder.getEngine(this.name);
        this.engine = engine;
    }

    public void drive(){
        System.out.println(engine.getTest());
    }

    public void stop(){
        System.out.println(engine.getTest());
    }

}
