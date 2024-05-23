package com.zing.zalo.p077ui.moduleview.group;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.moduleview.message.MsgItemInfoModulesView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p716zh.C32020m7;

/* loaded from: classes6.dex */
public class StatementSuggestCreateGroupModuleView extends MsgItemInfoModulesView {

    /* renamed from: K */
    C16716d f64784K;

    /* renamed from: L */
    C21693c f64785L;

    /* renamed from: M */
    C22126c0 f64786M;

    /* renamed from: N */
    C16719g f64787N;

    public StatementSuggestCreateGroupModuleView(Context context) {
        super(context);
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f64784K = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89048d0(AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_tb_ui4)).m89044a0(AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_tb_ui4)).m89046b0(AbstractC23136l9.m118742r(16.0f)).m89047c0(AbstractC23136l9.m118742r(16.0f));
        C21693c c21693c = new C21693c(context);
        this.f64785L = c21693c;
        c21693c.mo111926w1(AbstractC16803z.icn_add_item);
        C16718f m89028L = this.f64785L.m89106L().m89028L(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
        Boolean bool = Boolean.TRUE;
        m89028L.m89073z(bool).m89035S(AbstractC23136l9.m118742r(16.0f)).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64786M = c22126c0;
        c22126c0.mo111965M1(0);
        this.f64786M.mo111964L1(AbstractC23136l9.m118742r(16.0f));
        this.f64786M.m111962J1(C23212s8.m119607o(context, AbstractC16781w.LinkColor));
        this.f64786M.m89106L().m89054h0(this.f64785L).m89017A(bool).m89027K(true).m89028L(-1, -2);
        this.f64784K.m89001g1(this.f64785L);
        this.f64784K.m89001g1(this.f64786M);
        C16719g c16719g = new C16719g(context);
        this.f64787N = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f64787N.m89106L().m89028L(-1, 1).m89023G(this.f64784K).m89036T(AbstractC23136l9.m118742r(2.0f)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.separate_line_padding_left_ui4_type1));
        mo69681L(this.f64784K);
        mo69681L(this.f64787N);
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.InterfaceC12430a
    /* renamed from: w */
    public void mo35843w(C32020m7 c32020m7, int i11, boolean z11) {
        try {
            int i12 = c32020m7.f147410a;
            if (i12 != 26) {
                if (i12 == 30) {
                    this.f64785L.mo111926w1(AbstractC16803z.ic_add_user_blue_24);
                    this.f64787N.mo44614b1(8);
                }
            } else {
                this.f64785L.mo111926w1(AbstractC16803z.ic_add_members_blue_24);
                this.f64787N.mo44614b1(8);
            }
            this.f64786M.m111959G1(c32020m7.f147428s);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
