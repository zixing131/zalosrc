package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C5378fd;

/* renamed from: com.google.android.gms.measurement.internal.s8 */
/* loaded from: classes.dex */
public final class C6131s8 {

    /* renamed from: a */
    protected long f34472a;

    /* renamed from: b */
    protected long f34473b;

    /* renamed from: c */
    private final AbstractC6067n f34474c;

    /* renamed from: d */
    final /* synthetic */ C6153u8 f34475d;

    public C6131s8(C6153u8 c6153u8) {
        this.f34475d = c6153u8;
        this.f34474c = new C6120r8(this, c6153u8.f34158a);
        long mo105914b = c6153u8.f34158a.mo31031a().mo105914b();
        this.f34472a = mo105914b;
        this.f34473b = mo105914b;
    }

    /* renamed from: a */
    public final void m31446a() {
        this.f34474c.m31146b();
        this.f34472a = 0L;
        this.f34473b = 0L;
    }

    /* renamed from: b */
    public final void m31447b(long j11) {
        this.f34474c.m31146b();
    }

    /* renamed from: c */
    public final void m31448c(long j11) {
        this.f34475d.mo31036g();
        this.f34474c.m31146b();
        this.f34472a = j11;
        this.f34473b = j11;
    }

    /* renamed from: d */
    public final boolean m31449d(boolean z11, boolean z12, long j11) {
        this.f34475d.mo31036g();
        this.f34475d.m31455h();
        C5378fd.m29144b();
        if (this.f34475d.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33922h0)) {
            if (this.f34475d.f34158a.m31394n()) {
                this.f34475d.f34158a.m31374F().f33819o.m31503b(this.f34475d.f34158a.mo31031a().mo105913a());
            }
        } else {
            this.f34475d.f34158a.m31374F().f33819o.m31503b(this.f34475d.f34158a.mo31031a().mo105913a());
        }
        long j12 = j11 - this.f34472a;
        if (!z11 && j12 < 1000) {
            this.f34475d.f34158a.mo31033c().m31201u().m31109b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j12));
            return false;
        }
        if (!z12) {
            j12 = j11 - this.f34473b;
            this.f34473b = j11;
        }
        this.f34475d.f34158a.mo31033c().m31201u().m31109b("Recording user engagement, ms", Long.valueOf(j12));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j12);
        C6121r9.m31314y(this.f34475d.f34158a.m31378K().m30854r(!this.f34475d.f34158a.m31401z().m30915D()), bundle, true);
        if (!z12) {
            this.f34475d.f34158a.m31376I().m31440t("auto", "_e", bundle);
        }
        this.f34472a = j11;
        this.f34474c.m31146b();
        this.f34474c.m31148d(3600000L);
        return true;
    }
}
