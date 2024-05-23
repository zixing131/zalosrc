package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class v73 extends w73 {

    /* renamed from: a */
    Object[] f29219a;

    /* renamed from: b */
    int f29220b = 0;

    /* renamed from: c */
    boolean f29221c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v73(int i11) {
        this.f29219a = new Object[i11];
    }

    /* renamed from: e */
    private final void m27176e(int i11) {
        Object[] objArr = this.f29219a;
        int length = objArr.length;
        if (length < i11) {
            this.f29219a = Arrays.copyOf(objArr, w73.m27576b(length, i11));
            this.f29221c = false;
        } else if (this.f29221c) {
            this.f29219a = (Object[]) objArr.clone();
            this.f29221c = false;
        }
    }

    /* renamed from: c */
    public final v73 m27177c(Object obj) {
        obj.getClass();
        m27176e(this.f29220b + 1);
        Object[] objArr = this.f29219a;
        int i11 = this.f29220b;
        this.f29220b = i11 + 1;
        objArr[i11] = obj;
        return this;
    }

    /* renamed from: d */
    public final w73 m27178d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m27176e(this.f29220b + collection.size());
            if (collection instanceof x73) {
                this.f29220b = ((x73) collection).mo20836d(this.f29219a, this.f29220b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo22297a(it.next());
        }
        return this;
    }
}
