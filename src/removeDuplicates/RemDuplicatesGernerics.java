package removeDuplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemDuplicatesGernerics<E>
{

    private E[] genArr;

    public E[] getGenArrNoDuplicates(E[] nArr)
    {

        Set<E> set = new HashSet(Arrays.asList(nArr));
        genArr = (E[])set.toArray();
        return genArr;
    }



    public void printArr(E[] someArr)
{
    System.out.print("{");
    for (int i = 0; i <someArr.length-1 ; i++)
    {
        System.out.print(someArr[i] + ",");
    }
    System.out.println(someArr[someArr.length-1]+"}");
}




}
