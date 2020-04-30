import java.util.Arrays;

public class automaton
{
    private int autoLength;
    private int generations;
    private int[] updateRule;
    private int[][] output;

    public Automaton(int autoLength, int generations, int[] updateRule)
    {
        this.autoLength = autoLength;
        this.generations = generations;
        this.updateRule = updateRule;
        this.output = new int[generations][autoLength];
    }

    public static<T> T[] subArray(T[] array, int beg, int end)
    {
        return Arrays.copyOfRange(array, beg, end);
    }

    public void insertGen0()
    {
        
    }
    public int[][] fillOutputMatrix()
    {
        insertGen0();
    }

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

        Automaton a = new Automaton(autoLength, generations, updateRule);
        System.out.println(a.fillOutputMatrix());

    }

}
