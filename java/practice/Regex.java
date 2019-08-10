package practice;

public class Regex {
    public static void main(String[] args) {
        String test = "apple";
        System.out.println(test.matches("[a-z]{1,5}"));

        test = "apple.banana";
        System.out.println(test.matches("[a-z]+\\.[a-z]+"));

        test = "apple.banana.carrot";
        System.out.println(test.matches("([a-z]+.){2}[a-z]+"));

        String ipOctet = "(([0-1]?\\d{1,2})|2[0-4]\\d|25[0-5])";
        String ipRegex = ipOctet + "\\." + ipOctet + "\\." + ipOctet + "\\." + ipOctet;

        test = "192.168.1.1";
        System.out.println(test.matches(ipRegex));
        test = "666.666.23.23";
        System.out.println(test.matches(ipRegex));
    }
}
