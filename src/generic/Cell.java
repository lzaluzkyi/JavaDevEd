package generic;


public class Cell<T extends Savable>  {

    private T object;

    public Cell() {
    }

    public void addObject(T object){
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void printInside(){
        System.out.println(this.object.toString());
    }

    public void printCount(){
        System.out.println(object.getCount());
    }

    @Override
    public String toString() {
        return "Cell{" +
                "object=" + object +
                '}';
    }
}
