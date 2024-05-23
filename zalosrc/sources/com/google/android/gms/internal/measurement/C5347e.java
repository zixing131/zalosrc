package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes2.dex */
public final class C5347e implements Iterator {

    /* renamed from: p */
    private int f32347p = 0;

    /* renamed from: q */
    final /* synthetic */ C5364f f32348q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5347e(C5364f c5364f) {
        this.f32348q = c5364f;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f32347p < this.f32348q.m29103l()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f32347p < this.f32348q.m29103l()) {
            C5364f c5364f = this.f32348q;
            int i11 = this.f32347p;
            this.f32347p = i11 + 1;
            return c5364f.m29104m(i11);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f32347p);
    }
}
