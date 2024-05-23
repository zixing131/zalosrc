package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class xe3 extends qe3 {

    /* renamed from: a */
    private final String f30433a;

    /* renamed from: b */
    private final int f30434b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ xe3(String str, int i11, we3 we3Var) {
        this.f30433a = str;
        this.f30434b = i11;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.f30433a;
        int i11 = this.f30434b - 2;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
