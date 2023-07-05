package generic;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Cell<Pen> penCell = new Cell<>();
        penCell.addObject(new Pen("Parker", 1));
        Cell<Pen> penCell1 = new Cell<>();
        penCell1.addObject(new Pen("Parker1", 2));
        Cell<Pen> penCell2 = new Cell<>();
        penCell2.addObject(new Pen("Parker2", 3));
        Cell<Pen> penCell3 = new Cell<>();
        penCell3.addObject(new Pen("Parker3", 4));
        Cell<Pen> penCell4 = new Cell<>();
        penCell4.addObject(new Pen("Parker4", 5));
        Cell<Pen> penCell5 = new Cell<>();
        penCell5.addObject(new Pen("Parker5", 6));
        Cell<Pen> penCell6 = new Cell<>();
        penCell6.addObject(new Pen("Parker6", 7));

        Cell<Money> moneyCell = new Cell<>();
        moneyCell.addObject(new Money("USD", 1000));

        penCell.printInside();
        moneyCell.printInside();
        penCell.printCount();
        moneyCell.printCount();

        bank.addCell(penCell);
        bank.addCell(penCell3);
        bank.addCell(penCell1);
        bank.addCell(moneyCell);
        bank.addCell(penCell5);
        bank.addCell(penCell2);
        bank.addCell(penCell4);
        System.out.println(bank.toString());
        Cell<? extends Comparable> bigger = bank.getBigger(5, 0);
        System.out.println(bigger.toString());


    }

}
