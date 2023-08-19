package lambda;

@FunctionalInterface
public interface MyInterface<F ,S> {

    void add(F firstElement , S secondElement);

}
