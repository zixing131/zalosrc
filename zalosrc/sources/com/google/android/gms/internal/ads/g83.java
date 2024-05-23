package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g83 extends v73 {

    /* renamed from: d */
    Object[] f20468d;

    /* renamed from: e */
    private int f20469e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g83(int i11) {
        super(i11);
        this.f20468d = new Object[h83.m22730n(i11)];
    }

    @Override // com.google.android.gms.internal.ads.w73
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ w73 mo22297a(Object obj) {
        m22298f(obj);
        return this;
    }

    /* renamed from: f */
    public final g83 m22298f(Object obj) {
        obj.getClass();
        if (this.f20468d != null) {
            int m22730n = h83.m22730n(this.f29220b);
            int length = this.f20468d.length;
            if (m22730n <= length) {
                int i11 = length - 1;
                int hashCode = obj.hashCode();
                int m26863a = u73.m26863a(hashCode);
                while (true) {
                    int i12 = m26863a & i11;
                    Object[] objArr = this.f20468d;
                    Object obj2 = objArr[i12];
                    if (obj2 == null) {
                        objArr[i12] = obj;
                        this.f20469e += hashCode;
                        super.m27177c(obj);
                        break;
                    }
                    if (obj2.equals(obj)) {
                        break;
                    }
                    m26863a = i12 + 1;
                }
                return this;
            }
        }
        this.f20468d = null;
        super.m27177c(obj);
        return this;
    }

    /* renamed from: g */
    public final g83 m22299g(Iterable iterable) {
        if (this.f20468d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m22298f(it.next());
            }
        } else {
            super.m27178d(iterable);
        }
        return this;
    }

    /* renamed from: h */
    public final h83 m22300h() {
        h83 m22736x;
        boolean m22737z;
        int i11 = this.f29220b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (this.f20468d == null || h83.m22730n(i11) != this.f20468d.length) {
                    m22736x = h83.m22736x(this.f29220b, this.f29219a);
                    this.f29220b = m22736x.size();
                } else {
                    int i12 = this.f29220b;
                    Object[] objArr = this.f29219a;
                    m22737z = h83.m22737z(i12, objArr.length);
                    if (m22737z) {
                        objArr = Arrays.copyOf(objArr, i12);
                    }
                    m22736x = new r93(objArr, this.f20469e, this.f20468d, r6.length - 1, this.f29220b);
                }
                this.f29221c = true;
                this.f20468d = null;
                return m22736x;
            }
            Object obj = this.f29219a[0];
            obj.getClass();
            return new y93(obj);
        }
        return r93.f27144x;
    }
}
