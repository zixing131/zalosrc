package com.zing.zalo.utils.phonenumbers;

import com.zing.zalo.utils.phonenumbers.C16742b;
import com.zing.zalo.utils.phonenumbers.NumberParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ve0.AbstractC27992a;
import ve0.C27994c;
import ve0.C27995d;
import ve0.C27997f;
import ve0.InterfaceC27993b;
import we0.C28947c;
import we0.C28948d;
import we0.InterfaceC28946b;
import xe0.C29607a;
import ze0.C31805k;
import ze0.InterfaceC31804j;

/* renamed from: com.zing.zalo.utils.phonenumbers.a */
/* loaded from: classes4.dex */
public class C16741a {

    /* renamed from: A */
    static final String f84917A;

    /* renamed from: B */
    private static final Pattern f84918B;

    /* renamed from: C */
    private static final Pattern f84919C;

    /* renamed from: D */
    static final Pattern f84920D;

    /* renamed from: E */
    private static final Pattern f84921E;

    /* renamed from: F */
    private static final Pattern f84922F;

    /* renamed from: G */
    private static C16741a f84923G;

    /* renamed from: h */
    private static final Logger f84924h = Logger.getLogger(C16741a.class.getName());

    /* renamed from: i */
    private static final Map f84925i;

    /* renamed from: j */
    private static final Set f84926j;

    /* renamed from: k */
    private static final Set f84927k;

    /* renamed from: l */
    private static final Map f84928l;

    /* renamed from: m */
    private static final Map f84929m;

    /* renamed from: n */
    private static final Map f84930n;

    /* renamed from: o */
    private static final Map f84931o;

    /* renamed from: p */
    private static final Pattern f84932p;

    /* renamed from: q */
    private static final String f84933q;

    /* renamed from: r */
    static final Pattern f84934r;

    /* renamed from: s */
    private static final Pattern f84935s;

    /* renamed from: t */
    private static final Pattern f84936t;

    /* renamed from: u */
    private static final Pattern f84937u;

    /* renamed from: v */
    static final Pattern f84938v;

    /* renamed from: w */
    static final Pattern f84939w;

    /* renamed from: x */
    private static final Pattern f84940x;

    /* renamed from: y */
    private static final String f84941y;

    /* renamed from: z */
    private static final String f84942z;

    /* renamed from: a */
    private final InterfaceC31804j f84943a;

    /* renamed from: b */
    private final Map f84944b;

    /* renamed from: c */
    private final InterfaceC28946b f84945c = C28947c.m144591b();

    /* renamed from: d */
    private final Set f84946d = new HashSet(35);

    /* renamed from: e */
    private final C28948d f84947e = new C28948d(100);

    /* renamed from: f */
    private final Set f84948f = new HashSet(320);

    /* renamed from: g */
    private final Set f84949g = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.utils.phonenumbers.a$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f84950a;

        /* renamed from: b */
        static final /* synthetic */ int[] f84951b;

        /* renamed from: c */
        static final /* synthetic */ int[] f84952c;

