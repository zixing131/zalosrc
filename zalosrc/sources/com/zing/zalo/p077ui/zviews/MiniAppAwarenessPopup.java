package com.zing.zalo.p077ui.zviews;

import ac.C0708i;
import ac.C0732w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.text.AbstractC1463b;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.Serializable;
import me0.C23278z2;
import on0.AbstractC24341v;
import p307kv.AbstractC21954k;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p649xl.C29746c8;
import pm0.C24848g0;

/* loaded from: classes6.dex */
public class MiniAppAwarenessPopup extends MiniAppPopupView implements View.OnClickListener {
    public static final C14579a Companion = new C14579a(null);

    /* renamed from: R0 */
    private C29746c8 f75050R0;

    /* renamed from: S0 */
    private C14580b f75051S0;

    /* renamed from: T0 */
    private final C14581c f75052T0 = new C14581c();

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppAwarenessPopup$a */
    /* loaded from: classes6.dex */
    public static final class C14579a {
        private C14579a() {
        }

        public /* synthetic */ C14579a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppAwarenessPopup$b */
    /* loaded from: classes6.dex */
    public static final class C14580b implements Serializable {

        /* renamed from: p */
        private final String f75053p;

        /* renamed from: q */
        private final C15923mx f75054q;

        /* renamed from: r */
        private final int f75055r;

        /* renamed from: s */
        private final String f75056s;

        public C14580b(String str, C15923mx c15923mx, int i11, String str2) {
            AbstractC19074t.m100208f(str, "appName");
            AbstractC19074t.m100208f(c15923mx, "miniAppAwarenessData");
            this.f75053p = str;
            this.f75054q = c15923mx;
            this.f75055r = i11;
            this.f75056s = str2;
        }

        /* renamed from: a */
        public final String m81656a() {
            return this.f75053p;
        }

        /* renamed from: b */
        public final String m81657b() {
            return this.f75056s;
        }

        /* renamed from: c */
        public final C15923mx m81658c() {
            return this.f75054q;
        }

        /* renamed from: d */
        public final int m81659d() {
            return this.f75055r;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14580b)) {
                return false;
            }
            C14580b c14580b = (C14580b) obj;
            return AbstractC19074t.m100204b(this.f75053p, c14580b.f75053p) && AbstractC19074t.m100204b(this.f75054q, c14580b.f75054q) && this.f75055r == c14580b.f75055r && AbstractC19074t.m100204b(this.f75056s, c14580b.f75056s);
        }

