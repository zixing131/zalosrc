package p055ce;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.res.AbstractC1401h;
import bi0.AbstractC2808b;
import bi0.AbstractC2809c;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.layout.RatioImageView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import is.EnumC20799i;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import me0.C23278z2;
import mj0.AbstractC23322a;
import o70.C24099q0;
import org.json.JSONObject;
import p055ce.C3432a;
import p133ek.AbstractC18458a;
import p140ev.C18613b;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p542ub.InterfaceC27218a;
import vd0.AbstractC27980b;
import vg.C28023b6;
import vg.C28203u6;
import vg.C28212v6;

/* renamed from: ce.h */
/* loaded from: classes3.dex */
public abstract class AbstractC3439h {

    /* renamed from: a */
    private static C16972e0 f14435a;

    /* renamed from: ce.h$a */
    /* loaded from: classes3.dex */
    public static final class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ RatioImageView f14436l1;

        /* renamed from: m1 */
        final /* synthetic */ InterfaceC27218a f14437m1;

        a(RatioImageView ratioImageView, InterfaceC27218a interfaceC27218a) {
            this.f14436l1 = ratioImageView;
            this.f14437m1 = interfaceC27218a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (c3979l != null) {
                    this.f14436l1.setImageInfo(c3979l);
                } else {
                    this.f14436l1.setImageDrawable(AbstractC23136l9.m118665N(this.f14437m1.getContext(), AbstractC16803z.ic_illustration_welcome));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: A */
    public static final void m17261A(final InterfaceC27218a interfaceC27218a) {
        AbstractC19074t.m100208f(interfaceC27218a, "za");
        try {
            C28023b6.m141250h0().m141296K("core", "activation_business_account");
            AbstractC0924m0.m3466Tn(false);
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            String m17277k = m17277k(str);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_intro_business_account);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            if (m17277k.length() > 0) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                m118743r0 = String.format("%s %s", Arrays.copyOf(new Object[]{m118743r0, m17277k}, 2));
                AbstractC19074t.m100207e(m118743r0, "format(...)");
            }
            Context context = interfaceC27218a.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C16972e0.a aVar = new C16972e0.a(context);
            C16972e0.a m90918B = aVar.m90932i(C16972e0.b.POPUP).m90931h("business_account_popup_activation").m90919C(AbstractC23136l9.m118665N(interfaceC27218a.getContext(), AbstractC16803z.ic_illustration_welcome)).m90918B(m118743r0);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_intro_business_account);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m90918B.m90925b(m118743r02, null).m90947x("btn_create_business_account").m90942s(AbstractC8020f0.str_btn_create_business_account, new InterfaceC17463d.d() { // from class: ce.d
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC3439h.m17262B(InterfaceC27218a.this, interfaceC17463d, i11);
                }
            }).m90937n("btn_skip_business_account").m90933j(AbstractC8020f0.str_btn_later, new InterfaceC17463d.d() { // from class: ce.e
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC3439h.m17264D(interfaceC17463d, i11);
                }
            });
            f14435a = aVar.m90923G();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m17262B(InterfaceC27218a interfaceC27218a, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC27218a, "$za");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        String m17238g = C3432a.f14402a.m17238g();
        if (m17238g.length() > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", m17238g);
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93605x);
            ZaloWebView.Companion.m87171F(interfaceC27218a, m17238g, bundle);
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ce.g
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3439h.m17263C();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m17263C() {
        m17276j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m17264D(InterfaceC17463d interfaceC17463d, int i11) {
        m17276j();
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        MainTabView m67645lM = MainTabView.m67645lM();
        if (m67645lM != null) {
            if (m67645lM.m67696kM() == C24099q0.Companion.m125984a().m125969m()) {
                C23744a.Companion.m124119a().m124116d(44, "tip.tabme.businesstool.activation");
            } else {
                C23744a.Companion.m124119a().m124116d(44, "tip.tabme.ba.onboard");
            }
        }
    }

    /* renamed from: E */
    public static final void m17265E(InterfaceC27218a interfaceC27218a, String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "desc");
        AbstractC19074t.m100208f(str3, "strCTA");
        try {
            Context context = interfaceC27218a.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C16972e0.a aVar = new C16972e0.a(context);
            aVar.m90932i(C16972e0.b.POPUP);
            aVar.m90931h("business_account_popup_purchase_success");
            if (str4 != null && str4.length() != 0) {
                m17292z(aVar, interfaceC27218a, str4);
                aVar.m90918B(str);
                aVar.m90925b(str2, null);
                aVar.m90947x("btn_ba_purchase_success");
                aVar.m90943t(str3, new InterfaceC17463d.d() { // from class: ce.f
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        AbstractC3439h.m17266F(interfaceC17463d, i11);
                    }
                });
                aVar.m90927d().mo13822K();
            }
            aVar.m90919C(AbstractC23136l9.m118665N(interfaceC27218a.getContext(), AbstractC16803z.ic_illustration_welcome));
            aVar.m90918B(str);
            aVar.m90925b(str2, null);
            aVar.m90947x("btn_ba_purchase_success");
            aVar.m90943t(str3, new InterfaceC17463d.d() { // from class: ce.f
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    AbstractC3439h.m17266F(interfaceC17463d, i11);
                }
            });
            aVar.m90927d().mo13822K();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m17266F(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
    }

    /* renamed from: f */
    public static final void m17272f(int i11, int i12) {
        int m17273g = m17273g(i11, i12);
        if (m17273g != -1) {
            if (m17273g == 1) {
                AbstractC23306f.m120620T0().m101508a(new AbstractC27980b.a());
                return;
            }
            return;
        }
        AbstractC23306f.m120617S0().m101508a(new AbstractC27980b.a());
    }

    /* renamed from: g */
    public static final int m17273g(int i11, int i12) {
        int m17285s = m17285s(i11);
        int m17285s2 = m17285s(i12);
        if (m17285s >= 0 && m17285s2 >= 0) {
            if (m17285s == m17285s2) {
                return 0;
            }
            if (m17285s > m17285s2) {
                return -1;
            }
            if (m17285s < m17285s2) {
                return 1;
            }
        }
        return -2;
    }

    /* renamed from: h */
    public static final void m17274h() {
        C16972e0 c16972e0;
        try {
            C28023b6.m141250h0().m141296K("core", "activation_business_account");
            C16972e0 c16972e02 = f14435a;
            if (c16972e02 != null && c16972e02 != null && c16972e02.m92868m() && (c16972e0 = f14435a) != null) {
                c16972e0.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static final boolean m17275i() {
        if (EnumC20799i.f102210x.m108529c() && C3432a.f14402a.m17234c()) {
            C28203u6 c28203u6 = C28203u6.f131407a;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            if (c28203u6.m141818q(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private static final void m17276j() {
        AbstractC0924m0.m4143qh(true);
        AbstractC0924m0.m4173rh(true);
        AbstractC0924m0.m3632Zf(true);
    }

    /* renamed from: k */
    public static final String m17277k(String str) {
        AbstractC19074t.m100208f(str, "uid");
        int i11 = 0;
        C3433b c3433b = null;
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str, false, 2, null);
        if (m141800i != null) {
            c3433b = m141800i.m40364F();
        }
        if (c3433b != null) {
            i11 = c3433b.m17256i();
        }
        C3432a.a m17240i = C3432a.f14402a.m17240i(i11);
        if (m17240i != null && m17240i.m17247a().length() > 0) {
            return m17240i.m17247a();
        }
        switch (i11) {
            case 1:
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_account_label_standard);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                return m118743r0;
            case 2:
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_account_label_pro);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                return m118743r02;
            case 3:
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_account_label_elite);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                return m118743r03;
            case 4:
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_account_label_premium);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                return m118743r04;
            case 5:
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_account_label_ultimate);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                return m118743r05;
            case 6:
                String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_account_label_trial);
                AbstractC19074t.m100207e(m118743r06, "getString(...)");
                return m118743r06;
            default:
                String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.business_account_label_standard);
                AbstractC19074t.m100207e(m118743r07, "getString(...)");
                return m118743r07;
        }
    }

    /* renamed from: l */
    public static final Drawable m17278l(Context context, String str, int i11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "label");
        float m17284r = m17284r(context, i11);
        C13704p1 c13704p1 = new C13704p1(1);
        c13704p1.setTextSize(m17284r);
        c13704p1.setColor(AbstractC1401h.m7080d(context.getResources(), AbstractC2808b.f150822b70, context.getTheme()));
        int measureText = (int) c13704p1.measureText(str);
        int i12 = (AbstractC23222t7.f112556e * 2) + measureText;
        int i13 = (int) (m17284r + (AbstractC23222t7.f112552c * 2));
        Drawable m7082f = AbstractC1401h.m7082f(context.getResources(), AbstractC16803z.bg_label_business_account, context.getTheme());
        Bitmap createBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        StaticLayout m119623j = AbstractC23214t.m119623j(str, c13704p1, measureText, 1, Layout.Alignment.ALIGN_CENTER);
        if (m7082f != null) {
            m7082f.setBounds(0, 0, i12, i13);
            m7082f.draw(canvas);
        }
        canvas.translate((i12 - m119623j.getWidth()) / 2.0f, (i13 - m119623j.getHeight()) / 2.0f);
        m119623j.draw(canvas);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), createBitmap);
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        return bitmapDrawable;
    }

    /* renamed from: m */
    public static final RobotoTextView m17279m(Context context, String str, int i11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "label");
        if (str.length() == 0) {
            return null;
        }
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        robotoTextView.setPadding(AbstractC23222t7.f112556e, AbstractC23222t7.f112552c, AbstractC23222t7.f112556e, AbstractC23222t7.f112552c);
        robotoTextView.setBackgroundResource(AbstractC16803z.bg_label_business_account);
        robotoTextView.setText(str);
        robotoTextView.setTextSize(0, m17284r(context, i11));
        robotoTextView.setTextColor(AbstractC1401h.m7080d(context.getResources(), AbstractC2808b.f150822b70, context.getTheme()));
        robotoTextView.setIncludeFontPadding(false);
        return robotoTextView;
    }

    /* renamed from: n */
    public static final int m17280n() {
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, CoreUtility.f89233i, false, 2, null);
        if (m141800i == null) {
            return 0;
        }
        return m141800i.m40367H();
    }

    /* renamed from: o */
    public static final int m17281o(String str) {
        AbstractC19074t.m100208f(str, "uid");
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str, false, 2, null);
        if (m141800i == null) {
            return 0;
        }
        return m141800i.m40367H();
    }

    /* renamed from: p */
    public static final C28212v6 m17282p(Context context) {
        AbstractC19074t.m100208f(context, "context");
        if (AbstractC0924m0.m4255ua() && m17275i()) {
            C28212v6 c28212v6 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ba_activation_tip_tab_me_title));
            C28212v6.a aVar = new C28212v6.a();
            aVar.f131596a = 0;
            aVar.f131601f = context.getResources().getResourceEntryName(AbstractC23322a.zds_ic_business_suite_solid_24);
            aVar.f131598c = 24;
            aVar.f131599d = 24;
            aVar.f131602g = AbstractC2808b.wht_a100;
            c28212v6.f131584j = aVar;
            c28212v6.f131580f = false;
            return c28212v6;
        }
        return null;
    }

    /* renamed from: q */
    public static final C28212v6 m17283q() {
        if (AbstractC0924m0.m4284va() && m17275i()) {
            C28212v6 c28212v6 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ba_activation_tip_tab_me_business_tools_title));
            c28212v6.f131580f = false;
            return c28212v6;
        }
        return null;
    }

    /* renamed from: r */
    private static final float m17284r(Context context, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return context.getResources().getDimension(AbstractC2809c.f000);
                }
                return context.getResources().getDimension(AbstractC2809c.f400);
            }
            return context.getResources().getDimension(AbstractC2809c.f200);
        }
        return context.getResources().getDimension(AbstractC2809c.f000);
    }

    /* renamed from: s */
    private static final int m17285s(int i11) {
        switch (i11) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 2;
            default:
                return -1;
        }
    }

    /* renamed from: t */
    public static final void m17286t(InterfaceC27218a interfaceC27218a, int i11) {
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        try {
            String m17236e = C3432a.f14402a.m17236e();
            if (m17236e.length() == 0) {
                AbstractC20110a.f98889a.mo104552e(new Exception("Business Account iapUrl is empty"));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", m17236e);
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93605x);
            bundle.putInt("EXTRA_SOURCE_LINK", i11);
            ZaloWebView.Companion.m87171F(interfaceC27218a, m17236e, bundle);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: u */
    public static final void m17287u(InterfaceC27218a interfaceC27218a, String str) {
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        AbstractC19074t.m100208f(str, "configPopupBAPurchaseSuccess");
        m17288v(interfaceC27218a, new JSONObject(str));
    }

    /* renamed from: v */
    public static final void m17288v(final InterfaceC27218a interfaceC27218a, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        if (jSONObject == null) {
            return;
        }
        AbstractC0924m0.m3051Fe("");
        boolean m100204b = AbstractC19074t.m100204b("vi", AbstractC18458a.f93019a);
        if (m100204b) {
            str = "title_vi";
        } else {
            str = "title_en";
        }
        final String optString = jSONObject.optString(str, "");
        AbstractC19074t.m100207e(optString, "optString(...)");
        if (m100204b) {
            str2 = "description_vi";
        } else {
            str2 = "description_en";
        }
        final String optString2 = jSONObject.optString(str2, "");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        if (m100204b) {
            str3 = "cta_text_vi";
        } else {
            str3 = "cta_text_en";
        }
        final String optString3 = jSONObject.optString(str3, "");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        final String optString4 = jSONObject.optString("banner_image_url");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        if (optString.length() > 0 && optString2.length() > 0 && optString3.length() > 0) {
            interfaceC27218a.runOnUiThread(new Runnable() { // from class: ce.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3439h.m17289w(InterfaceC27218a.this, optString, optString2, optString3, optString4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m17289w(InterfaceC27218a interfaceC27218a, String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(interfaceC27218a, "$activity");
        AbstractC19074t.m100208f(str, "$title");
        AbstractC19074t.m100208f(str2, "$desc");
        AbstractC19074t.m100208f(str3, "$cta");
        AbstractC19074t.m100208f(str4, "$bannerImageUrl");
        m17265E(interfaceC27218a, str, str2, str3, str4);
    }

    /* renamed from: x */
    public static final void m17290x(TextView textView, String str, int i11) {
        AbstractC19074t.m100208f(textView, "textView");
        AbstractC19074t.m100208f(str, "label");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Context context = textView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        spannableStringBuilder.setSpan(new ImageSpan(m17278l(context, str, i11), 0), 0, str.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: y */
    public static /* synthetic */ void m17291y(TextView textView, String str, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        m17290x(textView, str, i11);
    }

    /* renamed from: z */
    public static final void m17292z(C16972e0.a aVar, InterfaceC27218a interfaceC27218a, String str) {
        AbstractC19074t.m100208f(aVar, "modalBuilder");
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        AbstractC19074t.m100208f(str, "bannerImageUrl");
        try {
            View inflate = LayoutInflater.from(interfaceC27218a.getContext()).inflate(AbstractC7409c0.illustration_popup_top_view, (ViewGroup) null);
            View findViewById = inflate.findViewById(AbstractC6918a0.top_image_modal);
            ((RatioImageView) findViewById).setRatio(1.7777778f);
            RatioImageView ratioImageView = (RatioImageView) findViewById;
            C23528a c23528a = new C23528a(interfaceC27218a.getContext());
            aVar.m90920D(inflate);
            ((C23528a) c23528a.m123612r(ratioImageView)).m123579C(str, C24003n.m125832b(C23278z2.f112845a.m120172j1(), 0, AbstractC23136l9.m118665N(interfaceC27218a.getContext(), AbstractC16803z.ic_illustration_welcome), 0, false, 0, false, null, 125, null), new a(ratioImageView, interfaceC27218a));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            aVar.m90920D(null);
            aVar.m90919C(AbstractC23136l9.m118665N(interfaceC27218a.getContext(), AbstractC16803z.ic_illustration_welcome));
        }
    }
}
