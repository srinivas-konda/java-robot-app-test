package com.robot.test;


import com.robot.test.impl.help.PrototypeRobo;
import com.robot.test.service.RoboService;
/*
 * This is the class Test for
 *  AppTest
 */
public class RoboMainTest {
	private RoboService robo;
	
	//private static ICalculator iCal;
	
	@BeforeClass
	public static void initApp(){
		robo= new PrototypeRobo();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is executed before each Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is exceuted after each Test");
	}

	@Test
	public void roboTest() {
		robo = new PrototypeRobo();
		robo.walk(3.5);
		robo.walkAndCarry(1,13);
		robo.setCharging(60);
		
		//Assert.assertTrue("Failed", robo.walk(4));
	
	}

}
