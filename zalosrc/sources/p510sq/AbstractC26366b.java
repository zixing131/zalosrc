package p510sq;

import android.os.Bundle;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.zviews.MyInfoView;
import com.zing.zalo.p077ui.zviews.UserDetailsView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p140ev.C18613b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import vg.C28203u6;

/* renamed from: sq.b */
/* loaded from: classes4.dex */
public abstract class AbstractC26366b {
    public static final a Companion = new a(null);

    /* renamed from: sq.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m135768a(InterfaceC27218a interfaceC27218a, C26365a c26365a, int i11, int i12) {
            int i13;
            Class cls;
            Bundle bundle;
            Class cls2;
            if (interfaceC27218a != null && c26365a != null) {
                String m135724l = c26365a.m135724l();
                if (m135724l == null || m135724l.length() != 0) {
                    if (c26365a.m135723k() != null && !AbstractC19074t.m100204b(c26365a.m135724l(), CoreUtility.f89233i)) {
                        C21927m.m114302u().m114330e0(c26365a.m135724l(), c26365a.m135723k());
                    }
                    boolean m114322U = C21927m.m114302u().m114322U(c26365a.m135724l());
                    String str = null;
                    ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, c26365a.m135724l(), null, 2, null);
                    if (!m114322U && (m141798e == null || !m141798e.m40387S0())) {
                        String m135724l2 = c26365a.m135724l();
                        if (m135724l2 != null && m135724l2.length() != 0 && AbstractC21935u.m114518H(c26365a.m135724l()) && !AbstractC25495a.m132086k(c26365a.m135724l())) {
                            C21927m.m114302u().m114330e0(c26365a.m135724l(), new TrackingSource(293));
                        }
                        Bundle m135733a = C26365a.Companion.m135733a(c26365a);
                        if (AbstractC19074t.m100204b(c26365a.m135724l(), CoreUtility.f89233i)) {
                            cls2 = MyInfoView.class;
                        } else {
                            cls2 = UserDetailsView.class;
                        }
                        cls = cls2;
                        bundle = m135733a;
                    } else {
                        TrackingSource m114310H = C21927m.m114302u().m114310H(c26365a.m135724l());
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("EXTRA_FEATURE_ID", C18613b.f93604w);
                        if (m114310H != null) {
                            i13 = m114310H.m40683t();
                        } else {
                            i13 = 0;
                        }
                        bundle2.putInt("EXTRA_SOURCE_LINK", i13);
                        if (m114310H != null) {
                            str = m114310H.m40682o();
                        }
                        if (str == null) {
                            str = "";
                        } else {
                            AbstractC19074t.m100205c(str);
                        }
                        bundle2.putString("EXTRA_SOURCE_PARAM", str);
                        bundle2.putString("id_oa_profile", c26365a.m135724l());
                        bundle2.putBoolean("use_subtitle", false);
                        if (c26365a.m135729q()) {
                            bundle2.putInt("SHOW_WITH_FLAGS", 33554432);
                        } else if (c26365a.m135720h() != -1) {
                            bundle2.putInt("SHOW_WITH_FLAGS", c26365a.m135720h());
                        }
                        cls = ZaloWebView.class;
                        bundle = bundle2;
                    }
                    interfaceC27218a.mo35579p().m93066i2(cls, bundle, i11, i12, true);
                }
            }
        }
    }
}
