package com.zing.zalo.p077ui.chattag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.chattag.UnSupportEditChatTagBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import p649xl.C29793f1;

/* loaded from: classes5.dex */
public final class UnSupportEditChatTagBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    private C29793f1 f61614b1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JL */
    public static final void m65769JL(UnSupportEditChatTagBottomSheet unSupportEditChatTagBottomSheet, View view) {
        AbstractC19074t.m100208f(unSupportEditChatTagBottomSheet, "this$0");
        unSupportEditChatTagBottomSheet.close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29793f1 c29793f1 = this.f61614b1;
        if (c29793f1 != null) {
            return c29793f1.getRoot();
        }
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29793f1 m147926c = C29793f1.m147926c(layoutInflater, linearLayout, true);
        this.f61614b1 = m147926c;
        if (m147926c != null) {
            m147926c.f137729q.setIdTracking("btn_got_it_popup_un_support_edit_tag");
            m147926c.f137729q.setOnClickListener(new View.OnClickListener() { // from class: v60.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnSupportEditChatTagBottomSheet.m65769JL(UnSupportEditChatTagBottomSheet.this, view);
                }
            });
        }
        m90533zL(EnumC17017m.HUG_CONTENT);
    }
}
