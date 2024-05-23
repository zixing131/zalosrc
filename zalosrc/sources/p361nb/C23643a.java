package p361nb;

import sb.AbstractC26216b;

/* renamed from: nb.a */
/* loaded from: classes.dex */
public class C23643a {

    /* renamed from: a */
    public String f114533a;

    /* renamed from: b */
    public String f114534b;

    /* renamed from: c */
    public long f114535c;

    /* renamed from: d */
    public long f114536d;

    /* renamed from: e */
    public boolean f114537e;

    /* renamed from: f */
    public long f114538f;

    /* renamed from: g */
    public String f114539g;

    public C23643a(String str, String str2) {
        this.f114533a = "";
        this.f114534b = "";
        this.f114537e = false;
        this.f114538f = 0L;
        this.f114539g = "";
        if (str != null) {
            this.f114533a = str;
        }
        if (str2 != null) {
            this.f114534b = str2;
        }
    }

    /* renamed from: a */
    public void m123887a() {
        this.f114537e = true;
        long nanoTime = System.nanoTime();
        this.f114536d = nanoTime;
        if (AbstractC23647d.f114547a != 1) {
            this.f114538f = AbstractC26216b.m134774b(this.f114535c, nanoTime);
        } else {
            this.f114538f = 0L;
        }
    }

    /* renamed from: b */
    public void m123888b() {
        this.f114535c = System.nanoTime();
    }

    public C23643a(String str, String str2, String str3) {
        this.f114533a = "";
        this.f114534b = "";
        this.f114537e = false;
        this.f114538f = 0L;
        this.f114539g = "";
        if (str != null) {
            this.f114533a = str;
        }
        if (str2 != null) {
            this.f114534b = str2;
        }
        if (str3 != null) {
            this.f114539g = str3;
        }
    }

    public C23643a(String str, String str2, long j11, boolean z11, String str3) {
        this.f114533a = "";
        this.f114534b = "";
        this.f114537e = false;
        this.f114538f = 0L;
        this.f114539g = "";
        if (str2 != null) {
            this.f114534b = str2;
        }
        if (str != null) {
            this.f114533a = str;
        }
        this.f114538f = j11;
        this.f114537e = z11;
        this.f114539g = str3;
    }
}
