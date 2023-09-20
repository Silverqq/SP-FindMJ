import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int findMajor(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int majorityElement = -1;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) > arr.length / 2) {
                majorityElement = num;
                break;
            }
        }

        return majorityElement;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 4, 2, 1, 2, 2};
        int majorityElement = findMajor(arr);
        System.out.println("Мажоритарный элемент: " + majorityElement);
    }
}