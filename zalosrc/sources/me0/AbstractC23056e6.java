package me0;

import android.text.TextUtils;
import android.util.Patterns;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalo.utils.phonenumbers.C16742b;
import com.zing.zalo.utils.phonenumbers.NumberParseException;
import java.util.Objects;
import java.util.regex.Matcher;
import p348mi.AbstractC23309i;

/* renamed from: me0.e6 */
/* loaded from: classes4.dex */
public abstract class AbstractC23056e6 {

    /* renamed from: a */
    public static String f112062a = "invalidPhone";

    /* renamed from: b */
    public static long f112063b = -1;

    /* renamed from: a */
    public static boolean m118275a(String str, String str2) {
        StringBuilder sb2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
                sb2 = new StringBuilder();
            }
            if (!str.equals("") && !str2.equals("")) {
                String m121704a5 = AbstractC23309i.m121704a5();
                C16741a m89329r = C16741a.m89329r();
                C16742b m89345W = m89329r.m89345W(str, m121704a5);
                C16742b m89345W2 = m89329r.m89345W(str2, m121704a5);
                if (m89329r.m89337H(m89345W) && m89329r.m89337H(m89345W2)) {
                    C16741a.b bVar = C16741a.b.E164;
                    if (m89329r.m89349l(m89345W, bVar).equals(m89329r.m89349l(m89345W2, bVar))) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("exeTime: ");
                        sb3.append(System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                }
                sb2 = new StringBuilder();
                sb2.append("exeTime: ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                return false;
            }
            return false;
        } finally {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("exeTime: ");
            sb4.append(System.currentTimeMillis() - currentTimeMillis);
        }
    }

    /* renamed from: b */
    public static String m118276b(String str, boolean z11, boolean z12) {
        String m121704a5;
        String m89349l;
        try {
            try {
                if (z11) {
                    m121704a5 = AbstractC23309i.m121779c5();
                    if (TextUtils.isEmpty(m121704a5)) {
                        m121704a5 = AbstractC23309i.m121704a5();
                    }
                } else {
                    m121704a5 = AbstractC23309i.m121704a5();
                }
                C16741a m89329r = C16741a.m89329r();
                C16742b m89345W = m89329r.m89345W(str, m121704a5);
                if (z11 && z12 && !m89329r.m89337H(m89345W)) {
                    m89349l = f112062a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("convertPhoneNumberToE164: ");
                    sb2.append(m89349l);
                    return m89349l;
                }
                m89349l = m89329r.m89349l(m89345W, C16741a.b.E164);
                StringBuilder sb22 = new StringBuilder();
                sb22.append("convertPhoneNumberToE164: ");
                sb22.append(m89349l);
                return m89349l;
            } catch (Exception e11) {
                e11.printStackTrace();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("convertPhoneNumberToE164: ");
                sb3.append("");
                return "";
            }
        } catch (Throwable th2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("convertPhoneNumberToE164: ");
            sb4.append("");
            throw th2;
        }
    }

