package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zi3 {

    /* renamed from: a */
    private final Class f31525a;

    /* renamed from: b */
    private final Map f31526b;

    /* renamed from: c */
    private final Class f31527c;

    /* JADX INFO: Access modifiers changed from: protected */
    public zi3(Class cls, nj3... nj3VarArr) {
        this.f31525a = cls;
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 <= 0; i11++) {
            nj3 nj3Var = nj3VarArr[i11];
            if (!hashMap.containsKey(nj3Var.m24932b())) {
                hashMap.put(nj3Var.m24932b(), nj3Var);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(nj3Var.m24932b().getCanonicalName())));
            }
        }
        this.f31527c = nj3VarArr[0].m24932b();
        this.f31526b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public yi3 mo20513a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract zv3 mo20514b(mt3 mt3Var);

    /* renamed from: c */
    public abstract String mo20515c();

    /* renamed from: d */
    public abstract void mo20516d(zv3 zv3Var);

    /* renamed from: e */
    public int mo24326e() {
        return 1;
    }

    /* renamed from: f */
    public abstract int mo20517f();

    /* renamed from: g */
    public final Class m28516g() {
        return this.f31527c;
    }

    /* renamed from: h */
    public final Class m28517h() {
        return this.f31525a;
    }

    /* renamed from: i */
    public final Object m28518i(zv3 zv3Var, Class cls) {
        nj3 nj3Var = (nj3) this.f31526b.get(cls);
        if (nj3Var != null) {
            return nj3Var.mo20120a(zv3Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* renamed from: j */
    public final Set m28519j() {
        return this.f31526b.keySet();
    }
}
