import java.util.ArrayList;

public class CreateArray {

    public void run(int sizeOfArray) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < sizeOfArray; i++){
            array.add(i-1);
        }
        System.out.println(array.toString());
    }

}
