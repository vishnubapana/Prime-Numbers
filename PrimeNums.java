/*
 * Name: Venkata Bapanapalli
 * Class: CS 3345
 * Section: 004
 * Semester Spring 2018
 */
public class PrimeNums 
{
	public static void main(String[] args)
	{
		int nums = 100;
		int array[] = new int[nums+1];
        for(int i = 0; i < nums; i++)
            array[i] = 1;
         
        for(int x = 2; (x*x) <= nums; x++)
        {
            if(array[x] == 1)
            {
                for(int i = (x*2); i <= nums; i += x)
                    array[i] = 0;
            }
        }
        for(int i = 2; i <= nums; i++)
        {
            if(array[i] == 1) 
            {
                System.out.println(i);
            }
        }
	}
}
