import java.util.List;

public class RandomListFacade {
    RandomList randomList;
    ListFilter listFilter;
    ListPrinter listPrinter;

    public RandomListFacade() {
        randomList = new RandomList();
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
    }

    public void printRandomEvenList() {
        List<Integer> randomNumberList = randomList.generateList(50, 1, 100);
        List<Integer> evenNumberList = listFilter.filterOdd(randomNumberList);
        listPrinter.printList(evenNumberList);
    }
}
