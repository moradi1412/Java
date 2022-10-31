public class BinaryFormatException extends NumberFormatException {
	private String binaryString;

	public BinaryFormatException(String binaryString) {
		super("Not a binary number :" + binaryString);
		this.binaryString = binaryString;
	}

	public String getBinaryString() {
		return binaryString;
	}
}