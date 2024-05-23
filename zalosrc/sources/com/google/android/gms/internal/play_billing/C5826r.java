package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.r */
/* loaded from: classes2.dex */
final class C5826r extends AbstractC5766h {

    /* renamed from: s */
    private final transient Object[] f33414s;

    /* renamed from: t */
    private final transient int f33415t;

    /* renamed from: u */
    private final transient int f33416u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5826r(Object[] objArr, int i11, int i12) {
        this.f33414s = objArr;
        this.f33415t = i11;
        this.f33416u = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC5727a5.m30166a(i11, this.f33416u, "index");
        Object obj = this.f33414s[i11 + i11 + this.f33415t];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5748e
    /* renamed from: k */
    public final boolean mo30209k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33416u;
    }
}
