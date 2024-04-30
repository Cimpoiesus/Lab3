import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Paragraf extends Pagina {
    String text;

    Paragraf(String text) {
        this.text = text;
    }

    public void searchPattern(String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("Pattern found in paragraph: " + text + ": " + m.group());
        }

    }
    public void searchPattern(int nimic){

    }

}