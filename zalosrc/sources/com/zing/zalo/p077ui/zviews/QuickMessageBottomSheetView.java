package com.zing.zalo.p077ui.zviews;

import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes6.dex */
public final class QuickMessageBottomSheetView extends ZdsModalBottomSheet {
    public static final C14879a Companion = new C14879a(null);

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageBottomSheetView$a */
    /* loaded from: classes6.dex */
    public static final class C14879a {
        private C14879a() {
        }

        public /* synthetic */ C14879a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return "QuickMessageBottomSheetView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new QuickMessageBottomSheet();
    }
}
