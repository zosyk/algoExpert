import java.util.Arrays;
import java.util.LinkedList;

public class LargestRange {

    public static int[] largestRange(int[] array) {
        Arrays.sort(array);

        LinkedList<LinkedList<Integer>> ranges = new LinkedList<>();

        ranges.add(new LinkedList<>(Arrays.asList(array[0])));
        for (int i = 1; i < array.length; i++) {
            LinkedList<Integer> last = ranges.getLast();

            if(last.getLast() == array[i])
                continue;

            if (array[i] == last.getLast() + 1) {
                last.add(array[i]);
            } else
                ranges.add(new LinkedList<>(Arrays.asList(array[i])));
        }

        LinkedList<Integer> maxRange = ranges.getFirst();
        for(LinkedList l: ranges) {
            if(l.size() > maxRange.size()) {
                maxRange = l;
            }
        }

        return new int[]{maxRange.getFirst(), maxRange.getLast()};

    }
}
