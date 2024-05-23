package com.zing.zalo.p077ui.picker.mycloud;

import ag0.C0815e1;
import android.os.Bundle;
import android.view.View;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.picker.mycloud.IntroMyCloudQuickPickerView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23211s7;
import on0.AbstractC24341v;
import p133ek.AbstractC18458a;
import p279jw.C21373a;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p649xl.C29923m5;

/* loaded from: classes6.dex */
public final class IntroMyCloudQuickPickerView extends BottomPickerView {
    public static final C12865a Companion = new C12865a(null);

    /* renamed from: U0 */
    private C29923m5 f66845U0;

    /* renamed from: V0 */
    private String f66846V0 = "204278670";

    /* renamed from: W0 */
    private String f66847W0 = "";

    /* renamed from: com.zing.zalo.ui.picker.mycloud.IntroMyCloudQuickPickerView$a */
    /* loaded from: classes6.dex */
    public static final class C12865a {
        private C12865a() {
        }

        public /* synthetic */ C12865a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final IntroMyCloudQuickPickerView m72557a(String str) {
            Bundle m78535kL = BottomPickerView.m78535kL();
            m78535kL.putString("EXTRA_CONVERSATION_ID", str);
            IntroMyCloudQuickPickerView introMyCloudQuickPickerView = new IntroMyCloudQuickPickerView();
            introMyCloudQuickPickerView.mo60305zK(m78535kL);
            return introMyCloudQuickPickerView;
        }
    }

    /* renamed from: pL */
    private final void m72552pL() {
        String str;
        if (AbstractC25495a.m132079d(this.f66846V0)) {
            str = "2";
        } else if (AbstractC25495a.m132086k(this.f66846V0)) {
            str = "3";
        } else if (AbstractC25495a.m132078c(this.f66846V0)) {
            str = "4";
        } else {
            str = "1";
        }
        C0815e1.m2075D().m2100V(new C23648e(1, "", 1, "mycloud_attach_onboarding_3_1", str), false);
    }

    /* renamed from: rL */
    private final void m72553rL() {
        C29923m5 c29923m5 = this.f66845U0;
        C29923m5 c29923m52 = null;
        if (c29923m5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29923m5 = null;
        }
        c29923m5.f138658s.setClipToOutline(true);
        C29923m5 c29923m53 = this.f66845U0;
        if (c29923m53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29923m53 = null;
        }
        c29923m53.f138658s.setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bottom_view_bg_popup_rounded_top_12));
        if (AbstractC19074t.m100204b("vi", AbstractC18458a.f93019a)) {
            C29923m5 c29923m54 = this.f66845U0;
            if (c29923m54 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29923m54 = null;
            }
            c29923m54.f138658s.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_vi_illustration_container));
        } else {
            C29923m5 c29923m55 = this.f66845U0;
            if (c29923m55 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29923m55 = null;
            }
            c29923m55.f138658s.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_en_illustration_containter));
        }
        C29923m5 c29923m56 = this.f66845U0;
        if (c29923m56 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29923m56 = null;
        }
        c29923m56.f138657r.setOnClickListener(new View.OnClickListener() { // from class: p90.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroMyCloudQuickPickerView.m72554sL(IntroMyCloudQuickPickerView.this, view);
            }
        });
        C29923m5 c29923m57 = this.f66845U0;
        if (c29923m57 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29923m52 = c29923m57;
        }
        c29923m52.f138656q.setOnClickListener(new View.OnClickListener() { // from class: p90.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroMyCloudQuickPickerView.m72555tL(IntroMyCloudQuickPickerView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sL */
    public static final void m72554sL(IntroMyCloudQuickPickerView introMyCloudQuickPickerView, View view) {
        String m127114D;
        AbstractC19074t.m100208f(introMyCloudQuickPickerView, "this$0");
        C21373a.f104231a.m110787J(true);
        if (AbstractC25495a.m132079d(introMyCloudQuickPickerView.f66847W0)) {
            m127114D = AbstractC24341v.m127114D(introMyCloudQuickPickerView.f66847W0, "group_", "", false, 4, null);
            AbstractC23211s7.m119574g(m127114D, introMyCloudQuickPickerView.m92676n2(), null);
        } else {
            AbstractC23211s7.m119572e(introMyCloudQuickPickerView.f66847W0, introMyCloudQuickPickerView.m92676n2(), "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tL */
    public static final void m72555tL(IntroMyCloudQuickPickerView introMyCloudQuickPickerView, View view) {
        AbstractC19074t.m100208f(introMyCloudQuickPickerView, "this$0");
        C21373a.f104231a.m110790M();
        introMyCloudQuickPickerView.finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f88762c0.m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("EXTRA_CONVERSATION_ID")) {
            String string = m92642L3.getString("EXTRA_CONVERSATION_ID", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f66847W0 = string;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C29923m5 m148237a = C29923m5.m148237a(this.f83659I0);
        AbstractC19074t.m100207e(m148237a, "bind(...)");
        this.f66845U0 = m148237a;
        m72553rL();
        m72552pL();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.layout_intro_my_cloud_quick_picker_view;
    }

    /* renamed from: qL */
    public String m72556qL() {
        return "IntroMyCloudQuickPickerView";
    }
}
