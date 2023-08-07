import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private User user1;
	private User user2;
	private User user3;
	private Activity activity1;
	private Activity activity2;
	private Activity activity3;
	private Attendance attendance1;
	private Attendance attendance2;
	private Attendance attendance3;
	private Registration status1;
	private Registration status2;
	private Registration status3;
	
	
	private ArrayList<User> userList;
	private ArrayList<Activity> activityList;
	private ArrayList<Attendance> attendanceList;
	private ArrayList<Registration> ApprovalStatusList;
	
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		user1 = new User("test1","123","student");
		user2 = new User("123456789abc987654321","123456789abc987654321","student");
		user3 = new User("test3","123","janitor");
		activity1 = new Activity("Chess");
		activity2 = new Activity("Badminton");
		activity3 = new Activity("Volleyball");
		attendance1 = new Attendance(user1, activity2, true);
		attendance2 = new Attendance(user2, activity3, true);
		attendance3 = new Attendance(user2, activity3, true);
		
		userList = new ArrayList<User>();
		activityList = new ArrayList<Activity>();
		attendanceList = new ArrayList<Attendance>();
		ApprovalStatusList= new ArrayList<Registration>();
	}
	
	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void testAddUser() {
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		userList.add(user1);
		assertEquals("check that the user arraylist size is 1", 1,userList.size());
		assertSame("check that the user is added", user1,userList.get(0));
		
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		userList.add(user2);
		assertEquals("check that the user arraylist size is 2", 2,userList.size());
		assertSame("check that the user is added", user2,userList.get(1));
		
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		userList.add(user3);
		assertEquals("check that the user arraylist size is 3", 3,userList.size());
		assertSame("check that the user is added", user3,userList.get(2));
	}
	
	@Test
	public void testViewAllUser() {
		
		assertNotNull("Check if the arraylist still exist even though empty", userList);
		
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		userList.add(user1);
		assertEquals("check that the user arraylist size is 2", 1,userList.size());
		assertSame("check that the user is added into the arraylist according to input", user1,userList.get(0));
		
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		userList.add(user3);
		assertEquals("check that the user arraylist size is 2", 2,userList.size());
		assertSame("check that the user is added into the arraylist according to input", user3,userList.get(1));
	}
	
	@Test
	public void testDeleteUser() {
		
		userList.add(user1);
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		userList.remove(user1);
		assertEquals("check that the user arraylist size is 0", 0,userList.size());
		
		userList.add(user2);
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		userList.remove(user2);
		assertEquals("check that the user arraylist size is 0", 0,userList.size());
		
		
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		userList.remove(user3);
		assertEquals("check that the user arraylist size is 0", 0,userList.size());
	}
	
	@Test
	public void testAddAttendance() {
		assertNotNull("Check if there is a valid attendance arraylist to add to", attendanceList);
		attendanceList.add(attendance1);
		assertEquals("check that the attendance arraylist size is 1", 1,attendanceList.size());
		assertSame("check that the attendance is added", attendance1,attendanceList.get(0));
		
		assertNotNull("Check if there is a valid attendance arraylist to add to", attendanceList);
		attendanceList.add(attendance2);
		assertEquals("check that the attendance arraylist size is 2", 2,attendanceList.size());
		assertSame("check that the attendance is added", attendance2,attendanceList.get(1));
		
		assertNotNull("Check if there is a valid attendance arraylist to add to", attendanceList);
		attendanceList.add(attendance3);
		assertEquals("check that the attendance arraylist size is 3", 3,attendanceList.size());
		assertSame("check that the attendance is added", attendance3,attendanceList.get(2));
		
	
	}
	
	
	@Test
	public void testViewAllAttendance() {
		assertNotNull("Check if the arraylist still exist even though empty", attendanceList);
		
		assertNotNull("Check if there is a valid attendance arraylist to add to", attendanceList);
		attendanceList.add(attendance1);
		assertEquals("check that the attendance arraylist size is 2", 1,attendanceList.size());
		assertSame("check that the attendance is added into the arraylist according to input", attendance1,attendanceList.get(0));
		
		assertNotNull("Check if there is a valid attendance arraylist to add to", attendanceList);
		attendanceList.add(attendance2);
		assertEquals("check that the attendance arraylist size is 2", 2,attendanceList.size());
		assertSame("check that the attendance is added into the arraylist according to input", attendance2,attendanceList.get(1));
		
	}
	

	@Test
	public void testDeleteAttendance() {
		
		attendanceList.add(attendance1);
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		attendanceList.remove(attendance1);
		assertEquals("check that the user arraylist size is 0", 0,attendanceList.size());
		
		attendanceList.add(attendance2);
		assertNotNull("Check if there is a valid user arraylist to add to", attendanceList);
		attendanceList.remove(attendance2);
		assertEquals("check that the user arraylist size is 0", 0,attendanceList.size());
		
		
		assertNotNull("Check if there is a valid user arraylist to add to", attendanceList);
		attendanceList.remove(attendance3);
		assertEquals("check that the user arraylist size is 0", 0,attendanceList.size());
	}
	 
	@Test
	public void testAddActivity() {
		assertNotNull("Check if there is a valid attendance arraylist to add to", activityList);
		activityList.add(activity1);
		assertEquals("check that the activity arraylist size is 1", 1,activityList.size());
		assertSame("check that the activity is added", activity1,activityList.get(0));
		
		assertNotNull("Check if there is a valid activity arraylist to add to", activityList);
		activityList.add(activity2);
		assertEquals("check that the activity arraylist size is 2", 2,activityList.size());
		assertSame("check that the activity is added", activity2,activityList.get(1));
		
		assertNotNull("Check if there is a valid activity arraylist to add to", activityList);
		activityList.add(activity3);
		assertEquals("check that the activity arraylist size is 3", 3,activityList.size());
		assertSame("check that the activity is added", activity3,activityList.get(2));
		
	
	}
	@Test
	public void testViewAddActivity() {
		assertNotNull("Check if the arraylist still exist even though empty", activityList);
		
		assertNotNull("Check if there is a valid activity arraylist to add to", activityList);
		activityList.add(activity1);
		assertEquals("check that the activity arraylist size is 2", 1,activityList.size());
		assertSame("check that the activity is added into the arraylist according to input", activity1,activityList.get(0));
		
		assertNotNull("Check if there is a valid activity arraylist to add to", activityList);
		activityList.add(activity2);
		assertEquals("check that the activity arraylist size is 2", 2,activityList.size());
		assertSame("check that the activity is added into the arraylist according to input", activity2,activityList.get(1));
		
	}
	@Test
	public void testDeleteActivity() {
		activityList.add(activity1);
		assertNotNull("Check if there is a valid activity arraylist to add to", activityList);
		activityList.remove(activity1);
		assertEquals("check that the activity arraylist size is 0", 0,activityList.size());
		
		activityList.add(activity2);
		assertNotNull("Check if there is a valid activity arraylist to add to", activityList);
		activityList.remove(activity2);
		assertEquals("check that the activity arraylist size is 0", 0,activityList.size());
		
		
		assertNotNull("Check if there is a valid activity arraylist to add to", activityList);
		activityList.remove(activity3);
		assertEquals("check that the user arraylist size is 0", 0,activityList.size());
	}
	
	@Test
	public void testAddApprovalStatus() {
		assertNotNull("Check if there is a valid Approval Status arraylist to add to", ApprovalStatusList);
		ApprovalStatusList.add(status1);
		assertEquals("check that the Approval Status arraylist size is 1", 1, ApprovalStatusList.size());
		assertSame("check that the Approval Status is added", status1, ApprovalStatusList.get(0));
		
		assertNotNull("Check if there is a valid Approval Status arraylist to add to", ApprovalStatusList);
		ApprovalStatusList.add(status2);
		assertEquals("check that the Approval Status arraylist size is 2", 2, ApprovalStatusList.size());
		assertSame("check that the Approval Status is added", status2, ApprovalStatusList.get(1));
		
		assertNotNull("Check if there is a valid Approval Status arraylist to add to", ApprovalStatusList);
		ApprovalStatusList.add(status3);
		assertEquals("check that the Approval Status arraylist size is 3", 3, ApprovalStatusList.size());
		assertSame("check that the Approval Status is added", status3, ApprovalStatusList.get(2));
		
	
	}
	
	
	@Test
	public void testViewApprovalStatus() {
		assertNotNull("Check if the arraylist still exist even though empty", ApprovalStatusList);
		
		assertNotNull("Check if there is a valid attendance arraylist to add to", ApprovalStatusList);
		ApprovalStatusList.add(status1);
		assertEquals("check that the Approval Status arraylist size is 2", 1,ApprovalStatusList.size());
		assertSame("check that the Approval Status is added into the arraylist according to input", status1, ApprovalStatusList.get(0));
		
		assertNotNull("Check if there is a valid Approval Status arraylist to add to", ApprovalStatusList);
		ApprovalStatusList.add(status2);
		assertEquals("check that the Approval Status arraylist size is 2", 2, ApprovalStatusList.size());
		assertSame("check that the Approval Status is added into the arraylist according to input", status2, ApprovalStatusList.get(1));
		
		assertNotNull("Check if there is a valid Approval Status arraylist to add to", ApprovalStatusList);
		ApprovalStatusList.add(status3);
		assertEquals("check that the Approval Status arraylist size is 2", 3, ApprovalStatusList.size());
		assertSame("check that the Approval Status is added into the arraylist according to input", status3, ApprovalStatusList.get(2));
		
	}
	

	@Test
	public void testDeleteApprovalStatus() {
		
		ApprovalStatusList.add(status1);
		assertNotNull("Check if there is a valid user arraylist to add to", userList);
		ApprovalStatusList.remove(status1);
		assertEquals("check that the user arraylist size is 0", 0, ApprovalStatusList.size());
		
		ApprovalStatusList.add(status2);
		assertNotNull("Check if there is a valid user arraylist to add to", ApprovalStatusList);
		ApprovalStatusList.remove(status2);
		assertEquals("check that the user arraylist size is 0", 0, ApprovalStatusList.size());
		
		assertNotNull("Check if there is a valid user arraylist to add to", ApprovalStatusList);
		ApprovalStatusList.remove(status3);
		assertEquals("check that the user arraylist size is 0", 0,ApprovalStatusList.size());
	}

	
	@After
	public void tearDown() throws Exception {
	}

	

}
