package com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SaveBackupKeyBS;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SaveBackupKeyBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import p649xl.C30137ya;

/* loaded from: classes5.dex */
public final class SaveBackupKeyBS extends BottomSheet {

    /* renamed from: b1 */
    public C30137ya f55719b1;

    /* renamed from: KL */
    private final void m57639KL() {
        m57644RL(SaveBackupKeyBottomSheet.EnumC11042b.f55722s);
    }

    /* renamed from: ML */
    private final void m57640ML() {
        ListItem listItem = m57645LL().f140033r;
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_setup_save_to_google_drive);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        listItem.setTitle(m92652XI);
        listItem.m90592m(true);
        listItem.setOnClickListener(new View.OnClickListener() { // from class: q40.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveBackupKeyBS.m57641NL(SaveBackupKeyBS.this, view);
            }
        });
        ListItem listItem2 = m57645LL().f140032q;
        AbstractC19074t.m100205c(listItem2);
        listItem2.setVisibility(8);
        String m92652XI2 = m92652XI(AbstractC8020f0.str_zcloud_setup_copy_code);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        listItem2.setTitle(m92652XI2);
        listItem2.m90592m(false);
        listItem2.setOnClickListener(new View.OnClickListener() { // from class: q40.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveBackupKeyBS.m57642OL(SaveBackupKeyBS.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m57641NL(SaveBackupKeyBS saveBackupKeyBS, View view) {
        AbstractC19074t.m100208f(saveBackupKeyBS, "this$0");
        saveBackupKeyBS.m57643PL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public static final void m57642OL(SaveBackupKeyBS saveBackupKeyBS, View view) {
        AbstractC19074t.m100208f(saveBackupKeyBS, "this$0");
        saveBackupKeyBS.m57639KL();
    }

    /* renamed from: PL */
    private final void m57643PL() {
        m57644RL(SaveBackupKeyBottomSheet.EnumC11042b.f55721r);
    }

    /* renamed from: RL */
    private final void m57644RL(SaveBackupKeyBottomSheet.EnumC11042b enumC11042b) {
        ZaloView m92650VI;
        Intent intent = new Intent();
        intent.putExtra("EXTRA_PARAM_TYPE", enumC11042b.m57648c());
        if ((m92650VI() instanceof SaveBackupKeyBottomSheet) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* renamed from: LL */
    public final C30137ya m57645LL() {
        C30137ya c30137ya = this.f55719b1;
        if (c30137ya != null) {
            return c30137ya;
        }
        AbstractC19074t.m100223u("mBinding");
        return null;
    }

    /* renamed from: QL */
    public final void m57646QL(C30137ya c30137ya) {
        AbstractC19074t.m100208f(c30137ya, "<set-?>");
        this.f55719b1 = c30137ya;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30137ya m148743c = C30137ya.m148743c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148743c, "inflate(...)");
        m57646QL(m148743c);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m90525tL(true);
        m57640ML();
    }
}
