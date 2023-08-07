
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}

class Activity {
    private String name;
    private List<TimeSlot> timeSlots;

    public Activity(String name) {
        this.name = name;
        this.timeSlots = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<TimeSlot> getTimeSlots() {
        return timeSlots;
    }
}

class Registration {
    private User student;
    private Activity activity;
    private String status;

    public Registration(User student, Activity activity) {
        this.student = student;
        this.activity = activity;
        this.status = "pending";
    }

    public User getStudent() {
        return student;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class Attendance {
    private User student;
    private Activity activity;
    private boolean present;

    public Attendance(User student, Activity activity, boolean present) {
        this.student = student;
        this.activity = activity;
        this.present = present;
    }

    public User getStudent() {
        return student;
    }

    public Activity getActivity() {
        return activity;
    }

    public boolean isPresent() {
        return present;
    }
}

class TimeSlot {
    private LocalDateTime start;
    private LocalDateTime end;

    public TimeSlot(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }
}

class Controller {
    private List<User> users = new ArrayList<>();
    private List<Activity> activities = new ArrayList<>();
    private List<Registration> registrations = new ArrayList<>();
    private List<Attendance> attendances = new ArrayList<>();
    
    public Controller() {
    	
    	User student1 = new User("student123", "123", "student");
    	User student2 = new User("harry", "123", "student");
    	User student3 = new User("peter parker", "123", "student");
    	users.add(student1);
        users.add(student2);
        users.add(student3);
    	
    
        users.add(new User("admin123", "123", "admin"));
        users.add(new User("teacher123", "123", "teacher"));
        
        Activity activity = new Activity("Drama");
        activities.add(new Activity("Soccer/Football"));
        activities.add(new Activity("Badminton"));
        activities.add(new Activity("Basketball"));
        activities.add(new Activity("Volleyball"));
        activities.add(new Activity("NCC"));
        activities.add(new Activity("NPCC"));
        activities.add(new Activity("Red Cross"));
        activities.add(new Activity("Military Band"));
        activities.add(new Activity("Dance"));
        activities.add(activity);
        activities.add(new Activity("Choir"));
        activities.add(new Activity("String Ensemble"));
        
        registrations.add(new Registration(student1,activity));
        registrations.add(new Registration(student2,activity));
        registrations.add(new Registration(student3,activity));
        
        attendances.add(new Attendance(student1, activity, true));
        attendances.add(new Attendance(student2, activity, true));
        attendances.add(new Attendance(student3, activity, false));

		String timeStart1 = "2023-08-07 12:00";
		String timeEnd1 = "2023-08-07 16:00";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTimeStart1 = LocalDateTime.parse(timeStart1, formatter);
		LocalDateTime dateTimeEnd1 = LocalDateTime.parse(timeEnd1, formatter);
		TimeSlot timeslot1 = new TimeSlot(dateTimeStart1, dateTimeEnd1);

		String timeStart2 = "2023-08-07 12:00";
		String timeEnd2 = "2023-08-07 16:00";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTimeStart2 = LocalDateTime.parse(timeStart2, formatter2);
		LocalDateTime dateTimeEnd2 = LocalDateTime.parse(timeEnd2, formatter2);
		TimeSlot timeslot2 = new TimeSlot(dateTimeStart2, dateTimeEnd2);

		String timeStart3 = "2023-08-07 12:00";
		String timeEnd3 = "2023-08-07 16:00";
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTimeStart3 = LocalDateTime.parse(timeStart3, formatter3);
		LocalDateTime dateTimeEnd3 = LocalDateTime.parse(timeEnd3, formatter3);
		TimeSlot timeslot3 = new TimeSlot(dateTimeStart3, dateTimeEnd3);

		activity.getTimeSlots().add(timeslot1);
		activity.getTimeSlots().add(timeslot2);
		activity.getTimeSlots().add(timeslot3);

        
    }
    
    

    public void addUser(String username, String password, String role) {
        User user = new User(username, password, role);
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void addActivity(String name) {
        Activity activity = new Activity(name);
        activities.add(activity);
    }

    public void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public void registerForActivity(User student, Activity activity) {
        Registration registration = new Registration(student, activity);
        registrations.add(registration);
    }

    public void removeRegistration(Registration registration) {
        registrations.remove(registration);
    }

    public void approveRegistration(Registration registration) {
        registration.setStatus("approved");
    }

    public void rejectRegistration(Registration registration) {
        registration.setStatus("rejected");
    }

    public void addAttendance(User student, Activity activity, boolean present) {
        Attendance attendance = new Attendance(student, activity, present);
        attendances.add(attendance);
    }

    public void removeAttendance(Attendance attendance) {
        attendances.remove(attendance);
    }

    public void addTimeSlot(Activity activity, LocalDateTime start, LocalDateTime end) {
        TimeSlot timeSlot = new TimeSlot(start, end);
        activity.getTimeSlots().add(timeSlot);
    }

    public void removeTimeSlot(Activity activity, TimeSlot timeSlot) {
        activity.getTimeSlots().remove(timeSlot);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }
}

