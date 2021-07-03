import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PangramChecker {

    public boolean isPangram(String input) {
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        List<String> characterList = new ArrayList<String>(Arrays.asList(alphabet));

        for (String s: alphabet) {
               if(input.contains(s))
                   characterList.remove(s);
        }
        return characterList.size() == 0;
    }
}
