package org.firstinspires.ftc.robotcontroller.FourtyThree;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Gears on 8/30/16.
 */

@TeleOp(name="Servo Test", group="Tests")


public class ServoTest extends OpMode {
    Servo oneServo;
    @Override
    public void init() {
        oneServo = hardwareMap.servo.get("oneServo");
    }
    @Override
    public void loop() {
        oneServo.setPosition(gamepad1.right_trigger+gamepad1.left_trigger+gamepad1.left_stick_y+gamepad1.right_stick_y+gamepad1.left_stick_x+gamepad1.right_stick_x);
    }
}
