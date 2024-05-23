package com.zing.zalo.p077ui.moduleview.chatinfo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21693c;
import l30.AbstractC22055v0;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import l80.C22132g;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class BaseMemberItemModuleView extends ModulesView {

    /* renamed from: V */
    public static int f64547V = 4;

    /* renamed from: K */
    public C23528a f64548K;

    /* renamed from: L */
    public C16719g f64549L;

    /* renamed from: M */
    public C22124b0 f64550M;

    /* renamed from: N */
    public C22126c0 f64551N;

    /* renamed from: O */
    public C22129e f64552O;

    /* renamed from: P */
    public C21693c f64553P;

    /* renamed from: Q */
    public C16716d f64554Q;

    /* renamed from: R */
    public C22126c0 f64555R;

    /* renamed from: S */
    public C21693c f64556S;

    /* renamed from: T */
    public C22132g f64557T;

    /* renamed from: U */
    public C3977j f64558U;

    public BaseMemberItemModuleView(Context context, C23528a c23528a) {
        super(context);
        this.f64548K = c23528a;
        this.f64558U = new C3977j(context);
        m88987U(-2, -2);
        setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(0.0f), AbstractC23136l9.m118742r(0.0f));
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
        C16719g c16719g = new C16719g(context);
        this.f64549L = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        C16718f m89034R = this.f64549L.m89106L().m89028L(-1, 1).m89034R(AbstractC23136l9.m118742r(64.0f));
        Boolean bool = Boolean.TRUE;
        m89034R.m89018B(bool);
        int m118742r = AbstractC23136l9.m118742r(2.0f);
        int m118742r2 = AbstractC23136l9.m118742r(2.0f);
        C22129e c22129e = new C22129e(context, AbstractC23136l9.m118655I(AbstractC16802y.avt_M) + m118742r + m118742r2);
        this.f64552O = c22129e;
        c22129e.m115427A1(AbstractC22055v0.m115162v(context));
        this.f64552O.m115428B1(m118742r, m118742r2);
        this.f64552O.m89106L().m89036T(AbstractC23136l9.m118742r(6.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f)).m89027K(true).m89023G(this.f64549L);
        this.f64552O.m115441y1(C23212s8.m119609q(context, AbstractC16781w.default_avatar));
        C21693c c21693c = new C21693c(context);
        this.f64553P = c21693c;
        c21693c.m89106L().m89028L(-2, -2).m89019C(this.f64552O).m89067t(this.f64552O);
        this.f64553P.mo44614b1(8);
        this.f64553P.mo111926w1(AbstractC16803z.ic_grpadmin_masterkey);
        C16716d c16716d = new C16716d(context);
        this.f64554Q = c16716d;
        c16716d.m89106L().m89028L(-2, -1).m89027K(true).m89035S(AbstractC23136l9.m118742r(8.0f)).m89017A(bool).m89029M(15);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64555R = c22126c0;
        c22126c0.mo44614b1(8);
        this.f64555R.m111979u1(true);
        this.f64555R.m111958F1(AbstractC8020f0.str_tv_addfriend);
        this.f64555R.m89106L().m89060k0(-2).m89040X(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_3_w)).m89035S(AbstractC23136l9.m118742r(8.0f)).m89029M(15).m89042Z(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
        AbstractC23022b5.m118023a(this.f64555R, AbstractC8915g0.btnType2_medium);
        C21693c c21693c2 = new C21693c(context);
        this.f64556S = c21693c2;
        c21693c2.mo44614b1(8);
        this.f64556S.m89106L().m89060k0(-2).m89035S(AbstractC23136l9.m118742r(8.0f)).m89034R(AbstractC23136l9.m118742r(4.0f)).m89029M(15).m89042Z(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
        this.f64556S.m89085A0(AbstractC23136l9.m118718j(context));
        this.f64556S.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.ic_edit_nickname));
        C22132g c22132g = new C22132g(context, AbstractC23222t7.f112514B, f64547V, AbstractC23222t7.f112558f);
        this.f64557T = c22132g;
        c22132g.mo44614b1(8);
        this.f64557T.m89106L().m89035S(AbstractC23136l9.m118742r(8.0f)).m89034R(AbstractC23136l9.m118742r(8.0f)).m89029M(15);
        this.f64554Q.m89001g1(this.f64555R);
        this.f64554Q.m89001g1(this.f64556S);
        this.f64554Q.m89001g1(this.f64557T);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89028L(-1, -2).m89049e0(this.f64554Q).m89054h0(this.f64552O).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(8.0f)).m89027K(true);
        C22124b0 c22124b0 = new C22124b0(context);
        this.f64550M = c22124b0;
        c22124b0.m89106L().m89028L(-1, -2);
        this.f64550M.f108888M0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_text_size));
        this.f64550M.f108888M0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        C22124b0 c22124b02 = this.f64550M;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22124b02.m115404u1(truncateAt);
        this.f64550M.f108888M0.m111953A1(1);
        this.f64550M.m115399p1(AbstractC23222t7.f112552c);
        C22126c0 c22126c02 = new C22126c0(context, AbstractC23136l9.m118742r(13.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor2), false);
        this.f64551N = c22126c02;
        c22126c02.m89106L().m89028L(-1, -2).m89023G(this.f64550M);
        this.f64551N.m111980v1(truncateAt);
        this.f64551N.m111953A1(1);
        this.f64551N.mo44614b1(8);
        c16716d2.m89001g1(this.f64550M);
        c16716d2.m89001g1(this.f64551N);
        mo69681L(this.f64549L);
        mo69681L(this.f64552O);
        mo69681L(this.f64553P);
        mo69681L(this.f64554Q);
        mo69681L(c16716d2);
    }
}
