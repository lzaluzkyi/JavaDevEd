package annotations;

import annotations.annotation.MyAnnotation;
import annotations.annotation.Save;

@Save(value = true , fileName = "Hunan")
public class Human {

    @MyAnnotation( value = "INFO")
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @MyAnnotation(value = "DEBUG")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
