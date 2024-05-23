package q80;

import ai.C0862b;
import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2814h;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.C19322f1;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ti0.C26705d;
import ti0.C26707f;
import vl0.AbstractC28291a;

/* renamed from: q80.p */
/* loaded from: classes6.dex */
public final class C25177p extends C16716d {
    public static final c Companion = new c(null);

    /* renamed from: d1 */
    private static final InterfaceC24854k f120764d1;

    /* renamed from: e1 */
    private static final InterfaceC24854k f120765e1;

    /* renamed from: M0 */
    private d f120766M0;

    /* renamed from: N0 */
    private final C16716d f120767N0;

    /* renamed from: O0 */
    private final C21693c f120768O0;

    /* renamed from: P0 */
    private final C16716d f120769P0;

    /* renamed from: Q0 */
    private final C22126c0 f120770Q0;

    /* renamed from: R0 */
    private final C22126c0 f120771R0;

    /* renamed from: S0 */
    private final C22126c0 f120772S0;

    /* renamed from: T0 */
    private final C22126c0 f120773T0;

    /* renamed from: U0 */
    private final C16719g f120774U0;

    /* renamed from: V0 */
    private C21693c f120775V0;

    /* renamed from: W0 */
    private final int f120776W0;

    /* renamed from: X0 */
    private final int f120777X0;

    /* renamed from: Y0 */
    private final InterfaceC24854k f120778Y0;

    /* renamed from: Z0 */
    private final InterfaceC24854k f120779Z0;

    /* renamed from: a1 */
    private final C23528a f120780a1;

    /* renamed from: b1 */
    private final C22126c0 f120781b1;

    /* renamed from: c1 */
    private final int f120782c1;

    /* renamed from: q80.p$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f120783q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(AbstractC23136l9.m118742r(15.0f));
        }
    }

    /* renamed from: q80.p$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f120784q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(AbstractC23136l9.m118742r(13.0f));
        }
    }

    /* renamed from: q80.p$c */
    /* loaded from: classes6.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final float m130324c() {
            return ((Number) C25177p.f120764d1.getValue()).floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final float m130325d() {
            return ((Number) C25177p.f120765e1.getValue()).floatValue();
        }
    }

    /* renamed from: q80.p$d */
    /* loaded from: classes6.dex */
    public interface d {
        /* renamed from: a */
        void mo109639a();

        /* renamed from: c */
        void mo109640c();
    }

