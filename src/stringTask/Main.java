package stringTask;

public class Main
{
    public static void main(String[] args)
    {
        StringShift stringShift = new StringShift();
        stringShift.setStrings(10);
        stringShift.printArr();
        stringShift.shiftArr(3); // shifting array by n units
        stringShift.printArr();
    }
}
