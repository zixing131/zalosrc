package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
final class mb3 extends lb3 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f24460a;

    /* renamed from: b */
    final AtomicIntegerFieldUpdater f24461b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mb3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f24460a = atomicReferenceFieldUpdater;
        this.f24461b = atomicIntegerFieldUpdater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lb3
    /* renamed from: a */
    public final int mo24190a(ob3 ob3Var) {
        return this.f24461b.decrementAndGet(ob3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.lb3
    /* renamed from: b */
    public final void mo24191b(ob3 ob3Var, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f24460a;
        while (!ya3.m28173a(atomicReferenceFieldUpdater, ob3Var, null, set2) && atomicReferenceFieldUpdater.get(ob3Var) == null) {
        }
    }
}
