
public abstract class Animal implements Comparable<Animal> {
	private String name;
	private int legs;
	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	public int getLegs() {
		return legs;
	}
	@Override
	public int compareTo(Animal a) {
		return Integer.valueOf(legs).compareTo(Integer.valueOf(a.legs));
	}

	

}
