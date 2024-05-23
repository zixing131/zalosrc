package uh0;

import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: uh0.f */
/* loaded from: classes7.dex */
public class C27267f {

    /* renamed from: g */
    private static final Pattern f128230g = Pattern.compile("(http[s]?)://([^/\\s:]+)(:(\\d+))?(/[^\\s#]*)?(#[^\\s]*)?");

    /* renamed from: a */
    public final String f128231a;

    /* renamed from: b */
    public final String f128232b;

    /* renamed from: c */
    public final String f128233c;

    /* renamed from: d */
    public final int f128234d;

    /* renamed from: e */
    public final String f128235e;

    /* renamed from: f */
    public final String f128236f;

    private C27267f(String str, String str2, String str3, int i11, String str4, String str5) {
        this.f128231a = str;
        this.f128232b = str2;
        this.f128233c = str3;
        this.f128234d = i11;
        this.f128235e = str4;
        this.f128236f = str5;
    }

    /* renamed from: a */
    public static C27267f m139581a(String str) {
        int parseInt;
        String str2;
        Matcher matcher = f128230g.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(4);
            String group4 = matcher.group(5);
            String group5 = matcher.group(6);
            if (group3 == null) {
                if ("http".equals(group)) {
                    parseInt = 80;
                } else {
                    parseInt = 443;
                }
            } else {
                parseInt = Integer.parseInt(group3);
            }
            int i11 = parseInt;
            if (group4 == null) {
                str2 = "/";
            } else {
                str2 = group4;
            }
            return new C27267f(str, group, group2, i11, str2, group5);
        }
        throw new MalformedURLException("Invalid http url: " + str);
    }
}
