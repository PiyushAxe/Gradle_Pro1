public class lamp {
	boolean isOn;

	void turnOn(){
	isOn = true;
	}
	
	void turnOff(){
	isOn = false;
	}

	void displayStatus(){
	
	System.out.println("Lamp Status?" + isOn);
	}

}
