package com.zing.zalo.p077ui.zalocloud.migration;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes6.dex */
public final class ZCloudDriveLoginBottomSheet extends ZdsModalBottomSheet {
    public static final C13930a Companion = new C13930a(null);

    /* renamed from: com.zing.zalo.ui.zalocloud.migration.ZCloudDriveLoginBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C13930a {
        private C13930a() {
        }

        public /* synthetic */ C13930a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new ZCloudDriveLoginBS();
    }
}
