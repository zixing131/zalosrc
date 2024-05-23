package com.zing.zalo.p077ui.bottomsheet;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes5.dex */
public final class LogoutConfirmView extends ZdsModalBottomSheet {
    public static final C11176a Companion = new C11176a(null);

    /* renamed from: com.zing.zalo.ui.bottomsheet.LogoutConfirmView$a */
    /* loaded from: classes5.dex */
    public static final class C11176a {
        private C11176a() {
        }

        public /* synthetic */ C11176a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return "LogoutConfirmView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new LogoutConfirmViewBottomSheet();
    }
}
