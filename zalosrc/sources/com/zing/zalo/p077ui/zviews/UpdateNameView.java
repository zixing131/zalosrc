package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.AbstractC2373t;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.zviews.UpdateNameView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.zview.actionbar.ActionBar;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import me0.C23212s8;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public class UpdateNameView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: N0 */
    CustomEditText f78579N0;

    /* renamed from: O0 */
    TextView f78580O0;

    /* renamed from: P0 */
    TextView f78581P0;

    /* renamed from: Q0 */
    View f78582Q0;

    /* renamed from: R0 */
    TextView f78583R0;

    /* renamed from: M0 */
    private final String f78578M0 = UpdateNameView.class.getSimpleName();

    /* renamed from: S0 */
    boolean f78584S0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateNameView$a */
    /* loaded from: classes6.dex */
    public class C15233a extends AbstractC18391a {
        C15233a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            UpdateNameView.this.m85583hM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateNameView$b */
    /* loaded from: classes6.dex */
    public class C15234b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f78586a;

        C15234b(String str) {
            this.f78586a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m85587f(String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("SHOW_WITH_FLAGS", 16777216);
                bundle.putString("terms", str);
                if (UpdateNameView.this.f72421L0.m92662fJ() != null) {
                    UpdateNameView.this.f72421L0.m92662fJ().m93069k2(RegisterView.class, bundle, 1, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m85588g(String str) {
            TextView textView = UpdateNameView.this.f78583R0;
            if (textView != null) {
                textView.setText(str);
                if (!TextUtils.isEmpty(str)) {
                    UpdateNameView.this.f78583R0.setVisibility(0);
                } else {
                    UpdateNameView.this.f78583R0.setVisibility(8);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m85589h(C20096c c20096c) {
            try {
                TextView textView = UpdateNameView.this.f78583R0;
                if (textView != null) {
                    textView.setText(c20096c.m104492d());
                    UpdateNameView.this.f78583R0.setVisibility(0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            UpdateNameView updateNameView = UpdateNameView.this;
            updateNameView.f78584S0 = false;
            updateNameView.f72421L0.mo49315c4();
            if (!AbstractC23216t1.m119643h(UpdateNameView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.bw0
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    UpdateNameView.C15234b.this.m85588g(str);
                }
            }) && c20096c != null) {
                try {
                    if (c20096c.m104491c() == 2065) {
                        AbstractC2373t.m12412j();
                    }
                    if (UpdateNameView.this.f72421L0.m92676n2() != null) {
                        UpdateNameView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.cw0
                            @Override // java.lang.Runnable
                            public final void run() {
                                UpdateNameView.C15234b.this.m85589h(c20096c);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    int optInt = jSONObject.optInt("error_code", -999);
                    final String str = "";
                    if (optInt == 0) {
                        String str2 = this.f78586a;
                        AbstractC23304d.f113462z0 = str2;
                        AbstractC23309i.m121323Pv(str2);
                        AbstractC23304d.f113363b0 = 1L;
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (optJSONObject != null) {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("terms");
                            if (optJSONObject2 != null) {
                                str = optJSONObject2.toString();
                            }
                            long optLong = optJSONObject.optLong("timestamp_in_milis", 0L);
                            if (optLong > 0) {
                                AbstractC23304d.f113305N = System.currentTimeMillis() - optLong;
                            }
                        }
                        if (UpdateNameView.this.f72421L0.m92676n2() != null) {
                            UpdateNameView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.aw0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    UpdateNameView.C15234b.this.m85587f(str);
                                }
                            });
                        }
                    } else {
                        TextView textView = UpdateNameView.this.f78583R0;
                        if (textView != null) {
                            textView.setText(AbstractC23161o1.m119318c(optInt, ""));
                            UpdateNameView.this.f78583R0.setVisibility(0);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            UpdateNameView updateNameView = UpdateNameView.this;
            updateNameView.f78584S0 = false;
            updateNameView.f72421L0.mo49315c4();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateNameView$c */
    /* loaded from: classes6.dex */
    public class C15235c extends C10866e {

        /* renamed from: g0 */
        boolean f78588g0;

        public C15235c(boolean z11, InterfaceC27218a interfaceC27218a, int i11, int i12) {
            this.f78588g0 = z11;
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            AbstractC2379w.m12430d(UpdateNameView.this.f78579N0);
            if (UpdateNameView.this.m92662fJ() != null) {
                if (this.f78588g0) {
                    UpdateNameView.this.m92662fJ().m93069k2(PolicyZView.class, null, 1, true);
                } else {
                    UpdateNameView.this.m92662fJ().m93069k2(RegulationDisplayNameView.class, null, 1, true);
                }
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            if (this.f54861x) {
                textPaint.bgColor = C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.ItemBackgroundSelectedColor);
            } else {
                textPaint.bgColor = AbstractC23136l9.m118641B(this.f54823A.getContext(), AbstractC16801x.transparent);
            }
            textPaint.setColor(C23212s8.m119607o(this.f54823A.getContext(), AbstractC16781w.AppPrimaryColor));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public static /* synthetic */ boolean m85580gM(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            AbstractC23647d.m123897g("38501");
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.update_name_view, viewGroup, false);
        m85582fM(inflate);
        AbstractC23647d.m123897g("38500");
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC2379w.m12430d(this.f78579N0);
            AbstractC23647d.m123897g("38502");
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            try {
                bundle.putString("myDisplayName", AbstractC23304d.f113462z0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(this.f72421L0.m92652XI(AbstractC8020f0.str_header_create_account));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            AbstractC2379w.m12432f(this.f78579N0);
        }
    }

    /* renamed from: eM */
    public void m85581eM() {
        String str;
        CustomEditText customEditText = this.f78579N0;
        if (customEditText != null) {
            str = customEditText.getText().toString();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            this.f78583R0.setText(m92651WI().getString(AbstractC8020f0.str_error_missing_name_input));
            this.f78583R0.setVisibility(0);
        } else {
            if (this.f78584S0) {
                return;
            }
            this.f72421L0.mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15234b(str));
            this.f78584S0 = true;
            c0766k.m1840d0(str);
        }
    }

    /* renamed from: fM */
    void m85582fM(View view) {
        CustomEditText customEditText;
        this.f78579N0 = (CustomEditText) view.findViewById(AbstractC6918a0.edtAccount);
        this.f78583R0 = (TextView) view.findViewById(AbstractC6918a0.tvError);
        this.f78579N0.addTextChangedListener(new C15233a());
        this.f78579N0.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.ui.zviews.zv0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean m85580gM;
                m85580gM = UpdateNameView.m85580gM(view2, motionEvent);
                return m85580gM;
            }
        });
        View findViewById = view.findViewById(AbstractC6918a0.btnNext);
        this.f78582Q0 = findViewById;
        findViewById.setOnClickListener(this);
        String m121487Ua = AbstractC23309i.m121487Ua();
        if (!TextUtils.isEmpty(m121487Ua) && (customEditText = this.f78579N0) != null) {
            customEditText.setText(m121487Ua);
        }
        m85583hM();
        this.f78581P0 = (TextView) view.findViewById(AbstractC6918a0.tv_str_policy);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.policy);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.policy_2);
        int indexOf = m118743r0.indexOf(m118743r02);
        if (indexOf >= 0) {
            int length = m118743r02.length() + indexOf;
            SpannableString spannableString = new SpannableString(m118743r0);
            spannableString.setSpan(new C15235c(true, m92676n2(), indexOf, length), indexOf, length, 33);
            this.f78581P0.setMovementMethod(CustomMovementMethod.m56305e());
            this.f78581P0.setText(spannableString);
        }
        this.f78580O0 = (TextView) view.findViewById(AbstractC6918a0.tv_des_1);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_regulation_display_name);
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_des_display_name_1, m118743r03);
        int indexOf2 = m118746s0.indexOf(m118743r03);
        if (indexOf2 > 0) {
            SpannableString spannableString2 = new SpannableString(m118746s0);
            spannableString2.setSpan(new C15235c(false, m92676n2(), indexOf2, indexOf2 + m118743r03.length()), indexOf2, m118743r03.length() + indexOf2, 33);
            this.f78580O0.setMovementMethod(CustomMovementMethod.m56305e());
            this.f78580O0.setText(spannableString2);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UpdateNameView";
    }

    /* renamed from: hM */
    public void m85583hM() {
        boolean z11;
        try {
            View view = this.f78582Q0;
            if (view != null) {
                if (this.f78579N0.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                view.setEnabled(z11);
            }
            TextView textView = this.f78583R0;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btnNext) {
            m85581eM();
            AbstractC23647d.m123897g("38503");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC2379w.m12430d(this.f78579N0);
            AbstractC23647d.m123897g("38502");
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f72421L0.m92676n2().mo35554O(16);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        String str;
        super.mo37135xJ(bundle);
        if (bundle != null) {
            try {
                if (bundle.containsKey("myDisplayName")) {
                    str = bundle.getString("myDisplayName");
                } else {
                    str = "";
                }
                AbstractC23304d.f113462z0 = str;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
