package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b7 */
/* loaded from: classes2.dex */
public final class C4344b7 {

    /* renamed from: a */
    private final String f17634a;

    /* renamed from: b */
    private final int f17635b;

    /* renamed from: c */
    private final int f17636c;

    /* renamed from: d */
    private int f17637d;

    /* renamed from: e */
    private String f17638e;

    public C4344b7(int i11, int i12, int i13) {
        String str;
        if (i11 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i11 + "/";
        }
        this.f17634a = str;
        this.f17635b = i12;
        this.f17636c = i13;
        this.f17637d = Integer.MIN_VALUE;
        this.f17638e = "";
    }

    /* renamed from: d */
    private final void m20417d() {
        if (this.f17637d != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    public final int m20418a() {
        m20417d();
        return this.f17637d;
    }

    /* renamed from: b */
    public final String m20419b() {
        m20417d();
        return this.f17638e;
    }

    /* renamed from: c */
    public final void m20420c() {
        int i11;
        int i12 = this.f17637d;
        if (i12 == Integer.MIN_VALUE) {
            i11 = this.f17635b;
        } else {
            i11 = i12 + this.f17636c;
        }
        this.f17637d = i11;
        this.f17638e = this.f17634a + i11;
    }
}
