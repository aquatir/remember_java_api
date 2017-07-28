package learn_to_code.java_api.lambdas.object_method_reference;


/**
 * Take note that methods in this class have the save signature as {@link learn_to_code.java_api.lambdas.StringFunc} functional interface.
 * This is required in order to make :: notation references
 */
public class NonStaticStringOperations {
    public String reverse (String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }

    public String cutFiveTrailingChars(String str) {
        return str.substring(0, str.length() - 5);
    }

}