package com.zing.zalo.register.bottomsheet;

import android.os.Bundle;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes4.dex */
public final class RegisterLayoutBottomSheet extends ZdsModalBottomSheet {
    public static final C9313a Companion = new C9313a(null);

    /* renamed from: S0 */
    private int f49379S0;

    /* renamed from: com.zing.zalo.register.bottomsheet.RegisterLayoutBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C9313a {
        private C9313a() {
        }

        public /* synthetic */ C9313a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f49379S0 = m92642L3.getInt("EXTRA_BOTTOM_SHEET_TAG", 0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        int i11 = this.f49379S0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return new BottomSheetLanguageView();
                    }
                    return new BottomSheetSelectAvatarMethodView();
                }
                return new BottomSheetSelectGenderView();
            }
            return new BottomSheetBirthdayPickerView();
        }
        return new BottomSheetCallLogsView();
    }
}
