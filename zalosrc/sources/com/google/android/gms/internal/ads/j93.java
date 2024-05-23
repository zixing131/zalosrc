package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class j93 implements Comparator {
    /* renamed from: b */
    public static j93 m23575b(Comparator comparator) {
        if (comparator instanceof j93) {
            return (j93) comparator;
        }
        return new n73(comparator);
    }

    /* renamed from: c */
    public static j93 m23576c() {
        return h93.f21590p;
    }

    /* renamed from: a */
    public j93 mo22746a() {
        return new t93(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
