package com.zing.zalo.p077ui.backuprestore.remind;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.BackupKeyVerificationView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23152n3;
import p227i3.C20218v;
import p348mi.AbstractC23306f;
import p645xh.C29628e;
import p649xl.C29754cg;
import tb0.C26626l;
import tg0.C26676b;

/* loaded from: classes5.dex */
public final class ZCloudNoBackupInfoWarningView extends SlidableZaloView implements View.OnClickListener {
    public static final C11113a Companion = new C11113a(null);

    /* renamed from: P0 */
    private C29754cg f55953P0;

    /* renamed from: Q0 */
    private TargetBackupInfo f55954Q0;

    /* renamed from: R0 */
    private boolean f55955R0;

    /* renamed from: com.zing.zalo.ui.backuprestore.remind.ZCloudNoBackupInfoWarningView$a */
    /* loaded from: classes5.dex */
    public static final class C11113a {
        private C11113a() {
        }

        public /* synthetic */ C11113a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ck */
    private final void m58039ck() {
        C29628e.m147249E0().m147293v1();
        Bundle bundle = new Bundle();
        bundle.putInt("extra_entry_point", 17);
        bundle.putParcelable("extra_target_backup_info", this.f55954Q0);
        bundle.putString("KEY_TRACKING_FLOW_PICK_TYPE_VERIFY", "EMPTY_BACKUP_INFO");
        m92693xK().m93069k2(BackupKeyVerificationView.class, bundle, 1, true);
    }

    /* renamed from: gM */
    private final void m58040gM() {
        C29754cg c29754cg = this.f55953P0;
        if (c29754cg == null) {
            AbstractC19074t.m100223u("binding");
            c29754cg = null;
        }
        c29754cg.f137454r.setOnClickListener(this);
        c29754cg.f137453q.setOnClickListener(this);
    }

    /* renamed from: hM */
    private final void m58041hM() {
        C29754cg c29754cg = null;
        if (this.f55955R0) {
            C29754cg c29754cg2 = this.f55953P0;
            if (c29754cg2 == null) {
                AbstractC19074t.m100223u("binding");
                c29754cg2 = null;
            }
            c29754cg2.f137456t.setText(m92652XI(AbstractC8020f0.str_zcloud_remind_save_conversation_data_title));
            C29754cg c29754cg3 = this.f55953P0;
            if (c29754cg3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29754cg = c29754cg3;
            }
            c29754cg.f137453q.setText(m92652XI(AbstractC8020f0.str_button_confirm_no));
            return;
        }
        C29754cg c29754cg4 = this.f55953P0;
        if (c29754cg4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29754cg = c29754cg4;
        }
        c29754cg.f137453q.setText(m92652XI(AbstractC8020f0.str_zcloud_connect_to_zcloud));
    }

    /* renamed from: iM */
    private final void m58042iM() {
        AbstractC23152n3.m119050j0(m92689tK(), AbstractC23306f.m120583H().m110204g().m116310b());
    }

    /* renamed from: jM */
    private final void m58043jM() {
        C29628e.m147249E0().m147293v1();
        m58046lM();
        C26626l.m136689z(C26626l.Companion.m136712a(), false, false, 3, null);
    }

    /* renamed from: kM */
    private final void m58044kM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            TargetBackupInfo targetBackupInfo = (TargetBackupInfo) m92642L3.getParcelable("EXTRA_BACKUP_INFO");
            this.f55954Q0 = targetBackupInfo;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("parseViewArgs(): backupInfo=");
            sb2.append(targetBackupInfo);
        }
    }

    /* renamed from: kx */
    private final void m58045kx() {
        m58039ck();
    }

    /* renamed from: lM */
    private final void m58046lM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        boolean z11 = false;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("ARG_NEW_DEVICE_ONBOARDING_SETUP", false);
        }
        this.f55955R0 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29754cg m147827c = C29754cg.m147827c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147827c, "inflate(...)");
        this.f55953P0 = m147827c;
        if (m147827c == null) {
            AbstractC19074t.m100223u("binding");
            m147827c = null;
        }
        RelativeLayout root = m147827c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m58041hM();
        m58040gM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return this.f55955R0 ? "ZCloudUndoneSetupWarning" : "ZCloudNoBackupInfoWarning";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        C26676b.f126324a.m136994g0(this.f55955R0, view.getId());
        int id2 = view.getId();
        C29754cg c29754cg = this.f55953P0;
        C29754cg c29754cg2 = null;
        if (c29754cg == null) {
            AbstractC19074t.m100223u("binding");
            c29754cg = null;
        }
        if (id2 == c29754cg.f137453q.getId()) {
            if (this.f55955R0) {
                m58043jM();
                return;
            } else {
                m58045kx();
                return;
            }
        }
        C29754cg c29754cg3 = this.f55953P0;
        if (c29754cg3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29754cg2 = c29754cg3;
        }
        if (id2 == c29754cg2.f137454r.getId()) {
            m58042iM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m58044kM();
    }
}
