package advance.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	    	  Student std1 = new Student("Vu", 20, "Hue", "0328088002", 8);
				Student std2 = (Student) std1.clone();
				System.out.println(std1.toString());
				System.out.println(std2.toString());
		   } catch (CloneNotSupportedException e) {
				// TODO: handle exception
				e.printStackTrace();
		     }
		}

	

	}


