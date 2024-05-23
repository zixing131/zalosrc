package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class x91 {

    /* renamed from: a */
    private static final byte[] f30388a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f30389b = {"", "A", "B", "C"};

    /* renamed from: c */
    public static final /* synthetic */ int f30390c = 0;

    /* renamed from: a */
    public static String m27865a(int i11, int i12, int i13) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    /* renamed from: b */
    public static String m27866b(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
        char c11;
        Object[] objArr = new Object[5];
        objArr[0] = f30389b[i11];
        objArr[1] = Integer.valueOf(i12);
        objArr[2] = Integer.valueOf(i13);
        if (true != z11) {
            c11 = 'L';
        } else {
            c11 = 'H';
        }
        objArr[3] = Character.valueOf(c11);
        objArr[4] = Integer.valueOf(i14);
        StringBuilder sb2 = new StringBuilder(g92.m22349i("hvc1.%s%d.%X.%c%d", objArr));
        int i15 = 6;
        while (i15 > 0) {
            int i16 = i15 - 1;
            if (iArr[i16] != 0) {
                break;
            }
            i15 = i16;
        }
        for (int i17 = 0; i17 < i15; i17++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i17])));
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static byte[] m27867c(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12 + 4];
        System.arraycopy(f30388a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i11, bArr2, 4, i12);
        return bArr2;
    }
}
