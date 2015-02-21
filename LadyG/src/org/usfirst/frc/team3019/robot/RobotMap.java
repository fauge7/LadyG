package org.usfirst.frc.team3019.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	//joystick mappings
	public static final int Stick_1 = 0;
	public static final int Stick_2 = 1;
	public static final int FireButton = 1;
	
	//solinoid channels
	public static final int Arm_Lock_1 = 0;
	public static final int Arm_Lock_2 = 1;
	
	//pwm motor channels
	public static final int Talon_Drive_1 = 4;
	public static final int Talon_Drive_2 = 5;
	public static final int Talon_Drive_3 = 3;
	public static final int Talon_Drive_4 = 2;
	
	public static final int Loader_Window = 9;
	public static final int Loader_BB_1 = 7;
	public static final int Loader_BB_2 = 6;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	public static final int Shooter_1 = 2;
	public static final int Shooter_2 = 3;
    
	public static final int[] lowerThresh = {0,0,0};
	public static final int[] higherThresh = {0,0,0};
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
