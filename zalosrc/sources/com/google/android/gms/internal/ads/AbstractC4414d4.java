package com.google.android.gms.internal.ads;

import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.d4 */
/* loaded from: classes2.dex */
public abstract class AbstractC4414d4 {
    /* JADX WARN: Removed duplicated region for block: B:5:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static UUID m21262a(byte[] bArr) {
        C4377c4 c4377c4;
        UUID uuid;
        x02 x02Var = new x02(bArr);
        if (x02Var.m27781l() >= 32) {
            x02Var.m27775f(0);
            if (x02Var.m27782m() == x02Var.m27778i() + 4 && x02Var.m27782m() == 1886614376) {
                int m22689a = AbstractC4561h3.m22689a(x02Var.m27782m());
                if (m22689a > 1) {
                    lr1.m24356e("PsshAtomUtil", "Unsupported pssh version: " + m22689a);
                } else {
                    UUID uuid2 = new UUID(x02Var.m27795z(), x02Var.m27795z());
                    if (m22689a == 1) {
                        x02Var.m27776g(x02Var.m27791v() * 16);
                    }
                    int m27791v = x02Var.m27791v();
                    if (m27791v == x02Var.m27778i()) {
                        byte[] bArr2 = new byte[m27791v];
                        x02Var.m27771b(bArr2, 0, m27791v);
                        c4377c4 = new C4377c4(uuid2, m22689a, bArr2);
                        if (c4377c4 == null) {
                            uuid = c4377c4.f18097a;
                            return uuid;
                        }
                        return null;
                    }
                }
            }
        }
        c4377c4 = null;
        if (c4377c4 == null) {
        }
    }
}
