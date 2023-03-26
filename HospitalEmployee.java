package part_1;

public class HospitalEmployee {
		protected String name;
		protected int number;
		public HospitalEmployee(String name, int number)
		{
			setName(name);
			setnumber(number);		
		}
		public int getNumber() {
			return this.number;
		}
		public void setnumber(int number) {
			this.number=number;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void work() {
			System.out.println(name + " works for hospital.");
		}
		@Override
		public String toString() {
			return name + " "+ Integer.toString(number);
		}
	}


