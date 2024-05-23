package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.play_billing.q */
/* loaded from: classes2.dex */
final class C5820q extends AbstractC5790l {

    /* renamed from: r */
    private final transient AbstractC5784k f33408r;

    /* renamed from: s */
    private final transient AbstractC5766h f33409s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5820q(AbstractC5784k abstractC5784k, AbstractC5766h abstractC5766h) {
        this.f33408r = abstractC5784k;
        this.f33409s = abstractC5766h;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f33408r.get(obj) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: d */
    public final int mo30205d(Object[] objArr, int i11) {
        return this.f33409s.mo30205d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f33409s.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5790l, com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: j */
    public final AbstractC5766h mo30208j() {
        return this.f33409s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33408r.size();
    }
}
