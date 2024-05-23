package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.t6 */
/* loaded from: classes.dex */
public final class C5609t6 {

    /* renamed from: a */
    final Uri f32804a;

    /* renamed from: b */
    final String f32805b;

    /* renamed from: c */
    final String f32806c;

    /* renamed from: d */
    final boolean f32807d;

    /* renamed from: e */
    final boolean f32808e;

    private C5609t6(String str, Uri uri, String str2, String str3, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC5321c7 interfaceC5321c7) {
        this.f32804a = uri;
        this.f32805b = "";
        this.f32806c = "";
        this.f32807d = z11;
        this.f32808e = z13;
    }

    /* renamed from: a */
    public final C5609t6 m29622a() {
        return new C5609t6(null, this.f32804a, this.f32805b, this.f32806c, this.f32807d, false, true, false, null);
    }

    /* renamed from: b */
    public final C5609t6 m29623b() {
        if (this.f32805b.isEmpty()) {
            return new C5609t6(null, this.f32804a, this.f32805b, this.f32806c, true, false, this.f32808e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final AbstractC5677x6 m29624c(String str, double d11) {
        return new C5575r6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final AbstractC5677x6 m29625d(String str, long j11) {
        return new C5541p6(this, str, Long.valueOf(j11), true);
    }

    /* renamed from: e */
    public final AbstractC5677x6 m29626e(String str, String str2) {
        return new C5592s6(this, str, str2, true);
    }

    /* renamed from: f */
    public final AbstractC5677x6 m29627f(String str, boolean z11) {
        return new C5558q6(this, str, Boolean.valueOf(z11), true);
    }

    public C5609t6(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
