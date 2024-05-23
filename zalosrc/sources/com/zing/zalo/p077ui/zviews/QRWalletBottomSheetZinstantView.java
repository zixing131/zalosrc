package com.zing.zalo.p077ui.zviews;

import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes6.dex */
public final class QRWalletBottomSheetZinstantView extends ZdsModalBottomSheet {
    public static final C14830a Companion = new C14830a(null);

    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstantView$a */
    /* loaded from: classes6.dex */
    public static final class C14830a {
        private C14830a() {
        }

        public /* synthetic */ C14830a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return "CommonZaloview";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant = new QRWalletBottomSheetZinstant();
        qRWalletBottomSheetZinstant.mo60305zK(m92642L3());
        return qRWalletBottomSheetZinstant;
    }
}
