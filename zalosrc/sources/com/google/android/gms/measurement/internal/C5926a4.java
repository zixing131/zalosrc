package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.AbstractC20317i;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
/* loaded from: classes.dex */
public final class C5926a4 {

    /* renamed from: a */
    final String f33761a;

    /* renamed from: b */
    private final String f33762b;

    /* renamed from: c */
    private final String f33763c;

    /* renamed from: d */
    private final long f33764d;

    /* renamed from: e */
    final /* synthetic */ C5950c4 f33765e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5926a4(C5950c4 c5950c4, String str, long j11, AbstractC20317i abstractC20317i) {
        boolean z11;
        this.f33765e = c5950c4;
        AbstractC4205o.m19718g("health_monitor");
        if (j11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19712a(z11);
        this.f33761a = "health_monitor:start";
        this.f33762b = "health_monitor:count";
        this.f33763c = "health_monitor:value";
        this.f33764d = j11;
    }

    /* renamed from: c */
    private final long m30789c() {
        return this.f33765e.m30817n().getLong(this.f33761a, 0L);
    }

    /* renamed from: d */
    private final void m30790d() {
        this.f33765e.mo31036g();
        long mo105913a = this.f33765e.f34158a.mo31031a().mo105913a();
        SharedPreferences.Editor edit = this.f33765e.m30817n().edit();
        edit.remove(this.f33762b);
        edit.remove(this.f33763c);
        edit.putLong(this.f33761a, mo105913a);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair m30791a() {
        long abs;
        this.f33765e.mo31036g();
        this.f33765e.mo31036g();
        long m30789c = m30789c();
        if (m30789c == 0) {
            m30790d();
            abs = 0;
        } else {
            abs = Math.abs(m30789c - this.f33765e.f34158a.mo31031a().mo105913a());
        }
        long j11 = this.f33764d;
        if (abs < j11) {
            return null;
        }
        if (abs > j11 + j11) {
            m30790d();
            return null;
        }
        String string = this.f33765e.m30817n().getString(this.f33763c, null);
        long j12 = this.f33765e.m30817n().getLong(this.f33762b, 0L);
        m30790d();
        if (string != null && j12 > 0) {
            return new Pair(string, Long.valueOf(j12));
        }
        return C5950c4.f33806y;
    }

    /* renamed from: b */
    public final void m30792b(String str, long j11) {
        this.f33765e.mo31036g();
        if (m30789c() == 0) {
            m30790d();
        }
        if (str == null) {
            str = "";
        }
        long j12 = this.f33765e.m30817n().getLong(this.f33762b, 0L);
        if (j12 <= 0) {
            SharedPreferences.Editor edit = this.f33765e.m30817n().edit();
            edit.putString(this.f33763c, str);
            edit.putLong(this.f33762b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f33765e.f34158a.m31381N().m31353t().nextLong() & Long.MAX_VALUE;
        long j13 = j12 + 1;
        long j14 = Long.MAX_VALUE / j13;
        SharedPreferences.Editor edit2 = this.f33765e.m30817n().edit();
        if (nextLong < j14) {
            edit2.putString(this.f33763c, str);
        }
        edit2.putLong(this.f33762b, j13);
        edit2.apply();
    }
}
