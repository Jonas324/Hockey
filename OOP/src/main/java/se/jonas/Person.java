package se.jonas;

public class Person {
    private String person;
    private int ålder;
    private String rovar;

    public Person(String person, int ålder) {
        super();

        setperson(person);
        setålder(ålder);
        setrovar(language());
    }

    private void setrovar(String language) {
        rovar = language;
    }

    private void setålder(int ålder) {
        this.ålder = ålder;

    }

    private void setperson(String person) {
        this.person = person;
    }

    public static String rÖvarsprÅket(String s) {
        String översättning = "";
        for (int i = 0; i < s.length(); i++) {
            char text = s.charAt(i);
            if (bokstav(text)) {
                översättning = översättning + text;
            } else {
                översättning = översättning + text;
                översättning = översättning + "o";
                översättning = översättning + text;
            }
        }
        return översättning;
    }

    public static boolean bokstav(char text) {
        switch (text) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'å':
            case 'ä':
            case 'ö':
            case ' ':
                return true;
            default:
                return false;
        }
    }

    public String language() {  
        String h = "Hej " + person;
        return rÖvarsprÅket(h); 
        
    }

    public String getRovarAndÅlder() {
        String fÅlder = "Fel ålder";
        if (ålder >= 18) {
            String age = String.valueOf(ålder);
            return age + " " + rovar;
        } else
            return fÅlder;

    }

}
