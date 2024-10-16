package main.task;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FirstUnique {

    public static Integer findByMethod1(List<Integer> sourseList) {

        if (sourseList == null || sourseList.isEmpty()) {
            return null;
        }
        if (sourseList.size() == 1) {
            return sourseList.get(0);
        }

        List<Integer> doublesList = new ArrayList<>();

        for (int i = 0; i <= sourseList.size() - 1; i++) {
            for (int j = i + 1; j <= sourseList.size() - 1; j++) {
                if ((sourseList.get(i).equals(sourseList.get(j)))
                        && (!doublesList.contains(sourseList.get(i)))) {
                    doublesList.add(sourseList.get(i));
                }
            }
        }

        List<Integer> resultList = new ArrayList<>(sourseList);
        resultList.removeAll(doublesList);

        return resultList.isEmpty() ? null : resultList.get(0);
    }

    public static Integer findByMethod2(List<Integer> sourseList) {

        if (sourseList == null || sourseList.isEmpty()) {
            return null;
        }
        if (sourseList.size() == 1) {
            return sourseList.get(0);
        }

        List<Integer> doublesList = new ArrayList<>();
        ListIterator<Integer> iteratorSourceList1 = sourseList.listIterator();
        ListIterator<Integer> iteratorSourceList2;
        Integer elementSourceNext1;
        Integer elementSourceNext2;
        int elementSourceNext2Index;

        while (iteratorSourceList1.hasNext()) {
            elementSourceNext1 = iteratorSourceList1.next();
            elementSourceNext2Index = iteratorSourceList1.nextIndex();
            iteratorSourceList2 = sourseList.listIterator(elementSourceNext2Index);
            while (iteratorSourceList2.hasNext()) {
                elementSourceNext2 = iteratorSourceList2.next();
                if ((elementSourceNext1.equals(elementSourceNext2))
                        && (!doublesList.contains(elementSourceNext1))) {
                    doublesList.add(elementSourceNext1);
                }
            }
        }
        List<Integer> resultList = new ArrayList<>(sourseList);
        resultList.removeAll(doublesList);

        return resultList.isEmpty() ? null : resultList.get(0);
    }

}
