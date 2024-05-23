package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.n8 */
/* loaded from: classes2.dex */
final class C5509n8 extends AbstractC5543p8 {

    /* renamed from: p */
    private int f32629p = 0;

    /* renamed from: q */
    private final int f32630q;

    /* renamed from: r */
    final /* synthetic */ AbstractC5679x8 f32631r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5509n8(AbstractC5679x8 abstractC5679x8) {
        this.f32631r = abstractC5679x8;
        this.f32630q = abstractC5679x8.mo29551g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32629p < this.f32630q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5577r8
    public final byte zza() {
        int i11 = this.f32629p;
        if (i11 < this.f32630q) {
            this.f32629p = i11 + 1;
            return this.f32631r.mo29550e(i11);
        }
        throw new NoSuchElementException();
    }
}
