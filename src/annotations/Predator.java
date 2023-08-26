package annotations;

import annotations.annotation.MyAnnotation;
import annotations.annotation.Save;

@Save(value = true , fileName = "predator")
public class Predator {

    @MyAnnotation("DEBUG")
    private String test;

    public Predator(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
