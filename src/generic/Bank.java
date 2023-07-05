package generic;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Cell<? extends Comparable>> cells = new ArrayList<>();

    public Bank() {
    }

    public void addCell(Cell<? extends Comparable> cell){
        if (cells.isEmpty()){
            this.cells.add(cell);
            return;
        }
        for (int i = 0; i < cells.size(); i++) {
            if (cells.get(i).getObject().compareTo(cell.getObject()) >= 0){
                cells.add(i , cell);
                return;
            } else if (i < 1 && (cells.get(i).getObject().compareTo(cell.getObject()) >= 0)){
                cells.add(i , cell);
                return;
            }
        }
        cells.add(cell);
    }

    public Cell<? extends Comparable> getBigger(int firstIndex , int secondIndex){
        if (secondIndex > firstIndex){
            return cells.get(secondIndex);
        }
        return cells.get(firstIndex);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "cells=" + cells +
                '}';
    }
}
