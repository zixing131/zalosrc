package h40;

import android.content.Intent;
import android.os.Bundle;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23152n3;
import p542ub.InterfaceC27218a;

/* renamed from: h40.q0 */
/* loaded from: classes5.dex */
public final class C19840q0 extends C17487o0 {
    /* renamed from: p2 */
    private final void m103547p2(Class cls, Bundle bundle) {
        ZaloActivity zaloActivity;
        InterfaceC27218a m93021N0 = m93021N0();
        if (m93021N0 instanceof ZaloActivity) {
            zaloActivity = (ZaloActivity) m93021N0;
        } else {
            zaloActivity = null;
        }
        if (zaloActivity == null) {
            return;
        }
        try {
            zaloActivity.setResult(0);
            zaloActivity.finish();
            Intent m119012O = AbstractC23152n3.m119012O(cls, bundle);
            AbstractC19074t.m100207e(m119012O, "makeIntentShowZaloView(...)");
            m119012O.addFlags(268435456);
            zaloActivity.getApplicationContext().startActivity(m119012O);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            try {
                zaloActivity.setResult(1);
                zaloActivity.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.zing.zalo.zview.C17487o0
    /* renamed from: b2 */
    public ZaloView mo93055b2(int i11, ZaloView zaloView, Bundle bundle, int i12, String str, int i13, boolean z11) {
        Class<?> cls;
        if (z11) {
            if (zaloView != null) {
                cls = zaloView.getClass();
            } else {
                cls = null;
            }
            m103547p2(cls, bundle);
            return null;
        }
        return super.mo93055b2(i11, zaloView, bundle, i12, str, i13, z11);
    }

    @Override // com.zing.zalo.zview.C17487o0
    /* renamed from: c2 */
    public ZaloView mo57057c2(int i11, Class cls, Bundle bundle, int i12, String str, int i13, boolean z11) {
        if (z11) {
            m103547p2(cls, bundle);
            return null;
        }
        return super.mo57057c2(i11, cls, bundle, i12, str, i13, z11);
    }
}
