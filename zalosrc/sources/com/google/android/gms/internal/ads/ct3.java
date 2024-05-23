package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ct3 extends et3 {

    /* renamed from: p */
    private int f18542p = 0;

    /* renamed from: q */
    private final int f18543q;

    /* renamed from: r */
    final /* synthetic */ mt3 f18544r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ct3(mt3 mt3Var) {
        this.f18544r = mt3Var;
        this.f18543q = mt3Var.mo22168p();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18542p < this.f18543q;
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final byte zza() {
        int i11 = this.f18542p;
        if (i11 < this.f18543q) {
            this.f18542p = i11 + 1;
            return this.f18544r.mo22167m(i11);
        }
        throw new NoSuchElementException();
    }
}
