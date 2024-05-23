package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import bo.C3020p0;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7307b0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.feed.uicontrols.C8870b;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.AbstractC17466e;
import is.AbstractC20809n;
import is.AbstractC20814p0;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p379o3.C24003n;

/* renamed from: com.zing.zalo.feed.components.c6 */
/* loaded from: classes4.dex */
public class C8249c6 extends C16716d {

    /* renamed from: X0 */
    private static final int f45274X0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left);

    /* renamed from: Y0 */
    private static final int f45275Y0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right);

    /* renamed from: Z0 */
    private static final int f45276Z0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top);

    /* renamed from: a1 */
    private static final int f45277a1 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom);

    /* renamed from: b1 */
    private static final int f45278b1 = AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding);

    /* renamed from: M0 */
    C16716d f45279M0;

    /* renamed from: N0 */
    C22126c0 f45280N0;

    /* renamed from: O0 */
    C22126c0 f45281O0;

    /* renamed from: P0 */
    C22126c0 f45282P0;

    /* renamed from: Q0 */
    C11850a f45283Q0;

    /* renamed from: R0 */
    C8870b f45284R0;

    /* renamed from: S0 */
    C22126c0 f45285S0;

    /* renamed from: T0 */
    C21693c f45286T0;

    /* renamed from: U0 */
    int f45287U0;

    /* renamed from: V0 */
    private int f45288V0;

    /* renamed from: W0 */
    private int f45289W0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.c6$a */
    /* loaded from: classes4.dex */
    public class a extends C22126c0 {
        a(Context context) {
            super(context);
        }

        @Override // kd0.C21697g, com.zing.zalo.uidrawing.C16719g
        /* renamed from: q0 */
        public void mo44180q0(int i11, int i12, int i13, int i14) {
            if (i14 == 1073741824) {
                m111953A1((int) Math.min(m111971k1(), Math.max(1.0d, Math.floor((i13 * 1.0f) / m111976p1()))));
            }
            super.mo44180q0(i11, i12, i13, i14);
        }
    }

    /* renamed from: com.zing.zalo.feed.components.c6$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: f */
        public int f45296f;

        /* renamed from: a */
        public String f45291a = "";

        /* renamed from: b */
        public String f45292b = "";

        /* renamed from: c */
        public String f45293c = "";

        /* renamed from: d */
        public String f45294d = "";

        /* renamed from: e */
        public String f45295e = "";

        /* renamed from: g */
        public boolean f45297g = false;

        /* renamed from: h */
        public int f45298h = 0;

        /* renamed from: i */
        public int f45299i = 0;
    }

    public C8249c6(Context context) {
        super(context);
        this.f45288V0 = 0;
        this.f45289W0 = -1;
        this.f45287U0 = AbstractC20809n.m108588v();
    }

    /* renamed from: o1 */
    private int m44638o1() {
        int i11 = this.f45289W0;
        if (i11 != 2 && i11 != 3) {
            return this.f45287U0;
        }
        return AbstractC20814p0.m108611J();
    }

    /* renamed from: p1 */
    private void m44639p1() {
        C22126c0 c22126c0 = this.f45285S0;
        if (c22126c0 != null) {
            m89006m1(c22126c0);
        }
        C21693c c21693c = this.f45286T0;
        if (c21693c != null) {
            m89006m1(c21693c);
        }
    }

    /* renamed from: r1 */
    private void m44640r1() {
        try {
            this.f45280N0.m89106L().m89063o();
            this.f45281O0.m89106L().m89063o();
            this.f45285S0.m89106L().m89063o();
            this.f45286T0.m89106L().m89063o();
            this.f45283Q0.m89106L().m89063o();
            this.f45284R0.m89106L().m89063o();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t1 */
    private void m44641t1() {
        m44642u1();
        m44639p1();
        m89106L().m89028L(-1, -2).m89034R(0).m89035S(0);
        int i11 = this.f45288V0;
        if (i11 != 0) {
            if (i11 == 1) {
                m89106L().m89044a0(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_bottom));
                this.f45284R0.m89106L().m89034R(AbstractC23136l9.m118742r(2.0f)).m89035S(AbstractC23136l9.m118742r(2.0f));
                this.f45280N0.m89106L().m89036T(f45278b1).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_right));
                this.f45281O0.m89106L().m89036T(0).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_right));
                return;
            }
            return;
        }
        m89106L().m89044a0(f45277a1);
        this.f45283Q0.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_right));
        this.f45280N0.m89106L().m89036T(0).m89034R(0).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_right));
        this.f45281O0.m89106L().m89036T(AbstractC23136l9.m118655I(AbstractC16802y.standard_spacing)).m89034R(0).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_right));
    }

    /* renamed from: u1 */
    private void m44642u1() {
        try {
            C22126c0 c22126c0 = this.f45280N0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            this.f45280N0.m89085A0(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_postfeed));
            this.f45280N0.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            this.f45280N0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
            this.f45280N0.mo111965M1(1);
            this.f45280N0.m111982x1(false);
            this.f45280N0.m111953A1(AbstractC23136l9.m118698c0().getInteger(AbstractC7307b0.feed_link_title_maxline));
            this.f45281O0.m89106L().m89060k0(-1).m89030N(-2);
            this.f45281O0.m111980v1(truncateAt);
            this.f45281O0.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
            this.f45281O0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f71));
            this.f45281O0.m111953A1(AbstractC23136l9.m118698c0().getInteger(AbstractC7307b0.feed_link_subtitle_maxline));
            this.f45282P0.m111980v1(truncateAt);
            this.f45282P0.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
            this.f45282P0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f13));
            this.f45282P0.m111953A1(AbstractC23136l9.m118698c0().getInteger(AbstractC7307b0.feed_link_subtitle_maxline));
            this.f45285S0.m89106L().m89060k0(-2).m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h)).m89040X(AbstractC23136l9.m118742r(70.0f)).m89029M(15);
            this.f45285S0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_share));
            AbstractC23022b5.m118023a(this.f45285S0, AbstractC8915g0.btnType3_small);
            this.f45286T0.m89106L().m89060k0(-2).m89030N(-2).m89041Y(AbstractC23136l9.m118742r(5.0f));
            this.f45286T0.mo44614b1(8);
            this.f45286T0.mo111926w1(AbstractC16803z.bg_feed_share);
            mo89161z0(C23212s8.m119607o(getContext(), AbstractC16781w.FeedLinkTextBackgroundColor));
            int i11 = this.f45288V0;
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f45283Q0.mo44614b1(8);
                    C16718f m89030N = this.f45284R0.m89106L().m89060k0(-1).m89030N(-2);
                    int i12 = f45275Y0;
                    m89030N.m89035S(i12);
                    this.f45284R0.mo44614b1(0);
                    this.f45284R0.m111929z1(5);
                    this.f45284R0.m111921r1(true);
                    this.f45284R0.m47327Y1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_btn_slide_play));
                    this.f45284R0.m47328Z1(1.91f);
                    this.f45280N0.m89106L().m89060k0(-2).m89030N(-2).m89032P(0, AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding), AbstractC23136l9.m118742r(90.0f), 0).m89023G(this.f45284R0);
                    this.f45281O0.m89106L().m89023G(this.f45280N0).m89035S(AbstractC23136l9.m118742r(90.0f));
                    C16718f m89035S = this.f45285S0.m89106L().m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding)).m89035S(i12);
                    Boolean bool = Boolean.TRUE;
                    m89035S.m89017A(bool).m89023G(this.f45284R0);
                    this.f45286T0.m89106L().m89036T(AbstractC23136l9.m118742r(5.0f)).m89035S(AbstractC23136l9.m118742r(12.0f)).m89017A(bool).m89023G(this.f45284R0);
                    m89001g1(this.f45284R0);
                    m89001g1(this.f45280N0);
                    m89001g1(this.f45281O0);
                    m89001g1(this.f45285S0);
                    m89001g1(this.f45286T0);
                }
            } else {
                this.f45284R0.mo44614b1(8);
                int m118742r = AbstractC23136l9.m118742r(100.0f);
                C16718f m89106L = this.f45283Q0.m89106L();
                int i13 = f45275Y0;
                m89106L.m89035S(i13).m89060k0(m118742r).m89030N(m118742r).m89073z(Boolean.TRUE);
                this.f45283Q0.mo44614b1(0);
                this.f45283Q0.m115388V1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black_15));
                this.f45283Q0.m115384R1(true);
                this.f45283Q0.m65869e2(1);
                this.f45280N0.m89106L().m89060k0(-1).m89030N(-2).m89035S(i13).m89029M(4).m89054h0(this.f45283Q0);
                this.f45281O0.m89106L().m89071x(this.f45280N0).m89023G(this.f45280N0).m89054h0(this.f45283Q0).m89036T(AbstractC23136l9.m118655I(AbstractC16802y.standard_spacing)).m89035S(i13);
                this.f45285S0.m89106L().m89036T(AbstractC23136l9.m118742r(8.0f)).m89067t(this.f45283Q0).m89054h0(this.f45283Q0);
                this.f45286T0.m89106L().m89036T(AbstractC23136l9.m118742r(8.0f)).m89067t(this.f45283Q0).m89054h0(this.f45283Q0);
                m89001g1(this.f45283Q0);
                m89001g1(this.f45280N0);
                m89001g1(this.f45285S0);
                m89001g1(this.f45281O0);
                m89001g1(this.f45286T0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v1 */
    private void m44643v1() {
        C22126c0 c22126c0;
        m44646z1();
        C16716d c16716d = this.f45279M0;
        if (c16716d != null) {
            c16716d.mo89161z0(AbstractC23136l9.m118641B(c16716d.getContext(), AbstractC16801x.transparent));
        }
        C22126c0 c22126c02 = this.f45282P0;
        if (c22126c02 != null) {
            c22126c02.mo44614b1(8);
        }
        int i11 = this.f45288V0;
        if (i11 != 0) {
            if (i11 == 1 && (c22126c0 = this.f45280N0) != null) {
                c22126c0.m111953A1(AbstractC23136l9.m118698c0().getInteger(AbstractC7307b0.feed_link_profile_nothumb_title_maxline));
                return;
            }
            return;
        }
        C22126c0 c22126c03 = this.f45280N0;
        if (c22126c03 != null) {
            c22126c03.m111953A1(AbstractC23136l9.m118698c0().getInteger(AbstractC7307b0.feed_link_profile_thumb_title_maxline));
        }
    }

    /* renamed from: x1 */
    private void m44644x1() {
        m44646z1();
    }

    /* renamed from: y1 */
    private void m44645y1() {
        m44646z1();
    }

    /* renamed from: z1 */
    private void m44646z1() {
        try {
            m44642u1();
            m89003j1();
            this.f45279M0.m89003j1();
            m89106L().m89028L(-1, -2);
            this.f45282P0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85301f8));
            this.f45281O0.m111979u1(true);
            this.f45281O0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85302f9));
            this.f45281O0.m111962J1(C23212s8.m119607o(getContext(), AbstractC16781w.FeedLinkURLColor));
            this.f45286T0.mo111926w1(AbstractC16803z.ic_share);
            int i11 = this.f45288V0;
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f45284R0.m89106L().m89063o();
                    C16718f m89028L = this.f45284R0.m89106L().m89028L(-1, -2);
                    Boolean bool = Boolean.TRUE;
                    m89028L.m89018B(bool);
                    this.f45284R0.mo44614b1(0);
                    this.f45283Q0.m115388V1(AbstractC23136l9.m118641B(getContext(), C23212s8.m119611s(getContext(), AbstractC16781w.ItemSeparatorColor)));
                    this.f45283Q0.m115389W1(1);
                    this.f45284R0.m115384R1(true);
                    this.f45281O0.m89106L().m89063o();
                    this.f45281O0.m89106L().m89028L(-2, -2).m89029M(12).m89018B(bool).m89073z(bool).m89049e0(this.f45286T0);
                    this.f45280N0.m111984z1(AbstractC23136l9.m118742r(2.0f), 1.0f);
                    this.f45280N0.m89106L().m89063o();
                    this.f45280N0.m89106L().m89028L(-2, -2).m89032P(0, AbstractC23222t7.f112552c, 0, 0).m89023G(this.f45281O0).m89071x(this.f45281O0).m89049e0(this.f45286T0);
                    this.f45280N0.m111953A1(2);
                    this.f45282P0.m89106L().m89063o();
                    this.f45282P0.m89106L().m89028L(-2, -2).m89032P(0, AbstractC23222t7.f112566j, 0, 0).m89023G(this.f45280N0).m89071x(this.f45280N0).m89049e0(this.f45286T0);
                    this.f45282P0.m111953A1(AbstractC23136l9.m118671Q(AbstractC7307b0.feed_link_description_maxline));
                    this.f45286T0.m89106L().m89063o();
                    C16718f m89106L = this.f45286T0.m89106L();
                    int i12 = AbstractC23222t7.f112528I;
                    m89106L.m89028L(i12, i12).m89032P(AbstractC23222t7.f112566j, 0, 0, 0).m89041Y(0).m89017A(bool).m89027K(true);
                    this.f45279M0.m89106L().m89063o();
                    C16718f m89028L2 = this.f45279M0.m89106L().m89028L(-1, -2);
                    int i13 = f45274X0;
                    int i14 = AbstractC23222t7.f112576o;
                    m89028L2.m89042Z(i13, i14, f45275Y0, i14).m89023G(this.f45284R0);
                    this.f45279M0.m89001g1(this.f45286T0);
                    this.f45279M0.m89001g1(this.f45281O0);
                    this.f45279M0.m89001g1(this.f45280N0);
                    this.f45279M0.m89001g1(this.f45282P0);
                    m89001g1(this.f45284R0);
                    m89001g1(this.f45279M0);
                }
            } else {
                this.f45284R0.mo44614b1(8);
                int m44638o1 = m44638o1();
                this.f45283Q0.m89106L().m89063o();
                C16718f m89028L3 = this.f45283Q0.m89106L().m89028L(m44638o1, m44638o1);
                Boolean bool2 = Boolean.TRUE;
                m89028L3.m89073z(bool2);
                this.f45283Q0.m115388V1(AbstractC23136l9.m118641B(getContext(), C23212s8.m119611s(getContext(), AbstractC16781w.ItemSeparatorColor)));
                this.f45283Q0.m115389W1(1);
                this.f45283Q0.m115384R1(true);
                this.f45283Q0.m65869e2(1);
                this.f45281O0.m89106L().m89063o();
                this.f45281O0.m89106L().m89028L(-1, -2).m89018B(bool2);
                this.f45280N0.m89106L().m89063o();
                this.f45280N0.m89106L().m89028L(-1, -2).m89032P(0, AbstractC23222t7.f112552c, 0, 0).m89023G(this.f45281O0);
                this.f45280N0.m111953A1(2);
                this.f45282P0.m89106L().m89063o();
                this.f45282P0.m89106L().m89028L(-2, -2).m89032P(0, AbstractC23222t7.f112566j, 0, 0).m89023G(this.f45280N0);
                this.f45282P0.m111953A1(AbstractC23136l9.m118671Q(AbstractC7307b0.feed_link_description_maxline));
                this.f45286T0.m89106L().m89063o();
                C16718f m89106L2 = this.f45286T0.m89106L();
                int i15 = AbstractC23222t7.f112528I;
                C16718f m89028L4 = m89106L2.m89028L(i15, i15);
                int i16 = f45275Y0;
                m89028L4.m89032P(0, 0, i16, 0).m89041Y(0).m89017A(bool2).m89027K(true);
                this.f45279M0.m89106L().m89063o();
                C16718f m89028L5 = this.f45279M0.m89106L().m89028L(-1, -2);
                int i17 = f45274X0;
                int i18 = AbstractC23222t7.f112576o;
                m89028L5.m89042Z(i17, i18, i16, i18).m89054h0(this.f45283Q0).m89049e0(this.f45286T0).m89027K(true);
                this.f45279M0.m89001g1(this.f45281O0);
                this.f45279M0.m89001g1(this.f45280N0);
                this.f45279M0.m89001g1(this.f45282P0);
                m89001g1(this.f45286T0);
                m89001g1(this.f45283Q0);
                m89001g1(this.f45279M0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q1 */
    public void m44647q1(int i11) {
        this.f45289W0 = i11;
        m89003j1();
        this.f45279M0 = new C16716d(getContext());
        this.f45280N0 = new C22126c0(getContext());
        this.f45281O0 = new C22126c0(getContext());
        this.f45282P0 = new a(getContext());
        this.f45285S0 = new C22126c0(getContext());
        this.f45286T0 = new C21693c(getContext());
        this.f45283Q0 = new C11850a(getContext());
        this.f45284R0 = new C8870b(getContext());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:4:0x0006, B:6:0x0011, B:9:0x001b, B:13:0x0058, B:18:0x008b, B:20:0x009f, B:21:0x00a9, B:29:0x00b7, B:32:0x00bf, B:35:0x00c8, B:36:0x00f5, B:38:0x00f9, B:39:0x0102, B:41:0x0106, B:44:0x0113, B:50:0x010c, B:52:0x00fe, B:54:0x00cc, B:58:0x00de, B:61:0x00e6, B:62:0x00ea, B:65:0x00f2, B:66:0x0078, B:69:0x0086, B:71:0x0024, B:72:0x0037, B:74:0x003b), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:4:0x0006, B:6:0x0011, B:9:0x001b, B:13:0x0058, B:18:0x008b, B:20:0x009f, B:21:0x00a9, B:29:0x00b7, B:32:0x00bf, B:35:0x00c8, B:36:0x00f5, B:38:0x00f9, B:39:0x0102, B:41:0x0106, B:44:0x0113, B:50:0x010c, B:52:0x00fe, B:54:0x00cc, B:58:0x00de, B:61:0x00e6, B:62:0x00ea, B:65:0x00f2, B:66:0x0078, B:69:0x0086, B:71:0x0024, B:72:0x0037, B:74:0x003b), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113 A[Catch: Exception -> 0x0017, TRY_LEAVE, TryCatch #0 {Exception -> 0x0017, blocks: (B:4:0x0006, B:6:0x0011, B:9:0x001b, B:13:0x0058, B:18:0x008b, B:20:0x009f, B:21:0x00a9, B:29:0x00b7, B:32:0x00bf, B:35:0x00c8, B:36:0x00f5, B:38:0x00f9, B:39:0x0102, B:41:0x0106, B:44:0x0113, B:50:0x010c, B:52:0x00fe, B:54:0x00cc, B:58:0x00de, B:61:0x00e6, B:62:0x00ea, B:65:0x00f2, B:66:0x0078, B:69:0x0086, B:71:0x0024, B:72:0x0037, B:74:0x003b), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:4:0x0006, B:6:0x0011, B:9:0x001b, B:13:0x0058, B:18:0x008b, B:20:0x009f, B:21:0x00a9, B:29:0x00b7, B:32:0x00bf, B:35:0x00c8, B:36:0x00f5, B:38:0x00f9, B:39:0x0102, B:41:0x0106, B:44:0x0113, B:50:0x010c, B:52:0x00fe, B:54:0x00cc, B:58:0x00de, B:61:0x00e6, B:62:0x00ea, B:65:0x00f2, B:66:0x0078, B:69:0x0086, B:71:0x0024, B:72:0x0037, B:74:0x003b), top: B:3:0x0006 }] */
    /* renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m44648s1(C23528a c23528a, C3020p0 c3020p0, b bVar, C16719g.c cVar, C16719g.c cVar2, boolean z11) {
        boolean z12;
        int i11;
        C24003n m120126f0;
        int i12;
        C22122a0 c22122a0;
        C22122a0 c22122a02;
        int i13;
        if (c3020p0 != null && bVar != null) {
            try {
                boolean m14479H = c3020p0.m14479H();
                int i14 = 0;
                if (!AbstractC23304d.f113420o2 && this.f45289W0 == 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                String str = "";
                int i15 = this.f45288V0;
                if (i15 != 0) {
                    if (i15 == 1) {
                        str = bVar.f45295e;
                        this.f45284R0.m47329a2(bVar.f45298h, bVar.f45299i);
                        this.f45284R0.m47326X1(bVar.f45297g);
                    }
                } else {
                    str = bVar.f45294d;
                    if (z12) {
                        this.f45280N0.m89087B0(AbstractC17466e.transparent);
                        this.f45285S0.m89087B0(AbstractC16803z.bg_btn_type3_small_n);
                        C22126c0 c22126c0 = this.f45285S0;
                        c22126c0.m111962J1(AbstractC23136l9.m118641B(c22126c0.getContext(), AbstractC16801x.cLike1));
                    }
                }
                this.f45280N0.m111959G1(bVar.f45292b);
                this.f45281O0.m111959G1(bVar.f45291a);
                this.f45282P0.m111959G1(bVar.f45293c);
                int i16 = this.f45289W0;
                if (i16 == 0 || i16 == 1 || i16 == 4) {
                    C22126c0 c22126c02 = this.f45282P0;
                    if (TextUtils.isEmpty(bVar.f45293c)) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    c22126c02.mo44614b1(i11);
                }
                if (cVar != null) {
                    mo89109M0(cVar);
                    this.f45283Q0.mo89109M0(cVar);
                    this.f45284R0.mo89109M0(cVar);
                    this.f45280N0.mo89109M0(cVar);
                }
                if (cVar2 != null) {
                    this.f45286T0.mo89109M0(cVar2);
                    this.f45285S0.mo89109M0(cVar2);
                }
                int i17 = this.f45289W0;
                if (i17 != 0 && i17 != 1 && i17 != 4 && i17 != 2 && i17 != 3) {
                    C21693c c21693c = this.f45286T0;
                    if (m14479H) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    c21693c.mo44614b1(i13);
                    C22126c0 c22126c03 = this.f45285S0;
                    if (m14479H) {
                        i14 = 8;
                    }
                    c22126c03.mo44614b1(i14);
                    if (this.f45288V0 != 1) {
                        m120126f0 = C23278z2.m120094S();
                    } else {
                        m120126f0 = C23278z2.m120126f0();
                    }
                    i12 = this.f45288V0;
                    if (i12 != 0) {
                        c22122a0 = this.f45283Q0;
                    } else if (i12 == 1) {
                        c22122a0 = this.f45284R0;
                    } else {
                        c22122a0 = null;
                    }
                    c22122a02 = c22122a0;
                    if (c22122a02 == null) {
                        c22122a02.mo111925v1(AbstractC23136l9.m118665N(c22122a02.getContext(), AbstractC16803z.bg_feed));
                        c22122a02.m115379M1(c23528a, str, m120126f0, C3979l.b.UNKNOWN, new C22122a0.d().m115396b(6));
                        return;
                    }
                    return;
                }
                this.f45286T0.mo44614b1(0);
                this.f45285S0.mo44614b1(8);
                int i18 = this.f45288V0;
                if (i18 != 0) {
                    if (i18 == 1) {
                        C8870b c8870b = this.f45284R0;
                        if (bVar.f45296f == -1) {
                            i14 = 8;
                        }
                        c8870b.mo44614b1(i14);
                    }
                } else {
                    C11850a c11850a = this.f45283Q0;
                    if (bVar.f45296f == -1) {
                        i14 = 8;
                    }
                    c11850a.mo44614b1(i14);
                }
                if (this.f45288V0 != 1) {
                }
                i12 = this.f45288V0;
                if (i12 != 0) {
                }
                c22122a02 = c22122a0;
                if (c22122a02 == null) {
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: w1 */
    public void m44649w1(int i11) {
        this.f45288V0 = i11;
        m44640r1();
        int i12 = this.f45289W0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    if (i12 != 4) {
                        if (i12 == 6) {
                            m44641t1();
                            return;
                        }
                        return;
                    }
                } else {
                    m44643v1();
                    return;
                }
            } else {
                m44644x1();
                return;
            }
        }
        m44645y1();
    }
}
