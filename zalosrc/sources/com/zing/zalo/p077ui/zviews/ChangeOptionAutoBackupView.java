package com.zing.zalo.p077ui.zviews;

import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes6.dex */
public final class ChangeOptionAutoBackupView extends ZdsModalBottomSheet {
    public static final C14136a Companion = new C14136a(null);

    /* renamed from: com.zing.zalo.ui.zviews.ChangeOptionAutoBackupView$a */
    /* loaded from: classes6.dex */
    public static final class C14136a {
        private C14136a() {
        }

        public /* synthetic */ C14136a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return "ChangeOptionAutoBackupView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new ChangeOptionAutoBackupBottomSheet();
    }
}
