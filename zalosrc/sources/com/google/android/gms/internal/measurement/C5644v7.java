package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.v7 */
/* loaded from: classes2.dex */
public final class C5644v7 extends AbstractC5678x7 {

    /* renamed from: s */
    final transient int f32851s;

    /* renamed from: t */
    final transient int f32852t;

    /* renamed from: u */
    final /* synthetic */ AbstractC5678x7 f32853u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5644v7(AbstractC5678x7 abstractC5678x7, int i11, int i12) {
        this.f32853u = abstractC5678x7;
        this.f32851s = i11;
        this.f32852t = i12;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: e */
    final int mo28946e() {
        return this.f32853u.mo28947g() + this.f32851s + this.f32852t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: g */
    public final int mo28947g() {
        return this.f32853u.mo28947g() + this.f32851s;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC5372f7.m29135a(i11, this.f32852t, "index");
        return this.f32853u.get(i11 + this.f32851s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: j */
    public final Object[] mo28948j() {
        return this.f32853u.mo28948j();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5678x7
    /* renamed from: k */
    public final AbstractC5678x7 subList(int i11, int i12) {
        AbstractC5372f7.m29137c(i11, i12, this.f32852t);
        AbstractC5678x7 abstractC5678x7 = this.f32853u;
        int i13 = this.f32851s;
        return abstractC5678x7.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32852t;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5678x7, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