    /* renamed from: q80.p$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f120785q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(0);
            this.f120785q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3977j mo12V4() {
            return new C3977j(this.f120785q);
        }
    }

    /* renamed from: q80.p$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f120786q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.f120786q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(this.f120786q, 80.0f));
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(a.f120783q);
        f120764d1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f120784q);
        f120765e1 = m129210a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25177p(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        C22126c0 c22126c0;
        int i11;
        AbstractC19074t.m100208f(context, "context");
        int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f120776W0 = m119607o;
        int m119607o2 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f120777X0 = m119607o2;
        m129210a = AbstractC24856m.m129210a(new f(context));
        this.f120778Y0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new e(context));
        this.f120779Z0 = m129210a2;
        this.f120780a1 = new C23528a(context);
        int m119607o3 = C23212s8.m119607o(context, AbstractC28291a.accent_blue_text);
        this.f120782c1 = m119607o3;
        int m118712h = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 12.0f);
        m89106L().m89028L(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f120767N0 = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23136l9.m118742r(16.0f)).m89047c0(AbstractC23136l9.m118742r(16.0f)).m89039W(AbstractC23136l9.m118742r(72.0f)).m89029M(12);
        C25174m c25174m = new C25174m(context);
        this.f120768O0 = c25174m;
        C16718f m89028L = c25174m.m89106L().m89028L(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89032P(0, m118712h2, m118712h, m118712h2);
        C21693c c21693c = new C21693c(context);
        this.f120775V0 = c21693c;
        c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(34.0f), AbstractC23136l9.m118742r(34.0f)).m89017A(bool).m89027K(true).m89041Y(AbstractC23136l9.m118742r(9.0f));
        C16716d c16716d2 = new C16716d(context);
        this.f120769P0 = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89054h0(c25174m).m89048d0(AbstractC23136l9.m118742r(16.0f)).m89044a0(AbstractC23136l9.m118742r(16.0f));
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89106L().m89028L(-2, -2);
        C22126c0 c22126c02 = new C22126c0(context);
        int m118712h3 = AbstractC23136l9.m118712h(context, 7.0f);
        int m118712h4 = AbstractC23136l9.m118712h(context, 4.0f);
        c22126c02.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true).m89042Z(m118712h3, m118712h4, m118712h3, m118712h4).m89034R(AbstractC23136l9.m118712h(context, 6.0f));
        new C26707f(c22126c02).m137318a(C26705d.m137293a(context, AbstractC2814h.t_xxxxsmall_m));
        c22126c02.m111953A1(1);
        c22126c02.m111957E1(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c02.m111980v1(truncateAt);
        c22126c02.m111962J1(m119607o3);
        c22126c02.m111959G1("Mini App");
        c22126c02.m111982x1(false);
        c22126c02.m89087B0(AbstractC16803z.bg_label_mini_app);
        c22126c02.mo44614b1(8);
        this.f120781b1 = c22126c02;
        C22126c0 c22126c03 = new C22126c0(context);
        c22126c03.m89106L().m89028L(-2, -2).m89049e0(c22126c02);
        c cVar = Companion;
        c22126c03.mo111964L1(cVar.m130324c());
        c22126c03.mo111965M1(0);
        c22126c03.m111962J1(m119607o);
        c22126c03.m111953A1(1);
        c22126c03.m111957E1(true);
        c22126c03.m111980v1(truncateAt);
        this.f120770Q0 = c22126c03;
        c16716d3.m89001g1(c22126c02);
        c16716d3.m89001g1(c22126c03);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f120771R0 = c22126c04;
        c22126c04.mo111964L1(cVar.m130325d());
        c22126c04.mo111965M1(0);
        c22126c04.m111962J1(m119607o2);
        c22126c04.m111980v1(truncateAt);
        c22126c04.m111953A1(1);
        c22126c04.m89106L().m89028L(-1, -2).m89023G(c16716d3);
        C22126c0 c22126c05 = new C22126c0(context);
        this.f120772S0 = c22126c05;
        c22126c05.mo44614b1(8);
        c22126c05.mo111964L1(cVar.m130325d());
        c22126c05.mo111965M1(0);
        c22126c05.m111962J1(m119607o2);
        c22126c05.m111980v1(truncateAt);
        c22126c05.m89106L().m89028L(-1, -2).m89036T(AbstractC23136l9.m118742r(4.0f)).m89023G(c22126c04);
        c16716d2.m89001g1(c16716d3);
        c16716d2.m89001g1(c22126c04);
        c16716d2.m89001g1(c22126c05);
        if (C19322f1.f95953d) {
            c22126c0 = new C22126c0(context);
        } else {
            c22126c0 = null;
        }
        this.f120773T0 = c22126c0;
        if (c22126c0 != null) {
            c22126c0.mo111964L1(cVar.m130325d());
            c22126c0.mo111965M1(0);
            c22126c0.m111962J1(m119607o2);
            i11 = -1;
            c22126c0.m89106L().m89028L(-1, -2).m89023G(c22126c05).m89036T(AbstractC23136l9.m118742r(4.0f));
            c16716d2.m89001g1(c22126c0);
        } else {
            i11 = -1;
        }
        C16719g c16719g = new C16719g(context);
        c16719g.m89106L().m89028L(i11, 1).m89072y(bool).m89034R(m130317x1());
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f120774U0 = c16719g;
        c16716d.m89001g1(c25174m);
        c16716d.m89001g1(this.f120775V0);
        c16716d.m89001g1(c16716d2);
        m89001g1(c16716d);
        m89001g1(c16719g);
        m89087B0(AbstractC16803z.search_global_bg_rect_white_with_press_state);
        mo89109M0(new C16719g.c() { // from class: q80.n
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g2) {
                C25177p.m130310q1(C25177p.this, c16719g2);
            }
        });
        m89111N0(new C16719g.d() { // from class: q80.o
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g2) {
                C25177p.m130311r1(C25177p.this, c16719g2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m130310q1(C25177p c25177p, C16719g c16719g) {
        AbstractC19074t.m100208f(c25177p, "this$0");
        d dVar = c25177p.f120766M0;
        if (dVar != null) {
            dVar.mo109640c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m130311r1(C25177p c25177p, C16719g c16719g) {
        AbstractC19074t.m100208f(c25177p, "this$0");
        d dVar = c25177p.f120766M0;
        if (dVar != null) {
            dVar.mo109639a();
        }
    }

    /* renamed from: w1 */
    private final C3977j m130314w1() {
        return (C3977j) this.f120779Z0.getValue();
    }

    /* renamed from: u1 */
    public final void m130315u1(C0862b c0862b) {
        AbstractC19074t.m100208f(c0862b, "item");
        try {
            if (c0862b.m2477a().length() > 0) {
                AbstractC23268y2.m120033g(this.f120780a1, m130314w1(), this.f120768O0, c0862b.m2477a(), C23278z2.m120126f0(), false);
            }
            this.f120770Q0.m111959G1(c0862b.m2489o());
            if (c0862b.m2485k().length() == 0) {
                this.f120771R0.mo44614b1(8);
            } else {
                this.f120771R0.m111959G1(c0862b.m2485k());
                this.f120771R0.mo44614b1(0);
            }
            this.f120772S0.mo44614b1(8);
            this.f120775V0.mo44614b1(8);
            C22126c0 c22126c0 = this.f120773T0;
            if (c22126c0 != null) {
                String m2480f = c0862b.m2480f();
                if (m2480f.length() == 0) {
                    m2480f = String.valueOf(c0862b.mo2479d());
                }
                c22126c0.m111959G1(m2480f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v1 */
    public final C16719g m130316v1() {
        return this.f120774U0;
    }

    /* renamed from: x1 */
    public final int m130317x1() {
        return ((Number) this.f120778Y0.getValue()).intValue();
    }

    /* renamed from: y1 */
    public final void m130318y1(d dVar) {
        this.f120766M0 = dVar;
    }

    /* renamed from: z1 */
    public final void m130319z1(boolean z11) {
        int i11;
        C22126c0 c22126c0 = this.f120781b1;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c22126c0.mo44614b1(i11);
    }
}
