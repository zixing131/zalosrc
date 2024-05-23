package com.zing.zalo.register;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.WebInAppView;
import com.zing.zalo.register.BannedAccountRegisterView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.regex.Matcher;
import me0.AbstractC23056e6;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p227i3.C20218v;
import p348mi.AbstractC23309i;
import p649xl.C29702a0;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class BannedAccountRegisterView extends SlidableZaloView {
    public static final C9282a Companion = new C9282a(null);

    /* renamed from: P0 */
    private C29702a0 f49230P0;

    /* renamed from: Q0 */
    private String f49231Q0 = "";

    /* renamed from: R0 */
    private String f49232R0 = "";

    /* renamed from: com.zing.zalo.register.BannedAccountRegisterView$a */
    /* loaded from: classes4.dex */
    public static final class C9282a {
        private C9282a() {
        }

        public /* synthetic */ C9282a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.register.BannedAccountRegisterView$b */
    /* loaded from: classes4.dex */
    public static final class C9283b extends ClickableSpan {

        /* renamed from: q */
        final /* synthetic */ String f49234q;

        C9283b(String str) {
            this.f49234q = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            C17487o0 m92662fJ = BannedAccountRegisterView.this.m92662fJ();
            if (m92662fJ != null) {
                String str = this.f49234q;
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_URL", str);
                m92662fJ.m93069k2(WebInAppView.class, bundle, 1, true);
            }
        }
    }

    /* renamed from: jM */
    private final String[] m49707jM(String str) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        if (str != null && (matcher = Patterns.WEB_URL.matcher(str)) != null) {
            while (matcher.find()) {
                String group = matcher.group();
                AbstractC19074t.m100205c(group);
                arrayList.add(group);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:            if (r5 != false) goto L18;     */
    /* renamed from: kM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m49708kM() {
        int m127173b0;
        int m127173b02;
        CharSequence m127190s0;
        int m127173b03;
        int m127173b04;
        CharSequence m127193v0;
        boolean z11;
        int m127173b05;
        boolean m127126v;
        C29702a0 c29702a0 = this.f49230P0;
        C29702a0 c29702a02 = null;
        if (c29702a0 == null) {
            AbstractC19074t.m100223u("binding");
            c29702a0 = null;
        }
        RelativeLayout root = c29702a0.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        C29702a0 c29702a03 = this.f49230P0;
        if (c29702a03 == null) {
            AbstractC19074t.m100223u("binding");
            c29702a03 = null;
        }
        c29702a03.f137179r.setOnClickListener(new View.OnClickListener() { // from class: cz.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannedAccountRegisterView.m49709lM(BannedAccountRegisterView.this, view);
            }
        });
        C29702a0 c29702a04 = this.f49230P0;
        if (c29702a04 == null) {
            AbstractC19074t.m100223u("binding");
            c29702a04 = null;
        }
        Avatar avatar = c29702a04.f137178q;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        avatar.m90481x(m92689tK, EnumC16949e.SIZE_128);
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        avatar.setImageDrawable(C27280g.m139658a(m92689tK2, AbstractC23322a.zds_il_banned_user_spot_1_1));
        C29702a0 c29702a05 = this.f49230P0;
        if (c29702a05 == null) {
            AbstractC19074t.m100223u("binding");
            c29702a05 = null;
        }
        RobotoTextView robotoTextView = c29702a05.f137183v;
        String str = this.f49232R0;
        m127173b0 = AbstractC24342w.m127173b0(str, "(", 0, false, 6, null);
        m127173b02 = AbstractC24342w.m127173b0(this.f49232R0, ")", 0, false, 6, null);
        m127190s0 = AbstractC24342w.m127190s0(str, m127173b0, m127173b02 + 1);
        this.f49232R0 = m127190s0.toString();
        String m118283i = AbstractC23056e6.m118283i(this.f49231Q0, AbstractC23309i.m121704a5(), true, 4);
        if (!TextUtils.isEmpty(m118283i)) {
            m127126v = AbstractC24341v.m127126v(m118283i, AbstractC23056e6.f112062a, true);
        }
        m118283i = this.f49231Q0;
        String str2 = this.f49232R0;
        m127173b03 = AbstractC24342w.m127173b0(str2, "{", 0, false, 6, null);
        m127173b04 = AbstractC24342w.m127173b0(this.f49232R0, "}", 0, false, 6, null);
        AbstractC19074t.m100205c(m118283i);
        m127193v0 = AbstractC24342w.m127193v0(str2, m127173b03, m127173b04 + 1, m118283i);
        SpannableString spannableString = new SpannableString(Html.fromHtml(m127193v0.toString() + " "));
        String[] m49707jM = m49707jM(spannableString.toString());
        if (m49707jM.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (true ^ z11) {
            for (String str3 : m49707jM) {
                m127173b05 = AbstractC24342w.m127173b0(spannableString, str3, 0, false, 6, null);
                spannableString.setSpan(new C9283b(str3), m127173b05, str3.length() + m127173b05, 33);
            }
        }
        robotoTextView.setText(spannableString);
        robotoTextView.setMovementMethod(CustomMovementMethod.m56305e());
        robotoTextView.setHighlightColor(0);
        C29702a0 c29702a06 = this.f49230P0;
        if (c29702a06 == null) {
            AbstractC19074t.m100223u("binding");
            c29702a06 = null;
        }
        c29702a06.f137181t.setOnClickListener(new View.OnClickListener() { // from class: cz.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannedAccountRegisterView.m49710mM(BannedAccountRegisterView.this, view);
            }
        });
        C29702a0 c29702a07 = this.f49230P0;
        if (c29702a07 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29702a02 = c29702a07;
        }
        c29702a02.f137180s.setOnClickListener(new View.OnClickListener() { // from class: cz.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BannedAccountRegisterView.m49711nM(BannedAccountRegisterView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m49709lM(BannedAccountRegisterView bannedAccountRegisterView, View view) {
        AbstractC19074t.m100208f(bannedAccountRegisterView, "this$0");
        bannedAccountRegisterView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m49710mM(BannedAccountRegisterView bannedAccountRegisterView, View view) {
        AbstractC19074t.m100208f(bannedAccountRegisterView, "this$0");
        bannedAccountRegisterView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m49711nM(BannedAccountRegisterView bannedAccountRegisterView, View view) {
        AbstractC19074t.m100208f(bannedAccountRegisterView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        C17487o0 m92662fJ = bannedAccountRegisterView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(StartUpNewView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("EXTRA_PHONE_NUMBER");
            if (string != null) {
                AbstractC19074t.m100205c(string);
                this.f49231Q0 = string;
            }
            String string2 = m92642L3.getString("EXTRA_BAN_MESSAGE");
            if (string2 != null) {
                AbstractC19074t.m100205c(string2);
                this.f49232R0 = string2;
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29702a0 m147700c = C29702a0.m147700c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147700c, "inflate(...)");
        this.f49230P0 = m147700c;
        m49708kM();
        C29702a0 c29702a0 = this.f49230P0;
        if (c29702a0 == null) {
            AbstractC19074t.m100223u("binding");
            c29702a0 = null;
        }
        RelativeLayout root = c29702a0.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BannedAccountRegisterView";
    }
}
