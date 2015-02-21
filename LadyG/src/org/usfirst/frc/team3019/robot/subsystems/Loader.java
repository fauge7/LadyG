package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.Robot;
import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.Load;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Loader extends Subsystem {

	Talon window;
	Talon bb1;
	Talon bb2;
	public Loader() {
		// TODO Auto-generated constructor stub
		super();
		window = new Talon(RobotMap.Loader_Window);
		bb1 = new Talon(RobotMap.Loader_BB_1);
		bb2 = new Talon(RobotMap.Loader_BB_2);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Load());
	}
	public void updateLoaderSpeed(){
		if(Robot.oi.load.get()){
			bb1.set(-.85);
			bb2.set(.85);		
		}
		else if(Robot.oi.spit.get()){
			bb1.set(.85);
			bb2.set(-.85);
		}
		else{
			bb1.set(0);
			bb2.set(0);	
		}
		window.set(Robot.oi.stick2.getRawAxis(5) * .8);
	}

}
