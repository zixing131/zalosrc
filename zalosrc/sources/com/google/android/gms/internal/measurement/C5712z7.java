package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.z7 */
/* loaded from: classes2.dex */
final class C5712z7 extends AbstractC5356e8 {

    /* renamed from: p */
    boolean f32957p;

    /* renamed from: q */
    final /* synthetic */ Object f32958q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5712z7(Object obj) {
        this.f32958q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f32957p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f32957p) {
            this.f32957p = true;
            return this.f32958q;
        }
        throw new NoSuchElementException();
    }
}
