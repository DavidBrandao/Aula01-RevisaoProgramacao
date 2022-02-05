package test01;

import javax.swing.JOptionPane;

public class DataType {
	
	//Variables
	private String myString = "David";
	private boolean myBool = false;
	private int myInt = 10;
	private double myDouble = 8.5;
	private float myFloat = 3.5f;
	
	//Getters and Setters
	public String getMyString() {
		return myString;
	}
	public void setMyString(String myString) {

		this.myString = myString;
	}
	public boolean isMyBool() {
		return myBool;
	}
	public void setMyBool(boolean myBool) {
		this.myBool = myBool;
	}
	public int getMyInt() {
		return myInt;
	}
	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}
	public float getMyFloat() {
		return myFloat;
	}
	public void setMyFloat(float myFloat) {
		this.myFloat = myFloat;
	}
	public double getMyDouble() {
		return myDouble;
	}
	public void setMyDouble(double myDouble) {
		this.myDouble = myDouble;
	}

	//Public Methods
	public void PrintMyData() {
		JOptionPane.showMessageDialog(null, String.format("My string value: %s", getMyString()));
		JOptionPane.showMessageDialog(null, String.format("My bool value: %b", isMyBool()));
		JOptionPane.showMessageDialog(null, String.format("My int value: %d", getMyInt()));
		JOptionPane.showMessageDialog(null, String.format("My double value: %f", getMyDouble()));
		JOptionPane.showMessageDialog(null, String.format("My float value: %f", getMyFloat()));
	}
	
	public void PrintStringLength(String myString) {
		JOptionPane.showMessageDialog(null, myString.length());
	}
	
	public void PrintCharPosition(String myString, int position) {
		JOptionPane.showMessageDialog(null, myString.charAt(position));
	}
	
	public void CompareToExample(String first, String seconf) {
		// If return 0, the value is equal to desired
		JOptionPane.showMessageDialog(null, first.compareTo(seconf));
	}
}
