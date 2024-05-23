package com.zing.zalo.location;

import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import nh0.C23793c;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import z20.AbstractC31195a;

/* renamed from: com.zing.zalo.location.q */
/* loaded from: classes4.dex */
public abstract class AbstractC8971q {
    /* renamed from: b */
    public static C8009j m47970b(ZaloView zaloView, String str, C8967m.h hVar) {
        C8009j.a aVar = new C8009j.a(zaloView.getContext());
        aVar.m43160i(new String[]{AbstractC23136l9.m118746s0(AbstractC8020f0.context_item_d_minutes, 15, AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s)), AbstractC23136l9.m118746s0(AbstractC8020f0.context_item_d_hours, 1, ""), AbstractC23136l9.m118746s0(AbstractC8020f0.context_item_d_hours, 8, AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s)), AbstractC23136l9.m118743r0(AbstractC8020f0.cancel)}, new InterfaceC17463d.d() { // from class: com.zing.zalo.location.p

            /* renamed from: p */
            public final /* synthetic */ String f47999p;

            /* renamed from: q */
            public final /* synthetic */ ZaloView f48000q;

            /* renamed from: r */
            public final /* synthetic */ C8967m.h f48001r;

            public /* synthetic */ C8970p(String str2, ZaloView zaloView2, C8967m.h hVar2) {
                r1 = str2;
                r2 = zaloView2;
                r3 = hVar2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                AbstractC8971q.m47977i(r1, r2, r3, interfaceC17463d, i11);
            }
        });
        aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_popup_select_time_share_live_location_title));
        aVar.m43173v(100);
        return aVar.m43152a();
    }

    /* renamed from: c */
    public static float m47971c(C8969o c8969o) {
        return AbstractC31195a.m151996a(c8969o.f47986g, c8969o.f47987h, c8969o.f47984e, c8969o.f47985f);
    }

    /* renamed from: d */
    public static int m47972d(List list) {
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!((C8969o) it.next()).f47997r) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: e */
    public static boolean m47973e(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(((C8969o) it.next()).f47982c, CoreUtility.f89233i)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m47974f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C8969o) it.next()).f47997r) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m47975g(C8969o c8969o) {
        if (m47971c(c8969o) >= C8967m.f47930y) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m47976h(C8969o c8969o) {
        if (C23793c.m124316k().mo124310e() - c8969o.f47995p >= C8967m.f47926u) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static /* synthetic */ void m47977i(String str, ZaloView zaloView, C8967m.h hVar, InterfaceC17463d interfaceC17463d, int i11) {
        short s7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                AbstractC23647d.m123897g("917824");
                s7 = 480;
            } else {
                AbstractC23647d.m123897g("917823");
                s7 = 60;
            }
        } else {
            AbstractC23647d.m123897g("917821");
            s7 = 15;
        }
        C8967m.m47867E().m47951z0(zaloView, AbstractC23306f.m120584H0().m2640w(str), s7, hVar);
    }
}
