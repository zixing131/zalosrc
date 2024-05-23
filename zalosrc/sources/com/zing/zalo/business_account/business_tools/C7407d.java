package com.zing.zalo.business_account.business_tools;

import ag0.AbstractC0826k;
import ag0.AbstractC0837p0;
import ag0.C0843s0;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.business_account.business_tools.AbstractC7406c;
import com.zing.zalo.business_account.business_tools.C7407d;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import org.json.JSONObject;
import p055ce.AbstractC3439h;
import p055ce.C3432a;
import p055ce.C3433b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p534u1.AbstractC26941a;
import p624wx.C29264g;
import p732zy.C32592h;
import p732zy.C32600p;
import ss.C26373e;
import ss.C26379k;
import ui0.C27280g;
import vg.C28203u6;

/* renamed from: com.zing.zalo.business_account.business_tools.d */
/* loaded from: classes3.dex */
public final class C7407d extends AbstractC1796t0 {

    /* renamed from: s */
    private final C1761c0 f40269s;

    /* renamed from: t */
    private final LiveData f40270t;

    /* renamed from: com.zing.zalo.business_account.business_tools.d$a */
    /* loaded from: classes3.dex */
    public static final class a implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C7407d();
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.d$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC0826k.c {
        b(String str, TrackingSource trackingSource) {
            super(str, trackingSource);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ag0.AbstractC0826k.c, ag0.AbstractC0826k
        /* renamed from: a */
        public void mo2158a(Object obj) {
            JSONObject jSONObject;
            try {
                super.mo2158a(obj);
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    C7407d c7407d = C7407d.this;
                    ContactProfile contactProfile = new ContactProfile(jSONObject);
                    if (AbstractC19074t.m100204b(contactProfile.f42434r, CoreUtility.f89233i)) {
                        AbstractC23304d.f113368c0 = contactProfile;
                        AbstractC23309i.m121068Iz(contactProfile.m40373K());
                        c7407d.m37625Q();
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    public C7407d() {
        C1761c0 c1761c0 = new C1761c0();
        this.f40269s = c1761c0;
        this.f40270t = c1761c0;
    }

    /* renamed from: P */
    public static final void m37622P(C7407d c7407d) {
        String str;
        AbstractC19074t.m100208f(c7407d, "this$0");
        String str2 = CoreUtility.f89233i;
        ArrayList arrayList = new ArrayList();
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str2, false, 2, null);
        if (m141800i == null) {
            m141800i = new ContactProfile(str2);
        }
        C3433b m40364F = m141800i.m40364F();
        String str3 = m141800i.f42446v;
        AbstractC19074t.m100207e(str3, "avt");
        String m40383Q = m141800i.m40383Q(true, false);
        AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
        AbstractC19074t.m100205c(str2);
        String m17277k = AbstractC3439h.m17277k(str2);
        if (m40364F == null || (str = m40364F.m17257j()) == null) {
            str = "";
        }
        String str4 = str;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_tools_share_link_desc);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList.add(new AbstractC7406c.c(str3, m40383Q, m17277k, str4, m118743r0, C3432a.f14402a.m17243l()));
        arrayList.add(AbstractC7406c.b.f40257b);
        ArrayList arrayList2 = new ArrayList();
        MainApplication.C6895a c6895a = MainApplication.Companion;
        Drawable m139660c = C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_user_rectangle_line_24, AbstractC16781w.BusinessToolsIconColor);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_tools_item_business_profile);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        arrayList2.add(new AbstractC7406c.d(2, m139660c, m118743r02, null, "ba_tool_profile"));
        if (C29264g.f135604a.m146199c()) {
            Drawable m139660c2 = C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_catalog_line_24, AbstractC16781w.BusinessToolsIconColor);
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_tools_item_product_catalog);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            arrayList2.add(new AbstractC7406c.d(3, m139660c2, m118743r03, null, "ba_tool_product_catalog"));
        }
        C32592h c32592h = C32592h.f150598a;
        if (c32592h.m157755b()) {
            int m157928q = C32600p.f150676a.m157898e().m157928q();
            int m157754a = c32592h.m157754a();
            Drawable m139660c3 = C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_quick_reply_line_24, AbstractC16781w.BusinessToolsIconColor);
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_tools_item_quick_message);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            arrayList2.add(new AbstractC7406c.d(4, m139660c3, m118743r04, AbstractC23136l9.m118746s0(AbstractC8020f0.business_tools_item_quick_message_desc, Integer.valueOf(m157928q), Integer.valueOf(m157754a)), "ba_tool_quick_msg"));
        }
        C26373e c26373e = C26373e.f125282a;
        if (c26373e.m135794c()) {
            int m135957l = C26379k.f125351a.m135935f().m135957l();
            int m135793b = c26373e.m135793b();
            Drawable m139660c4 = C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_auto_reply_line_24, AbstractC16781w.BusinessToolsIconColor);
            String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_tools_item_auto_reply);
            AbstractC19074t.m100207e(m118743r05, "getString(...)");
            arrayList2.add(new AbstractC7406c.d(5, m139660c4, m118743r05, AbstractC23136l9.m118746s0(AbstractC8020f0.business_tools_item_auto_reply_desc, Integer.valueOf(m135957l), Integer.valueOf(m135793b)), "ba_tool_auto_reply"));
        }
        arrayList.addAll(arrayList2);
        c7407d.f40269s.mo9221n(arrayList);
    }

    /* renamed from: N */
    public final LiveData m37623N() {
        return this.f40270t;
    }

    /* renamed from: O */
    public final void m37624O() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: de.k
            public /* synthetic */ RunnableC17902k() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7407d.m37622P(C7407d.this);
            }
        });
    }

    /* renamed from: Q */
    public final void m37625Q() {
        C0843s0.m2286r().m2294e(new b(CoreUtility.f89233i, new TrackingSource((short) 1061)));
    }
}
