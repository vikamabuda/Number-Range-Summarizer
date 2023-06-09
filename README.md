# Number-Range-Summarizer
This program implements the NumberRangeSummarizer interface, which produces a comma-delimited list of numbers, grouping the numbers into a range when they are sequential.

# Usage
To use the program, you can create an instance of the NumberRangeSummarizerImpl class, which implements the NumberRangeSummarizer interface.
You can then collect a string input using the collect method and summarize it using the summarizeCollection method.

# Implementation
The implementation uses object-oriented design by encapsulating the logic for collecting and summarizing the input in a separate class NumberRangeSummarizerImpl. It also follows best practices by using the @Override annotation to indicate that the methods are implementing the interface methods, and by using meaningful variable names and comments to make the code more readable.

The collect method first splits the input string into tokens using the comma as a separator. It then tries to parse each token as an integer and adds it to a list of numbers. Non-integer tokens are ignored. The method returns the list of numbers as a collection.

The summarizeCollection method first sorts the input collection of numbers. It then iterates over the sorted list and detects consecutive sequences of numbers by comparing each number with its predecessor. When a sequence is detected, the method adds it to a list of ranges. Finally, the method joins the ranges into a comma-delimited string and returns it.

# Testing
The implementation includes a JUnit test class NumberRangeSummarizerImplTest that tests the collect and summarizeCollection methods with various inputs. The tests cover the expected behavior when the input is empty, contains non-integer tokens, or contains consecutive sequences of numbers.
