package p398oo;

import am.AbstractC0924m0;
import android.content.Context;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bi0.AbstractC2814h;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p173fz.C19172a;
import p425po.C24879a;
import p425po.C24880b;
import p615wn.C29110f;
import ui0.C27276c;

/* renamed from: oo.e0 */
/* loaded from: classes4.dex */
public final class C24355e0 {

    /* renamed from: a */
    public static final C24355e0 f117560a = new C24355e0();

    /* renamed from: b */
    private static final String f117561b;

    /* renamed from: c */
    private static final String f117562c;

    /* renamed from: d */
    private static final String f117563d;

    /* renamed from: e */
    private static final String f117564e;

    /* renamed from: f */
    private static final String f117565f;

    /* renamed from: g */
    private static final String f117566g;

    /* renamed from: h */
    private static final String f117567h;

    /* renamed from: i */
    private static final String f117568i;

    /* renamed from: j */
    private static final String f117569j;

    /* renamed from: k */
    private static final String f117570k;

    /* renamed from: l */
    private static final String f117571l;

    /* renamed from: m */
    private static final String f117572m;

    /* renamed from: n */
    private static AtomicBoolean f117573n;

    static {
        String m118675S = AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.social_kyc_error_title_default);
        AbstractC19074t.m100207e(m118675S, "getLocaleStringResource(...)");
        f117561b = m118675S;
        String m118675S2 = AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.social_kyc_error_title_default);
        AbstractC19074t.m100207e(m118675S2, "getLocaleStringResource(...)");
        f117562c = m118675S2;
        String m118675S3 = AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.social_kyc_error_cta_default);
        AbstractC19074t.m100207e(m118675S3, "getLocaleStringResource(...)");
        f117563d = m118675S3;
        String m118675S4 = AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.social_kyc_error_cta_default);
        AbstractC19074t.m100207e(m118675S4, "getLocaleStringResource(...)");
        f117564e = m118675S4;
        String m118675S5 = AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.social_kyc_error_timeline_desc_default);
        AbstractC19074t.m100207e(m118675S5, "getLocaleStringResource(...)");
        f117565f = m118675S5;
        String m118675S6 = AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.social_kyc_error_timeline_desc_default);
        AbstractC19074t.m100207e(m118675S6, "getLocaleStringResource(...)");
        f117566g = m118675S6;
        String m118675S7 = AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.social_kyc_error_feed_detail_desc_default);
        AbstractC19074t.m100207e(m118675S7, "getLocaleStringResource(...)");
        f117567h = m118675S7;
        String m118675S8 = AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.social_kyc_error_feed_detail_desc_default);
        AbstractC19074t.m100207e(m118675S8, "getLocaleStringResource(...)");
        f117568i = m118675S8;
        String m118675S9 = AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.social_kyc_error_own_profile_desc_default);
        AbstractC19074t.m100207e(m118675S9, "getLocaleStringResource(...)");
        f117569j = m118675S9;
        String m118675S10 = AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.social_kyc_error_own_profile_desc_default);
        AbstractC19074t.m100207e(m118675S10, "getLocaleStringResource(...)");
        f117570k = m118675S10;
        String m118675S11 = AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.social_kyc_error_friend_profile_desc_default);
        AbstractC19074t.m100207e(m118675S11, "getLocaleStringResource(...)");
        f117571l = m118675S11;
        String m118675S12 = AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.social_kyc_error_friend_profile_desc_default);
        AbstractC19074t.m100207e(m118675S12, "getLocaleStringResource(...)");
        f117572m = m118675S12;
        f117573n = new AtomicBoolean(AbstractC0924m0.m4286vc());
    }

    private C24355e0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m127347i(InterfaceC18494a interfaceC18494a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC18494a, "$executedOnButtonClicked");
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        interfaceC18494a.mo12V4();
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m127348j(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        interfaceC17463d.dismiss();
    }

    /* renamed from: k */
    private final String m127349k() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.popup_request_kyc_social_desc);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0;
    }

    /* renamed from: l */
    private final String m127350l() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_back);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0;
    }

    /* renamed from: m */
    private final String m127351m() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.popup_request_kyc_social_positive_button);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0;
    }

    /* renamed from: n */
    private final String m127352n() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.popup_request_kyc_social_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0;
    }

    /* renamed from: q */
    private final boolean m127353q() {
        if (C19172a.m100600k("safety@social_ekyc_block_post", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private final boolean m127354r() {
        int m3675b = AbstractC0924m0.m3675b();
        if (m3675b == -1 || m3675b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C24880b m127355c() {
        return new C24880b(18028, new C24879a(new C29110f(new SpannableString(f117562c), new SpannableString(f117561b)), new C29110f(new SpannableString(f117568i), new SpannableString(f117567h)), new StringTheme("", ""), "action.open.kyc", "", new TextLocalization(f117564e, f117563d)));
    }

    /* renamed from: d */
    public final C24880b m127356d() {
        return new C24880b(18028, new C24879a(new C29110f(new SpannableString(f117562c), new SpannableString(f117561b)), new C29110f(new SpannableString(f117572m), new SpannableString(f117571l)), new StringTheme("", ""), "action.open.kyc", "", new TextLocalization(f117564e, f117563d)));
    }

    /* renamed from: e */
    public final C24880b m127357e(String str) {
        AbstractC19074t.m100208f(str, "partnerName");
        String m118677T = AbstractC23136l9.m118677T(new Locale("en"), AbstractC8020f0.social_kyc_error_mutual_timeline_desc_default, str);
        AbstractC19074t.m100207e(m118677T, "getLocaleStringResource(...)");
        String m118677T2 = AbstractC23136l9.m118677T(new Locale("vi"), AbstractC8020f0.social_kyc_error_mutual_timeline_desc_default, str);
        AbstractC19074t.m100207e(m118677T2, "getLocaleStringResource(...)");
        return new C24880b(18028, new C24879a(new C29110f(new SpannableString(f117562c), new SpannableString(f117561b)), new C29110f(new SpannableString(m118677T2), new SpannableString(m118677T)), new StringTheme("", ""), "action.open.kyc", "", new TextLocalization(f117564e, f117563d)));
    }

    /* renamed from: f */
    public final C24880b m127358f() {
        return new C24880b(18028, new C24879a(new C29110f(new SpannableString(f117562c), new SpannableString(f117561b)), new C29110f(new SpannableString(f117570k), new SpannableString(f117569j)), new StringTheme("", ""), "action.open.kyc", "", new TextLocalization(f117564e, f117563d)));
    }

    /* renamed from: g */
    public final C24880b m127359g() {
        return new C24880b(18028, new C24879a(new C29110f(new SpannableString(f117562c), new SpannableString(f117561b)), new C29110f(new SpannableString(f117566g), new SpannableString(f117565f)), new StringTheme("", ""), "action.open.kyc", "", new TextLocalization(f117564e, f117563d)));
    }

    /* renamed from: h */
    public final C16972e0 m127360h(Context context, final InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18494a, "executedOnButtonClicked");
        int m139648a = C27276c.m139648a(context, 128.0f);
        RecyclingImageView recyclingImageView = new RecyclingImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m139648a, m139648a);
        layoutParams.addRule(14);
        recyclingImageView.setLayoutParams(layoutParams);
        recyclingImageView.setImageDrawable(C23212s8.m119609q(context, AbstractC16781w.SocialKycErrorIllustrator));
        recyclingImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(0, C27276c.m139648a(context, 24.0f), 0, 0);
        relativeLayout.setLayoutParams(marginLayoutParams);
        relativeLayout.addView(recyclingImageView);
        C16972e0 m90927d = new C16972e0.a(context).m90932i(C16972e0.b.POPUP).m90920D(relativeLayout).m90948y(1.0f).m90918B(m127352n()).m90925b(m127349k(), null).m90943t(m127351m(), new InterfaceC17463d.d() { // from class: oo.c0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C24355e0.m127347i(InterfaceC18494a.this, interfaceC17463d, i11);
            }
        }).m90934k(m127350l(), new InterfaceC17463d.d() { // from class: oo.d0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C24355e0.m127348j(interfaceC17463d, i11);
            }
        }).m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral).m90927d();
        m90927d.m92874z(true);
        return m90927d;
    }

    /* renamed from: o */
    public final boolean m127361o() {
        return f117573n.get();
    }

    /* renamed from: p */
    public final boolean m127362p() {
        if (m127353q() && !m127354r()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void m127363s() {
        f117573n = new AtomicBoolean(AbstractC0924m0.m4286vc());
    }

    /* renamed from: t */
    public final void m127364t(boolean z11) {
        f117573n.set(z11);
        AbstractC0924m0.m4090oo(z11);
    }
}
