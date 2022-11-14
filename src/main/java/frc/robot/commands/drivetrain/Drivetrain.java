package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import frc.robot.Constants;


public class Drivetrain extends SubsystemBase {
    private final TalonFX rightFront = new TalonFX(Constants.DRIVE_RIGHT_FRONT_ID);
    private final TalonFX rightBack = new TalonFX(Constants.DRIVE_RIGHT_BACK_ID);
    private final TalonFX leftFront = new TalonFX(Constants.DRIVE_LEFT_FRONT_ID);
    private final TalonFX leftBack = new TalonFX(Constants.DRIVE_LEFT_BACK_ID);

    public Drivetrain() {
        leftFront.setInverted(true);
        leftBack.setInverted(true);

        rightBack.follow(rightFront);
        leftBack.follow(leftFront);

        rightBack.setNeutralMode(NeutralMode.Brake);
        leftBack.setNeutralMode(NeutralMode.Brake);
    }
    
    public void periodic() {}

    public void setLeftPercent(double percentOutput) {
        leftFront.set(ControlMode.PercentOutput, percentOutput);
    }

    public void setRightPercent(double percentOutput) {
        rightFront.set(ControlMode.PercentOutput, percentOutput);
    }
}
