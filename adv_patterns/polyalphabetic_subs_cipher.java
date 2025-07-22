import java.util.*;

class PolyalphabeticSubsCipher {

    static HashMap<Character, Integer> charToIndex = new HashMap<>();
    static HashMap<Integer, Character> indexToChar = new HashMap<>();
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Initialize the alphabet maps
    static void initAlphabetMaps() {
        for (int i = 0; i < 26; i++) {
            charToIndex.put(alphabet.charAt(i), i);
            indexToChar.put(i, alphabet.charAt(i));
        }
    }

    // Generate repeating key to match the length of the message
    static String generateKey(String text, String key) {
        StringBuilder newKey = new StringBuilder();
        key = key.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            newKey.append(key.charAt(i % key.length()));
        }
        return newKey.toString();
    }

    // Encrypt function
    public static String encrypt(String plainText, String key) {
        initAlphabetMaps();
        plainText = plainText.toUpperCase();
        key = generateKey(plainText, key);
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            int p = charToIndex.get(plainText.charAt(i));
            int k = charToIndex.get(key.charAt(i));
            int c = (p + k) % 26;
            cipherText.append(indexToChar.get(c));
        }
        return cipherText.toString();
    }

    // Decrypt function
    public static String decrypt(String cipherText, String key) {
        initAlphabetMaps();
        cipherText = cipherText.toUpperCase();
        key = generateKey(cipherText, key);
        StringBuilder plainText = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i++) {
            int c = charToIndex.get(cipherText.charAt(i));
            int k = charToIndex.get(key.charAt(i));
            int p = (c - k + 26) % 26;
            plainText.append(indexToChar.get(p));
        }
        return plainText.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the plaintext: ");
        String plaintext = sc.nextLine();
        System.out.print("Enter the key: ");
        String key = sc.nextLine();

        String cipherText = encrypt(plaintext, key);
        System.out.println("Encrypted (cipher) text: " + cipherText);

        String decryptedText = decrypt(cipherText, key);
        System.out.println("Decrypted (original) text: " + decryptedText);

        sc.close();
    }
}
