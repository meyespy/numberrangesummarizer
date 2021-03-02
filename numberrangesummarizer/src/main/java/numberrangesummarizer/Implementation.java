package numberrangesummarizer;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

//implementation of provided interface
public class Implementation implements NumberRangeSummarizer {

    @Override // collect the input
    public Collection<Integer> collect(String input) {
        return Stream.of(input.split(",")) // split string by comma delimiter
                .filter(item -> item != null)
                .filter(item -> item.matches("[0-9]+")) // handels removal of characters not integer
                .map(Integer::valueOf) // convert string to integer
                .collect(Collectors.toList());
    }

    private List<Integer> uniqueList(Collection<Integer> input) {
        return input.stream().sorted() // sort list
                .distinct() // remove duplicated
                .collect(Collectors.toList());
    }

    @Override // get the summarized string
    public String summarizeCollection(Collection<Integer> input) {

        List<Integer> uniqueList = uniqueList(input); // obtain cleansed integer list
        List<String> emptyList = new ArrayList<String>(); // initialise empty string list
        int count = 1;

        /*
         * loop through collection, check for sequential items 'count' is used as a
         * counter when no sequences are found then count = 1 and integer is retruned as
         * string for that item when a squence is found then count > 1 and the sequence
         * is summarized with ":"
         */
        for (int item = 1; item <= uniqueList.size(); item++) {
            if ((item == uniqueList.size()) || (uniqueList.get(item) - uniqueList.get(item - 1) != 1)) {
                if (count == 1) {
                    emptyList.add(Integer.toString(uniqueList.get(item - count)));
                } else {
                    emptyList.add(uniqueList.get(item - count) + ":" + uniqueList.get(item - 1));
                }
                count = 1;
            } else {
                count++;
            }
        }

        // return the string with quotation character on both ends
        return emptyList.stream().collect(Collectors.joining(", "));

    }

}
