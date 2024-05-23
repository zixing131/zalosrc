package p219hw;

import com.zing.zalo.zview.ZaloView;
import p205hc.InterfaceC19970i;

/* renamed from: hw.m */
/* loaded from: classes4.dex */
public interface InterfaceC20149m extends InterfaceC19970i {

    /* renamed from: hw.m$a */
    /* loaded from: classes4.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m105125a(InterfaceC20149m interfaceC20149m, String str, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    z11 = false;
                }
                interfaceC20149m.mo48278Fm(str, z11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAddedFriendTimeAndSourceType");
        }
    }

    /* renamed from: Fm */
    void mo48278Fm(String str, boolean z11);

    /* renamed from: Ud */
    void mo48283Ud();

    /* renamed from: ca */
    void mo48286ca(String str);

    /* renamed from: e0 */
    void mo48287e0(String str);

    /* renamed from: k */
    ZaloView mo48290k();
}
