package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {
    private final Intake intake;

    public RunIntake(Intake intake) {
        this.intake = intake;

        addRequirements(intake);
    }

    @Override
    public void initialize() {
        intake.setPercentage(0.75);
        intake.intakeDown();
    }

    @Override
    public void end(boolean isFinished) {
        intake.setPercentage(0);
        intake.intakeUp();
    }
}
