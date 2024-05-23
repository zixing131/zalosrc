package p219hw;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.C17014k0;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.C17072x0;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import fn0.AbstractC19074t;
import kd0.C21693c;
import ki0.C21740h;
import ki0.EnumC21741i;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import ui0.C27280g;

/* renamed from: hw.n */
/* loaded from: classes4.dex */
public final class C20150n extends C16716d {

    /* renamed from: M0 */
    private C16716d f99477M0;

    /* renamed from: N0 */
    private C16716d f99478N0;

    /* renamed from: O0 */
    private C16971e f99479O0;

    /* renamed from: P0 */
    private C21693c f99480P0;

    /* renamed from: Q0 */
    private C16716d f99481Q0;

    /* renamed from: R0 */
    private C21740h f99482R0;

    /* renamed from: S0 */
    private C17023o f99483S0;

    /* renamed from: T0 */
    private C21740h f99484T0;

    /* renamed from: U0 */
    private C17023o f99485U0;

    /* renamed from: V0 */
    private C17014k0 f99486V0;

    /* renamed from: W0 */
    private C16959c0 f99487W0;

    /* renamed from: X0 */
    private C16959c0 f99488X0;

    /* renamed from: Y0 */
    private C16959c0 f99489Y0;

    /* renamed from: Z0 */
    private C16959c0 f99490Z0;

    /* renamed from: a1 */
    private C16716d f99491a1;

    /* renamed from: b1 */
    private C16959c0 f99492b1;

