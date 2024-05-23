package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c03 extends yz2 {

    /* renamed from: a */
    private String f18071a;

    /* renamed from: b */
    private boolean f18072b;

    /* renamed from: c */
    private boolean f18073c;

    /* renamed from: d */
    private byte f18074d;

    @Override // com.google.android.gms.internal.ads.yz2
    /* renamed from: a */
    public final yz2 mo20776a(String str) {
        if (str != null) {
            this.f18071a = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }

    @Override // com.google.android.gms.internal.ads.yz2
    /* renamed from: b */
    public final yz2 mo20777b(boolean z11) {
        this.f18073c = true;
        this.f18074d = (byte) (this.f18074d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yz2
    /* renamed from: c */
    public final yz2 mo20778c(boolean z11) {
        this.f18072b = z11;
        this.f18074d = (byte) (this.f18074d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yz2
    /* renamed from: d */
    public final zz2 mo20779d() {
        String str;
        if (this.f18074d == 3 && (str = this.f18071a) != null) {
            return new e03(str, this.f18072b, this.f18073c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f18071a == null) {
            sb2.append(" clientVersion");
        }
        if ((this.f18074d & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.f18074d & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
