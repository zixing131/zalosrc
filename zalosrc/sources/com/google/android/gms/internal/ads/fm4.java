package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class fm4 {

    /* renamed from: a */
    public final String f20194a;

    private fm4(int i11, int i12, String str) {
        this.f20194a = str;
    }

    /* renamed from: a */
    public static fm4 m22085a(x02 x02Var) {
        String str;
        String str2;
        x02Var.m27776g(2);
        int m27788s = x02Var.m27788s();
        int i11 = m27788s >> 1;
        int m27788s2 = (x02Var.m27788s() >> 3) | ((m27788s & 1) << 5);
        if (i11 != 4 && i11 != 5 && i11 != 7) {
            if (i11 == 8) {
                str = "hev1";
            } else if (i11 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        if (m27788s2 < 10) {
            str2 = ".0";
        } else {
            str2 = ".";
        }
        return new fm4(i11, m27788s2, str + ".0" + i11 + str2 + m27788s2);
    }
}
