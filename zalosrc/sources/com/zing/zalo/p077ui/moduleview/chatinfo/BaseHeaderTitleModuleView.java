package com.zing.zalo.p077ui.moduleview.chatinfo;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes6.dex */
public class BaseHeaderTitleModuleView extends ModulesView {

    /* renamed from: K */
    public C16719g f64544K;

    /* renamed from: L */
    public C21693c f64545L;

    /* renamed from: M */
    public C22126c0 f64546M;

    public BaseHeaderTitleModuleView(Context context) {
        super(context);
        m88987U(-1, -2);
        this.f64544K = AbstractC23022b5.m118026d(context);
        C22126c0 c22126c0 = new C22126c0(context, AbstractC23136l9.m118742r(13.0f), C23212s8.m119607o(context, AbstractC16781w.SectionTitleColor1), true);
        this.f64546M = c22126c0;
        C16718f m89028L = c22126c0.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89048d0(AbstractC23136l9.m118742r(12.0f)).m89044a0(AbstractC23136l9.m118742r(4.0f)).m89046b0(AbstractC23136l9.m118736p(AbstractC16802y.msg_item_padding_l_r)).m89047c0(AbstractC23136l9.m118736p(AbstractC16802y.msg_item_padding_l_r)).m89023G(this.f64544K);
        C21693c c21693c = new C21693c(context);
        this.f64545L = c21693c;
        c21693c.mo111926w1(AbstractC16803z.ic_menu_option_vertical);
        this.f64545L.m89106L().m89028L(-2, -2).m89017A(bool).m89036T(AbstractC23136l9.m118742r(4.0f)).m89048d0(AbstractC23136l9.m118742r(4.0f)).m89044a0(AbstractC23136l9.m118742r(4.0f)).m89046b0(AbstractC23136l9.m118736p(AbstractC16802y.msg_item_padding_l_r)).m89047c0(AbstractC23136l9.m118736p(AbstractC16802y.msg_item_padding_l_r)).m89023G(this.f64544K);
        this.f64545L.mo44614b1(8);
        mo69681L(this.f64544K);
        mo69681L(this.f64546M);
        mo69681L(this.f64545L);
    }
}