        public int hashCode() {
            int hashCode = ((((this.f75053p.hashCode() * 31) + this.f75054q.hashCode()) * 31) + this.f75055r) * 31;
            String str = this.f75056s;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MAAwarenessInfo(appName=" + this.f75053p + ", miniAppAwarenessData=" + this.f75054q + ", type=" + this.f75055r + ", maId=" + this.f75056s + ")";
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppAwarenessPopup$c */
    /* loaded from: classes6.dex */
    public static final class C14581c extends C23999j {
        C14581c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null) {
                C29746c8 c29746c8 = MiniAppAwarenessPopup.this.f75050R0;
                if (c29746c8 == null) {
                    AbstractC19074t.m100223u("vb");
                    c29746c8 = null;
                }
                c29746c8.f137410t.setImageBitmap(c3979l.m18839c());
            }
        }
    }

    /* renamed from: tM */
    private final void m81653tM(String str) {
        String m81657b;
        C0732w m1189a = C0732w.Companion.m1189a();
        C0708i c0708i = new C0708i();
        C14580b c14580b = this.f75051S0;
        if (c14580b != null && (m81657b = c14580b.m81657b()) != null) {
            c0708i.m1075f("appId", m81657b);
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        C0732w.m1177r(m1189a, str, "", c0708i, null, 8, null);
    }

    /* renamed from: uM */
    private final void m81654uM() {
        String str;
        C14580b c14580b = this.f75051S0;
        C29746c8 c29746c8 = null;
        if (c14580b != null && c14580b.m81659d() == 1) {
            C29746c8 c29746c82 = this.f75050R0;
            if (c29746c82 == null) {
                AbstractC19074t.m100223u("vb");
                c29746c82 = null;
            }
            c29746c82.getRoot().setIdTracking("ma_user_awareness_exit");
            C29746c8 c29746c83 = this.f75050R0;
            if (c29746c83 == null) {
                AbstractC19074t.m100223u("vb");
                c29746c83 = null;
            }
            c29746c83.f137407q.setIdTracking("ma_awareness_exit_gotit");
        } else {
            C29746c8 c29746c84 = this.f75050R0;
            if (c29746c84 == null) {
                AbstractC19074t.m100223u("vb");
                c29746c84 = null;
            }
            c29746c84.getRoot().setIdTracking("ma_user_awareness_favorite");
            C29746c8 c29746c85 = this.f75050R0;
            if (c29746c85 == null) {
                AbstractC19074t.m100223u("vb");
                c29746c85 = null;
            }
            c29746c85.f137407q.setIdTracking("ma_awareness_favorite_gotit");
        }
        C0708i c0708i = new C0708i();
        C14580b c14580b2 = this.f75051S0;
        if (c14580b2 == null || (str = c14580b2.m81657b()) == null) {
            str = "";
        }
        c0708i.m1075f("ma_id", str);
        C29746c8 c29746c86 = this.f75050R0;
        if (c29746c86 == null) {
            AbstractC19074t.m100223u("vb");
            c29746c86 = null;
        }
        c29746c86.f137407q.setTrackingExtraData(c0708i);
        C29746c8 c29746c87 = this.f75050R0;
        if (c29746c87 == null) {
            AbstractC19074t.m100223u("vb");
        } else {
            c29746c8 = c29746c87;
        }
        c29746c8.f137409s.setTrackingExtraData(c0708i);
    }

    /* renamed from: vM */
    private final void m81655vM() {
        C15923mx m81658c;
        int i11;
        String str;
        String m127114D;
        C14580b c14580b = this.f75051S0;
        if (c14580b != null && c14580b != null && (m81658c = c14580b.m81658c()) != null) {
            C29746c8 c29746c8 = this.f75050R0;
            C29746c8 c29746c82 = null;
            if (c29746c8 == null) {
                AbstractC19074t.m100223u("vb");
                c29746c8 = null;
            }
            RobotoTextView robotoTextView = c29746c8.f137412v;
            C14580b c14580b2 = this.f75051S0;
            if (c14580b2 != null && c14580b2.m81659d() == 1) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            robotoTextView.setVisibility(i11);
            C29746c8 c29746c83 = this.f75050R0;
            if (c29746c83 == null) {
                AbstractC19074t.m100223u("vb");
                c29746c83 = null;
            }
            c29746c83.f137412v.setText(m81658c.m87378c());
            C29746c8 c29746c84 = this.f75050R0;
            if (c29746c84 == null) {
                AbstractC19074t.m100223u("vb");
            } else {
                c29746c82 = c29746c84;
            }
            RobotoTextView robotoTextView2 = c29746c82.f137411u;
            String m87377b = m81658c.m87377b();
            C14580b c14580b3 = this.f75051S0;
            if (c14580b3 == null || (str = c14580b3.m81656a()) == null) {
                str = "";
            }
            m127114D = AbstractC24341v.m127114D(m87377b, "{appName}", str, false, 4, null);
            robotoTextView2.setText(AbstractC1463b.m7440a(m127114D, 0));
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            ((C23528a) new C23528a(getContext()).m123612r(new C3977j(context))).m123579C(m81658c.m87376a(), C23278z2.f112845a.m120171i1(), this.f75052T0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        C14580b c14580b;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C29746c8 c29746c8 = null;
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                c14580b = (C14580b) AbstractC21954k.Companion.m114622q(m92642L3, "MA_AWARENESS_INFO", C14580b.class);
            } else {
                c14580b = null;
            }
            if (c14580b != null) {
                this.f75051S0 = c14580b;
                m81655vM();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        m81654uM();
        C29746c8 c29746c82 = this.f75050R0;
        if (c29746c82 == null) {
            AbstractC19074t.m100223u("vb");
            c29746c82 = null;
        }
        c29746c82.f137408r.setOnClickListener(this);
        C29746c8 c29746c83 = this.f75050R0;
        if (c29746c83 == null) {
            AbstractC19074t.m100223u("vb");
        } else {
            c29746c8 = c29746c83;
        }
        c29746c8.f137407q.setOnClickListener(this);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        C29746c8 c29746c8 = this.f75050R0;
        Integer num = null;
        if (c29746c8 == null) {
            AbstractC19074t.m100223u("vb");
            c29746c8 = null;
        }
        c29746c8.f137408r.setVisibility(8);
        Intent intent = new Intent();
        C14580b c14580b = this.f75051S0;
        if (c14580b != null) {
            num = Integer.valueOf(c14580b.m81659d());
        }
        intent.putExtra("MA_AWARENESS_TYPE", num);
        mo50035CK(-1, intent);
        super.finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppBaseView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MiniAppPopupView";
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: kM */
    public View mo81267kM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29746c8 m147809a = C29746c8.m147809a(layoutInflater.inflate(AbstractC7409c0.mini_app_awereness_view, viewGroup, false));
        AbstractC19074t.m100207e(m147809a, "bind(...)");
        this.f75050R0 = m147809a;
        if (m147809a == null) {
            AbstractC19074t.m100223u("vb");
            m147809a = null;
        }
        return m147809a.getRoot();
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: nM */
    public View mo81268nM() {
        C29746c8 c29746c8 = this.f75050R0;
        if (c29746c8 == null) {
            AbstractC19074t.m100223u("vb");
            c29746c8 = null;
        }
        return c29746c8.f137408r;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: oM */
    public View mo81269oM() {
        C29746c8 c29746c8 = this.f75050R0;
        if (c29746c8 == null) {
            AbstractC19074t.m100223u("vb");
            c29746c8 = null;
        }
        return c29746c8.f137409s;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        String str;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.ma_aw_close_button;
        if (num != null && num.intValue() == i11) {
            MiniAppPopupView.m81730mM(this, false, false, null, 7, null);
            return;
        }
        int i12 = AbstractC6918a0.ma_aw_container;
        if (num != null && num.intValue() == i12) {
            C14580b c14580b = this.f75051S0;
            if (c14580b != null && c14580b.m81659d() == 1) {
                str = "ma_awareness_exit_close";
            } else {
                str = "ma_awareness_favorite_close";
            }
            m81653tM(str);
            MiniAppPopupView.m81730mM(this, false, false, null, 7, null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: qM */
    public void mo81270qM(boolean z11) {
    }
}
