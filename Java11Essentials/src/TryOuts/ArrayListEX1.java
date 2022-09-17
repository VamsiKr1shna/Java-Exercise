package TryOuts;

import java.util.ArrayList;
import java.util.List;

class ArrayListEX1 {

    public static void main(String[] args) {
        List<String> ex1 = new ArrayList<String>();
        ex1.add("Brian");
        ex1.add("Ross");
        ex1.add("Steve");
        ex1.add("Rachel");
        ex1.add("Steve");

        if (ex1.isEmpty()) {
            System.out.println("No ex1 are present!!");
        }

        // Displaying the number of ex1 in the list
        System.out.println("Number Of ex1: " + ex1.size());

        // Creating newex1 list
        List<String> newex1 = new ArrayList<String>();
        newex1.add("Emily");
        newex1.add("Melissa");

        // Adding elements of newex1 list into ex1 list
        ex1.addAll(newex1);

        // Displaying all ex1
        System.out.println("The list of ex1: ");
        System.out.println("========================================");
        for (String name : ex1) {
            System.out.println(name);
        }
        System.out.println("========================================");

        // Checking whether the name Ross is present or not
        if (ex1.contains("Ross")) {
            System.out.println("The name is present already!!!");
        } else {
            System.out.println("The name is not present!!");
        }

    }
}
