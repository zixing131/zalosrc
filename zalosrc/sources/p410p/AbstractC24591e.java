package p410p;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p562v.AbstractC27392e;

/* renamed from: p.e */
/* loaded from: classes2.dex */
abstract class AbstractC24591e {

    /* renamed from: a */
    private static final Pattern f118342a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    private static final Pattern f118343b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    private static final Pattern f118344c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    private static final Pattern f118345d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    private static final Pattern f118346e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    private static final Pattern f118347f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    private static final Pattern f118348g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m128062a(String str, String str2) {
        return m128066e(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* renamed from: b */
    private static boolean m128063b(int i11, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i11 >= iArr2[0] && i11 <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m128064c(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i11 = 0;
        while (matcher.find(i11)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m128063b(start, iArr)) {
                sb2.append(str.substring(0, matcher.end()));
                sb2.append(str2);
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i11 = end;
        }
        return false;
    }

    /* renamed from: d */
    private static int[][] m128065d(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int indexOf = str.indexOf("<!--", i11);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                if (indexOf2 >= 0) {
                    arrayList.add(new int[]{indexOf, indexOf2});
                    i11 = indexOf2 + 3;
                } else {
                    arrayList.add(new int[]{indexOf, length});
                }
            }
            i11 = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
    }

    /* renamed from: e */
    static String m128066e(String str, String str2) {
        AbstractC27392e.m140338d(str, "HTML is null or empty");
        int[][] m128065d = m128065d(str);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 16);
        if (!m128067f(str, sb2, f118343b, str2, m128065d) && !m128064c(str, sb2, f118342a, str2, m128065d) && !m128067f(str, sb2, f118345d, str2, m128065d) && !m128064c(str, sb2, f118344c, str2, m128065d) && !m128067f(str, sb2, f118347f, str2, m128065d) && !m128064c(str, sb2, f118346e, str2, m128065d) && !m128064c(str, sb2, f118348g, str2, m128065d)) {
            return str2 + str;
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private static boolean m128067f(String str, StringBuilder sb2, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i11 = 0;
        while (matcher.find(i11)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m128063b(start, iArr)) {
                sb2.append(str.substring(0, matcher.end() - 2));
                sb2.append(">");
                sb2.append(str2);
                sb2.append("</");
                sb2.append(matcher.group(1));
                sb2.append(">");
                sb2.append(str.substring(matcher.end()));
                return true;
            }
            i11 = end;
        }
        return false;
    }
}
