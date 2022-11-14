package frc.robot.commands.intake;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
    private final TalonFX motor = new TalonFX(Constants.INTAKE_ID);
    private final Solenoid intakeSolenoid = new Solenoid(Constants.PNUEMATICS_ID, PneumaticsModuleType.REVPH, Constants.INTAKE_SOLENOID);

    public Intake() {}

    public void periodic() {}

    public void setPercentage(double percentOutput) {
        motor.set(ControlMode.PercentOutput, percentOutput);
    }

    public void intakeUp() {
        intakeSolenoid.set(false);
    }

    public void intakeDown() {
        intakeSolenoid.set(true);
    }
}
