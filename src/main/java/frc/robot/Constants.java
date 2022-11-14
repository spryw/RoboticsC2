// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int DRIVER_CONTROLLER_PORT = 0;

    public static final int DRIVE_RIGHT_FRONT_ID = 3;
    public static final int DRIVE_RIGHT_BACK_ID = 4;
    public static final int DRIVE_LEFT_FRONT_ID = 1;
    public static final int DRIVE_LEFT_BACK_ID = 2;
    public static final int INTAKE_ID = 5;
    public static final int INDEXER_BOTTOM_ID = 6;
    public static final int INDEXER_TOP_ID = 7;    
    public static final int SHOOTER_REAR_ID = 8;
    public static final int SHOOTER_FRONT_ID = 9;
    public static final int CLIMB_RIGHT_ID = 10;
    public static final int CLIMB_LEFT_ID = 11;
    public static final int PNUEMATICS_ID = 20;

    public static final int ARM_RECTRACT_SOLENOID_MAYBE = 0;
    public static final int ARM_RETRACT_SOLENOID_MAYBE = 1;
    public static final int HOOD_SOLENOID = 2;
    public static final int INTAKE_SOLENOID = 3;
}
