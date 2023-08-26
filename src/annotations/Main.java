package annotations;


import annotations.prcessor.AnnotationManager;

public class Main {

    public static void main(String[] args) {

        AnnotationManager annotationManager = new AnnotationManager();
        Human human = new Human("Name");
        Predator predator = new Predator("test");
        annotationManager.process(human);
        annotationManager.process(predator);



    }

}
