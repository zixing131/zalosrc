package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.um */
/* loaded from: classes2.dex */
public final class C5062um extends AbstractC4983sh {

    /* renamed from: d */
    private static final Object f28980d = new Object();

    /* renamed from: b */
    private final long f28981b;

    /* renamed from: c */
    private final long f28982c;

    public C5062um(long j11, boolean z11) {
        this.f28981b = j11;
        this.f28982c = j11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4983sh
    /* renamed from: a */
    public final int mo25464a(Object obj) {
        if (f28980d.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4983sh
    /* renamed from: b */
    public final int mo25465b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4983sh
    /* renamed from: c */
    public final int mo25466c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4983sh
    /* renamed from: d */
    public final C4909qh mo25467d(int i11, C4909qh c4909qh, boolean z11) {
        Object obj;
        AbstractC4361bo.m20609a(i11, 0, 1);
        if (z11) {
            obj = f28980d;
        } else {
            obj = null;
        }
        long j11 = this.f28981b;
        c4909qh.f26776a = obj;
        c4909qh.f26777b = obj;
        c4909qh.f26778c = j11;
        return c4909qh;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4983sh
    /* renamed from: e */
    public final C4946rh mo25468e(int i11, C4946rh c4946rh, boolean z11, long j11) {
        AbstractC4361bo.m20609a(i11, 0, 1);
        c4946rh.f27213a = this.f28982c;
        return c4946rh;
    }
}
