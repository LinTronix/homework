package removeDuplicates;

public class RemDuplicatesArr
{
    public int[] removeDuplicates(int[] someArr)
    {
        int[] val = new int[someArr.length];
        boolean isDuplicate;
        for (int i = 0; i <someArr.length ; i++)
        {
            isDuplicate=false;
            for (int s = i; s <someArr.length ; s++)
            {
                if (someArr[s]== someArr[i])
                {
                    isDuplicate = true;
                }
            }
            if (isDuplicate == false)
            {
                val[i] = someArr[i];
            }
        }
        return val;
    }

    public String[] removeDuplicates(String[] someArr)
    {
        String[] val = new String[someArr.length];
        boolean isDuplicate;
        for (int i = 0; i <someArr.length ; i++)
        {
            isDuplicate=false;
            for (int s = i; s <someArr.length ; s++)
            {
                if (someArr[s]== someArr[i])
                {
                    isDuplicate = true;
                }
            }
            if (isDuplicate == false)
            {
                val[i] = someArr[i];
            }
        }
        return val;
    }
}
