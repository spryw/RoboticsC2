package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import frc.robot.Constants;


public class Drivetrain extends SubsystemBase {
    private final TalonFX leftFront = new TalonFX(Constants.DRIVE_LEFT_FRONT_ID);
    private final TalonFX leftBack = new TalonFX(Constants.DRIVE_LEFT_BACK_ID);
    private final TalonFX rightFront = new TalonFX(Constants.DRIVE_RIGHT_FRONT_ID);
    private final TalonFX rightBack = new TalonFX(Constants.DRIVE_RIGHT_BACK_ID);

    public Drivetrain() {
        rightFront.setInverted(true);
        rightBack.setInverted(true);

        leftBack.follow(leftFront);
        rightBack.follow(rightFront);

        leftBack.setNeutralMode(NeutralMode.Brake);
        rightBack.setNeutralMode(NeutralMode.Brake);
    }
    
    public void periodic() {
        leftFront.set(ControlMode.PercentOutput, 0);
        rightFront.set(ControlMode.PercentOutput, 0);
    }

    public void setLeftPercent(double percentOutput) {
        rightFront.set(ControlMode.PercentOutput, percentOutput);
    }

    public void setRightPercent(double percentOutput) {
        leftFront.set(ControlMode.PercentOutput, percentOutput);
    }
}
