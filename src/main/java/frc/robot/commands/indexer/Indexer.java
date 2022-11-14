package frc.robot.commands.indexer;

import javax.sound.sampled.SourceDataLine;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Indexer extends SubsystemBase {
    private final TalonFX bottomMotor = new TalonFX(Constants.INDEXER_BOTTOM_ID);
    private final TalonFX topMotor = new TalonFX(Constants.INDEXER_TOP_ID);
    private final DigitalInput topBeam = new DigitalInput(8);
    private final DigitalInput bottomBeam = new DigitalInput(9);

    public Indexer() {
        topMotor.setInverted(true);
        bottomMotor.setInverted(true);
    }

    public void periodic() {
        SmartDashboard.putBoolean("Top Beam Break", topBeam.get());
        SmartDashboard.putBoolean("Bottom Beam Break", bottomBeam.get());
    }

    public void setTopPercentage(double percentOutput) {
        topMotor.set(ControlMode.PercentOutput, percentOutput);
    }

    public void setBottomPercentage(double percentOutput) {
        bottomMotor.set(ControlMode.PercentOutput, percentOutput);
    }

    public boolean isTopBeamBroken() {
        return topBeam.get();
    }

    public boolean isBottomBeamBroken() {
        return bottomBeam.get();
    }
    
}
