package p229i5;

import java.util.regex.Pattern;

/* renamed from: i5.t */
/* loaded from: classes.dex */
public abstract class AbstractC20299t {

    /* renamed from: a */
    private static final Pattern f100250a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static boolean m105962a(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
