package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
/* loaded from: classes2.dex */
final class C5585s implements Iterator {

    /* renamed from: p */
    private int f32775p = 0;

    /* renamed from: q */
    final /* synthetic */ C5619u f32776q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5585s(C5619u c5619u) {
        this.f32776q = c5619u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i11 = this.f32775p;
        str = this.f32776q.f32817p;
        return i11 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i11 = this.f32775p;
        str = this.f32776q.f32817p;
        if (i11 < str.length()) {
            this.f32775p = i11 + 1;
            return new C5619u(String.valueOf(i11));
        }
        throw new NoSuchElementException();
    }
}
