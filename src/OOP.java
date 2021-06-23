
public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp = new Employee(); // Instantiating a new employee objj
		
		emp._id = 1;
		emp.name = "M Rizzan";
		
		System.out.println(emp._id);
		System.out.println(emp.name);
		
		emp.printDetails();
	}

}






class Employee{
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int _id;
	public String name;
	
	public void printDetails() {
		
		System.out.println("Name is: " +name);
		System.out.println("Id is: " +_id);
	}
	
	
}
