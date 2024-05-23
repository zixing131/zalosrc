package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C5598sc;
import com.google.android.gms.internal.measurement.C5617te;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t8 */
/* loaded from: classes.dex */
public final class C6142t8 {

    /* renamed from: a */
    final /* synthetic */ C6153u8 f34498a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6142t8(C6153u8 c6153u8) {
        this.f34498a = c6153u8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31452a() {
        this.f34498a.mo31036g();
        if (this.f34498a.f34158a.m31374F().m30824u(this.f34498a.f34158a.mo31031a().mo105913a())) {
            this.f34498a.f34158a.m31374F().f33816l.m31484a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f34498a.f34158a.mo31033c().m31201u().m31108a("Detected application was in foreground");
                m31454c(this.f34498a.f34158a.mo31031a().mo105913a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31453b(long j11, boolean z11) {
        this.f34498a.mo31036g();
        this.f34498a.m31465r();
        if (this.f34498a.f34158a.m31374F().m30824u(j11)) {
            this.f34498a.f34158a.m31374F().f33816l.m31484a(true);
            C5617te.m29656b();
            if (this.f34498a.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33938p0)) {
                this.f34498a.f34158a.m31370B().m30944u();
            }
        }
        this.f34498a.f34158a.m31374F().f33819o.m31503b(j11);
        if (this.f34498a.f34158a.m31374F().f33816l.m31485b()) {
            m31454c(j11, z11);
        }
    }

    /* renamed from: c */
    final void m31454c(long j11, boolean z11) {
        this.f34498a.mo31036g();
        if (!this.f34498a.f34158a.m31394n()) {
            return;
        }
        this.f34498a.f34158a.m31374F().f33819o.m31503b(j11);
        this.f34498a.f34158a.mo31033c().m31201u().m31109b("Session started, time", Long.valueOf(this.f34498a.f34158a.mo31031a().mo105914b()));
        Long valueOf = Long.valueOf(j11 / 1000);
        this.f34498a.f34158a.m31376I().m31420M("auto", "_sid", valueOf, j11);
        this.f34498a.f34158a.m31374F().f33820p.m31503b(valueOf.longValue());
        this.f34498a.f34158a.m31374F().f33816l.m31484a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (this.f34498a.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33914d0) && z11) {
            bundle.putLong("_aib", 1L);
        }
        this.f34498a.f34158a.m31376I().m31441u("auto", "_s", j11, bundle);
        C5598sc.m29603b();
        if (this.f34498a.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33920g0)) {
            String m30803a = this.f34498a.f34158a.m31374F().f33825u.m30803a();
            if (!TextUtils.isEmpty(m30803a)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m30803a);
                this.f34498a.f34158a.m31376I().m31441u("auto", "_ssr", j11, bundle2);
            }
        }
    }
}
