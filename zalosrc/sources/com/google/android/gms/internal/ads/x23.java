package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x23 extends q33 {

    /* renamed from: a */
    private int f30309a;

    /* renamed from: b */
    private String f30310b;

    /* renamed from: c */
    private byte f30311c;

    @Override // com.google.android.gms.internal.ads.q33
    /* renamed from: a */
    public final q33 mo25649a(String str) {
        this.f30310b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.q33
    /* renamed from: b */
    public final q33 mo25650b(int i11) {
        this.f30309a = i11;
        this.f30311c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.q33
    /* renamed from: c */
    public final r33 mo25651c() {
        if (this.f30311c == 1) {
            return new z23(this.f30309a, this.f30310b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