    /* renamed from: c1 */
    private C16959c0 f99493c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20150n(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 4.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 8.0f);
        int m118712h3 = AbstractC23136l9.m118712h(context, 12.0f);
        int m118712h4 = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h5 = AbstractC23136l9.m118712h(context, 19.0f);
        int m118712h6 = AbstractC23136l9.m118712h(context, 20.0f);
        int m118712h7 = AbstractC23136l9.m118712h(context, 24.0f);
        int m118712h8 = AbstractC23136l9.m118712h(context, 32.0f);
        int m118712h9 = AbstractC23136l9.m118712h(context, 48.0f);
        int m118712h10 = AbstractC23136l9.m118712h(context, 64.0f);
        int m119607o = C23212s8.m119607o(context, AbstractC2807a.TextColor1);
        int m119607o2 = C23212s8.m119607o(context, AbstractC2807a.TextColor2);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-1, -2);
        this.f99477M0 = c16716d;
        C16716d c16716d2 = new C16716d(context);
        C16718f m89032P = c16716d2.m89106L().m89028L(m118712h10, m118712h10).m89032P(m118712h4, m118712h7, 0, 0);
        Boolean bool = Boolean.TRUE;
        m89032P.m89073z(bool).m89018B(bool);
        this.f99478N0 = c16716d2;
        C16971e c16971e = new C16971e(context, EnumC16949e.SIZE_64);
        c16971e.setIdTracking("FRIEND_PROFILE_VIEW_SOCIAL");
        this.f99479O0 = c16971e;
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89028L(-2, -2).m89017A(bool).m89072y(bool);
        c21693c.mo111926w1(AbstractC16803z.ic_banned);
        this.f99480P0 = c21693c;
        this.f99478N0.m89001g1(this.f99479O0);
        this.f99478N0.m89001g1(this.f99480P0);
        this.f99477M0.m89001g1(this.f99478N0);
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89106L().m89028L(-2, -2).m89054h0(this.f99478N0).m89035S(m118712h2);
        this.f99481Q0 = c16716d3;
        C17023o c17023o = new C17023o(context);
        c17023o.m89106L().m89017A(bool).m89036T(m118712h5).m89029M(15);
        c17023o.m91110o1(AbstractC2814h.ButtonSmall_TertiaryNeutral);
        c17023o.m91112r1(C27280g.m139660c(context, AbstractC2810d.zds_ic_edit_text_line_16, AbstractC2807a.TextColor1));
        c17023o.setIdTracking("FRIEND_PROFILE_EDIT_ALIAS");
        this.f99483S0 = c17023o;
        this.f99481Q0.m89001g1(c17023o);
        C21740h c21740h = new C21740h(context);
        c21740h.m89106L().m89028L(-2, -2).m89029M(8388611).m89036T(m118712h7).m89034R(m118712h4).m89049e0(this.f99483S0);
        c21740h.mo111965M1(1);
        c21740h.mo111964L1(AbstractC23222t7.f112586t);
        c21740h.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c21740h.m111980v1(truncateAt);
        c21740h.m111962J1(m119607o);
        this.f99482R0 = c21740h;
        this.f99481Q0.m89001g1(c21740h);
        this.f99477M0.m89001g1(this.f99481Q0);
        C21740h c21740h2 = new C21740h(context);
        c21740h2.m89106L().m89028L(-2, -2).m89032P(m118712h4, 0, m118712h4, 0).m89029M(8388611).m89023G(this.f99481Q0).m89054h0(this.f99478N0);
        c21740h2.mo111965M1(0);
        c21740h2.mo111964L1(AbstractC23222t7.f112582r);
        c21740h2.m111953A1(2);
        c21740h2.m111980v1(truncateAt);
        c21740h2.m111962J1(m119607o2);
        this.f99484T0 = c21740h2;
        this.f99477M0.m89001g1(c21740h2);
        m89001g1(this.f99477M0);
        C17023o c17023o2 = new C17023o(context);
        c17023o2.m91110o1(AbstractC2814h.ButtonSmall_Secondary);
        c17023o2.m89106L().m89028L(-1, m118712h8).m89032P(m118712h4, m118712h3, m118712h4, 0).m89023G(this.f99477M0);
        c17023o2.setIdTracking("FRIEND_PROFILE_TAP_CSC");
        this.f99485U0 = c17023o2;
        m89001g1(c17023o2);
        C17014k0 c17014k0 = new C17014k0(context, AbstractC2814h.ProgressBar_Size32_Blue);
        c17014k0.m89106L().m89028L(-2, m118712h8).m89025I(true).m89036T(m118712h3).m89023G(this.f99485U0);
        c17014k0.m91065j1(true);
        this.f99486V0 = c17014k0;
        m89001g1(c17014k0);
        C16959c0 c16959c0 = new C16959c0(context);
        c16959c0.m89087B0(C23212s8.m119611s(context, AbstractC2807a.list_item_background));
        c16959c0.m89106L().m89028L(-1, -2).m89023G(this.f99486V0);
        C21693c c21693c2 = new C21693c(context);
        c21693c2.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_user_solid_16, AbstractC2807a.icon_02));
        c21693c2.m89106L().m89028L(m118712h4, m118712h4);
        c16959c0.m90814p1(c21693c2);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        c16959c0.m90823z1(enumC16952b0);
        c16959c0.m90800B1("");
        c16959c0.m90806H1(m119607o);
        c16959c0.m90807I1(2);
        c16959c0.m90799A1(m118712h9, 0, m118712h4, 0);
        this.f99487W0 = c16959c0;
        m89001g1(c16959c0);
        C16959c0 c16959c02 = new C16959c0(context);
        c16959c02.m89087B0(C23212s8.m119611s(context, AbstractC2807a.list_item_background));
        c16959c02.m89106L().m89028L(-1, -2).m89023G(this.f99487W0).m89029M(1);
        C21693c c21693c3 = new C21693c(context);
        c21693c3.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_group_solid_16, AbstractC2807a.icon_02));
        c21693c3.m89106L().m89028L(m118712h4, m118712h4);
        c16959c02.m90814p1(c21693c3);
        c16959c02.m90800B1("");
        C21693c c21693c4 = new C21693c(context);
        c21693c4.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        c16959c02.m90816r1(c21693c4);
        c16959c02.m90810L1(enumC16952b0);
        c16959c02.m90823z1(enumC16952b0);
        c16959c02.m90806H1(m119607o);
        c16959c02.m90807I1(1);
        c16959c02.m90799A1(m118712h9, 0, m118712h4, 0);
        c16959c02.setIdTracking("FRIEND_PROFILE_MUTUAL_GROUP");
        this.f99488X0 = c16959c02;
        m89001g1(c16959c02);
        C16959c0 c16959c03 = new C16959c0(context);
        c16959c03.m89087B0(C23212s8.m119611s(context, AbstractC2807a.list_item_background));
        c16959c03.m89106L().m89028L(-1, -2).m89023G(this.f99488X0);
        C21693c c21693c5 = new C21693c(context);
        c21693c5.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_clock_1_solid_16, AbstractC2807a.icon_02));
        c21693c5.m89106L().m89028L(m118712h4, m118712h4);
        c16959c03.m90814p1(c21693c5);
        c16959c03.m90800B1("");
        C21693c c21693c6 = new C21693c(context);
        c21693c6.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        c16959c03.m90816r1(c21693c6);
        c16959c03.m90810L1(enumC16952b0);
        c16959c03.m90823z1(enumC16952b0);
        c16959c03.m90806H1(m119607o);
        c16959c03.m90807I1(1);
        c16959c03.m90799A1(m118712h9, 0, m118712h4, 0);
        c16959c03.setIdTracking("FRIEND_PROFILE_SHARED_TIMELINE");
        this.f99489Y0 = c16959c03;
        m89001g1(c16959c03);
        C16959c0 c16959c04 = new C16959c0(context);
        c16959c04.m89087B0(C23212s8.m119611s(context, AbstractC2807a.list_item_background));
        c16959c04.m89106L().m89028L(-1, -2).m89023G(this.f99489Y0);
        C21693c c21693c7 = new C21693c(context);
        c21693c7.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_star_solid_24, AbstractC2807a.icon_02));
        c21693c7.m89106L().m89028L(m118712h4, m118712h4);
        c16959c04.m90814p1(c21693c7);
        c16959c04.m90800B1("");
        c16959c04.m90816r1(new C17072x0(context, EnumC21741i.SMALL));
        c16959c04.m90810L1(enumC16952b0);
        c16959c04.m90823z1(enumC16952b0);
        c16959c04.m90806H1(m119607o);
        c16959c04.m90807I1(1);
        c16959c04.m90799A1(m118712h9, 0, m118712h4, 0);
        c16959c04.m90812N1(false);
        c16959c04.setIdTracking("FRIEND_PROFILE_CLOSE_FRIEND");
        this.f99490Z0 = c16959c04;
        m89001g1(c16959c04);
        C16716d c16716d4 = new C16716d(context);
        c16716d4.m89106L().m89028L(-1, -2).m89032P(m118712h4, m118712h, m118712h4, m118712h6).m89023G(this.f99490Z0);
        c16716d4.m89087B0(AbstractC16803z.bg_rounded_corner_12dp_gray);
        this.f99491a1 = c16716d4;
        C16959c0 c16959c05 = new C16959c0(context);
        c16959c05.setIdTracking("FRIEND_PROFILE_MANAGE_BLOCKING");
        c16959c05.m89106L().m89028L(-1, -2);
        c16959c05.m90799A1(m118712h3, 0, m118712h3, 0);
        c16959c05.m90800B1("");
        c16959c05.mo89161z0(0);
        C21693c c21693c8 = new C21693c(context);
        c21693c8.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        c16959c05.m90816r1(c21693c8);
        this.f99492b1 = c16959c05;
        C16959c0 c16959c06 = new C16959c0(context);
        c16959c06.setIdTracking("FRIEND_PROFILE_DELETE_FRIEND");
        c16959c06.m89106L().m89028L(-1, -2).m89023G(this.f99492b1);
        c16959c06.m90800B1("");
        c16959c06.mo89161z0(0);
        c16959c06.m90812N1(false);
        this.f99493c1 = c16959c06;
        this.f99491a1.m89001g1(this.f99492b1);
        this.f99491a1.m89001g1(this.f99493c1);
        m89001g1(this.f99491a1);
        m89106L().m89028L(-1, -2);
    }

    /* renamed from: A1 */
    public final C16971e m105126A1() {
        return this.f99479O0;
    }

    /* renamed from: o1 */
    public final C17023o m105127o1() {
        return this.f99483S0;
    }

    /* renamed from: p1 */
    public final C17023o m105128p1() {
        return this.f99485U0;
    }

    /* renamed from: q1 */
    public final C21693c m105129q1() {
        return this.f99480P0;
    }

    /* renamed from: r1 */
    public final C16959c0 m105130r1() {
        return this.f99487W0;
    }

    /* renamed from: s1 */
    public final C16959c0 m105131s1() {
        return this.f99493c1;
    }

    /* renamed from: t1 */
    public final C16959c0 m105132t1() {
        return this.f99492b1;
    }

    /* renamed from: u1 */
    public final C16959c0 m105133u1() {
        return this.f99490Z0;
    }

    /* renamed from: v1 */
    public final C16959c0 m105134v1() {
        return this.f99489Y0;
    }

    /* renamed from: w1 */
    public final C16959c0 m105135w1() {
        return this.f99488X0;
    }

    /* renamed from: x1 */
    public final C17014k0 m105136x1() {
        return this.f99486V0;
    }

    /* renamed from: y1 */
    public final C21740h m105137y1() {
        return this.f99482R0;
    }

    /* renamed from: z1 */
    public final C21740h m105138z1() {
        return this.f99484T0;
    }
}
