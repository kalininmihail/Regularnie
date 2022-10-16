import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Found {

    public static void Find(String wrd) {

        Pattern pattern = Pattern.compile("/^[a-zA-Z]{5}$/");
        Matcher matcher = pattern.matcher(wrd);
        while (matcher.find()) {
            String newStr = matcher.replaceAll("*");
            System.out.println(newStr);

        }
    }
}
