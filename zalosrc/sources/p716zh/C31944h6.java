package p716zh;

import am.AbstractC0924m0;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Patterns;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23152n3;
import mm0.AbstractC23350e;
import nb0.C23671b;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONArray;
import p148f3.C18710b;
import p227i3.C20215s;
import p542ub.InterfaceC27218a;
import p560uw.EnumC27374a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p716zh.C31884d6;
import p716zh.C31944h6;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

/* renamed from: zh.h6 */
/* loaded from: classes3.dex */
public final class C31944h6 {

    /* renamed from: a */
    public static final C31944h6 f146774a = new C31944h6();

    /* renamed from: b */
    private static final Pattern f146775b;

    /* renamed from: c */
    private static final Pattern f146776c;

    /* renamed from: d */
    private static final Pattern f146777d;

    /* renamed from: e */
    private static final Pattern f146778e;

    /* renamed from: f */
    private static final Pattern f146779f;

    /* renamed from: g */
    private static final Pattern f146780g;

    /* renamed from: h */
    private static final Pattern f146781h;

    /* renamed from: i */
    private static final Pattern f146782i;

    /* renamed from: j */
    private static final Pattern f146783j;

    /* renamed from: k */
    private static final InterfaceC29232g f146784k;

    /* renamed from: l */
    private static final InterfaceC29232g f146785l;

    /* renamed from: m */
    private static final ArrayList f146786m;

    /* renamed from: n */
    private static final Linkify.MatchFilter f146787n;

    /* renamed from: zh.h6$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        String mo152986a(String str);
    }

    /* renamed from: zh.h6$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public String f146788a;

        /* renamed from: b */
        public int f146789b;

        /* renamed from: c */
        public int f146790c;

        /* renamed from: d */
        public String f146791d;

        /* renamed from: e */
        public int f146792e;

        /* renamed from: f */
        public boolean f146793f;

