package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.e0 */
/* loaded from: classes2.dex */
final class C5749e0 extends AbstractC5761g0 {

    /* renamed from: p */
    private int f33309p = 0;

    /* renamed from: q */
    private final int f33310q;

    /* renamed from: r */
    final /* synthetic */ AbstractC5803n0 f33311r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5749e0(AbstractC5803n0 abstractC5803n0) {
        this.f33311r = abstractC5803n0;
        this.f33310q = abstractC5803n0.mo30241g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33309p < this.f33310q;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5773i0
    public final byte zza() {
        int i11 = this.f33309p;
        if (i11 < this.f33310q) {
            this.f33309p = i11 + 1;
            return this.f33311r.mo30240e(i11);
        }
        throw new NoSuchElementException();
    }
}
