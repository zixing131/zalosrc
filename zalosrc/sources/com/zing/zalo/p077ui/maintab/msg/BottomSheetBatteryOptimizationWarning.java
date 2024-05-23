package com.zing.zalo.p077ui.maintab.msg;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes5.dex */
public final class BottomSheetBatteryOptimizationWarning extends ZdsModalBottomSheet {
    public static final C12177a Companion = new C12177a(null);

    /* renamed from: com.zing.zalo.ui.maintab.msg.BottomSheetBatteryOptimizationWarning$a */
    /* loaded from: classes5.dex */
    public static final class C12177a {
        private C12177a() {
        }

        public /* synthetic */ C12177a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new BatteryOptimizationWarningBottomSheet();
    }
}
