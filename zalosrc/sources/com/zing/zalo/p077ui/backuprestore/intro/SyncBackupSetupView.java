package com.zing.zalo.p077ui.backuprestore.intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p320ld.C22438j;
import p320ld.C22447s;

/* loaded from: classes5.dex */
public final class SyncBackupSetupView extends BaseZaloView implements ZaloView.InterfaceC17421f {

    /* renamed from: M0 */
    private int f55943M0 = 1;

    /* renamed from: N0 */
    private TargetBackupInfo f55944N0;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x000e, B:8:0x0030, B:13:0x0042, B:17:0x0054, B:20:0x0065, B:22:0x0017, B:24:0x001f), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x000e, B:8:0x0030, B:13:0x0042, B:17:0x0054, B:20:0x0065, B:22:0x0017, B:24:0x001f), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x000e, B:8:0x0030, B:13:0x0042, B:17:0x0054, B:20:0x0065, B:22:0x0017, B:24:0x001f), top: B:1:0x0000 }] */
    /* renamed from: dM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m57999dM(boolean z11, boolean z12, boolean z13) {
        try {
            C17487o0 mo35579p = m92692wK().mo35579p();
            if (!AbstractC3489d.m17501i()) {
                if (AbstractC3489d.m17512t()) {
                }
                if (z11) {
                    C22438j c22438j = C22438j.f109770a;
                    AbstractC19074t.m100205c(mo35579p);
                    if (c22438j.m115959e(mo35579p, this.f55943M0, this.f55944N0)) {
                        return;
                    }
                }
                if (z12) {
                    C22438j c22438j2 = C22438j.f109770a;
                    AbstractC19074t.m100205c(mo35579p);
                    if (c22438j2.m115958d(mo35579p, this.f55943M0, this.f55944N0)) {
                        return;
                    }
                }
                if (z13) {
                    C22438j c22438j3 = C22438j.f109770a;
                    AbstractC19074t.m100205c(mo35579p);
                    if (c22438j3.m115957b(mo35579p, this.f55943M0, this.f55944N0, false)) {
                        return;
                    }
                }
                m58003hM(null);
            }
            if (C22447s.f109797a.m116077t0()) {
                AbstractC19074t.m100205c(mo35579p);
                C22438j.m115932F(mo35579p, this.f55943M0, this.f55944N0, AbstractC3489d.m17512t());
                return;
            }
            if (z11) {
            }
            if (z12) {
            }
            if (z13) {
            }
            m58003hM(null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: eM */
    static /* synthetic */ void m58000eM(SyncBackupSetupView syncBackupSetupView, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            z13 = false;
        }
        syncBackupSetupView.m57999dM(z11, z12, z13);
    }

    /* renamed from: fM */
    private final void m58001fM() {
        m58002gM(null);
    }

    /* renamed from: gM */
    private final void m58002gM(Intent intent) {
        mo50035CK(0, intent);
        finish();
    }

    /* renamed from: hM */
    private final void m58003hM(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("extra_entry_point", this.f55943M0);
        mo50035CK(-1, intent);
        finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f55943M0 = m92642L3.getInt("extra_entry_point", this.f55943M0);
            this.f55944N0 = (TargetBackupInfo) m92642L3.getParcelable("extra_target_backup_info");
        }
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

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncBackupSetupView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 != 1805) {
            if (i11 != 18053) {
                if (i11 == 18055) {
                    if (i12 == -1) {
                        m58003hM(intent);
                        return;
                    } else {
                        m58001fM();
                        return;
                    }
                }
                return;
            }
            if (i12 == -1) {
                m58003hM(intent);
                return;
            } else {
                m58001fM();
                return;
            }
        }
        if (i12 == -1) {
            if (intent != null && intent.getBooleanExtra("extra_delete_data", false)) {
                m58002gM(intent);
                return;
            } else {
                m58000eM(this, false, true, true, 1, null);
                return;
            }
        }
        m58001fM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m57999dM(true, true, true);
    }
}
