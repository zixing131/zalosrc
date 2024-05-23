package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class ff3 {

    /* renamed from: a */
    private int f20106a;

    /* renamed from: a */
    public final void m22004a(int i11) {
        this.f20106a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo20090b() {
        this.f20106a = 0;
    }

    /* renamed from: c */
    public final void m22005c(int i11) {
        this.f20106a = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean m22006d(int i11) {
        return (this.f20106a & i11) == i11;
    }

    /* renamed from: e */
    public final boolean m22007e() {
        return m22006d(268435456);
    }

    /* renamed from: f */
    public final boolean m22008f() {
        return m22006d(Integer.MIN_VALUE);
    }

    /* renamed from: g */
    public final boolean m22009g() {
        return m22006d(4);
    }

    /* renamed from: h */
    public final boolean m22010h() {
        return m22006d(1);
    }
}
