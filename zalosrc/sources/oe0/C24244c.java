package oe0;

import android.os.Build;
import android.provider.Settings;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19074t;
import java.util.Locale;
import on0.AbstractC24341v;

/* renamed from: oe0.c */
/* loaded from: classes4.dex */
public final class C24244c {

    /* renamed from: a */
    public static final C24244c f117098a = new C24244c();

    /* renamed from: b */
    private static final boolean f117099b;

    static {
        boolean m127126v;
        m127126v = AbstractC24341v.m127126v(Build.MANUFACTURER, "samsung", true);
        f117099b = m127126v;
    }

    private C24244c() {
    }

    /* renamed from: a */
    public final boolean m126578a() {
        return f117099b;
    }

    /* renamed from: b */
    public final boolean m126579b() {
        boolean m127120J;
        try {
            String string = Settings.Secure.getString(MainApplication.Companion.m35500c().getContentResolver(), "default_input_method");
            if (string == null) {
                return false;
            }
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String lowerCase = string.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            m127120J = AbstractC24341v.m127120J(lowerCase, "com.samsung.android.honeyboard", false, 2, null);
            return m127120J;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
