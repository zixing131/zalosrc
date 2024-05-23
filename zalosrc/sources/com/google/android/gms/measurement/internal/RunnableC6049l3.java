package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l3 */
/* loaded from: classes.dex */
public final class RunnableC6049l3 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ int f34150p;

    /* renamed from: q */
    final /* synthetic */ String f34151q;

    /* renamed from: r */
    final /* synthetic */ Object f34152r;

    /* renamed from: s */
    final /* synthetic */ Object f34153s;

    /* renamed from: t */
    final /* synthetic */ Object f34154t;

    /* renamed from: u */
    final /* synthetic */ C6082o3 f34155u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6049l3(C6082o3 c6082o3, int i11, String str, Object obj, Object obj2, Object obj3) {
        this.f34155u = c6082o3;
        this.f34150p = i11;
        this.f34151q = str;
        this.f34152r = obj;
        this.f34153s = obj2;
        this.f34154t = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c11;
        long j11;
        char c12;
        long j12;
        C5950c4 m31374F = this.f34155u.f34158a.m31374F();
        if (m31374F.m31143m()) {
            C6082o3 c6082o3 = this.f34155u;
            c11 = c6082o3.f34254c;
            if (c11 == 0) {
                if (c6082o3.f34158a.m31401z().m30919H()) {
                    C6082o3 c6082o32 = this.f34155u;
                    c6082o32.f34158a.mo31035f();
                    c6082o32.f34254c = 'C';
                } else {
                    C6082o3 c6082o33 = this.f34155u;
                    c6082o33.f34158a.mo31035f();
                    c6082o33.f34254c = 'c';
                }
            }
            C6082o3 c6082o34 = this.f34155u;
            j11 = c6082o34.f34255d;
            if (j11 < 0) {
                c6082o34.f34158a.m31401z().m30926p();
                c6082o34.f34255d = 76003L;
            }
            char charAt = "01VDIWEA?".charAt(this.f34150p);
            C6082o3 c6082o35 = this.f34155u;
            c12 = c6082o35.f34254c;
            j12 = c6082o35.f34255d;
            String str = "2" + charAt + c12 + j12 + ":" + C6082o3.m31186A(true, this.f34151q, this.f34152r, this.f34153s, this.f34154t);
            if (str.length() > 1024) {
                str = this.f34151q.substring(0, 1024);
            }
            C5926a4 c5926a4 = m31374F.f33808d;
            if (c5926a4 != null) {
                c5926a4.m30792b(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f34155u.m31194D(), "Persisted config not initialized. Not logging error/warn");
    }
}
