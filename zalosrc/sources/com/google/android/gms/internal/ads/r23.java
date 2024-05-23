package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r23 extends d33 {

    /* renamed from: a */
    private String f27058a;

    /* renamed from: b */
    private String f27059b;

    @Override // com.google.android.gms.internal.ads.d33
    /* renamed from: a */
    public final d33 mo21254a(String str) {
        this.f27059b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d33
    /* renamed from: b */
    public final d33 mo21255b(String str) {
        this.f27058a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.d33
    /* renamed from: c */
    public final e33 mo21256c() {
        return new t23(this.f27058a, this.f27059b, null);
    }
}
