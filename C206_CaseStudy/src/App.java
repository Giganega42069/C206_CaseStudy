
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

