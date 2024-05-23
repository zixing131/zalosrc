package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public final class gu3 {

    /* renamed from: b */
    private static volatile gu3 f20900b;

    /* renamed from: c */
    private static volatile gu3 f20901c;

    /* renamed from: d */
    static final gu3 f20902d = new gu3(true);

    /* renamed from: a */
    private final Map f20903a = Collections.emptyMap();

    gu3(boolean z11) {
    }

    /* renamed from: a */
    public static gu3 m22615a() {
        gu3 gu3Var = f20900b;
        if (gu3Var == null) {
            synchronized (gu3.class) {
                try {
                    gu3Var = f20900b;
                    if (gu3Var == null) {
                        gu3Var = f20902d;
                        f20900b = gu3Var;
                    }
                } finally {
                }
            }
        }
        return gu3Var;
    }

    /* renamed from: b */
    public static gu3 m22616b() {
        gu3 gu3Var = f20901c;
        if (gu3Var != null) {
            return gu3Var;
        }
        synchronized (gu3.class) {
            try {
                gu3 gu3Var2 = f20901c;
                if (gu3Var2 != null) {
                    return gu3Var2;
                }
                gu3 m25013a = nu3.m25013a(gu3.class);
                f20901c = m25013a;
                return m25013a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final su3 m22617c(zv3 zv3Var, int i11) {
        AbstractC30228a.m149044a(this.f20903a.get(new fu3(zv3Var, i11)));
        return null;
    }
}
