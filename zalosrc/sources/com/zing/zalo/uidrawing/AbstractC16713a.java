package com.zing.zalo.uidrawing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zing.zalo.uidrawing.a */
/* loaded from: classes4.dex */
public abstract class AbstractC16713a {

    /* renamed from: a */
    C16719g f84686a;

    /* renamed from: b */
    int f84687b;

    public AbstractC16713a(C16719g c16719g, int i11) {
        this.f84686a = c16719g;
        this.f84687b = i11;
    }

    /* renamed from: a */
    public final int m88990a() {
        int i11 = this.f84687b;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return -2147483647;
                    }
                    return mo88991b();
                }
                return mo88993d();
            }
            return mo88994e();
        }
        return mo88992c();
    }

    /* renamed from: b */
    public abstract int mo88991b();

    /* renamed from: c */
    public abstract int mo88992c();

    /* renamed from: d */
    public abstract int mo88993d();

    /* renamed from: e */
    public abstract int mo88994e();

    /* renamed from: f */
    public void m88995f(int i11) {
        this.f84687b = i11;
    }
}
