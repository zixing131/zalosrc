package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.UpdateUsernameView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public class UpdateUsernameView extends BaseZaloView implements InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: M0 */
    CustomEditText f78974M0;

    /* renamed from: N0 */
    View f78975N0;

    /* renamed from: O0 */
    TextView f78976O0;

    /* renamed from: P0 */
    TextView f78977P0;

    /* renamed from: Q0 */
    Handler f78978Q0;

    /* renamed from: X0 */
    String f78985X0;

    /* renamed from: R0 */
    List f78979R0 = new ArrayList();

    /* renamed from: S0 */
    boolean f78980S0 = false;

    /* renamed from: T0 */
    boolean f78981T0 = false;

    /* renamed from: U0 */
    boolean f78982U0 = false;

    /* renamed from: V0 */
    int f78983V0 = 0;

    /* renamed from: W0 */
    Runnable f78984W0 = new RunnableC15294b();

    /* renamed from: Y0 */
    boolean f78986Y0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateUsernameView$a */
    /* loaded from: classes6.dex */
    public class C15293a extends AbstractC18391a {
        C15293a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().startsWith(" ")) {
                UpdateUsernameView.this.f78974M0.setText(editable.toString().substring(1));
                return;
            }
            UpdateUsernameView updateUsernameView = UpdateUsernameView.this;
            updateUsernameView.f78978Q0.removeCallbacks(updateUsernameView.f78984W0);
            if (editable.length() == 0) {
                UpdateUsernameView.this.m86124kM();
                if (UpdateUsernameView.this.f78983V0 > 1) {
                    AbstractC23647d.m123906p("783106");
                    AbstractC23647d.m123893c();
                    return;
                }
                return;
            }
            UpdateUsernameView updateUsernameView2 = UpdateUsernameView.this;
            updateUsernameView2.f78978Q0.postDelayed(updateUsernameView2.f78984W0, 300L);
            UpdateUsernameView updateUsernameView3 = UpdateUsernameView.this;
            if (!updateUsernameView3.f78981T0 && !updateUsernameView3.f78982U0) {
                AbstractC23647d.m123906p("783105");
                AbstractC23647d.m123893c();
                UpdateUsernameView.this.f78981T0 = true;
            }
            UpdateUsernameView.this.f78982U0 = false;
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            UpdateUsernameView.this.f78983V0 = i12;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.UpdateUsernameView$b */
    /* loaded from: classes6.dex */
    class RunnableC15294b implements Runnable {
        RunnableC15294b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UpdateUsernameView updateUsernameView = UpdateUsernameView.this;
            updateUsernameView.m86119eM(updateUsernameView.f78974M0.getText().toString());
            UpdateUsernameView.this.f78974M0.setEnableClearText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateUsernameView$c */
    /* loaded from: classes6.dex */
    public class C15295c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f78989a;

        C15295c(String str) {
            this.f78989a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m86127e(String str) {
            if (str.equals(UpdateUsernameView.this.f78974M0.getText().toString())) {
                UpdateUsernameView.this.m86122iM(1000);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m86128f(String str, C20096c c20096c) {
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(UpdateUsernameView.this.f78974M0.getText())) {
                    UpdateUsernameView.this.m86124kM();
                    return;
                }
                return;
            }
            UpdateUsernameView.this.m86122iM(c20096c.m104491c());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                if (!UpdateUsernameView.this.f72421L0.m92681pJ() && !UpdateUsernameView.this.f72421L0.m92677nJ()) {
                    if (TextUtils.isEmpty(this.f78989a)) {
                        String m104490b = c20096c.m104490b();
                        if (!TextUtils.isEmpty(m104490b)) {
                            try {
                                JSONArray optJSONArray = new JSONObject(m104490b).optJSONArray("suggest");
                                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                    UpdateUsernameView.this.f78979R0.add(optJSONArray.optString(i11));
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    Handler handler = UpdateUsernameView.this.f78978Q0;
                    final String str = this.f78989a;
                    handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.g01
                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdateUsernameView.C15295c.this.m86128f(str, c20096c);
                        }
                    });
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (!UpdateUsernameView.this.f72421L0.m92681pJ() && !UpdateUsernameView.this.f72421L0.m92677nJ()) {
                    Handler handler = UpdateUsernameView.this.f78978Q0;
                    final String str = this.f78989a;
                    handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.h01
                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdateUsernameView.C15295c.this.m86127e(str);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateUsernameView$d */
    /* loaded from: classes6.dex */
    public class C15296d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f78991a;

        C15296d(String str) {
            this.f78991a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m86131e() {
            try {
                CustomEditText customEditText = UpdateUsernameView.this.f78974M0;
                if (customEditText != null) {
                    AbstractC2379w.m12430d(customEditText);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                if (!TextUtils.isEmpty(UpdateUsernameView.this.f78985X0)) {
                    bundle.putString("EXTRA_URL_LEARN_MORE", UpdateUsernameView.this.f78985X0);
                }
                UpdateUsernameView.this.f72421L0.m92662fJ().m93069k2(CreateUsernameSuccessView.class, bundle, 1, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m86132f(C20096c c20096c) {
            UpdateUsernameView.this.m86122iM(c20096c.m104491c());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                UpdateUsernameView.this.f78978Q0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.j01
                    @Override // java.lang.Runnable
                    public final void run() {
                        UpdateUsernameView.C15296d.this.m86132f(c20096c);
                    }
                });
                UpdateUsernameView.this.f78986Y0 = false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (!UpdateUsernameView.this.f72421L0.m92681pJ() && !UpdateUsernameView.this.f72421L0.m92677nJ()) {
                    AbstractC23304d.f113368c0.f42460z1 = this.f78991a;
                    if (obj != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(obj.toString());
                            if (jSONObject.optInt("error_code") == 0) {
                                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                UpdateUsernameView.this.f78985X0 = optJSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    UpdateUsernameView.this.f78978Q0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.i01
                        @Override // java.lang.Runnable
                        public final void run() {
                            UpdateUsernameView.C15296d.this.m86131e();
                        }
                    });
                    UpdateUsernameView.this.f78986Y0 = false;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UpdateUsernameView$e */
    /* loaded from: classes6.dex */
    public class C15297e extends C10866e {

        /* renamed from: g0 */
        String f78993g0;

        public C15297e(InterfaceC27218a interfaceC27218a, String str, int i11, int i12) {
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
            this.f78993g0 = str;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            try {
                UpdateUsernameView.this.f78982U0 = true;
                AbstractC23647d.m123906p("783103");
                AbstractC23647d.m123893c();
                UpdateUsernameView.this.f78974M0.setText(this.f78993g0);
                UpdateUsernameView.this.f78974M0.setSelection(this.f78993g0.length());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
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
    /* renamed from: hM */
    public /* synthetic */ void m86118hM(View view) {
        AbstractC2379w.m12430d(this.f78974M0);
        AbstractC23647d.m123906p("783107");
        AbstractC23647d.m123893c();
        if (this.f78980S0) {
            this.f72421L0.showDialog(1);
        } else {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_input_username));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            return null;
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(5).m43172u(AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_dialog_create_username, this.f78974M0.getText().toString())).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_create_username)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.change), this).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_create_username), this);
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.update_username_view, viewGroup, false);
        m86121gM(inflate);
        AbstractC23647d.m123906p("783101");
        AbstractC23647d.m123893c();
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 1) {
                if (i11 == -1) {
                    interfaceC17463d.dismiss();
                    AbstractC23647d.m123906p("783109");
                    AbstractC23647d.m123893c();
                    m86120fM(this.f78974M0.getText().toString());
                } else if (i11 == -2) {
                    interfaceC17463d.dismiss();
                    AbstractC23647d.m123906p("783108");
                    AbstractC23647d.m123893c();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            CustomEditText customEditText = this.f78974M0;
            if (customEditText != null) {
                AbstractC2379w.m12430d(customEditText);
            }
            AbstractC23647d.m123906p("783102");
            AbstractC23647d.m123893c();
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            this.f72421L0.m92662fJ().m93069k2(IntroUsernameView.class, bundle, 1, true);
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_create_username));
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
        CustomEditText customEditText;
        super.mo37122XJ(z11, z12);
        if (z11 && !z12 && (customEditText = this.f78974M0) != null) {
            AbstractC2379w.m12432f(customEditText);
        }
    }

    /* renamed from: eM */
    void m86119eM(String str) {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15295c(str));
            c0766k.mo1732s4(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fM */
    void m86120fM(String str) {
        try {
            if (this.f78986Y0) {
                return;
            }
            this.f78986Y0 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15296d(str));
            c0766k.mo1630e9(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gM */
    void m86121gM(View view) {
        this.f78978Q0 = new Handler(Looper.getMainLooper());
        this.f78974M0 = (CustomEditText) view.findViewById(AbstractC6918a0.edt_username);
        this.f78976O0 = (TextView) view.findViewById(AbstractC6918a0.txtHint);
        this.f78977P0 = (TextView) view.findViewById(AbstractC6918a0.txtTitle);
        this.f78975N0 = view.findViewById(AbstractC6918a0.btnCreateUsername);
        this.f78977P0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_create_username_desc));
        this.f78974M0.addTextChangedListener(new C15293a());
        this.f78975N0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.f01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UpdateUsernameView.this.m86118hM(view2);
            }
        });
        m86119eM("");
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UpdateUsernameView";
    }

    /* renamed from: iM */
    void m86122iM(int i11) {
        try {
            if (i11 != 1000) {
                if (i11 != 50001) {
                    switch (i11) {
                        case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                            this.f78976O0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_username_must_begin_from_letter));
                            TextView textView = this.f78976O0;
                            textView.setTextColor(AbstractC23136l9.m118641B(textView.getContext(), AbstractC16801x.cNotify1));
                            m86123jM(false);
                            return;
                        case 1004:
                            this.f78976O0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_hint));
                            TextView textView2 = this.f78976O0;
                            textView2.setTextColor(AbstractC23136l9.m118641B(textView2.getContext(), AbstractC16801x.cNotify1));
                            m86123jM(false);
                            return;
                        case 1005:
                            this.f78976O0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_exist));
                            TextView textView3 = this.f78976O0;
                            textView3.setTextColor(AbstractC23136l9.m118641B(textView3.getContext(), AbstractC16801x.cNotify1));
                            m86123jM(false);
                            return;
                    }
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                this.f78976O0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_hint));
                TextView textView4 = this.f78976O0;
                textView4.setTextColor(AbstractC23136l9.m118641B(textView4.getContext(), AbstractC16801x.cMtxt1));
                m86123jM(false);
                return;
            }
            this.f78976O0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_create_username_valid));
            CustomEditText customEditText = this.f78974M0;
            customEditText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AbstractC23136l9.m118665N(customEditText.getContext(), AbstractC16803z.icon_username_available), (Drawable) null);
            this.f78974M0.setEnableClearText(false);
            TextView textView5 = this.f78976O0;
            textView5.setTextColor(AbstractC23136l9.m118641B(textView5.getContext(), AbstractC16801x.blue_valid_username));
            m86123jM(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jM */
    void m86123jM(boolean z11) {
        this.f78980S0 = z11;
        if (z11) {
            this.f78975N0.setBackgroundResource(AbstractC16803z.bg_btn_type1_big);
        } else {
            this.f78975N0.setBackgroundResource(AbstractC16803z.bg_btn_type1_big_d);
        }
    }

    /* renamed from: kM */
    void m86124kM() {
        TextView textView = this.f78976O0;
        textView.setTextColor(AbstractC23136l9.m118641B(textView.getContext(), AbstractC16801x.co_mtxt2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_username));
        sb2.append(" ");
        int length = sb2.length();
        for (int i11 = 0; i11 < this.f78979R0.size(); i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append((String) this.f78979R0.get(i11));
        }
        SpannableString spannableString = new SpannableString(sb2);
        for (String str : this.f78979R0) {
            spannableString.setSpan(new C15297e(this.f72421L0.m92676n2(), str, length, length + str.length()), length, str.length() + length, 33);
            length += str.length() + 2;
        }
        this.f78976O0.setMovementMethod(CustomMovementMethod.m56305e());
        this.f78976O0.setText(spannableString);
        m86123jM(false);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            CustomEditText customEditText = this.f78974M0;
            if (customEditText != null) {
                AbstractC2379w.m12430d(customEditText);
            }
            AbstractC23647d.m123906p("783102");
            AbstractC23647d.m123893c();
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            this.f72421L0.m92662fJ().m93069k2(IntroUsernameView.class, bundle, 1, true);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
