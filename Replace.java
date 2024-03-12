import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter original string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter index to replace (0-based): ");
        int index = scanner.nextInt();
        
        System.out.print("Enter replacement character: ");
        char replacement = scanner.next().charAt(0);
        
        String modifiedStr = replaceChar(str, index, replacement);
        
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modifiedStr);
        
        scanner.close();
    }
    
    public static String replaceChar(String str, int index, char replacement) {
        if (index < 0 || index >= str.length()) {
            return str;
        }
        
        char[] charArray = str.toCharArray();
        charArray[index] = replacement;
        return new String(charArray);
    }
}