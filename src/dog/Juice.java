package dog;

public class Juice {

    private String fruit;

    private String position;

    private int capacity;

    private int maxCapacity;

    public Juice(String fruit, String position) {
        this.fruit = fruit;
        this.position = position;
        this.maxCapacity = 1000;
        this.capacity = this.maxCapacity;
    }

    public String getFruit(){
        return this.fruit;
    }

    public String getPosition(){
        return this.position;
    }

    public void drink(int sipCount , int sipCapacity){
        int allSipCapacity = sipCount * sipCapacity;

        if (this.capacity > allSipCapacity){
            this.capacity = this.capacity - allSipCapacity;
            System.out.println("In this juice " + capacity);
        }else {
            System.out.println("U want drink more than juice exist");
            System.out.println("U drink " + (capacity) + " and u need more juice " + (allSipCapacity - this.capacity));
            this.capacity = 0;
        }
    }

}
