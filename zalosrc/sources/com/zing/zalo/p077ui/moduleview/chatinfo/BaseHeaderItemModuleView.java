package com.zing.zalo.p077ui.moduleview.chatinfo;

import android.content.Context;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;

/* loaded from: classes6.dex */
public class BaseHeaderItemModuleView extends ModulesView {

    /* renamed from: K */
    C16719g f64539K;

    /* renamed from: L */
    public C16716d f64540L;

    /* renamed from: M */
    public C22126c0 f64541M;

    /* renamed from: N */
    public C22126c0 f64542N;

    /* renamed from: O */
    public C16719g f64543O;

    public BaseHeaderItemModuleView(Context context) {
        super(context);
        m88987U(-1, -2);
        this.f64539K = AbstractC23022b5.m118026d(context);
        C16716d c16716d = new C16716d(context);
        this.f64540L = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89023G(this.f64539K).m89046b0(AbstractC23136l9.m118736p(AbstractC16802y.msg_item_padding_l_r)).m89047c0(AbstractC23136l9.m118736p(AbstractC16802y.msg_item_padding_l_r));
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64542N = c22126c0;
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f64542N.mo111965M1(1);
        this.f64542N.m111963K1(AbstractC23136l9.m118645D(context, AbstractC16801x.color_press_gray_text));
        C16718f m89034R = this.f64542N.m89106L().m89028L(-2, -2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_l_r));
        Boolean bool = Boolean.TRUE;
        m89034R.m89017A(bool).m89046b0(AbstractC23136l9.m118742r(12.0f)).m89048d0(AbstractC23136l9.m118742r(12.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f));
        this.f64542N.mo44614b1(8);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64541M = c22126c02;
        c22126c02.m111963K1(AbstractC23136l9.m118645D(context, AbstractC16801x.section1_color_statelist));
        this.f64541M.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f64541M.mo111965M1(1);
        this.f64541M.m89106L().m89028L(-2, -2).m89073z(bool).m89048d0(AbstractC23136l9.m118742r(12.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f)).m89027K(true);
        C21693c c21693c = new C21693c(context);
        this.f64543O = c21693c;
        C16718f m89106L = c21693c.m89106L();
        int i11 = AbstractC23222t7.f112566j;
        m89106L.m89028L(i11, i11).m89054h0(this.f64541M).m89034R(AbstractC23222t7.f112562h).m89027K(true);
        this.f64543O.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_right_menu_item_bg_number_notif));
        this.f64540L.m89001g1(this.f64542N);
        this.f64540L.m89001g1(this.f64541M);
        this.f64540L.m89001g1(this.f64543O);
        mo69681L(this.f64539K);
        mo69681L(this.f64540L);
    }
}