    /* renamed from: c */
    public static String m118277c(String str) {
        try {
            try {
                String m121742b5 = AbstractC23309i.m121742b5();
                C16741a m89329r = C16741a.m89329r();
                String m89349l = m89329r.m89349l(m89329r.m89345W(str, m121742b5), C16741a.b.E164);
                if (!TextUtils.isEmpty(m89349l)) {
                    if (!m89349l.equalsIgnoreCase(f112062a)) {
                        str = m89349l;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("convertPhoneNumberToE164ChangePhoneNum: ");
                sb2.append(str);
                return str;
            } catch (Exception e11) {
                e11.printStackTrace();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("convertPhoneNumberToE164ChangePhoneNum: ");
                sb3.append("");
                return "";
            }
        } catch (Throwable th2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("convertPhoneNumberToE164ChangePhoneNum: ");
            sb4.append("");
            throw th2;
        }
    }

    /* renamed from: d */
    public static String m118278d(String str, String str2) {
        try {
            C16742b m89345W = C16741a.m89329r().m89345W(str, str2);
            if (!C16741a.m89329r().m89337H(m89345W)) {
                return f112062a;
            }
            if (m118291q(str)) {
                return m118284j(m89345W);
            }
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            int[] iArr = {4, 3};
            int i11 = 0;
            for (int i12 = 0; i12 < 2; i12++) {
                int i13 = iArr[i12];
                if (i11 + i13 <= length) {
                    sb2.append(str.substring(i11, i13 + i11));
                    i11 += iArr[i12];
                    if (i11 < length - 1) {
                        sb2.append(' ');
                    }
                }
            }
            if (i11 < str.length() - 1) {
                sb2.append(str.substring(i11));
            }
            return sb2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    private static String m118279e(C16742b c16742b, boolean z11) {
        String str;
        if (z11) {
            str = "(+" + c16742b.m89362c() + ") ";
        } else {
            str = "+" + c16742b.m89362c() + " ";
        }
        String str2 = c16742b.m89365f() + "";
        int length = str2.length();
        StringBuilder sb2 = new StringBuilder("");
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = i11 * 3;
            int i13 = i12 + 3;
            if (i13 > length) {
                sb2.append(str2.substring(i12, length));
                break;
            }
            sb2.append(str2.substring(i12, i13));
            sb2.append(" ");
            i11++;
        }
        if (length > 6) {
            sb2.append(str2.substring(6, length));
        }
        return str + ((Object) sb2);
    }

    /* renamed from: f */
    private static String m118280f(String str, String str2, boolean z11, int i11, Boolean bool) {
        String str3;
        if (z11) {
            str3 = "(+" + str2 + ") ";
        } else {
            str3 = "+" + str2 + " ";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = (str + "").length();
        int i12 = 0;
        if (length != 4) {
            if (length == 9) {
                i11 = 3;
            }
        } else {
            i11 = 2;
        }
        while (true) {
            if (i12 >= length) {
                break;
            }
            sb2.append(str.charAt(i12));
            i12++;
            if (i12 < length && i12 % i11 == 0) {
                sb2.append(" ");
                if ((length - i12) % 3 == 0) {
                    while (i12 < length) {
                        sb2.append(str.charAt(i12));
                        if (i12 != length - 1 && (length - i12) % 3 == 1) {
                            sb2.append(" ");
                        }
                        i12++;
                    }
                }
            }
        }
        if (bool.booleanValue()) {
            return str3 + ((Object) sb2);
        }
        return sb2.toString();
    }

    /* renamed from: g */
    public static String m118281g(String str, String str2) {
        return m118282h(str, str2, true);
    }

    /* renamed from: h */
    public static String m118282h(String str, String str2, boolean z11) {
        try {
            C16741a m89329r = C16741a.m89329r();
            C16742b m89345W = m89329r.m89345W(str, str2);
            if (m89329r.m89337H(m89345W)) {
                return m118279e(m89345W, z11);
            }
            return f112062a;
        } catch (NumberParseException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public static String m118283i(String str, String str2, boolean z11, int i11) {
        try {
            if (str.isEmpty()) {
                return "";
            }
            C16742b m89345W = C16741a.m89329r().m89345W(str, str2);
            boolean z12 = false;
            if (Objects.equals(Integer.valueOf(m89345W.m89362c()), 84)) {
                if (str.charAt(0) != '0') {
                    str = "0" + str;
                }
            } else {
                z12 = true;
                if (str.charAt(0) == '0') {
                    str = str.substring(1);
                }
            }
            return m118280f(str, String.valueOf(m89345W.m89362c()), z11, i11, Boolean.valueOf(z12));
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: j */
    private static String m118284j(C16742b c16742b) {
        if (c16742b.m89362c() == 84) {
            return m118279e(c16742b, true);
        }
        return m118286l(c16742b.m89368i(), C16741a.b.INTERNATIONAL);
    }

    /* renamed from: k */
    public static String m118285k(String str) {
        return m118286l(str, C16741a.b.E164);
    }

    /* renamed from: l */
    public static String m118286l(String str, C16741a.b bVar) {
        if (str != null) {
            try {
                if (str.trim().length() == 0) {
                    return f112062a;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        String m121704a5 = AbstractC23309i.m121704a5();
        C16741a m89329r = C16741a.m89329r();
        C16742b m89345W = m89329r.m89345W(str, m121704a5);
        if (m89329r.m89337H(m89345W)) {
            return m89329r.m89349l(m89345W, bVar);
        }
        return f112062a;
    }

    /* renamed from: m */
    public static String m118287m(String str) {
        try {
            C16742b m89345W = C16741a.m89329r().m89345W(str, AbstractC23309i.m121742b5());
            if (m89345W.m89362c() == 84) {
                String str2 = "0" + m89345W.m89365f();
                if (str2.length() < 6) {
                    return str;
                }
                return str2.substring(0, 3) + " " + str2.substring(3, 6) + " " + str2.substring(6);
            }
            String m118286l = m118286l(m89345W.m89368i(), C16741a.b.INTERNATIONAL);
            if (m118286l.equals(f112062a)) {
                return str;
            }
            return m118286l;
        } catch (NumberParseException e11) {
            e11.printStackTrace();
            return str;
        }
    }

    /* renamed from: n */
    public static long m118288n(String str) {
        if (str != null) {
            try {
                if (str.trim().length() == 0) {
                    return f112063b;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        String m121704a5 = AbstractC23309i.m121704a5();
        C16741a m89329r = C16741a.m89329r();
        C16742b m89345W = m89329r.m89345W(str, m121704a5);
        if (m89329r.m89337H(m89345W)) {
            try {
                return Long.parseLong(m89345W.m89362c() + "" + m89345W.m89365f());
            } catch (Exception unused) {
                return f112063b;
            }
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused2) {
            return f112063b;
        }
    }

    /* renamed from: o */
    public static String m118289o(String str) {
        String m118276b = m118276b(str, false, false);
        if (!TextUtils.isEmpty(m118276b) && !m118276b.equals(f112062a)) {
            return m118276b;
        }
        return str;
    }

    /* renamed from: p */
    public static String m118290p(String str, String str2) {
        String m118276b;
        if (TextUtils.isEmpty(str2)) {
            m118276b = str;
        } else {
            m118276b = m118276b(str, false, false);
        }
        if (!TextUtils.isEmpty(m118276b) && !m118276b.equals(f112062a)) {
            return m118276b;
        }
        return str;
    }

    /* renamed from: q */
    public static boolean m118291q(String str) {
        try {
            return m118293s(str).equalsIgnoreCase(m118293s(m118286l(str, C16741a.b.E164)));
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m118292r(CharSequence charSequence) {
        String str;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Matcher matcher = Patterns.PHONE.matcher(charSequence);
            if (matcher.find()) {
                str = matcher.group(0);
                if (str != null) {
                    return "";
                }
                return str;
            }
        }
        str = "";
        if (str != null) {
        }
    }

    /* renamed from: s */
    public static String m118293s(String str) {
        try {
            char[] charArray = str.toCharArray();
            StringBuilder sb2 = new StringBuilder();
            for (char c11 : charArray) {
                if (c11 >= '0' && c11 <= '9') {
                    sb2.append(c11);
                }
            }
            return sb2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}
