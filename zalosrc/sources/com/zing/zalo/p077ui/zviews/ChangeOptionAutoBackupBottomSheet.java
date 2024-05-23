package com.zing.zalo.p077ui.zviews;

import ac.C0732w;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import p649xl.C30026s1;
import pm0.C24848g0;

/* loaded from: classes6.dex */
public final class ChangeOptionAutoBackupBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    private C30026s1 f72600b1;

    /* renamed from: c1 */
    private boolean f72601c1;

    /* renamed from: JL */
    private final C30026s1 m78686JL() {
        C30026s1 c30026s1 = this.f72600b1;
        AbstractC19074t.m100205c(c30026s1);
        return c30026s1;
    }

    /* renamed from: KL */
    private final void m78687KL() {
        boolean z11;
        m90533zL(EnumC17017m.HUG_CONTENT);
        setIdTracking("zcloud_setup_open_autobackup_settings");
        C30026s1 m78686JL = m78686JL();
        m78686JL.f139282s.setText(m92652XI(AbstractC8020f0.str_title_auto_back_up_daily));
        m78686JL.f139281r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.x4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOptionAutoBackupBottomSheet.m78688LL(ChangeOptionAutoBackupBottomSheet.this, view);
            }
        });
        Bundle m92642L3 = this.f88762c0.m92642L3();
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("KEY_ACTIVE_AUTO_BACKUP");
        } else {
            z11 = false;
        }
        this.f72601c1 = z11;
        m78686JL.f139281r.setChecked(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LL */
    public static final void m78688LL(ChangeOptionAutoBackupBottomSheet changeOptionAutoBackupBottomSheet, View view) {
        AbstractC19074t.m100208f(changeOptionAutoBackupBottomSheet, "this$0");
        changeOptionAutoBackupBottomSheet.m78689ML();
    }

    /* renamed from: ML */
    private final void m78689ML() {
        String str;
        ZaloView m92650VI;
        boolean z11 = !m78686JL().f139281r.isChecked();
        C0732w m1189a = C0732w.Companion.m1189a();
        if (z11) {
            str = "zcloud_setup_autobackup_on";
        } else {
            str = "zcloud_setup_autobackup_off";
        }
        C0732w.m1177r(m1189a, str, null, null, null, 14, null);
        if ((m92650VI() instanceof ChangeOptionAutoBackupView) && (m92650VI = m92650VI()) != null) {
            Intent intent = new Intent();
            intent.putExtra("KEY_ACTIVE_AUTO_BACKUP", z11);
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92650VI.mo50035CK(100, intent);
        }
        close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f72600b1 = C30026s1.m148471c(LayoutInflater.from(getContext()), linearLayout, true);
        m78687KL();
    }
}
