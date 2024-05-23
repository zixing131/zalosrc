package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class wo0 extends AbstractC4975s9 {

    /* renamed from: c */
    static final wo0 f30038c = new wo0();

    wo0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4975s9
    /* renamed from: b */
    public final InterfaceC5123w9 mo26262b(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new C5198y9();
        }
        if ("mvhd".equals(str)) {
            return new C5235z9();
        }
        return new C4310aa(str);
    }
}