        static {
            int[] iArr = new int[c.values().length];
            f84952c = iArr;
            try {
                iArr[c.PREMIUM_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84952c[c.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84952c[c.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84952c[c.FIXED_LINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84952c[c.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f84952c[c.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f84952c[c.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f84952c[c.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f84952c[c.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f84952c[c.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f84952c[c.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[b.values().length];
            f84951b = iArr2;
            try {
                iArr2[b.E164.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f84951b[b.INTERNATIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f84951b[b.RFC3966.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f84951b[b.NATIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[C16742b.a.values().length];
            f84950a = iArr3;
            try {
                iArr3[C16742b.a.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f84950a[C16742b.a.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f84950a[C16742b.a.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f84950a[C16742b.a.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    /* renamed from: com.zing.zalo.utils.phonenumbers.a$b */
    /* loaded from: classes4.dex */
    public enum b {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    /* renamed from: com.zing.zalo.utils.phonenumbers.a$c */
    /* loaded from: classes4.dex */
    public enum c {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    /* renamed from: com.zing.zalo.utils.phonenumbers.a$d */
    /* loaded from: classes4.dex */
    public enum d {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        f84925i = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        f84926j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f84927k = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        f84929m = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f84930n = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f84928l = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        Iterator it = unmodifiableMap.keySet().iterator();
        while (it.hasNext()) {
            char charValue = ((Character) it.next()).charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue)), Character.valueOf(charValue));
            hashMap6.put(Character.valueOf(charValue), Character.valueOf(charValue));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        f84931o = Collections.unmodifiableMap(hashMap6);
        f84932p = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb2 = new StringBuilder();
        Map map = f84929m;
        sb2.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb2.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb3 = sb2.toString();
        f84933q = sb3;
        f84934r = Pattern.compile("[+＋]+");
        f84935s = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        f84936t = Pattern.compile("(\\p{Nd})");
        f84937u = Pattern.compile("[+＋\\p{Nd}]");
        f84938v = Pattern.compile("[\\\\/] *x");
        f84939w = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        f84940x = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + sb3 + "\\p{Nd}]*";
        f84941y = str;
        String m89316d = m89316d(true);
        f84942z = m89316d;
        f84917A = m89316d(false);
        f84918B = Pattern.compile("(?:" + m89316d + ")$", 66);
        f84919C = Pattern.compile(str + "(?:" + m89316d + ")?", 66);
        f84920D = Pattern.compile("(\\D+)");
        f84921E = Pattern.compile("(\\$\\d)");
        f84922F = Pattern.compile("\\(?\\$1\\)?");
        f84923G = null;
    }

    C16741a(InterfaceC31804j interfaceC31804j, Map map) {
        this.f84943a = interfaceC31804j;
        this.f84944b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f84949g.add((Integer) entry.getKey());
            } else {
                this.f84948f.addAll(list);
            }
        }
        if (this.f84948f.remove("001")) {
            f84924h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f84946d.addAll((Collection) map.get(1));
    }

    /* renamed from: A */
    private String m89300A(C16742b c16742b, List list) {
        String m89353v = m89353v(c16742b);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C27995d m89352t = m89352t(str);
            if (m89352t.m141093x()) {
                if (this.f84947e.m144593a(m89352t.m141077h()).matcher(m89353v).lookingAt()) {
                    return str;
                }
            } else if (m89331x(m89353v, m89352t) != c.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: B */
    private boolean m89301B(int i11) {
        return this.f84944b.containsKey(Integer.valueOf(i11));
    }

    /* renamed from: J */
    private boolean m89302J(String str) {
        if (str != null && this.f84948f.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    static boolean m89303K(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return f84919C.matcher(charSequence).matches();
    }

    /* renamed from: L */
    private void m89304L(C16742b c16742b, C27995d c27995d, b bVar, StringBuilder sb2) {
        if (c16742b.m89370k() && c16742b.m89364e().length() > 0) {
            if (bVar == b.RFC3966) {
                sb2.append(";ext=");
                sb2.append(c16742b.m89364e());
            } else if (c27995d.m141094y()) {
                sb2.append(c27995d.m141085p());
                sb2.append(c16742b.m89364e());
            } else {
                sb2.append(" ext. ");
                sb2.append(c16742b.m89364e());
            }
        }
    }

    /* renamed from: Q */
    static StringBuilder m89305Q(StringBuilder sb2) {
        if (f84940x.matcher(sb2).matches()) {
            sb2.replace(0, sb2.length(), m89308T(sb2, f84930n, true));
        } else {
            sb2.replace(0, sb2.length(), m89307S(sb2));
        }
        return sb2;
    }

    /* renamed from: R */
    static StringBuilder m89306R(CharSequence charSequence, boolean z11) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb2.append(digit);
            } else if (z11) {
                sb2.append(charAt);
            }
        }
        return sb2;
    }

    /* renamed from: S */
    public static String m89307S(CharSequence charSequence) {
        return m89306R(charSequence, false).toString();
    }

    /* renamed from: T */
    private static String m89308T(CharSequence charSequence, Map map, boolean z11) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char charAt = charSequence.charAt(i11);
            Character ch2 = (Character) map.get(Character.valueOf(Character.toUpperCase(charAt)));
            if (ch2 != null) {
                sb2.append(ch2);
            } else if (!z11) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    /* renamed from: Y */
    private void m89309Y(CharSequence charSequence, String str, boolean z11, boolean z12, C16742b c16742b) {
        int m89339M;
        if (charSequence != null) {
            if (charSequence.length() <= 250) {
                StringBuilder sb2 = new StringBuilder();
                String charSequence2 = charSequence.toString();
                m89311a(charSequence2, sb2);
                if (m89303K(sb2)) {
                    if (z12 && !m89313b(sb2, str)) {
                        throw new NumberParseException(NumberParseException.EnumC16740a.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
                    }
                    if (z11) {
                        c16742b.m89383x(charSequence2);
                    }
                    String m89340N = m89340N(sb2);
                    if (m89340N.length() > 0) {
                        c16742b.m89378s(m89340N);
                    }
                    C27995d m89352t = m89352t(str);
                    StringBuilder sb3 = new StringBuilder();
                    try {
                        m89339M = m89339M(sb2, m89352t, sb3, z11, c16742b);
                    } catch (NumberParseException e11) {
                        Matcher matcher = f84934r.matcher(sb2);
                        if (e11.m89298a() == NumberParseException.EnumC16740a.INVALID_COUNTRY_CODE && matcher.lookingAt()) {
                            m89339M = m89339M(sb2.substring(matcher.end()), m89352t, sb3, z11, c16742b);
                            if (m89339M == 0) {
                                throw new NumberParseException(NumberParseException.EnumC16740a.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                            }
                        } else {
                            throw new NumberParseException(e11.m89298a(), e11.getMessage());
                        }
                    }
                    if (m89339M != 0) {
                        String m89355y = m89355y(m89339M);
                        if (!m89355y.equals(str)) {
                            m89352t = m89330u(m89339M, m89355y);
                        }
                    } else {
                        sb3.append((CharSequence) m89305Q(sb2));
                        if (str != null) {
                            c16742b.m89376q(m89352t.m141065a());
                        } else if (z11) {
                            c16742b.m89360a();
                        }
                    }
                    if (sb3.length() >= 2) {
                        if (m89352t != null) {
                            StringBuilder sb4 = new StringBuilder();
                            StringBuilder sb5 = new StringBuilder(sb3);
                            m89342P(sb5, m89352t, sb4);
                            d m89317d0 = m89317d0(sb5, m89352t);
                            if (m89317d0 != d.TOO_SHORT && m89317d0 != d.IS_POSSIBLE_LOCAL_ONLY && m89317d0 != d.INVALID_LENGTH) {
                                if (z11 && sb4.length() > 0) {
                                    c16742b.m89382w(sb4.toString());
                                }
                                sb3 = sb5;
                            }
                        }
                        int length = sb3.length();
                        if (length >= 2) {
                            if (length <= 17) {
                                m89315c0(sb3, c16742b);
                                c16742b.m89380u(Long.parseLong(sb3.toString()));
                                return;
                            }
                            throw new NumberParseException(NumberParseException.EnumC16740a.TOO_LONG, "The string supplied is too long to be a phone number.");
                        }
                        throw new NumberParseException(NumberParseException.EnumC16740a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                    }
                    throw new NumberParseException(NumberParseException.EnumC16740a.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                }
                throw new NumberParseException(NumberParseException.EnumC16740a.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            }
            throw new NumberParseException(NumberParseException.EnumC16740a.TOO_LONG, "The string supplied was too long to parse.");
        }
        throw new NumberParseException(NumberParseException.EnumC16740a.NOT_A_NUMBER, "The phone number supplied was null.");
    }

    /* renamed from: Z */
    private boolean m89310Z(Pattern pattern, StringBuilder sb2) {
        Matcher matcher = pattern.matcher(sb2);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        Matcher matcher2 = f84936t.matcher(sb2.substring(end));
        if (matcher2.find() && m89307S(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb2.delete(0, end);
        return true;
    }

    /* renamed from: a */
    private void m89311a(String str, StringBuilder sb2) {
        int i11;
        int indexOf = str.indexOf(";phone-context=");
        if (indexOf >= 0) {
            int i12 = indexOf + 15;
            if (i12 < str.length() - 1 && str.charAt(i12) == '+') {
                int indexOf2 = str.indexOf(59, i12);
                if (indexOf2 > 0) {
                    sb2.append(str.substring(i12, indexOf2));
                } else {
                    sb2.append(str.substring(i12));
                }
            }
            int indexOf3 = str.indexOf("tel:");
            if (indexOf3 >= 0) {
                i11 = indexOf3 + 4;
            } else {
                i11 = 0;
            }
            sb2.append(str.substring(i11, indexOf));
        } else {
            sb2.append(m89324k(str));
        }
        int indexOf4 = sb2.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb2.delete(indexOf4, sb2.length());
        }
    }

    /* renamed from: a0 */
    private void m89312a0(int i11, b bVar, StringBuilder sb2) {
        int i12 = a.f84951b[bVar.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    return;
                }
                sb2.insert(0, "-").insert(0, i11).insert(0, '+').insert(0, "tel:");
                return;
            }
            sb2.insert(0, " ").insert(0, i11).insert(0, '+');
            return;
        }
        sb2.insert(0, i11).insert(0, '+');
    }

    /* renamed from: b */
    private boolean m89313b(CharSequence charSequence, String str) {
        if (m89302J(str)) {
            return true;
        }
        if (charSequence != null && charSequence.length() != 0 && f84934r.matcher(charSequence).lookingAt()) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    static synchronized void m89314b0(C16741a c16741a) {
        synchronized (C16741a.class) {
            f84923G = c16741a;
        }
    }

    /* renamed from: c0 */
    static void m89315c0(CharSequence charSequence, C16742b c16742b) {
        if (charSequence.length() > 1 && charSequence.charAt(0) == '0') {
            c16742b.m89379t(true);
            int i11 = 1;
            while (i11 < charSequence.length() - 1 && charSequence.charAt(i11) == '0') {
                i11++;
            }
            if (i11 != 1) {
                c16742b.m89381v(i11);
            }
        }
    }

    /* renamed from: d */
    private static String m89316d(boolean z11) {
        String str = (";ext=" + m89323i(20)) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + m89323i(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + m89323i(9) + "#?") + "|" + ("[- ]+" + m89323i(6) + "#");
        if (z11) {
            return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + m89323i(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + m89323i(9) + "#?");
        }
        return str;
    }

    /* renamed from: d0 */
    private d m89317d0(CharSequence charSequence, C27995d c27995d) {
        return m89319e0(charSequence, c27995d, c.UNKNOWN);
    }

    /* renamed from: e */
    public static C16741a m89318e(InterfaceC27993b interfaceC27993b) {
        if (interfaceC27993b != null) {
            return m89320f(new C31805k(C29607a.m147172a().m147175d(), interfaceC27993b, C29607a.m147172a().m147174c()));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    /* renamed from: e0 */
    private d m89319e0(CharSequence charSequence, C27995d c27995d, c cVar) {
        List m141101d;
        List m141101d2;
        C27997f m89354w = m89354w(c27995d, cVar);
        if (m89354w.m141101d().isEmpty()) {
            m141101d = c27995d.m141069c().m141101d();
        } else {
            m141101d = m89354w.m141101d();
        }
        List m141103f = m89354w.m141103f();
        if (cVar == c.FIXED_LINE_OR_MOBILE) {
            if (!m89321g(m89354w(c27995d, c.FIXED_LINE))) {
                return m89319e0(charSequence, c27995d, c.MOBILE);
            }
            C27997f m89354w2 = m89354w(c27995d, c.MOBILE);
            if (m89321g(m89354w2)) {
                ArrayList arrayList = new ArrayList(m141101d);
                if (m89354w2.m141100c() == 0) {
                    m141101d2 = c27995d.m141069c().m141101d();
                } else {
                    m141101d2 = m89354w2.m141101d();
                }
                arrayList.addAll(m141101d2);
                Collections.sort(arrayList);
                if (m141103f.isEmpty()) {
                    m141103f = m89354w2.m141103f();
                } else {
                    ArrayList arrayList2 = new ArrayList(m141103f);
                    arrayList2.addAll(m89354w2.m141103f());
                    Collections.sort(arrayList2);
                    m141103f = arrayList2;
                }
                m141101d = arrayList;
            }
        }
        if (((Integer) m141101d.get(0)).intValue() == -1) {
            return d.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (m141103f.contains(Integer.valueOf(length))) {
            return d.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = ((Integer) m141101d.get(0)).intValue();
        if (intValue == length) {
            return d.IS_POSSIBLE;
        }
        if (intValue > length) {
            return d.TOO_SHORT;
        }
        if (((Integer) m141101d.get(m141101d.size() - 1)).intValue() < length) {
            return d.TOO_LONG;
        }
        if (m141101d.subList(1, m141101d.size()).contains(Integer.valueOf(length))) {
            return d.IS_POSSIBLE;
        }
        return d.INVALID_LENGTH;
    }

    /* renamed from: f */
    private static C16741a m89320f(InterfaceC31804j interfaceC31804j) {
        if (interfaceC31804j != null) {
            return new C16741a(interfaceC31804j, AbstractC27992a.m141026a());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    /* renamed from: g */
    private static boolean m89321g(C27997f c27997f) {
        if (c27997f.m141100c() != 1 || c27997f.m141099b(0) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static void m89322h(C27995d c27995d, String str) {
        if (c27995d != null) {
        } else {
            throw new MissingMetadataException(str);
        }
    }

    /* renamed from: i */
    private static String m89323i(int i11) {
        return "(\\p{Nd}{1," + i11 + "})";
    }

    /* renamed from: k */
    static CharSequence m89324k(CharSequence charSequence) {
        Matcher matcher = f84937u.matcher(charSequence);
        if (matcher.find()) {
            CharSequence subSequence = charSequence.subSequence(matcher.start(), charSequence.length());
            Matcher matcher2 = f84939w.matcher(subSequence);
            if (matcher2.find()) {
                subSequence = subSequence.subSequence(0, matcher2.start());
            }
            Matcher matcher3 = f84938v.matcher(subSequence);
            if (matcher3.find()) {
                return subSequence.subSequence(0, matcher3.start());
            }
            return subSequence;
        }
        return "";
    }

    /* renamed from: n */
    private String m89325n(String str, C27995d c27995d, b bVar) {
        return m89326o(str, c27995d, bVar, null);
    }

    /* renamed from: o */
    private String m89326o(String str, C27995d c27995d, b bVar, CharSequence charSequence) {
        List m141082m;
        if (c27995d.m141076g().size() != 0 && bVar != b.NATIONAL) {
            m141082m = c27995d.m141076g();
        } else {
            m141082m = c27995d.m141082m();
        }
        C27994c m89347c = m89347c(m141082m, str);
        if (m89347c != null) {
            return m89327p(str, m89347c, bVar, charSequence);
        }
        return str;
    }

    /* renamed from: p */
    private String m89327p(String str, C27994c c27994c, b bVar, CharSequence charSequence) {
        String replaceAll;
        String format = c27994c.getFormat();
        Matcher matcher = this.f84947e.m144593a(c27994c.m141032e()).matcher(str);
        b bVar2 = b.NATIONAL;
        if (bVar == bVar2 && charSequence != null && charSequence.length() > 0 && c27994c.m141028a().length() > 0) {
            replaceAll = matcher.replaceAll(f84921E.matcher(format).replaceFirst(c27994c.m141028a().replace("$CC", charSequence)));
        } else {
            String m141031d = c27994c.m141031d();
            if (bVar == bVar2 && m141031d != null && m141031d.length() > 0) {
                replaceAll = matcher.replaceAll(f84921E.matcher(format).replaceFirst(m141031d));
            } else {
                replaceAll = matcher.replaceAll(format);
            }
        }
        if (bVar == b.RFC3966) {
            Matcher matcher2 = f84935s.matcher(replaceAll);
            if (matcher2.lookingAt()) {
                replaceAll = matcher2.replaceFirst("");
            }
            return matcher2.reset(replaceAll).replaceAll("-");
        }
        return replaceAll;
    }

    /* renamed from: q */
    private int m89328q(String str) {
        C27995d m89352t = m89352t(str);
        if (m89352t != null) {
            return m89352t.m141065a();
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    /* renamed from: r */
    public static synchronized C16741a m89329r() {
        C16741a c16741a;
        synchronized (C16741a.class) {
            try {
                if (f84923G == null) {
                    m89314b0(m89318e(C29607a.m147172a().m147173b()));
                }
                c16741a = f84923G;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c16741a;
    }

    /* renamed from: u */
    private C27995d m89330u(int i11, String str) {
        if ("001".equals(str)) {
            return m89351s(i11);
        }
        return m89352t(str);
    }

    /* renamed from: x */
    private c m89331x(String str, C27995d c27995d) {
        if (!m89332C(str, c27995d.m141069c())) {
            return c.UNKNOWN;
        }
        if (m89332C(str, c27995d.m141086q())) {
            return c.PREMIUM_RATE;
        }
        if (m89332C(str, c27995d.m141089t())) {
            return c.TOLL_FREE;
        }
        if (m89332C(str, c27995d.m141088s())) {
            return c.SHARED_COST;
        }
        if (m89332C(str, c27995d.m141092w())) {
            return c.VOIP;
        }
        if (m89332C(str, c27995d.m141084o())) {
            return c.PERSONAL_NUMBER;
        }
        if (m89332C(str, c27995d.m141083n())) {
            return c.PAGER;
        }
        if (m89332C(str, c27995d.m141090u())) {
            return c.UAN;
        }
        if (m89332C(str, c27995d.m141091v())) {
            return c.VOICEMAIL;
        }
        if (m89332C(str, c27995d.m141067b())) {
            if (c27995d.m141087r()) {
                return c.FIXED_LINE_OR_MOBILE;
            }
            if (m89332C(str, c27995d.m141078i())) {
                return c.FIXED_LINE_OR_MOBILE;
            }
            return c.FIXED_LINE;
        }
        if (!c27995d.m141087r() && m89332C(str, c27995d.m141078i())) {
            return c.MOBILE;
        }
        return c.UNKNOWN;
    }

    /* renamed from: C */
    boolean m89332C(String str, C27997f c27997f) {
        int length = str.length();
        List m141101d = c27997f.m141101d();
        if (m141101d.size() > 0 && !m141101d.contains(Integer.valueOf(length))) {
            return false;
        }
        return this.f84945c.mo144590a(str, c27997f, false);
    }

    /* renamed from: D */
    public boolean m89333D(C16742b c16742b) {
        d m89336G = m89336G(c16742b);
        if (m89336G != d.IS_POSSIBLE && m89336G != d.IS_POSSIBLE_LOCAL_ONLY) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public boolean m89334E(CharSequence charSequence, String str) {
        try {
            return m89333D(m89343U(charSequence, str));
        } catch (NumberParseException unused) {
            return false;
        }
    }

    /* renamed from: F */
    public d m89335F(C16742b c16742b, c cVar) {
        String m89353v = m89353v(c16742b);
        int m89362c = c16742b.m89362c();
        if (!m89301B(m89362c)) {
            return d.INVALID_COUNTRY_CODE;
        }
        return m89319e0(m89353v, m89330u(m89362c, m89355y(m89362c)), cVar);
    }

    /* renamed from: G */
    public d m89336G(C16742b c16742b) {
        return m89335F(c16742b, c.UNKNOWN);
    }

    /* renamed from: H */
    public boolean m89337H(C16742b c16742b) {
        return m89338I(c16742b, m89356z(c16742b));
    }

    /* renamed from: I */
    public boolean m89338I(C16742b c16742b, String str) {
        int m89362c = c16742b.m89362c();
        C27995d m89330u = m89330u(m89362c, str);
        if (m89330u == null) {
            return false;
        }
        if ((!"001".equals(str) && m89362c != m89328q(str)) || m89331x(m89353v(c16742b), m89330u) == c.UNKNOWN) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    int m89339M(CharSequence charSequence, C27995d c27995d, StringBuilder sb2, boolean z11, C16742b c16742b) {
        String str;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb3 = new StringBuilder(charSequence);
        if (c27995d != null) {
            str = c27995d.m141073e();
        } else {
            str = "NonMatch";
        }
        C16742b.a m89341O = m89341O(sb3, str);
        if (z11) {
            c16742b.m89377r(m89341O);
        }
        if (m89341O != C16742b.a.FROM_DEFAULT_COUNTRY) {
            if (sb3.length() > 2) {
                int m89348j = m89348j(sb3, sb2);
                if (m89348j != 0) {
                    c16742b.m89376q(m89348j);
                    return m89348j;
                }
                throw new NumberParseException(NumberParseException.EnumC16740a.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            throw new NumberParseException(NumberParseException.EnumC16740a.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (c27995d != null) {
            int m141065a = c27995d.m141065a();
            String valueOf = String.valueOf(m141065a);
            String sb4 = sb3.toString();
            if (sb4.startsWith(valueOf)) {
                StringBuilder sb5 = new StringBuilder(sb4.substring(valueOf.length()));
                C27997f m141069c = c27995d.m141069c();
                m89342P(sb5, c27995d, null);
                if ((!this.f84945c.mo144590a(sb3, m141069c, false) && this.f84945c.mo144590a(sb5, m141069c, false)) || m89317d0(sb3, c27995d) == d.TOO_LONG) {
                    sb2.append((CharSequence) sb5);
                    if (z11) {
                        c16742b.m89377r(C16742b.a.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                    }
                    c16742b.m89376q(m141065a);
                    return m141065a;
                }
            }
        }
        c16742b.m89376q(0);
        return 0;
    }

    /* renamed from: N */
    String m89340N(StringBuilder sb2) {
        Matcher matcher = f84918B.matcher(sb2);
        if (matcher.find() && m89303K(sb2.substring(0, matcher.start()))) {
            int groupCount = matcher.groupCount();
            for (int i11 = 1; i11 <= groupCount; i11++) {
                if (matcher.group(i11) != null) {
                    String group = matcher.group(i11);
                    sb2.delete(matcher.start(), sb2.length());
                    return group;
                }
            }
            return "";
        }
        return "";
    }

    /* renamed from: O */
    C16742b.a m89341O(StringBuilder sb2, String str) {
        if (sb2.length() == 0) {
            return C16742b.a.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = f84934r.matcher(sb2);
        if (matcher.lookingAt()) {
            sb2.delete(0, matcher.end());
            m89305Q(sb2);
            return C16742b.a.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern m144593a = this.f84947e.m144593a(str);
        m89305Q(sb2);
        if (m89310Z(m144593a, sb2)) {
            return C16742b.a.FROM_NUMBER_WITH_IDD;
        }
        return C16742b.a.FROM_DEFAULT_COUNTRY;
    }

    /* renamed from: P */
    boolean m89342P(StringBuilder sb2, C27995d c27995d, StringBuilder sb3) {
        int length = sb2.length();
        String m141079j = c27995d.m141079j();
        if (length != 0 && m141079j.length() != 0) {
            Matcher matcher = this.f84947e.m144593a(m141079j).matcher(sb2);
            if (matcher.lookingAt()) {
                C27997f m141069c = c27995d.m141069c();
                boolean mo144590a = this.f84945c.mo144590a(sb2, m141069c, false);
                int groupCount = matcher.groupCount();
                String m141080k = c27995d.m141080k();
                if (m141080k != null && m141080k.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb4 = new StringBuilder(sb2);
                    sb4.replace(0, length, matcher.replaceFirst(m141080k));
                    if (mo144590a && !this.f84945c.mo144590a(sb4.toString(), m141069c, false)) {
                        return false;
                    }
                    if (sb3 != null && groupCount > 1) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.replace(0, sb2.length(), sb4.toString());
                } else {
                    if (mo144590a && !this.f84945c.mo144590a(sb2.substring(matcher.end()), m141069c, false)) {
                        return false;
                    }
                    if (sb3 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb3.append(matcher.group(1));
                    }
                    sb2.delete(0, matcher.end());
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    public C16742b m89343U(CharSequence charSequence, String str) {
        C16742b c16742b = new C16742b();
        m89344V(charSequence, str, c16742b);
        return c16742b;
    }

    /* renamed from: V */
    public void m89344V(CharSequence charSequence, String str, C16742b c16742b) {
        m89309Y(charSequence, str, false, true, c16742b);
    }

    /* renamed from: W */
    public C16742b m89345W(CharSequence charSequence, String str) {
        C16742b c16742b = new C16742b();
        m89346X(charSequence, str, c16742b);
        return c16742b;
    }

    /* renamed from: X */
    public void m89346X(CharSequence charSequence, String str, C16742b c16742b) {
        m89309Y(charSequence, str, true, true, c16742b);
    }

    /* renamed from: c */
    C27994c m89347c(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27994c c27994c = (C27994c) it.next();
            int m141030c = c27994c.m141030c();
            if (m141030c == 0 || this.f84947e.m144593a(c27994c.m141029b(m141030c - 1)).matcher(str).lookingAt()) {
                if (this.f84947e.m144593a(c27994c.m141032e()).matcher(str).matches()) {
                    return c27994c;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    int m89348j(StringBuilder sb2, StringBuilder sb3) {
        if (sb2.length() != 0 && sb2.charAt(0) != '0') {
            int length = sb2.length();
            for (int i11 = 1; i11 <= 3 && i11 <= length; i11++) {
                int parseInt = Integer.parseInt(sb2.substring(0, i11));
                if (this.f84944b.containsKey(Integer.valueOf(parseInt))) {
                    sb3.append(sb2.substring(i11));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    /* renamed from: l */
    public String m89349l(C16742b c16742b, b bVar) {
        if (c16742b.m89365f() == 0 && c16742b.m89374o()) {
            String m89368i = c16742b.m89368i();
            if (m89368i.length() > 0) {
                return m89368i;
            }
        }
        StringBuilder sb2 = new StringBuilder(20);
        m89350m(c16742b, bVar, sb2);
        return sb2.toString();
    }

    /* renamed from: m */
    public void m89350m(C16742b c16742b, b bVar, StringBuilder sb2) {
        sb2.setLength(0);
        int m89362c = c16742b.m89362c();
        String m89353v = m89353v(c16742b);
        b bVar2 = b.E164;
        if (bVar == bVar2) {
            sb2.append(m89353v);
            m89312a0(m89362c, bVar2, sb2);
        } else {
            if (!m89301B(m89362c)) {
                sb2.append(m89353v);
                return;
            }
            C27995d m89330u = m89330u(m89362c, m89355y(m89362c));
            sb2.append(m89325n(m89353v, m89330u, bVar));
            m89304L(c16742b, m89330u, bVar, sb2);
            m89312a0(m89362c, bVar, sb2);
        }
    }

    /* renamed from: s */
    C27995d m89351s(int i11) {
        if (!this.f84949g.contains(Integer.valueOf(i11))) {
            return null;
        }
        C27995d mo152837b = this.f84943a.mo152837b(i11);
        m89322h(mo152837b, "Missing metadata for country code " + i11);
        return mo152837b;
    }

    /* renamed from: t */
    C27995d m89352t(String str) {
        if (!m89302J(str)) {
            return null;
        }
        C27995d mo152836a = this.f84943a.mo152836a(str);
        m89322h(mo152836a, "Missing metadata for region code " + str);
        return mo152836a;
    }

    /* renamed from: v */
    public String m89353v(C16742b c16742b) {
        StringBuilder sb2 = new StringBuilder();
        if (c16742b.m89375p() && c16742b.m89366g() > 0) {
            char[] cArr = new char[c16742b.m89366g()];
            Arrays.fill(cArr, '0');
            sb2.append(new String(cArr));
        }
        sb2.append(c16742b.m89365f());
        return sb2.toString();
    }

    /* renamed from: w */
    C27997f m89354w(C27995d c27995d, c cVar) {
        switch (a.f84952c[cVar.ordinal()]) {
            case 1:
                return c27995d.m141086q();
            case 2:
                return c27995d.m141089t();
            case 3:
                return c27995d.m141078i();
            case 4:
            case 5:
                return c27995d.m141067b();
            case 6:
                return c27995d.m141088s();
            case 7:
                return c27995d.m141092w();
            case 8:
                return c27995d.m141084o();
            case 9:
                return c27995d.m141083n();
            case 10:
                return c27995d.m141090u();
            case 11:
                return c27995d.m141091v();
            default:
                return c27995d.m141069c();
        }
    }

    /* renamed from: y */
    public String m89355y(int i11) {
        List list = (List) this.f84944b.get(Integer.valueOf(i11));
        if (list == null) {
            return "ZZ";
        }
        return (String) list.get(0);
    }

    /* renamed from: z */
    public String m89356z(C16742b c16742b) {
        int m89362c = c16742b.m89362c();
        List list = (List) this.f84944b.get(Integer.valueOf(m89362c));
        if (list == null) {
            f84924h.log(Level.INFO, "Missing/invalid country_code (" + m89362c + ")");
            return null;
        }
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        return m89300A(c16742b, list);
    }
}
