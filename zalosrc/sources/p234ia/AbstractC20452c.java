package p234ia;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4184h;
import java.util.Locale;
import p229i5.AbstractC20295p;

/* renamed from: ia.c */
/* loaded from: classes3.dex */
public abstract class AbstractC20452c {

    /* renamed from: a */
    private static final C4184h f100654a = new C4184h("CommonUtils", "");

    /* renamed from: a */
    public static String m106484a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e11) {
            f100654a.m19691c("CommonUtils", "Exception thrown when trying to get app version ".concat(e11.toString()));
            return "";
        }
    }

    /* renamed from: b */
    public static String m106485b(Locale locale) {
        if (AbstractC20295p.m105952f()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
