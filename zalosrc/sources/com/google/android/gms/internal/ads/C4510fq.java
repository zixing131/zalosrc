package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.fq */
/* loaded from: classes2.dex */
public final class C4510fq {

    /* renamed from: a */
    private final int f20226a;

    /* renamed from: b */
    private final int f20227b;

    /* renamed from: c */
    private final int f20228c;

    /* renamed from: d */
    private final boolean f20229d;

    /* renamed from: e */
    private final C5066uq f20230e;

    /* renamed from: f */
    private final C4400cr f20231f;

    /* renamed from: n */
    private int f20239n;

    /* renamed from: g */
    private final Object f20232g = new Object();

    /* renamed from: h */
    private final ArrayList f20233h = new ArrayList();

    /* renamed from: i */
    private final ArrayList f20234i = new ArrayList();

    /* renamed from: j */
    private final ArrayList f20235j = new ArrayList();

    /* renamed from: k */
    private int f20236k = 0;

    /* renamed from: l */
    private int f20237l = 0;

    /* renamed from: m */
    private int f20238m = 0;

    /* renamed from: o */
    private String f20240o = "";

    /* renamed from: p */
    private String f20241p = "";

    /* renamed from: q */
    private String f20242q = "";

    public C4510fq(int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11) {
        this.f20226a = i11;
        this.f20227b = i12;
        this.f20228c = i13;
        this.f20229d = z11;
        this.f20230e = new C5066uq(i14);
        this.f20231f = new C4400cr(i15, i16, i17);
    }

    /* renamed from: p */
    private final void m22121p(String str, boolean z11, float f11, float f12, float f13, float f14) {
        if (str != null && str.length() >= this.f20228c) {
            synchronized (this.f20232g) {
                try {
                    this.f20233h.add(str);
                    this.f20236k += str.length();
                    if (z11) {
                        this.f20234i.add(str);
                        this.f20235j.add(new C4918qq(f11, f12, f13, f14, this.f20234i.size() - 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: q */
    private static final String m22122q(ArrayList arrayList, int i11) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            sb2.append((String) arrayList.get(i12));
            sb2.append(' ');
            i12++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String sb3 = sb2.toString();
        if (sb3.length() < 100) {
            return sb3;
        }
        return sb3.substring(0, 100);
    }

    /* renamed from: a */
    final int m22123a(int i11, int i12) {
        return this.f20229d ? this.f20227b : (i11 * this.f20226a) + (i12 * this.f20227b);
    }

    /* renamed from: b */
    public final int m22124b() {
        return this.f20239n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final int m22125c() {
        return this.f20236k;
    }

    /* renamed from: d */
    public final String m22126d() {
        return this.f20240o;
    }

    /* renamed from: e */
    public final String m22127e() {
        return this.f20241p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4510fq)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C4510fq) obj).f20240o;
        if (str == null || !str.equals(this.f20240o)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String m22128f() {
        return this.f20242q;
    }

    /* renamed from: g */
    public final void m22129g() {
        synchronized (this.f20232g) {
            this.f20238m--;
        }
    }

    /* renamed from: h */
    public final void m22130h() {
        synchronized (this.f20232g) {
            this.f20238m++;
        }
    }

    public final int hashCode() {
        return this.f20240o.hashCode();
    }

    /* renamed from: i */
    public final void m22131i() {
        synchronized (this.f20232g) {
            this.f20239n -= 100;
        }
    }

    /* renamed from: j */
    public final void m22132j(int i11) {
        this.f20237l = i11;
    }

    /* renamed from: k */
    public final void m22133k(String str, boolean z11, float f11, float f12, float f13, float f14) {
        m22121p(str, z11, f11, f12, f13, f14);
    }

    /* renamed from: l */
    public final void m22134l(String str, boolean z11, float f11, float f12, float f13, float f14) {
        m22121p(str, z11, f11, f12, f13, f14);
        synchronized (this.f20232g) {
            try {
                if (this.f20238m < 0) {
                    yk0.zze("ActivityContent: negative number of WebViews.");
                }
                m22135m();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public final void m22135m() {
        synchronized (this.f20232g) {
            try {
                int m22123a = m22123a(this.f20236k, this.f20237l);
                if (m22123a > this.f20239n) {
                    this.f20239n = m22123a;
                    if (!zzt.zzo().m22936h().zzM()) {
                        this.f20240o = this.f20230e.m27041a(this.f20233h);
                        this.f20241p = this.f20230e.m27041a(this.f20234i);
                    }
                    if (!zzt.zzo().m22936h().zzN()) {
                        this.f20242q = this.f20231f.m20990a(this.f20234i, this.f20235j);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public final void m22136n() {
        synchronized (this.f20232g) {
            try {
                int m22123a = m22123a(this.f20236k, this.f20237l);
                if (m22123a > this.f20239n) {
                    this.f20239n = m22123a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    public final boolean m22137o() {
        boolean z11;
        synchronized (this.f20232g) {
            if (this.f20238m == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    public final String toString() {
        return "ActivityContent fetchId: " + this.f20237l + " score:" + this.f20239n + " total_length:" + this.f20236k + "\n text: " + m22122q(this.f20233h, 100) + "\n viewableText" + m22122q(this.f20234i, 100) + "\n signture: " + this.f20240o + "\n viewableSignture: " + this.f20241p + "\n viewableSignatureForVertical: " + this.f20242q;
    }
}
