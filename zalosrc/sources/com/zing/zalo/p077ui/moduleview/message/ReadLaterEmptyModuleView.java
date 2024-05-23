package com.zing.zalo.p077ui.moduleview.message;

import android.content.Context;
import android.text.Layout;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes6.dex */
public final class ReadLaterEmptyModuleView extends ModulesView {

    /* renamed from: K */
    private final C16716d f64979K;

    /* renamed from: L */
    private final C21693c f64980L;

    /* renamed from: M */
    private final C22126c0 f64981M;

    /* renamed from: N */
    private final C22126c0 f64982N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadLaterEmptyModuleView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        C16716d c16716d = new C16716d(context);
        C16718f m89106L = c16716d.m89106L();
        m89106L.m89028L(-1, -2);
        int i11 = AbstractC23222t7.f112586t;
        m89106L.f84717m = i11;
        m89106L.f84719o = i11;
        this.f64979K = c16716d;
        C21693c c21693c = new C21693c(context);
        C16718f m89106L2 = c21693c.m89106L();
        int i12 = AbstractC23222t7.f112575n0;
        m89106L2.m89028L(i12, i12);
        m89106L2.m89069v(c16716d);
        c21693c.m111929z1(3);
        c21693c.mo111925v1(C23212s8.m119608p(AbstractC16781w.zds_il_conversation_empty_spot_1_1));
        this.f64980L = c21693c;
        C22126c0 c22126c0 = new C22126c0(context);
        C16718f m89106L3 = c22126c0.m89106L();
        m89106L3.m89028L(-1, -2);
        m89106L3.f84721q = AbstractC23222t7.f112586t;
        int i13 = AbstractC23222t7.f112534M;
        m89106L3.f84716l = i13;
        m89106L3.f84718n = i13;
        m89106L3.m89023G(c21693c);
        m89106L3.m89069v(c16716d);
        c22126c0.mo111964L1(AbstractC23222t7.f112582r);
        c22126c0.mo111965M1(1);
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c22126c0.m111961I1(alignment);
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_read_later_empty_view_title));
        this.f64981M = c22126c0;
        C22126c0 c22126c02 = new C22126c0(context);
        C16718f m89106L4 = c22126c02.m89106L();
        m89106L4.m89028L(-1, -2);
        m89106L4.f84721q = AbstractC23222t7.f112558f;
        int i14 = AbstractC23222t7.f112534M;
        m89106L4.f84716l = i14;
        m89106L4.f84718n = i14;
        m89106L4.m89023G(c22126c0);
        m89106L4.m89069v(c16716d);
        c22126c02.mo111964L1(AbstractC23222t7.f112582r);
        c22126c02.mo111965M1(0);
        c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22126c02.m111961I1(alignment);
        c22126c02.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_read_later_empty_view_desc));
        this.f64982N = c22126c02;
        c16716d.m89001g1(c21693c);
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c22126c02);
        mo69681L(c16716d);
        setBackgroundColor(C23212s8.m119606n(AbstractC2807a.ui_background));
    }
}
