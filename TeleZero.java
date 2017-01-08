package org.firstinspires.ftc.robotcontroller.FourtyThree;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Gears on 1/7/17.
 */

@TeleOp(name="4093 Teleop", group="4093")

public class TeleZero extends OpMode
{
    DcMotor leftDrive,rightDrive,gavinator,scissor,claw1,claw2;
    //Servo pusher;
    @Override
    public void init()
    {
        leftDrive = hardwareMap.dcMotor.get("leftDrive");
        rightDrive = hardwareMap.dcMotor.get("rightDrive");
        gavinator = hardwareMap.dcMotor.get("gavinator");
        scissor = hardwareMap.dcMotor.get("scissor");
        claw1 = hardwareMap.dcMotor.get("claw1");
        claw2 = hardwareMap.dcMotor.get("claw2");
        //pusher = hardwareMap.servo.get("pusher");
    }

    @Override
    public void loop()
    {
        leftDrive.setPower(-gamepad1.left_stick_y);
        rightDrive.setPower(gamepad1.right_stick_y);
        if (gamepad2.a)
        {
            gavinator.setPower(-1);
        }
        else if (gamepad2.b)
        {
            gavinator.setPower(.5);
        }
        else {gavinator.setPower(0);}
        scissor.setPower(gamepad2.left_stick_y);
        claw1.setPower(-gamepad2.right_stick_y/2);
        claw2.setPower(gamepad2.right_stick_y/2);
    }
}

