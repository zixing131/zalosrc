package com.zing.zalo.register.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.register.bottomsheet.BottomSheetCallLogsView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import mj0.AbstractC23322a;
import p649xl.C29936n0;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class BottomSheetCallLogsView extends BottomSheet {

    /* renamed from: b1 */
    private C29936n0 f49371b1;

    /* renamed from: JL */
    private final void m50037JL() {
        C29936n0 c29936n0 = this.f49371b1;
        C29936n0 c29936n02 = null;
        if (c29936n0 == null) {
            AbstractC19074t.m100223u("binding");
            c29936n0 = null;
        }
        ZAppCompatImageView zAppCompatImageView = c29936n0.f138739r;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC23322a.zds_ic_call_solid_24, AbstractC2807a.accent_blue_icon));
        C29936n0 c29936n03 = this.f49371b1;
        if (c29936n03 == null) {
            AbstractC19074t.m100223u("binding");
            c29936n03 = null;
        }
        FrameLayout frameLayout = c29936n03.f138740s;
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        frameLayout.setBackground(C27280g.m139658a(m92689tK2, AbstractC2810d.bg_btn_medium_secondary_n));
        C29936n0 c29936n04 = this.f49371b1;
        if (c29936n04 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29936n02 = c29936n04;
        }
        c29936n02.f138738q.setOnClickListener(new View.OnClickListener() { // from class: dz.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetCallLogsView.m50038KL(BottomSheetCallLogsView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KL */
    public static final void m50038KL(BottomSheetCallLogsView bottomSheetCallLogsView, View view) {
        AbstractC19074t.m100208f(bottomSheetCallLogsView, "this$0");
        bottomSheetCallLogsView.close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29936n0 m148262c = C29936n0.m148262c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148262c, "inflate(...)");
        this.f49371b1 = m148262c;
        m90525tL(true);
        m90528wL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m50037JL();
    }
}
