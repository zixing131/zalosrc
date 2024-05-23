package com.zing.zalo.p077ui.picker;

import android.content.Context;
import android.view.View;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import ui0.C27280g;

/* renamed from: com.zing.zalo.ui.picker.d */
/* loaded from: classes6.dex */
public abstract class AbstractC12670d {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.ui.picker.d$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m71368a(Snackbar snackbar) {
            if (snackbar != null && snackbar.m90661t()) {
                snackbar.m90655n();
            }
        }

        /* renamed from: b */
        public final Snackbar m71369b(ZaloView zaloView, String str, int i11) {
            View m92656bJ;
            AbstractC19074t.m100208f(str, "msg");
            if ((zaloView == null && (zaloView = AbstractC23136l9.m118651G()) == null) || !zaloView.m92672lJ() || !zaloView.m92687sJ() || (m92656bJ = zaloView.m92656bJ()) == null) {
                return null;
            }
            Snackbar m90669d = Snackbar.Companion.m90669d(m92656bJ, str, -2);
            Context m92689tK = zaloView.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            m90669d.m90644J(C27280g.m139659b(m92689tK, AbstractC2810d.zds_ic_info_circle_solid_24, AbstractC2808b.f150819b40));
            m90669d.m90645K(i11);
            m90669d.m90648N();
            return m90669d;
        }
    }

    /* renamed from: a */
    public static final void m71366a(Snackbar snackbar) {
        Companion.m71368a(snackbar);
    }

    /* renamed from: b */
    public static final Snackbar m71367b(ZaloView zaloView, String str, int i11) {
        return Companion.m71369b(zaloView, str, i11);
    }
}
