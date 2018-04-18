public class PhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        if (phoneNumber.substring(0, 0) == "(" && phoneNumber.substring(4, 4) == ")" && phoneNumber.substring(5, 5) == (" ")
                && phoneNumber.substring(9, 9) == "-" && phoneNumber.length() == 14) {
            return true;
        } else return false;
    }
}
