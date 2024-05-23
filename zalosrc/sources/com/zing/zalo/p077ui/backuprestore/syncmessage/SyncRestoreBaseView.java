package com.zing.zalo.p077ui.backuprestore.syncmessage;

import android.os.Bundle;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p320ld.C22447s;

/* loaded from: classes5.dex */
public class SyncRestoreBaseView extends SlidableZaloView {
    public static final C11129a Companion = new C11129a(null);

    /* renamed from: P0 */
    private int f56010P0 = 1;

    /* renamed from: Q0 */
    protected TargetBackupInfo f56011Q0;

    /* renamed from: com.zing.zalo.ui.backuprestore.syncmessage.SyncRestoreBaseView$a */
    /* loaded from: classes5.dex */
    public static final class C11129a {
        private C11129a() {
        }

        public /* synthetic */ C11129a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        Object obj;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f56010P0 = m92642L3.getInt("extra_entry_point");
            obj = m92642L3.getParcelable("extra_target_backup_info");
        } else {
            obj = null;
        }
        TargetBackupInfo targetBackupInfo = (TargetBackupInfo) obj;
        C22447s.f109797a.m116074e(targetBackupInfo, "SMLSyncRestoreBaseView");
        AbstractC19074t.m100205c(obj);
        m58243iM(targetBackupInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: gM */
    public final TargetBackupInfo m58241gM() {
        TargetBackupInfo targetBackupInfo = this.f56011Q0;
        if (targetBackupInfo != null) {
            return targetBackupInfo;
        }
        AbstractC19074t.m100223u("backupInfo");
        return null;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: hM */
    public final int m58242hM() {
        return this.f56010P0;
    }

    /* renamed from: iM */
    protected final void m58243iM(TargetBackupInfo targetBackupInfo) {
        AbstractC19074t.m100208f(targetBackupInfo, "<set-?>");
        this.f56011Q0 = targetBackupInfo;
    }
}
