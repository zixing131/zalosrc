package com.zing.zalo.p077ui.bottomsheet;

import android.os.Bundle;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public final class BottomSheetVideoHdOnboard extends ZdsModalBottomSheet {
    public static final C11175a Companion = new C11175a(null);

    /* renamed from: com.zing.zalo.ui.bottomsheet.BottomSheetVideoHdOnboard$a */
    /* loaded from: classes5.dex */
    public static final class C11175a {
        private C11175a() {
        }

        public /* synthetic */ C11175a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m58506a() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_everyone_receiver);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        VideoHdOnboardBottomSheet videoHdOnboardBottomSheet = new VideoHdOnboardBottomSheet();
        if (m92642L3() == null) {
            return videoHdOnboardBottomSheet;
        }
        Bundle m92642L3 = m92642L3();
        AbstractC19074t.m100205c(m92642L3);
        String string = m92642L3.getString("RECEIVER_NAME_FIELD", Companion.m58506a());
        AbstractC19074t.m100207e(string, "getString(...)");
        videoHdOnboardBottomSheet.m58631ML(string);
        return videoHdOnboardBottomSheet;
    }
}
