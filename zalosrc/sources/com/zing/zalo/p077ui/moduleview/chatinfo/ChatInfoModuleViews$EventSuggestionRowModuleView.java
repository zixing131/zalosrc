package com.zing.zalo.p077ui.moduleview.chatinfo;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p664y.AbstractC30228a;

/* loaded from: classes6.dex */
public class ChatInfoModuleViews$EventSuggestionRowModuleView extends ModulesView implements ChatInfoAdapter.InterfaceC11686a {

    /* renamed from: K */
    C22126c0 f64568K;

    /* renamed from: L */
    C22126c0 f64569L;

    /* renamed from: M */
    C22126c0 f64570M;

    /* renamed from: N */
    C22126c0 f64571N;

    public ChatInfoModuleViews$EventSuggestionRowModuleView(Context context) {
        super(context);
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89041Y(AbstractC23222t7.f112548a).m89032P(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
        c16716d.m89087B0(AbstractC16803z.bg_stroke_rounded_6dp);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_event_suggestion_label));
        c22126c0.m89087B0(AbstractC16803z.bg_rounded_top_6dp_gray);
        c22126c0.mo111964L1(AbstractC23222t7.f112582r);
        c22126c0.mo111965M1(1);
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.HeaderFormTitleColor));
        C16718f m89106L = c22126c0.m89106L();
        int i11 = AbstractC23222t7.f112586t;
        int i12 = AbstractC23222t7.f112572m;
        m89106L.m89042Z(i11, i12, i12, i12).m89028L(-1, -2);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89087B0(AbstractC16803z.bg_rounded_bottom_6dp);
        C16718f m89106L2 = c16716d2.m89106L();
        int i13 = AbstractC23222t7.f112586t;
        m89106L2.m89042Z(0, i13, i13, i13).m89023G(c22126c0).m89028L(-1, -2);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64568K = c22126c02;
        C16718f m89029M = c22126c02.m89106L().m89027K(true).m89029M(15);
        int i14 = AbstractC23222t7.f112539R;
        m89029M.m89028L(i14, i14);
        this.f64568K.m111961I1(Layout.Alignment.ALIGN_CENTER);
        this.f64568K.mo111964L1(AbstractC23222t7.f112514B);
        this.f64568K.m111962J1(C23212s8.m119607o(context, AbstractC16781w.HeaderFormTitleColor));
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64571N = c22126c03;
        c22126c03.m89106L().m89042Z(AbstractC23222t7.f112586t, AbstractC23222t7.f112562h, AbstractC23222t7.f112586t, AbstractC23222t7.f112562h).m89027K(true).m89017A(Boolean.TRUE).m89028L(-2, -2);
        this.f64571N.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_cap));
        AbstractC23022b5.m118023a(this.f64571N, AbstractC8915g0.btnType3_small);
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89106L().m89029M(12).m89046b0(AbstractC23222t7.f112586t).m89027K(true).m89047c0(AbstractC23222t7.f112552c).m89028L(-1, -2).m89054h0(this.f64568K).m89049e0(this.f64571N);
        C22126c0 c22126c04 = new C22126c0(context);
        this.f64569L = c22126c04;
        c22126c04.m89106L().m89028L(-1, -2);
        this.f64569L.mo111964L1(AbstractC23222t7.f112586t);
        this.f64569L.m111962J1(C23212s8.m119607o(context, AbstractC16781w.HeaderFormTitleColor));
        this.f64569L.m111953A1(1);
        C22126c0 c22126c05 = this.f64569L;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c05.m111980v1(truncateAt);
        C22126c0 c22126c06 = new C22126c0(context);
        this.f64570M = c22126c06;
        c22126c06.m89106L().m89048d0(AbstractC23222t7.f112554d).m89028L(-1, -2).m89023G(this.f64569L);
        this.f64570M.mo111964L1(AbstractC23222t7.f112582r);
        this.f64570M.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f64570M.m111953A1(1);
        this.f64570M.m111980v1(truncateAt);
        this.f64570M.mo44614b1(8);
        c16716d3.m89001g1(this.f64569L);
        c16716d3.m89001g1(this.f64570M);
        c16716d2.m89001g1(this.f64568K);
        c16716d2.m89001g1(this.f64571N);
        c16716d2.m89001g1(c16716d3);
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c16716d2);
        mo69681L(c16716d);
    }

    @Override // com.zing.zalo.p077ui.chat.rightmenu.ChatInfoAdapter.InterfaceC11686a
    /* renamed from: f */
    public void mo65101f(ChatInfoAdapter.C11690e c11690e, int i11) {
        if (c11690e == null) {
            return;
        }
        try {
            AbstractC30228a.m149044a(c11690e);
            throw null;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
