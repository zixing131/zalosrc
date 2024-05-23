package com.zing.zalo.business_account.business_tools;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.business_account.business_tools.BusinessAccountDetailBottomSheet;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.Arrays;
import java.util.Calendar;
import me0.AbstractC23160o0;
import me0.C23212s8;
import p055ce.AbstractC3439h;
import p055ce.C3432a;
import p055ce.C3433b;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C29865j1;
import vg.C28203u6;

/* loaded from: classes3.dex */
public final class BusinessAccountDetailBottomSheet extends BottomSheetZaloViewWithAnim {
    public static final C7398a Companion = new C7398a(null);

    /* renamed from: W0 */
    private C29865j1 f40222W0;

    /* renamed from: com.zing.zalo.business_account.business_tools.BusinessAccountDetailBottomSheet$a */
    /* loaded from: classes3.dex */
    public static final class C7398a {
        private C7398a() {
        }

        public /* synthetic */ C7398a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.BusinessAccountDetailBottomSheet$b */
    /* loaded from: classes3.dex */
    public static final class C7399b extends ClickableSpan {

        /* renamed from: q */
        final /* synthetic */ String f40224q;

        /* renamed from: r */
        final /* synthetic */ Context f40225r;

        C7399b(String str, Context context) {
            this.f40224q = str;
            this.f40225r = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
            InterfaceC27218a m92676n2 = BusinessAccountDetailBottomSheet.this.m92676n2();
            AbstractC19074t.m100205c(m92676n2);
            c15403a.m87167B(m92676n2.mo35579p(), this.f40224q);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(this.f40225r, AbstractC2807a.link_01));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m37563oM(BusinessAccountDetailBottomSheet businessAccountDetailBottomSheet) {
        AbstractC19074t.m100208f(businessAccountDetailBottomSheet, "this$0");
        businessAccountDetailBottomSheet.m37564pM();
    }

    /* renamed from: pM */
    private final void m37564pM() {
        C3433b m40364F;
        Context context = getContext();
        if (context == null) {
            return;
        }
        int i11 = 0;
        C29865j1 c29865j1 = null;
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, CoreUtility.f89233i, false, 2, null);
        if (m141800i != null && (m40364F = m141800i.m40364F()) != null) {
            C29865j1 c29865j12 = this.f40222W0;
            if (c29865j12 == null) {
                AbstractC19074t.m100223u("binding");
                c29865j12 = null;
            }
            c29865j12.f138227r.removeAllViews();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            RobotoTextView m17279m = AbstractC3439h.m17279m(context, AbstractC3439h.m17277k(str), 2);
            if (m17279m != null) {
                C29865j1 c29865j13 = this.f40222W0;
                if (c29865j13 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29865j13 = null;
                }
                c29865j13.f138227r.addView(m17279m);
            }
            C29865j1 c29865j14 = this.f40222W0;
            if (c29865j14 == null) {
                AbstractC19074t.m100223u("binding");
                c29865j14 = null;
            }
            Button button = c29865j14.f138233x;
            button.setIdTracking("btn_ba_change_plan");
            button.setOnClickListener(new View.OnClickListener() { // from class: de.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BusinessAccountDetailBottomSheet.m37565qM(BusinessAccountDetailBottomSheet.this, view);
                }
            });
            if (!C3432a.f14402a.m17235d()) {
                i11 = 8;
            }
            button.setVisibility(i11);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(m40364F.m17258k());
            C29865j1 c29865j15 = this.f40222W0;
            if (c29865j15 == null) {
                AbstractC19074t.m100223u("binding");
                c29865j15 = null;
            }
            c29865j15.f138232w.setText(AbstractC23160o0.m119240c0(calendar));
            calendar.setTimeInMillis(m40364F.m17254g());
            C29865j1 c29865j16 = this.f40222W0;
            if (c29865j16 == null) {
                AbstractC19074t.m100223u("binding");
                c29865j16 = null;
            }
            c29865j16.f138230u.setText(AbstractC23160o0.m119240c0(calendar));
            C29865j1 c29865j17 = this.f40222W0;
            if (c29865j17 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29865j1 = c29865j17;
            }
            RobotoTextView robotoTextView = c29865j1.f138231v;
            AbstractC19074t.m100207e(robotoTextView, "baDetailTvLearnMore");
            m37566rM(robotoTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m37565qM(BusinessAccountDetailBottomSheet businessAccountDetailBottomSheet, View view) {
        AbstractC19074t.m100208f(businessAccountDetailBottomSheet, "this$0");
        InterfaceC27218a m92692wK = businessAccountDetailBottomSheet.m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        AbstractC3439h.m17286t(m92692wK, 121);
    }

    /* renamed from: rM */
    private final void m37566rM(TextView textView) {
        String m17239h = C3432a.f14402a.m17239h();
        if (m17239h.length() == 0) {
            textView.setVisibility(4);
            return;
        }
        Context context = textView.getContext();
        textView.setVisibility(0);
        textView.setMovementMethod(CustomMovementMethod.m56305e());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(AbstractC8020f0.business_account_info_view_learn_more_prefix));
        if (m17239h.length() > 0) {
            spannableStringBuilder.append((CharSequence) " ");
            String string = textView.getContext().getString(AbstractC8020f0.business_account_info_view_learn_more_postfix);
            AbstractC19074t.m100207e(string, "getString(...)");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(new C7399b(m17239h, context), length, spannableStringBuilder.length(), 33);
        }
        textView.setText(spannableStringBuilder);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C23744a.Companion.m124119a().m124117e(this, 5400);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29865j1 c29865j1 = this.f40222W0;
        if (c29865j1 == null) {
            AbstractC19074t.m100223u("binding");
            c29865j1 = null;
        }
        LinearLayout root = c29865j1.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C23744a.Companion.m124119a().m124115b(this, 5400);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        int measuredHeight = this.f72454M0.getMeasuredHeight();
        C29865j1 c29865j1 = this.f40222W0;
        if (c29865j1 == null) {
            AbstractC19074t.m100223u("binding");
            c29865j1 = null;
        }
        return measuredHeight - c29865j1.getRoot().getBottom();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C29865j1 m148099c = C29865j1.m148099c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m148099c, "inflate(...)");
        this.f40222W0 = m148099c;
        m37564pM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMaxTranslationY(mo37128eM());
        this.f72454M0.setMinTranslationY(mo37128eM());
        this.f72454M0.setEnableScrollY(true);
        this.f72454M0.setVisibility(0);
        m78542lM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BusinessAccountDetailBottomSheet";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: hM */
    public void mo37567hM() {
        super.mo37567hM();
        if (this.f72454M0.getTranslationY() != mo37128eM()) {
            this.f72454M0.setViewTranslationY(mo37128eM());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 5400) {
            AbstractC19444a.m101695c(new Runnable() { // from class: de.a
                @Override // java.lang.Runnable
                public final void run() {
                    BusinessAccountDetailBottomSheet.m37563oM(BusinessAccountDetailBottomSheet.this);
                }
            });
        }
    }
}
