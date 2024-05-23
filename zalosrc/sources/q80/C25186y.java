package q80;

import android.content.Context;
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
import kd0.C21696f;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p612wk.AbstractC29069a;
import p716zh.C32178x9;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: q80.y */
/* loaded from: classes6.dex */
public final class C25186y extends C16716d {
    public static final c Companion = new c(null);

    /* renamed from: d1 */
    private static final InterfaceC24854k f120846d1;

    /* renamed from: e1 */
    private static final InterfaceC24854k f120847e1;

    /* renamed from: M0 */
    private d f120848M0;

    /* renamed from: N0 */
    private final C16716d f120849N0;

    /* renamed from: O0 */
    private final C21693c f120850O0;

    /* renamed from: P0 */
    private final C16716d f120851P0;

    /* renamed from: Q0 */
    private final C22126c0 f120852Q0;

    /* renamed from: R0 */
    private final C22126c0 f120853R0;

    /* renamed from: S0 */
    private final C22126c0 f120854S0;

    /* renamed from: T0 */
    private final C22126c0 f120855T0;

    /* renamed from: U0 */
    private C21696f f120856U0;

    /* renamed from: V0 */
    private C21693c f120857V0;

    /* renamed from: W0 */
    private final C16719g f120858W0;

    /* renamed from: X0 */
    private final int f120859X0;

    /* renamed from: Y0 */
    private final int f120860Y0;

    /* renamed from: Z0 */
    private final int f120861Z0;

    /* renamed from: a1 */
    private final float f120862a1;

    /* renamed from: b1 */
    private final InterfaceC24854k f120863b1;

    /* renamed from: c1 */
    private final InterfaceC24854k f120864c1;

    /* renamed from: q80.y$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f120865q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(AbstractC23136l9.m118742r(15.0f));
        }
    }

    /* renamed from: q80.y$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f120866q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(AbstractC23136l9.m118742r(14.0f));
        }
    }

    /* renamed from: q80.y$c */
    /* loaded from: classes6.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final float m130377c() {
            return ((Number) C25186y.f120846d1.getValue()).floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final float m130378d() {
            return ((Number) C25186y.f120847e1.getValue()).floatValue();
        }
    }

    /* renamed from: q80.y$d */
    /* loaded from: classes6.dex */
    public interface d {
        /* renamed from: a */
        void mo109734a();

        /* renamed from: c */
        void mo109735c();
    }

