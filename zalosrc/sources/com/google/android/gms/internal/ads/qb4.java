package com.google.android.gms.internal.ads;

import com.zing.zalo.zinstant.zom.node.ZOM;

/* loaded from: classes2.dex */
public final class qb4 implements na4 {
    /* JADX INFO: Access modifiers changed from: protected */
    public qb4(pb4 pb4Var) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static int m25680a(int i11, int i12, int i13) {
        return ha3.m22772a(((i11 * i12) * i13) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static int m25681b(int i11) {
        switch (i11) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return 256000;
            case 17:
                return 336000;
        }
    }
}
