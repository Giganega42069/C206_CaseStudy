
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int loginoption = 0;
		int menuoption = 0;
		
		while (loginoption != 4) {
			if (loginoption == 1) {
				while (menuoption !=3) {
					if (menuoption == 1) {
						
					} else if (menuoption == 2) {
						
					} else if (menuoption == 3) {
						System.out.println("Bye!");
					} else {
						System.out.println("Invalid option");
					}
				}
			} else if (loginoption == 2) {
				while (menuoption != 5) {
					if (menuoption == 1) {
						
					} else if (menuoption == 2) {
						
					} else if (menuoption == 3) {
						
					} else if (menuoption == 4) {
						
					} else if (menuoption == 5) {
						System.out.println("Bye!");
					} else {
						System.out.println("Invalid option");
					}
				}
			} else if (loginoption == 3) {
				while (menuoption != 5) {
					if (menuoption == 1) {
						
					} else if (menuoption == 2) {
						
					} else if (menuoption == 3) {
						
					} else if (menuoption == 4) {
						
					} else if (menuoption == 5) {
						System.out.println("Bye!");
					} else {
						System.out.println("Invalid option");
					}
				}
			} else if (loginoption == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}
	}
	
	public static void LoginMenu() {
		C206_CaseStudy.setHeader("LOGIN");
		System.out.println("1. Student Account");
		System.out.println("2. Teacher Account");
		System.out.println("3. Administrator Account");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	
	public static void StudentMenu() {
		C206_CaseStudy.setHeader("MAIN MENU");
		System.out.println("1. View all activities");
		System.out.println("2. Register for activities");
		System.out.println("3. Quit");
	}
	
	public static void TeacherMenu() {
		C206_CaseStudy.setHeader("MAIN MENU");
		System.out.println("1. Manage Approval Status");
		System.out.println("2. Manage Activity");
		System.out.println("3. Manage Attendance");
		System.out.println("4. Manage Time Slot");
		System.out.println("5. Quit");
	}
	
	public static void AdminMenu() {
		C206_CaseStudy.setHeader("MAIN MENU");
		System.out.println("1. Manage Users");
		System.out.println("2. Manage Activity");
		System.out.println("3. Manage Registration");
		System.out.println("4. Manage Approval Status");
	}
	
	public static void UserMenu() {
		C206_CaseStudy.setHeader("USER MENU");
		System.out.println("1. Add a new user");
		System.out.println("2. View all users");
		System.out.println("3. Delete an existing user");
		System.out.println("4. Quit");
	}
	
	public static void ActivityMenu() {
		C206_CaseStudy.setHeader("ACTIVITY MENU");
		System.out.println("1. Add a new activity");
		System.out.println("2. View all activities");
		System.out.println("3. Delete an existing activity");
		System.out.println("4. Quit");
	}
	
	public static void RegisterMenu() {
		C206_CaseStudy.setHeader("REGISTER MENU");
		System.out.println("1. Add a new registration");
		System.out.println("2. View all registration");
		System.out.println("3. Delete an existing registration");
		System.out.println("4. Quit");
	}
	
	public static void ApprovalMenu() {
		C206_CaseStudy.setHeader("APPROVAL MENU");
		System.out.println("1. Add a new approval status");
		System.out.println("2. View all approval status");
		System.out.println("3. Delete an existing approval status");
		System.out.println("4. Quit");
	}
	
	public static void AttendanceMenu() {
		C206_CaseStudy.setHeader("ATTENDANCE MENU");
		System.out.println("1. Add a new attendance");
		System.out.println("2. View all attendance");
		System.out.println("3. Delete an existing attendance");
		System.out.println("4. Quit");
	}
	
	public static void TimeMenu() {
		C206_CaseStudy.setHeader("TIME SLOT MENU");
		System.out.println("1. Add a new time slot");
		System.out.println("2. View all time slot");
		System.out.println("3. Delete an existing time slot");
		System.out.println("4. Quit");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
}
