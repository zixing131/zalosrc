package com.zing.zalo.p077ui.backuprestore.syncpass;

import android.os.Bundle;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncPassDeleteView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import ho0.AbstractC20110a;
import p297kd.C21688c;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import si.C26263i;

/* loaded from: classes5.dex */
public abstract class SyncPassDeleteView extends SlidableZaloView implements InterfaceC28625j {

    /* renamed from: P0 */
    protected boolean f56055P0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public /* synthetic */ void m58337jM(C21688c.b bVar) {
        int i11 = bVar.f132722a;
        if (i11 != 0) {
            switch (i11) {
                case 18:
                    this.f72421L0.mo49282B8(m92652XI(AbstractC8020f0.str_delete_backup_media), false);
                    return;
                case 19:
                    this.f72421L0.mo49282B8(m92652XI(AbstractC8020f0.str_deleted_backup_message_and_pass), false);
                    return;
                case 20:
                    AbstractC20110a.m104535d("updateSyncStatus: Delete success", new Object[0]);
                    return;
                case 21:
                    AbstractC20110a.m104535d("updateSyncStatus: Delete error", new Object[0]);
                    return;
                case 22:
                    AbstractC20110a.m104535d("updateSyncStatus: Delete finish", new Object[0]);
                    return;
                default:
                    this.f72421L0.mo49315c4();
                    return;
            }
        }
        this.f72421L0.mo49315c4();
        if (this.f56055P0) {
            C7924a m135087t = C26263i.m135055u().m135087t();
            if (m135087t != null && m135087t.m40975d()) {
                ToastUtils.showMess(true, m92652XI(AbstractC8020f0.sync_delete_backup_message_password_fail));
            } else {
                ToastUtils.showMess(true, m92652XI(AbstractC8020f0.sync_delete_backup_password_success));
                mo58325kM();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle != null) {
            this.f56055P0 = bundle.getBoolean("extra_user_delete_data", false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        C21688c.m111827j().m111851x(this, "SYNC_MES");
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        bundle.putBoolean("extra_user_delete_data", this.f56055P0);
        super.mo37118SJ(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: hM */
    public void m58338hM() {
        this.f56055P0 = true;
        C26263i.m135055u().m135083o(mo58324iM());
    }

    /* renamed from: iM */
    public abstract int mo58324iM();

    /* renamed from: kM */
    public abstract void mo58325kM();

    @Override // p586vt.InterfaceC28625j
    /* renamed from: lk */
    public void mo57172lk(AbstractC28627l abstractC28627l) {
        if (!(abstractC28627l instanceof C21688c.b)) {
            C26263i.m135034d0("Job message is not a sync message");
            return;
        }
        final C21688c.b bVar = (C21688c.b) abstractC28627l;
        int i11 = bVar.f132722a;
        if (i11 < 18 && i11 >= 22) {
            return;
        }
        mo70710wy(new Runnable() { // from class: b50.v
            @Override // java.lang.Runnable
            public final void run() {
                SyncPassDeleteView.this.m58337jM(bVar);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C21688c.m111827j().m111849u(this, "SYNC_MES");
    }
}
