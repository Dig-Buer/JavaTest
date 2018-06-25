package findPairs;

import java.util.ArrayList;

public class Test{

    // The main method  input an integer and a list to test the functionality.
    public static void main(String[] args) {
        Test t = new Test();
        int firstNumber = 12;
        int[] list = new int[]{3, 10, 4, 9, 8, 7, 4};
        t.findPairs(firstNumber, list);
    }

    // findPairs method two for loop in order to view all possible pairs.
    public ArrayList<Pair> findPairs(int firstNumber, int[] list) {
        ArrayList<Pair> tempPairs = new ArrayList<>(); // used to store the pairs that meet the requirements.
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if ((list[i] + list[j]) == firstNumber)
                {
                    Pair pair = new Pair(list[i], list[j]); // create an pair
                    if (!containsPair(pair, tempPairs))
                        tempPairs.add(pair); // add to the array
                }
            }

        }
        printPairs(tempPairs);
        return tempPairs;


    }

    // method used to test whether the pair is included.
    public boolean containsPair(Pair pair, ArrayList<Pair> pairs) {
        if (pairs.size() == 0) // the the size is 0 which means there is nothing, then return false.
            return false;
        for (Pair p : pairs) {
            // check the pair with the pairs in the array to justify whether they are same.
            if (p.getA() == pair.getA() || p.getA() == pair.getB())
                return true;
        }
        return false;
    }

    // method used to print pairs collected.
    public void printPairs(ArrayList<Pair> pairs) {
        for (Pair p : pairs)
            System.out.println(p.getA() + "," + p.getB());
    }


}
