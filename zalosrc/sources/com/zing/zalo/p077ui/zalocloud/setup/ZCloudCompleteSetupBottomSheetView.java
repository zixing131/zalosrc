package com.zing.zalo.p077ui.zalocloud.setup;

import android.os.Bundle;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public final class ZCloudCompleteSetupBottomSheetView extends ZdsModalBottomSheet {
    public static final C13982a Companion = new C13982a(null);

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudCompleteSetupBottomSheetView$a */
    /* loaded from: classes6.dex */
    public static final class C13982a {
        private C13982a() {
        }

        public /* synthetic */ C13982a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m77817b(C13982a c13982a, InterfaceC27218a interfaceC27218a, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            c13982a.m77818a(interfaceC27218a, i11);
        }

        /* renamed from: a */
        public final void m77818a(InterfaceC27218a interfaceC27218a, int i11) {
            AbstractC19074t.m100208f(interfaceC27218a, "zaloViewManager");
            interfaceC27218a.mo35581q(ZCloudCompleteSetupBottomSheetView.class, new Bundle(), i11, 1, false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new ZCloudCompleteSetupBottomSheet();
    }
}
