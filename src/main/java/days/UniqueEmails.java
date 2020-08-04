package days;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmails {
    public static void main(String[] args) {
        System.out.println(new UniqueEmails().numUniqueEmails(new String[]{"testemail@leetcode.com", "testemail1@leetcode.com", "testemail+david@lee.tcode.com"}));
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String domain = parts[0].replaceAll("\\.", "");
            String x = domain.substring(0, domain.contains("+") ? domain.indexOf("+") : domain.length());
            result.add(x + "@" + parts[1]);
        }
        return result.size();
    }
}
