package com.zing.zalo.p077ui.group.bottomsheet.setting;

import android.os.Bundle;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class ManageMemberPermissionSettingBottomSheet extends ZdsModalBottomSheet {
    public static final C11898a Companion = new C11898a(null);

    /* renamed from: com.zing.zalo.ui.group.bottomsheet.setting.ManageMemberPermissionSettingBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C11898a {
        private C11898a() {
        }

        public /* synthetic */ C11898a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m66151a(Bundle bundle, boolean z11, int i11, String str) {
            AbstractC19074t.m100208f(bundle, "bundle");
            AbstractC19074t.m100208f(str, "entryPoint");
            bundle.putBoolean("EXTRA_BUNDLE_IS_CHECK", z11);
            bundle.putInt("EXTRA_BUNDLE_SETTING_VIEW_ID", i11);
            bundle.putString("EXTRA_ENTRY_POINT", str);
            return bundle;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        ManageMemberPermissionSettingBS manageMemberPermissionSettingBS = new ManageMemberPermissionSettingBS();
        manageMemberPermissionSettingBS.mo60305zK(m92642L3());
        return manageMemberPermissionSettingBS;
    }
}
