package functIterance;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000000"));

        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));

        System.out.println(isPhoneNumberValidPredicate.or(containNumber3).test("08009877800"));
        System.out.println(isPhoneNumberValidPredicate.and(containNumber3).test("07000000003"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containNumber3 = phone ->
            phone.contains("3");
}
