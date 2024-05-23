package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.dialog.ConfirmDialogView;
import com.zing.zalo.p077ui.zviews.RequestLocationView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import me0.AbstractC23136l9;
import vg.AbstractC28248z6;
import vg.C28239y6;

/* loaded from: classes6.dex */
public class RequestLocationView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: M0 */
    String f77068M0;

    /* renamed from: N0 */
    boolean f77069N0;

    /* renamed from: O0 */
    boolean f77070O0 = false;

    /* renamed from: P0 */
    TextView f77071P0;

    /* renamed from: Q0 */
    ConfirmDialogView f77072Q0;

    /* renamed from: R0 */
    InterfaceC14962b f77073R0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RequestLocationView$a */
    /* loaded from: classes6.dex */
    public class C14961a extends AbstractC28248z6.f {
        C14961a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m83773c(Location location) {
            int i11;
            try {
                RequestLocationView requestLocationView = RequestLocationView.this;
                if (location == null) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                requestLocationView.m83768fM(i11, location);
                RequestLocationView.this.f77069N0 = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(final Location location, int i11) {
            RequestLocationView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ld0
                @Override // java.lang.Runnable
                public final void run() {
                    RequestLocationView.C14961a.this.m83773c(location);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RequestLocationView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC14962b {
        /* renamed from: AB */
        void mo59561AB(RequestLocationView requestLocationView, int i11, Location location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public /* synthetic */ void m83765hM(InterfaceC17463d interfaceC17463d, int i11) {
        if (i11 != -2) {
            if (i11 == -1) {
                try {
                    interfaceC17463d.dismiss();
                    this.f72421L0.m92641HK(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            return;
        }
        try {
            interfaceC17463d.dismiss();
            m83768fM(1, null);
        } catch (Exception e12) {
            e12.printStackTrace();
            m83768fM(-1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public /* synthetic */ void m83766iM(InterfaceC17463d interfaceC17463d) {
        try {
            interfaceC17463d.dismiss();
            m83768fM(1, null);
        } catch (Exception e11) {
            e11.printStackTrace();
            m83768fM(-1, null);
        }
    }

    /* renamed from: jM */
    public static RequestLocationView m83767jM(String str) {
        RequestLocationView requestLocationView = new RequestLocationView();
        Bundle bundle = new Bundle();
        if (str == null) {
            str = "";
        }
        bundle.putString("params", str);
        requestLocationView.mo60305zK(bundle);
        return requestLocationView;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("params")) {
            this.f77068M0 = m92642L3.getString("params");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.request_location_fragment_layout, (ViewGroup) null);
        inflate.setOnClickListener(AbstractC23136l9.f112240a);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_request_location);
        this.f77071P0 = textView;
        textView.setText(AbstractC8020f0.str_find_location);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        try {
            this.f77073R0 = null;
            ConfirmDialogView confirmDialogView = this.f77072Q0;
            if (confirmDialogView != null) {
                confirmDialogView.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fM */
    void m83768fM(int i11, Location location) {
        InterfaceC14962b interfaceC14962b = this.f77073R0;
        if (interfaceC14962b != null && !this.f77070O0) {
            this.f77070O0 = true;
            interfaceC14962b.mo59561AB(this, i11, location);
        }
    }

    /* renamed from: gM */
    public String m83769gM() {
        return this.f77068M0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "RequestLocationView";
    }

    /* renamed from: kM */
    void m83770kM() {
        try {
            if (this.f77069N0) {
                return;
            }
            ConfirmDialogView confirmDialogView = this.f77072Q0;
            if (confirmDialogView != null && confirmDialogView.m92674mJ() && this.f77072Q0.m92687sJ()) {
                return;
            }
            C14961a c14961a = new C14961a();
            C28239y6 c28239y6 = new C28239y6();
            this.f77069N0 = true;
            if (!c28239y6.m142225f(this.f72421L0.m92648SI(), c14961a, new SensitiveData("action_menu_send_location", "action_menu"))) {
                m83771lM();
                this.f77069N0 = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f77069N0 = false;
            m83768fM(-1, null);
        }
    }

    /* renamed from: lM */
    void m83771lM() {
        try {
            ConfirmDialogView confirmDialogView = new ConfirmDialogView();
            this.f77072Q0 = confirmDialogView;
            confirmDialogView.mo43041MK(false);
            this.f77072Q0.m42853aL(AbstractC8020f0.str_titleDlg2);
            this.f77072Q0.m42849WK(AbstractC8020f0.GPS_Enable_Message);
            InterfaceC17463d.d dVar = new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.jd0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    RequestLocationView.this.m83765hM(interfaceC17463d, i11);
                }
            };
            this.f77072Q0.m42852ZK(AbstractC8020f0.str_yes, dVar);
            this.f77072Q0.m42851YK(AbstractC8020f0.str_no, dVar);
            this.f77072Q0.m92597OK(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.kd0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    RequestLocationView.this.m83766iM(interfaceC17463d);
                }
            });
            this.f77072Q0.m92602UK(this.f72421L0.m92649TI(), "request_location_dialog_enable_gps");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m83770kM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (this.f72421L0.m92650VI() != null && (this.f72421L0.m92650VI() instanceof InterfaceC14962b)) {
            this.f77073R0 = (InterfaceC14962b) this.f72421L0.m92650VI();
        }
    }
}
