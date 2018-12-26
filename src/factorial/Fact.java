package factorial;

public class Fact
{
    public static int factorialOf(int somNum)
    {
        if (somNum == 1)
        {
            return 1;
        }
        return somNum*factorialOf(somNum -1);
    }

    public static int factoriaCalculate(int somNum)
    {
        int val=somNum;
        for (int i = 1; i <somNum ; i++)
        {
            val *=i;

        }


        return val;
    }
}
