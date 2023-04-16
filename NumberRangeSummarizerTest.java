package numberrangesummarizer;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class NumberRangeSummarizerTest {

    private NumberRangeSummarizer summarizer = new NumberRangeSummarizerImpl();

    @Test
    public void testCollect() {
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        Collection<Integer> expected = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        Collection<Integer> actual = summarizer.collect(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSummarizeCollection() {
        Collection<Integer> input = Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);
        String expected = "1, 3, 6-8, 12-15, 21-24, 31";
        String actual = summarizer.summarizeCollection(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSummarizeCollection_EmptyInput() {
        Collection<Integer> input = Arrays.asList();
        String expected = "";
        String actual = summarizer.summarizeCollection(input);
        assertEquals(expected, actual);
    }}