    /* renamed from: q80.y$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f120867q;

        /* renamed from: r */
        final /* synthetic */ C25186y f120868r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, C25186y c25186y) {
            super(0);
            this.f120867q = context;
            this.f120868r = c25186y;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(this.f120867q, this.f120868r.f120862a1));
        }
    }

    /* renamed from: q80.y$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f120869q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.f120869q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(this.f120869q, 62.0f));
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(a.f120865q);
        f120846d1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f120866q);
        f120847e1 = m129210a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25186y(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        C22126c0 c22126c0;
        AbstractC19074t.m100208f(context, "context");
        int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f120859X0 = m119607o;
        int m119607o2 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f120860Y0 = m119607o2;
        int m119607o3 = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        this.f120861Z0 = m119607o3;
        this.f120862a1 = 48.0f;
        m129210a = AbstractC24856m.m129210a(new e(context, this));
        this.f120863b1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new f(context));
        this.f120864c1 = m129210a2;
        m89106L().m89028L(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f120849N0 = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23136l9.m118742r(16.0f)).m89047c0(AbstractC23136l9.m118742r(16.0f)).m89039W(AbstractC23136l9.m118742r(48.0f)).m89029M(12);
        C21693c c21693c = new C21693c(context);
        this.f120850O0 = c21693c;
        C16718f m89028L = c21693c.m89106L().m89028L(m130368y1(), m130368y1());
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89035S(AbstractC23136l9.m118742r(16.0f)).m89027K(true);
        c21693c.mo111926w1(AbstractC16803z.ic_setting_line_24_search_global);
        C21693c c21693c2 = new C21693c(context);
        this.f120857V0 = c21693c2;
        c21693c2.m89106L().m89028L(AbstractC23136l9.m118742r(34.0f), AbstractC23136l9.m118742r(34.0f)).m89017A(bool).m89027K(true).m89041Y(AbstractC23136l9.m118742r(9.0f));
        C21696f c21696f = new C21696f(context);
        this.f120856U0 = c21696f;
        c21696f.m89106L().m89028L(-2, -2).m89049e0(this.f120857V0).m89034R(AbstractC23136l9.m118742r(8.0f)).m89027K(true);
        this.f120856U0.mo89099H0(false);
        this.f120856U0.mo44614b1(8);
        C16716d c16716d2 = new C16716d(context);
        this.f120851P0 = c16716d2;
        c16716d2.m89106L().m89028L(-1, -2).m89054h0(c21693c).m89049e0(this.f120856U0).m89027K(true).m89048d0(AbstractC23136l9.m118742r(12.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f));
        C22126c0 c22126c02 = new C22126c0(context);
        this.f120852Q0 = c22126c02;
        c cVar = Companion;
        c22126c02.mo111964L1(cVar.m130377c());
        c22126c02.mo111965M1(0);
        c22126c02.m111962J1(m119607o);
        c22126c02.m89106L().m89028L(-1, -2);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f120853R0 = c22126c03;
        c22126c03.mo111964L1(cVar.m130378d());
        c22126c03.mo111965M1(0);
        c22126c03.m111962J1(m119607o2);
        c22126c03.m89106L().m89028L(-1, -2).m89036T(AbstractC23136l9.m118742r(4.0f)).m89023G(c22126c02);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f120854S0 = c22126c04;
        c22126c04.mo44614b1(8);
        c22126c04.mo111964L1(cVar.m130378d());
        c22126c04.mo111965M1(0);
        c22126c04.m111962J1(m119607o2);
        c22126c04.m89106L().m89028L(-1, -2).m89036T(AbstractC23136l9.m118742r(4.0f)).m89023G(c22126c03);
        c16716d2.m89001g1(c22126c02);
        c16716d2.m89001g1(c22126c03);
        c16716d2.m89001g1(c22126c04);
        if (C19322f1.f95953d) {
            c22126c0 = new C22126c0(context);
        } else {
            c22126c0 = null;
        }
        this.f120855T0 = c22126c0;
        if (c22126c0 != null) {
            c22126c0.mo111964L1(cVar.m130378d());
            c22126c0.mo111965M1(0);
            c22126c0.m111962J1(m119607o2);
            c22126c0.m89106L().m89028L(-1, -2).m89023G(c22126c04).m89036T(AbstractC23136l9.m118742r(4.0f));
            c16716d2.m89001g1(c22126c0);
        }
        c16716d.m89001g1(c21693c);
        c16716d.m89001g1(this.f120857V0);
        c16716d.m89001g1(this.f120856U0);
        c16716d.m89001g1(c16716d2);
        C16719g c16719g = new C16719g(context);
        c16719g.mo89161z0(m119607o3);
        c16719g.m89106L().m89028L(-1, 1).m89023G(c16716d).m89034R(m130372z1());
        this.f120858W0 = c16719g;
        m89001g1(c16716d);
        m89001g1(c16719g);
        m89087B0(AbstractC16803z.search_global_bg_rect_white_with_press_state);
        mo89109M0(new C16719g.c() { // from class: q80.w
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g2) {
                C25186y.m130362q1(C25186y.this, c16719g2);
            }
        });
        m89111N0(new C16719g.d() { // from class: q80.x
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g2) {
                C25186y.m130363r1(C25186y.this, c16719g2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m130362q1(C25186y c25186y, C16719g c16719g) {
        AbstractC19074t.m100208f(c25186y, "this$0");
        d dVar = c25186y.f120848M0;
        if (dVar != null) {
            dVar.mo109735c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m130363r1(C25186y c25186y, C16719g c16719g) {
        AbstractC19074t.m100208f(c25186y, "this$0");
        d dVar = c25186y.f120848M0;
        if (dVar != null) {
            dVar.mo109734a();
        }
    }

    /* renamed from: w1 */
    private final void m130367w1(AbstractC29069a.v vVar) {
        C32178x9 m145222b = vVar.m145222b();
        this.f120852Q0.m111959G1(vVar.m145224d());
        this.f120853R0.m111959G1(vVar.m145225e());
        C22126c0 c22126c0 = this.f120855T0;
        if (c22126c0 != null) {
            c22126c0.m111959G1("priority= " + m145222b.f148375D);
        }
    }

    /* renamed from: y1 */
    private final int m130368y1() {
        return ((Number) this.f120863b1.getValue()).intValue();
    }

    /* renamed from: A1 */
    public final void m130369A1(d dVar) {
        this.f120848M0 = dVar;
    }

    /* renamed from: v1 */
    public final void m130370v1(AbstractC29069a.v vVar) {
        AbstractC19074t.m100208f(vVar, "item");
        m130367w1(vVar);
    }

    /* renamed from: x1 */
    public final C16719g m130371x1() {
        return this.f120858W0;
    }

    /* renamed from: z1 */
    public final int m130372z1() {
        return ((Number) this.f120864c1.getValue()).intValue();
    }
}
