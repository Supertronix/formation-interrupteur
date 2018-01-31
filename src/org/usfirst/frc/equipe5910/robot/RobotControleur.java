package org.usfirst.frc.equipe5910.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
		
		String trajetChoisi = "";
		if (interrupteur0.get() == true) //Rouge
		{
			if (interrupteur1.get() == true && interrupteur2.get() == true && interrupteur3.get() == true) //WTF
			{
				trajetChoisi = " ???";
			}
			else if (interrupteur1.get() == false && interrupteur2.get() == false && interrupteur3.get() == false) // No move
			{
				trajetChoisi = " No move";
			}
			else if (interrupteur1.get() == true) 
			{
				trajetChoisi = " R1";
			}
			else if (interrupteur2.get() == true) 
			{
				trajetChoisi = " R2";
			}
			else if (interrupteur3.get() == true) 
			{
				trajetChoisi = " R3";
			}
		}
		else // Bleu
		{
			if (interrupteur1.get() == true && interrupteur2.get() == true && interrupteur3.get() == true) //WTF
			{
				trajetChoisi = " ???";
			}
			else if (interrupteur1.get() == false && interrupteur2.get() == false && interrupteur3.get() == false) // No move
			{
				trajetChoisi = " No move";
			}
			else if (interrupteur1.get() == true) 
			{
				trajetChoisi = " B1";
			}
			else if (interrupteur2.get() == true) 
			{
				trajetChoisi = "B2";
			}
			else if (interrupteur3.get() == true) 
			{
				trajetChoisi = " B3";	
			}
		}
		SmartDashboard.putString("TRAJET CHOISI", trajetChoisi);
		System.out.println("TRAJET CHOISI : " + trajetChoisi);		
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
