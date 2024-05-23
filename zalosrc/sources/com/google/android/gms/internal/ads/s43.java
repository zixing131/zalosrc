package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s43 extends r43 {

    /* renamed from: p */
    private final char f27536p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s43(char c11) {
        this.f27536p = c11;
    }

    @Override // com.google.android.gms.internal.ads.v43
    /* renamed from: a */
    public final boolean mo26247a(char c11) {
        return c11 == this.f27536p;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CharMatcher.is('");
        int i11 = this.f27536p;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i12 = 0; i12 < 4; i12++) {
            cArr[5 - i12] = "0123456789ABCDEF".charAt(i11 & 15);
            i11 >>= 4;
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
