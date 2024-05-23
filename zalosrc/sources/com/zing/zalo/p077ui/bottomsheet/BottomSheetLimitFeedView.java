package com.zing.zalo.p077ui.bottomsheet;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes5.dex */
public final class BottomSheetLimitFeedView extends ZdsModalBottomSheet {
    public static final C11171a Companion = new C11171a(null);

    /* renamed from: com.zing.zalo.ui.bottomsheet.BottomSheetLimitFeedView$a */
    /* loaded from: classes5.dex */
    public static final class C11171a {
        private C11171a() {
        }

        public /* synthetic */ C11171a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return "BottomSheetLimitFeedView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new BottomSheetLimitFeed();
    }
}
