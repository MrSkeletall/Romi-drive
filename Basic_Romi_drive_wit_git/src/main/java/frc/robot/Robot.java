// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  private static final double kCountsPerRevolution = 1440.0;
  private static final double kWheelDiameterInch = 2.75591;

  private double startTime;

  private final Encoder leftEncoder = new Encoder(4, 5); 
  private final Encoder rightEncoder = new Encoder(6, 7);
  private final Spark leftMotor = new Spark(0); 
  private final Spark rightMotor = new Spark(1); 



  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

  @Override
  public void robotInit() {
    leftEncoder.reset();
    rightEncoder.reset();
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
    startTime = Timer.getFPGATimestamp();
  }

  @Override
  public void autonomousPeriodic() {
    double time = Timer.getFPGATimestamp();

    if (time - startTime < 3) {
      leftmotor.set(0.6);
      rightmotor.set(-0.6);
    } else {
      leftmotor.set(0);
      rightmotor.set(0);
    }
  }

  @Override
  public void teleopInit() {
    

  }

  @Override
  public void teleopPeriodic() {


  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
