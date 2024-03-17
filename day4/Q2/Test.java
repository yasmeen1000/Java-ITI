import java.util.ArrayList;

public class Test {
    

    void Test(ArrayList<Shape> list)
    {
        for (int i = 0; i < list.size(); i++) {

            list.get(i).draw();
        }
    }
}
