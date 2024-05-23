package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.br */
/* loaded from: classes2.dex */
public final class C4364br implements Comparator {
    public C4364br(C4400cr c4400cr) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C4918qq c4918qq = (C4918qq) obj;
        C4918qq c4918qq2 = (C4918qq) obj2;
        if (c4918qq.m25864d() < c4918qq2.m25864d()) {
            return -1;
        }
        if (c4918qq.m25864d() <= c4918qq2.m25864d()) {
            if (c4918qq.m25862b() < c4918qq2.m25862b()) {
                return -1;
            }
            if (c4918qq.m25862b() <= c4918qq2.m25862b()) {
                float m25861a = (c4918qq.m25861a() - c4918qq.m25864d()) * (c4918qq.m25863c() - c4918qq.m25862b());
                float m25861a2 = (c4918qq2.m25861a() - c4918qq2.m25864d()) * (c4918qq2.m25863c() - c4918qq2.m25862b());
                if (m25861a > m25861a2) {
                    return -1;
                }
                if (m25861a >= m25861a2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
