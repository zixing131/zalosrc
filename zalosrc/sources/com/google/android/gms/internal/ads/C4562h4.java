package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h4 */
/* loaded from: classes2.dex */
public final class C4562h4 {

    /* renamed from: a */
    public final boolean f21527a;

    /* renamed from: b */
    public final String f21528b;

    /* renamed from: c */
    public final C4891q f21529c;

    /* renamed from: d */
    public final int f21530d;

    /* renamed from: e */
    public final byte[] f21531e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:            if (r6.equals("cenc") != false) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4562h4(boolean z11, String str, int i11, byte[] bArr, int i12, int i13, byte[] bArr2) {
        boolean z12;
        boolean z13;
        char c11 = 0;
        int i14 = 1;
        if (i11 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (bArr2 == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        v71.m27173d(z12 ^ z13);
        this.f21527a = z11;
        this.f21528b = str;
        this.f21530d = i11;
        this.f21531e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3049879:
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            if (c11 != 0 && c11 != 1) {
                if (c11 != 2 && c11 != 3) {
                    lr1.m24356e("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                } else {
                    i14 = 2;
                }
            }
        }
        this.f21529c = new C4891q(i14, bArr, i12, i13);
    }
}
