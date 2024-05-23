package com.zing.zalo.p077ui.moduleview.chatinfo;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21693c;
import kd0.C21696f;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import ui0.C27280g;

/* loaded from: classes6.dex */
public class BaseChatSettingItemModuleView extends ModulesView {

    /* renamed from: K */
    public C16719g f64528K;

    /* renamed from: L */
    public C16719g f64529L;

    /* renamed from: M */
    public C16716d f64530M;

    /* renamed from: N */
    public C22126c0 f64531N;

    /* renamed from: O */
    public C22126c0 f64532O;

    /* renamed from: P */
    public C22126c0 f64533P;

    /* renamed from: Q */
    public C21696f f64534Q;

    /* renamed from: R */
    public C21693c f64535R;

    /* renamed from: S */
    public C21693c f64536S;

    /* renamed from: T */
    public C22126c0 f64537T;

    /* renamed from: U */
    public C16719g f64538U;

    public BaseChatSettingItemModuleView(Context context) {
        super(context);
        m88987U(-1, -2);
        C16716d m118026d = AbstractC23022b5.m118026d(context);
        this.f64528K = m118026d;
        m118026d.mo44614b1(8);
        C16719g c16719g = new C16719g(context);
        this.f64529L = c16719g;
        c16719g.m89106L().m89028L(-1, 1).m89034R(AbstractC23222t7.f112586t).m89023G(this.f64528K);
        this.f64529L.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        C16716d c16716d = new C16716d(context);
        this.f64530M = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89023G(this.f64529L).m89029M(12).m89041Y(AbstractC23222t7.f112586t).m89039W(AbstractC23222t7.f112545X);
        C16716d c16716d2 = new C16716d(context);
        C16718f m89028L = c16716d2.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89017A(bool).m89027K(true);
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89106L().m89028L(-2, -2).m89027K(true);
        C21696f c21696f = new C21696f(context);
        this.f64534Q = c21696f;
        c21696f.m89106L().m89028L(-2, AbstractC23222t7.f112514B).m89034R(AbstractC23136l9.m118742r(8.0f)).m89027K(true);
        this.f64534Q.mo89099H0(false);
        this.f64534Q.mo44614b1(8);
        C21693c c21693c = new C21693c(context);
        this.f64535R = c21693c;
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC2810d.zds_ic_chevron_right_line_16, AbstractC2807a.icon_01));
        this.f64535R.m89106L().m89028L(-2, -2).m89034R(AbstractC23136l9.m118742r(8.0f)).m89027K(true);
        this.f64535R.mo44614b1(8);
        c16716d3.m89001g1(this.f64534Q);
        c16716d3.m89001g1(this.f64535R);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64537T = c22126c0;
        AbstractC23022b5.m118025c(c22126c0);
        this.f64537T.m111958F1(AbstractC8020f0.str_noti_N_character);
        this.f64537T.m89106L().m89034R(AbstractC23136l9.m118742r(8.0f)).m89049e0(c16716d3).m89027K(true);
        this.f64537T.mo44614b1(8);
        C21693c c21693c2 = new C21693c(context);
        this.f64538U = c21693c2;
        C16718f m89106L = c21693c2.m89106L();
        int i11 = AbstractC23222t7.f112566j;
        m89106L.m89028L(i11, i11).m89034R(AbstractC23222t7.f112566j).m89049e0(c16716d3).m89027K(true);
        this.f64538U.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_right_menu_item_bg_number_notif));
        this.f64538U.mo44614b1(8);
        C22126c0 c22126c02 = new C22126c0(context, AbstractC23136l9.m118742r(13.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor2), false);
        this.f64533P = c22126c02;
        c22126c02.m89106L().m89049e0(this.f64537T).m89034R(AbstractC23136l9.m118742r(12.0f)).m89027K(true);
        this.f64533P.m111982x1(false);
        this.f64533P.mo44614b1(8);
        c16716d2.m89001g1(c16716d3);
        c16716d2.m89001g1(this.f64537T);
        c16716d2.m89001g1(this.f64538U);
        c16716d2.m89001g1(this.f64533P);
        C16716d c16716d4 = new C16716d(context);
        c16716d4.m89106L().m89028L(-2, -2).m89073z(bool).m89027K(false);
        C21693c c21693c3 = new C21693c(context);
        this.f64536S = c21693c3;
        c21693c3.mo44614b1(8);
        this.f64536S.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_icon_left_size), AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_icon_left_size)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_icon_left_margin_right)).m89073z(bool);
        c16716d4.m89001g1(this.f64536S);
        C16716d c16716d5 = new C16716d(context);
        c16716d5.m89106L().m89028L(-1, -2).m89049e0(c16716d2).m89054h0(c16716d4).m89029M(12).m89027K(true);
        C22126c0 c22126c03 = new C22126c0(context, AbstractC23136l9.m118655I(AbstractC16802y.chat_setting_item_text_size), C23212s8.m119607o(context, AbstractC16781w.HeaderFormTitleColor), false);
        this.f64531N = c22126c03;
        c22126c03.m89106L().m89028L(-1, -2);
        C22126c0 c22126c04 = new C22126c0(context, AbstractC23136l9.m118742r(14.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor2), false);
        this.f64532O = c22126c04;
        c22126c04.m111982x1(false);
        this.f64532O.m111980v1(TextUtils.TruncateAt.END);
        this.f64532O.m111953A1(3);
        this.f64532O.m89106L().m89028L(-1, -2).m89023G(this.f64531N).m89036T(AbstractC23136l9.m118742r(4.0f));
        c16716d5.m89001g1(this.f64531N);
        c16716d5.m89001g1(this.f64532O);
        this.f64530M.m89001g1(c16716d4);
        this.f64530M.m89001g1(c16716d2);
        this.f64530M.m89001g1(c16716d5);
        mo69681L(this.f64528K);
        mo69681L(this.f64529L);
        mo69681L(this.f64530M);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }
}
