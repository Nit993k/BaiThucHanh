import java.util.ArrayList;
public class Slide18 {
    public static void main(String[] arg){
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);
        System.out.println("Các phần tử có trong arrListFloat là :");
        for(int i = 0 ; i < arrListFloat.size(); i++){
            System.out.print(arrListFloat.get(i)+ "\t");
        }
    }
}
