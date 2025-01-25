public class RailFenceCipherEncryption {

  
    public static String encrypt(String text, int key) {
        if (key <= 1) return text;  
        char[][] rail = new char[key][text.length()];
        boolean down = false;
        int row = 0, col = 0;

        
        for (char c : text.toCharArray()) {
            rail[row][col++] = c;

            if (row == 0 || row == key - 1) {
                down = !down;
            }
            row += down ? 1 : -1;
        }

        
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < text.length(); j++) {
                if (rail[i][j] != 0) {
                    encryptedText.append(rail[i][j]);
                }
            }
        }
        return encryptedText.toString();
    }

    
    public static void main(String[] args) {
        String text = "HELLOWORLD";
        int key = 3;

        String encrypted = encrypt(text, key);
        System.out.println("Encrypted: " + encrypted);
    }
