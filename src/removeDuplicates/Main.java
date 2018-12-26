package removeDuplicates;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Integer[] someIntArr = new Integer[]{1,3,3,4,5};
        String[] someStrArr = new String[]{"a","b","b","d","e"};
        RemDuplicatesGernerics remDuplicates = new RemDuplicatesGernerics();

        remDuplicates.printArr(remDuplicates.getGenArrNoDuplicates(someStrArr));
        remDuplicates.printArr(remDuplicates.getGenArrNoDuplicates(someIntArr));
        RemDuplicatesArr remDuplicatesArr = new RemDuplicatesArr();

        System.out.println(Arrays.toString(remDuplicates.getGenArrNoDuplicates(someIntArr)));
        System.out.println(Arrays.toString(remDuplicates.getGenArrNoDuplicates(someStrArr)));

    }


}
