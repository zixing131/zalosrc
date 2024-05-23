package com.google.android.gms.internal.play_billing;

import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.g */
/* loaded from: classes2.dex */
public final class C5760g extends AbstractC5766h {

    /* renamed from: s */
    final transient int f33316s;

    /* renamed from: t */
    final transient int f33317t;

    /* renamed from: u */
    final /* synthetic */ AbstractC5766h f33318u;

    public C5760g(AbstractC5766h abstractC5766h, int i11, int i12) {
        this.f33318u = abstractC5766h;
        this.f33316s = i11;
        this.f33317t = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: e */
    final int mo30206e() {
        return this.f33318u.mo30207g() + this.f33316s + this.f33317t;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: g */
    public final int mo30207g() {
        return this.f33318u.mo30207g() + this.f33316s;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC5727a5.m30166a(i11, this.f33317t, "index");
        return this.f33318u.get(i11 + this.f33316s);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: k */
    public final boolean mo30209k() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: l */
    public final Object[] mo30210l() {
        return this.f33318u.mo30210l();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5766h
    /* renamed from: m */
    public final AbstractC5766h subList(int i11, int i12) {
        AbstractC5727a5.m30169d(i11, i12, this.f33317t);
        int i13 = this.f33316s;
        return this.f33318u.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33317t;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5766h, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
