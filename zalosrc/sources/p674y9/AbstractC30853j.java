package p674y9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: y9.j */
/* loaded from: classes3.dex */
public abstract class AbstractC30853j {
    /* renamed from: a */
    private static String m149989a(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: " + i11);
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    /* renamed from: b */
    private static String m149990b(int i11) {
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return "h:mm a";
                }
                throw new IllegalArgumentException("Unknown DateFormat style: " + i11);
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    /* renamed from: c */
    public static DateFormat m149991c(int i11, int i12) {
        return new SimpleDateFormat(m149989a(i11) + " " + m149990b(i12), Locale.US);
    }
}
