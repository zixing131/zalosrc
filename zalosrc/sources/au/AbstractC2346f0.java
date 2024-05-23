package au;

import android.net.Uri;
import android.provider.BaseColumns;
import android.text.TextUtils;
import android.util.Patterns;
import java.util.regex.Pattern;

/* renamed from: au.f0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2346f0 implements BaseColumns {

    /* renamed from: c */
    public static final Uri f9859c;

    /* renamed from: d */
    public static final Uri f9860d;

    /* renamed from: e */
    public static final Uri f9861e;

    /* renamed from: f */
    public static final Pattern f9862f;

    /* renamed from: g */
    public static final Pattern f9863g;

    static {
        Uri parse = Uri.parse("content://mms");
        f9859c = parse;
        f9860d = Uri.withAppendedPath(parse, "report-request");
        f9861e = Uri.withAppendedPath(parse, "report-status");
        f9862f = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");
        f9863g = Pattern.compile("\\s*\"([^\"]*)\"\\s*");
    }

    /* renamed from: a */
    public static boolean m12314a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Patterns.PHONE.matcher(str).matches();
    }
}
