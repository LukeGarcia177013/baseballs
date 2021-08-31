import java.util.ArrayList;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
        BaseballPlayerList myList = new BaseballPlayerList();

        myList.add("Mike Trout", "Angels", .311);
        myList.add("Garrett Anderson", "Angels", .333);
        myList.add("Wally Joyner", "Angels", .289);
        myList.add("David Fletcher", "Angels", .301);
        myList.add("Justin Upton", "Angels", .278);

        myList.add("Justin Turner", "Dodgers", .303);
        myList.add("Corey Seager", "Dodgers", .271);
        myList.add("Code Bellinger", "Dodgers", .265);
        myList.add("Chris Taylor", "Dodgers", .300);
        myList.add("Mookie Betts", "Dodgers", .321);

        System.out.println(myList.getHighestAvg("Angels"));
        System.out.println(myList.getHighestAvg("Dodgers"));
    }
}
