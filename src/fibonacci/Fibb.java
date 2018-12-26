package fibonacci;

public class Fibb

{

    public static void showFib(int fibIndex)
    {
        int result = resRec(fibIndex);

        System.out.println(" recursive result = " + result);

         result = iritateFib(fibIndex);

        System.out.println(" iritiate result = " + result);

        result = arrayFib(fibIndex);

        System.out.println(" array result = " + result);
    }

    private static int resRec(int n)
    {
        if (n <= 2)
        {
            return 1;
        }

        return resRec(n-1) + resRec(n-2);
    }
    private static int iritateFib(int n)
    {
        if (n <= 2)
        {
            return 1;
        }

        int fnum = 1;
        int snum = 1;
        int res=0;

        for (int i = 3; i <=n ; i++)
        {
            res= fnum+snum;
            fnum = snum;
            snum = res;

        }
        return res;
    }
    private static int arrayFib(int n)
    {
        int res;
        int[] fArr = new int[n];
        if (n <3 )
        {
            return 1;
        }
        fArr[0] =1;
        fArr[1]=1;

        for (int i = 2; i <n ; i++)
        {
            fArr[i]=fArr[i-1]+fArr[i-2];
        }
        res = fArr[n-1];
        return res;
    }
}
