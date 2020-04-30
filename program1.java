import java.util.Arrays;

public class automaton
{

    public static<T> T[] subArray(T[] array, int beg, int end)
    {
        return Arrays.copyOfRange(array, beg, end);
    }

    public
    public static void main (String [] args)
    {
        int autoLength = Integer.parseInt(args[0]);
        int generations = Integer.parseInt(args[1]);
        String [] temp = subArray(args, 2, args.length);
        int [] updateRule = new int[temp.length];

        for(int i = 0; i < updateRule.length; i++)
        {
            updateRule[i] = Integer.parseInt(temp[i]);
        }

        makeGen0(autoLength);
    }

}
