package com.zing.zalo.feed.mvp.feed.view.component;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes4.dex */
public final class BottomSheetOnboardingMoveTab extends ZdsModalBottomSheet {
    public static final C8569a Companion = new C8569a(null);

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.component.BottomSheetOnboardingMoveTab$a */
    /* loaded from: classes4.dex */
    public static final class C8569a {
        private C8569a() {
        }

        public /* synthetic */ C8569a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new OnboardingMoveTabBottomSheet();
    }
}
