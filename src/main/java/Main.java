import java.util.concurrent.TimeUnit;

public class Main{

    public String concatenation(String a,String b,String c){

        return a+b+c;
    }
    public int stringLenght(String str1){

        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return str1.length();
    }

    String strr1 = "Junit";
    String str2 = "Junit";

    public String strings(String string1,String string2){
        String tr ="";
        return tr;
    }
}


