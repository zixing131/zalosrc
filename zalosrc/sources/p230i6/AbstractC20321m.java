package p230i6;

import android.content.Context;
import android.content.res.Resources;
import p632x4.AbstractC29321g;

/* renamed from: i6.m */
/* loaded from: classes.dex */
public abstract class AbstractC20321m {
    /* renamed from: a */
    public static String m106019a(Context context) {
        try {
            return context.getResources().getResourcePackageName(AbstractC29321g.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m106020b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }
}
