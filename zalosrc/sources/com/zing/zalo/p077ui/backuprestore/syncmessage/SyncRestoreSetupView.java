package com.zing.zalo.p077ui.backuprestore.syncmessage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.BackupKeyVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.passphrase.PassphraseVerificationView;
import com.zing.zalo.p077ui.backuprestore.encryption.verification.pin.PinCodeVerificationView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p320ld.AbstractC22431c;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p484ri.C25804a;
import p484ri.C25806c;
import si.C26263i;

/* loaded from: classes5.dex */
public final class SyncRestoreSetupView extends SyncRestoreBaseView implements ZaloView.InterfaceC17421f {

    /* renamed from: R0 */
    private C25806c f56013R0;

    /* renamed from: S0 */
    private C25804a f56014S0;

    /* renamed from: ck */
    private final void m58247ck() {
        Bundle bundle = new Bundle();
        bundle.putInt("extra_entry_point", m58242hM());
        bundle.putParcelable("extra_target_backup_info", m58241gM());
        bundle.putString("KEY_TRACKING_FLOW_PICK_TYPE_VERIFY", "NORMAL_RESTORE");
        C17487o0 m92662fJ = m92662fJ();
        AbstractC19074t.m100205c(m92662fJ);
        m92662fJ.m93066i2(BackupKeyVerificationView.class, bundle, 23083, 1, true);
    }

    /* renamed from: jM */
    private final void m58248jM() {
        m58249kM(null);
    }

    /* renamed from: kM */
    private final void m58249kM(Intent intent) {
        mo50035CK(0, intent);
        finish();
    }

    /* renamed from: lM */
    private final void m58250lM() {
        mo50035CK(-1, null);
        finish();
    }

    /* renamed from: mM */
    private final void m58251mM() {
        if (C26263i.m135047n0(m58242hM(), m58241gM())) {
            if (!AbstractC22431c.m115871b(m58241gM())) {
                return;
            }
            if (m58241gM().m40953i() == 1) {
                m58254pM();
                return;
            }
            if (AbstractC23306f.m120676j().m128405V()) {
                int m40953i = m58241gM().m40953i();
                if (m40953i != 2) {
                    if (m40953i == 3) {
                        m58256w2();
                        return;
                    }
                    return;
                }
                m58255qM();
                return;
            }
            m58247ck();
            return;
        }
        C22438j c22438j = C22438j.f109770a;
        TargetBackupInfo m58241gM = m58241gM();
        C25804a c25804a = this.f56014S0;
        if (c25804a == null) {
            AbstractC19074t.m100223u("mediaRepo");
            c25804a = null;
        }
        if (c22438j.m115961t(m58241gM, c25804a.m132993i())) {
            C17487o0 m92693xK = this.f72421L0.m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            C22438j.m115934H(m92693xK, m58241gM());
            return;
        }
        m58252nM();
    }

    /* renamed from: nM */
    private final void m58252nM() {
        C22447s.f109797a.m116071J0();
        C26263i.m135055u().m135085r0(m58242hM());
        if (m58242hM() == 3) {
            AbstractC23306f.m120676j().m128408Z(false);
            m58253oM();
        } else {
            m58250lM();
        }
    }

