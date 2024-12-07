package learnJava;

public class QRCodeGenerator {

    public static void main(String[] args) {
        String data = "HELLO"; // Data to encode
        int size = 50;         // Size of the QR code grid (ensure it's large enough for the data)

        // Generate a simple binary representation
        int[][] qrCode = generateSimpleQRCode(data, size);

        // Print the "QR code" to the console
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(qrCode[row][col] == 1 ? "██" : "  ");
            }
            System.out.println();
        }
    }

    // Function to generate a simple binary matrix
    public static int[][] generateSimpleQRCode(String data, int size) {
        int[][] qrCode = new int[size][size];

        // Fill edges with "finder patterns" (black squares)
        for (int i = 0; i < size; i++) {
            qrCode[0][i] = 1; // Top row
            qrCode[size - 1][i] = 1; // Bottom row
            qrCode[i][0] = 1; // Left column
            qrCode[i][size - 1] = 1; // Right column
        }

        // Encode data in binary and place it in the center
        String binaryData = toBinary(data);
        int binaryLength = binaryData.length();
        
        // Ensure the data fits in the QR code grid
        if (binaryLength > size - 2) {
            throw new IllegalArgumentException("Data too long for the grid size. Increase the grid size.");
        }

        int startX = (size - binaryLength) / 2; // Center the binary data
        int startY = size / 2;                 // Middle row for simplicity

        for (int i = 0; i < binaryLength; i++) {
            qrCode[startY][startX + i] = binaryData.charAt(i) - '0';
        }

        return qrCode;
    }

    // Convert string to binary representation
    public static String toBinary(String data) {
        StringBuilder binary = new StringBuilder();
        for (char c : data.toCharArray()) {
            binary.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
        }
        return binary.toString();
    }
}
