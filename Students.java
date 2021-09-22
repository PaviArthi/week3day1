package assignments;

public class Students {
	
	public void getStudentInfo(int id) {
		   System.out.println("Student Id : "+id);
		   	   }
	   
	   public void getStudentInfo(int id, String name)
	   {
		   System.out.println("Student Id:"+id);
		   System.out.println("Student Name:"+name);
		   	   
	   }
	   
	   public void getStudentInfo(String email, long phoneNo) {
		   System.out.println("Student e-mail: "+email);
		   System.out.println("Student PhoneNo:"+phoneNo);
	   }
	   
	   public static void main(String[] args) {
		   Students student = new Students();
		   student.getStudentInfo(22);
		   student.getStudentInfo(22, "Arthi");
		   student.getStudentInfo("arthiyellow@gmail.com", 907856341);
}
}
