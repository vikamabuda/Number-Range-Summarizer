package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    /**
     * Collects a string of comma-separated numbers and returns a collection of integers.
     *
     * @param input the string input
     * @return a collection of integers
     */
    @Override
    public Collection<Integer> collect(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] tokens = input.split(",");
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token.trim()));
        }
        return numbers;
    }

    /**
     * Summarizes a collection of integers by grouping sequential numbers into ranges.
     *
     * @param input the collection of integers
     * @return the summarized string
     */
    @Override
    public String summarizeCollection(Collection<Integer> input) {
        List<Integer> sortedNumbers = new ArrayList<>(input);
        Collections.sort(sortedNumbers);

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < sortedNumbers.size()) {
            int start = sortedNumbers.get(i);
            int end = start;
            while (i < sortedNumbers.size() - 1 && sortedNumbers.get(i + 1) == end + 1) {
                end = sortedNumbers.get(i + 1);
                i++;
            }
            if (start == end) {
                result.append(start);
            } else {
                result.append(start).append("-").append(end);
            }
            if (i < sortedNumbers.size() - 1) {
                result.append(", ");
            }
            i++;
        }

        return result.toString();
    }
}
