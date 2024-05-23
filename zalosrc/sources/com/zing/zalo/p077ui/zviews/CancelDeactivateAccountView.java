package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.CircleCountDownView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.CancelDeactivateAccountView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import nh0.C23793c;
import o70.C24099q0;
import org.json.JSONObject;
import p361nb.AbstractC23647d;
import v50.C27870vb;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class CancelDeactivateAccountView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, CircleCountDownView.InterfaceC13483b, InterfaceC0733x {

    /* renamed from: P0 */
    String f72554P0;

    /* renamed from: Q0 */
    long f72555Q0;

    /* renamed from: R0 */
    long f72556R0;

    /* renamed from: S0 */
    long f72557S0;

    /* renamed from: U0 */
    long f72559U0;

    /* renamed from: V0 */
    CircleCountDownView f72560V0;

    /* renamed from: W0 */
    RobotoTextView f72561W0;

    /* renamed from: T0 */
    boolean f72558T0 = false;

    /* renamed from: X0 */
    int f72562X0 = 0;

    /* renamed from: com.zing.zalo.ui.zviews.CancelDeactivateAccountView$a */
    /* loaded from: classes6.dex */
    class C14130a extends ZdsActionBar.AbstractC16987c {
        C14130a() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            super.mo39913a();
            AbstractC23647d.m123897g("36023");
            CancelDeactivateAccountView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.CancelDeactivateAccountView$b */
    /* loaded from: classes6.dex */
    public class C14131b implements InterfaceC20094a {
        C14131b() {
        }

        /* renamed from: d */
        public /* synthetic */ void m78648d(String str) {
            try {
                if (!CancelDeactivateAccountView.this.f72421L0.m92677nJ() && !CancelDeactivateAccountView.this.f72421L0.m92681pJ()) {
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                    if (m141809c == null) {
                        m141809c = new ContactProfile(str);
                    }
                    Bundle m140776b = new C27870vb(m141809c.mo2478b()).m140780g(m141809c).m140776b();
                    Intent intent = new Intent();
                    intent.putExtras(m140776b);
                    intent.putExtra("SHOW_WITH_FLAGS", 7340032);
                    CancelDeactivateAccountView.this.f72421L0.m92676n2().mo35579p().m93069k2(ChatView.class, intent.getExtras(), 1, true);
                    CancelDeactivateAccountView.this.m78646kM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                CancelDeactivateAccountView cancelDeactivateAccountView = CancelDeactivateAccountView.this;
                cancelDeactivateAccountView.f72558T0 = false;
                cancelDeactivateAccountView.f72421L0.mo49315c4();
                if (!CancelDeactivateAccountView.this.f72421L0.m92677nJ() && !CancelDeactivateAccountView.this.f72421L0.m92681pJ()) {
                    ToastUtils.m89265m(c20096c);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                CancelDeactivateAccountView cancelDeactivateAccountView = CancelDeactivateAccountView.this;
                cancelDeactivateAccountView.f72558T0 = false;
                cancelDeactivateAccountView.f72421L0.mo49315c4();
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel_deactivation_success));
                String str = "68386082";
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                        String optString = optJSONObject.optString("oaId");
                        if (!TextUtils.isEmpty(optString)) {
                            str = optString;
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                if (CancelDeactivateAccountView.this.f72421L0.m92676n2() != null) {
                    CancelDeactivateAccountView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.g4

                        /* renamed from: q */
                        public final /* synthetic */ String f80430q;

                        public /* synthetic */ RunnableC15649g4(String str2) {
                            r2 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            CancelDeactivateAccountView.C14131b.this.m78648d(r2);
                        }
                    });
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: hM */
    private void m78643hM() {
        if (this.f72558T0) {
            return;
        }
        try {
            this.f72421L0.mo49282B8(null, false);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14131b());
            this.f72558T0 = true;
            c0766k.mo1495N9(this.f72562X0);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f72558T0 = false;
        }
    }

    /* renamed from: iM */
    private long m78644iM() {
        long j11 = this.f72555Q0;
        long j12 = this.f72557S0;
        if (j12 <= 0) {
            j12 = C23793c.m124316k().mo124311f();
        }
        long j13 = j11 - j12;
        if (j13 <= 0) {
            return 0L;
        }
        return j13;
    }

    /* renamed from: jM */
    private void m78645jM(View view) {
        String format;
        try {
            RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.cancel_deactivate_account);
            this.f72561W0 = robotoTextView;
            robotoTextView.setOnClickListener(this);
            RobotoTextView robotoTextView2 = (RobotoTextView) view.findViewById(AbstractC6918a0.deactivate_account_msg);
            if (!TextUtils.isEmpty(this.f72554P0)) {
                robotoTextView2.setText(Html.fromHtml(this.f72554P0));
            } else {
                int ceil = (int) Math.ceil(((float) m78644iM()) / 3600000.0f);
                if (ceil > 0) {
                    format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel_deactivate_acc_msg), AbstractC23160o0.m119205M(this.f72556R0), Integer.valueOf(ceil));
                } else {
                    format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel_deactivate_acc_msg_under_one), AbstractC23160o0.m119205M(this.f72556R0));
                }
                robotoTextView2.setText(format);
            }
            CircleCountDownView circleCountDownView = (CircleCountDownView) view.findViewById(AbstractC6918a0.circle_countdown_view);
            this.f72560V0 = circleCountDownView;
            circleCountDownView.setContentTitle(this.f72421L0.m92652XI(AbstractC8020f0.remaining));
            this.f72560V0.m75634c0(this.f72555Q0 - this.f72556R0, m78644iM());
            this.f72560V0.setCircleCountDownListener(this);
            this.f72560V0.m75635d0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kM */
    public void m78646kM() {
        if (MainTabView.m67645lM() != null) {
            MainTabView.m67645lM().m67674JN(C24099q0.m125958k().m125971o());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("EXTRA_DEACTIVATE_MESSAGE")) {
                this.f72554P0 = m92642L3.getString("EXTRA_DEACTIVATE_MESSAGE");
            }
            if (m92642L3.containsKey("EXTRA_DEACTIVATE_ACCOUNT_DATETIME")) {
                this.f72555Q0 = m92642L3.getLong("EXTRA_DEACTIVATE_ACCOUNT_DATETIME");
            }
            if (m92642L3.containsKey("EXTRA_DEACTIVATE_ACCOUNT_CONFIRMTIME")) {
                this.f72556R0 = m92642L3.getLong("EXTRA_DEACTIVATE_ACCOUNT_CONFIRMTIME");
            }
            if (m92642L3.containsKey("EXTRA_DEACTIVATE_ACCOUNT_CURRENT_TIME")) {
                this.f72557S0 = m92642L3.getLong("EXTRA_DEACTIVATE_ACCOUNT_CURRENT_TIME");
            }
            if (m92642L3.containsKey("EXTRA_DEACTIVATE_ACCOUNT_CURRENT_TIME_CLIENT")) {
                long j11 = m92642L3.getLong("EXTRA_DEACTIVATE_ACCOUNT_CURRENT_TIME_CLIENT");
                this.f72559U0 = j11;
                if (j11 > 0) {
                    long uptimeMillis = SystemClock.uptimeMillis() - this.f72559U0;
                    if (uptimeMillis > 0 && uptimeMillis <= this.f72555Q0 - this.f72556R0) {
                        this.f72557S0 += uptimeMillis;
                    }
                }
            }
            if (m92642L3.containsKey("source_action_cancel_deactivate")) {
                this.f72562X0 = m92642L3.getInt("source_action_cancel_deactivate");
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(3).m43162k(this.f72421L0.m92652XI(AbstractC8020f0.confirm_cancel_deactivate_account)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.close), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm), this);
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.cancel_deactivate_account_view, viewGroup, false);
        m78645jM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        try {
            CircleCountDownView circleCountDownView = this.f72560V0;
            if (circleCountDownView != null) {
                circleCountDownView.m75636f0();
            }
            this.f72421L0.mo49315c4();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        int i12;
        if (interfaceC17463d != null) {
            i12 = interfaceC17463d.mo92862f();
        } else {
            i12 = 0;
        }
        if (-1 == i11) {
            if (i12 == 1) {
                if (interfaceC17463d != null) {
                    interfaceC17463d.dismiss();
                }
                AbstractC23647d.m123897g("36021");
                m78643hM();
                return;
            }
            return;
        }
        if (-2 == i11 && i12 == 1) {
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            AbstractC23647d.m123897g("36022");
        }
    }

    @Override // com.zing.zalo.p077ui.widget.CircleCountDownView.InterfaceC13483b
    /* renamed from: Ml */
    public void mo75637Ml() {
        CircleCountDownView circleCountDownView;
        try {
            if (this.f72421L0.m92674mJ() && !this.f72421L0.m92681pJ() && (circleCountDownView = this.f72560V0) != null && !circleCountDownView.m75633a0()) {
                this.f72561W0.setEnabled(false);
                this.f72561W0.setText(AbstractC8020f0.acccount_has_been_deactivated);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.account_is_waiting_deleted));
                m87077NK.setLeadingFunctionCallback(new C14130a());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CancelDeactivateAccountView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.cancel_deactivate_account) {
            AbstractC23647d.m123897g("36024");
            this.f72421L0.showDialog(1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("36023");
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
