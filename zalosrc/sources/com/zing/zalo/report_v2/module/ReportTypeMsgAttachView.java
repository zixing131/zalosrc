package com.zing.zalo.report_v2.module;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import kd0.C21693c;
import ki0.C21740h;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ReportTypeMsgAttachView extends ModulesView {

    /* renamed from: K */
    private C16716d f49440K;

    /* renamed from: L */
    private C21740h f49441L;

    /* renamed from: M */
    private C21693c f49442M;

    /* renamed from: N */
    private C16719g f49443N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportTypeMsgAttachView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        setClickable(true);
        C16716d c16716d = new C16716d(context);
        C16718f m89028L = c16716d.m89106L().m89028L(-1, -2);
        m89028L.f84728x = AbstractC23136l9.m118742r(50.0f);
        m89028L.m89041Y(AbstractC23136l9.m118742r(16.0f));
        c16716d.mo89161z0(C23212s8.m119607o(context, AbstractC2807a.ui_background));
        this.f49440K = c16716d;
        C21693c c21693c = new C21693c(context);
        C16718f m89028L2 = c21693c.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L2.m89073z(bool).m89036T(AbstractC23136l9.m118742r(2.0f));
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC23322a.zds_ic_info_circle_solid_16, AbstractC2807a.icon_02));
        this.f49442M = c21693c;
        C21740h c21740h = new C21740h(context);
        c21740h.m89106L().m89028L(-1, -2).m89029M(1).m89073z(bool).m89054h0(this.f49442M).m89034R(AbstractC23136l9.m118742r(4.0f));
        c21740h.mo75850g(true);
        c21740h.mo111964L1(AbstractC23222t7.f112582r);
        c21740h.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
        m50203V(c21740h);
        this.f49441L = c21740h;
        this.f49440K.m89001g1(this.f49442M);
        this.f49440K.m89001g1(this.f49441L);
        C16719g m118027e = AbstractC23022b5.m118027e(context);
        AbstractC19074t.m100207e(m118027e, "getSeparateLine(...)");
        this.f49443N = m118027e;
        m118027e.m89106L().m89023G(this.f49440K);
        mo69681L(this.f49440K);
        mo69681L(this.f49443N);
    }

    /* renamed from: V */
    private final void m50203V(C21740h c21740h) {
        int m127173b0;
        String m127114D;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_attach_msg_types);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m127173b0 = AbstractC24342w.m127173b0(m118743r0, "#x#", 0, false, 6, null);
        if (m127173b0 >= 0) {
            m127114D = AbstractC24341v.m127114D(m118743r0, "#x#", "", false, 4, null);
            SpannableString spannableString = new SpannableString(m127114D);
            spannableString.setSpan(new ForegroundColorSpan(AbstractC23136l9.m118641B(getContext(), AbstractC2808b.f150821b60)), m127173b0, m127114D.length(), 33);
            c21740h.m111959G1(spannableString);
            return;
        }
        c21740h.m111959G1(m118743r0);
    }
}
