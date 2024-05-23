package i90;

import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.common.models.inputparams.SendInputParams;
import me0.AbstractC23280z4;

/* renamed from: i90.a */
/* loaded from: classes6.dex */
public abstract class AbstractC20435a {
    /* renamed from: a */
    public static final CameraInputParams m106442a(int i11) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 0;
        cameraInputParams.f41101T = true;
        cameraInputParams.f41095N = true;
        cameraInputParams.f41133u = AbstractC23280z4.m120291C(i11);
        cameraInputParams.f41119l0 = new SendInputParams(2);
        return cameraInputParams;
    }

    /* renamed from: b */
    public static final CameraInputParams m106443b(int i11) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 2;
        cameraInputParams.f41091J = true;
        cameraInputParams.f41108a0 = false;
        cameraInputParams.f41093L = true;
        cameraInputParams.f41102U = true;
        cameraInputParams.f41133u = AbstractC23280z4.m120291C(i11);
        cameraInputParams.f41119l0 = new SendInputParams(2);
        return cameraInputParams;
    }

    /* renamed from: c */
    public static final CameraInputParams m106444c(int i11) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 0;
        cameraInputParams.f41133u = AbstractC23280z4.m120291C(i11);
        if (i11 == 5) {
            cameraInputParams.f41088G = true;
        }
        return cameraInputParams;
    }

    /* renamed from: d */
    public static final CameraInputParams m106445d(String str, String str2, int i11) {
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 4;
        cameraInputParams.f41137w = str;
        cameraInputParams.f41141y = str2;
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 == 4) {
                    cameraInputParams.f41086E = true;
                    cameraInputParams.f41105X = "6";
                }
            } else {
                cameraInputParams.f41089H = true;
            }
        } else {
            cameraInputParams.f41088G = true;
        }
        return cameraInputParams;
    }
}
