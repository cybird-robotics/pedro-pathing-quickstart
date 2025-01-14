package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        DriveEncoderConstants.forwardTicksToInches = 0.0183;
        DriveEncoderConstants.strafeTicksToInches = 0.0189;
        DriveEncoderConstants.turnTicksToInches = 0.0097;

        DriveEncoderConstants.robot_Width = 15.125;
        DriveEncoderConstants.robot_Length = 13.875;

        DriveEncoderConstants.leftFrontEncoderDirection = Encoder.FORWARD;
        DriveEncoderConstants.rightFrontEncoderDirection = Encoder.FORWARD;
        DriveEncoderConstants.leftRearEncoderDirection = Encoder.FORWARD;
        DriveEncoderConstants.rightRearEncoderDirection = Encoder.FORWARD;
    }
}




