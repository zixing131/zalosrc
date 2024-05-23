package com.zing.zalo.p077ui.mycloud;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public final class MyCloudQuotaOnBoardBottomSheet extends ZdsModalBottomSheet {
    public static final C12500a Companion = new C12500a(null);

    /* renamed from: S0 */
    private static final String f65401S0;

    /* renamed from: com.zing.zalo.ui.mycloud.MyCloudQuotaOnBoardBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C12500a {
        private C12500a() {
        }

        public /* synthetic */ C12500a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m70262a() {
            return MyCloudQuotaOnBoardBottomSheet.f65401S0;
        }
    }

    static {
        String simpleName = MyCloudQuotaOnBoardBottomSheet.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f65401S0 = simpleName;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new MyCloudQuotaOnBoardBS();
    }
}
