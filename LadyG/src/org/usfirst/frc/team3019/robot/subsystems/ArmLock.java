package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.LockArm;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ArmLock extends Subsystem{
	DoubleSolenoid soli;
	public ArmLock() {
		// TODO Auto-generated constructor stub
		super();
		soli = new DoubleSolenoid(RobotMap.Arm_Lock_1,RobotMap.Arm_Lock_2);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	public void toggle(boolean lock){
		if(lock){
            soli.set(DoubleSolenoid.Value.kOff);
            soli.set(DoubleSolenoid.Value.kForward);
        }else{
            soli.set(DoubleSolenoid.Value.kOff);
            soli.set(DoubleSolenoid.Value.kReverse);
        }
	}
	

}
