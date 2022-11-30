import java.util.Scanner;

class Assignments {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a message: ");
        String message = scanner.nextLine();
        String encryptedMessage = encryption(message);
        System.out.println("Encryption Message: " + encryptedMessage);
        String decryptedMessage = decryption(encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    static String encryption(String message) {
        String encryptedMessage = "";
        int key;
        char ch;
        System.out.println("Enter key: ");
        key = scanner.nextInt();
        for (int i = 0; i < message.length(); ++i) {
            ch = message.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + key);
                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                encryptedMessage += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + key);
                if (ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
                encryptedMessage += ch;
            } else {
                encryptedMessage += ch;
            }
        }
        return encryptedMessage;

    }

    static String decryption(String encrypMessage) {
        String decryptedMessage = "";
        int key;
        char ch;
        System.out.println("Enter key: ");
        key = scanner.nextInt();
        for (int i = 0; i < encrypMessage.length(); ++i) {
            ch = encrypMessage.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - key);
                if (ch < 'a') {
                    ch = (char) (ch + 'z' - 'a' + 1);
                }
                decryptedMessage += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch -
                        key);
                if (ch < 'A') {
                    ch = (char) (ch + 'Z' - 'A' + 1);

                }
            }
        }
        return decryptedMessage;
    }
}