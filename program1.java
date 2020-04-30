import java.util.Arrays;

public class program1
{
    public static void main (String [] args)
    {
        int autoLength = Integer.parseInt(args[0]);
        int generations = Integer.parseInt(args[1]);
        String [] temp = subArray(args, 1, args.length);
        int [] updateRule = new int[temp.length];

        for(int i = 0; i < temp.length; i++)
        {
            updateRule[i] = Integer.parseInt(temp[i]);
        }

        System.out.println("autoLength: " + autoLength);
        System.out.println("generations: " + generations);
        System.out.println("updateRule: " + updateRule);
    }

    public static<T> T[] subArray(T[] array, int beg, int end)
    {
        return Arrays.copyOfRange(array, beg, end + 1);
    }
}
