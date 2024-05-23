package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p297kd.C21690e;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import si.C26263i;

/* loaded from: classes6.dex */
public class PcSyncRequestView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    private RobotoTextView f75842M0;

    /* renamed from: N0 */
    private RobotoTextView f75843N0;

    /* renamed from: O0 */
    private RobotoTextView f75844O0;

    /* renamed from: P0 */
    String f75845P0;

    /* renamed from: Q0 */
    String f75846Q0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eM */
    public static /* synthetic */ void m82531eM() {
        AbstractC23309i.m121464To();
        AbstractC23309i.m122209nh("");
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (m92642L3() != null) {
            this.f75845P0 = m92642L3().getString("extra_req_sync_from_pc_name");
            this.f75846Q0 = m92642L3().getString("extra_req_sync_from_pc_session");
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.a40
            @Override // java.lang.Runnable
            public final void run() {
                PcSyncRequestView.m82531eM();
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.pc_request_sync_view, viewGroup, false);
        inflate.setOnClickListener(this);
        this.f75843N0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btnSkip);
        this.f75842M0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btnSync);
        this.f75844O0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.des);
        this.f75842M0.setOnClickListener(this);
        this.f75843N0.setOnClickListener(this);
        this.f75844O0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pc_request_sycn_des).replace("#devicename", this.f75845P0));
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pc_request_sycn_skip);
        SpannableString spannableString = new SpannableString(m118743r0);
        spannableString.setSpan(new UnderlineSpan(), 0, m118743r0.length(), 0);
        this.f75843N0.setText(spannableString);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (this.f72421L0.m92662fJ() != null) {
            try {
                if (m92662fJ().m93018M0() > 1) {
                    super.finish();
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                    m92662fJ().m93069k2(MainTabView.class, bundle, 1, true);
                }
                return;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PcSyncRequestView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1805 && i12 == -1) {
            if (intent == null || !intent.getBooleanExtra("extra_delete_data", false)) {
                C26263i.m135055u().m135085r0(5);
            }
            finish();
            return;
        }
        if (i11 == 18053) {
            finish();
            C22447s.m116063w0(this.f72421L0.m92662fJ());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        boolean z11 = false;
        if (id2 == AbstractC6918a0.btnSkip) {
            C26263i.m135055u().m135065C("com.zing.zalo.intent.action.NOTIFICATION_PC_REQUEST_SYNC_DISMISS", this.f75845P0, this.f75846Q0, false);
            finish();
            return;
        }
        if (id2 == AbstractC6918a0.btnSync) {
            C26263i.m135055u().m135065C("com.zing.zalo.intent.action.NOTIFICATION_PC_REQUEST_SYNC_ACCEPT", this.f75845P0, this.f75846Q0, false);
            TargetBackupInfo m135058w = C26263i.m135058w();
            if (m135058w != null && C26263i.m135047n0(5, m135058w)) {
                C22438j.m115935I(this.f72421L0.m92662fJ(), 5, m135058w);
                return;
            }
            C21690e m133053o = AbstractC23306f.m120692n().m133053o();
            if (m133053o != null && !m133053o.m143172f()) {
                z11 = true;
            }
            if (z11 && C26263i.m135015H(m133053o.f105269f)) {
                C26263i.m135055u().m135085r0(m133053o.f105269f);
                return;
            } else if (!z11 && C26263i.m135011D0(5, m135058w)) {
                C22438j.m115931E(this.f72421L0.m92662fJ(), 5, true);
                return;
            } else {
                C26263i.m135055u().m135085r0(5);
                finish();
                return;
            }
        }
        if (id2 == AbstractC6918a0.fake_popup) {
            AbstractC20110a.m104535d("What ?", new Object[0]);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            C26263i.m135055u().m135065C("com.zing.zalo.intent.action.NOTIFICATION_PC_REQUEST_SYNC_DISMISS", this.f75845P0, this.f75846Q0, false);
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
