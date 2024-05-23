package com.zing.zalo.qrcode.p069ui.sheet;

import android.os.Bundle;
import com.zing.zalo.qrcode.p069ui.sheet.ResultSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import qe0.AbstractC25247c;

/* loaded from: classes4.dex */
public abstract class ResultSheet extends BottomSheet {

    /* renamed from: com.zing.zalo.qrcode.ui.sheet.ResultSheet$a */
    /* loaded from: classes4.dex */
    public static final class C9265a extends BottomSheet.AbstractC16910a {
        public C9265a() {
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: a */
        public void mo45955a() {
            ResultSheet.this.finish();
        }

        @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
        /* renamed from: b */
        public void mo45956b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JL */
    public static final void m49589JL(ResultSheet resultSheet) {
        AbstractC19074t.m100208f(resultSheet, "this$0");
        resultSheet.m90508EL();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        AbstractC19444a.m101695c(new Runnable() { // from class: ry.q
            @Override // java.lang.Runnable
            public final void run() {
                ResultSheet.m49589JL(ResultSheet.this);
            }
        });
        AbstractC25247c.m130673a(this, new C9265a());
    }
}
