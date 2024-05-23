package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.n */
/* loaded from: classes2.dex */
public final class C5802n extends AbstractC5766h {

    /* renamed from: u */
    static final AbstractC5766h f33368u = new C5802n(new Object[0], 0);

    /* renamed from: s */
    final transient Object[] f33369s;

    /* renamed from: t */
    private final transient int f33370t;

    public C5802n(Object[] objArr, int i11) {
        this.f33369s = objArr;
        this.f33370t = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5766h, com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: d */
    public final int mo30205d(Object[] objArr, int i11) {
        System.arraycopy(this.f33369s, 0, objArr, 0, this.f33370t);
        return this.f33370t;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: e */
    final int mo30206e() {
        return this.f33370t;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: g */
    public final int mo30207g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC5727a5.m30166a(i11, this.f33370t, "index");
        Object obj = this.f33369s[i11];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: k */
    public final boolean mo30209k() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: l */
    public final Object[] mo30210l() {
        return this.f33369s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33370t;
    }
}
