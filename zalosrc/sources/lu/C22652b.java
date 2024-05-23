package lu;

import android.webkit.URLUtil;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.net.URL;
import ln0.C22537f;
import p248iy.AbstractC20887g;

/* renamed from: lu.b */
/* loaded from: classes4.dex */
public final class C22652b {

    /* renamed from: a */
    public static final C22652b f111073a = new C22652b();

    private C22652b() {
    }

    /* renamed from: a */
    public static final void m117234a(String str) {
        try {
            if (URLUtil.isHttpUrl(str)) {
                String host = new URL(str).getHost();
                C22651a c22651a = new C22651a("Used HTTP URL");
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics.setCustomKey("URL_HOST", host);
                firebaseCrashlytics.recordException(c22651a);
                AbstractC20887g.m109240r(19011, host);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final String m117235b(Integer num) {
        C22537f c22537f = new C22537f(100, 199);
        if (num != null && c22537f.m116554l(num.intValue())) {
            return "Informational responses";
        }
        C22537f c22537f2 = new C22537f(200, 299);
        if (num != null && c22537f2.m116554l(num.intValue())) {
            return "Successful responses";
        }
        C22537f c22537f3 = new C22537f(300, 399);
        if (num != null && c22537f3.m116554l(num.intValue())) {
            return "Redirection messages";
        }
        C22537f c22537f4 = new C22537f(400, 499);
        if (num != null && c22537f4.m116554l(num.intValue())) {
            return "Client error messages";
        }
        C22537f c22537f5 = new C22537f(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, 599);
        if (num != null && c22537f5.m116554l(num.intValue())) {
            return "Server error messages";
        }
        return "Unknown HTTP code";
    }
}