    /* renamed from: oM */
    private final void m58253oM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        C17487o0 m92662fJ = m92662fJ();
        AbstractC19074t.m100205c(m92662fJ);
        m92662fJ.m93069k2(MainTabView.class, bundle, 1, true);
    }

    /* renamed from: pM */
    private final void m58254pM() {
        C17487o0 m92693xK = this.f72421L0.m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        C22438j.m115935I(m92693xK, m58242hM(), m58241gM());
    }

    /* renamed from: qM */
    private final void m58255qM() {
        Bundle bundle = new Bundle();
        bundle.putInt("extra_entry_point", m58242hM());
        bundle.putParcelable("extra_target_backup_info", m58241gM());
        bundle.putString("KEY_TRACKING_FLOW_PIN", "NORMAL_RESTORE");
        C17487o0 m92662fJ = m92662fJ();
        AbstractC19074t.m100205c(m92662fJ);
        m92662fJ.m93066i2(PinCodeVerificationView.class, bundle, 23081, 1, true);
    }

    /* renamed from: w2 */
    private final void m58256w2() {
        Bundle bundle = new Bundle();
        bundle.putInt("extra_entry_point", m58242hM());
        bundle.putParcelable("extra_target_backup_info", m58241gM());
        bundle.putString("KEY_TRACKING_FLOW_PASSPHRASE", "NORMAL_RESTORE");
        C17487o0 m92662fJ = m92662fJ();
        AbstractC19074t.m100205c(m92662fJ);
        m92662fJ.m93066i2(PassphraseVerificationView.class, bundle, 23082, 1, true);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncmessage.SyncRestoreBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C25806c m120692n = AbstractC23306f.m120692n();
        AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
        this.f56013R0 = m120692n;
        C25804a m120688m = AbstractC23306f.m120688m();
        AbstractC19074t.m100207e(m120688m, "provideBackupRestoreMediaRepo(...)");
        this.f56014S0 = m120688m;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setClickable(true);
        linearLayout.setBackgroundColor(AbstractC23136l9.m118641B(linearLayout.getContext(), AbstractC16801x.transparent));
        return linearLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncmessage.SyncRestoreBaseView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncRestoreSetupView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        super.onActivityResult(i11, i12, intent);
        C25804a c25804a = null;
        if (i11 != 1805) {
            if (i11 != 18054) {
                switch (i11) {
                    case 23081:
                    case 23082:
                    case 23083:
                        if (i12 == -1) {
                            C26263i.m135055u().m135077j0(false);
                            C22438j c22438j = C22438j.f109770a;
                            TargetBackupInfo m58241gM = m58241gM();
                            C25804a c25804a2 = this.f56014S0;
                            if (c25804a2 == null) {
                                AbstractC19074t.m100223u("mediaRepo");
                            } else {
                                c25804a = c25804a2;
                            }
                            if (c22438j.m115961t(m58241gM, c25804a.m132993i())) {
                                C17487o0 m92693xK = this.f72421L0.m92693xK();
                                AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
                                C22438j.m115934H(m92693xK, m58241gM());
                                return;
                            }
                            m58252nM();
                            return;
                        }
                        m58248jM();
                        return;
                    default:
                        return;
                }
            }
            if (i12 == -1) {
                if (intent != null) {
                    str = intent.getStringExtra("extra_acc_local_auth");
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C25804a c25804a3 = this.f56014S0;
                    if (c25804a3 == null) {
                        AbstractC19074t.m100223u("mediaRepo");
                    } else {
                        c25804a = c25804a3;
                    }
                    AbstractC19074t.m100205c(str);
                    c25804a.m132982A(str, 3);
                }
                m58252nM();
                return;
            }
            finish();
            return;
        }
        if (i12 == -1) {
            C26263i.m135055u().m135077j0(false);
            int i13 = 1;
            if (intent != null) {
                i13 = intent.getIntExtra("extra_entry_point", 1);
            }
            if (m58242hM() == i13) {
                if (intent != null && intent.getBooleanExtra("extra_delete_data", false)) {
                    m58249kM(intent);
                    return;
                }
                C22438j c22438j2 = C22438j.f109770a;
                TargetBackupInfo m58241gM2 = m58241gM();
                C25804a c25804a4 = this.f56014S0;
                if (c25804a4 == null) {
                    AbstractC19074t.m100223u("mediaRepo");
                } else {
                    c25804a = c25804a4;
                }
                if (c22438j2.m115961t(m58241gM2, c25804a.m132993i())) {
                    C17487o0 m92693xK2 = this.f72421L0.m92693xK();
                    AbstractC19074t.m100207e(m92693xK2, "requireZaloViewManager(...)");
                    C22438j.m115934H(m92693xK2, m58241gM());
                    return;
                }
                m58252nM();
                return;
            }
            throw new RuntimeException("Entry point " + i13 + " not match with origin ep " + m58242hM());
        }
        m58248jM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m58251mM();
    }
}
