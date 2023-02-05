package cw;

/* You are given a string. You must replace any occurrence of the sequence coverage by covfefe,
 * however, if you don't find the word coverage in the string,
 * you must add covfefe at the end of the string with a leading space.
 */

public class Covfefe {
    public static void main(String[] args) {
        System.out.println((covfefe("coverage")));
        System.out.println((covfefe("coverage coverage")));
        System.out.println((covfefe("nothing")));
        System.out.println((covfefe("double space ")));
        System.out.println((covfefe("covfefe")));
        System.out.println((covfefe("erag")));
    }

    public static String covfefe(String str) {
        return str.contains("coverage") ? str.replaceAll("coverage", "covfefe") : str.concat(" covfefe");
    }
}
