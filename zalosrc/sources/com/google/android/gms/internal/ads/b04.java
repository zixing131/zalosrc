package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class b04 {
    /* renamed from: b */
    public static b04 m20367b(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new vz3(cls.getSimpleName());
        }
        return new xz3(cls.getSimpleName());
    }

    /* renamed from: a */
    public abstract void mo20368a(String str);
}
