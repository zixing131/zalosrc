package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
final class ra3 extends na3 {

    /* renamed from: a */
    final AtomicReferenceFieldUpdater f27155a;

    /* renamed from: b */
    final AtomicReferenceFieldUpdater f27156b;

    /* renamed from: c */
    final AtomicReferenceFieldUpdater f27157c;

    /* renamed from: d */
    final AtomicReferenceFieldUpdater f27158d;

    /* renamed from: e */
    final AtomicReferenceFieldUpdater f27159e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ra3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f27155a = atomicReferenceFieldUpdater;
        this.f27156b = atomicReferenceFieldUpdater2;
        this.f27157c = atomicReferenceFieldUpdater3;
        this.f27158d = atomicReferenceFieldUpdater4;
        this.f27159e = atomicReferenceFieldUpdater5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: a */
    public final qa3 mo24875a(ma3 ma3Var, qa3 qa3Var) {
        return (qa3) this.f27158d.getAndSet(ma3Var, qa3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: b */
    public final xa3 mo24876b(ma3 ma3Var, xa3 xa3Var) {
        return (xa3) this.f27157c.getAndSet(ma3Var, xa3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: c */
    public final void mo24877c(xa3 xa3Var, xa3 xa3Var2) {
        this.f27156b.lazySet(xa3Var, xa3Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: d */
    public final void mo24878d(xa3 xa3Var, Thread thread) {
        this.f27155a.lazySet(xa3Var, thread);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: e */
    public final boolean mo24879e(ma3 ma3Var, qa3 qa3Var, qa3 qa3Var2) {
        return za3.m28463a(this.f27158d, ma3Var, qa3Var, qa3Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: f */
    public final boolean mo24880f(ma3 ma3Var, Object obj, Object obj2) {
        return za3.m28463a(this.f27159e, ma3Var, obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: g */
    public final boolean mo24881g(ma3 ma3Var, xa3 xa3Var, xa3 xa3Var2) {
        return za3.m28463a(this.f27157c, ma3Var, xa3Var, xa3Var2);
    }
}
