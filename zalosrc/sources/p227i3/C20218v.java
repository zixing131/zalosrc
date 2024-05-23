package p227i3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsLanding;
import com.adtima.ads.ZAdsScenario;
import com.zing.zalo.BuildConfig;
import p009a3.C0098c;
import p313l3.AbstractC22011d;

/* renamed from: i3.v */
/* loaded from: classes2.dex */
public final class C20218v {

    /* renamed from: b */
    public static final String f100059b = "v";

    /* renamed from: c */
    private static C20218v f100060c;

    /* renamed from: a */
    private Context f100061a;

    private C20218v() {
        this.f100061a = null;
        this.f100061a = Adtima.SharedContext;
    }

    /* renamed from: a */
    public static C20218v m105636a() {
        if (f100060c == null) {
            f100060c = new C20218v();
        }
        return f100060c;
    }

    /* renamed from: b */
    public void m105637b(C0098c c0098c, String str) {
        C20218v m105636a;
        String str2;
        try {
            if (c0098c == null) {
                m105636a = m105636a();
                str2 = "";
            } else {
                if (AbstractC22011d.m114908i(c0098c)) {
                    Intent intent = new Intent(this.f100061a, (Class<?>) ZAdsScenario.class);
                    intent.putExtra("adsScenario", c0098c.f542x0);
                    intent.putExtra("adsClickTo", c0098c.f507g);
                    intent.putExtra("adsContentId", str);
                    intent.putExtra("adsTemplate", c0098c.f528q0);
                    intent.setFlags(268435456);
                    this.f100061a.startActivity(intent);
                    return;
                }
                if (!AbstractC22011d.m114922w(c0098c.f507g)) {
                    Intent intent2 = new Intent(this.f100061a, (Class<?>) ZAdsLanding.class);
                    intent2.putExtra("adsLanding", c0098c.f507g);
                    intent2.putExtra("adsFeedback", c0098c.f479K);
                    intent2.putExtra("adsPerformance", c0098c.f481M);
                    intent2.putExtra("zaloForm", AbstractC22011d.m114919t(c0098c.f507g));
                    intent2.putExtra("shouldShowDialog", AbstractC22011d.m114912m(c0098c));
                    intent2.putExtra("adsCookie", c0098c.f544y0);
                    intent2.putExtra("adsActionType", c0098c.f505f);
                    intent2.setFlags(268435456);
                    this.f100061a.startActivity(intent2);
                    return;
                }
                m105636a = m105636a();
                str2 = c0098c.f507g;
            }
            m105636a.m105643h(str2);
        } catch (Exception e11) {
            m105643h(c0098c.f507g);
            Adtima.m18329e(f100059b, "openInAppBrowser", e11);
        }
    }

    /* renamed from: c */
    public void m105638c(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    String str2 = "tel:" + str.trim();
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse(str2));
                    intent.setFlags(268435456);
                    this.f100061a.startActivity(intent);
                }
            } catch (Exception e11) {
                Adtima.m18329e(f100059b, "callTo", e11);
            }
        }
    }

    /* renamed from: d */
    public void m105639d(String str, C0098c c0098c) {
        try {
            if (str == null) {
                m105636a().m105643h("");
                return;
            }
            if (AbstractC22011d.m114922w(str)) {
                m105636a().m105643h(str);
                return;
            }
            Intent intent = new Intent(this.f100061a, (Class<?>) ZAdsLanding.class);
            intent.putExtra("adsLanding", str);
            if (c0098c != null) {
                intent.putExtra("adsFeedback", c0098c.f479K);
                intent.putExtra("adsPerformance", c0098c.f481M);
                intent.putExtra("shouldShowDialog", AbstractC22011d.m114912m(c0098c));
                intent.putExtra("adsCookie", c0098c.f544y0);
            }
            intent.putExtra("zaloForm", AbstractC22011d.m114919t(str));
            intent.setFlags(268435456);
            this.f100061a.startActivity(intent);
        } catch (Exception e11) {
            m105643h(str);
            Adtima.m18329e(f100059b, "openInAppBrowser", e11);
        }
    }

    /* renamed from: e */
    public boolean m105640e(String str) {
        if (str == null || str.trim().length() == 0) {
            return false;
        }
        try {
            return this.f100061a.getPackageManager().getPackageInfo(str, 1) != null;
        } catch (Exception e11) {
            Adtima.m18329e(f100059b, "checkAppIsExists", e11);
            return false;
        }
    }

    /* renamed from: f */
    public void m105641f(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    Uri parse = Uri.parse(str);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.setFlags(268435456);
                    intent.setData(parse);
                    this.f100061a.startActivity(intent);
                }
            } catch (Exception e11) {
                Adtima.m18329e(f100059b, "openApp", e11);
            }
        }
    }

    /* renamed from: g */
    public void m105642g(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
            intent.setFlags(268435456);
            this.f100061a.startActivity(intent);
        } catch (Exception e11) {
            Adtima.m18329e(f100059b, "onAppStore", e11);
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + str));
            intent2.setFlags(268435456);
            this.f100061a.startActivity(intent2);
        }
    }

    /* renamed from: h */
    public void m105643h(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    Uri parse = Uri.parse(str);
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setFlags(268435456);
                    intent.setData(parse);
                    this.f100061a.startActivity(intent);
                }
            } catch (Exception e11) {
                Adtima.m18329e(f100059b, "openBrowser", e11);
            }
        }
    }

    /* renamed from: i */
    public String m105644i(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (parseUri != null) {
                if (this.f100061a.getPackageManager().resolveActivity(parseUri, 65536) == null) {
                    return parseUri.getStringExtra("browser_fallback_url");
                }
                parseUri.setFlags(268435456);
                this.f100061a.startActivity(parseUri);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f100059b, "openIntent", e11);
        }
        return "";
    }

    /* renamed from: j */
    public void m105645j(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.addFlags(268435456);
                    intent.setPackage(BuildConfig.APPLICATION_ID);
                    this.f100061a.startActivity(intent);
                }
            } catch (Exception e11) {
                m105643h(str);
                Adtima.m18329e(f100059b, "openZalo", e11);
            }
        }
    }
}
