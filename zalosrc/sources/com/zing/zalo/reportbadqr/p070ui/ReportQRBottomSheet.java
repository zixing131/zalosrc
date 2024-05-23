package com.zing.zalo.reportbadqr.p070ui;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes4.dex */
public final class ReportQRBottomSheet extends ZdsModalBottomSheet {
    public static final C9352a Companion = new C9352a(null);

    /* renamed from: com.zing.zalo.reportbadqr.ui.ReportQRBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C9352a {
        private C9352a() {
        }

        public /* synthetic */ C9352a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return "ReportQRBottomSheet";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new ReportQRBS();
    }
}
