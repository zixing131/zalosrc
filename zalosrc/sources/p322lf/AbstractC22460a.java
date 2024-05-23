package p322lf;

import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.camera.common.models.inputparams.SendInputParams;
import fn0.AbstractC19074t;
import p346mb.C22969a;
import p346mb.C22970b;

/* renamed from: lf.a */
/* loaded from: classes3.dex */
public abstract class AbstractC22460a {
    /* renamed from: a */
    public static final CameraInputParams m116122a(C22969a c22969a) {
        AbstractC19074t.m100208f(c22969a, "<this>");
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 0;
        cameraInputParams.f41133u = 0;
        cameraInputParams.f41087F = true;
        cameraInputParams.f41100S = true;
        cameraInputParams.f41105X = "1";
        cameraInputParams.f41119l0 = new SendInputParams(1);
        cameraInputParams.f41131t = c22969a.m117719a();
        return cameraInputParams;
    }

    /* renamed from: b */
    public static final CameraInputParams m116123b(C22970b c22970b) {
        AbstractC19074t.m100208f(c22970b, "<this>");
        CameraInputParams cameraInputParams = new CameraInputParams();
        cameraInputParams.f41129s = 1;
        cameraInputParams.f41133u = 0;
        cameraInputParams.f41105X = "1";
        cameraInputParams.f41092K = true;
        cameraInputParams.f41119l0 = new SendInputParams(1, 1);
        cameraInputParams.f41131t = c22970b.f111713a;
        cameraInputParams.f41120m0 = c22970b.f111714b;
        return cameraInputParams;
    }
}
