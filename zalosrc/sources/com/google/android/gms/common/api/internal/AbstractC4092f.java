package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.internal.C4086d;
import p342m6.C22890k;

/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4092f {

    /* renamed from: a */
    private final C4086d f16298a;

    /* renamed from: b */
    private final Feature[] f16299b;

    /* renamed from: c */
    private final boolean f16300c;

    /* renamed from: d */
    private final int f16301d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4092f(C4086d c4086d, Feature[] featureArr, boolean z11, int i11) {
        this.f16298a = c4086d;
        this.f16299b = featureArr;
        this.f16300c = z11;
        this.f16301d = i11;
    }

    /* renamed from: a */
    public void m19402a() {
        this.f16298a.m19390a();
    }

    /* renamed from: b */
    public C4086d.a m19403b() {
        return this.f16298a.m19391b();
    }

    /* renamed from: c */
    public Feature[] m19404c() {
        return this.f16299b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo19405d(C4071a.b bVar, C22890k c22890k);

    /* renamed from: e */
    public final int m19406e() {
        return this.f16301d;
    }

    /* renamed from: f */
    public final boolean m19407f() {
        return this.f16300c;
    }
}
