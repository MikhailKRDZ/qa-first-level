package fundamentals.optionaltask;

import java.util.ArrayList;
import java.util.List;

public class TaskRunner {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        TaskPerformance taskPerformance = new TaskPerformance();
        taskPerformance.consoleInput(numbers);
        List<String> numbersSorted = taskPerformance.getArrayNumbersSortedByLength(numbers);
        List<String> shortestAndLongestNumbers = taskPerformance.getShortestAndLongestNumbers(numbersSorted);
        System.out.println("Самое короткое число: " + shortestAndLongestNumbers.get(0) + ", Самое длинное число: " + shortestAndLongestNumbers.get(1));
        System.out.println("Все числа в порядке возрастания значений их длины : " + numbersSorted);
        taskPerformance.showNumbersLessAverage(numbersSorted);
    }
}
