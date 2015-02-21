package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LockArm extends Command {

	boolean lock;
	
	public LockArm(boolean lock) {
		// TODO Auto-generated constructor stub
		requires(Robot.armLock);
		this.lock = lock;
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		if(lock)
			setTimeout(.3);
		else
			setTimeout(.5);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.armLock.toggle(lock);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
