package org.DVitushkin.replacespaces;

/**
 * Main class of task about removing extra spaces symbols.
 */

public class Demonstrator {
    public static void main(String[] args) {
        String base = "ex   am pl  e";
        System.out.printf("[Test1] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%s>\n", "ex am pl e", ReplaceSpaces.removeExtraSpaces(base));
    }
}
