package palindrome;

public class Palindr
{
    public static boolean isPalindrom(String somStr)
    {
        for (int i = 0; i <somStr.length()/2 ; i++)
        {
            if (somStr.toUpperCase().charAt(i) != somStr.toUpperCase().charAt(somStr.length()-i-1))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrom(int somInt)
    {
        String tempstr = String.valueOf(somInt);
        for (int i = 0; i <tempstr.length()/2 ; i++)
        {
            if (tempstr.toUpperCase().charAt(i) != tempstr.toUpperCase().charAt(tempstr.length()-i-1))
            {
                return false;
            }
        }

        return true;
    }
}
