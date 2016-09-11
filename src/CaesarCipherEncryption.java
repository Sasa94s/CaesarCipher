import java.util.Scanner;

public class CaesarCipherEncryption {
		
		public static void main(String[] args) {
			
			startup();
			
			
		}


		private static void startup() {
			Scanner getInput = new Scanner(System.in);
			System.out.print("Choose from 1=Encryption 2=Decryption : ");
			switch (getInput.nextInt()) {
			case 1:
				encryption();
				break;
			case 2:
				decryption();
				break;
			default:
				System.err.println("Error! Enter a valid number.");
				startup();
				break;
			}
		}


		private static void continous(Scanner getInput) {
			System.err.print("Do you want to continue? (Y/N)");
			switch (getInput.next().toUpperCase()) {
			case "Y":
				startup();
				break;
			case "N":
				System.exit(0);
				break;
			default:
				System.out.println("Error! Re-enter your answer.");
				continous(getInput);
				break;
			}
		}
			

		private static void encryption() {
			Scanner getInput = new Scanner(System.in);
			System.out.print("Enter your message for encryption: ");
			String forEncryption = getInput.nextLine();
			forEncryption = forEncryption.toUpperCase();
			String encryptedText = "";
			
			for (int i=0 ; i < forEncryption.length() ; i++) {
				char temp = (char) ('A' + (forEncryption.charAt(i) - 'A' + 3) % 26);
				encryptedText += temp;
			}
			System.out.println("Encrypted Text: " + encryptedText);
			continous(getInput);
		}
		
		private static void decryption() {
			Scanner getInput = new Scanner(System.in);
			System.out.print("Enter your message for decryption: ");
			String forDecryption = getInput.nextLine();
			forDecryption = forDecryption.toUpperCase();
			String decryptedText = "";
			
			for (int i=0 ; i < forDecryption.length() ; i++) {
				char temp = (char) ('Z' + (forDecryption.charAt(i) - 'Z' - 3) % 26);
				decryptedText += temp;
			}
			System.out.println("Encrypted Text: " + decryptedText);
			continous(getInput);
		}
}

