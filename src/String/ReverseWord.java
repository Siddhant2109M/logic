package String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord {
    public static void main(String[] args) {
        String str ="the    sky is blue";
        str=str.trim();
        List<String> list= Arrays.asList(str.split("\\s+"));
        Collections.reverse(list);
        str=String.join(" ",list);
        System.out.println(str);

    }
}
