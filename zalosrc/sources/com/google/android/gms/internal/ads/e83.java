package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e83 {

    /* renamed from: a */
    Object[] f19563a;

    /* renamed from: b */
    int f19564b;

    /* renamed from: c */
    d83 f19565c;

    public e83() {
        this(4);
    }

    /* renamed from: d */
    private final void m21627d(int i11) {
        int i12 = i11 + i11;
        Object[] objArr = this.f19563a;
        int length = objArr.length;
        if (i12 > length) {
            this.f19563a = Arrays.copyOf(objArr, w73.m27576b(length, i12));
        }
    }

    /* renamed from: a */
    public final e83 m21628a(Object obj, Object obj2) {
        m21627d(this.f19564b + 1);
        a73.m20020b(obj, obj2);
        Object[] objArr = this.f19563a;
        int i11 = this.f19564b;
        int i12 = i11 + i11;
        objArr[i12] = obj;
        objArr[i12 + 1] = obj2;
        this.f19564b = i11 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final e83 m21629b(Iterable iterable) {
        if (iterable instanceof Collection) {
            m21627d(this.f19564b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m21628a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    /* renamed from: c */
    public final f83 m21630c() {
        d83 d83Var = this.f19565c;
        if (d83Var == null) {
            q93 m25674i = q93.m25674i(this.f19564b, this.f19563a, this);
            d83 d83Var2 = this.f19565c;
            if (d83Var2 == null) {
                return m25674i;
            }
            throw d83Var2.m21282a();
        }
        throw d83Var.m21282a();
    }

    public e83(int i11) {
        this.f19563a = new Object[i11 + i11];
        this.f19564b = 0;
    }
}
