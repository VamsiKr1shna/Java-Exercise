package TryOuts;

import java.util.ArrayList;
import java.util.List;

class GenericDemo {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();// Line1
        nameList.add("Potnuri Venkata Sai Vamsi Krishna");
        nameList.add("Sirius");
        nameList.add("James");
        nameList.add("Lily");
        nameList.add("Cho");
        nameList.add("Hermione");
        findLongestString(nameList);
    }

    public static void findLongestString(List<String> list) {
        String longest = "";
        for (String objectgg : list) {
            if (objectgg.length() > longest.length())
                longest = objectgg;
        }
        System.out.println("The string having the maximum length is " + longest);
    }

}
