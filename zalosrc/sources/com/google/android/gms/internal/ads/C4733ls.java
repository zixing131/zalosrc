package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.ls */
/* loaded from: classes2.dex */
public final class C4733ls {

    /* renamed from: a */
    private final InputStream f24034a;

    /* renamed from: b */
    private final boolean f24035b;

    /* renamed from: c */
    private final boolean f24036c;

    /* renamed from: d */
    private final long f24037d;

    /* renamed from: e */
    private final boolean f24038e;

    private C4733ls(InputStream inputStream, boolean z11, boolean z12, long j11, boolean z13) {
        this.f24034a = inputStream;
        this.f24035b = z11;
        this.f24036c = z12;
        this.f24037d = j11;
        this.f24038e = z13;
    }

    /* renamed from: b */
    public static C4733ls m24363b(InputStream inputStream, boolean z11, boolean z12, long j11, boolean z13) {
        return new C4733ls(inputStream, z11, z12, j11, z13);
    }

    /* renamed from: a */
    public final long m24364a() {
        return this.f24037d;
    }

    /* renamed from: c */
    public final InputStream m24365c() {
        return this.f24034a;
    }

    /* renamed from: d */
    public final boolean m24366d() {
        return this.f24035b;
    }

    /* renamed from: e */
    public final boolean m24367e() {
        return this.f24038e;
    }

    /* renamed from: f */
    public final boolean m24368f() {
        return this.f24036c;
    }
}
