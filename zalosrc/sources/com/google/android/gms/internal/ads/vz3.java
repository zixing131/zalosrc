package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class vz3 extends b04 {

    /* renamed from: a */
    final String f29641a;

    public vz3(String str) {
        this.f29641a = str;
    }

    @Override // com.google.android.gms.internal.ads.b04
    /* renamed from: a */
    public final void mo20368a(String str) {
        String str2 = this.f29641a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
    }
}
