package com.google.android.gms.common;

/* renamed from: com.google.android.gms.common.h */
/* loaded from: classes2.dex */
abstract class AbstractC4158h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19600a(int i11) {
        int[] iArr = {1, 2, 3};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr[i12];
            int i14 = i13 - 1;
            if (i13 != 0) {
                if (i14 == i11) {
                    return i13;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
