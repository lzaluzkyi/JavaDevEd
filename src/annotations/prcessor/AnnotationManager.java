package annotations.prcessor;

import java.util.ArrayList;
import java.util.List;

public class AnnotationManager {

    private List<AnnotationProcessor> annotationProcessors = new ArrayList<>();

    public AnnotationManager() {
        annotationProcessors.add(new MyAnnotationProcess());
        annotationProcessors.add(new SaveAnnotationProcessor());
    }

    public void process(Object o){
        annotationProcessors.stream().forEach(annotationProcessor -> annotationProcessor.process(o));
    }

}
