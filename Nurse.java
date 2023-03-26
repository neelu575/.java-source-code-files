package part_1;


public class Nurse extends HospitalEmployee {
	private int numOfpatients;
	public Nurse(String name, int i, int numOfpatients) {
		super(name, i);
		this.numOfpatients=numOfpatients;
	}
@Override
public String toString()
{
	return name + " has " + Integer.toString(numOfpatients) + " patients";
}
public void work() {
	String print = super.name+ " works for the hospital. "+super.name+" is a nurse with "+numOfpatients+" patients";
	System.out.println(print);
}
}