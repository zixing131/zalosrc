package com.zing.zalo.p077ui.mycloud;

import android.os.Bundle;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import u80.C27151n;

/* loaded from: classes6.dex */
public final class ContextMenuDetailTextMessageBottomSheet extends ZdsModalBottomSheet {
    public static final C12471a Companion = new C12471a(null);

    /* renamed from: S0 */
    private long f65289S0;

    /* renamed from: T0 */
    private MyCloudMessageItem f65290T0;

    /* renamed from: com.zing.zalo.ui.mycloud.ContextMenuDetailTextMessageBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C12471a {
        private C12471a() {
        }

        public /* synthetic */ C12471a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        if (this.f65290T0 == null) {
            return null;
        }
        MyCloudMessageItem myCloudMessageItem = this.f65290T0;
        AbstractC19074t.m100205c(myCloudMessageItem);
        return new C27151n(myCloudMessageItem, this.f65289S0);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        MyCloudMessageItem myCloudMessageItem;
        long j11;
        Bundle m92642L3 = m92642L3();
        MyCloudMessageItem myCloudMessageItem2 = null;
        if (m92642L3 != null) {
            myCloudMessageItem = (MyCloudMessageItem) m92642L3.getParcelable("EXTRA_DATA");
        } else {
            myCloudMessageItem = null;
        }
        if (myCloudMessageItem instanceof MyCloudMessageItem) {
            myCloudMessageItem2 = myCloudMessageItem;
        }
        this.f65290T0 = myCloudMessageItem2;
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            j11 = m92642L32.getLong("COLLECTION_ID");
        } else {
            j11 = 0;
        }
        this.f65289S0 = j11;
        super.mo37135xJ(bundle);
    }
}
