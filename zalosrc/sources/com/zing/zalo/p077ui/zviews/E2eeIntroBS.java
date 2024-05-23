package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import am.AbstractC0924m0;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p348mi.AbstractC23306f;
import p649xl.C29705a3;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class E2eeIntroBS extends BottomSheet implements InterfaceC0733x {

    /* renamed from: b1 */
    private C29705a3 f73169b1;

    /* renamed from: com.zing.zalo.ui.zviews.E2eeIntroBS$a */
    /* loaded from: classes6.dex */
    public static final class C14226a extends ClickableSpan {
        C14226a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            AbstractC28207v1.m141994i3("action.open.inapp", 3, E2eeIntroBS.this.m92676n2(), E2eeIntroBS.this.m92650VI(), AbstractC23306f.m120583H().m110204g().f110047A, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(MainApplication.Companion.m35500c(), AbstractC16781w.LinkColor));
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    /* renamed from: JL */
    private final void m79318JL() {
        C29705a3 c29705a3 = null;
        if (AbstractC0924m0.m3775e9()) {
            C29705a3 c29705a32 = this.f73169b1;
            if (c29705a32 == null) {
                AbstractC19074t.m100223u("binding");
                c29705a32 = null;
            }
            c29705a32.f137195u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_beta), (Drawable) null);
            C29705a3 c29705a33 = this.f73169b1;
            if (c29705a33 == null) {
                AbstractC19074t.m100223u("binding");
                c29705a33 = null;
            }
            c29705a33.f137195u.setCompoundDrawablePadding(AbstractC23136l9.m118742r(8.0f));
        } else {
            C29705a3 c29705a34 = this.f73169b1;
            if (c29705a34 == null) {
                AbstractC19074t.m100223u("binding");
                c29705a34 = null;
            }
            c29705a34.f137195u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_e2ee_quick_intro_des_4) + " ");
        C14226a c14226a = new C14226a();
        SpannableString spannableString = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more));
        spannableString.setSpan(c14226a, 0, spannableString.length(), 18);
        spannableStringBuilder.append((CharSequence) spannableString);
        C29705a3 c29705a35 = this.f73169b1;
        if (c29705a35 == null) {
            AbstractC19074t.m100223u("binding");
            c29705a35 = null;
        }
        c29705a35.f137192r.setText(spannableStringBuilder);
        C29705a3 c29705a36 = this.f73169b1;
        if (c29705a36 == null) {
            AbstractC19074t.m100223u("binding");
            c29705a36 = null;
        }
        c29705a36.f137192r.setMovementMethod(LinkMovementMethod.getInstance());
        C29705a3 c29705a37 = this.f73169b1;
        if (c29705a37 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29705a3 = c29705a37;
        }
        c29705a3.f137191q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.zb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                E2eeIntroBS.m79319KL(E2eeIntroBS.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KL */
    public static final void m79319KL(E2eeIntroBS e2eeIntroBS, View view) {
        AbstractC19074t.m100208f(e2eeIntroBS, "this$0");
        e2eeIntroBS.close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29705a3 c29705a3 = this.f73169b1;
        if (c29705a3 == null) {
            AbstractC19074t.m100223u("binding");
            c29705a3 = null;
        }
        ScrollView scrollView = c29705a3.f137194t;
        AbstractC19074t.m100207e(scrollView, "layoutIntro");
        return scrollView;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "E2eeIntroBottomSheet";
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29705a3 m147709c = C29705a3.m147709c(LayoutInflater.from(getContext()), linearLayout, true);
        AbstractC19074t.m100207e(m147709c, "inflate(...)");
        this.f73169b1 = m147709c;
        m90533zL(EnumC17017m.HUG_CONTENT);
        m79318JL();
        m90525tL(true);
    }
}
