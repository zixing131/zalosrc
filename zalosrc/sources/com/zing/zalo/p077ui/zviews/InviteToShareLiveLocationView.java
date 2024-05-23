package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.C0943w;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23028c0;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p716zh.C31870c7;
import p716zh.C31973j5;
import sx.C26406h;
import tj.C26713e;

/* loaded from: classes6.dex */
public class InviteToShareLiveLocationView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    CustomEditText f74510P0;

    /* renamed from: Q0 */
    View f74511Q0;

    /* renamed from: R0 */
    TextView f74512R0;

    /* renamed from: S0 */
    TextView f74513S0;

    /* renamed from: T0 */
    TextView f74514T0;

    /* renamed from: U0 */
    String f74515U0;

    /* renamed from: V0 */
    byte f74516V0;

    /* renamed from: W0 */
    TextWatcher f74517W0 = new C14495b();

    /* renamed from: X0 */
    boolean f74518X0 = false;

    /* renamed from: com.zing.zalo.ui.zviews.InviteToShareLiveLocationView$a */
    /* loaded from: classes6.dex */
    class C14494a extends ZdsActionBar.AbstractC16987c {
        C14494a() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            AbstractC2379w.m12430d(InviteToShareLiveLocationView.this.f74510P0);
            InviteToShareLiveLocationView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.InviteToShareLiveLocationView$b */
    /* loaded from: classes6.dex */
    class C14495b extends AbstractC18391a {
        C14495b() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i11;
            InviteToShareLiveLocationView inviteToShareLiveLocationView = InviteToShareLiveLocationView.this;
            View view = inviteToShareLiveLocationView.f74511Q0;
            if (inviteToShareLiveLocationView.f74510P0.length() > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
            InviteToShareLiveLocationView inviteToShareLiveLocationView2 = InviteToShareLiveLocationView.this;
            inviteToShareLiveLocationView2.f74512R0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_count_character_invitation, Integer.valueOf(inviteToShareLiveLocationView2.f74510P0.getText().length()), 150));
            if (editable.length() >= 150) {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_invitation_share_location_out_of_length, 150));
            }
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            try {
                super.onTextChanged(charSequence, i11, i12, i13);
                String charSequence2 = charSequence.toString();
                if (charSequence.length() > 150) {
                    InviteToShareLiveLocationView.this.f74510P0.setText(charSequence2.substring(0, 150));
                    InviteToShareLiveLocationView.this.f74510P0.setSelection(150);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.InviteToShareLiveLocationView$c */
    /* loaded from: classes6.dex */
    public class C14496c implements InterfaceC20094a {
        C14496c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.showMess(c20096c.m104492d());
            InviteToShareLiveLocationView.this.f74518X0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sent_invitation_done_toast));
            InviteToShareLiveLocationView.this.m81015nM();
            InviteToShareLiveLocationView.this.finish();
        }
    }

    /* renamed from: jM */
    private void m81010jM() {
        String str;
        int i11;
        Bundle m92642L3 = m92642L3();
        String str2 = "";
        if (m92642L3 == null) {
            str = "";
        } else {
            this.f74515U0 = m92642L3.getString("extra_conversation_id");
            str = m92642L3.getString("EXTRA_INVITATION_TEXT", "");
        }
        if (TextUtils.isEmpty(this.f74515U0)) {
            finish();
        }
        byte m47964d = C8969o.m47964d(this.f74515U0);
        this.f74516V0 = m47964d;
        if (m47964d == 1) {
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74515U0);
            TextView textView = this.f74514T0;
            if (m4472f != null && m4472f.m153747Y()) {
                i11 = AbstractC8020f0.str_note_cta_send_invitation_share_live_location_community;
            } else {
                i11 = AbstractC8020f0.str_note_cta_send_invitation_share_live_location_group;
            }
            Object[] objArr = new Object[1];
            if (m4472f != null) {
                str2 = m4472f.m153793y();
            }
            objArr[0] = str2;
            textView.setText(AbstractC23136l9.m118746s0(i11, objArr));
        } else {
            this.f74514T0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_note_cta_send_invitation_share_live_location_11, AbstractC23028c0.m118086f(this.f74515U0, false, AbstractC8020f0.str_me)));
        }
        this.f74510P0.setText(str);
        CustomEditText customEditText = this.f74510P0;
        customEditText.setSelection(customEditText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public /* synthetic */ void m81011kM() {
        AbstractC2379w.m12432f(this.f74510P0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m81012lM(View view, boolean z11) {
        int i11;
        View view2 = this.f74511Q0;
        if (this.f74510P0.length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view2.setVisibility(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.invite_to_share_live_location_layout, viewGroup, false);
        this.f74510P0 = (CustomEditText) inflate.findViewById(AbstractC6918a0.edt_invitation);
        View findViewById = inflate.findViewById(AbstractC6918a0.btn_delete_invite);
        this.f74511Q0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f74512R0 = (TextView) inflate.findViewById(AbstractC6918a0.tv_character_count);
        this.f74514T0 = (TextView) inflate.findViewById(AbstractC6918a0.note_text_invite_share_live_location);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.btn_send_invitation);
        this.f74513S0 = textView;
        textView.setOnClickListener(this);
        this.f74510P0.addTextChangedListener(this.f74517W0);
        this.f74510P0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.ui.zviews.ks
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                InviteToShareLiveLocationView.this.m81012lM(view, z11);
            }
        });
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        if (m87077NK() != null) {
            m87077NK().setLeadingFunctionCallback(new C14494a());
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "InviteToShareLiveLocationView";
    }

    /* renamed from: iM */
    C26713e m81013iM() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("invitation", 1);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return new C26713e(MainApplication.getAppContext().getString(AbstractC8020f0.str_footer_action_share_live_location), 2, "action.open.location", jSONObject.toString(), false, 0);
    }

    /* renamed from: mM */
    void m81014mM() {
        if (this.f74518X0) {
            return;
        }
        this.f74518X0 = true;
        AbstractC2379w.m12430d(this.f74510P0);
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14496c());
        byte m47964d = C8969o.m47964d(this.f74515U0);
        c0766k.mo1635f6(m47964d, C8969o.m47963c(this.f74515U0, m47964d));
    }

    /* renamed from: nM */
    void m81015nM() {
        C7907e c7907e;
        try {
            byte m47964d = C8969o.m47964d(this.f74515U0);
            String trim = this.f74510P0.getText().toString().trim();
            if (TextUtils.isEmpty(trim)) {
                trim = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_invite_share_live_location_default);
            }
            boolean z11 = true;
            if (m47964d == 1) {
                C31973j5 m4472f = C0943w.m4462l().m4472f(this.f74515U0);
                if (m4472f != null) {
                    if (!AbstractC23309i.m121590X2() || (m4472f.m153792x() != 1 && (m4472f.m153792x() != 2 || !m4472f.m153742T()))) {
                        z11 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (z11) {
                        c7907e = new C7907e();
                        C7907e.a aVar = new C7907e.a();
                        aVar.m40868f(1, -1L, 0, C31870c7.f146364m.length());
                        c7907e.m40852b(aVar);
                        sb2.append(C31870c7.f146364m);
                        sb2.append(" ");
                    } else {
                        c7907e = null;
                    }
                    sb2.append(trim);
                    C26406h c26406h = new C26406h();
                    c26406h.m136192p(c7907e);
                    c26406h.m136193q(m81013iM());
                    AbstractC23112j7.m118538k0(this.f74515U0, sb2.toString(), c26406h);
                    return;
                }
                return;
            }
            if (m47964d == 0) {
                C26406h c26406h2 = new C26406h();
                c26406h2.m136193q(m81013iM());
                AbstractC23112j7.m118538k0(this.f74515U0, trim, c26406h2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_delete_invite) {
            this.f74510P0.setText("");
        } else if (id2 == AbstractC6918a0.btn_send_invitation) {
            AbstractC23647d.m123897g("917826");
            m81014mM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m81010jM();
        mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.js
            @Override // java.lang.Runnable
            public final void run() {
                InviteToShareLiveLocationView.this.m81011kM();
            }
        }, 300L);
    }
}
