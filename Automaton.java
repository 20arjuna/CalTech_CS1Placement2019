import java.util.*;

public class Automaton
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

    public static int determineRandNumber()
    {
        if(Math.random() < 0.5)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static void insertGen0()
    {
        for(int c = 0; c < autoLength; c++)
        {
            output[0][c] = determineRandNumber();
        }
    }

    public int[][] fillOutputMatrix()
    {
        int updateSum = 0;
        insertGen0();
        for(int row = 1; row < autoLength; row ++)
        {
            for(int column = 0; column < generations; column++)
            {
                if(column == 0)
                {
                    updateSum = 0 + output[row-1][column] + output[row-1][column+1];
                }
                else if(column == autoLength-1)
                {
                    updateSum = output[row-1][column-1] + output[row-1][column] + 0;
                }
                else
                {
                    updateSum = output[row-1][column-1] + output[row-1][column] + output[row-1][column+1];
                }
                output[row][column] = updateRule[updateSum];
            }
        }
    }

    public static void print2DMatrix(int mat[][])
    {
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
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
        print2DMatrix(a.fillOutputMatrix());

    }

}
