package frc.robot.commands.shooter;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Shooter extends SubsystemBase {
    private final TalonFX front = new TalonFX(Constants.SHOOTER_FRONT_ID);
    private final TalonFX rear = new TalonFX(Constants.SHOOTER_REAR_ID);

    public Shooter() {
        front.setInverted(true);
        rear.setInverted(true);
    }

    public void periodic() {
    }

    public void setFrontPercent(double percentOutput) {
        front.set(ControlMode.PercentOutput, percentOutput);
    }

    public void setRearPercent(double percentOutput) {
        rear.set(ControlMode.PercentOutput, percentOutput);
    }
}
