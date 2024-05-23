package com.zing.zalo.qrcode.p069ui.scan;

import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import com.zing.zalo.SensitiveDataException;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.qrcode.p069ui.scan.C9257c;
import com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dm0.C18028a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ky.C21969b;
import me0.AbstractC23041d2;
import me0.AbstractC23112j7;
import my.AbstractC23482e;
import my.AbstractC23487j;
import my.AbstractC23490m;
import my.C23479b;
import my.C23483f;
import my.C23486i;
import my.C23488k;
import my.C23489l;
import on0.AbstractC24334o;
import org.json.JSONObject;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p248iy.AbstractC20887g;
import p281jy.AbstractC21410p;
import p281jy.C21400f;
import p281jy.C21403i;
import p281jy.C21407m;
import p281jy.C21409o;
import p281jy.C21415u;
import p281jy.InterfaceC21399e;
import p361nb.AbstractC23647d;
import p374ny.AbstractC23958b;
import p374ny.C23960d;
import p374ny.C23961e;
import p374ny.C23962f;
import p374ny.C23963g;
import p465qy.InterfaceC25502a;
import p667y2.C30268e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24847g;
import qm0.AbstractC25332a0;
import sy.AbstractC26412d;
import th.C26691l;
import uz.C27385a;
import vg.AbstractC28127m2;
import vg.C28145o2;

/* renamed from: com.zing.zalo.qrcode.ui.scan.c */
/* loaded from: classes4.dex */
public final class C9257c extends AbstractC19962a implements InterfaceC9256b {

    /* renamed from: A */
    private final int[] f49056A;

    /* renamed from: B */
    private final boolean f49057B;

    /* renamed from: C */
    private final boolean f49058C;

    /* renamed from: D */
    private final boolean f49059D;

    /* renamed from: E */
    private final boolean f49060E;

    /* renamed from: F */
    private final int[] f49061F;

    /* renamed from: G */
    private boolean f49062G;

    /* renamed from: H */
    private boolean f49063H;

    /* renamed from: I */
    private int f49064I;

    /* renamed from: J */
    private int f49065J;

    /* renamed from: K */
    private int f49066K;

    /* renamed from: L */
    private final int[] f49067L;

    /* renamed from: M */
    private final float f49068M;

    /* renamed from: N */
    private final boolean f49069N;

    /* renamed from: O */
    private final AbstractC21410p f49070O;

    /* renamed from: P */
    private final InterfaceC21399e f49071P;

    /* renamed from: Q */
    private boolean f49072Q;

    /* renamed from: R */
    private boolean f49073R;

    /* renamed from: S */
    private boolean f49074S;

    /* renamed from: T */
    private boolean f49075T;

    /* renamed from: U */
    private boolean f49076U;

    /* renamed from: V */
    private boolean f49077V;

    /* renamed from: W */
    private boolean f49078W;

    /* renamed from: X */
    private boolean f49079X;

    /* renamed from: Y */
    private boolean f49080Y;

    /* renamed from: Z */
    private boolean f49081Z;

    /* renamed from: a0 */
    private String f49082a0;

    /* renamed from: b0 */
    private String f49083b0;

    /* renamed from: c0 */
    private final long f49084c0;

    /* renamed from: d0 */
    private long f49085d0;

    /* renamed from: e0 */
    private boolean f49086e0;

    /* renamed from: f0 */
    private boolean f49087f0;

    /* renamed from: g0 */
    private boolean f49088g0;

    /* renamed from: h0 */
    private a f49089h0;

    /* renamed from: i0 */
    private boolean f49090i0;

    /* renamed from: j0 */
    private boolean f49091j0;

    /* renamed from: k0 */
    private int f49092k0;

    /* renamed from: l0 */
    private boolean f49093l0;

    /* renamed from: m0 */
    private boolean f49094m0;

    /* renamed from: n0 */
    private C27385a f49095n0;

    /* renamed from: o0 */
    private boolean f49096o0;

    /* renamed from: p0 */
    private final b f49097p0;

    /* renamed from: q0 */
    private boolean f49098q0;

    /* renamed from: r0 */
    private String f49099r0;

    /* renamed from: s0 */
    private boolean f49100s0;

    /* renamed from: t */
    private final InterfaceC25502a f49101t;

    /* renamed from: t0 */
    private boolean f49102t0;

    /* renamed from: u */
    private String f49103u;

    /* renamed from: u0 */
    private boolean f49104u0;

    /* renamed from: v */
    private Boolean f49105v;

    /* renamed from: v0 */
    private final String f49106v0;

    /* renamed from: w */
    private boolean f49107w;

    /* renamed from: w0 */
    private String f49108w0;

    /* renamed from: x */
    private boolean f49109x;

    /* renamed from: x0 */
    private final String f49110x0;

    /* renamed from: y */
    private boolean f49111y;

    /* renamed from: y0 */
    private boolean f49112y0;

    /* renamed from: z */
    private boolean f49113z;

    /* renamed from: com.zing.zalo.qrcode.ui.scan.c$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: com.zing.zalo.qrcode.ui.scan.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32715a implements a {

            /* renamed from: a */
            public static final C32715a f49114a = new C32715a();

