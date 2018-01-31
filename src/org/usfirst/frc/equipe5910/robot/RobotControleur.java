package org.usfirst.frc.equipe5910.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotControleur extends IterativeRobot {

	public static final int INTERRUPTEUR_DIGITAL_0 = 2;
	public static final int INTERRUPTEUR_DIGITAL_1 = 3;
	public static final int INTERRUPTEUR_DIGITAL_2 = 4;
	public static final int INTERRUPTEUR_DIGITAL_3 = 5;	
	
    DigitalInput interrupteur0 = new DigitalInput(INTERRUPTEUR_DIGITAL_0);
    DigitalInput interrupteur1 = new DigitalInput(INTERRUPTEUR_DIGITAL_1);
    DigitalInput interrupteur2 = new DigitalInput(INTERRUPTEUR_DIGITAL_2);
    DigitalInput interrupteur3 = new DigitalInput(INTERRUPTEUR_DIGITAL_3);	
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 * 
	 */
	@Override
	public void robotInit() {
		System.out.println("robotInit()");
	}

	/**
	 * This function is run once each time the robot enters autonomous mode
	 */
	@Override
	public void autonomousInit() {
		System.out.println("autonomousInit()");
		if (interrupteur0.get() == true) System.out.println("Rouge");
		else System.out.println("Bleu");
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		System.out.println("autonomousPeriodic()");
	}

	/**
	 * This function is called once each time the robot enters tele-operated
	 * mode
	 */
	@Override
	public void teleopInit() {
		System.out.println("teleopInit()");
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		System.out.println("teleopPeriodic()");
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		System.out.println("testPeriodic()");
	}
	
	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testInit() {
		System.out.println("testInit()");
	}
	
}
