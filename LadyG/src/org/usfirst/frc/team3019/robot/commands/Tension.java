package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Tension extends Command {

	boolean tensionDirection;
	public Tension(boolean tendir) {
		// TODO Auto-generated constructor stub
		requires(Robot.shooter);
		this.tensionDirection = tendir;
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		setTimeout(1.3);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if(tensionDirection)
			Robot.shooter.Tension();
		else
			Robot.shooter.unTension();
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
