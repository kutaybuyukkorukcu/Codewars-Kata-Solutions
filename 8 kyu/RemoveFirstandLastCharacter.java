public class RemoveChars {
    public static String remove(String str) {
      return (str.length() > 2) ? str.substring(1,str.length() - 1) : str;
    }
}
