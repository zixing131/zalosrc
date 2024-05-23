package br;

import android.text.TextUtils;
import aq.C2288h;
import com.zing.zalo.control.TrackingSource;
import is.AbstractC20826v0;
import java.util.List;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p458qr.AbstractC25474g;
import p458qr.C25476i;
import p664y.AbstractC30228a;
import tg.C26657h;
import tg.C26663n;
import tg.C26664o;
import tg.C26674y;
import tn.C26747f0;
import vg.C28023b6;

/* renamed from: br.i */
/* loaded from: classes4.dex */
public class C3124i extends AbstractC19962a implements InterfaceC3117b {

    /* renamed from: t */
    C26747f0 f13217t;

    /* renamed from: u */
    String f13218u;

    /* renamed from: v */
    C2288h f13219v;

    /* renamed from: w */
    int f13220w;

    /* renamed from: x */
    int f13221x;

    /* renamed from: br.i$a */
    /* loaded from: classes4.dex */
    class a implements C26747f0.m {

        /* renamed from: a */
        final /* synthetic */ TrackingSource f13222a;

        a(TrackingSource trackingSource) {
            this.f13222a = trackingSource;
        }

        @Override // tn.C26747f0.m
        /* renamed from: a */
        public void mo15772a(List list) {
            C3124i.this.f13217t.m137614e0(1, this.f13222a);
        }

        @Override // tn.C26747f0.m
        /* renamed from: b */
        public void mo15773b() {
            C3124i.this.f13217t.m137614e0(1, this.f13222a);
        }
    }

