package p109ds;

import android.content.Context;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bo.C3020p0;
import bo.C3039t0;
import bo.C3051w0;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p084cs.AbstractC17569c;
import p084cs.C17567a;
import p084cs.C17570d;
import p691yr.C31060j;
import p726zr.C32546b;
import ti0.C26703b;
import ti0.C26705d;
import ti0.C26707f;

/* renamed from: ds.d */
/* loaded from: classes4.dex */
public class C18065d extends C16716d {

    /* renamed from: M0 */
    private C16716d f91462M0;

    /* renamed from: N0 */
    private C18063b f91463N0;

    /* renamed from: O0 */
    private C18064c f91464O0;

    /* renamed from: P0 */
    private C22126c0 f91465P0;

    /* renamed from: Q0 */
    private C22126c0 f91466Q0;

    /* renamed from: R0 */
    private final C13704p1 f91467R0;

    /* renamed from: S0 */
    private final int f91468S0;

    public C18065d(Context context, int i11) {
        super(context);
        this.f91467R0 = new C13704p1(1);
        m96047w1(context);
        this.f91468S0 = i11;
    }

    /* renamed from: A1 */
    private boolean m96040A1(String str, int i11) {
        int i12;
        C22126c0 c22126c0 = this.f91466Q0;
        if (c22126c0 != null) {
            c22126c0.m111959G1(str);
            C22126c0 c22126c02 = this.f91466Q0;
            if (i11 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            c22126c02.mo44614b1(i12);
        }
        if (i11 <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: B1 */
    private boolean m96041B1(C3051w0 c3051w0, C32546b c32546b, String str, boolean z11, int i11) {
        List arrayList;
        String str2;
        boolean z12;
        if (c3051w0 != null && c3051w0.m14637a()) {
            arrayList = AbstractC20826v0.m108792W0(c3051w0.f12301a);
        } else {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        if (getContext() != null) {
            str2 = AbstractC17569c.Companion.m93559b(new C17570d(getContext()), z11, list, i11, this.f91468S0);
        } else {
            str2 = "";
        }
        m96044r1(str2, str, c32546b, z11, i11);
        int i12 = 0;
        if (!z11 && i11 <= 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        C16716d c16716d = this.f91462M0;
        if (c16716d != null) {
            if (!z12) {
                i12 = 8;
            }
            c16716d.mo44614b1(i12);
        }
        return z12;
    }

    /* renamed from: o1 */
    private void m96042o1(boolean z11, C32546b c32546b) {
        List m150943l;
        C18063b c18063b = this.f91463N0;
        if (c18063b == null) {
            return;
        }
        if (z11) {
            if (c32546b != null) {
                m150943l = c32546b.m157606b();
            } else {
                m150943l = C31060j.f143193a.m150943l();
            }
            c18063b.m96028o1(m150943l);
            return;
        }
        c18063b.m96028o1(new ArrayList());
    }

    /* renamed from: p1 */
    private void m96043p1(int i11, boolean z11, C32546b c32546b, C3051w0 c3051w0) {
        C18064c c18064c = this.f91464O0;
        if (c18064c == null) {
            return;
        }
        if (i11 <= 0 && !z11) {
            c18064c.m96030p1(new ArrayList());
        } else {
            this.f91464O0.m96030p1(new C18062a().m96027b(z11, i11, c3051w0, c32546b, C31060j.f143193a.m150937S(this.f91468S0)));
        }
    }

    /* renamed from: r1 */
    private void m96044r1(String str, String str2, C32546b c32546b, boolean z11, int i11) {
        int i12;
        float measureText = this.f91467R0.measureText(str);
        float measureText2 = this.f91467R0.measureText(str2);
        if (c32546b != null) {
            i12 = c32546b.m157606b().size();
        } else {
            i12 = 0;
        }
        if (this.f91465P0 != null && getContext() != null) {
            C17567a c17567a = new C17567a();
            c17567a.m93550a(this.f91467R0, new C17570d(getContext()), measureText, measureText2, z11, i11);
            this.f91465P0.m111959G1(c17567a.m93551c(this.f91468S0, i12, str));
        }
    }

    /* renamed from: s1 */
    private void m96045s1() {
        C16719g c16719g;
        if (this.f91463N0 != null && this.f91464O0 != null) {
            if (C31060j.m150913U()) {
                this.f91464O0.mo44614b1(0);
                this.f91463N0.mo44614b1(8);
                c16719g = this.f91464O0;
            } else {
                this.f91463N0.mo44614b1(0);
                this.f91464O0.mo44614b1(8);
                c16719g = this.f91463N0;
            }
            C22126c0 c22126c0 = this.f91465P0;
            if (c22126c0 != null) {
                c22126c0.m89106L().m89054h0(c16719g);
            }
        }
    }

    /* renamed from: v1 */
    private void m96046v1(boolean z11, boolean z12) {
        C22126c0 c22126c0 = this.f91466Q0;
        if (c22126c0 != null) {
            if (z11 && !z12) {
                c22126c0.m89106L().m89017A(Boolean.FALSE).m89073z(Boolean.TRUE);
            } else {
                c22126c0.m89106L().m89073z(Boolean.FALSE).m89017A(Boolean.TRUE);
            }
        }
    }

    /* renamed from: w1 */
    private void m96047w1(Context context) {
        this.f91462M0 = new C16716d(context);
        this.f91463N0 = new C18063b(context);
        this.f91464O0 = new C18064c(context);
        this.f91465P0 = new C22126c0(context);
        this.f91466Q0 = new C22126c0(context);
        C26703b m137293a = C26705d.m137293a(context, AbstractC2814h.t_xsmall_m);
        this.f91462M0.m89106L().m89060k0(-2).m89030N(-2);
        this.f91462M0.mo44614b1(8);
        this.f91463N0.m89106L().m89027K(true);
        this.f91464O0.m89106L().m89027K(true);
        this.f91465P0.m89106L().m89034R(AbstractC23222t7.f112562h).m89027K(true);
        this.f91465P0.m111957E1(true);
        new C26707f(this.f91465P0).m137318a(m137293a);
        this.f91465P0.m111962J1(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        this.f91466Q0.m89106L().m89060k0(-2).m89030N(-2).m89027K(true).m89017A(Boolean.TRUE);
        this.f91466Q0.m111957E1(true);
        new C26707f(this.f91466Q0).m137318a(m137293a);
        this.f91466Q0.m111962J1(C23212s8.m119606n(AbstractC2807a.text_tertiary));
        this.f91467R0.m76614d(this.f91465P0.m111977q1(), false);
        this.f91467R0.setTypeface(this.f91465P0.m111978r1());
        this.f91462M0.m89001g1(this.f91463N0);
        this.f91462M0.m89001g1(this.f91464O0);
        this.f91462M0.m89001g1(this.f91465P0);
        m89001g1(this.f91462M0);
        m89001g1(this.f91466Q0);
        m96045s1();
    }

    /* renamed from: C1 */
    public void m96048C1(C3020p0 c3020p0) {
        C3039t0 c3039t0;
        String str;
        int i11 = 8;
        if (c3020p0 != null && (c3039t0 = c3020p0.f12025E) != null) {
            C3051w0 c3051w0 = c3039t0.f12246d;
            C32546b c32546b = c3039t0.f12247e;
            int i12 = c3039t0.f12243a;
            int i13 = c3039t0.f12244b;
            m96049q1(i13, c3020p0.f12064w, c32546b, c3051w0);
            if (i12 > 0) {
                str = AbstractC23136l9.m118698c0().getQuantityString(AbstractC7921d0.str_reaction_comment, i12, Integer.valueOf(i12));
            } else {
                str = "";
            }
            String str2 = str;
            boolean m96040A1 = m96040A1(str2, i12);
            boolean m96041B1 = m96041B1(c3051w0, c32546b, str2, c3020p0.f12064w, i13);
            m96046v1(m96040A1, m96041B1);
            if (m96041B1 || i12 > 0) {
                i11 = 0;
            }
            mo44614b1(i11);
            return;
        }
        mo44614b1(8);
    }

    /* renamed from: q1 */
    public void m96049q1(int i11, boolean z11, C32546b c32546b, C3051w0 c3051w0) {
        boolean z12;
        if (C31060j.m150913U()) {
            m96043p1(i11, z11, c32546b, c3051w0);
            return;
        }
        if (i11 <= 0 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        m96042o1(z12, c32546b);
    }

    /* renamed from: t1 */
    public void m96050t1() {
        int i11 = AbstractC23222t7.f112576o;
        C16716d c16716d = this.f91462M0;
        if (c16716d != null) {
            c16716d.m89106L().m89042Z(0, i11, 0, i11);
        }
        C22126c0 c22126c0 = this.f91466Q0;
        if (c22126c0 != null) {
            c22126c0.m89106L().m89042Z(0, i11, 0, i11);
        }
    }

    /* renamed from: u1 */
    public void m96051u1() {
        C22126c0 c22126c0 = this.f91465P0;
        if (c22126c0 != null && this.f91466Q0 != null) {
            c22126c0.m115422R1();
            this.f91466Q0.m115422R1();
            this.f91467R0.m76614d(this.f91465P0.m111977q1(), false);
            this.f91467R0.setTypeface(this.f91465P0.m111978r1());
        }
    }

    /* renamed from: x1 */
    public void m96052x1(C16719g.c cVar) {
        C16716d c16716d = this.f91462M0;
        if (c16716d != null) {
            c16716d.mo89109M0(cVar);
        }
    }

    /* renamed from: y1 */
    public void m96053y1(C16719g.c cVar) {
        C22126c0 c22126c0 = this.f91466Q0;
        if (c22126c0 != null) {
            c22126c0.mo89109M0(cVar);
        }
    }

    /* renamed from: z1 */
    public void m96054z1() {
        C16716d c16716d = this.f91462M0;
        if (c16716d != null && this.f91466Q0 != null) {
            c16716d.m89106L().m89027K(true);
            this.f91466Q0.m89106L().m89027K(true);
        }
    }
}
