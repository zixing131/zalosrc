package com.zing.zalo.p077ui.toolstorage;

import ac.C0722p;
import ac.InterfaceC0724q;
import android.os.Bundle;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.toolstorage.ToolStorageAppSettingActivity;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.toolstoragev1.summary.StorageSummaryView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.widget.InsetsLayout;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import j30.C20912a;

/* loaded from: classes6.dex */
public final class ToolStorageAppSettingActivity extends BaseZaloActivity implements InterfaceC0724q {
    public static final C13330a Companion = new C13330a(null);

    /* renamed from: i0 */
    private String f68459i0 = "";

    /* renamed from: j0 */
    private C16972e0 f68460j0;

    /* renamed from: com.zing.zalo.ui.toolstorage.ToolStorageAppSettingActivity$a */
    /* loaded from: classes6.dex */
    public static final class C13330a {
        private C13330a() {
        }

        public /* synthetic */ C13330a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: e4 */
    private final void m74830e4() {
        C16972e0 c16972e0 = this.f68460j0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        m74832t4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4 */
    public static final void m74831m4(ToolStorageAppSettingActivity toolStorageAppSettingActivity) {
        AbstractC19074t.m100208f(toolStorageAppSettingActivity, "this$0");
        toolStorageAppSettingActivity.m74836z4();
    }

    /* renamed from: t4 */
    private final void m74832t4() {
        ZaloView m92996E0 = mo35579p().m92996E0("TOOL_STORAGE_TAG");
        if (m92996E0 == null) {
            return;
        }
        mo35579p().mo92702G1(m92996E0, 0);
    }

    /* renamed from: u4 */
    private final void m74833u4() {
        m74830e4();
        C16972e0.a aVar = new C16972e0.a(this);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        String string = getString(AbstractC8020f0.str_warning_must_login_zalo);
        AbstractC19074t.m100207e(string, "getString(...)");
        aVar.m90949z(string);
        aVar.m90928e(true);
        aVar.m90933j(AbstractC8020f0.str_tip_banner_got_it, new InterfaceC17463d.d() { // from class: ua0.c
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ToolStorageAppSettingActivity.m74834v4(ToolStorageAppSettingActivity.this, interfaceC17463d, i11);
            }
        });
        C16972e0 m90927d = aVar.m90927d();
        m90927d.m92874z(false);
        m90927d.m92854E(new InterfaceC17463d.c() { // from class: ua0.d
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                ToolStorageAppSettingActivity.m74835y4(ToolStorageAppSettingActivity.this, interfaceC17463d);
            }
        });
        this.f68460j0 = m90927d;
        m90927d.mo13822K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v4 */
    public static final void m74834v4(ToolStorageAppSettingActivity toolStorageAppSettingActivity, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(toolStorageAppSettingActivity, "this$0");
        toolStorageAppSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y4 */
    public static final void m74835y4(ToolStorageAppSettingActivity toolStorageAppSettingActivity, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(toolStorageAppSettingActivity, "this$0");
        if (toolStorageAppSettingActivity.f68459i0.length() == 0) {
            toolStorageAppSettingActivity.finish();
        }
    }

    /* renamed from: z4 */
    private final void m74836z4() {
        if (C20912a.Companion.m109411a().m109405l()) {
            mo35579p().mo89694j2(ToolStorageView.class, new Bundle(), 0, "TOOL_STORAGE_TAG", 0, true);
        } else {
            mo35579p().mo89694j2(StorageSummaryView.class, new Bundle(), 0, "TOOL_STORAGE_TAG", 0, true);
        }
    }

    @Override // ac.InterfaceC0724q
    /* renamed from: l0 */
    public C0722p.b mo1166l0() {
        return C0722p.b.APP_RESUME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InsetsLayout insetsLayout = new InsetsLayout(this);
        insetsLayout.setId(AbstractC6918a0.zalo_view_container);
        insetsLayout.setApplyWindowInsetsListener(this);
        setContentView(insetsLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.BaseZaloActivity, com.zing.zalo.activity.ZaloActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() == 0) {
            m74833u4();
        } else if (!AbstractC19074t.m100204b(this.f68459i0, CoreUtility.f89233i)) {
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            this.f68459i0 = str2;
            m74830e4();
            mo35570g0().post(new Runnable() { // from class: ua0.b
                @Override // java.lang.Runnable
                public final void run() {
                    ToolStorageAppSettingActivity.m74831m4(ToolStorageAppSettingActivity.this);
                }
            });
        }
        String str3 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str3, "currentUserUid");
        this.f68459i0 = str3;
    }
}
