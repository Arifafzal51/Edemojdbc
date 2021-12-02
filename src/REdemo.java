//Regular expression

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class REdemo {

    public static void main(String[] args) {
        String str="b%#@abcdbbb9087 &";
        Pattern p=Pattern.compile("\\W"); //pattern provided here
        int ctr=0;
        Matcher m =p.matcher(str); //target string provided here
        while(m.find())
        {
            System.out.println(m.start()+ "--------"+m.end()+ "---"+ m.group());
           ctr++;
        }
        System.out.println("no of counts = "+ctr);
    }
}
