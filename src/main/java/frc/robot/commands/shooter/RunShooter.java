package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunShooter extends CommandBase {
    private final Shooter shooter;

    public RunShooter(Shooter shooter) {
        this.shooter = shooter;

        addRequirements(shooter);
    }

    @Override
    public void initialize() {
        double shooterSpeed = 0.25;
        shooter.setFrontPercent(shooterSpeed);
        shooter.setRearPercent(shooterSpeed);
    }

    @Override
    public void end(boolean isFinished) {
        shooter.setFrontPercent(0);
        shooter.setRearPercent(0);
    }
}
