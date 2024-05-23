package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.C0943w;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.AbstractC2379w;
import c70.C3334c;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.JoinGroupView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import ed0.AbstractC18391a;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i70.C20379a;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23211s7;
import me0.AbstractC23244v8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p656xs.AbstractC30200a;
import p716zh.C31973j5;

/* loaded from: classes6.dex */
public class JoinGroupView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    View f74522P0;

    /* renamed from: Q0 */
    RobotoTextView f74523Q0;

    /* renamed from: R0 */
    RobotoTextView f74524R0;

    /* renamed from: S0 */
    CustomEditText f74525S0;

    /* renamed from: T0 */
    RobotoTextView f74526T0;

    /* renamed from: U0 */
    RobotoTextView f74527U0;

    /* renamed from: V0 */
    String f74528V0;

    /* renamed from: W0 */
    String f74529W0;

    /* renamed from: X0 */
    String f74530X0;

    /* renamed from: Y0 */
    int f74531Y0;

    /* renamed from: Z0 */
    int f74532Z0;

    /* renamed from: a1 */
    String f74533a1 = "";

    /* renamed from: b1 */
    boolean f74534b1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.JoinGroupView$a */
    /* loaded from: classes6.dex */
    class C14497a extends AbstractC18391a {
        C14497a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (charSequence.length() <= 250) {
                JoinGroupView.this.f74526T0.setText(charSequence.length() + "/250");
            } else {
                ToastUtils.showMess(String.format(JoinGroupView.this.m92652XI(AbstractC8020f0.str_poll_max_chars_input), 250));
                JoinGroupView.this.f74525S0.setText(charSequence.subSequence(0, 250));
                JoinGroupView.this.f74525S0.setSelection(250);
            }
            RobotoTextView robotoTextView = JoinGroupView.this.f74527U0;
            if (robotoTextView != null) {
                robotoTextView.setEnabled(!TextUtils.isEmpty(charSequence));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.JoinGroupView$b */
    /* loaded from: classes6.dex */
    class C14498b extends ZdsActionBar.AbstractC16987c {
        C14498b() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            JoinGroupView.this.m81020iM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.JoinGroupView$c */
    /* loaded from: classes6.dex */
    public class C14499c implements InterfaceC20094a {
        C14499c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m81023d() {
            C3334c c3334c = C3334c.f14156a;
            Context context = JoinGroupView.this.getContext();
            int i11 = AbstractC8020f0.str_popup_title_unable_join_group;
            int i12 = AbstractC8020f0.str_popup_subtitle_limit_members_to_join_group;
            int i13 = AbstractC23322a.zds_il_community_error_spot_1_1;
            int i14 = AbstractC8020f0.str_popup_btn_close;
            JoinGroupView joinGroupView = JoinGroupView.this;
            c3334c.m16810d(context, i11, i12, i13, i14, null, joinGroupView.f74528V0, joinGroupView.f72421L0, null, null);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            int i11;
            try {
                JoinGroupView.this.f72421L0.mo49315c4();
                if (c20096c != null) {
                    C31973j5 m4472f = C0943w.m4462l().m4472f(JoinGroupView.this.f74528V0);
                    if (m4472f != null && m4472f.m153747Y()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int m104491c = c20096c.m104491c();
                    if (m104491c != 17002 && m104491c != 17032) {
                        if (m104491c != 19530) {
                            switch (m104491c) {
                                case 17014:
                                case 17015:
                                    if (z11) {
                                        i11 = AbstractC8020f0.str_dialog_message_join_over_max_groups_join_community;
                                    } else {
                                        i11 = AbstractC8020f0.str_dialog_message_join_over_max_groups_join_group;
                                    }
                                    ToastUtils.showMess(String.format(MainApplication.getAppContext().getResources().getString(i11), Integer.valueOf(C19637j.f97466a.m102831L())));
                                    break;
                                case 17016:
                                    ToastUtils.m89266n(AbstractC8020f0.ERROR_CANNOT_JOIN_GROUP, new Object[0]);
                                    break;
                                default:
                                    AbstractC23161o1.m119321f(c20096c, z11);
                                    break;
                            }
                        } else if (AbstractC30200a.m148947f()) {
                            JoinGroupView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ns
                                @Override // java.lang.Runnable
                                public final void run() {
                                    JoinGroupView.C14499c.this.m81023d();
                                }
                            });
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("gid", JoinGroupView.this.f74528V0);
                                jSONObject.put("member_role", "non_mem");
                            } catch (JSONException e11) {
                                AbstractC23350e.m122776f("CommonZaloview", e11);
                            }
                            C20379a.f100400a.m106159a("gr_link", 1, "limit_100_mem", jSONObject.toString());
                        } else {
                            AbstractC23161o1.m119321f(c20096c, z11);
                        }
                    }
                }
                JoinGroupView.this.f74534b1 = false;
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            try {
                JoinGroupView.this.f72421L0.mo49315c4();
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("isPendingList");
                    if (!TextUtils.isEmpty(optString) && !optString.equals("1")) {
                        JoinGroupView joinGroupView = JoinGroupView.this;
                        AbstractC23211s7.m119575h(joinGroupView.f74528V0, joinGroupView.f72421L0.m92676n2(), false);
                        C31973j5 m4472f = C0943w.m4462l().m4472f(JoinGroupView.this.f74528V0);
                        if (m4472f != null && m4472f.m153747Y()) {
                            i11 = AbstractC8020f0.str_joined_community;
                        } else {
                            i11 = AbstractC8020f0.str_joined_group;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
                        JoinGroupView.this.m81020iM();
                    }
                }
                ToastUtils.showMess(JoinGroupView.this.m92652XI(AbstractC8020f0.str_request_sent_and_wait_admin_approval));
                JoinGroupView.this.f72421L0.mo50035CK(-1, null);
                JoinGroupView.this.m81020iM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ boolean m81018kM(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 == 6) {
            AbstractC2379w.m12430d(this.f74525S0);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m81019lM(View view) {
        m81021jM(AbstractC23244v8.m119732B(this.f74525S0.getText().toString()));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f74522P0 = layoutInflater.inflate(AbstractC7409c0.join_group_view, viewGroup, false);
        if (m92676n2() instanceof Activity) {
            m92676n2().mo35554O(32);
        }
        this.f74523Q0 = (RobotoTextView) this.f74522P0.findViewById(AbstractC6918a0.tv_message);
        this.f74524R0 = (RobotoTextView) this.f74522P0.findViewById(AbstractC6918a0.tv_question_content);
        CustomEditText customEditText = (CustomEditText) this.f74522P0.findViewById(AbstractC6918a0.et_content);
        this.f74525S0 = customEditText;
        customEditText.setForceHideClearBtn(true);
        this.f74526T0 = (RobotoTextView) this.f74522P0.findViewById(AbstractC6918a0.tv_remain_chars);
        this.f74527U0 = (RobotoTextView) this.f74522P0.findViewById(AbstractC6918a0.btn_send_request_join);
        this.f74525S0.addTextChangedListener(new C14497a());
        this.f74525S0.setImeOptions(6);
        this.f74525S0.setRawInputType(16384);
        this.f74525S0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.ui.zviews.ls
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m81018kM;
                m81018kM = JoinGroupView.this.m81018kM(textView, i11, keyEvent);
                return m81018kM;
            }
        });
        this.f74527U0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JoinGroupView.this.m81019lM(view);
            }
        });
        return this.f74522P0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        if (m87077NK() != null) {
            m87077NK().setLeadingFunctionCallback(new C14498b());
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "JoinGroupView";
    }

    /* renamed from: iM */
    void m81020iM() {
        AbstractC2379w.m12430d(this.f74525S0);
        this.f72421L0.finish();
    }

    /* renamed from: jM */
    void m81021jM(String str) {
        if (this.f74534b1) {
            return;
        }
        this.f74534b1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14499c());
        c0766k.mo1445H7(this.f74528V0, str, this.f74532Z0, this.f74531Y0, this.f74533a1);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        int i11;
        int i12;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("extra_group_id")) {
            this.f74528V0 = m92642L3.getString("extra_group_id", "");
            this.f74529W0 = m92642L3.getString("STR_EXTRA_GROUP_NAME", "");
            this.f74530X0 = m92642L3.getString("EXTRA_QUESTION", "");
            this.f74532Z0 = m92642L3.getInt("INT_EXTRA_JOIN_SOURCE");
            if (TextUtils.isEmpty(this.f74530X0)) {
                this.f74530X0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_join_group_request_dialog_title);
            }
            this.f74531Y0 = m92642L3.getInt("EXTRA_POOL_TYPE");
            this.f74533a1 = m92642L3.getString("STR_EXTRA_GROUP_LINK_URL", "");
            boolean z11 = m92642L3.getBoolean("EXTRA_IS_COMMUNITY", false);
            if (z11) {
                i11 = AbstractC8020f0.str_msg_mem_join_community;
            } else {
                i11 = AbstractC8020f0.str_msg_mem_join_group;
            }
            this.f74523Q0.setText(AbstractC23244v8.m119745i(m92689tK(), AbstractC23136l9.m118746s0(i11, this.f74529W0), AbstractC16801x.cMtxt2, 1));
            this.f74524R0.setText(this.f74530X0);
            this.f74525S0.setText("");
            this.f74525S0.requestFocus();
            AbstractC2379w.m12432f(this.f74525S0);
            if (m87077NK() != null) {
                ZdsActionBar m87077NK = m87077NK();
                if (z11) {
                    i12 = AbstractC8020f0.str_join_community;
                } else {
                    i12 = AbstractC8020f0.str_join_group;
                }
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(i12));
            }
        }
    }
}
