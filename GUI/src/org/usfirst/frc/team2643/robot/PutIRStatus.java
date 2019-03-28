package org.usfirst.frc.team2643.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PutIRStatus {
	public void ir00(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("Left Bank (1)", true);
		}
		else {
			SmartDashboard.putBoolean("Left Bank (0)", false);
		}
	}
	
	public void ir01(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(1)", true);
		}
		else {
			SmartDashboard.putBoolean("(1)", false);
		}
	}
	
	public void ir02(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(2)", true);
		}
		else {
			SmartDashboard.putBoolean("(2)", false);
		}
	}
	
	public void ir03(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(3)", true);
		}
		else {
			SmartDashboard.putBoolean("(3)", false);
		}
	}
	
	public void ir04(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(4)", true);
		}
		else {
			SmartDashboard.putBoolean("(4)", false);
		}
	}
	
	public void ir05(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(5)", true);
		}
		else {
			SmartDashboard.putBoolean("(5)", false);
		}
	}
	
	public void ir06(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("Right Bank (6)", true);
		}
		else {
			SmartDashboard.putBoolean("Right Bank (6)", false);
		}
	}
	
	public void ir07(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(7)", true);
		}
		else {
			SmartDashboard.putBoolean("(7)", false);
		}
	}
	
	public void ir08(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(8)", true);
		}
		else {
			SmartDashboard.putBoolean("(8)", false);
		}
	}
	
	public void ir09(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(9)", true);
		}
		else {
			SmartDashboard.putBoolean("(9)", false);
		}
	}
	
	public void ir10(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(10)", true);
		}
		else {
			SmartDashboard.putBoolean("(10)", false);
		}
	}
	
	public void ir11(boolean ir) {
		if(ir) {
			SmartDashboard.putBoolean("(11)", true);
		}
		else {
			SmartDashboard.putBoolean("(11)", false);
		}
	}
	
}
