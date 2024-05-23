package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r8 */
/* loaded from: classes2.dex */
public final class C4937r8 {

    /* renamed from: a */
    public final Object f27133a;

    /* renamed from: b */
    public final C5196y7 f27134b;

    /* renamed from: c */
    public final zzakm f27135c;

    /* renamed from: d */
    public boolean f27136d;

    private C4937r8(zzakm zzakmVar) {
        this.f27136d = false;
        this.f27133a = null;
        this.f27134b = null;
        this.f27135c = zzakmVar;
    }

    /* renamed from: a */
    public static C4937r8 m25990a(zzakm zzakmVar) {
        return new C4937r8(zzakmVar);
    }

    /* renamed from: b */
    public static C4937r8 m25991b(Object obj, C5196y7 c5196y7) {
        return new C4937r8(obj, c5196y7);
    }

    /* renamed from: c */
    public final boolean m25992c() {
        return this.f27135c == null;
    }

    private C4937r8(Object obj, C5196y7 c5196y7) {
        this.f27136d = false;
        this.f27133a = obj;
        this.f27134b = c5196y7;
        this.f27135c = null;
    }
}
