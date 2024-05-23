package p174g;

import p043c.C3171g;

/* renamed from: g.b */
/* loaded from: classes2.dex */
public final class C19176b {

    /* renamed from: a */
    private static C19176b f95307a;

    private C19176b() {
    }

    /* renamed from: a */
    public static C19176b m100632a() {
        if (f95307a == null) {
            synchronized (C19176b.class) {
                try {
                    if (f95307a == null) {
                        f95307a = new C19176b();
                    }
                } finally {
                }
            }
        }
        return f95307a;
    }

    /* renamed from: b */
    public String m100633b(String str, String str2) {
        try {
            return C3171g.m15959a().m15962c(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }
}
