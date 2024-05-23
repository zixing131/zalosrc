package on0;

import fn0.AbstractC19074t;
import java.util.Locale;

/* renamed from: on0.e0 */
/* loaded from: classes7.dex */
public abstract class AbstractC24324e0 {
    /* renamed from: a */
    public static final String m127001a(char c11) {
        String valueOf = String.valueOf(c11);
        AbstractC19074t.m100206d(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 1) {
            if (c11 != 329) {
                char charAt = upperCase.charAt(0);
                AbstractC19074t.m100206d(upperCase, "null cannot be cast to non-null type java.lang.String");
                String substring = upperCase.substring(1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                AbstractC19074t.m100206d(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(locale);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c11));
    }
}
