package me0;

import android.content.Context;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.util.Base64;
import android.widget.TextView;
import androidx.core.text.AbstractC1463b;
import au.AbstractC2368q0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: me0.v8 */
/* loaded from: classes4.dex */
public abstract class AbstractC23244v8 {
    /* renamed from: A */
    public static String m119731A(String str) {
        int i11;
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (AbstractC23136l9.m118660K0(MainApplication.getAppContext())) {
                i11 = 14;
            } else {
                i11 = 20;
            }
            String trim = str.trim();
            return trim.substring(0, Math.min(trim.length(), i11)).trim();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: B */
    public static String m119732B(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("\r\n", " ").replace("\n", " ").trim();
    }

    /* renamed from: C */
    public static String m119733C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > 33) {
            return str.substring(0, 30) + "...";
        }
        return str;
    }

    /* renamed from: D */
    public static String m119734D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int min = Math.min(str.length(), 150);
        for (int i11 = 0; i11 < min; i11++) {
            if (str.charAt(i11) == '\n') {
                if (str.length() > 150) {
                    str = str.substring(0, 150);
                }
                return str.replace('\n', ' ');
            }
        }
        return str;
    }

    /* renamed from: E */
    public static String m119735E(String str, int i11) {
        if (str != null && !str.isEmpty()) {
            if (str.length() <= i11) {
                return str;
            }
            int i12 = (i11 - 3) / 2;
            int i13 = (i11 - i12) - 3;
            return str.substring(0, i12) + "..." + str.substring(str.length() - i13);
        }
        return "";
    }

    /* renamed from: F */
    public static String m119736F(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static String m119737a(String str, int i11) {
        if (str.length() <= i11) {
            return str;
        }
        return str.substring(0, i11 - 2) + "..";
    }

    /* renamed from: b */
    public static String m119738b(String str) {
        if (str != null && str.length() != 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return str;
    }

    /* renamed from: c */
    public static String m119739c(String str) {
        if (str != null && str.length() != 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
        return str;
    }

    /* renamed from: d */
    public static String m119740d(String str) {
        if (str != null && str.length() != 0) {
            try {
                char[] charArray = str.toCharArray();
                charArray[0] = Character.toUpperCase(charArray[0]);
                for (int i11 = 1; i11 < charArray.length; i11++) {
                    if (charArray[i11 - 1] == ' ') {
                        charArray[i11] = Character.toUpperCase(charArray[i11]);
                    } else {
                        charArray[i11] = Character.toLowerCase(charArray[i11]);
                    }
                }
                return new String(charArray);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return str;
    }

    /* renamed from: e */
    public static byte[] m119741e(String str) {
        if (str != null && !str.isEmpty()) {
            return Base64.decode(str, 2);
        }
        return new byte[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence m119742f(CharSequence charSequence, TextPaint textPaint, int i11, TextUtils.TruncateAt truncateAt, int i12) {
        boolean z11;
        int i13;
        CharSequence charSequence2;
        SpannableStringBuilder append;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(charSequence);
        try {
        } catch (Exception e11) {
            e = e11;
            z11 = false;
        }
        if (TextUtils.isEmpty(spannableString)) {
            return "";
        }
        StaticLayout staticLayout = r12;
        StaticLayout staticLayout2 = new StaticLayout(spannableString, textPaint, i11, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int lineCount = staticLayout.getLineCount();
        int min = Math.min(lineCount, i12);
        int i14 = 0;
        z11 = false;
        while (i14 < min) {
            StaticLayout staticLayout3 = staticLayout;
            try {
                CharSequence subSequence = spannableString.subSequence(staticLayout3.getLineStart(i14), staticLayout3.getLineEnd(i14));
                if (i14 == i12 - 1 && lineCount > i12) {
                    StringBuilder sb2 = new StringBuilder(subSequence);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(subSequence);
                    int indexOf = sb2.indexOf(System.getProperty("line.separator"));
                    int length = System.getProperty("line.separator").length() + indexOf;
                    if (indexOf != -1 && length != -1) {
                        append = spannableStringBuilder2.replace(indexOf, length, (CharSequence) "").append((CharSequence) "…");
                    } else {
                        append = spannableStringBuilder2.append((CharSequence) "…");
                    }
                    subSequence = TextUtils.ellipsize(append, textPaint, i11, truncateAt, false, null).toString();
                    z11 = true;
                }
                spannableStringBuilder.append(subSequence);
                i14++;
                staticLayout = staticLayout3;
            } catch (Exception e12) {
                e = e12;
                e.printStackTrace();
                if (!z11) {
                }
            }
        }
        if (!z11) {
            if (spannableStringBuilder.length() >= 3) {
                i13 = spannableStringBuilder.length() - 3;
            } else {
                i13 = 0;
            }
            CharSequence subSequence2 = spannableStringBuilder.subSequence(0, i13);
            if (subSequence2.length() <= charSequence.length()) {
                charSequence2 = charSequence.subSequence(0, subSequence2.length());
            } else {
                charSequence2 = charSequence;
            }
            return new SpannableStringBuilder().append(charSequence2).append((CharSequence) "…");
        }
        if (spannableStringBuilder.length() <= charSequence.length()) {
            return charSequence.subSequence(0, spannableStringBuilder.length());
        }
        return charSequence;
    }

    /* renamed from: g */
    public static String m119743g(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() > i11) {
            return str.substring(0, i11 - 1) + (char) 8230;
        }
        return str;
    }

    /* renamed from: h */
    public static String m119744h(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return Base64.encodeToString(bArr, 2);
        }
        return "";
    }

    /* renamed from: i */
    public static SpannableString m119745i(Context context, String str, int i11, int i12) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        try {
            for (Object obj : fromHtml.getSpans(0, fromHtml.length(), Object.class)) {
                if (obj instanceof URLSpan) {
                    int spanStart = fromHtml.getSpanStart(obj);
                    int spanEnd = fromHtml.getSpanEnd(obj);
                    int spanFlags = fromHtml.getSpanFlags(obj);
                    if (i11 != -1) {
                        spannableString.setSpan(new ForegroundColorSpan(AbstractC23136l9.m118641B(context, i11)), spanStart, spanEnd, spanFlags);
                    }
                    if (i12 != -1) {
                        spannableString.setSpan(new StyleSpan(i12), spanStart, spanEnd, spanFlags);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return spannableString;
    }

    /* renamed from: j */
    public static Spanned m119746j(String str) {
        return AbstractC1463b.m7440a(str, 63);
    }

    /* renamed from: k */
    public static String m119747k(String str) {
        try {
            return str.replaceAll("(?i)http", "http").replaceAll("(?i)https", "https");
        } catch (Exception e11) {
            e11.printStackTrace();
            return str;
        }
    }

    /* renamed from: l */
    public static ArrayList m119748l(String str) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        try {
            Matcher matcher = Pattern.compile("\\W[#＃](\\w+)", 66).matcher(" " + str);
            while (matcher.find()) {
                boolean z11 = true;
                String group = matcher.group(1);
                for (char c11 : group.toCharArray()) {
                    if (c11 >= '0' && c11 <= '9') {
                    }
                    z11 = false;
                }
                if (!TextUtils.isEmpty(group) && !z11 && !AbstractC2368q0.m12392g(group) && !hashSet.contains(group)) {
                    arrayList.add(group);
                    hashSet.add(group);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: m */
    public static String m119749m(String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = m119748l(str).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            sb2.append("#");
            sb2.append(str2);
        }
        return sb2.toString();
    }

    /* renamed from: n */
    public static Pattern m119750n(String str) {
        return Pattern.compile("\\b" + str + "\\b");
    }

    /* renamed from: o */
    public static boolean m119751o(char c11) {
        if (c11 == '\n') {
            return true;
        }
        switch (c11) {
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
            case '*':
            case '+':
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (c11) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (c11) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (c11) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    /* renamed from: p */
    public static int m119752p(CharSequence charSequence, char c11) {
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (charSequence.charAt(i11) == c11) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public static boolean m119753q(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m119754r(char c11) {
        return c11 == '!' || c11 == ',' || c11 == '.' || c11 == '?' || c11 == ':' || c11 == ';';
    }

    /* renamed from: s */
    public static boolean m119755s(char c11) {
        return c11 <= '/' || (c11 >= ':' && c11 <= '@') || ((c11 >= '[' && c11 <= '`') || (c11 >= '{' && c11 <= '~'));
    }

    /* renamed from: t */
    public static boolean m119756t(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 'a' || charAt > 'z') {
                if (charAt >= 'A' && charAt <= 'Z') {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public static int m119757u(CharSequence charSequence, char c11) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (charSequence.charAt(length) == c11) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: v */
    public static int m119758v(String str, String str2) {
        int i11 = 0;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        int i12 = 0;
        while (i11 != -1) {
            try {
                i11 = str.indexOf(str2, i11);
                if (i11 != -1) {
                    i12++;
                    i11 += str2.length();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return i12;
    }

    /* renamed from: w */
    public static void m119759w(TextView textView) {
        try {
            String charSequence = textView.getText().toString();
            int m119758v = m119758v(charSequence, System.getProperty("line.separator"));
            if (charSequence.length() <= 70 && m119758v <= 2) {
                textView.setTextSize(1, 22.0f);
            }
            textView.setTextSize(1, 16.0f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    public static String m119760x(String str) {
        try {
            String property = System.getProperty("line.separator");
            int length = str.split(property).length;
            if (length <= 7 && str.length() < 350) {
                return "";
            }
            if (length > 7) {
                StringBuilder sb2 = new StringBuilder();
                String[] split = str.split(property);
                for (int i11 = 0; i11 < 7; i11++) {
                    sb2.append(split[i11]);
                    sb2.append(property);
                }
                str = sb2.toString();
            }
            if (str.length() >= 350) {
                int lastIndexOf = str.lastIndexOf(" ", 349);
                int lastIndexOf2 = str.lastIndexOf(property, 349);
                if (lastIndexOf > 0) {
                    str = str.substring(0, lastIndexOf);
                } else if (lastIndexOf2 > 0) {
                    str = str.substring(0, lastIndexOf2);
                } else {
                    str = str.substring(0, 349);
                }
            }
            return str + "...";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: y */
    public static String m119761y(String str) {
        try {
            String property = System.getProperty("line.separator");
            int length = str.split(property).length;
            if (length <= 2 && str.length() < 175) {
                return "";
            }
            if (length > 2) {
                StringBuilder sb2 = new StringBuilder();
                String[] split = str.split(property);
                for (int i11 = 0; i11 < 2; i11++) {
                    sb2.append(split[i11]);
                    sb2.append(property);
                }
                str = sb2.toString();
            }
            if (str.length() >= 175) {
                int lastIndexOf = str.lastIndexOf(" ", 174);
                int lastIndexOf2 = str.lastIndexOf(property, 174);
                if (lastIndexOf > 0) {
                    str = str.substring(0, lastIndexOf);
                } else if (lastIndexOf2 > 0) {
                    str = str.substring(0, lastIndexOf2);
                } else {
                    str = str.substring(0, 174);
                }
            }
            return str + "...";
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: z */
    public static String m119762z(String str) {
        int i11;
        boolean z11;
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (AbstractC23136l9.m118660K0(MainApplication.getAppContext())) {
                i11 = 14;
            } else {
                i11 = 20;
            }
            String trim = str.trim();
            int min = Math.min(trim.length(), i11);
            char c11 = 0;
            if (trim.length() > min) {
                z11 = true;
            } else {
                z11 = false;
            }
            String substring = trim.substring(0, min);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(substring.trim());
            if (z11) {
                c11 = 8230;
            }
            sb2.append(c11);
            return sb2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
