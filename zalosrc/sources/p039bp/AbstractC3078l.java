package p039bp;

import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.TextLocalization;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p425po.C24879a;
import p425po.C24880b;
import p425po.C24894p;
import p615wn.C29110f;

/* renamed from: bp.l */
/* loaded from: classes4.dex */
public abstract class AbstractC3078l {
    /* renamed from: a */
    public static final C24894p m15405a(C24880b c24880b) {
        CharSequence charSequence;
        CharSequence m118743r0;
        String str;
        String str2;
        C24879a m129380b;
        String m129373b;
        C24879a m129380b2;
        TextLocalization m129372a;
        C24879a m129380b3;
        StringTheme m129375d;
        C24879a m129380b4;
        C29110f m129374c;
        C24879a m129380b5;
        C29110f m129376e;
        C24894p c24894p = new C24894p(false, 1, null);
        String str3 = "";
        if (c24880b == null || (m129380b5 = c24880b.m129380b()) == null || (m129376e = m129380b5.m129376e()) == null || (charSequence = m129376e.m145359a()) == null) {
            charSequence = "";
        }
        c24894p.m129436U(charSequence);
        if (c24880b == null || (m129380b4 = c24880b.m129380b()) == null || (m129374c = m129380b4.m129374c()) == null || (m118743r0 = m129374c.m145359a()) == null) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_general);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
        }
        c24894p.m129426K(m118743r0);
        if (c24880b == null || (m129380b3 = c24880b.m129380b()) == null || (m129375d = m129380b3.m129375d()) == null || (str = m129375d.getValue()) == null) {
            str = "";
        }
        c24894p.m129432Q(str);
        if (c24880b == null || (m129380b2 = c24880b.m129380b()) == null || (m129372a = m129380b2.m129372a()) == null || (str2 = m129372a.m44977b()) == null) {
            str2 = "";
        }
        c24894p.m129421F(str2);
        if (c24880b != null && (m129380b = c24880b.m129380b()) != null && (m129373b = m129380b.m129373b()) != null) {
            str3 = m129373b;
        }
        c24894p.m129419D(str3);
        if (c24880b != null && c24880b.m129379a() == 18028) {
            c24894p.m129433R(AbstractC16781w.SocialKycErrorIllustrator);
        }
        c24894p.m129434S(AbstractC23222t7.f112579p0);
        c24894p.m129420E(AbstractC2807a.ui_background);
        c24894p.m129422G("timeline_tab_main_network_err");
        c24894p.m129429N(true);
        c24894p.m129424I(AbstractC2814h.ButtonMedium_Primary);
        c24894p.m129435T(AbstractC23222t7.f112514B);
        return c24894p;
    }
}
