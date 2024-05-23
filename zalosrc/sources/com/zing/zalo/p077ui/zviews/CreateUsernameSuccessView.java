package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zview.actionbar.ActionBar;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p348mi.AbstractC23304d;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public class CreateUsernameSuccessView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    View f73039M0;

    /* renamed from: N0 */
    TextView f73040N0;

    /* renamed from: O0 */
    TextView f73041O0;

    /* renamed from: P0 */
    String f73042P0;

    /* renamed from: com.zing.zalo.ui.zviews.CreateUsernameSuccessView$a */
    /* loaded from: classes6.dex */
    public class C14200a extends C10866e {
        public C14200a(InterfaceC27218a interfaceC27218a, int i11, int i12) {
            this.f54862y = i11;
            this.f54863z = i12;
            this.f54823A = interfaceC27218a;
        }

        @Override // com.zing.zalo.social.controls.C10866e
        /* renamed from: E */
        public void mo50126E(View view) {
            if (!TextUtils.isEmpty(CreateUsernameSuccessView.this.f73042P0)) {
                AbstractC23647d.m123906p("783202");
                AbstractC23647d.m123893c();
                Bundle bundle = new Bundle();
                bundle.putString("open_url", CreateUsernameSuccessView.this.f73042P0);
                CreateUsernameSuccessView.this.f72421L0.m92662fJ().m93069k2(LearnMoreUsernameView.class, bundle, 1, true);
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

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            if (this.f72421L0.m92642L3() != null) {
                this.f73042P0 = this.f72421L0.m92642L3().getString("EXTRA_URL_LEARN_MORE", "");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.create_username_success_view, viewGroup, false);
        m79185dM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(m92652XI(AbstractC8020f0.str_create_username_success));
                this.f88760a0.setBackButtonImage(0);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: dM */
    void m79185dM(View view) {
        this.f73040N0 = (TextView) view.findViewById(AbstractC6918a0.tv_title);
        this.f73041O0 = (TextView) view.findViewById(AbstractC6918a0.tv_intro_setting);
        String format = String.format(m92652XI(AbstractC8020f0.str_title_create_username_success), AbstractC23304d.f113368c0.f42460z1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        spannableStringBuilder.setSpan(new StyleSpan(1), format.indexOf(AbstractC23304d.f113368c0.f42460z1), spannableStringBuilder.length(), 33);
        this.f73040N0.setText(spannableStringBuilder);
        String str = m92652XI(AbstractC8020f0.str_intro_setting_username) + " ";
        SpannableString spannableString = new SpannableString(str + m92652XI(AbstractC8020f0.str_learn_more_username));
        spannableString.setSpan(new C14200a(this.f72421L0.m92676n2(), str.length(), spannableString.length()), str.length(), spannableString.length(), 33);
        this.f73041O0.setMovementMethod(CustomMovementMethod.m56305e());
        this.f73041O0.setText(spannableString);
        View findViewById = view.findViewById(AbstractC6918a0.btn_chat_gallery_done);
        this.f73039M0 = findViewById;
        findViewById.setOnClickListener(this);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CreateUsernameSuccessView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_chat_gallery_done) {
            AbstractC23647d.m123906p("783201");
            AbstractC23647d.m123893c();
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
