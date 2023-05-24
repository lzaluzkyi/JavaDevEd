package exception;

import java.io.IOException;

public class Human {

    private Long id = 1L;

    private String name;

    public Human() {
    }

    public void printInfo() {
        if (this.name != null) {
            System.out.println(name + " 12");
        } else {
            throw new HumanNameNotFoundException("Name in human is null where id = " + id);
        }
    }

    public void close() {
        System.out.println("Closed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
