package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.DeactivateAccountIntroView;
import com.zing.zalo.utils.ToastUtils;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23216t1;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class DeactivateAccountIntroView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    final Object f73064M0 = new Object();

    /* renamed from: N0 */
    boolean f73065N0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountIntroView$a */
    /* loaded from: classes6.dex */
    public class C14205a implements InterfaceC20094a {
        C14205a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m79195e(boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            try {
                if (!DeactivateAccountIntroView.this.f72421L0.m92677nJ() && !DeactivateAccountIntroView.this.f72421L0.m92681pJ()) {
                    if (z11) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_unmap_profile", z12);
                        bundle.putBoolean("is_bypass_password", z13);
                        bundle.putInt("source_type_change_phone", 4);
                        if (DeactivateAccountIntroView.this.f72421L0.m92650VI() != null) {
                            DeactivateAccountIntroView.this.f72421L0.m92650VI().m92662fJ().m93069k2(ChangePhoneNumberView.class, bundle, 1, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (jSONArray != null) {
                        bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                    }
                    if (DeactivateAccountIntroView.this.f72421L0.m92650VI() != null) {
                        DeactivateAccountIntroView.this.f72421L0.m92650VI().m92662fJ().m93069k2(NotChangePhoneNumberView.class, bundle2, 1, true);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m79196f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                synchronized (DeactivateAccountIntroView.this.f73064M0) {
                    DeactivateAccountIntroView deactivateAccountIntroView = DeactivateAccountIntroView.this;
                    deactivateAccountIntroView.f73065N0 = false;
                    deactivateAccountIntroView.f72421L0.mo49315c4();
                }
                if (DeactivateAccountIntroView.this.f72421L0.m92677nJ() || DeactivateAccountIntroView.this.f72421L0.m92681pJ() || AbstractC23216t1.m119643h(DeactivateAccountIntroView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.oa
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        DeactivateAccountIntroView.C14205a.m79196f(str);
                    }
                })) {
                    return;
                }
                ToastUtils.m89263k(c20096c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final boolean z11;
            final boolean z12;
            final boolean z13;
            try {
                synchronized (DeactivateAccountIntroView.this.f73064M0) {
                    DeactivateAccountIntroView deactivateAccountIntroView = DeactivateAccountIntroView.this;
                    deactivateAccountIntroView.f73065N0 = false;
                    deactivateAccountIntroView.f72421L0.mo49315c4();
                }
                if (obj != null) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObject.optInt("error_code", -999) == 0 && optJSONObject != null) {
                        boolean optBoolean = optJSONObject.optBoolean("isset_pwd");
                        AbstractC23304d.f113346X0 = optBoolean ? 1 : 0;
                        AbstractC23309i.m122550wp(optBoolean ? 1 : 0);
                        if (optJSONObject.optInt("allow_change_phonenumber", 0) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (optJSONObject.optInt("unmap_profile", 0) == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (optJSONObject.optInt("bypass_verify_pwd", 0) == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        final JSONArray optJSONArray = optJSONObject.optJSONArray("valid_error");
                        if (DeactivateAccountIntroView.this.f72421L0.m92676n2() != null) {
                            DeactivateAccountIntroView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.na
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DeactivateAccountIntroView.C14205a.this.m79195e(z11, z12, z13, optJSONArray);
                                }
                            });
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC7409c0.deactivate_intro_view, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        view.findViewById(AbstractC6918a0.btn_delete_account_action).setOnClickListener(this);
        view.findViewById(AbstractC6918a0.btn_change_phone_action).setOnClickListener(this);
    }

    /* renamed from: a7 */
    void m79192a7() {
        try {
            synchronized (this.f73064M0) {
                try {
                    if (this.f73065N0) {
                        this.f72421L0.mo46829Y();
                        return;
                    }
                    synchronized (this.f73064M0) {
                        this.f73065N0 = true;
                        this.f72421L0.mo46829Y();
                    }
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14205a());
                    c0766k.mo1743t7(4);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DeactivateAccountIntroView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_delete_account_action) {
            if (this.f72421L0.m92650VI() != null) {
                this.f72421L0.m92650VI().m92649TI().m93062f2(AbstractC6918a0.deactivate_container, DeactivateAccountPhoneView.class, null, 1, true);
            }
            AbstractC23647d.m123897g("37170");
        } else if (id2 == AbstractC6918a0.btn_change_phone_action) {
            m79192a7();
            AbstractC23647d.m123897g("37171");
        }
    }
}
