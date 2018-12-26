package stringTask;

import java.security.PrivateKey;

public class StringShift
{
    public String[] getStrings()
    {
        return strings;
    }

    public void setStrings(int arrSize)
    {
        strings = new String[arrSize];
        for (int i = 0; i < arrSize ; i++)
        {
            strings[i]  = "str" + (i+1);
        }
    }

    private String [] strings;

    public void printArr()
    {
        System.out.print("{");
        for (int i = 0; i <strings.length ; i++)
        {
            System.out.print("[" + i + "]=>(");
            System.out.print(strings[i]+")");
            if (i != strings.length) {System.out.print("|");}
        }
        System.out.println("}");
    }

    public void shiftArr(int shift)
    {
        if (shift == 0)
        {
            return;
        }
        String tempStr = strings[0];
        oneShift(0);
        strings[strings.length-1]=tempStr;
        shiftArr(shift-1);
    }

    private void oneShift(int n)
    {
        if (n == strings.length-1)
        {
            return;
        }
        strings[n] = strings[n+1];
        oneShift(n+1);
    }
}
