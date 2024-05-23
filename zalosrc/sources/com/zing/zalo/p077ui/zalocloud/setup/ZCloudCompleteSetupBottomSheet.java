package com.zing.zalo.p077ui.zalocloud.setup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudCompleteSetupBottomSheet;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import p649xl.C29968oe;

/* loaded from: classes6.dex */
public final class ZCloudCompleteSetupBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    public C29968oe f71975b1;

    /* renamed from: KL */
    private final void m77812KL() {
        m77815JL().f138909q.setOnClickListener(new View.OnClickListener() { // from class: hc0.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudCompleteSetupBottomSheet.m77813LL(ZCloudCompleteSetupBottomSheet.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LL */
    public static final void m77813LL(ZCloudCompleteSetupBottomSheet zCloudCompleteSetupBottomSheet, View view) {
        AbstractC19074t.m100208f(zCloudCompleteSetupBottomSheet, "this$0");
        zCloudCompleteSetupBottomSheet.close();
    }

    /* renamed from: ML */
    private final void m77814ML() {
        RobotoTextView robotoTextView = m77815JL().f138911s;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_is_ready_for_data_storage);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C16805b.b bVar = C16805b.Companion;
        String format = String.format(m92652XI, Arrays.copyOf(new Object[]{bVar.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        RobotoTextView robotoTextView2 = m77815JL().f138910r;
        String m92652XI2 = m92652XI(AbstractC8020f0.str_your_selected_data_will_be_transferred_to_zcloud);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        String format2 = String.format(m92652XI2, Arrays.copyOf(new Object[]{bVar.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format2, "format(...)");
        robotoTextView2.setText(format2);
    }

    /* renamed from: JL */
    public final C29968oe m77815JL() {
        C29968oe c29968oe = this.f71975b1;
        if (c29968oe != null) {
            return c29968oe;
        }
        AbstractC19074t.m100223u("mBinding");
        return null;
    }

    /* renamed from: NL */
    public final void m77816NL(C29968oe c29968oe) {
        AbstractC19074t.m100208f(c29968oe, "<set-?>");
        this.f71975b1 = c29968oe;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29968oe m148339c = C29968oe.m148339c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148339c, "inflate(...)");
        m77816NL(m148339c);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m90525tL(false);
        m77812KL();
        m77814ML();
    }
}
