import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void run(ArrayList<Integer> theList) {
        for (int t = 0; t < theList.size(); t++) {
            if (theList.get(t) == 0) continue;
            theList.set(t, theList.get(t) - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(0,0,4,2,0,0,1));
        run(lst);
    }
}
