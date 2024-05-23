package com.zing.zalo.p077ui.zviews;

import am.C0943w;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i70.C20379a;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p649xl.C29765d9;
import p716zh.C31973j5;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class OnboardingCommunityUpgradedView extends BaseZaloView {
    public static final C14709a Companion = new C14709a(null);

    /* renamed from: M0 */
    private C29765d9 f75735M0;

    /* renamed from: N0 */
    private String f75736N0 = "";

    /* renamed from: O0 */
    private boolean f75737O0;

    /* renamed from: P0 */
    private boolean f75738P0;

    /* renamed from: Q0 */
    private long f75739Q0;

    /* renamed from: R0 */
    private boolean f75740R0;

    /* renamed from: com.zing.zalo.ui.zviews.OnboardingCommunityUpgradedView$a */
    /* loaded from: classes6.dex */
    public static final class C14709a {
        private C14709a() {
        }

        public /* synthetic */ C14709a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fM */
    public static final void m82426fM(OnboardingCommunityUpgradedView onboardingCommunityUpgradedView, View view) {
        AbstractC19074t.m100208f(onboardingCommunityUpgradedView, "this$0");
        onboardingCommunityUpgradedView.m82428hM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public static final void m82427gM(OnboardingCommunityUpgradedView onboardingCommunityUpgradedView, View view) {
        AbstractC19074t.m100208f(onboardingCommunityUpgradedView, "this$0");
        onboardingCommunityUpgradedView.m82429iM();
    }

    /* renamed from: hM */
    private final void m82428hM() {
        finish();
    }

    /* renamed from: iM */
    private final void m82429iM() {
        String str;
        finish();
        JSONObject jSONObject = new JSONObject();
        if (this.f75737O0) {
            str = "ad";
        } else {
            str = "mem";
        }
        jSONObject.put("member_role", str);
        C20379a.f100400a.m106159a(null, 0, "community_onboarding_fs", jSONObject.toString());
        AbstractC28207v1.m141994i3("action.open.inapp", 3, m92676n2(), this, AbstractC23306f.m120583H().m110204g().m116315g(), null);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("KEY_GROUP_ID");
        } else {
            str = null;
        }
        this.f75736N0 = str;
        C31973j5 m4472f = C0943w.f3447a.m4472f(str);
        if (m4472f != null) {
            this.f75737O0 = m4472f.m153743U();
            this.f75738P0 = m4472f.m153747Y();
        }
        this.f75739Q0 = System.currentTimeMillis();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29765d9 m147856c = C29765d9.m147856c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147856c, "inflate(...)");
        this.f75735M0 = m147856c;
        C29765d9 c29765d9 = null;
        if (this.f75737O0) {
            if (m147856c == null) {
                AbstractC19074t.m100223u("binding");
                m147856c = null;
            }
            m147856c.f137526s.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_onboarding_community_upgraded_desc_2_for_admin));
        }
        C29765d9 c29765d92 = this.f75735M0;
        if (c29765d92 == null) {
            AbstractC19074t.m100223u("binding");
            c29765d92 = null;
        }
        c29765d92.f137524q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.x20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingCommunityUpgradedView.m82426fM(OnboardingCommunityUpgradedView.this, view);
            }
        });
        C29765d9 c29765d93 = this.f75735M0;
        if (c29765d93 == null) {
            AbstractC19074t.m100223u("binding");
            c29765d93 = null;
        }
        c29765d93.f137525r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.y20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingCommunityUpgradedView.m82427gM(OnboardingCommunityUpgradedView.this, view);
            }
        });
        C29765d9 c29765d94 = this.f75735M0;
        if (c29765d94 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29765d9 = c29765d94;
        }
        LinearLayout root = c29765d9.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        String str;
        super.mo13886RJ();
        if (!this.f75740R0) {
            JSONObject jSONObject = new JSONObject();
            if (this.f75737O0) {
                str = "ad";
            } else {
                str = "mem";
            }
            jSONObject.put("member_role", str);
            jSONObject.put("duration", System.currentTimeMillis() - this.f75739Q0);
            C20379a.f100400a.m106159a(null, 2, "community_onboarding_fs_view_time", jSONObject.toString());
            this.f75740R0 = true;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putBoolean("KEY_BUNDLE_IS_LOG_DURATION_SUBMITTED", this.f75740R0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OnboardingCommunityUpgradedView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        boolean z11 = false;
        if (bundle != null && bundle.getBoolean("KEY_BUNDLE_IS_LOG_DURATION_SUBMITTED")) {
            z11 = true;
        }
        this.f75740R0 = z11;
    }
}
