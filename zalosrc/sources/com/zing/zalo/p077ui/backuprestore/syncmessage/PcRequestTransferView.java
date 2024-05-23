package com.zing.zalo.p077ui.backuprestore.syncmessage;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.backuprestore.syncmessage.PcRequestTransferView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import f40.C18719a;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p542ub.InterfaceC27218a;
import si.C26263i;

/* loaded from: classes5.dex */
public class PcRequestTransferView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    C8009j f56002M0;

    /* renamed from: N0 */
    private RobotoTextView f56003N0;

    /* renamed from: O0 */
    private RobotoTextView f56004O0;

    /* renamed from: P0 */
    private RobotoTextView f56005P0;

    /* renamed from: Q0 */
    private String f56006Q0;

    /* renamed from: R0 */
    private String f56007R0;

    /* renamed from: S0 */
    private long f56008S0;

    /* renamed from: T0 */
    private long f56009T0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public /* synthetic */ void m58238gM(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            this.f56002M0.dismiss();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public /* synthetic */ void m58239hM() {
        C26263i.m135055u().m135067D(1, this.f56007R0, this.f56006Q0);
        AbstractC23306f.m120585H1().m16681G(CoreUtility.f89233i, this.f56006Q0, this.f56007R0, this.f56008S0, this.f56009T0);
        C18719a.m98717j("1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static /* synthetic */ void m58240iM() {
        AbstractC23309i.m121464To();
        AbstractC23309i.m122209nh("");
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (m92642L3() != null) {
            this.f56006Q0 = m92642L3().getString("extra_pc_name");
            this.f56007R0 = m92642L3().getString("extra_public_key");
            this.f56008S0 = m92642L3().getLong("extra_from_seqid");
            this.f56009T0 = m92642L3().getLong("extra_min_seqid");
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: a50.h
            @Override // java.lang.Runnable
            public final void run() {
                PcRequestTransferView.m58240iM();
            }
        });
        C18719a.m98718k();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.pc_request_sync_view, viewGroup, false);
        inflate.setOnClickListener(this);
        this.f56004O0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btnSkip);
        this.f56003N0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btnSync);
        this.f56005P0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.des);
        this.f56003N0.setOnClickListener(this);
        this.f56004O0.setOnClickListener(this);
        this.f56005P0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_pc_request_sycn_des).replace("#devicename", this.f56006Q0));
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.transfer_message_btn_not_sync);
        SpannableString spannableString = new SpannableString(m118743r0);
        spannableString.setSpan(new UnderlineSpan(), 0, m118743r0.length(), 0);
        this.f56004O0.setText(spannableString);
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f56002M0;
        if (c8009j != null && c8009j.m92868m()) {
            try {
                this.f56002M0.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (m92662fJ().m93018M0() != 1) {
            super.finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92662fJ().m93069k2(MainTabView.class, bundle, 1, true);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PcRequestTransferView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnSkip) {
            C26263i.m135055u().m135067D(0, this.f56007R0, this.f56006Q0);
            C18719a.m98717j("2");
            finish();
            return;
        }
        if (id2 == AbstractC6918a0.btnSync) {
            if (C26263i.m135055u().m135071M()) {
                C26263i.m135055u().m135067D(2, this.f56007R0, this.f56006Q0);
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43171t(AbstractC8020f0.alert_title).m43161j(AbstractC8020f0.transfer_when_sync_error).m43155d(false).m43169r(AbstractC8020f0.str_close, new InterfaceC17463d.d() { // from class: a50.i
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        PcRequestTransferView.this.m58238gM(interfaceC17463d, i11);
                    }
                });
                C8009j m43152a = aVar.m43152a();
                this.f56002M0 = m43152a;
                m43152a.mo13822K();
                C18719a.m98717j("4");
                return;
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: a50.j
                @Override // java.lang.Runnable
                public final void run() {
                    PcRequestTransferView.this.m58239hM();
                }
            });
            finish();
            return;
        }
        if (id2 == AbstractC6918a0.fake_popup) {
            AbstractC20110a.m104535d("What ?", new Object[0]);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            C26263i.m135055u().m135067D(0, this.f56007R0, this.f56006Q0);
            C18719a.m98717j("2");
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) m92676n2.getContext().getSystemService("input_method");
                if (m92676n2.getCurrentFocus() != null) {
                    inputMethodManager.hideSoftInputFromWindow(m92676n2.getCurrentFocus().getWindowToken(), 0);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
