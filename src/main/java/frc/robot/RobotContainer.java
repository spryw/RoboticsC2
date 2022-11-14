// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.drivetrain.Drivetrain;
import frc.robot.commands.drivetrain.TankDrive;
import frc.robot.commands.indexer.Indexer;
import frc.robot.commands.intake.Intake;
import frc.robot.commands.intake.IntakeSequence;
import frc.robot.commands.shooter.Shooter;
import frc.robot.commands.shooter.ShooterSequence;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final PneumaticHub ph = new PneumaticHub(Constants.PNUEMATICS_ID);
  
  private final Drivetrain drivetrain = new Drivetrain();
  private final Indexer indexer = new Indexer();
  private final Intake intake = new Intake();
  private final Shooter shooter = new Shooter();

  private final XboxController controller = new XboxController(Constants.DRIVER_CONTROLLER_PORT);

  private final TankDrive tankDrive = new TankDrive(drivetrain, controller);
  private final ShooterSequence shooterSequence = new ShooterSequence(indexer, shooter);
  private final IntakeSequence intakeSequence = new IntakeSequence(intake, indexer);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    drivetrain.setDefaultCommand(tankDrive);

    ph.enableCompressorDigital();
  
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    new JoystickButton(controller, XboxController.Button.kX.value)
    .whileActiveContinuous(intakeSequence);

    new JoystickButton(controller, XboxController.Button.kA.value)
    .whileActiveContinuous(shooterSequence);
  }
}
