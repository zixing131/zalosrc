package com.zing.zalo.p077ui.bottomsheet;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes5.dex */
public final class BottomSheetSettingView extends ZdsModalBottomSheet {
    public static final C11174a Companion = new C11174a(null);

    /* renamed from: com.zing.zalo.ui.bottomsheet.BottomSheetSettingView$a */
    /* loaded from: classes5.dex */
    public static final class C11174a {
        private C11174a() {
        }

        public /* synthetic */ C11174a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return "BottomSheetSettingView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new SettingViewBottomSheet();
    }
}
