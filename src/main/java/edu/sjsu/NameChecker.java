package edu.sjsu;

public class NameChecker {
    /**
     * Checks if a given string is a valid name following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input Name to check
     * @return True if input is a valid name, else false
     */
    public static boolean check(String input) {
        if (input.length() < 2 || input.length() > 40) return false;

        String prev = input.substring(0, 1);

        if (prev.equals("'") || prev.equals("\"")) return false;

        int quoteCount = 0;

        for (int i = 1; i < chars.size(); i++) {
            String curr = input.subtring(i, i+1);
            char c = input.charAt(i);

            if (prev.equals(curr) && curr.equals("-")) {
                // check for consecutive hyphens
                return false;
            } else if (curr.equals("'")) {
                // check for more than one quote
                if (quoteCount > 0) return false;
                else quoteCount++;
            } else if (!Character.isLetter(c)) {
                // passed prev conditions, check if letter
                return false;
            }

        }

        return true;
    }
}
