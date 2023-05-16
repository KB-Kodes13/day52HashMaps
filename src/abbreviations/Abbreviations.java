package abbreviations;

import java.util.HashMap;
import java.util.Map;

public class Abbreviations {

    private Map<String, String> abbreviations;
    public Abbreviations() {
        abbreviations = new HashMap<>();
    }
    public void addAbbreviations(String abbreviation, String explaination) {
        abbreviations.put(abbreviation, explaination);

    }
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation) {
        return abbreviations.get(abbreviation);
    }
}
