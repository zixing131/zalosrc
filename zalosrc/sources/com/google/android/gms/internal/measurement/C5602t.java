package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t */
/* loaded from: classes2.dex */
final class C5602t implements Iterator {

    /* renamed from: p */
    private int f32795p = 0;

    /* renamed from: q */
    final /* synthetic */ C5619u f32796q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5602t(C5619u c5619u) {
        this.f32796q = c5619u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i11 = this.f32795p;
        str = this.f32796q.f32817p;
        return i11 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i11 = this.f32795p;
        C5619u c5619u = this.f32796q;
        str = c5619u.f32817p;
        if (i11 < str.length()) {
            str2 = c5619u.f32817p;
            this.f32795p = i11 + 1;
            return new C5619u(String.valueOf(str2.charAt(i11)));
        }
        throw new NoSuchElementException();
    }
}
