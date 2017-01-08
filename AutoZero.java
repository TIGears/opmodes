package org.firstinspires.ftc.robotcontroller.FourtyThree;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Gears on 1/7/17.
 */

@Autonomous(name="4093 Autonomous", group="4093")

public class AutoZero extends OpMode
{
    DcMotor leftDrive,rightDrive/*,gavinator,scissor,claw1,claw2*/;
    Servo pusher;
    int driveTime = 2;
    @Override
    public void init()
    {
        leftDrive = hardwareMap.dcMotor.get("leftDrive");
        rightDrive = hardwareMap.dcMotor.get("rightDrive");
        //gavinator = hardwareMap.dcMotor.get("gavinator");
        //scissor = hardwareMap.dcMotor.get("scissor");
        //claw1 = hardwareMap.dcMotor.get("claw1");
        //claw2 = hardwareMap.dcMotor.get("claw2");
        //pusher = hardwareMap.servo.get("pusher");
    }

    @Override
    public void loop()
    {
        if (this.time <= driveTime)
        {
            rightDrive.setPower(-1);
            leftDrive.setPower(1);
        }
        else
        {
            rightDrive.setPower(0);
            leftDrive.setPower(0);
        }

    }
}
