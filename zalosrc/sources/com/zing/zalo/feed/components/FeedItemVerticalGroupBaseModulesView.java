package com.zing.zalo.feed.components;

import android.content.Context;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import me0.AbstractC23136l9;

/* loaded from: classes4.dex */
public class FeedItemVerticalGroupBaseModulesView extends ModulesView {

    /* renamed from: K */
    public C8298i1 f44828K;

    /* renamed from: L */
    public C8441y4 f44829L;

    /* renamed from: M */
    public C16719g f44830M;

    public FeedItemVerticalGroupBaseModulesView(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021 A[Catch: Exception -> 0x0013, TRY_LEAVE, TryCatch #0 {Exception -> 0x0013, blocks: (B:16:0x0003, B:18:0x0009, B:4:0x001d, B:6:0x0021, B:3:0x0017), top: B:15:0x0003 }] */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m44158V(C3020p0 c3020p0) {
        int i11;
        C16719g c16719g;
        if (c3020p0 != null) {
            try {
                if (!c3020p0.m14479H()) {
                    int i12 = c3020p0.f12058q;
                    if (i12 != 7) {
                        if (i12 == 24) {
                        }
                    }
                }
                i11 = 0;
                c16719g = this.f44830M;
                if (c16719g == null) {
                    c16719g.m89106L().m89032P(0, i11, 0, 0);
                    return;
                }
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        i11 = AbstractC23136l9.m118742r(10.0f);
        c16719g = this.f44830M;
        if (c16719g == null) {
        }
    }

    /* renamed from: W */
    public void m44159W(C3000l0 c3000l0, boolean z11, InterfaceC2259a interfaceC2259a) {
        if (c3000l0 != null) {
            try {
                if (c3000l0.m14322a0() != null) {
                    C3020p0 m14322a0 = c3000l0.m14322a0();
                    C8298i1 c8298i1 = this.f44828K;
                    if (c8298i1 != null) {
                        c8298i1.m44706p1(c3000l0, z11, interfaceC2259a);
                    }
                    m44158V(m14322a0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: X */
    public void m44160X(C3000l0 c3000l0, InterfaceC10867f interfaceC10867f, C16719g.c cVar) {
        C8441y4 c8441y4 = this.f44829L;
        if (c8441y4 != null) {
            c8441y4.m44972p1(c3000l0, interfaceC10867f, cVar);
        }
    }
}
