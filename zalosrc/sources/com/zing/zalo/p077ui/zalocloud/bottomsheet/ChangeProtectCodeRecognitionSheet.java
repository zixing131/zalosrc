package com.zing.zalo.p077ui.zalocloud.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.zalocloud.bottomsheet.ChangeProtectCodeRecognitionSheet;
import com.zing.zalo.p077ui.zalocloud.bottomsheet.ChangeProtectCodeRecognitionSheetView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import p649xl.C30060u1;

/* loaded from: classes6.dex */
public final class ChangeProtectCodeRecognitionSheet extends BottomSheet {

    /* renamed from: b1 */
    public C30060u1 f71505b1;

    /* renamed from: KL */
    private final void m77089KL() {
        m77092JL().f139529q.setOnClickListener(new View.OnClickListener() { // from class: ub0.a
            public /* synthetic */ ViewOnClickListenerC27222a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeProtectCodeRecognitionSheet.m77090LL(ChangeProtectCodeRecognitionSheet.this, view);
            }
        });
    }

    /* renamed from: LL */
    public static final void m77090LL(ChangeProtectCodeRecognitionSheet changeProtectCodeRecognitionSheet, View view) {
        AbstractC19074t.m100208f(changeProtectCodeRecognitionSheet, "this$0");
        ChangeProtectCodeRecognitionSheetView.Companion.m77097b();
        changeProtectCodeRecognitionSheet.close();
    }

    /* renamed from: ML */
    private final void m77091ML() {
        ChangeProtectCodeRecognitionSheetView.C13825a c13825a = ChangeProtectCodeRecognitionSheetView.Companion;
        c13825a.m77099d().mo113433d(null);
        m90533zL(EnumC17017m.HUG_CONTENT);
        c13825a.m77102g("initUI called, current state: " + c13825a.m77099d().getValue());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        ChangeProtectCodeRecognitionSheetView.C13825a c13825a = ChangeProtectCodeRecognitionSheetView.Companion;
        c13825a.m77097b();
        c13825a.m77102g("OnDestroy Called, current state: " + c13825a.m77099d().getValue());
    }

    /* renamed from: JL */
    public final C30060u1 m77092JL() {
        C30060u1 c30060u1 = this.f71505b1;
        if (c30060u1 != null) {
            return c30060u1;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: NL */
    public final void m77093NL(C30060u1 c30060u1) {
        AbstractC19074t.m100208f(c30060u1, "<set-?>");
        this.f71505b1 = c30060u1;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30060u1 m148554c = C30060u1.m148554c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148554c, "inflate(...)");
        m77093NL(m148554c);
        m77091ML();
        m77089KL();
    }
}