    /* renamed from: br.i$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC25474g {
        b() {
        }

        @Override // p458qr.AbstractC25474g
        /* renamed from: d */
        public Void mo15774a() {
            C3124i.this.f13219v.mo12063g(String.valueOf(306));
            AbstractC20826v0.m108772M0();
            C23744a.m124114c().m124116d(6005, new Object[0]);
            C23744a.m124114c().m124116d(6006, new Object[0]);
            return (Void) super.mo15774a();
        }
    }

    public C3124i(InterfaceC3118c interfaceC3118c, C2288h c2288h) {
        super(interfaceC3118c);
        this.f13218u = "";
        this.f13220w = 1;
        this.f13221x = 1;
        this.f13217t = C26747f0.m137582I();
        this.f13219v = c2288h;
    }

    /* renamed from: Op */
    private void m15765Op(List list) {
        ((InterfaceC3118c) m103742Dp()).mo15755io(list);
        ((InterfaceC3118c) m103742Dp()).mo15750S1();
        ((InterfaceC3118c) m103742Dp()).mo15751cD();
        ((InterfaceC3118c) m103742Dp()).mo15752cs();
    }

    /* renamed from: Pp */
    public /* synthetic */ void m15766Pp(String str, String str2) {
        ((InterfaceC3118c) m103742Dp()).mo15754hw(str, str2);
    }

    /* renamed from: Qp */
    public /* synthetic */ void m15767Qp(String str, String str2, C26657h c26657h) {
        ((InterfaceC3118c) m103742Dp()).mo15753ei(str, str2, c26657h.f126162g);
    }

    /* renamed from: Rp */
    public /* synthetic */ void m15768Rp(int i11, String str, String str2, C26657h c26657h) {
        boolean z11;
        try {
            if (!TextUtils.isEmpty(this.f13218u) && TextUtils.equals(this.f13218u, str)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && i11 == 0 && str2 != null && c26657h != null && c26657h.f126157b > 0) {
                if (!AbstractC23309i.m121072J2()) {
                    return;
                }
                if (c26657h.f126157b == 11 && !C26664o.m136836a().m136839d(str)) {
                    ((InterfaceC3118c) m103742Dp()).mo70710wy(new Runnable() { // from class: br.g

                        /* renamed from: q */
                        public final /* synthetic */ String f13211q;

                        /* renamed from: r */
                        public final /* synthetic */ String f13212r;

                        public /* synthetic */ RunnableC3122g(String str3, String str22) {
                            r2 = str3;
                            r3 = str22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C3124i.this.m15766Pp(r2, r3);
                        }
                    });
                    C26664o.m136836a().m136841f(str3);
                    return;
                } else {
                    if (c26657h.f126157b == 14 && c26657h.f126162g != null) {
                        ((InterfaceC3118c) m103742Dp()).mo70710wy(new Runnable() { // from class: br.h

                            /* renamed from: q */
                            public final /* synthetic */ String f13214q;

                            /* renamed from: r */
                            public final /* synthetic */ String f13215r;

                            /* renamed from: s */
                            public final /* synthetic */ C26657h f13216s;

                            public /* synthetic */ RunnableC3123h(String str3, String str22, C26657h c26657h2) {
                                r2 = str3;
                                r3 = str22;
                                r4 = c26657h2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C3124i.this.m15767Qp(r2, r3, r4);
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            if (z11 && i11 != 0) {
                mo15744Q0();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            mo15744Q0();
        }
    }

    /* renamed from: Sp */
    public /* synthetic */ void m15769Sp(List list) {
        int i11;
        mo15744Q0();
        m15765Op(list);
        if (list != null) {
            i11 = list.size();
        } else {
            i11 = 1;
        }
        this.f13220w = i11;
        this.f13221x = 1;
    }

    /* renamed from: Tp */
    public /* synthetic */ void m15770Tp(boolean z11) {
        mo15744Q0();
        ((InterfaceC3118c) m103742Dp()).mo15757mH();
        ((InterfaceC3118c) m103742Dp()).mo15758wF();
        if (z11) {
            ((InterfaceC3118c) m103742Dp()).mo15748Mo();
        } else {
            ((InterfaceC3118c) m103742Dp()).mo15756j0();
        }
    }

    @Override // br.InterfaceC3117b
    /* renamed from: Gm */
    public void mo15741Gm(String str) {
        try {
            if (!TextUtils.equals(str, this.f13218u)) {
                mo15744Q0();
                this.f13218u = str;
                new C26663n(null, 0).m136827c(str, new C26674y.b() { // from class: br.d
                    public /* synthetic */ C3119d() {
                    }

                    @Override // tg.C26674y.b
                    /* renamed from: a */
                    public final void mo15759a(int i11, String str2, String str3, C26657h c26657h) {
                        C3124i.this.m15768Rp(i11, str2, str3, c26657h);
                    }
                }, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // br.InterfaceC3117b
    /* renamed from: Im */
    public void mo15742Im(boolean z11) {
        List m137660K = this.f13217t.m137660K();
        if (m137660K != null && !m137660K.isEmpty()) {
            ((InterfaceC3118c) m103742Dp()).mo70710wy(new Runnable() { // from class: br.e

                /* renamed from: q */
                public final /* synthetic */ List f13207q;

                public /* synthetic */ RunnableC3120e(List m137660K2) {
                    r2 = m137660K2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3124i.this.m15769Sp(r2);
                }
            });
        } else {
            ((InterfaceC3118c) m103742Dp()).mo70710wy(new Runnable() { // from class: br.f

                /* renamed from: q */
                public final /* synthetic */ boolean f13209q;

                public /* synthetic */ RunnableC3121f(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3124i.this.m15770Tp(r2);
                }
            });
        }
    }

    @Override // br.InterfaceC3117b
    /* renamed from: Ko */
    public int mo15743Ko() {
        return this.f13220w;
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public /* bridge */ /* synthetic */ void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        AbstractC30228a.m149044a(interfaceC19969h);
        m15771Wp(null, interfaceC19968g);
    }

    @Override // br.InterfaceC3117b
    /* renamed from: Q0 */
    public void mo15744Q0() {
        ((InterfaceC3118c) m103742Dp()).mo15749Q0();
        C26664o.m136836a().m136843h(this.f13218u);
        this.f13218u = "";
    }

    @Override // br.InterfaceC3117b
    /* renamed from: Sj */
    public void mo15745Sj(TrackingSource trackingSource) {
        List m137660K = this.f13217t.m137660K();
        if (m137660K != null && !m137660K.isEmpty()) {
            this.f13217t.m137678q0(1, trackingSource);
        } else {
            this.f13217t.m137679s0(1, new a(trackingSource));
        }
    }

    /* renamed from: Wp */
    public void m15771Wp(AbstractC3137v abstractC3137v, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(abstractC3137v, interfaceC19968g);
        try {
            C28023b6.m141250h0().m141305O();
            C25476i.m131959d(new b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // br.InterfaceC3117b
    /* renamed from: Yi */
    public int mo15746Yi() {
        return this.f13221x;
    }

    @Override // br.InterfaceC3117b
    /* renamed from: xl */
    public void mo15747xl(int i11) {
        if (i11 < 1) {
            i11 = 1;
        } else {
            int i12 = this.f13220w;
            if (i11 > i12) {
                i11 = i12;
            }
        }
        this.f13221x = Math.min(Math.max(i11, this.f13221x), this.f13220w);
    }
}
