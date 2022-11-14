package frc.robot.commands.indexer;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIndexer extends CommandBase {
    private final Indexer indexer;

    public RunIndexer(Indexer indexer) {
        this.indexer = indexer;
        
        addRequirements(indexer);
    }

    @Override
    public void initialize() {
        indexer.setTopPercentage(0.5);
        indexer.setBottomPercentage(0.5);
    }

    @Override
    public void end(boolean isFinished) {
        indexer.setTopPercentage(0);
        indexer.setBottomPercentage(0);
    }
}
