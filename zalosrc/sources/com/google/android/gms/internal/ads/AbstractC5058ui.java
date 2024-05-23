package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ui */
/* loaded from: classes2.dex */
public abstract class AbstractC5058ui {

    /* renamed from: a */
    private int f28919a;

    /* renamed from: a */
    public final void m26967a(int i11) {
        this.f28919a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo20906b() {
        this.f28919a = 0;
    }

    /* renamed from: c */
    public final void m26968c(int i11) {
        this.f28919a = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean m26969d(int i11) {
        return (this.f28919a & i11) == i11;
    }

    /* renamed from: e */
    public final boolean m26970e() {
        return m26969d(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final boolean m26971f() {
        return m26969d(4);
    }

    /* renamed from: g */
    public final boolean m26972g() {
        return m26969d(1);
    }
}
