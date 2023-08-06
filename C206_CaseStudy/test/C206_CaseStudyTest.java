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

	@Before
	public void setUp() throws Exception {
		user1 = new User("user1","123","admin");
		user2 = new User("user2","123","teacher");
		user3 = new User("user3","123","student");
		activity1 = new Activity("Chess");
		activity2 = new Activity("Badminton");
		activity3 = new Activity("Volleyball");
	}
	
	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@After
	public void tearDown() throws Exception {
	}

	

}
