package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.j */
/* loaded from: classes2.dex */
public final class C5778j {

    /* renamed from: a */
    Object[] f33336a = new Object[8];

    /* renamed from: b */
    int f33337b = 0;

    /* renamed from: c */
    C5772i f33338c;

    /* renamed from: a */
    public final C5778j m30298a(Object obj, Object obj2) {
        int i11 = this.f33337b + 1;
        Object[] objArr = this.f33336a;
        int length = objArr.length;
        int i12 = i11 + i11;
        if (i12 > length) {
            int i13 = length + (length >> 1) + 1;
            if (i13 < i12) {
                int highestOneBit = Integer.highestOneBit(i12 - 1);
                i13 = highestOneBit + highestOneBit;
            }
            if (i13 < 0) {
                i13 = Integer.MAX_VALUE;
            }
            this.f33336a = Arrays.copyOf(objArr, i13);
        }
        AbstractC5728b.m30171a(obj, obj2);
        Object[] objArr2 = this.f33336a;
        int i14 = this.f33337b;
        int i15 = i14 + i14;
        objArr2[i15] = obj;
        objArr2[i15 + 1] = obj2;
        this.f33337b = i14 + 1;
        return this;
    }

    /* renamed from: b */
    public final AbstractC5784k m30299b() {
        C5772i c5772i = this.f33338c;
        if (c5772i == null) {
            C5832s m30445f = C5832s.m30445f(this.f33337b, this.f33336a, this);
            C5772i c5772i2 = this.f33338c;
            if (c5772i2 == null) {
                return m30445f;
            }
            throw c5772i2.m30274a();
        }
        throw c5772i.m30274a();
    }
}
