package p322lf;

import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import fn0.AbstractC19074t;
import java.util.Arrays;

/* renamed from: lf.c */
/* loaded from: classes3.dex */
public abstract class AbstractC22462c {
    /* renamed from: a */
    public static final boolean m116125a(CameraInputParams cameraInputParams) {
        boolean z11;
        AbstractC19074t.m100208f(cameraInputParams, "<this>");
        int i11 = cameraInputParams.f41129s;
        int[] iArr = ZaloCameraView.f40829O2;
        boolean m116158j = AbstractC22470k.m116158j(i11, Arrays.copyOf(iArr, iArr.length));
        int i12 = cameraInputParams.f41129s;
        int[] iArr2 = ZaloCameraView.f40828N2;
        boolean m116158j2 = AbstractC22470k.m116158j(i12, Arrays.copyOf(iArr2, iArr2.length));
        if (cameraInputParams.f41129s == 9) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (cameraInputParams.f41090I) {
            return false;
        }
        if (!m116158j && !m116158j2 && !cameraInputParams.f41103V && !z11) {
            return false;
        }
        return true;
    }
}
