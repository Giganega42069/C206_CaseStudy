	
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C206_CaseStudy {
    private static Controller controller = new Controller();
    private static User currentUser;
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    
  //IMPORTANT INFO
    
  //ALL PASSWORDS ARE "123"
    
  //student1 details: "student123");
  //student2 details: "harry");
  //student3 details: "peter parker");
    
  //admin details: "admin123");
  //teacher details: "teacher123");
    
  //LIST OF ACTIVITIES
  //Drama
  //Soccer/Football
  //Badminton
  //Basketball
  //Volleyball
  //NCC
  //NPCC
  //Red Cross
  //Military Band
  //Dance
  //Choir
  //String Ensemble
    
  //note that time slot is only added for the Drama activity so only use the drama activity when testing 
    

    public static void main(String[] args) {
        while (true) {
        	System.out.println("");
        	System.out.println("Main Menu");
        	Helper.line(20, "=");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        for (User user : controller.getUsers()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Logged in successfully!");
                performActionsBasedOnRole();
                return;
            }
        }
        System.out.println("Invalid username or password. Try again.");
    }

    private static void performActionsBasedOnRole() {
        switch (currentUser.getRole()) {
            case "student":
                performStudentActions();
                break;
            case "teacher":
                performTeacherActions();
                break;
            case "admin":
                performAdminActions();
                break;
        }
    }

    private static void performStudentActions() {
        while (true) {
        	System.out.println("");
        	System.out.println("Student Menu");
        	Helper.line(20, "=");
            System.out.println("1. Register for activity");
            System.out.println("2. View all activities");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    registerForActivity();
                    break;
                case 2:
                    viewAllActivities();
                    break;
                case 3:
                    logout();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void performTeacherActions() {
        while (true) {
        	System.out.println("");
        	System.out.println("Teacher Menu");
        	Helper.line(20, "=");
            System.out.println("1. Add activity");
            System.out.println("2. Delete activity");
            System.out.println("3. View all activities");
            System.out.println("4. Add attendance");
            System.out.println("5. Delete attendance");
            System.out.println("6. View all attendances");
            System.out.println("7. Add time slot");
            System.out.println("8. Delete time slot");
            System.out.println("9. View all time slots");
            System.out.println("10. Approve registration");
            System.out.println("11. Reject registration");
            System.out.println("12. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    addActivity();
                    break;
                case 2:
                    deleteActivity();
                    break;
                case 3:
                    viewAllActivities();
                    break;
                case 4:
                    addAttendance();
                    break;
                case 5:
                    deleteAttendance();
                    break;
                case 6:
                    viewAllAttendances();
                    break;
                case 7:
                    addTimeSlot();
                    break;
                case 8:
                    deleteTimeSlot();
                    break;
                case 9:
                	System.out.print("Enter the activity name to view time slots for: ");
                    String activityName = scanner.nextLine();
                    Activity activity = findActivityByName(activityName);
                    if (activity != null) {
                        viewAllTimeSlotsForActivity(activity);
                    } else {
                        System.out.println("Activity not found. Try again.");
                    }
       
                    break;
                case 10:
                    approveRegistration();
                    break;
                case 11:
                    rejectRegistration();
                    break;
                case 12:
                    logout();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void performAdminActions() {
        while (true) {
        	System.out.println("");
        	System.out.println("Admin Menu");
        	Helper.line(20, "=");
            System.out.println("1. Add user");
            System.out.println("2. Delete user");
            System.out.println("3. View all users");
            System.out.println("4. Add activity");
            System.out.println("5. Delete activity");
            System.out.println("6. View all activities");
            System.out.println("7. Add registration");
            System.out.println("8. Delete registration");
            System.out.println("9. View all registrations");
            System.out.println("10. Approve registration");
            System.out.println("11. Reject registration");
            System.out.println("12. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    viewAllUsers();
                    break;
                case 4:
                    addActivity();
                    break;
                case 5:
                    deleteActivity();
                    break;
                case 6:
                    viewAllActivities();
                    break;
                case 7:
                    addRegistration();
                    break;
                case 8:
                    deleteRegistration();
                    break;
                case 9:
                    viewAllRegistrations();
                    break;
                case 10:
                    approveRegistration();
                    break;
                case 11:
                    rejectRegistration();
                    break;
                case 12:
                    logout();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // methods for student actions

    private static void registerForActivity() {
        viewAllActivities();
        System.out.print("Enter the activity name to register for: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity != null) {
            controller.registerForActivity(currentUser, activity);
            System.out.println("Registered for activity successfully!");
        } else {
            System.out.println("Activity not found. Try again.");
        }
    }

    // methods for teacher actions

    private static void addActivity() {
        System.out.print("Enter activity name: ");
        String name = scanner.nextLine();
        controller.addActivity(name);
        System.out.println("Activity added successfully!");
    }

    private static void deleteActivity() {
        viewAllActivities();
        System.out.print("Enter the activity name to delete: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity != null) {
            controller.removeActivity(activity);
            System.out.println("Activity deleted successfully!");
        } else {
            System.out.println("Activity not found. Try again.");
        }
    }

    private static void addAttendance() {
        System.out.print("Enter student username: ");
        String username = scanner.nextLine();
        User student = findUserByUsername(username);
        if (student == null) {
            System.out.println("Student not found. Try again.");
            return;
        }
        viewAllActivities();
        System.out.print("Enter the activity name to add attendance for: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity == null) {
            System.out.println("Activity not found. Try again.");
            return;
        }
        System.out.print("Enter attendance status (true for present, false for absent): ");
        boolean present = scanner.nextBoolean();
        scanner.nextLine(); // consume newline
        controller.addAttendance(student, activity, present);
        System.out.println("Attendance added successfully!");
    }

    private static void deleteAttendance() {
        viewAllAttendances();
        System.out.print("Enter student username: ");
        String username = scanner.nextLine();
        User student = findUserByUsername(username);
        if (student == null) {
            System.out.println("Student not found. Try again.");
            return;
        }
        System.out.print("Enter the activity name to delete attendance for: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity == null) {
            System.out.println("Activity not found. Try again.");
            return;
        }
        Attendance attendance = findAttendanceByStudentAndActivity(student, activity);
        if (attendance == null) {
            System.out.println("Attendance not found. Try again.");
            return;
        }
        controller.removeAttendance(attendance);
        System.out.println("Attendance deleted successfully!");
    }

    private static void addTimeSlot() {
        viewAllActivities();
        System.out.print("Enter the activity name to add a time slot for: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity == null) {
            System.out.println("Activity not found. Try again.");
            return;
        }
        System.out.print("Enter start time (format: yyyy-MM-dd HH:mm): ");
        String start = scanner.nextLine();
        System.out.print("Enter end time (format: yyyy-MM-dd HH:mm): ");
        String end = scanner.nextLine();
        controller.addTimeSlot(activity, LocalDateTime.parse(start, formatter), LocalDateTime.parse(end, formatter));
        System.out.println("Time slot added successfully!");
    }

    private static void deleteTimeSlot() {
        viewAllActivities();
        System.out.print("Enter the activity name to delete a time slot from: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity == null) {
            System.out.println("Activity not found. Try again.");
            return;
        }
        viewAllTimeSlotsForActivity(activity);
        System.out.print("Enter start time of the time slot to delete (format: yyyy-MM-dd HH:mm): ");
        String start = scanner.nextLine();
        TimeSlot timeSlot = findTimeSlotByStart(activity, LocalDateTime.parse(start, formatter));
        if (timeSlot == null) {
            System.out.println("Time slot not found. Try again.");
            return;
        }
        controller.removeTimeSlot(activity, timeSlot);
        System.out.println("Time slot deleted successfully!");
    }

    private static void approveRegistration() {
        viewAllRegistrations();
        System.out.print("Enter student username: ");
        String username = scanner.nextLine();
        User student = findUserByUsername(username);
        if (student == null) {
            System.out.println("Student not found. Try again.");
            return;
        }
        System.out.print("Enter the activity name to approve registration for: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity == null) {
            System.out.println("Activity not found. Try again.");
            return;
        }
        Registration registration = findRegistrationByStudentAndActivity(student, activity);
        if (registration == null) {
            System.out.println("Registration not found. Try again.");
            return;
        }
        controller.approveRegistration(registration);
        System.out.println("Registration approved successfully!");
    }

    private static void rejectRegistration() {
        viewAllRegistrations();
        System.out.print("Enter student username: ");
        String username = scanner.nextLine();
        User student = findUserByUsername(username);
        if (student == null) {
            System.out.println("Student not found. Try again.");
            return;
        }
        System.out.print("Enter the activity name to reject registration for: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity == null) {
            System.out.println("Activity not found. Try again.");
            return;
        }
        Registration registration = findRegistrationByStudentAndActivity(student, activity);
        if (registration == null) {
            System.out.println("Registration not found. Try again.");
            return;
        }
        controller.rejectRegistration(registration);
        System.out.println("Registration rejected successfully!");
    }

    // methods for admin actions

    private static void addUser() {
        String username = getUserInput("Enter username: ");
        String password = getUserInput("Enter password: ");
        String role = getUserRole();

        controller.addUser(username, password, role);
        System.out.println("User added successfully!");
    }

    private static void deleteUser() {
        String username = getUserInput("Enter the username to delete: ");
        User user = findUserByUsername(username);

        if (user != null) {
            controller.removeUser(user);
            System.out.println("User deleted successfully!");
        } else {
            System.out.println("User not found. Try again.");
        }
    }

    private static void addRegistration() {
        System.out.print("Enter student username: ");
        String username = scanner.nextLine();
        User student = findUserByUsername(username);
        if (student == null) {
            System.out.println("Student not found. Try again.");
            return;
        }
        viewAllActivities();
        System.out.print("Enter the activity name to register for: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity != null) {
            controller.registerForActivity(student, activity);
            System.out.println("Registration added successfully!");
        } else {
            System.out.println("Activity not found. Try again.");
        }
    }

    private static void deleteRegistration() {
        viewAllRegistrations();
        System.out.print("Enter student username: ");
        String username = scanner.nextLine();
        User student = findUserByUsername(username);
        if (student == null) {
            System.out.println("Student not found. Try again.");
            return;
        }
        System.out.print("Enter the activity name to delete registration for: ");
        String activityName = scanner.nextLine();
        Activity activity = findActivityByName(activityName);
        if (activity == null) {
            System.out.println("Activity not found. Try again.");
            return;
        }
        Registration registration = findRegistrationByStudentAndActivity(student, activity);
        if (registration == null) {
            System.out.println("Registration not found. Try again.");
            return;
        }
        controller.removeRegistration(registration);
        System.out.println("Registration deleted successfully!");
    }

    // utility methods to view entities

    private static void viewAllUsers() {
        System.out.println("List of Users:");
        for (User user : controller.getUsers()) {
            System.out.println("Username: " + user.getUsername() + ", Role: " + user.getRole());
        }
    } 
    
    private static String getUserInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private static String getUserRole() {
        String role;
        do {
            role = getUserInput("Enter role (student/teacher/admin): ");
        } while (!isValidRole(role));
        return role;
    }
    
    private static boolean isValidRole(String role) {
        return role.equalsIgnoreCase("student") ||
               role.equalsIgnoreCase("teacher") ||
               role.equalsIgnoreCase("admin");
    }

    private static void viewAllActivities() {
        for (Activity activity : controller.getActivities()) {
            System.out.println("Activity name: " + activity.getName());
        }
    }

    private static void viewAllRegistrations() {
        for (Registration registration : controller.getRegistrations()) {
            System.out.println("Student username: " + registration.getStudent().getUsername() +
                               ", Activity name: " + registration.getActivity().getName() +
                               ", Status: " + registration.getStatus());
        }
    }

    private static void viewAllAttendances() {
        for (Attendance attendance : controller.getAttendances()) {
            System.out.println("Student username: " + attendance.getStudent().getUsername() +
                               ", Activity name: " + attendance.getActivity().getName() +
                               ", Present: " + attendance.isPresent());
        }
    }

    private static void viewAllTimeSlotsForActivity(Activity activity) {
        for (TimeSlot timeSlot : activity.getTimeSlots()) {
            System.out.println("Start time: " + formatter.format(timeSlot.getStart()) +
                               ", End time: " + formatter.format(timeSlot.getEnd()));
        }
    }

    // utility methods to find entities

    private static User findUserByUsername(String username) {
        for (User user : controller.getUsers()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private static Activity findActivityByName(String name) {
        for (Activity activity : controller.getActivities()) {
            if (activity.getName().equals(name)) {
                return activity;
            }
        }
        return null;
    }

    private static Registration findRegistrationByStudentAndActivity(User student, Activity activity) {
        for (Registration registration : controller.getRegistrations()) {
            if (registration.getStudent().equals(student) && registration.getActivity().equals(activity)) {
                return registration;
            }
        }
        return null;
    }

    private static Attendance findAttendanceByStudentAndActivity(User student, Activity activity) {
        for (Attendance attendance : controller.getAttendances()) {
            if (attendance.getStudent().equals(student) && attendance.getActivity().equals(activity)) {
                return attendance;
            }
        }
        return null;
    }

    private static TimeSlot findTimeSlotByStart(Activity activity, LocalDateTime start) {
        for (TimeSlot timeSlot : activity.getTimeSlots()) {
            if (timeSlot.getStart().equals(start)) {
                return timeSlot;
            }
        }
        return null;
    }

    private static void logout() {
        currentUser = null;
        System.out.println("Logged out successfully!");
    }
}
