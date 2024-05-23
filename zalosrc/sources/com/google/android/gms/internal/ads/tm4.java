package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class tm4 {
    /* renamed from: a */
    public static zzbq m26630a(km4 km4Var, boolean z11) {
        InterfaceC5041u1 interfaceC5041u1;
        if (z11) {
            interfaceC5041u1 = null;
        } else {
            interfaceC5041u1 = AbstractC5115w1.f29650a;
        }
        zzbq m20194a = new an4().m20194a(km4Var, interfaceC5041u1);
        if (m20194a == null || m20194a.m28707a() == 0) {
            return null;
        }
        return m20194a;
    }

    /* renamed from: b */
    public static vm4 m26631b(x02 x02Var) {
        x02Var.m27776g(1);
        int m27790u = x02Var.m27790u();
        long m27780k = x02Var.m27780k() + m27790u;
        int i11 = m27790u / 18;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            long m27795z = x02Var.m27795z();
            if (m27795z == -1) {
                jArr = Arrays.copyOf(jArr, i12);
                jArr2 = Arrays.copyOf(jArr2, i12);
                break;
            }
            jArr[i12] = m27795z;
            jArr2[i12] = x02Var.m27795z();
            x02Var.m27776g(2);
            i12++;
        }
        x02Var.m27776g((int) (m27780k - x02Var.m27780k()));
        return new vm4(jArr, jArr2);
    }
}
