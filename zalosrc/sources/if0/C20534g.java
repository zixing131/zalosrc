package if0;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.ZaloView;
import dj.C17945a0;
import dj.C17964g1;
import dj.C17969i0;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import if0.C20530c;
import java.util.Locale;
import java.util.Random;
import me0.AbstractC23222t7;
import od0.EnumC24229g;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p173fz.C19172a;
import p361nb.C23648e;
import p363nh.C23744a;
import p716zh.C31944h6;
import ui0.C27280g;

/* renamed from: if0.g */
/* loaded from: classes5.dex */
public final class C20534g {

    /* renamed from: a */
    public static final C20534g f100864a = new C20534g();

    private C20534g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m106687n(C17945a0 c17945a0, String str, boolean z11) {
        C17964g1 c17964g1;
        int m40114X;
        int m104529e;
        AbstractC19074t.m100208f(c17945a0, "$message");
        AbstractC19074t.m100208f(str, "$chatType");
        try {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            Integer num = null;
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 != null) {
                Integer valueOf = Integer.valueOf(c17964g1.m95530g());
                if (valueOf.intValue() > 0) {
                    num = valueOf;
                }
                if (num != null) {
                    m40114X = num.intValue();
                    m104529e = AbstractC20104d.m104529e(m40114X / 1000.0f);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("see_onboard", z11 ? 1 : 0);
                    jSONObject.put("duration", m104529e);
                    C0815e1.m2075D().m2100V(new C23648e(68, "csc_msgmenu", 0, "message_voice2text", str, jSONObject.toString()), false);
                }
            }
            C7853b m40150a = C7853b.Companion.m40150a();
            String m94983Q3 = c17945a0.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            m40114X = m40150a.m40114X(m94983Q3);
            m104529e = AbstractC20104d.m104529e(m40114X / 1000.0f);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("see_onboard", z11 ? 1 : 0);
            jSONObject2.put("duration", m104529e);
            C0815e1.m2075D().m2100V(new C23648e(68, "csc_msgmenu", 0, "message_voice2text", str, jSONObject2.toString()), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final int m106688b() {
        return C19172a.m100600k("voice_to_text@long_voice_duration", 5) * 1000;
    }

    /* renamed from: c */
    public final boolean m106689c() {
        if (C19172a.m100600k("voice_to_text@ask_e2ee_consent", 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m106690d() {
        if (C19172a.m100600k("voice_to_text@show_beta", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m106691e() {
        if (C19172a.m100600k("voice_to_text@show_tooltip", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String m106692f(C17945a0 c17945a0, boolean z11) {
        C17964g1 c17964g1;
        String m95536n;
        AbstractC19074t.m100208f(c17945a0, "message");
        String str = null;
        C17964g1 c17964g12 = null;
        if (z11) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17964g1) {
                c17964g12 = (C17964g1) m94929K2;
            }
            if (c17964g12 == null || (m95536n = c17964g12.m95536n()) == null) {
                return "";
            }
            return m95536n;
        }
        C17969i0 m94929K22 = c17945a0.m94929K2();
        if (m94929K22 instanceof C17964g1) {
            c17964g1 = (C17964g1) m94929K22;
        } else {
            c17964g1 = null;
        }
        if (c17964g1 != null) {
            str = c17964g1.m95534l();
        }
        if (str == null || str.length() == 0) {
            return c17945a0.m95090b5();
        }
        return str;
    }

    /* renamed from: g */
    public final boolean m106693g() {
        if (m106689c() && !AbstractC0924m0.m3281Nc()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m106694h() {
        if (C19172a.m100600k("voice_to_text@enable", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean m106695i() {
        if (C19172a.m100600k("voice_to_text@enable_e2ee", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m106696j(String str) {
        boolean m127125u;
        AbstractC19074t.m100208f(str, "localPath");
        m127125u = AbstractC24341v.m127125u(str, "aac", false, 2, null);
        return m127125u;
    }

    /* renamed from: k */
    public final boolean m106697k(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        String lowerCase = C31944h6.f146774a.m153559t(str).toLowerCase(Locale.ROOT);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        return AbstractC19074t.m100204b(lowerCase, "aac");
    }

    /* renamed from: l */
    public final void m106698l(String str) {
        AbstractC19074t.m100208f(str, "chatType");
        try {
            C0815e1.m2075D().m2100V(new C23648e(68, "csc_msgmenu", 0, "message_voice2text_hide", str), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: m */
    public final void m106699m(final String str, final boolean z11, final C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "chatType");
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: if0.f
            @Override // java.lang.Runnable
            public final void run() {
                C20534g.m106687n(C17945a0.this, str, z11);
            }
        });
    }

    /* renamed from: o */
    public final void m106700o(String str) {
        AbstractC19074t.m100208f(str, "chatType");
        try {
            C0815e1.m2075D().m2100V(new C23648e(68, "csc_msgmenu", 1, "voice_2_text", str), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: p */
    public final void m106701p(String str, int i11) {
        AbstractC19074t.m100208f(str, "chatType");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("src", i11);
            C0815e1.m2075D().m2100V(new C23648e(68, "csc", 1, "onboarding_show", str, jSONObject.toString()), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: q */
    public final void m106702q(String str, int i11) {
        AbstractC19074t.m100208f(str, "chatType");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("src", i11);
            C0815e1.m2075D().m2100V(new C23648e(68, "csc", 1, "voice_2_text_fail", str, jSONObject.toString()), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r */
    public final C20545r m106703r(C17945a0 c17945a0, C20530c.a aVar) {
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(aVar, "listenerDelegate");
        EnumC24229g m95072Z4 = c17945a0.m95072Z4();
        if (m95072Z4 == null) {
            return null;
        }
        boolean m95170j6 = c17945a0.m95170j6();
        long m41045i = c17945a0.m95029V3().m41045i();
        String m106692f = m106692f(c17945a0, m95170j6);
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        String m94983Q3 = c17945a0.m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        C20545r c20545r = new C20545r(m41045i, m106692f, nextInt, m95072Z4, m94983Q3, mo95039W2, m95170j6, c17945a0.m95302y1(7));
        C20530c c20530c = new C20530c(c17945a0);
        c20530c.m106676c(aVar);
        c20545r.m106767r(c20530c);
        c20545r.m106772w(new C20532e(c17945a0));
        return c20545r;
    }

    /* renamed from: s */
    public final void m106704s(boolean z11) {
        AbstractC0924m0.m3912iq(z11);
    }

    /* renamed from: t */
    public final void m106705t(ZaloView zaloView, String str, View view) {
        View m92656bJ;
        AbstractC19074t.m100208f(str, "msg");
        if (zaloView != null) {
            try {
                if (zaloView.m92672lJ() && (m92656bJ = zaloView.m92656bJ()) != null && !TextUtils.isEmpty(str)) {
                    Snackbar m90669d = Snackbar.Companion.m90669d(m92656bJ, str, -1);
                    Context context = m92656bJ.getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    m90669d.m90644J(C27280g.m139660c(context, AbstractC2810d.zds_ic_warning_circle_solid_24, AbstractC2807a.icon_tertiary));
                    m90669d.m90645K(AbstractC23222t7.f112594x);
                    if (view != null) {
                        m90669d.m90639E(view);
                    }
                    m90669d.m90648N();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: u */
    public final void m106706u(C17945a0 c17945a0, String str, boolean z11) {
        C17964g1 c17964g1;
        AbstractC19074t.m100208f(c17945a0, "message");
        try {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 != null) {
                c17964g1.m95528I(str);
                C7956b.Companion.m41573b().m41564w0(c17945a0);
            }
            if (z11) {
                c17945a0.m95111d9();
                C23744a.Companion.m124119a().m124116d(6, c17945a0.m95029V3());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
