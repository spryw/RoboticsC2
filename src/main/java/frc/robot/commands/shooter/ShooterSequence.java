package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.commands.indexer.Indexer;
import frc.robot.commands.indexer.RunIndexer;

public class ShooterSequence extends ParallelCommandGroup {
    public ShooterSequence(Indexer indexer, Shooter shooter) {
        addCommands(
            new RunIndexer(indexer),

            new RunShooter(shooter)
        );
    }


    
}
