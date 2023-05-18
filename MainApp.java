package advance.dev;

public class MainApp {
	private  String name;
	private int age;
	private String address;
	private String phoneNumer;
	private double averageScore;
	
	public MainApp(String name, int age, String address, String phoneNumber, double averageScore) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumer = phoneNumber;
        this.averageScore = averageScore;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(String phoneNumer) {
		this.phoneNumer = phoneNumer;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
}
