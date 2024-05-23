package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.wl */
/* loaded from: classes2.dex */
public final class RunnableC5136wl implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C5247zl f29983p;

    /* renamed from: q */
    final /* synthetic */ C4359bm f29984q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5136wl(C4359bm c4359bm, C5247zl c5247zl) {
        this.f29984q = c4359bm;
        this.f29983p = c5247zl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.f29983p.m28540a();
        sparseArray = this.f29984q.f17866C;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray2 = this.f29984q.f17866C;
            ((C4914qm) sparseArray2.valueAt(i11)).m25803i();
        }
    }
}
