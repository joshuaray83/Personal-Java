// Name         : Josh Heyer
// Email        : joshuaray83@gmail.com
//
// This program takes up to 10 numbers input by a user and assigns them to 
// an array. Then, it outputs the total, average, largest and smallest numbers.

import java.util.Scanner;

public class SimpleList {

    private final int ARRAY_LENGTH = 10;
    private float[] List = new float[ARRAY_LENGTH];
    private int Count;
    private float Sum;
    private float Average;
    private float Large;
    private float Small;

// Method Name          : simpleList
// Parameters           : None
// Return value(s)      : Void
// Description : This is constructor. Should display welcome and initialize 
// array members and Sum to 0.
    public SimpleList () {
        
        System.out.println ("Welcome to the Simple List Class");
        float[] List = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Sum = 0;
    }

// Method Name      : getData
// Parameters       : None
// Return value(s)  : Void
// Description : This method should use a repetition structure to read up to 10 // input values. This method should limit the user to a max of 10 input values.
// The actual number of values input by user should be stored in Count.
    public void getData () {
        
        Scanner input = new Scanner (System.in);
        for (int x = 0; x < ARRAY_LENGTH; x++) {
            Count++;
            System.out.print ("Enter a floating point value: ");
            List[x] = input.nextFloat();
            if (x < 9) {
                System.out.print ("Would you like to input another value (y or n)? ");
                char yes = input.next().charAt(0);
                while (yes != 'y' && yes != 'n') {
                    System.out.println ("Invalid input, enter y or n");
                    System.out.print ("Would you like to input another value (y or n)? ");
                    yes = input.next().charAt(0);
                }
                if (yes == 'y') {
                    continue;
                }
                if (yes == 'n') {
                    break;
                }
            }
        }
    }

// Method Name      : processData
// Parameters       : None
// Return value(s)  : Void
// Description : This method should calculate the sum of all values input, the
// average value, smallest value, and largest value.
    public void processData () {
        
        for (int x = 0; x < Count; x++) {
            Sum += List[x];
        }
        Average = Sum / Count;
        Large = List[0];
        for (int y = 1; y < Count; y++) {
            if (Large < List[y]) {
                Large = List[y];
            }
        }
        Small = List[0];
        for (int z = 1; z < Count; z++) {
            if (Small > List[z]) {
                Small = List[z];
            }
        }
    }

// Method Name      : displayResults
// Parameters       : None
// Return value(s)  : Void
// Description : This method should display values store in the list up to the
// number of values input. Do not display un-used entries.
// Use a repetition structure to print array elements. Also display sum,
// average, smallest, and largest values to screen.
    public void displayResults () {
        
        for (int x = 0; x < Count; x++) {
            System.out.printf ("Value %d = %f\n", x + 1, List[x]);
        }
        System.out.printf ("Sum of all values = %f\n", Sum);
        System.out.printf ("Average of all values = %f\n", Average);
        System.out.printf ("Largest value = %f\n", Large);
        System.out.printf ("Smallest value = %f\n", Small);
    }
}
