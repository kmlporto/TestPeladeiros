package arquitetura.dataProvider;

import java.util.ArrayList;

public class Convert {

    public static Object[][] toMatrix(ArrayList<Object[]> listOFLists) {
        Object[][] arr = new Object[listOFLists.size()][];
        int i = 0;
        for (Object[] row: listOFLists) {
            arr[i++] = row;
        }
        return  arr;
    }
}
