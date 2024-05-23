package com.zing.zalo.register;

import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.register.ResumeRegisterView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23153n4;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p140ev.C18613b;
import p348mi.AbstractC23309i;
import p649xl.C30069ua;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class ResumeRegisterView extends BaseZaloView {

    /* renamed from: M0 */
    private C30069ua f49304M0;

    /* renamed from: N0 */
    private String f49305N0 = "";

    /* renamed from: fM */
    private final String m49861fM(String str) {
        boolean m127126v;
        String m119145q = AbstractC23153n4.m119145q(str);
        String m118283i = AbstractC23056e6.m118283i(m119145q, AbstractC23309i.m121704a5(), true, 4);
        if (!TextUtils.isEmpty(m118283i)) {
            m127126v = AbstractC24341v.m127126v(m118283i, AbstractC23056e6.f112062a, true);
            if (!m127126v) {
                m119145q = m118283i;
            }
        }
        AbstractC19074t.m100205c(m119145q);
        return m119145q;
    }

    /* renamed from: gM */
    private final void m49862gM() {
        int m127173b0;
        C30069ua c30069ua = this.f49304M0;
        C30069ua c30069ua2 = null;
        if (c30069ua == null) {
            AbstractC19074t.m100223u("binding");
            c30069ua = null;
        }
        FrameLayout root = c30069ua.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        C30069ua c30069ua3 = this.f49304M0;
        if (c30069ua3 == null) {
            AbstractC19074t.m100223u("binding");
            c30069ua3 = null;
        }
        Avatar avatar = c30069ua3.f139575q;
        Context context = avatar.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        avatar.m90481x(context, EnumC16949e.SIZE_128);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        avatar.setImageDrawable(C27280g.m139658a(m92689tK, AbstractC23322a.zds_il_user_arrow_right_spot_1_1));
        C30069ua c30069ua4 = this.f49304M0;
        if (c30069ua4 == null) {
            AbstractC19074t.m100223u("binding");
            c30069ua4 = null;
        }
        c30069ua4.f139579u.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_resume_title, m49861fM(this.f49305N0)));
        C30069ua c30069ua5 = this.f49304M0;
        if (c30069ua5 == null) {
            AbstractC19074t.m100223u("binding");
            c30069ua5 = null;
        }
        RobotoTextView robotoTextView = c30069ua5.f139580v;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_continue);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        SpannableString spannableString = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_resume_description, m118743r0));
        m127173b0 = AbstractC24342w.m127173b0(spannableString, m118743r0, 0, false, 6, null);
        spannableString.setSpan(new StyleSpan(1), m127173b0, m118743r0.length() + m127173b0, 33);
        robotoTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
        C30069ua c30069ua6 = this.f49304M0;
        if (c30069ua6 == null) {
            AbstractC19074t.m100223u("binding");
            c30069ua6 = null;
        }
        c30069ua6.f139576r.setOnClickListener(new View.OnClickListener() { // from class: cz.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResumeRegisterView.m49863hM(ResumeRegisterView.this, view);
            }
        });
        C30069ua c30069ua7 = this.f49304M0;
        if (c30069ua7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30069ua2 = c30069ua7;
        }
        c30069ua2.f139577s.setOnClickListener(new View.OnClickListener() { // from class: cz.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResumeRegisterView.m49864iM(ResumeRegisterView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public static final void m49863hM(ResumeRegisterView resumeRegisterView, View view) {
        AbstractC19074t.m100208f(resumeRegisterView, "this$0");
        AbstractC0924m0.m2972Cm(0);
        AbstractC0924m0.m3691bf("");
        resumeRegisterView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final void m49864iM(ResumeRegisterView resumeRegisterView, View view) {
        AbstractC19074t.m100208f(resumeRegisterView, "this$0");
        if (resumeRegisterView.m49865jM()) {
            resumeRegisterView.finish();
        }
    }

    /* renamed from: jM */
    private final boolean m49865jM() {
        try {
            int m3331P4 = AbstractC0924m0.m3331P4();
            if (m3331P4 > 0) {
                String m4066o0 = AbstractC0924m0.m4066o0();
                AbstractC19074t.m100205c(m4066o0);
                if (m4066o0.length() > 0) {
                    JSONObject jSONObject = new JSONObject(m4066o0);
                    if (m3331P4 != 1) {
                        if (m3331P4 != 2) {
                            if (m3331P4 != 3) {
                                if (m3331P4 == 4 || m3331P4 == 5) {
                                    String optString = jSONObject.optString("token_name", "");
                                    String optString2 = jSONObject.optString("phone_number", "");
                                    int optInt = jSONObject.optInt("exist_account");
                                    String optString3 = jSONObject.optString("display_name", "");
                                    String optString4 = jSONObject.optString("ekyc_info");
                                    String optString5 = jSONObject.optString("ekyc_token");
                                    Bundle bundle = new Bundle();
                                    bundle.putString("EXTRA_PHONE_NUMBER", optString2);
                                    bundle.putString("EXTRA_SESSION_TOKEN", optString);
                                    bundle.putInt("EXTRA_RENEW_ACCOUNT", optInt);
                                    bundle.putString("EXTRA_DISPLAY_NAME", optString3);
                                    bundle.putString("EXTRA_E_KYC_TOKEN", optString5);
                                    bundle.putString("EXTRA_E_KYC_INFO", optString4);
                                    bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                                    C17487o0 m92662fJ = m92662fJ();
                                    if (m92662fJ != null) {
                                        m92662fJ.m93069k2(EnterUserExtraProfileView.class, bundle, 1, true);
                                    }
                                    return true;
                                }
                            } else {
                                String optString6 = jSONObject.optString("token_otp");
                                String optString7 = jSONObject.optString("phone_number");
                                String optString8 = jSONObject.optString("ekyc_info");
                                String optString9 = jSONObject.optString("ekyc_token");
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("EXTRA_PHONE_NUMBER", optString7);
                                bundle2.putString("EXTRA_SESSION_TOKEN", optString6);
                                bundle2.putString("EXTRA_E_KYC_TOKEN", optString9);
                                bundle2.putString("EXTRA_E_KYC_INFO", optString8);
                                bundle2.putInt("SHOW_WITH_FLAGS", 67108864);
                                C17487o0 m92662fJ2 = m92662fJ();
                                if (m92662fJ2 != null) {
                                    m92662fJ2.m93069k2(UserNamingView.class, bundle2, 1, true);
                                }
                                return true;
                            }
                        } else {
                            JSONObject optJSONObject = jSONObject.optJSONObject("ekyc");
                            String optString10 = jSONObject.optString("token_otp");
                            String optString11 = jSONObject.optString("phone_number");
                            if (optJSONObject != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("EXTRA_WEB_URL", optJSONObject.getString("secureUrl"));
                                bundle3.putSerializable("EXTRA_FEATURE_ID", C18613b.f93606y);
                                bundle3.putString("EXTRA_PHONE_NUMBER", optString11);
                                bundle3.putString("EXTRA_SESSION_TOKEN", optString10);
                                bundle3.putBoolean("EXTRA_ALLOW_BACK", false);
                                bundle3.putInt("SHOW_WITH_FLAGS", 67108864);
                                C17487o0 m92662fJ3 = m92662fJ();
                                if (m92662fJ3 != null) {
                                    m92662fJ3.m93069k2(H5EkycView.class, bundle3, 1, true);
                                }
                            }
                        }
                    } else {
                        String optString12 = jSONObject.optString("phone_number");
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("data_exist_account");
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("EXTRA_PHONE_NUMBER", optString12);
                        bundle4.putString("EXTRA_DATA", optJSONObject2.toString());
                        bundle4.putInt("SHOW_WITH_FLAGS", 67108864);
                        C17487o0 m92662fJ4 = m92662fJ();
                        if (m92662fJ4 != null) {
                            m92662fJ4.m93069k2(AlreadyExistAccountRegisterView.class, bundle4, 1, true);
                        }
                        return true;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        String m4066o0 = AbstractC0924m0.m4066o0();
        AbstractC19074t.m100205c(m4066o0);
        if (m4066o0.length() > 0) {
            String optString = new JSONObject(m4066o0).optString("phone_number");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f49305N0 = optString;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30069ua m148581c = C30069ua.m148581c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148581c, "inflate(...)");
        this.f49304M0 = m148581c;
        m49862gM();
        C30069ua c30069ua = this.f49304M0;
        if (c30069ua == null) {
            AbstractC19074t.m100223u("binding");
            c30069ua = null;
        }
        FrameLayout root = c30069ua.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ResumeRegisterView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        return true;
    }
}
