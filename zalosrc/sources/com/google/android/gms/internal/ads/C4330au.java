package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.au */
/* loaded from: classes2.dex */
public final class C4330au {

    /* renamed from: i */
    public static final C4330au f17242i = new C4787n7().m24858c();

    /* renamed from: j */
    public static final g94 f17243j = new g94() { // from class: com.google.android.gms.internal.ads.l5
    };

    /* renamed from: a */
    public final String f17244a;

    /* renamed from: b */
    public final AbstractC4432dm f17245b;

    /* renamed from: c */
    public final C5212yn f17246c;

    /* renamed from: d */
    public final C4688kk f17247d;

    /* renamed from: e */
    public final f00 f17248e;

    /* renamed from: f */
    public final AbstractC4569hb f17249f;

    /* renamed from: g */
    public final C4644jd f17250g;

    /* renamed from: h */
    public final C5252zq f17251h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4330au(String str, C4644jd c4644jd, C5212yn c5212yn, C4688kk c4688kk, f00 f00Var, C5252zq c5252zq, AbstractC5217ys abstractC5217ys) {
        this.f17244a = str;
        this.f17245b = c5212yn;
        this.f17246c = c5212yn;
        this.f17247d = c4688kk;
        this.f17248e = f00Var;
        this.f17249f = c4644jd;
        this.f17250g = c4644jd;
        this.f17251h = c5252zq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4330au)) {
            return false;
        }
        C4330au c4330au = (C4330au) obj;
        if (g92.m22362t(this.f17244a, c4330au.f17244a) && this.f17249f.equals(c4330au.f17249f) && g92.m22362t(this.f17245b, c4330au.f17245b) && g92.m22362t(this.f17247d, c4330au.f17247d) && g92.m22362t(this.f17248e, c4330au.f17248e) && g92.m22362t(this.f17251h, c4330au.f17251h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = this.f17244a.hashCode() * 31;
        AbstractC4432dm abstractC4432dm = this.f17245b;
        if (abstractC4432dm != null) {
            i11 = abstractC4432dm.hashCode();
        } else {
            i11 = 0;
        }
        return (((((((hashCode + i11) * 31) + this.f17247d.hashCode()) * 31) + this.f17249f.hashCode()) * 31) + this.f17248e.hashCode()) * 31;
    }
}
