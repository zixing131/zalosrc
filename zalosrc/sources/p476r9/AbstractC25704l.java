package p476r9;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
import p319l9.C22152a;

/* renamed from: r9.l */
/* loaded from: classes3.dex */
public abstract class AbstractC25704l {

    /* renamed from: a */
    private static String[] f122727a;

    /* renamed from: a */
    public static boolean m132618a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C22152a.m115524e().m115525a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f122727a == null) {
            f122727a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f122727a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
