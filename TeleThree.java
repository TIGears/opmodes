package org.firstinspires.ftc.robotcontroller.FourtyThree;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Gears on 1/7/17.
 */

@TeleOp(name="4356 Teleop", group="4356")

public class TeleThree extends OpMode {
    DcMotor leftDrive, rightDrive, gavinator, shooter1, shooter2;

    @Override
    public void init() {
        leftDrive = hardwareMap.dcMotor.get("leftDrive");
        rightDrive = hardwareMap.dcMotor.get("rightDrive");
        gavinator = hardwareMap.dcMotor.get("gavinator");
        shooter1 = hardwareMap.dcMotor.get("shooter1");
        shooter2 = hardwareMap.dcMotor.get("shooter2");
    }

    @Override
    public void loop() {
        leftDrive.setPower(gamepad1.left_stick_y);
        rightDrive.setPower(-gamepad1.right_stick_y);
        if (gamepad2.a) {
            gavinator.setPower(-1);
        } else if (gamepad2.b) {
            gavinator.setPower(1);
        } else {
            gavinator.setPower(0);
        }
        if (gamepad2.left_trigger > 0) {
            shooter1.setPower(gamepad2.left_trigger);
            shooter2.setPower(gamepad2.left_trigger);
        } else {
            shooter1.setPower(-gamepad2.right_trigger);
            shooter2.setPower(-gamepad2.right_trigger);
        }
    }
}
