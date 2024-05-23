package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.bv */
/* loaded from: classes2.dex */
public abstract class AbstractC4368bv {

    /* renamed from: a */
    private static final HashSet f17989a = new HashSet();

    /* renamed from: b */
    private static String f17990b = "media3.common";

    /* renamed from: a */
    public static synchronized String m20758a() {
        String str;
        synchronized (AbstractC4368bv.class) {
            str = f17990b;
        }
        return str;
    }

    /* renamed from: b */
    public static synchronized void m20759b(String str) {
        synchronized (AbstractC4368bv.class) {
            if (f17989a.add(str)) {
                f17990b = f17990b + ", " + str;
            }
        }
    }
}
