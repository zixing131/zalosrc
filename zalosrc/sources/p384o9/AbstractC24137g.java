package p384o9;

import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import p319l9.C22152a;
import p345m9.C22961h;

/* renamed from: o9.g */
/* loaded from: classes3.dex */
public abstract class AbstractC24137g {

    /* renamed from: a */
    private static final Pattern f116667a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* renamed from: a */
    public static Long m126107a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C22152a.m115524e().m115525a("The content-length value is not a valid number");
            return null;
        }
    }

    /* renamed from: b */
    public static String m126108b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader != null && (value = firstHeader.getValue()) != null) {
            return value;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m126109c(String str) {
        if (str != null && f116667a.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static void m126110d(C22961h c22961h) {
        if (!c22961h.m117699f()) {
            c22961h.m117702l();
        }
        c22961h.m117696b();
    }
}
