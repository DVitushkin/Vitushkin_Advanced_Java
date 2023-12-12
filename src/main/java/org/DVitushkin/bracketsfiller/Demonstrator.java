package org.DVitushkin.bracketsfiller;

/**
 * Main class of task about v.
 */

public class Demonstrator {
    public static void main(String[] args) {
        String base = "example";
        System.out.printf("[Test1] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%s>\n", "(e(x(a(m)p)l)e)", BracketsFiller.FillString(base));

        base = "brackets";
        System.out.printf("[Test2] Was put: <%s>\n", base);
        System.out.printf("Expected: <%s>, got: <%s>\n", "(b(r(a(c()k)e)t)s)", BracketsFiller.FillString(base));

    }
}
