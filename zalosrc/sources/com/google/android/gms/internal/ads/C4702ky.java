package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ky */
/* loaded from: classes2.dex */
public class C4702ky {

    /* renamed from: a */
    private final String f23641a;

    /* renamed from: b */
    private final Object f23642b;

    /* renamed from: c */
    private final int f23643c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C4702ky(String str, Object obj, int i11) {
        this.f23641a = str;
        this.f23642b = obj;
        this.f23643c = i11;
    }

    /* renamed from: a */
    public static C4702ky m24087a(String str, double d11) {
        return new C4702ky(str, Double.valueOf(d11), 3);
    }

    /* renamed from: b */
    public static C4702ky m24088b(String str, long j11) {
        return new C4702ky(str, Long.valueOf(j11), 2);
    }

    /* renamed from: c */
    public static C4702ky m24089c(String str, String str2) {
        return new C4702ky(str, str2, 4);
    }

    /* renamed from: d */
    public static C4702ky m24090d(String str, boolean z11) {
        return new C4702ky(str, Boolean.valueOf(z11), 1);
    }

    /* renamed from: e */
    public final Object m24091e() {
        InterfaceC4852oz m25920a = AbstractC4927qz.m25920a();
        if (m25920a == null) {
            AbstractC4927qz.m25921b();
            return this.f23642b;
        }
        int i11 = this.f23643c - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return m25920a.mo21233a(this.f23641a, (String) this.f23642b);
                }
                return m25920a.mo21234b(this.f23641a, ((Double) this.f23642b).doubleValue());
            }
            return m25920a.mo21235c(this.f23641a, ((Long) this.f23642b).longValue());
        }
        return m25920a.mo21236d(this.f23641a, ((Boolean) this.f23642b).booleanValue());
    }
}
