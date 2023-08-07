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
	
	private ArrayList<User> userList;
	private ArrayList<Activity> activityList;
	
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
		
		userList = new ArrayList<User>();
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
	
	@After
	public void tearDown() throws Exception {
	}

	

}