            private C32715a() {
            }
        }

        /* renamed from: com.zing.zalo.qrcode.ui.scan.c$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a */
            public static final b f49115a = new b();

            private b() {
            }
        }

        /* renamed from: com.zing.zalo.qrcode.ui.scan.c$a$c */
        /* loaded from: classes4.dex */
        public static final class c implements a {

            /* renamed from: a */
            public static final c f49116a = new c();

            private c() {
            }
        }

        /* renamed from: com.zing.zalo.qrcode.ui.scan.c$a$d */
        /* loaded from: classes4.dex */
        public static final class d implements a {

            /* renamed from: a */
            public static final d f49117a = new d();

            private d() {
            }
        }

        /* renamed from: com.zing.zalo.qrcode.ui.scan.c$a$e */
        /* loaded from: classes4.dex */
        public static final class e implements a {

            /* renamed from: a */
            public static final e f49118a = new e();

            private e() {
            }
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements AbstractC21410p.a {
        b() {
        }

        @Override // p281jy.AbstractC21410p.a
        /* renamed from: a */
        public void mo49544a(C27385a c27385a) {
            AbstractC19074t.m100208f(c27385a, "reportQRData");
            if (!C9257c.this.f49094m0) {
                C9257c.this.f49094m0 = true;
                C9257c.this.f49095n0 = c27385a;
                C9257c.this.m49495Pq(a.d.f49117a);
                C9257c.this.m49542tq().mo49328nq();
            }
        }

        @Override // p281jy.AbstractC21410p.a
        /* renamed from: b */
        public void mo49545b(C27385a.a aVar) {
            AbstractC19074t.m100208f(aVar, "source");
            if (!C9257c.this.f49094m0) {
                C9257c.this.f49094m0 = true;
                C9257c.this.m49542tq().mo49289Fy();
            }
        }

        @Override // p281jy.AbstractC21410p.a
        /* renamed from: c */
        public void mo49546c(C27385a c27385a) {
            AbstractC19074t.m100208f(c27385a, "reportQRData");
            C9257c.this.m49542tq().mo49290G4();
        }

        @Override // p281jy.AbstractC21410p.a
        /* renamed from: d */
        public void mo49547d(AbstractC23482e abstractC23482e, C27385a.a aVar) {
            boolean z11;
            String str;
            AbstractC19074t.m100208f(abstractC23482e, "result");
            AbstractC19074t.m100208f(aVar, "source");
            InterfaceC25502a m49542tq = C9257c.this.m49542tq();
            C27385a.a aVar2 = C27385a.a.f129024p;
            if (aVar == aVar2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (aVar == aVar2) {
                str = "Camera:\n";
            } else {
                str = "\nGallery:\n";
            }
            String format = String.format(str + "QR Confident: %.2f\nPreprocess time: %d\nInference time: %d", Arrays.copyOf(new Object[]{Float.valueOf(abstractC23482e.m123264a()), Long.valueOf(abstractC23482e.m123266c()), Long.valueOf(abstractC23482e.m123265b())}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            m49542tq.mo49335tb(z11, format);
        }
    }

    /* renamed from: com.zing.zalo.qrcode.ui.scan.c$c */
    /* loaded from: classes4.dex */
    /* synthetic */ class c implements InterfaceC21399e.a, InterfaceC19066n {
        c() {
        }

        @Override // p281jy.InterfaceC21399e.a
        /* renamed from: a */
        public final void mo49548a(Object obj, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(obj, "p0");
            C9257c.this.m49537xq(obj, i11, i12, i13);
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return new C19071q(4, C9257c.this, C9257c.class, "onCameraScanCallback", "onCameraScanCallback(Ljava/lang/Object;III)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC21399e.a) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C19059j0 f49121q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C19059j0 c19059j0) {
            super(1);
            this.f49121q = c19059j0;
        }

        /* renamed from: a */
        public final void m49549a(File file) {
            AbstractC19074t.m100208f(file, "it");
            if (C26691l.f126458a.m137150g() != null) {
                this.f49121q.f94941p = file;
            } else {
                AbstractC23041d2.m118207f((File) this.f49121q.f94941p);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m49549a((File) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.qrcode.ui.scan.c$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f49122q = new e();

        e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo205i9(C18028a c18028a) {
            AbstractC19074t.m100208f(c18028a, "it");
            return c18028a.m95864b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9257c(InterfaceC25502a interfaceC25502a) {
        super(interfaceC25502a);
        C21400f c21400f;
        C21403i c21403i;
        C21409o c21409o;
        AbstractC19074t.m100208f(interfaceC25502a, "view");
        this.f49101t = interfaceC25502a;
        this.f49056A = new int[]{0, 0, 0, 0, 0};
        boolean m137141p = C26691l.m137141p();
        this.f49057B = m137141p;
        boolean m137142q = C26691l.m137142q();
        this.f49058C = m137142q;
        boolean m137144s = C26691l.m137144s();
        this.f49059D = m137144s;
        boolean z11 = C26691l.m137143r() || C26691l.m137140o();
        this.f49060E = z11;
        this.f49061F = new int[4];
        this.f49067L = new int[4];
        this.f49068M = 0.125f;
        if (m137141p) {
            c21400f = new C21400f();
        } else {
            c21400f = null;
        }
        if (m137142q) {
            c21403i = new C21403i();
        } else {
            c21403i = null;
        }
        if (m137144s) {
            c21409o = new C21409o();
        } else {
            c21409o = null;
        }
        this.f49070O = new C21415u(c21400f, c21403i, c21409o);
        this.f49071P = z11 ? new C21407m() : null;
        this.f49072Q = true;
        this.f49073R = true;
        this.f49080Y = true;
        this.f49084c0 = 750L;
        this.f49097p0 = new b();
        this.f49104u0 = true;
        this.f49106v0 = "recognizeText";
        this.f49110x0 = "rescanQRCodePCLogin";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Aq */
    public static final void m49474Aq(String str) {
        AbstractC19074t.m100208f(str, "$content");
        C7960e.m41971c6().m42275T8(C23963g.Companion.m125394a(str, System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Bq */
    public static final void m49475Bq(String str, String str2, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "$content");
        AbstractC19074t.m100208f(str2, "$title");
        AbstractC19074t.m100208f(jSONObject, "$itemData");
        C7960e.m41971c6().m42275T8(C23960d.Companion.m125388a(str, System.currentTimeMillis(), str2, jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Cq */
    public static final void m49476Cq(String str, String str2, String str3, String str4, String str5) {
        AbstractC19074t.m100208f(str, "$content");
        AbstractC19074t.m100208f(str2, "$title");
        AbstractC19074t.m100208f(str3, "$domain");
        AbstractC19074t.m100208f(str4, "$url");
        C7960e.m41971c6().m42275T8(C23961e.Companion.m125392a(str, System.currentTimeMillis(), str2, str3, str4, str5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Eq */
    public static final void m49477Eq(C9257c c9257c, AbstractC23958b abstractC23958b) {
        AbstractC19074t.m100208f(c9257c, "this$0");
        AbstractC19074t.m100208f(abstractC23958b, "$item");
        c9257c.f49101t.mo49297Iv(abstractC23958b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fq */
    public static final void m49478Fq(C23488k c23488k) {
        String m127098f;
        AbstractC19074t.m100208f(c23488k, "$error");
        m127098f = AbstractC24334o.m127098f("[LOG] Receive PC Login Error:\nerrorCode=[" + c23488k.m123282c().m104491c() + "]\nerrorMessage=[" + c23488k.m123282c().m104492d() + "]\ndata=[" + c23488k.m123282c().m104490b() + "]");
        String m137150g = C26691l.f126458a.m137150g();
        if (m137150g == null) {
            m137150g = "204278670";
        }
        AbstractC23112j7.m118532h0(m137150g, m127098f);
    }

    /* renamed from: Gq */
    private final void m49479Gq(C23488k c23488k, AbstractC23490m abstractC23490m, int i11) {
        this.f49108w0 = null;
        this.f49101t.mo49296It(false);
        this.f49101t.mo49322kh(this.f49110x0, false);
        this.f49101t.mo49306QG();
        int m123283d = c23488k.m123283d();
        if (m123283d != 18005 && m123283d != 18011 && m123283d != 18019) {
            this.f49101t.mo49319hu(c23488k, abstractC23490m, i11);
        } else {
            if (this.f49112y0) {
                return;
            }
            this.f49112y0 = true;
            m49495Pq(a.C32715a.f49114a);
            this.f49101t.mo49323kj(c23488k, abstractC23490m, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Hq */
    public static final void m49480Hq() {
        String m137150g = C26691l.f126458a.m137150g();
        if (m137150g == null) {
            m137150g = "204278670";
        }
        AbstractC23112j7.m118532h0(m137150g, "[LOG] Receive PC Login Confirm");
    }

    /* renamed from: Iq */
    private final void m49482Iq(final C23488k c23488k, final AbstractC23490m.b bVar, final int i11) {
        if (AbstractC19074t.m100204b(this.f49108w0, bVar.m123297e())) {
            return;
        }
        this.f49108w0 = bVar.m123297e();
        this.f49101t.mo49296It(true);
        this.f49101t.mo49322kh(this.f49110x0, true);
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: qy.f
            @Override // java.lang.Runnable
            public final void run() {
                C9257c.m49484Jq(C9257c.this, bVar, c23488k, i11);
            }
        }, c23488k.m123284e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Jq */
    public static final void m49484Jq(C9257c c9257c, AbstractC23490m.b bVar, C23488k c23488k, int i11) {
        AbstractC19074t.m100208f(c9257c, "this$0");
        AbstractC19074t.m100208f(bVar, "$preData");
        AbstractC19074t.m100208f(c23488k, "$error");
        if (AbstractC19074t.m100204b(c9257c.f49108w0, bVar.m123297e())) {
            c9257c.m49479Gq(c23488k, bVar, i11);
        }
    }

    /* renamed from: Kq */
    private final void m49486Kq(final boolean z11, final String str, final C23483f c23483f) {
        this.f49073R = z11;
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.i
            @Override // java.lang.Runnable
            public final void run() {
                C9257c.m49489Mq(C9257c.this, str, c23483f, z11);
            }
        });
    }

    /* renamed from: Lq */
    static /* synthetic */ void m49487Lq(C9257c c9257c, boolean z11, String str, C23483f c23483f, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            c23483f = null;
        }
        c9257c.m49486Kq(z11, str, c23483f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Mq */
    public static final void m49489Mq(final C9257c c9257c, String str, final C23483f c23483f, boolean z11) {
        final AbstractC23490m abstractC23490m;
        C28145o2 c28145o2;
        AbstractC19074t.m100208f(c9257c, "this$0");
        AbstractC19074t.m100208f(str, "$data");
        String str2 = c9257c.f49103u;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                AbstractC28127m2 m141613e = AbstractC28127m2.a.m141609d().m141613e(str2);
                if (m141613e instanceof C28145o2) {
                    c28145o2 = (C28145o2) m141613e;
                } else {
                    c28145o2 = null;
                }
                if (c28145o2 != null) {
                    c28145o2.f131200e = str;
                    c9257c.f49101t.mo49313Zg();
                    return;
                }
            }
        }
        AbstractC26412d.a aVar = AbstractC26412d.Companion;
        AbstractC23490m m136249x = aVar.m136249x(str);
        if (!(m136249x instanceof AbstractC23490m.b)) {
            if (c9257c.f49108w0 != null) {
                c9257c.f49108w0 = null;
                c9257c.f49101t.mo49296It(false);
                c9257c.f49101t.mo49322kh(c9257c.f49110x0, false);
            }
            c9257c.f49101t.mo49306QG();
        } else {
            String str3 = c9257c.f49108w0;
            if (str3 != null && AbstractC19074t.m100204b(str3, ((AbstractC23490m.b) m136249x).m123297e())) {
                return;
            }
            if (!C26691l.m137143r()) {
                ((AbstractC23490m.b) m136249x).m123298f(aVar.m136234c(1));
                c9257c.f49101t.mo49296It(true);
            } else if (c23483f == null) {
                ((AbstractC23490m.b) m136249x).m123298f(aVar.m136234c(0));
                c9257c.f49101t.mo49296It(true);
            } else {
                final int[] iArr = new int[3];
                final C19059j0 c19059j0 = new C19059j0();
                C26691l.a aVar2 = C26691l.a.f126479a;
                if (aVar2.m137155c()) {
                    ((AbstractC23490m.b) m136249x).m123299g(aVar.m136247u(c23483f.m123270d().m123291e(), c23483f.m123270d().m123290d(), c23483f.m123270d().m123288b(), c23483f.m123270d().m123289c(), aVar2.m137153a(), aVar2.m137154b(), iArr, new d(c19059j0)));
                } else {
                    iArr[0] = c23483f.m123270d().m123290d();
                    iArr[1] = c23483f.m123270d().m123288b();
                    iArr[2] = 0;
                }
                ((AbstractC23490m.b) m136249x).m123298f(aVar.m136235d(iArr, c23483f.m123268b(), c23483f.m123269c(), c23483f.m123270d().m123292f(), c23483f.m123270d().m123287a()));
                final String m137150g = C26691l.f126458a.m137150g();
                if (m137150g != null) {
                    abstractC23490m = m136249x;
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9257c.m49491Nq(C9257c.this, m137150g, c19059j0, c23483f, abstractC23490m, iArr);
                        }
                    });
                } else {
                    abstractC23490m = m136249x;
                }
                c9257c.f49101t.mo49296It(true);
                c9257c.f49101t.mo49330pw(AbstractC19074t.m100204b(c9257c.f49105v, Boolean.TRUE), z11, abstractC23490m);
            }
        }
        abstractC23490m = m136249x;
        c9257c.f49101t.mo49330pw(AbstractC19074t.m100204b(c9257c.f49105v, Boolean.TRUE), z11, abstractC23490m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Nq */
    public static final void m49491Nq(C9257c c9257c, String str, final C19059j0 c19059j0, C23483f c23483f, AbstractC23490m abstractC23490m, int[] iArr) {
        AbstractC19074t.m100208f(c9257c, "this$0");
        AbstractC19074t.m100208f(str, "$it");
        AbstractC19074t.m100208f(c19059j0, "$file");
        AbstractC19074t.m100208f(abstractC23490m, "$preData");
        AbstractC19074t.m100208f(iArr, "$imageSizeAndFileSize");
        try {
            C24861r.a aVar = C24861r.f119264q;
            AbstractC26412d.a aVar2 = AbstractC26412d.Companion;
            File file = (File) c19059j0.f94941p;
            int m123289c = c23483f.m123270d().m123289c();
            String m123295c = ((AbstractC23490m.b) abstractC23490m).m123295c();
            if (m123295c == null) {
                m123295c = "";
            }
            String str2 = m123295c;
            aVar2.m136230A(str, file, m123289c, str2, "file_size:" + iArr[2] + "\nocr_execution_time:" + c23483f.m123267a(), true);
            C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th2) {
            C24861r.a aVar3 = C24861r.f119264q;
            C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: qy.l
            @Override // java.lang.Runnable
            public final void run() {
                C9257c.m49493Oq(C19059j0.this);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Oq */
    public static final void m49493Oq(C19059j0 c19059j0) {
        AbstractC19074t.m100208f(c19059j0, "$file");
        AbstractC23041d2.m118207f((File) c19059j0.f94941p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pq */
    public final void m49495Pq(a aVar) {
        this.f49089h0 = aVar;
        this.f49111y = false;
        this.f49079X = false;
        this.f49081Z = false;
        this.f49078W = false;
        this.f49077V = false;
        this.f49085d0 = 0L;
        if (!AbstractC19074t.m100204b(aVar, a.b.f49115a)) {
            this.f49070O.mo110863U1();
        }
        m49513Zq();
        this.f49101t.mo49317gG();
    }

    /* renamed from: Qq */
    static /* synthetic */ void m49497Qq(C9257c c9257c, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = a.e.f49118a;
        }
        c9257c.m49495Pq(aVar);
    }

    /* renamed from: Rq */
    private final void m49499Rq() {
        if (this.f49087f0 && this.f49088g0) {
            this.f49087f0 = false;
            this.f49088g0 = false;
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.m
                @Override // java.lang.Runnable
                public final void run() {
                    C9257c.m49501Sq(C9257c.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Sq */
    public static final void m49501Sq(C9257c c9257c) {
        AbstractC19074t.m100208f(c9257c, "this$0");
        c9257c.f49101t.mo49314a1();
    }

    /* renamed from: Tq */
    private final synchronized void m49503Tq(final String str, final float[] fArr, byte[] bArr, final int i11, final int i12, final int i13, final boolean z11, final boolean z12) {
        InterfaceC21399e interfaceC21399e = this.f49071P;
        if (interfaceC21399e == null) {
            if (z11) {
                m49487Lq(this, true, str, null, 4, null);
            }
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (z11) {
            this.f49101t.mo49322kh(this.f49106v0, true);
        }
        float[] fArr2 = new float[fArr.length];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
        scanQRUIUtils.m49624e(fArr2, 0.5f);
        float[] fArr3 = new float[4];
        scanQRUIUtils.m49633p(fArr3, fArr2);
        final int[] iArr = new int[4];
        for (int i14 = 0; i14 < 4; i14++) {
            iArr[i14] = ((int) fArr3[i14]) + this.f49061F[i14 % 2];
        }
        ScanQRUIUtils.f49155a.m49617B(iArr, this.f49061F);
        interfaceC21399e.mo110857O1(iArr);
        interfaceC21399e.mo110865W1(i11, i12, i13);
        interfaceC21399e.mo110859Q1(new InterfaceC21399e.a() { // from class: qy.j
            @Override // p281jy.InterfaceC21399e.a
            /* renamed from: a */
            public final void mo49548a(Object obj, int i15, int i16, int i17) {
                C9257c.m49504Uq(C9257c.this, iArr, z11, z12, str, i11, i12, i13, fArr, currentTimeMillis, obj, i15, i16, i17);
            }
        });
        interfaceC21399e.mo110858P1(bArr, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:            r7 = qm0.AbstractC25332a0.m131214n0(r7, "\n", null, null, 0, null, com.zing.zalo.qrcode.p069ui.scan.C9257c.e.f49122q, 30, null);     */
    /* renamed from: Uq */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m49504Uq(C9257c c9257c, int[] iArr, boolean z11, boolean z12, String str, int i11, int i12, int i13, float[] fArr, long j11, Object obj, int i14, int i15, int i16) {
        String str2;
        C23489l m123270d;
        List<C18028a> m123292f;
        C23489l m123270d2;
        AbstractC19074t.m100208f(c9257c, "this$0");
        AbstractC19074t.m100208f(iArr, "$rtFrameCropRect");
        AbstractC19074t.m100208f(str, "$qrCodeText");
        AbstractC19074t.m100208f(fArr, "$qrCodeCorners");
        AbstractC19074t.m100208f(obj, "callbackData");
        C23489l c23489l = obj instanceof C23489l ? (C23489l) obj : null;
        C23483f c23483f = c23489l != null ? new C23483f(c23489l, i11, i12, i13, iArr, fArr, System.currentTimeMillis() - j11) : null;
        if (C26691l.m137147v()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int[] iArr2 = c9257c.f49061F;
            int i17 = iArr2[2];
            int i18 = iArr2[0];
            int i19 = iArr2[1];
            int i21 = iArr2[3];
            float[] fArr2 = {0.0f, 0.0f, i17 - i18, i19 - i19, i17 - i18, i21 - i19, i18 - i18, i21 - i19};
            c9257c.f49101t.mo49298Iw(fArr2, iArr2);
            arrayList.add("Camera");
            arrayList2.add(fArr2);
            InterfaceC25502a interfaceC25502a = c9257c.f49101t;
            if (c23483f == null || (m123270d2 = c23483f.m123270d()) == null || (r7 = m123270d2.m123292f()) == null || str2 == null) {
                str2 = "";
            }
            interfaceC25502a.mo49308Qv(str2);
            int i22 = iArr[0];
            int[] iArr3 = c9257c.f49061F;
            int i23 = iArr3[0];
            int i24 = iArr[1];
            int i25 = iArr3[1];
            int i26 = iArr[2];
            int i27 = iArr[3];
            float[] fArr3 = {i22 - i23, i24 - i25, i26 - i23, i24 - i25, i26 - i23, i27 - i25, i22 - i23, i27 - i25};
            c9257c.f49101t.mo49298Iw(fArr3, iArr3);
            arrayList.add("OCR Region");
            arrayList2.add(fArr3);
            if (c23483f != null && (m123270d = c23483f.m123270d()) != null && (m123292f = m123270d.m123292f()) != null) {
                for (C18028a c18028a : m123292f) {
                    float[] fArr4 = new float[c18028a.m95863a().length];
                    System.arraycopy(c18028a.m95863a(), 0, fArr4, 0, c18028a.m95863a().length);
                    c9257c.f49101t.mo49298Iw(fArr4, iArr);
                    arrayList.add(c18028a.m95864b());
                    arrayList2.add(fArr4);
                }
            }
            c9257c.f49101t.mo49285Ei(arrayList, arrayList2);
        }
        if (z11) {
            c9257c.m49486Kq(z12, str, c23483f);
            c9257c.f49101t.mo49322kh(c9257c.f49106v0, false);
        }
    }

    /* renamed from: Vq */
    private final void m49505Vq() {
        if (!this.f49109x) {
            return;
        }
        if (this.f49074S) {
            this.f49075T = true;
            return;
        }
        this.f49075T = false;
        if (this.f49111y) {
            return;
        }
        try {
            this.f49111y = true;
            this.f49101t.mo49321kD();
            this.f49101t.mo49331qD();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Wq */
    private final void m49507Wq(int i11, int i12) {
        int[] iArr = this.f49056A;
        if (iArr[i11] != i12) {
            iArr[i11] = i12;
            for (int i13 : iArr) {
                if (i13 != 1) {
                    return;
                }
            }
            m49541Ii();
        }
    }

    /* renamed from: Xq */
    private final void m49509Xq(boolean z11) {
        if (this.f49074S != z11) {
            this.f49074S = z11;
            if (!z11 && this.f49075T) {
                m49505Vq();
            }
        }
    }

    /* renamed from: Yq */
    private final void m49511Yq() {
        if (!this.f49090i0 && this.f49101t.mo49338yB()) {
            m49529nq(0L);
        }
    }

    /* renamed from: Zq */
    private final void m49513Zq() {
        this.f49090i0 = false;
    }

    /* renamed from: ar */
    private final void m49515ar() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.o
            @Override // java.lang.Runnable
            public final void run() {
                C9257c.m49517br(C9257c.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: br */
    public static final void m49517br(C9257c c9257c) {
        int[] iArr;
        AbstractC19074t.m100208f(c9257c, "this$0");
        if (c9257c.f49063H && c9257c.f49079X && c9257c.f49111y && c9257c.f49109x) {
            boolean mo49294Ih = c9257c.f49101t.mo49294Ih(c9257c.f49061F, c9257c.f49064I, c9257c.f49065J, c9257c.f49066K);
            if (mo49294Ih) {
                iArr = c9257c.f49061F;
            } else {
                iArr = c9257c.f49067L;
            }
            c9257c.f49070O.mo110857O1(iArr);
            c9257c.f49101t.mo49302O1(iArr);
            c9257c.f49062G = mo49294Ih;
        }
    }

    /* renamed from: kq */
    private final void m49526kq() {
        this.f49109x = true;
        this.f49101t.mo49284Dp();
        if (this.f49107w) {
            m49505Vq();
        }
    }

    /* renamed from: lq */
    private final void m49527lq(boolean z11) {
        if (z11) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.t
                @Override // java.lang.Runnable
                public final void run() {
                    C9257c.m49528mq(C9257c.this);
                }
            });
        } else {
            this.f49101t.mo49299Kc(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mq */
    public static final void m49528mq(C9257c c9257c) {
        Object m131206f0;
        AbstractC19074t.m100208f(c9257c, "this$0");
        InterfaceC25502a interfaceC25502a = c9257c.f49101t;
        m131206f0 = AbstractC25332a0.m131206f0(AbstractC26412d.Companion.m136246r(1));
        interfaceC25502a.mo49299Kc((String) m131206f0);
    }

    /* renamed from: nq */
    private final void m49529nq(long j11) {
        this.f49090i0 = true;
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: qy.h
            @Override // java.lang.Runnable
            public final void run() {
                C9257c.m49531pq(C9257c.this);
            }
        }, j11);
    }

    /* renamed from: oq */
    static /* synthetic */ void m49530oq(C9257c c9257c, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 3500;
        }
        c9257c.m49529nq(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pq */
    public static final void m49531pq(C9257c c9257c) {
        AbstractC19074t.m100208f(c9257c, "this$0");
        if (c9257c.f49090i0) {
            c9257c.f49101t.mo49307Qb();
        }
        if (c9257c.f49090i0) {
            m49530oq(c9257c, 0L, 1, null);
        }
    }

    /* renamed from: qq */
    private final void m49532qq() {
        int i11;
        if (this.f49091j0 && (i11 = this.f49092k0) != 0) {
            this.f49091j0 = false;
            this.f49092k0 = 0;
            if (i11 != -2) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9257c.m49533rq(C9257c.this);
                    }
                });
            }
            if (!this.f49111y && AbstractC19074t.m100204b(this.f49089h0, a.c.f49116a)) {
                m49505Vq();
            }
            this.f49093l0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rq */
    public static final void m49533rq(final C9257c c9257c) {
        AbstractC19074t.m100208f(c9257c, "this$0");
        try {
            Bitmap mo49329nt = c9257c.f49101t.mo49329nt();
            String mo49300LH = c9257c.f49101t.mo49300LH();
            c9257c.f49101t.mo49318hF();
            if (c9257c.f49070O.mo110864V1()) {
                c9257c.f49070O.mo110862T1(mo49329nt, mo49300LH, new InterfaceC21399e.a() { // from class: qy.e
                    @Override // p281jy.InterfaceC21399e.a
                    /* renamed from: a */
                    public final void mo49548a(Object obj, int i11, int i12, int i13) {
                        C9257c.m49534sq(C9257c.this, obj, i11, i12, i13);
                    }
                });
                return;
            }
            throw new UnsupportedOperationException("Scan QR Code is unavailable");
        } catch (Exception e11) {
            c9257c.m49540Dq(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sq */
    public static final void m49534sq(C9257c c9257c, Object obj, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(c9257c, "this$0");
        AbstractC19074t.m100208f(obj, "data");
        if (obj instanceof AbstractC23487j) {
            m49487Lq(c9257c, false, ((AbstractC23487j) obj).m123279a().m92585e(), null, 4, null);
        } else if (obj instanceof C23479b) {
            c9257c.f49101t.mo49286Ex();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vq */
    public static final void m49535vq(C9257c c9257c) {
        AbstractC19074t.m100208f(c9257c, "this$0");
        if (c9257c.f49079X) {
            c9257c.f49081Z = true;
        }
    }

    /* renamed from: wq */
    private final void m49536wq() {
        this.f49078W = true;
        if (!this.f49086e0) {
            this.f49086e0 = true;
            if (!this.f49069N) {
                this.f49101t.mo49327m9();
            }
            this.f49101t.mo49303OF();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xq */
    public final void m49537xq(Object obj, int i11, int i12, int i13) {
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        float[] fArr;
        boolean z14;
        String str2;
        boolean z15 = obj instanceof C23486i;
        if ((z15 && (str2 = this.f49082a0) != null && str2.length() != 0 && !AbstractC19074t.m100204b(this.f49082a0, ((C23486i) obj).m123279a().m92585e())) || ((obj instanceof C23479b) && (str = this.f49082a0) != null && str.length() != 0)) {
            if (this.f49085d0 == 0) {
                this.f49085d0 = System.currentTimeMillis();
                return;
            } else if (System.currentTimeMillis() - this.f49085d0 < this.f49084c0) {
                return;
            }
        }
        this.f49085d0 = 0L;
        if (z15) {
            C23486i c23486i = (C23486i) obj;
            this.f49082a0 = c23486i.m123279a().m92585e();
            if (this.f49104u0 && !AbstractC19074t.m100204b(this.f49083b0, c23486i.m123279a().m92585e())) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC26412d.a aVar = AbstractC26412d.Companion;
            String m92585e = c23486i.m123279a().m92585e();
            boolean z16 = this.f49072Q;
            this.f49072Q = false;
            C24848g0 c24848g0 = C24848g0.f119245a;
            String m136243n = aVar.m136243n(m92585e, z16);
            String str3 = this.f49108w0;
            if (str3 != null && AbstractC19074t.m100204b(str3, m136243n)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f49071P != null && (C26691l.m137140o() || (z11 && m136243n != null && !z12))) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                float[] fArr2 = new float[c23486i.m123279a().m92581a().length];
                System.arraycopy(c23486i.m123279a().m92581a(), 0, fArr2, 0, c23486i.m123279a().m92581a().length);
                fArr = fArr2;
            } else {
                fArr = null;
            }
            if (z11 && z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f49101t.mo49298Iw(c23486i.m123279a().m92581a(), this.f49061F);
            ScanQRUIUtils.f49155a.m49624e(c23486i.m123279a().m92581a(), this.f49068M);
            this.f49101t.mo49291Gz(true, c23486i.m123279a().m92585e(), c23486i.m123279a().m92583c(), c23486i.m123279a().m92581a());
            if (z11) {
                this.f49083b0 = c23486i.m123279a().m92585e();
                this.f49070O.m110889i(true);
                if (!z14) {
                    m49487Lq(this, true, c23486i.m123279a().m92585e(), null, 4, null);
                }
            }
            if (z13 && fArr != null) {
                m49503Tq(c23486i.m123279a().m92585e(), fArr, c23486i.m123278b(), i11, i12, i13, z14, true);
                return;
            }
            return;
        }
        if (obj instanceof C23479b) {
            this.f49082a0 = null;
            this.f49083b0 = null;
            this.f49070O.m110889i(false);
            this.f49101t.mo49301N8(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zq */
    public static final void m49539zq(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "$content");
        AbstractC19074t.m100208f(str2, "$phone");
        AbstractC19074t.m100208f(str3, "$formattedPhone");
        C7960e.m41971c6().m42275T8(C23962f.Companion.m125393a(str, System.currentTimeMillis(), str2, str3));
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: B4 */
    public void mo49430B4() {
        this.f49108w0 = null;
        this.f49101t.mo49296It(false);
        this.f49101t.mo49322kh(this.f49110x0, false);
        this.f49101t.mo49306QG();
        if (C26691l.f126458a.m137150g() != null) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.q
                @Override // java.lang.Runnable
                public final void run() {
                    C9257c.m49480Hq();
                }
            });
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Bi */
    public void mo49431Bi() {
        this.f49112y0 = false;
        if (!this.f49111y && AbstractC19074t.m100204b(this.f49089h0, a.C32715a.f49114a)) {
            m49505Vq();
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: C3 */
    public void mo49432C3() {
        m49495Pq(a.b.f49115a);
        this.f49087f0 = true;
        m49499Rq();
    }

    /* renamed from: Dq */
    public void m49540Dq(Exception exc) {
        AbstractC19074t.m100208f(exc, C30268e.f140632a);
        AbstractC20110a.f98889a.mo104552e(exc);
        this.f49091j0 = false;
        this.f49092k0 = -1;
        this.f49101t.mo49287F8();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Em */
    public void mo49433Em(final String str, final String str2, final String str3, final String str4, final String str5) {
        AbstractC19074t.m100208f(str, "content");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str3, "title");
        AbstractC19074t.m100208f(str4, "domain");
        if (C26691l.m137145t()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.c
                @Override // java.lang.Runnable
                public final void run() {
                    C9257c.m49476Cq(str, str3, str4, str2, str5);
                }
            });
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Ge */
    public void mo49434Ge(boolean z11) {
        if (this.f49098q0) {
            this.f49098q0 = false;
            String str = this.f49099r0;
            if (str == null) {
                return;
            }
            this.f49099r0 = null;
            if (z11) {
                this.f49101t.mo49326lo(str);
            }
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Ic */
    public void mo49435Ic(final String str, final String str2, final JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "content");
        AbstractC19074t.m100208f(str2, "title");
        AbstractC19074t.m100208f(jSONObject, "itemData");
        if (C26691l.m137145t()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.g
                @Override // java.lang.Runnable
                public final void run() {
                    C9257c.m49475Bq(str, str2, jSONObject);
                }
            });
        }
    }

    /* renamed from: Ii */
    public void m49541Ii() {
        if (this.f49101t.mo49295Iq()) {
            m49526kq();
            if (this.f49069N) {
                this.f49101t.mo49327m9();
            }
            m49527lq(this.f49101t.mo49293Ig());
            return;
        }
        this.f49113z = true;
        this.f49101t.mo49311Y5();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: J9 */
    public void mo49436J9(final String str) {
        AbstractC19074t.m100208f(str, "content");
        if (C26691l.m137145t()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.u
                @Override // java.lang.Runnable
                public final void run() {
                    C9257c.m49474Aq(str);
                }
            });
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Jd */
    public boolean mo49437Jd(String str) {
        AbstractC19074t.m100208f(str, "text");
        String str2 = this.f49083b0;
        if (str2 != null && !AbstractC19074t.m100204b(str2, str)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: L */
    public void mo49438L() {
        this.f49101t.mo49316cz(C26691l.m137146u());
        this.f49101t.mo49333qt(true);
        m49507Wq(1, 1);
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: M2 */
    public void mo49439M2() {
        this.f49107w = false;
        m49497Qq(this, null, 1, null);
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: M6 */
    public void mo49440M6() {
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Mh */
    public boolean mo49441Mh() {
        return this.f49073R;
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: N0 */
    public void mo49442N0() {
        this.f49107w = true;
        C21969b.f108146a.m114727b();
        m49505Vq();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Oa */
    public void mo49443Oa() {
        if (this.f49100s0) {
            this.f49100s0 = false;
            if (this.f49101t.mo49339yq(this.f49102t0)) {
                this.f49101t.mo49312Yp(this.f49102t0);
            }
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Oo */
    public void mo49444Oo() {
        this.f49101t.mo49310VE();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Qj */
    public void mo49445Qj() {
        if (this.f49093l0) {
            return;
        }
        AbstractC23647d.m123907q("5340", "");
        AbstractC23647d.m123893c();
        this.f49091j0 = false;
        this.f49092k0 = 0;
        this.f49093l0 = true;
        m49495Pq(a.c.f49116a);
        this.f49101t.mo49283Dj();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: T9 */
    public void mo49446T9(boolean z11) {
        if (this.f49100s0) {
            return;
        }
        if (this.f49101t.mo49339yq(z11)) {
            this.f49101t.mo49312Yp(z11);
            return;
        }
        this.f49100s0 = true;
        this.f49102t0 = z11;
        this.f49101t.mo49305Pe(z11);
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: U0 */
    public void mo49447U0() {
        this.f49088g0 = true;
        m49499Rq();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Y4 */
    public void mo49448Y4(boolean z11, int i11, int i12, int i13) {
        this.f49079X = z11;
        if (!z11) {
            return;
        }
        this.f49064I = i11;
        this.f49065J = i12;
        this.f49066K = i13;
        this.f49101t.mo49324kp();
        m49511Yq();
        this.f49070O.mo110865W1(i11, i12, i13);
        this.f49070O.mo110859Q1(new c());
        this.f49070O.m110888h(this.f49097p0);
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: qy.n
            @Override // java.lang.Runnable
            public final void run() {
                C9257c.m49535vq(C9257c.this);
            }
        }, this.f49101t.mo49288FB());
        m49515ar();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Z2 */
    public void mo49449Z2() {
        m49507Wq(4, 1);
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Zi */
    public void mo49450Zi(boolean z11) {
        if (this.f49113z) {
            if (z11) {
                m49526kq();
                if (this.f49069N) {
                    this.f49101t.mo49327m9();
                }
            } else {
                this.f49101t.mo49313Zg();
            }
            m49527lq(this.f49101t.mo49293Ig());
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Zj */
    public void mo49451Zj(boolean z11, Exception exc) {
        if (z11) {
            this.f49076U = true;
            return;
        }
        this.f49076U = false;
        if (exc != null) {
            AbstractC20110a.f98889a.mo104552e(exc);
        }
        if (exc instanceof SensitiveDataException) {
            this.f49101t.mo49304Ol();
        } else {
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(exc);
            AbstractC20887g.m109233k(str, 21001, sb2.toString(), 0L, 21000, CoreUtility.f89236l);
            this.f49101t.mo49325li();
        }
        this.f49101t.mo49313Zg();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: Zo */
    public void mo49452Zo() {
        this.f49101t.mo49334rg();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: am */
    public void mo49453am(int i11) {
        if (i11 <= 0) {
            this.f49083b0 = null;
            this.f49070O.m110889i(false);
        } else {
            AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: qy.b
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC9256b.a.m49473a(C9257c.this, 0, 1, null);
                }
            }, i11);
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: cf */
    public void mo49454cf(final AbstractC23958b abstractC23958b) {
        AbstractC19074t.m100208f(abstractC23958b, "item");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.p
            @Override // java.lang.Runnable
            public final void run() {
                C9257c.m49477Eq(C9257c.this, abstractC23958b);
            }
        });
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: d6 */
    public void mo49455d6() {
        this.f49092k0 = 1;
        m49532qq();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: d7 */
    public void mo49456d7(boolean z11) {
        if (!z11) {
            this.f49063H = false;
            this.f49062G = false;
            return;
        }
        this.f49063H = true;
        this.f49062G = false;
        if (this.f49107w && (this.f49078W || (this.f49109x && this.f49076U && this.f49079X))) {
            m49497Qq(this, null, 1, null);
            m49505Vq();
        }
        m49515ar();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: f7 */
    public void mo49457f7(final C23488k c23488k, AbstractC23490m abstractC23490m, int i11) {
        AbstractC19074t.m100208f(c23488k, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        AbstractC19074t.m100208f(abstractC23490m, "preData");
        if (c23488k.m123283d() == 18019 && i11 == 1 && (abstractC23490m instanceof AbstractC23490m.b) && c23488k.m123284e() > 0) {
            m49482Iq(c23488k, (AbstractC23490m.b) abstractC23490m, i11);
        } else {
            m49479Gq(c23488k, abstractC23490m, i11);
        }
        if (C26691l.f126458a.m137150g() != null) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.r
                @Override // java.lang.Runnable
                public final void run() {
                    C9257c.m49478Fq(C23488k.this);
                }
            });
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: g1 */
    public void mo49458g1() {
        m49507Wq(2, 1);
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: g6 */
    public void mo49459g6(boolean z11) {
        this.f49104u0 = z11;
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: g9 */
    public boolean mo49460g9() {
        return true;
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: gn */
    public void mo49461gn() {
        this.f49091j0 = true;
        m49527lq(this.f49101t.mo49293Ig());
        m49532qq();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: j2 */
    public void mo49462j2(boolean z11, boolean z12, boolean z13, boolean z14) {
        m49509Xq(true);
        if (z12 || z13) {
            m49497Qq(this, null, 1, null);
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: n2 */
    public void mo49463n2(boolean z11, boolean z12, boolean z13, boolean z14) {
        m49509Xq(false);
        if (z11) {
            m49507Wq(3, 1);
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: o9 */
    public void mo49464o9() {
        C27385a c27385a = this.f49095n0;
        if (c27385a != null) {
            if (c27385a == null) {
                return;
            }
            this.f49095n0 = null;
            this.f49070O.mo110891k(c27385a, this.f49096o0);
        }
        this.f49096o0 = false;
        this.f49094m0 = false;
        if (!this.f49111y && AbstractC19074t.m100204b(this.f49089h0, a.d.f49117a)) {
            m49505Vq();
        }
        this.f49070O.m110887g();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: p7 */
    public void mo49465p7() {
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: pi */
    public void mo49466pi(String str) {
        AbstractC19074t.m100208f(str, "content");
        if (this.f49098q0) {
            return;
        }
        if (this.f49101t.mo49309S8()) {
            this.f49101t.mo49326lo(str);
            return;
        }
        this.f49098q0 = true;
        this.f49099r0 = str;
        this.f49101t.mo49292Hv();
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: rh */
    public boolean mo49467rh() {
        return this.f49078W;
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: t2 */
    public void mo49468t2() {
        this.f49070O.mo110860R1();
    }

    /* renamed from: tq */
    public final InterfaceC25502a m49542tq() {
        return this.f49101t;
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: ud */
    public void mo49469ud() {
        this.f49092k0 = -2;
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: uq, reason: merged with bridge method [inline-methods] */
    public void mo995Nd(C9255a c9255a, InterfaceC19968g interfaceC19968g) {
        String str;
        super.mo995Nd(c9255a, interfaceC19968g);
        Boolean bool = null;
        if (c9255a != null) {
            str = c9255a.m49426a();
        } else {
            str = null;
        }
        this.f49103u = str;
        if (c9255a != null) {
            bool = Boolean.valueOf(c9255a.m49427b());
        }
        this.f49105v = bool;
        m49507Wq(0, 1);
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: ve */
    public void mo49470ve(byte[] bArr, boolean z11) {
        AbstractC19074t.m100208f(bArr, "data");
        if (!this.f49077V && this.f49109x && this.f49076U && this.f49079X) {
            this.f49077V = true;
            m49536wq();
        }
        if (this.f49078W && this.f49062G && this.f49081Z) {
            if (this.f49070O.mo110861S1()) {
                this.f49070O.mo110858P1(bArr, this.f49080Y);
            }
            if (!this.f49080Y) {
                this.f49080Y = false;
            }
        }
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: yp */
    public void mo49471yp(boolean z11) {
        this.f49096o0 = z11;
    }

    @Override // com.zing.zalo.qrcode.p069ui.scan.InterfaceC9256b
    /* renamed from: z5 */
    public void mo49472z5(final String str, final String str2, final String str3) {
        AbstractC19074t.m100208f(str, "content");
        AbstractC19074t.m100208f(str2, "phone");
        AbstractC19074t.m100208f(str3, "formattedPhone");
        if (C26691l.m137145t()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: qy.d
                @Override // java.lang.Runnable
                public final void run() {
                    C9257c.m49539zq(str, str2, str3);
                }
            });
        }
    }
}
