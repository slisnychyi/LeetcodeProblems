package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

    public static void main(String[] args) {
        System.out.println(new SubdomainVisitCount().subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }

    public List<String> subdomainVisits(String[] cpdomains) {

        List<String> result = new ArrayList<>();

        Map<String, Integer> visted = new HashMap<>();

        for(String domain : cpdomains){
            int val = Integer.parseInt(domain.substring(0, domain.indexOf(" ")));
            domain = domain.substring(domain.indexOf(" ") + 1, domain.length());
            String[] subdomain = domain.split("\\.");
            String current = "";
            for(int i = subdomain.length - 1; i >= 0; i--){
                current = subdomain[i] + current;
                visted.compute(current, (key, value) -> value == null ? val : val + value);
                current = "." + current;
            }
        }


        for(Map.Entry<String, Integer> entry : visted.entrySet()){
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;

    }
}
