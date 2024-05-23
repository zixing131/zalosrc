package jg0;

import android.os.Bundle;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.zview.ZaloView;
import p542ub.InterfaceC27218a;

/* renamed from: jg0.f */
/* loaded from: classes6.dex */
public interface InterfaceC21251f {

    /* renamed from: jg0.f$a */
    /* loaded from: classes6.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ ZaloView m110057a(InterfaceC21251f interfaceC21251f, InterfaceC27218a interfaceC27218a, CameraInputParams cameraInputParams, Bundle bundle, int i11, int i12, int i13, Object obj) {
            int i14;
            int i15;
            if (obj == null) {
                if ((i13 & 4) != 0) {
                    bundle = AbstractC1438d.m7340a();
                }
                Bundle bundle2 = bundle;
                if ((i13 & 8) != 0) {
                    i14 = 0;
                } else {
                    i14 = i11;
                }
                if ((i13 & 16) != 0) {
                    i15 = 0;
                } else {
                    i15 = i12;
                }
                return interfaceC21251f.mo4499a(interfaceC27218a, cameraInputParams, bundle2, i14, i15);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showView");
        }
    }

    /* renamed from: a */
    ZaloView mo4499a(InterfaceC27218a interfaceC27218a, CameraInputParams cameraInputParams, Bundle bundle, int i11, int i12);
}
