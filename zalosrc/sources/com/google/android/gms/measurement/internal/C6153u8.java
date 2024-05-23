package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC5298b1;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
/* loaded from: classes.dex */
public final class C6153u8 extends AbstractC6148u3 {

    /* renamed from: c */
    private Handler f34519c;

    /* renamed from: d */
    protected final C6142t8 f34520d;

    /* renamed from: e */
    protected final C6131s8 f34521e;

    /* renamed from: f */
    protected final C6109q8 f34522f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6153u8(C6127s4 c6127s4) {
        super(c6127s4);
        this.f34520d = new C6142t8(this);
        this.f34521e = new C6131s8(this);
        this.f34522f = new C6109q8(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static /* bridge */ /* synthetic */ void m31463p(C6153u8 c6153u8, long j11) {
        c6153u8.mo31036g();
        c6153u8.m31465r();
        c6153u8.f34158a.mo31033c().m31201u().m31109b("Activity paused, time", Long.valueOf(j11));
        c6153u8.f34522f.m31297a(j11);
        if (c6153u8.f34158a.m31401z().m30915D()) {
            c6153u8.f34521e.m31447b(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m31464q(C6153u8 c6153u8, long j11) {
        c6153u8.mo31036g();
        c6153u8.m31465r();
        c6153u8.f34158a.mo31033c().m31201u().m31109b("Activity resumed, time", Long.valueOf(j11));
        if (c6153u8.f34158a.m31401z().m30915D() || c6153u8.f34158a.m31374F().f33822r.m31485b()) {
            c6153u8.f34521e.m31448c(j11);
        }
        c6153u8.f34522f.m31298b();
        C6142t8 c6142t8 = c6153u8.f34520d;
        c6142t8.f34498a.mo31036g();
        if (!c6142t8.f34498a.f34158a.m31394n()) {
            return;
        }
        c6142t8.m31453b(c6142t8.f34498a.f34158a.mo31031a().mo105913a(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m31465r() {
        mo31036g();
        if (this.f34519c == null) {
            this.f34519c = new HandlerC5298b1(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6148u3
    /* renamed from: m */
    protected final boolean mo30852m() {
        return false;
    }
}
