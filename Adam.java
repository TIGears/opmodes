package org.firstinspires.ftc.robotcontroller.FourtyThree;

        import com.qualcomm.robotcore.eventloop.opmode.OpMode;
        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Gears on 8/30/16.
 */

@TeleOp(name="Single Motor Test", group="Tests")

public class Adam extends OpMode {
    DcMotor oneMotor;

    @Override
    public void init() {
        oneMotor = hardwareMap.dcMotor.get("oneMotor");
    }
    @Override
    public void loop() {
        oneMotor.setPower(gamepad1.left_stick_y);
    }
}



