package com.zing.zalo.p077ui.zviews;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import me0.AbstractC23028c0;
import me0.AbstractC23088h5;
import p361nb.C23648e;
import p649xl.C30035sa;

/* loaded from: classes6.dex */
public final class RequestFullScreenIntentPermissionViewBS extends BottomSheet {

    /* renamed from: b1 */
    private C30035sa f77067b1;

    /* renamed from: NL */
    private final String m83752NL() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            return m92642L3.getString("EXTRA_CALLER_ID");
        }
        return null;
    }

    /* renamed from: OL */
    private final Spannable m83753OL() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (m92652XI(AbstractC8020f0.str_full_screen_intent_permission_request_title_missed_call) + " "));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) AbstractC23028c0.m118086f(m83752NL(), true, AbstractC8020f0.str_you));
        spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 17);
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        AbstractC19074t.m100207e(valueOf, "valueOf(this)");
        return valueOf;
    }

    /* renamed from: PL */
    private final boolean m83754PL() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            return m92642L3.getBoolean("EXTRA_MISSED_CALL_UI");
        }
        return false;
    }

    /* renamed from: QL */
    private final void m83755QL(final String str) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.hd0
            @Override // java.lang.Runnable
            public final void run() {
                RequestFullScreenIntentPermissionViewBS.m83756RL(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RL */
    public static final void m83756RL(String str) {
        AbstractC19074t.m100208f(str, "$param");
        C0815e1.m2075D().m2100V(new C23648e(63, "csc", 0, "call_permission_fullscreen", String.valueOf(AbstractC0924m0.m4037n1()), str), false);
    }

    /* renamed from: SL */
    private final void m83757SL() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.id0
            @Override // java.lang.Runnable
            public final void run() {
                RequestFullScreenIntentPermissionViewBS.m83758TL();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TL */
    public static final void m83758TL() {
        C0815e1.m2075D().m2100V(new C23648e(63, "csc", 1, "call_ui_permission_fullscreen", String.valueOf(AbstractC0924m0.m4037n1())), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UL */
    public static final void m83759UL(RequestFullScreenIntentPermissionViewBS requestFullScreenIntentPermissionViewBS, View view) {
        AbstractC19074t.m100208f(requestFullScreenIntentPermissionViewBS, "this$0");
        requestFullScreenIntentPermissionViewBS.m83755QL("2");
        requestFullScreenIntentPermissionViewBS.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VL */
    public static final void m83760VL(RequestFullScreenIntentPermissionViewBS requestFullScreenIntentPermissionViewBS, View view) {
        AbstractC19074t.m100208f(requestFullScreenIntentPermissionViewBS, "this$0");
        requestFullScreenIntentPermissionViewBS.m83755QL("1");
        requestFullScreenIntentPermissionViewBS.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WL */
    public static final void m83761WL(RequestFullScreenIntentPermissionViewBS requestFullScreenIntentPermissionViewBS, View view) {
        AbstractC19074t.m100208f(requestFullScreenIntentPermissionViewBS, "this$0");
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC23088h5.m118427h(requestFullScreenIntentPermissionViewBS.m92686rK());
        }
        requestFullScreenIntentPermissionViewBS.m83755QL("0");
        requestFullScreenIntentPermissionViewBS.close();
    }

    /* renamed from: XL */
    private final void m83762XL() {
        C30035sa c30035sa = null;
        if (m83754PL()) {
            C30035sa c30035sa2 = this.f77067b1;
            if (c30035sa2 == null) {
                AbstractC19074t.m100223u("binding");
                c30035sa2 = null;
            }
            c30035sa2.f139330u.setText(m83753OL());
            C30035sa c30035sa3 = this.f77067b1;
            if (c30035sa3 == null) {
                AbstractC19074t.m100223u("binding");
                c30035sa3 = null;
            }
            c30035sa3.f139329t.setText(m92652XI(AbstractC8020f0.str_full_screen_intent_permission_request_desc_missed_call));
        } else {
            C30035sa c30035sa4 = this.f77067b1;
            if (c30035sa4 == null) {
                AbstractC19074t.m100223u("binding");
                c30035sa4 = null;
            }
            c30035sa4.f139330u.setText(m92652XI(AbstractC8020f0.str_full_screen_intent_permission_request_title));
            C30035sa c30035sa5 = this.f77067b1;
            if (c30035sa5 == null) {
                AbstractC19074t.m100223u("binding");
                c30035sa5 = null;
            }
            c30035sa5.f139329t.setText(m92652XI(AbstractC8020f0.str_full_screen_intent_permission_request_desc));
        }
        if (AbstractC0924m0.m4037n1() <= 1) {
            C30035sa c30035sa6 = this.f77067b1;
            if (c30035sa6 == null) {
                AbstractC19074t.m100223u("binding");
                c30035sa6 = null;
            }
            c30035sa6.f139326q.setVisibility(8);
            C30035sa c30035sa7 = this.f77067b1;
            if (c30035sa7 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30035sa = c30035sa7;
            }
            c30035sa.f139328s.setVisibility(0);
            return;
        }
        C30035sa c30035sa8 = this.f77067b1;
        if (c30035sa8 == null) {
            AbstractC19074t.m100223u("binding");
            c30035sa8 = null;
        }
        c30035sa8.f139326q.setVisibility(0);
        C30035sa c30035sa9 = this.f77067b1;
        if (c30035sa9 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30035sa = c30035sa9;
        }
        c30035sa.f139328s.setVisibility(8);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C30035sa c30035sa = this.f77067b1;
        C30035sa c30035sa2 = null;
        if (c30035sa == null) {
            AbstractC19074t.m100223u("binding");
            c30035sa = null;
        }
        c30035sa.f139326q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ed0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RequestFullScreenIntentPermissionViewBS.m83759UL(RequestFullScreenIntentPermissionViewBS.this, view2);
            }
        });
        C30035sa c30035sa3 = this.f77067b1;
        if (c30035sa3 == null) {
            AbstractC19074t.m100223u("binding");
            c30035sa3 = null;
        }
        c30035sa3.f139328s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.fd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RequestFullScreenIntentPermissionViewBS.m83760VL(RequestFullScreenIntentPermissionViewBS.this, view2);
            }
        });
        C30035sa c30035sa4 = this.f77067b1;
        if (c30035sa4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30035sa2 = c30035sa4;
        }
        c30035sa2.f139327r.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.gd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RequestFullScreenIntentPermissionViewBS.m83761WL(RequestFullScreenIntentPermissionViewBS.this, view2);
            }
        });
        m83762XL();
        if (bundle == null) {
            m83757SL();
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30035sa m148495c = C30035sa.m148495c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148495c, "inflate(...)");
        this.f77067b1 = m148495c;
        m90533zL(EnumC17017m.HUG_CONTENT);
    }
}
