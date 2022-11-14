package frc.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.commands.indexer.IndexUntilBeam;
import frc.robot.commands.indexer.Indexer;

public class IntakeSequence extends ParallelCommandGroup {
    public IntakeSequence(Intake intake, Indexer indexer) {
        addCommands(
            new RunIntake(intake),

            new IndexUntilBeam(indexer)
        );
    }
}
