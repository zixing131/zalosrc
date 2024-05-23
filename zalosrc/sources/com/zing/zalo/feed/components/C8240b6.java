package com.zing.zalo.feed.components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.androidquery.util.C3977j;
import kd0.C21693c;
import p354n3.C23528a;
import p691yr.C31060j;
import p691yr.C31063m;

/* renamed from: com.zing.zalo.feed.components.b6 */
/* loaded from: classes4.dex */
public class C8240b6 extends C21693c {

    /* renamed from: W0 */
    C3977j f45256W0;

    /* renamed from: X0 */
    C3977j f45257X0;

    /* renamed from: Y0 */
    boolean f45258Y0;

    /* renamed from: Z0 */
    C23528a f45259Z0;

    /* renamed from: a1 */
    Handler f45260a1;

    /* renamed from: b1 */
    int f45261b1;

    public C8240b6(Context context, int i11) {
        super(context);
        this.f45261b1 = i11;
    }

    /* renamed from: C1 */
    private void m44633C1() {
        if (this.f45256W0 == null) {
            this.f45256W0 = new C3977j(getContext());
        }
        if (this.f45257X0 == null) {
            this.f45257X0 = new C3977j(getContext());
        }
    }

    /* renamed from: D1 */
    private void m44634D1() {
        this.f45258Y0 = false;
    }

    /* renamed from: B1 */
    public void m44635B1() {
        m44633C1();
        this.f45259Z0 = new C23528a(getContext());
        this.f45260a1 = new Handler(Looper.getMainLooper());
        m111929z1(5);
        m44634D1();
    }

    /* renamed from: E1 */
    public void m44636E1(boolean z11, int i11) {
        this.f45258Y0 = z11;
        C31060j c31060j = C31060j.f143193a;
        C31063m.a m150937S = c31060j.m150937S(this.f45261b1);
        if (z11) {
            mo111925v1(c31060j.m150929D(i11, getContext(), m150937S));
        } else {
            mo111925v1(c31060j.m150929D(0, getContext(), m150937S));
        }
    }
}
