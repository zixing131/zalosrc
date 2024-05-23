package be;

import ag0.C0816f;
import hm0.C20096c;
import hm0.InterfaceC20098e;
import me0.AbstractC23161o1;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.C23307g;
import p461qu.AbstractC25495a;

/* renamed from: be.d */
/* loaded from: classes3.dex */
public class C2775d {

    /* renamed from: d */
    InterfaceC20098e f11022d;

    /* renamed from: e */
    C23307g f11023e;

    /* renamed from: f */
    int f11024f;

    /* renamed from: h */
    long f11026h;

    /* renamed from: j */
    boolean f11028j;

    /* renamed from: a */
    public final String f11019a = getClass().getSimpleName();

    /* renamed from: b */
    boolean f11020b = false;

    /* renamed from: c */
    C2774c f11021c = null;

    /* renamed from: g */
    int f11025g = -1;

    /* renamed from: i */
    boolean f11027i = false;

    /* renamed from: k */
    InterfaceC20098e f11029k = new a();

    /* renamed from: be.d$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC20098e {
        a() {
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            InterfaceC20098e interfaceC20098e = C2775d.this.f11022d;
            if (interfaceC20098e != null) {
                interfaceC20098e.mo2128a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject((String) obj);
                int i11 = jSONObject.getInt("error_code");
                if (i11 == 0) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    C2775d.this.m13372a(jSONObject2);
                    InterfaceC20098e interfaceC20098e = C2775d.this.f11022d;
                    if (interfaceC20098e != null) {
                        interfaceC20098e.mo2129b(jSONObject2);
                    }
                } else {
                    InterfaceC20098e interfaceC20098e2 = C2775d.this.f11022d;
                    if (interfaceC20098e2 != null) {
                        interfaceC20098e2.mo2128a(new C20096c(i11, AbstractC23161o1.m119318c(i11, "")));
                    }
                }
            } catch (Exception e11) {
                InterfaceC20098e interfaceC20098e3 = C2775d.this.f11022d;
                if (interfaceC20098e3 != null) {
                    interfaceC20098e3.mo2128a(new C20096c(502, AbstractC23161o1.m119318c(502, "")));
                }
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
            InterfaceC20098e interfaceC20098e = C2775d.this.f11022d;
            if (interfaceC20098e != null) {
                interfaceC20098e.mo2130c(j11, str);
            }
        }
    }

    public C2775d(int i11, long j11, boolean z11) {
        this.f11024f = 0;
        this.f11024f = i11;
        this.f11026h = j11;
        this.f11028j = z11;
    }

    /* renamed from: a */
    void m13372a(JSONObject jSONObject) {
        C23307g c23307g;
        try {
            C2774c c2774c = this.f11021c;
            if (c2774c != null) {
                int m13357m = c2774c.m13357m();
                if ((m13357m == 1 || m13357m == 6) && this.f11027i && (c23307g = this.f11023e) != null) {
                    jSONObject.put("photo_info", c23307g.m120735a());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m13373b(byte[] bArr) {
        C2774c c2774c = this.f11021c;
        if (c2774c != null) {
            c2774c.m13353d(bArr);
        }
    }

    /* renamed from: c */
    public void m13374c(byte[] bArr, long j11, int i11) {
        if (this.f11021c != null) {
            m13380i(true);
            this.f11021c.m13354e(bArr, j11, i11);
        }
    }

    /* renamed from: d */
    public void m13375d() {
        C2774c c2774c = this.f11021c;
        if (c2774c != null) {
            c2774c.m13362t(true);
        }
        this.f11021c = null;
        this.f11022d = null;
    }

    /* renamed from: e */
    public int m13376e() {
        return this.f11021c.m13358n();
    }

    /* renamed from: f */
    public int m13377f() {
        return this.f11021c.m13359o();
    }

    /* renamed from: g */
    public boolean m13378g() {
        return this.f11020b;
    }

    /* renamed from: h */
    public void m13379h(InterfaceC20098e interfaceC20098e) {
        this.f11022d = interfaceC20098e;
    }

    /* renamed from: i */
    public void m13380i(boolean z11) {
        this.f11020b = z11;
    }

    /* renamed from: j */
    public void m13381j(String str, boolean z11, String str2) {
        int i11;
        int i12;
        try {
            if (AbstractC25495a.m132079d(str)) {
                i11 = 6;
            } else {
                i11 = 3;
            }
            if (z11) {
                i12 = 761;
            } else {
                i12 = 167;
            }
            C2774c c2774c = new C2774c(this.f11024f, AbstractC25495a.m132089n(str), 12, str2, (short) i12, i11, this.f11026h, this.f11028j);
            this.f11021c = c2774c;
            c2774c.m13366x(this.f11029k);
            this.f11025g = this.f11021c.m13357m();
            if (C23055e5.m118272g(true)) {
                C0816f.m2132b(this.f11021c);
            } else {
                InterfaceC20098e interfaceC20098e = this.f11022d;
                if (interfaceC20098e != null) {
                    interfaceC20098e.mo2128a(new C20096c(502, AbstractC23161o1.m119318c(502, "")));
                }
            }
        } catch (Exception e11) {
            InterfaceC20098e interfaceC20098e2 = this.f11022d;
            if (interfaceC20098e2 != null) {
                interfaceC20098e2.mo2128a(new C20096c(502, AbstractC23161o1.m119318c(502, "")));
            }
            AbstractC23350e.m122774d(this.f11019a, "[Error ReqsUploadSocket doUpload] " + e11);
            e11.printStackTrace();
        }
    }
}
