package org.usfirst.frc.team649.robot.subsystems;

import org.usfirst.frc.team649.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Victor;

public class Climb {
	Victor motor1, motor2;

	public Climb() {
		motor1 = new Victor(RobotMap.climb.motor1);
		motor2 = new Victor(RobotMap.climb.motor2);
	}

	public void setClimbMotor(double power) {
		motor1.set(power);
		motor2.set(power);
	}
}