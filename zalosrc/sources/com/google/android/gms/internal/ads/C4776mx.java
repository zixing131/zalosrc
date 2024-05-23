package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.mx */
/* loaded from: classes2.dex */
public final class C4776mx {
    /* renamed from: a */
    public static final void m24772a(C4738lx c4738lx, C4664jx c4664jx) {
        if (c4664jx.m23768a() != null) {
            if (!TextUtils.isEmpty(c4664jx.m23769b())) {
                c4738lx.m24397d(c4664jx.m23768a(), c4664jx.m23769b(), c4664jx.m23770c(), c4664jx.m23771d());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
