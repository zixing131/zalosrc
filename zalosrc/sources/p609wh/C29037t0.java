package p609wh;

import ag0.C0808c0;
import ag0.C0832n;
import hm0.C20096c;
import java.net.HttpURLConnection;
import java.util.Arrays;
import jm0.AbstractC21298h;
import jm0.InterfaceC21299i;
import me0.AbstractC23161o1;
import me0.AbstractC23228u2;
import mm0.AbstractC23350e;
import oh0.C24267b;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import p645xh.C29630g;
import p645xh.C29632i;
import rh0.AbstractC25803k;

/* renamed from: wh.t0 */
/* loaded from: classes.dex */
public class C29037t0 extends AbstractC21298h {

    /* renamed from: J */
    public static final String f134385J = "t0";

    /* renamed from: I */
    public boolean f134386I;

    public C29037t0(InterfaceC21299i interfaceC21299i) {
        super(interfaceC21299i);
        this.f134386I = false;
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: E */
    public String mo51546E() {
        return AbstractC23309i.m121712ac();
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: R */
    public void mo51548R(String str, int i11, String str2, long j11, int i12, int i13) {
        if (this.f103775r == 5) {
            if (i12 >= 0 && i12 < 66000) {
                AbstractC20887g.m109232j(str, i11, str2, j11, i12 + 300000, i13);
            }
        } else {
            AbstractC20887g.m109232j(str, i11, str2, j11, i12, i13);
        }
        AbstractC25803k.m132971k(1, 1, this.f103772o, -1, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jm0.AbstractC21298h
    /* renamed from: T */
    public void mo82640T(HttpURLConnection httpURLConnection) {
        super.mo82640T(httpURLConnection);
        AbstractC23228u2.m119706e(httpURLConnection);
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: V */
    public void mo51549V(JSONObject jSONObject) {
        C29021l0.m144916J().m144997L0(jSONObject);
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: W */
    public void mo110302W(JSONObject jSONObject) {
        super.mo110302W(jSONObject);
        AbstractC25803k.m132971k(1, 1, this.f103772o, jSONObject.length(), null);
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: X */
    public void mo51550X(int i11, String str, String str2) {
        if (i11 == 102) {
            AbstractC23350e.m122774d(f134385J, "Session key error");
            C0832n.m2179i().m2185c();
            int i12 = this.f103764g;
            if (i12 < 1) {
                this.f103764g = i12 + 1;
                C0808c0.m2047c(this);
                return;
            }
            this.f103764g = 0;
        }
        if (this.f103757G != null) {
            if (i11 != 2030 && !this.f134386I) {
                str = "";
            }
            C20096c c20096c = new C20096c(i11, AbstractC23161o1.m119318c(i11, str));
            c20096c.m104494f(str2);
            this.f103757G.mo1342c(c20096c);
        }
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: Y */
    public void mo51551Y() {
        AbstractC23309i.m121215My(System.currentTimeMillis());
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: a0 */
    public void mo51552a0() {
        C0832n.m2179i().m2185c();
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: m0 */
    public void mo51553m0(boolean z11, boolean z12, int i11, int i12, int i13, long j11, String str, long j12, long j13) {
        if (this.f103775r == 5) {
            if (i12 >= 0 && i12 < 66000) {
                AbstractC20887g.m109221H(z11, z12, i11, i12 + 300000, i13, j11, str, j12, j13);
                return;
            }
            return;
        }
        AbstractC20887g.m109221H(z11, z12, i11, i12, i13, j11, str, j12, j13);
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: o */
    public void mo51555o() {
        AbstractC29633j.m147362k();
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: q */
    public void mo51556q(Exception exc) {
        if (this.f103761d) {
            int i11 = this.f103766i;
            if (i11 < this.f103763f) {
                this.f103766i = i11 + 1;
                C0808c0.m2046b(this);
                return;
            } else {
                InterfaceC21299i interfaceC21299i = this.f103757G;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1342c(new C20096c(502, AbstractC23161o1.m119318c(502, "")));
                    return;
                }
                return;
            }
        }
        InterfaceC21299i interfaceC21299i2 = this.f103757G;
        if (interfaceC21299i2 != null) {
            interfaceC21299i2.mo1342c(new C20096c(502, AbstractC23161o1.m119318c(502, "")));
        }
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: s */
    public void mo51557s() {
        try {
            if (this.f103770m == null || C29628e.m147249E0() == null || (!C29628e.m147249E0().m93432x() && !C29628e.m147249E0().m93374B())) {
                InterfaceC21299i interfaceC21299i = this.f103757G;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1342c(new C20096c(50002, AbstractC23161o1.m119318c(50002, "")));
                    return;
                }
                return;
            }
            if (this.f103770m.m93288j() <= 0 && m110288B() > 0) {
                this.f103770m.m93270A(m110288B());
            }
            C29628e.m147249E0().m93413l(this.f103770m, this.f103757G);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: t */
    public void mo51558t() {
        try {
            if (this.f103770m == null || C29630g.m147299E0() == null || (!C29630g.m147299E0().m93432x() && !C29630g.m147299E0().m93374B())) {
                InterfaceC21299i interfaceC21299i = this.f103757G;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1342c(new C20096c(50002, AbstractC23161o1.m119318c(50002, "")));
                    return;
                }
                return;
            }
            if (this.f103770m.m93288j() <= 0 && m110288B() > 0) {
                this.f103770m.m93270A(m110288B());
            }
            C29630g.m147299E0().m93413l(this.f103770m, this.f103757G);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String toString() {
        return "Request{root='" + this.f103751A + "', params=" + Arrays.toString(this.f103754D) + ", values=" + Arrays.toString(this.f103755E) + '}';
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: u */
    public void mo51559u() {
        try {
            if (this.f103770m == null || C29632i.m147326E0() == null || (!C29632i.m147326E0().m93432x() && !C29632i.m147326E0().m93374B())) {
                InterfaceC21299i interfaceC21299i = this.f103757G;
                if (interfaceC21299i != null) {
                    interfaceC21299i.mo1342c(new C20096c(50002, AbstractC23161o1.m119318c(50002, "")));
                    return;
                }
                return;
            }
            if (this.f103770m.m93288j() <= 0 && m110288B() > 0) {
                this.f103770m.m93270A(m110288B());
            }
            C29632i.m147326E0().m93413l(this.f103770m, this.f103757G);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: y */
    public String mo51560y(int i11, String str) {
        return AbstractC23161o1.m119318c(i11, str);
    }

    @Override // jm0.AbstractC21298h
    /* renamed from: z */
    public long mo51561z() {
        return C24267b.m126719j().mo126716g() / 1000;
    }
}
