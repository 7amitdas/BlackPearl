package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Problems
 * 
 * 929. Unique Email Addresses Solution 1 </br>
 * {@link} https://leetcode.com/problems/unique-email-addresses
 * 
 * @author Amit Das
 */
public class UniqueEmailAddresses929 {

	public int numUniqueEmails(String[] emails) {
		Set<String> validEmailList = new HashSet<>();
		for (String email : emails) {
			if (email.indexOf("@") == email.lastIndexOf("@") && !email.startsWith("+") && email.endsWith(".com")) {
				String localName = "";
				if (email.indexOf("+") >= 0) {
					localName = email.substring(0, email.indexOf("+"));
				} else {
					localName = email.substring(0, email.indexOf("@"));
				}
				validEmailList.add(localName.replace(".", "") + email.substring(email.indexOf("@")));
			}
		}
		return validEmailList.size();
	}

	public static void main(String[] args) {
		UniqueEmailAddresses929 t = new UniqueEmailAddresses929();
		System.out.println(t.numUniqueEmails(new String[] { "test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com" }));
	}
}