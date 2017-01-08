package org.firstinspires.ftc.robotcontroller.FourtyThree;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Gears on 1/7/17.
 */

@Autonomous(name="4356 Autonomous", group="4356")

public class AutoThree extends OpMode
{
    DcMotor leftDrive,rightDrive,gavinator,shooter1,shooter2;
    int driveTime = 10;
    @Override
    public void init()
    {
        leftDrive = hardwareMap.dcMotor.get("leftDrive");
        rightDrive = hardwareMap.dcMotor.get("rightDrive");
        gavinator = hardwareMap.dcMotor.get("gavinator");
        shooter1 = hardwareMap.dcMotor.get("shooter1");
        shooter2 = hardwareMap.dcMotor.get("shooter2");
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
