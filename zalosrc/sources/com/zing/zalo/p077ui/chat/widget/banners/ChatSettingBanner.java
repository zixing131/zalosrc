package com.zing.zalo.p077ui.chat.widget.banners;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes5.dex */
public class ChatSettingBanner extends ModulesView {

    /* renamed from: K */
    public C16716d f60969K;

    /* renamed from: L */
    public C22126c0 f60970L;

    /* renamed from: M */
    public C22126c0 f60971M;

    /* renamed from: N */
    C16719g f60972N;

    public ChatSettingBanner(Context context) {
        super(context);
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        this.f60969K = c16716d;
        c16716d.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.PopupBackgroundColor));
        this.f60969K.m89106L().m89028L(-1, -2).m89039W(AbstractC23136l9.m118742r(48.0f)).m89042Z(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(4.0f));
        C22126c0 c22126c0 = new C22126c0(context);
        this.f60971M = c22126c0;
        c22126c0.m111958F1(AbstractC8020f0.btn_disable_mute);
        AbstractC23022b5.m118023a(this.f60971M, AbstractC8915g0.btnType2_medium);
        C16718f m89034R = this.f60971M.m89106L().m89046b0(AbstractC23136l9.m118742r(14.0f)).m89047c0(AbstractC23136l9.m118742r(14.0f)).m89034R(AbstractC23136l9.m118742r(2.0f));
        Boolean bool = Boolean.TRUE;
        m89034R.m89017A(bool).m89027K(true).m89029M(15);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f60970L = c22126c02;
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f60970L.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f60970L.m89106L().m89028L(-1, -2).m89073z(bool).m89027K(true).m89049e0(this.f60971M).m89029M(15).m89035S(AbstractC23136l9.m118742r(8.0f));
        this.f60969K.m89001g1(this.f60971M);
        this.f60969K.m89001g1(this.f60970L);
        C16719g m118027e = AbstractC23022b5.m118027e(context);
        this.f60972N = m118027e;
        m118027e.m89106L().m89023G(this.f60969K);
        mo69681L(this.f60969K);
        mo69681L(this.f60972N);
    }
}