        /* renamed from: g */
        public EnumC27374a f146794g = EnumC27374a.f128964q;
    }

    /* renamed from: zh.h6$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final Map f146795a;

        /* renamed from: b */
        private final String f146796b;

        /* renamed from: c */
        private String f146797c;

        /* renamed from: zh.h6$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public c(Map map, String str, String str2) {
            AbstractC19074t.m100208f(map, "values");
            this.f146795a = map;
            this.f146796b = str;
            this.f146797c = str2;
        }

        /* renamed from: a */
        public final String m153561a() {
            return this.f146797c;
        }

        /* renamed from: b */
        public final String m153562b() {
            return this.f146796b;
        }

        /* renamed from: c */
        public final Map m153563c() {
            return this.f146795a;
        }

        /* renamed from: d */
        public final boolean m153564d() {
            String str;
            String str2;
            String str3;
            String str4 = (String) this.f146795a.get("title");
            if ((str4 != null && str4.length() > 0) || (((str = (String) this.f146795a.get("description")) != null && str.length() > 0) || (((str2 = (String) this.f146795a.get("image")) != null && str2.length() > 0) || ((str3 = this.f146796b) != null && str3.length() > 0)))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: zh.h6$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f146798q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C31944h6.m153522G();
        }
    }

    /* renamed from: zh.h6$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f146799q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return C31944h6.m153523H();
        }
    }

    static {
        ArrayList m131500h;
        Pattern compile = Pattern.compile("<\\s*meta[^>]*(name|property)\\s*=\\s*(([\"']\\s*(og:)?([^\"']+)[\"'])|((og:)?([^\"'\\s]+)))[^>]*/?\\s*>");
        AbstractC19074t.m100207e(compile, "compile(...)");
        f146776c = compile;
        Pattern compile2 = Pattern.compile("<\\s*meta[^>]*property\\s*=\\s*[\"']\\s*article:([^\"']+)[\"'][^>]*/?\\s*>");
        AbstractC19074t.m100207e(compile2, "compile(...)");
        f146777d = compile2;
        Pattern compile3 = Pattern.compile("content\\s*=\\s*(([\"']([^\"]*)[\"'])|([^\"'\\s>]*))");
        AbstractC19074t.m100207e(compile3, "compile(...)");
        f146778e = compile3;
        Pattern compile4 = Pattern.compile("<\\s*title[^>]*>(.*)<\\s*/title[^>]*>");
        AbstractC19074t.m100207e(compile4, "compile(...)");
        f146779f = compile4;
        f146780g = Pattern.compile("<\\s*link[^>]*rel\\s*=\\s*\".*icon.*\"[^>]*>");
        f146781h = Pattern.compile("href\\s*=\\s*\"([^\"]*)\"");
        Pattern compile5 = Pattern.compile("^(https?://)?([^/]+).*$");
        AbstractC19074t.m100207e(compile5, "compile(...)");
        f146782i = compile5;
        Pattern compile6 = Pattern.compile("^[\\x00-\\x7F]*$");
        AbstractC19074t.m100207e(compile6, "compile(...)");
        f146783j = compile6;
        f146784k = AbstractC29233h.m145990a(d.f146798q);
        f146785l = AbstractC29233h.m145990a(e.f146799q);
        m131500h = AbstractC25368s.m131500h("www.zaloapp.com", "www.zalo.me", "zaloapp.com", "zalo.me");
        f146786m = m131500h;
        f146787n = new Linkify.MatchFilter() { // from class: zh.g6
            @Override // android.text.util.Linkify.MatchFilter
            public final boolean acceptMatch(CharSequence charSequence, int i11, int i12) {
                boolean m153533R;
                m153533R = C31944h6.m153533R(charSequence, i11, i12);
                return m153533R;
            }
        };
        if (Build.VERSION.SDK_INT < 26) {
            String str = "a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]";
            Pattern compile7 = Pattern.compile("(((?:(?i:http|https|rtsp)://(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + ("(" + ("(" + ("[" + str + "](?:[" + str + "_\\-]{0,61}[" + str + "]){0,1}") + "\\.)+" + ("(xn\\-\\-[\\w\\-]{0,58}\\w|[" + ("a-zA-Z[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]") + "]{2,63})")) + "|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))") + ")(?:\\:\\d{1,5})?)(" + ("[/\\?](?:(?:[" + str + ";/\\?:@&=#~\\-\\.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*") + ")?(?:\\b|$|^))");
            AbstractC19074t.m100207e(compile7, "compile(...)");
            f146775b = compile7;
            return;
        }
        Pattern pattern = Patterns.WEB_URL;
        AbstractC19074t.m100207e(pattern, "WEB_URL");
        f146775b = pattern;
    }

    private C31944h6() {
    }

    /* renamed from: A */
    public static final boolean m153516A(String str) {
        if (AbstractC0924m0.m3481U9() && !m153520E(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public static final boolean m153517B(String str) {
        List m153553s;
        String m153552r;
        boolean m127149O;
        int m127173b0;
        if (str != null && str.length() != 0 && (m153553s = m153553s()) != null && !m153553s.isEmpty() && (m153552r = m153552r(str)) != null && m153552r.length() != 0) {
            List<String> m153553s2 = m153553s();
            AbstractC19074t.m100205c(m153553s2);
            for (String str2 : m153553s2) {
                m127149O = AbstractC24342w.m127149O(m153552r, str2, false, 2, null);
                if (m127149O) {
                    m127173b0 = AbstractC24342w.m127173b0(m153552r, str2, 0, false, 6, null);
                    if (m127173b0 == m153552r.length() - str2.length()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static final boolean m153518C(boolean z11) {
        if (z11 && !AbstractC0924m0.m4048nc()) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static final boolean m153519D(String str) {
        boolean m127149O;
        boolean m127120J;
        boolean m127120J2;
        boolean m127120J3;
        List m153551q;
        String m127114D;
        String m127114D2;
        String m127114D3;
        if (str != null && str.length() != 0) {
            m127149O = AbstractC24342w.m127149O(str, " ", false, 2, null);
            if (m127149O) {
                return false;
            }
            try {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                m127120J = AbstractC24341v.m127120J(lowerCase, "http://", false, 2, null);
                if (!m127120J) {
                    m127120J2 = AbstractC24341v.m127120J(lowerCase, "https://", false, 2, null);
                    if (!m127120J2) {
                        m127120J3 = AbstractC24341v.m127120J(lowerCase, "www.", false, 2, null);
                        if (m127120J3 || (m153551q = m153551q()) == null) {
                            return true;
                        }
                        if (!m153551q.isEmpty()) {
                            m127114D = AbstractC24341v.m127114D(lowerCase, "https://", "", false, 4, null);
                            m127114D2 = AbstractC24341v.m127114D(m127114D, "http://", "", false, 4, null);
                            m127114D3 = AbstractC24341v.m127114D(m127114D2, "www.", "", false, 4, null);
                            String[] strArr = (String[]) new C24329j("\\.").m127021i(((String[]) new C24329j("/").m127021i(m127114D3, 0).toArray(new String[0]))[0], 0).toArray(new String[0]);
                            if (strArr.length < 2) {
                                return false;
                            }
                            return m153551q.contains(((String[]) new C24329j(":").m127021i(strArr[strArr.length - 1], 0).toArray(new String[0]))[0]);
                        }
                        return false;
                    }
                }
                return true;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return false;
    }

    /* renamed from: E */
    public static final boolean m153520E(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
        String m153552r = m153552r(lowerCase);
        if (m153552r == null || m153552r.length() == 0 || !f146783j.matcher(m153552r).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    public static final boolean m153521F(String str) {
        AbstractC19074t.m100208f(str, "message");
        EnumC27374a m153546l = m153546l(str);
        if (m153546l != EnumC27374a.f128967t && m153546l != EnumC27374a.f128968u) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public static final List m153522G() {
        try {
            String m2892A0 = AbstractC0924m0.m2892A0();
            AbstractC19074t.m100205c(m2892A0);
            if (m2892A0.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(m2892A0);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(jSONArray.getString(i11));
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: H */
    public static final List m153523H() {
        try {
            String m2921B0 = AbstractC0924m0.m2921B0();
            AbstractC19074t.m100205c(m2921B0);
            if (m2921B0.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(m2921B0);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String string = jSONArray.getString(i11);
                AbstractC19074t.m100207e(string, "getString(...)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: I */
    private final String m153524I(String str, String[] strArr) {
        boolean z11;
        boolean z12;
        boolean m127129y;
        boolean m127129y2;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                String str2 = strArr[i11];
                m127129y = AbstractC24341v.m127129y(str, 0, str2, 0, str2.length(), true);
                if (m127129y) {
                    m127129y2 = AbstractC24341v.m127129y(str, 0, str2, 0, str2.length(), false);
                    if (!m127129y2) {
                        String substring = str.substring(str2.length());
                        AbstractC19074t.m100207e(substring, "substring(...)");
                        str = str2 + substring;
                    }
                    z11 = true;
                } else {
                    i11++;
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (!z11) {
            if (strArr.length == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                return strArr[0] + str;
            }
            return str;
        }
        return str;
    }

    /* renamed from: J */
    private final String m153525J(String str) {
        if (str != null && str.length() != 0) {
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                int digit = Character.digit(charAt, 10);
                if (digit != -1) {
                    sb2.append(digit);
                } else if (sb2.length() == 0 && charAt == '+') {
                    sb2.append(charAt);
                } else if (('a' <= charAt && charAt < '{') || ('A' <= charAt && charAt < '[')) {
                    return m153525J(PhoneNumberUtils.convertKeypadLettersToDigits(str));
                }
            }
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "toString(...)");
            return sb3;
        }
        return "";
    }

    /* renamed from: K */
    public static final void m153526K(InterfaceC27218a interfaceC27218a, String str, int i11, String str2, int i12) {
        AbstractC19074t.m100208f(interfaceC27218a, "chatActivity");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "sourceParam");
        try {
            if (m153542h(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", str);
                bundle.putInt("EXTRA_SOURCE_LINK", i11);
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("EXTRA_SOURCE_PARAM", str2);
                }
                ZaloWebView.Companion.m87172G(interfaceC27218a, str, bundle, i12);
                return;
            }
            AbstractC23152n3.m119050j0(interfaceC27218a.getContext(), str);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: L */
    public static /* synthetic */ void m153527L(InterfaceC27218a interfaceC27218a, String str, int i11, String str2, int i12, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            i12 = 0;
        }
        m153526K(interfaceC27218a, str, i11, str2, i12);
    }

    /* renamed from: M */
    public static final c m153528M(String str, a aVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        AbstractC19074t.m100208f(aVar, "htmlDecoder");
        if (str == null) {
            Map emptyMap = Collections.emptyMap();
            AbstractC19074t.m100207e(emptyMap, "emptyMap(...)");
            return new c(emptyMap, null, null);
        }
        HashMap hashMap = new HashMap();
        Matcher matcher = f146776c.matcher(str);
        AbstractC19074t.m100207e(matcher, "matcher(...)");
        while (true) {
            str2 = "";
            if (!matcher.find()) {
                break;
            }
            String group = matcher.group();
            AbstractC19074t.m100207e(group, "group(...)");
            if (matcher.groupCount() > 0) {
                int i11 = 5;
                String group2 = matcher.group(5);
                if (group2 == null || group2.length() == 0) {
                    i11 = 8;
                }
                str6 = matcher.group(i11);
            } else {
                str6 = null;
            }
            if (str6 != null) {
                Matcher matcher2 = f146778e.matcher(group);
                AbstractC19074t.m100207e(matcher2, "matcher(...)");
                if (matcher2.find() && matcher2.groupCount() > 0) {
                    String group3 = matcher2.group(3);
                    if (group3 != null && group3.length() != 0) {
                        String group4 = matcher2.group(3);
                        AbstractC19074t.m100207e(group4, "group(...)");
                        str2 = aVar.mo152986a(group4);
                    } else {
                        String group5 = matcher2.group(4);
                        if (group5 != null && group5.length() != 0) {
                            String group6 = matcher2.group(4);
                            AbstractC19074t.m100207e(group6, "group(...)");
                            str2 = aVar.mo152986a(group6);
                        }
                    }
                    if (str2.length() > 0) {
                        String lowerCase = str6.toLowerCase(Locale.ROOT);
                        AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                        hashMap.put(lowerCase, str2);
                    }
                }
            }
        }
        Matcher matcher3 = f146777d.matcher(str);
        AbstractC19074t.m100207e(matcher3, "matcher(...)");
        while (matcher3.find()) {
            String group7 = matcher3.group();
            AbstractC19074t.m100207e(group7, "group(...)");
            if (matcher3.groupCount() > 0) {
                str4 = matcher3.group(1);
            } else {
                str4 = null;
            }
            if (str4 != null) {
                Matcher matcher4 = f146778e.matcher(group7);
                AbstractC19074t.m100207e(matcher4, "matcher(...)");
                if (matcher4.find() && matcher4.groupCount() > 0) {
                    String group8 = matcher4.group(3);
                    if (group8 != null && group8.length() != 0) {
                        String group9 = matcher4.group(3);
                        AbstractC19074t.m100207e(group9, "group(...)");
                        str5 = aVar.mo152986a(group9);
                    } else {
                        String group10 = matcher4.group(4);
                        if (group10 == null || group10.length() == 0) {
                            str5 = "";
                        } else {
                            String group11 = matcher4.group(4);
                            AbstractC19074t.m100207e(group11, "group(...)");
                            str5 = aVar.mo152986a(group11);
                        }
                    }
                    if (str5.length() > 0) {
                        String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                        AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
                        hashMap.put(lowerCase2, str5);
                    }
                }
            }
        }
        Matcher matcher5 = f146779f.matcher(str);
        AbstractC19074t.m100207e(matcher5, "matcher(...)");
        if (!matcher5.find() || matcher5.groupCount() <= 0) {
            str3 = "";
        } else {
            String group12 = matcher5.group(1);
            AbstractC19074t.m100205c(group12);
            str3 = aVar.mo152986a(group12);
        }
        Matcher matcher6 = f146780g.matcher(str);
        if (matcher6.find()) {
            Matcher matcher7 = f146781h.matcher(matcher6.group());
            if (matcher7.find() && matcher7.groupCount() > 0) {
                str2 = matcher7.group(1);
                AbstractC19074t.m100205c(str2);
            }
        }
        return new c(hashMap, str3, str2);
    }

    /* renamed from: N */
    private final void m153529N(ArrayList arrayList) {
        int i11;
        int i12;
        int i13;
        Collections.sort(arrayList, new Comparator() { // from class: zh.f6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m153530O;
                m153530O = C31944h6.m153530O((C31944h6.b) obj, (C31944h6.b) obj2);
                return m153530O;
            }
        });
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size - 1) {
            Object obj = arrayList.get(i14);
            AbstractC19074t.m100207e(obj, "get(...)");
            b bVar = (b) obj;
            int i15 = i14 + 1;
            Object obj2 = arrayList.get(i15);
            AbstractC19074t.m100207e(obj2, "get(...)");
            b bVar2 = (b) obj2;
            int i16 = bVar.f146789b;
            int i17 = bVar2.f146789b;
            if (i16 <= i17 && (i11 = bVar.f146790c) > i17) {
                if (bVar.f146792e == 8 || (i12 = bVar2.f146790c) <= i11 || i11 - i16 > i12 - i17) {
                    i13 = i15;
                } else if (i11 - i16 < i12 - i17) {
                    i13 = i14;
                } else {
                    i13 = -1;
                }
                if (i13 != -1) {
                    arrayList.remove(i13);
                    size--;
                }
            }
            i14 = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final int m153530O(b bVar, b bVar2) {
        AbstractC19074t.m100208f(bVar, "a");
        AbstractC19074t.m100208f(bVar2, C18710b.f94009e);
        int i11 = bVar.f146789b;
        int i12 = bVar2.f146789b;
        if (i11 < i12) {
            return -1;
        }
        if (i11 > i12) {
            return 1;
        }
        return AbstractC19074t.m100209g(bVar2.f146790c, bVar.f146790c);
    }

    /* renamed from: P */
    public static final void m153531P() {
        f146784k.reset();
    }

    /* renamed from: Q */
    public static final void m153532Q() {
        f146785l.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final boolean m153533R(CharSequence charSequence, int i11, int i12) {
        AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
        if (i11 == 0 || charSequence.charAt(i11 - 1) != '@') {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public static final void m153534S(InterfaceC27218a interfaceC27218a, String str, Bundle bundle) {
        AbstractC19074t.m100208f(interfaceC27218a, "chatActivity");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(bundle, "bundle");
        if (m153543i(str)) {
            ZaloWebView.Companion.m87171F(interfaceC27218a, str, bundle);
        } else {
            AbstractC23152n3.m119050j0(interfaceC27218a.getContext(), str);
        }
    }

    /* renamed from: c */
    public static final ArrayList m153537c(Spannable spannable, int i11) {
        AbstractC19074t.m100208f(spannable, "text");
        if (i11 == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            int length = uRLSpanArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    spannable.removeSpan(uRLSpanArr[length]);
                    if (i12 < 0) {
                        break;
                    }
                    length = i12;
                }
            }
            if ((i11 & 1) != 0) {
                f146774a.m153550p(arrayList, spannable);
            }
            if ((i11 & 2) != 0) {
                f146774a.m153547m(arrayList, spannable);
            }
            if ((i11 & 4) != 0) {
                f146774a.m153549o(arrayList, spannable);
            }
            f146774a.m153529N(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                m153540f(bVar.f146788a, bVar.f146789b, bVar.f146790c, spannable);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final ArrayList m153538d(Spannable spannable, int i11, C31884d6 c31884d6) {
        AbstractC19074t.m100208f(spannable, "text");
        AbstractC19074t.m100208f(c31884d6, "options");
        if (i11 == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            int length = uRLSpanArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    spannable.removeSpan(uRLSpanArr[length]);
                    if (i12 < 0) {
                        break;
                    }
                    length = i12;
                }
            }
            if ((i11 & 1) != 0) {
                f146774a.m153550p(arrayList, spannable);
            }
            if ((i11 & 2) != 0) {
                f146774a.m153547m(arrayList, spannable);
            }
            if ((i11 & 4) != 0) {
                f146774a.m153549o(arrayList, spannable);
            }
            f146774a.m153529N(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                int i13 = bVar.f146792e;
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 4) {
                            if (i13 == 8) {
                                String str = bVar.f146788a;
                                int i14 = bVar.f146789b;
                                int i15 = bVar.f146790c;
                                String str2 = bVar.f146791d;
                                C31884d6.a aVar = c31884d6.f146458d;
                                AbstractC19074t.m100207e(aVar, "tagStyle");
                                m153541g(4, str, i14, i15, spannable, str2, aVar);
                            }
                        } else {
                            String str3 = bVar.f146788a;
                            int i16 = bVar.f146789b;
                            int i17 = bVar.f146790c;
                            String str4 = bVar.f146791d;
                            C31884d6.a aVar2 = c31884d6.f146456b;
                            AbstractC19074t.m100207e(aVar2, "phoneStyle");
                            m153541g(3, str3, i16, i17, spannable, str4, aVar2);
                        }
                    } else {
                        String str5 = bVar.f146788a;
                        int i18 = bVar.f146789b;
                        int i19 = bVar.f146790c;
                        String str6 = bVar.f146791d;
                        C31884d6.a aVar3 = c31884d6.f146457c;
                        AbstractC19074t.m100207e(aVar3, "emailStyle");
                        m153541g(2, str5, i18, i19, spannable, str6, aVar3);
                    }
                } else {
                    String str7 = bVar.f146788a;
                    int i21 = bVar.f146789b;
                    int i22 = bVar.f146790c;
                    String str8 = bVar.f146791d;
                    C31884d6.a aVar4 = c31884d6.f146455a;
                    AbstractC19074t.m100207e(aVar4, "urlStyle");
                    m153541g(1, str7, i21, i22, spannable, str8, aVar4);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final String m153539e(String str, String str2) {
        String m127114D;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "prefix");
        String str3 = new URL(str).getProtocol() + "://";
        m127114D = AbstractC24341v.m127114D(str, str3, str3 + str2, false, 4, null);
        return m127114D;
    }

    /* renamed from: f */
    public static final void m153540f(String str, int i11, int i12, Spannable spannable) {
        AbstractC19074t.m100208f(spannable, "text");
        spannable.setSpan(new URLSpan(str), i11, i12, 33);
    }

    /* renamed from: g */
    public static final void m153541g(int i11, String str, int i12, int i13, Spannable spannable, String str2, C31884d6.a aVar) {
        AbstractC19074t.m100208f(spannable, "text");
        AbstractC19074t.m100208f(aVar, "style");
        spannable.setSpan(new C23671b(i11, str, i12, i13, str2, aVar.f146460a, aVar.f146462c, aVar.f146461b), i12, i13, 33);
    }

    /* renamed from: h */
    public static final boolean m153542h(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (AbstractC0924m0.m2893A1() == 1 || m153543i(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m153543i(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
        if (!c15403a.m87176p(str) && !c15403a.m87177q(str) && !c15403a.m87178s(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final boolean m153544j(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            char c11 = 0;
            while (i11 < length) {
                char charAt = charSequence.charAt(i11);
                int i15 = 1;
                if ('0' <= charAt && charAt < ':') {
                    i12++;
                    if (i12 >= 6) {
                        return true;
                    }
                    i13 = 0;
                    i14 = 0;
                } else if (charAt == ' ' || i12 <= 0) {
                    i12 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/') || i11 != 0) {
                    if (i11 != 0) {
                        int i16 = i11 - 1;
                        if (charSequence.charAt(i16) != ' ') {
                            if (charSequence.charAt(i16) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i13 != 0) {
                            i15 = 0;
                        }
                        i13 = i15;
                    } else if (charAt == '/') {
                        if (i13 == 2) {
                            return true;
                        }
                        if (i13 == 1) {
                            i13++;
                        } else {
                            i13 = 0;
                        }
                    } else {
                        if (charAt == '.') {
                            if (i14 == 0 && c11 != ' ') {
                                i14++;
                            }
                        } else if (charAt != ' ' && c11 == '.' && i14 == 1) {
                            return true;
                        }
                        i14 = 0;
                    }
                    i11++;
                    c11 = charAt;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m153545k(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0 || m153548n(charSequence).length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final EnumC27374a m153546l(String str) {
        AbstractC19074t.m100208f(str, "message");
        ArrayList m153537c = m153537c(new SpannableString(str), 1);
        EnumC27374a enumC27374a = EnumC27374a.f128964q;
        if (true ^ m153537c.isEmpty()) {
            Iterator it = m153537c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!m153520E(bVar.f146788a)) {
                    bVar.f146794g = EnumC27374a.f128967t;
                } else {
                    bVar.f146794g = EnumC27374a.f128965r;
                }
            }
            Iterator it2 = m153537c.iterator();
            while (it2.hasNext()) {
                b bVar2 = (b) it2.next();
                if (enumC27374a.m140275c() < bVar2.f146794g.m140275c()) {
                    enumC27374a = bVar2.f146794g;
                }
            }
        }
        return enumC27374a;
    }

    /* renamed from: m */
    private final void m153547m(ArrayList arrayList, Spannable spannable) {
        String[] strArr = {"mailto:"};
        Matcher matcher = Patterns.EMAIL_ADDRESS.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            b bVar = new b();
            boolean z11 = false;
            String group = matcher.group(0);
            if (group == null) {
                group = "";
            }
            String m153524I = m153524I(group, strArr);
            bVar.f146792e = 2;
            bVar.f146788a = m153524I;
            bVar.f146789b = start;
            bVar.f146790c = end;
            bVar.f146791d = matcher.group(0);
            if (start == 0 && end - start == spannable.length()) {
                z11 = true;
            }
            bVar.f146793f = z11;
            arrayList.add(bVar);
        }
    }

    /* renamed from: n */
    public static final String m153548n(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
        try {
            String obj = charSequence.toString();
            String pattern = Patterns.EMAIL_ADDRESS.toString();
            AbstractC19074t.m100207e(pattern, "toString(...)");
            Matcher matcher = f146775b.matcher(new C24329j(pattern).m127019g(obj, ""));
            while (matcher.find()) {
                if (f146787n.acceptMatch(charSequence, matcher.start(), matcher.end()) && m153519D(matcher.group())) {
                    String group = matcher.group();
                    AbstractC19074t.m100207e(group, "group(...)");
                    return group;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return "";
    }

    /* renamed from: o */
    private final void m153549o(ArrayList arrayList, Spannable spannable) {
        Matcher matcher = Patterns.PHONE.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            boolean z11 = false;
            String m153525J = m153525J(matcher.group(0));
            if (m153525J.length() > 0 && m153525J.length() >= 7) {
                b bVar = new b();
                bVar.f146788a = "tel:" + m153525J;
                bVar.f146789b = start;
                bVar.f146790c = end;
                bVar.f146791d = m153525J;
                bVar.f146792e = 4;
                if (start == 0 && end - start == spannable.length()) {
                    z11 = true;
                }
                bVar.f146793f = z11;
                arrayList.add(bVar);
            }
        }
    }

    /* renamed from: p */
    private final void m153550p(ArrayList arrayList, Spannable spannable) {
        String[] strArr = {"https://", "http://", "rtsp://"};
        Matcher matcher = f146775b.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (f146787n.acceptMatch(spannable, start, end)) {
                b bVar = new b();
                boolean z11 = false;
                if (m153519D(matcher.group(0))) {
                    String group = matcher.group(0);
                    if (group == null) {
                        group = "";
                    }
                    String m153524I = m153524I(group, strArr);
                    bVar.f146792e = 1;
                    bVar.f146788a = m153524I;
                    bVar.f146789b = start;
                    bVar.f146790c = end;
                    bVar.f146791d = matcher.group(0);
                    if (start == 0 && end - start == spannable.length()) {
                        z11 = true;
                    }
                    bVar.f146793f = z11;
                    arrayList.add(bVar);
                }
            }
        }
    }

    /* renamed from: q */
    public static final List m153551q() {
        return (List) f146784k.getValue();
    }

    /* renamed from: r */
    public static final String m153552r(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Matcher matcher = f146782i.matcher(str);
        if (matcher.matches()) {
            return matcher.group(2);
        }
        return "";
    }

    /* renamed from: s */
    public static final List m153553s() {
        return (List) f146785l.getValue();
    }

    /* renamed from: u */
    public static final int m153554u(String str) {
        boolean m131196V;
        boolean m127120J;
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            String m153552r = m153552r(lowerCase);
            m131196V = AbstractC25332a0.m131196V(f146786m, m153552r);
            if (m131196V) {
                return 1;
            }
            List m153553s = m153553s();
            if (m153553s != null && m153553s.contains(String.valueOf(m153552r))) {
                return 2;
            }
            if (!f146783j.matcher(m153552r).matches()) {
                return 3;
            }
            if (!C32204z7.Companion.m155281c().m155272o(str)) {
                m127120J = AbstractC24341v.m127120J(str, "https://", false, 2, null);
                if (!m127120J) {
                    return 5;
                }
            } else {
                return 4;
            }
        }
        return -1;
    }

    /* renamed from: v */
    public static final String m153555v(String str) {
        if (str == null) {
            return "";
        }
        try {
            String query = new URL(str).getQuery();
            AbstractC19074t.m100207e(query, "getQuery(...)");
            return query;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: w */
    public static final String m153556w(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        URL url = new URL(str);
        return url.getProtocol() + "://" + url.getHost() + url.getPath();
    }

    /* renamed from: x */
    public static final boolean m153557x(String str) {
        AbstractC19074t.m100208f(str, "message");
        if (m153537c(new SpannableString(str), 1).size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static final boolean m153558z(String str) {
        boolean m127149O;
        AbstractC19074t.m100208f(str, "text");
        if (str.length() > 0) {
            m127149O = AbstractC24342w.m127149O(str, " ", false, 2, null);
            return m127149O;
        }
        return false;
    }

    /* renamed from: t */
    public final String m153559t(String str) {
        boolean m127149O;
        String m127162U0;
        String m127154Q0;
        String m127154Q02;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        m127149O = AbstractC24342w.m127149O(str, "/", false, 2, null);
        if (m127149O) {
            m127162U0 = AbstractC24342w.m127162U0(str, "?", null, 2, null);
            m127154Q0 = AbstractC24342w.m127154Q0(m127162U0, "/", null, 2, null);
            m127154Q02 = AbstractC24342w.m127154Q0(m127154Q0, ".", null, 2, null);
            return m127154Q02;
        }
        return "";
    }

    /* renamed from: y */
    public final boolean m153560y(String str) {
        AbstractC19074t.m100208f(str, C20215s.f99966b);
        Matcher matcher = f146775b.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (f146787n.acceptMatch(str, start, end)) {
                if (start != 0 || end - start != str.length()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
