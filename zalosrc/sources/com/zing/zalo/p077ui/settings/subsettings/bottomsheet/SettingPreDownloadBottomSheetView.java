package com.zing.zalo.p077ui.settings.subsettings.bottomsheet;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes6.dex */
public final class SettingPreDownloadBottomSheetView extends ZdsModalBottomSheet {
    public static final C13273a Companion = new C13273a(null);

    /* renamed from: com.zing.zalo.ui.settings.subsettings.bottomsheet.SettingPreDownloadBottomSheetView$a */
    /* loaded from: classes6.dex */
    public static final class C13273a {
        private C13273a() {
        }

        public /* synthetic */ C13273a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return "SettingPreDownloadBottomSheetView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new SettingPreDownloadBottomSheet();
    }
}
