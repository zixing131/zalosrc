package com.zing.zalo.feed.reactions.bottomsheet;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes4.dex */
public final class FeedReactionBottomSheet extends ZdsModalBottomSheet {
    public static final C8828a Companion = new C8828a(null);

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C8828a {
        private C8828a() {
        }

        public /* synthetic */ C8828a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new FeedReactionBottomSheetBS();
    }
}
