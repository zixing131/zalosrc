package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.t7 */
/* loaded from: classes.dex */
public final class C5610t7 extends AbstractC5559q7 {
    public C5610t7() {
        super(4);
    }

    /* renamed from: a */
    public final C5610t7 m29628a(Object... objArr) {
        AbstractC5288a8.m28881b(objArr, 15);
        int i11 = this.f32745b;
        int i12 = i11 + 15;
        Object[] objArr2 = this.f32744a;
        int length = objArr2.length;
        if (length < i12) {
            int i13 = length + (length >> 1) + 1;
            if (i13 < i12) {
                int highestOneBit = Integer.highestOneBit(i11 + 14);
                i13 = highestOneBit + highestOneBit;
            }
            if (i13 < 0) {
                i13 = Integer.MAX_VALUE;
            }
            this.f32744a = Arrays.copyOf(objArr2, i13);
            this.f32746c = false;
        } else if (this.f32746c) {
            this.f32744a = (Object[]) objArr2.clone();
            this.f32746c = false;
        }
        System.arraycopy(objArr, 0, this.f32744a, this.f32745b, 15);
        this.f32745b += 15;
        return this;
    }

    /* renamed from: b */
    public final AbstractC5678x7 m29629b() {
        this.f32746c = true;
        return AbstractC5678x7.m30015l(this.f32744a, this.f32745b);
    }
}
