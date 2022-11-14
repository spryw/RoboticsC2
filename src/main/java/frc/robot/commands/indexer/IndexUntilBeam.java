package frc.robot.commands.indexer;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class IndexUntilBeam extends CommandBase {
    private final Indexer indexer;

    public IndexUntilBeam(Indexer indexer) {
        this.indexer = indexer;
        
        addRequirements(indexer);
    }

    @Override
    public void initialize() {
        indexer.setTopPercentage(0.5);
        indexer.setBottomPercentage(0.5);
    }
    public boolean isFinished() {
        return !indexer.isTopBeamBroken();
    }

    @Override
    public void end(boolean isFinished) {
        indexer.setTopPercentage(0);
        indexer.setBottomPercentage(0);
    }
}
