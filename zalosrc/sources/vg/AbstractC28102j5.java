package vg;

import java.util.Locale;

/* renamed from: vg.j5 */
/* loaded from: classes.dex */
public abstract class AbstractC28102j5 {
    /* renamed from: a */
    public static String m141576a() {
        if (Locale.getDefault().getCountry().equals("VN")) {
            return "VN";
        }
        return "US";
    }

    /* renamed from: b */
    public static String m141577b() {
        if (Locale.getDefault().getLanguage().equals("vi")) {
            return "vi";
        }
        return "en";
    }
}
