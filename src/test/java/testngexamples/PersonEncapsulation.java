package testngexamples;

public class PersonEncapsulation {
private String name;
private int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) throws IllegalArgumentException {
	if (name == null || name.equals("")) {
		throw new IllegalArgumentException("Name cant be null or empty");
	}
	this.name = name;
}


}
