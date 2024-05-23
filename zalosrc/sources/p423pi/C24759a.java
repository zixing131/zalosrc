package p423pi;

import am.AbstractC0924m0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p296kc.C21654a;
import p348mi.AbstractC23306f;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: pi.a */
/* loaded from: classes3.dex */
public final class C24759a {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private int f118876a;

    /* renamed from: b */
    private int f118877b;

    /* renamed from: c */
    private int f118878c;

    /* renamed from: d */
    private int f118879d;

    /* renamed from: e */
    private int f118880e;

    /* renamed from: f */
    private int f118881f;

    /* renamed from: g */
    private int f118882g;

    /* renamed from: h */
    private int f118883h;

    /* renamed from: i */
    private int f118884i;

    /* renamed from: j */
    private int f118885j;

    /* renamed from: k */
    private int f118886k;

    /* renamed from: l */
    private int f118887l;

    /* renamed from: m */
    private int f118888m;

    /* renamed from: n */
    private int f118889n;

    /* renamed from: o */
    private int f118890o;

    /* renamed from: p */
    private Integer[][] f118891p;

    /* renamed from: q */
    private Integer[][] f118892q;

    /* renamed from: r */
    private Integer[][] f118893r;

    /* renamed from: s */
    private int f118894s;

    /* renamed from: t */
    private String f118895t;

    /* renamed from: u */
    private int f118896u;

    /* renamed from: v */
    private C24765g f118897v;

    /* renamed from: w */
    private int f118898w;

    /* renamed from: x */
    private a f118899x;

    /* renamed from: y */
    private c f118900y;

    /* renamed from: pi.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final C32922a Companion = new C32922a(null);

        /* renamed from: f */
        private static final String f118901f;

        /* renamed from: g */
        private static final String f118902g;

        /* renamed from: h */
        private static final String f118903h;

        /* renamed from: i */
        private static final String f118904i;

        /* renamed from: a */
        private final int f118905a;

        /* renamed from: b */
        private final String f118906b;

        /* renamed from: c */
        private final String f118907c;

        /* renamed from: d */
        private final String f118908d;

        /* renamed from: e */
        private final String f118909e;

        /* renamed from: pi.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C32922a {
            private C32922a() {
            }

            public /* synthetic */ C32922a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final a m128671a(String str) {
                int i11;
                JSONObject jSONObject;
                String str2;
                String str3;
                JSONObject jSONObject2;
                String str4;
                String str5;
                AbstractC19074t.m100208f(str, "jsString");
                if (str.length() == 0) {
                    return new a();
                }
                try {
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("setting");
                    if (optJSONObject != null) {
                        i11 = optJSONObject.optInt("enable", 1);
                    } else {
                        i11 = 1;
                    }
                    String str6 = null;
                    if (optJSONObject != null) {
                        jSONObject = optJSONObject.optJSONObject("name");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        str2 = jSONObject.optString("vi", a.f118901f);
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = a.f118901f;
                    }
                    if (str2.length() == 0) {
                        str2 = a.f118901f;
                    }
                    if (jSONObject != null) {
                        str3 = jSONObject.optString("en", a.f118902g);
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = a.f118902g;
                    }
                    if (str3.length() == 0) {
                        str3 = a.f118902g;
                    }
                    String str7 = str3;
                    if (optJSONObject != null) {
                        jSONObject2 = optJSONObject.optJSONObject("action_text");
                    } else {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        str4 = jSONObject2.optString("vi", a.f118903h);
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = a.f118903h;
                    }
                    if (str4.length() == 0) {
                        str4 = a.f118903h;
                    }
                    String str8 = str4;
                    if (jSONObject2 != null) {
                        str6 = jSONObject2.optString("en", a.f118904i);
                    }
                    if (str6 == null) {
                        str6 = a.f118904i;
                    }
                    if (str6.length() == 0) {
                        str5 = a.f118904i;
                    } else {
                        str5 = str6;
                    }
                    return new a(i11, str2, str7, str8, str5);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("AutoDownloadSetting", e11);
                    return new a();
                }
            }
        }

        static {
            String m118675S = AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.str_setting_message_pre_download);
            AbstractC19074t.m100207e(m118675S, "getLocaleStringResource(...)");
            f118901f = m118675S;
            String m118675S2 = AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.str_setting_message_pre_download);
            AbstractC19074t.m100207e(m118675S2, "getLocaleStringResource(...)");
            f118902g = m118675S2;
            String m118675S3 = AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.str_setting_message_pre_download);
            AbstractC19074t.m100207e(m118675S3, "getLocaleStringResource(...)");
            Locale locale = Locale.ROOT;
            String lowerCase = m118675S3.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            f118903h = lowerCase;
            String m118675S4 = AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.str_setting_message_pre_download);
            AbstractC19074t.m100207e(m118675S4, "getLocaleStringResource(...)");
            String lowerCase2 = m118675S4.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
            f118904i = lowerCase2;
        }

        public a() {
            this.f118905a = 1;
            this.f118906b = f118901f;
            this.f118907c = f118902g;
            this.f118908d = f118903h;
            this.f118909e = f118904i;
        }

        /* renamed from: e */
        public final String m128668e() {
            if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
                return this.f118908d;
            }
            return this.f118909e;
        }

        /* renamed from: f */
        public final String m128669f() {
            if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
                return this.f118906b;
            }
            return this.f118907c;
        }

        /* renamed from: g */
        public final boolean m128670g() {
            return this.f118905a == 1;
        }

        public a(int i11, String str, String str2, String str3, String str4) {
            AbstractC19074t.m100208f(str, "settingNameVi");
            AbstractC19074t.m100208f(str2, "settingNameEn");
            AbstractC19074t.m100208f(str3, "actionTextVi");
            AbstractC19074t.m100208f(str4, "actionTextEn");
            this.f118905a = i11;
            this.f118906b = str;
            this.f118907c = str2;
            this.f118908d = str3;
            this.f118909e = str4;
        }
    }

    /* renamed from: pi.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final Integer[][] m128672a(int i11) {
            Integer[][] numArr = new Integer[3];
            for (int i12 = 0; i12 < 3; i12++) {
                Integer[] numArr2 = new Integer[24];
                for (int i13 = 0; i13 < 24; i13++) {
                    numArr2[i13] = Integer.valueOf(i11);
                }
                numArr[i12] = numArr2;
            }
            return numArr;
        }

        /* renamed from: b */
        static /* synthetic */ Integer[][] m128673b(b bVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = 0;
            }
            return bVar.m128672a(i11);
        }

        /* renamed from: d */
        private final int m128674d(String str) {
            int hashCode = str.hashCode();
            if (hashCode != 3143036) {
                if (hashCode != 106642994) {
                    if (hashCode == 112202875 && str.equals("video")) {
                        return 1;
                    }
                } else if (str.equals("photo")) {
                    return 0;
                }
            } else if (str.equals("file")) {
                return 2;
            }
            return -1;
        }

        /* renamed from: e */
        private final Integer[][] m128675e(JSONObject jSONObject, int i11) {
            List m127132B0;
            Integer[][] m128672a = m128672a(i11);
            int i12 = 1;
            if (m128672a.length != 3 || m128672a[0].length != 24 || m128672a[1].length != 24 || m128672a[2].length != 24) {
                AbstractC20110a.f98889a.mo104551d("WRONG TIME FRAME DATA 1", new Object[0]);
            }
            try {
                Iterator<String> keys = jSONObject.keys();
                AbstractC19074t.m100207e(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    AbstractC19074t.m100205c(next);
                    int m128674d = m128674d(next);
                    if (m128674d >= 0 && m128674d < 3) {
                        JSONObject optJSONObject = jSONObject.optJSONObject(next);
                        if (optJSONObject != null) {
                            int optInt = optJSONObject.optInt("default", i11);
                            if (optInt < i11) {
                                optInt = i11;
                            }
                            Arrays.fill(m128672a[m128674d], Integer.valueOf(optInt));
                            Iterator<String> keys2 = optJSONObject.keys();
                            AbstractC19074t.m100207e(keys2, "keys(...)");
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                if (!AbstractC19074t.m100204b(next2, "default")) {
                                    AbstractC19074t.m100205c(next2);
                                    String[] strArr = new String[i12];
                                    strArr[0] = "_";
                                    m127132B0 = AbstractC24342w.m127132B0(next2, strArr, false, 0, 6, null);
                                    int parseInt = Integer.parseInt((String) m127132B0.get(0));
                                    int parseInt2 = Integer.parseInt((String) m127132B0.get(i12));
                                    if (parseInt <= parseInt2) {
                                        int optInt2 = optJSONObject.optInt(next2, i11);
                                        if (optInt2 < i11) {
                                            optInt2 = i11;
                                        }
                                        Arrays.fill(m128672a[m128674d], parseInt, parseInt2, Integer.valueOf(optInt2));
                                        i12 = 1;
                                    }
                                }
                            }
                        }
                    } else {
                        i12 = 1;
                    }
                }
                if (m128672a.length != 3 || m128672a[0].length != 24 || m128672a[1].length != 24 || m128672a[2].length != 24) {
                    AbstractC20110a.f98889a.mo104551d("WRONG TIME FRAME DATA 2", new Object[0]);
                }
            } catch (Exception e11) {
                C21654a.m111575b(e11);
            }
            return m128672a;
        }

        /* renamed from: f */
        static /* synthetic */ Integer[][] m128676f(b bVar, JSONObject jSONObject, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return bVar.m128675e(jSONObject, i11);
        }

        /* renamed from: c */
        public final C24759a m128677c(String str) {
            int i11;
            Integer[][] m128676f;
            Integer[][] m128676f2;
            Integer[][] m128675e;
            int i12;
            Integer[][] numArr;
            int i13;
            C24765g c24765g;
            AbstractC19074t.m100208f(str, "jsString");
            if (str.length() == 0) {
                return new C24759a();
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("enable", 0);
                int optInt2 = jSONObject.optInt("enable_bg_download", 0);
                int optInt3 = jSONObject.optInt("msg_type", 15);
                int optInt4 = jSONObject.optInt("hide_setting", 0);
                int optInt5 = jSONObject.optInt("network_voice", 3);
                int optInt6 = jSONObject.optInt("network_photo", 3);
                int optInt7 = jSONObject.optInt("network_video", 1);
                int optInt8 = jSONObject.optInt("network_file", 1);
                int optInt9 = jSONObject.optInt("msg_size_video", 15);
                int optInt10 = jSONObject.optInt("msg_size_file", 3);
                int optInt11 = jSONObject.optInt("thread_type", 31);
                int optInt12 = jSONObject.optInt("group_max_photo", 20);
                int optInt13 = jSONObject.optInt("group_max_video", 20);
                int optInt14 = jSONObject.optInt("group_max_file", 20);
                int optInt15 = jSONObject.optInt("storage_limit", 1024);
                JSONObject optJSONObject = jSONObject.optJSONObject("new_msg_quota_group");
                if (!jSONObject.has("new_msg_quota_group")) {
                    i11 = 0;
                    m128676f = new Integer[0];
                } else {
                    i11 = 0;
                    if (optJSONObject == null) {
                        m128676f = m128673b(this, 0, 1, null);
                    } else {
                        m128676f = m128676f(this, optJSONObject, 0, 2, null);
                    }
                }
                Integer[][] numArr2 = m128676f;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("new_msg_quota_11");
                if (!jSONObject.has("new_msg_quota_11")) {
                    m128676f2 = new Integer[i11];
                } else if (optJSONObject2 == null) {
                    m128676f2 = m128673b(this, i11, 1, null);
                } else {
                    m128676f2 = m128676f(this, optJSONObject2, i11, 2, null);
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("minute_segment");
                if (optJSONObject3 == null) {
                    m128675e = new Integer[i11];
                } else {
                    m128675e = m128675e(optJSONObject3, 1);
                }
                Integer[][] numArr3 = m128675e;
                int optInt16 = jSONObject.optInt("enable_new_domain", i11);
                String optString = jSONObject.optString("t-md", "");
                JSONObject optJSONObject4 = jSONObject.optJSONObject("cleaner");
                if (optJSONObject4 != null) {
                    i12 = optJSONObject4.optInt("enabled", 1);
                } else {
                    i12 = 1;
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("force_video_download");
                if (optJSONObject5 == null) {
                    numArr = m128676f2;
                    i13 = optInt7;
                    c24765g = new C24765g(60L, 0.3d);
                } else {
                    numArr = m128676f2;
                    i13 = optInt7;
                    c24765g = new C24765g(optJSONObject5);
                }
                int optInt17 = jSONObject.optInt("max_msg_size_sync", 100);
                a m128671a = a.Companion.m128671a(str);
                c m128686a = c.Companion.m128686a(str);
                AbstractC19074t.m100205c(optString);
                return new C24759a(optInt, optInt2, optInt3, optInt4, optInt5, optInt6, i13, optInt8, optInt9, optInt10, optInt11, optInt12, optInt13, optInt14, optInt15, numArr2, numArr, numArr3, optInt16, optString, i12, c24765g, optInt17, m128671a, m128686a);
            } catch (Exception e11) {
                C21654a.m111575b(e11);
                return new C24759a();
            }
        }
    }

    public C24759a() {
        this.f118878c = 15;
        this.f118880e = 3;
        this.f118881f = 3;
        this.f118882g = 1;
        this.f118883h = 1;
        this.f118884i = 15;
        this.f118885j = 3;
        this.f118886k = 31;
        this.f118887l = 20;
        this.f118888m = 20;
        this.f118889n = 20;
        this.f118890o = 1024;
        this.f118891p = new Integer[0];
        this.f118892q = new Integer[0];
        this.f118893r = new Integer[0];
        this.f118895t = "";
        this.f118896u = 1;
        this.f118897v = new C24765g(60L, 0.3d);
        this.f118898w = 100;
        this.f118899x = new a();
        this.f118900y = new c();
    }

    /* renamed from: y */
    private final boolean m128634y() {
        return this.f118899x.m128670g();
    }

    /* renamed from: A */
    public final boolean m128635A() {
        return this.f118894s == 1;
    }

    /* renamed from: B */
    public final boolean m128636B() {
        return this.f118896u == 1;
    }

    /* renamed from: C */
    public final boolean m128637C(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (!c17945a0.m95276v6() && !c17945a0.m95306y8() && !c17945a0.m95288w8()) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final boolean m128638D(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (m128634y() && m128637C(c17945a0)) {
            return AbstractC23306f.m120660f().m124326d();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m128639a(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (!m128662x() || !m128638D(c17945a0)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int m128640b() {
        return this.f118877b;
    }

    /* renamed from: c */
    public final C24765g m128641c() {
        return this.f118897v;
    }

    /* renamed from: d */
    public final int m128642d() {
        return this.f118889n;
    }

    /* renamed from: e */
    public final int m128643e() {
        return this.f118887l;
    }

    /* renamed from: f */
    public final int m128644f() {
        return this.f118888m;
    }

    /* renamed from: g */
    public final int m128645g() {
        return this.f118898w;
    }

    /* renamed from: h */
    public final Integer[][] m128646h() {
        return this.f118893r;
    }

    /* renamed from: i */
    public final int m128647i() {
        return this.f118885j;
    }

    /* renamed from: j */
    public final int m128648j() {
        return this.f118884i;
    }

    /* renamed from: k */
    public final int m128649k() {
        return this.f118878c;
    }

    /* renamed from: l */
    public final int m128650l() {
        return this.f118883h;
    }

    /* renamed from: m */
    public final int m128651m() {
        return this.f118881f;
    }

    /* renamed from: n */
    public final int m128652n() {
        return this.f118882g;
    }

    /* renamed from: o */
    public final int m128653o() {
        return this.f118880e;
    }

    /* renamed from: p */
    public final Integer[][] m128654p() {
        return this.f118892q;
    }

    /* renamed from: q */
    public final Integer[][] m128655q() {
        return this.f118891p;
    }

    /* renamed from: r */
    public final String m128656r() {
        return this.f118899x.m128668e();
    }

    /* renamed from: s */
    public final String m128657s() {
        return this.f118899x.m128669f();
    }

    /* renamed from: t */
    public final int m128658t() {
        return this.f118890o;
    }

    /* renamed from: u */
    public final int m128659u() {
        return this.f118886k;
    }

    /* renamed from: v */
    public final String m128660v() {
        return this.f118895t;
    }

    /* renamed from: w */
    public final c m128661w() {
        return this.f118900y;
    }

    /* renamed from: x */
    public final boolean m128662x() {
        return this.f118876a == 1;
    }

    /* renamed from: z */
    public final boolean m128663z() {
        if (m128634y() && m128662x()) {
            return true;
        }
        return false;
    }

    /* renamed from: pi.a$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final String f118910a;

        /* renamed from: b */
        private final String f118911b;

        /* renamed from: c */
        private final String f118912c;

        /* renamed from: d */
        private b f118913d;

        /* renamed from: pi.a$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final c m128686a(String str) {
                AbstractC19074t.m100208f(str, "jsString");
                try {
                    if (str.length() == 0) {
                        return new c();
                    }
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("wl_patterns");
                    if (optJSONObject == null) {
                        return new c();
                    }
                    String optString = optJSONObject.optString("link", "");
                    String optString2 = optJSONObject.optString("checksum", "");
                    AbstractC19074t.m100205c(optString);
                    AbstractC19074t.m100205c(optString2);
                    return new c(optString, optString2);
                } catch (Exception e11) {
                    C21654a.m111575b(e11);
                    return new c();
                }
            }

            /* renamed from: b */
            public final boolean m128687b(String str) {
                AbstractC19074t.m100208f(str, "value");
                if (str.length() == 0) {
                    return false;
                }
                try {
                    Integer.parseInt(str);
                    return false;
                } catch (Exception unused) {
                    return !AbstractC19074t.m100204b(str, "null");
                }
            }
        }

        public c() {
            this.f118912c = AbstractC0924m0.m4310w7();
            this.f118910a = "";
            this.f118911b = "";
        }

        /* renamed from: a */
        public final String m128678a() {
            return this.f118911b;
        }

        /* renamed from: b */
        public final String m128679b() {
            String m4310w7 = AbstractC0924m0.m4310w7();
            AbstractC19074t.m100207e(m4310w7, "getWhitelistChecksum(...)");
            return m4310w7;
        }

        /* renamed from: c */
        public final String m128680c() {
            return this.f118910a;
        }

        /* renamed from: d */
        public final b m128681d() {
            b bVar = this.f118913d;
            if (bVar == null) {
                b.a aVar = b.Companion;
                String m4339x7 = AbstractC0924m0.m4339x7();
                AbstractC19074t.m100207e(m4339x7, "getWhitelistData(...)");
                b m128691a = aVar.m128691a(m4339x7);
                this.f118913d = m128691a;
                if (m128691a == null) {
                    return new b();
                }
                return m128691a;
            }
            return bVar;
        }

        /* renamed from: e */
        public final boolean m128682e() {
            return Companion.m128687b(this.f118911b);
        }

        /* renamed from: f */
        public final boolean m128683f() {
            if (!Companion.m128687b(this.f118911b)) {
                return false;
            }
            String m4339x7 = AbstractC0924m0.m4339x7();
            AbstractC19074t.m100207e(m4339x7, "getWhitelistData(...)");
            if (m4339x7.length() == 0) {
                return true;
            }
            return !AbstractC19074t.m100204b(this.f118911b, this.f118912c);
        }

        /* renamed from: g */
        public final boolean m128684g() {
            return Companion.m128687b(this.f118910a);
        }

        /* renamed from: h */
        public final void m128685h(String str) {
            AbstractC19074t.m100208f(str, "patternsJson");
            C21654a.m111582i("setAndParseWhitelist(): " + str, null, false, 6, null);
            b m128691a = b.Companion.m128691a(str);
            if (m128691a != null) {
                C21654a.m111582i("setAndParseWhitelist(): success", null, false, 6, null);
                AbstractC0924m0.m4300vq(str);
                AbstractC0924m0.m4271uq(this.f118911b);
                this.f118913d = m128691a;
            }
        }

        public String toString() {
            return "WhitelistDomainConfigs(link='" + this.f118910a + "', checksum='" + this.f118911b + "')";
        }

        public c(String str, String str2) {
            AbstractC19074t.m100208f(str, "link");
            AbstractC19074t.m100208f(str2, "checksum");
            this.f118912c = AbstractC0924m0.m4310w7();
            this.f118910a = str;
            this.f118911b = str2;
        }

        /* renamed from: pi.a$c$b */
        /* loaded from: classes3.dex */
        public static final class b {
            public static final a Companion = new a(null);

            /* renamed from: a */
            private final List f118914a;

            /* renamed from: b */
            private final List f118915b;

            /* renamed from: c */
            private final List f118916c;

            /* renamed from: d */
            private final List f118917d;

            /* renamed from: e */
            private final List f118918e;

            /* renamed from: pi.a$c$b$a */
            /* loaded from: classes3.dex */
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                    this();
                }

                /* renamed from: b */
                private final List m128690b(JSONArray jSONArray) {
                    List m131502j;
                    if (jSONArray == null) {
                        m131502j = AbstractC25368s.m131502j();
                        return m131502j;
                    }
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        arrayList.add(jSONArray.optString(i11));
                    }
                    return arrayList;
                }

                /* renamed from: a */
                public final b m128691a(String str) {
                    AbstractC19074t.m100208f(str, "jsString");
                    if (str.length() == 0) {
                        return new b();
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        return new b(m128690b(jSONObject.optJSONArray("photo")), m128690b(jSONObject.optJSONArray("video")), m128690b(jSONObject.optJSONArray("file")), m128690b(jSONObject.optJSONArray("voice")), m128690b(jSONObject.optJSONArray("other")));
                    } catch (Exception e11) {
                        C21654a.m111575b(e11);
                        return null;
                    }
                }
            }

            public b() {
                List m131502j;
                List m131502j2;
                List m131502j3;
                List m131502j4;
                List m131502j5;
                m131502j = AbstractC25368s.m131502j();
                this.f118914a = m131502j;
                m131502j2 = AbstractC25368s.m131502j();
                this.f118915b = m131502j2;
                m131502j3 = AbstractC25368s.m131502j();
                this.f118916c = m131502j3;
                m131502j4 = AbstractC25368s.m131502j();
                this.f118917d = m131502j4;
                m131502j5 = AbstractC25368s.m131502j();
                this.f118918e = m131502j5;
            }

            /* renamed from: a */
            public final String m128688a(C17945a0 c17945a0) {
                AbstractC19074t.m100208f(c17945a0, "chatContent");
                if (!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95031V5() && !c17945a0.m94960N7()) {
                    if (!c17945a0.m95306y8() && !c17945a0.m95314z6()) {
                        if (c17945a0.m95276v6()) {
                            return "file";
                        }
                        if (c17945a0.m95316z8()) {
                            return "voice";
                        }
                        return "other";
                    }
                    return "video";
                }
                return "photo";
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* renamed from: b */
            public final boolean m128689b(String str, String str2) {
                List m131502j;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "msgType");
                switch (str2.hashCode()) {
                    case 3143036:
                        if (str2.equals("file")) {
                            m131502j = this.f118916c;
                            break;
                        }
                        m131502j = AbstractC25368s.m131502j();
                        break;
                    case 106642994:
                        if (str2.equals("photo")) {
                            m131502j = this.f118914a;
                            break;
                        }
                        m131502j = AbstractC25368s.m131502j();
                        break;
                    case 112202875:
                        if (str2.equals("video")) {
                            m131502j = this.f118915b;
                            break;
                        }
                        m131502j = AbstractC25368s.m131502j();
                        break;
                    case 112386354:
                        if (str2.equals("voice")) {
                            m131502j = this.f118917d;
                            break;
                        }
                        m131502j = AbstractC25368s.m131502j();
                        break;
                    default:
                        m131502j = AbstractC25368s.m131502j();
                        break;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m131502j);
                arrayList.addAll(this.f118918e);
                if (arrayList.isEmpty()) {
                    return true;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C24329j) it.next()).m127018f(str)) {
                        return true;
                    }
                }
                return false;
            }

            public b(List list, List list2, List list3, List list4, List list5) {
                int m131511r;
                int m131511r2;
                int m131511r3;
                int m131511r4;
                int m131511r5;
                AbstractC19074t.m100208f(list, "photos");
                AbstractC19074t.m100208f(list2, "videos");
                AbstractC19074t.m100208f(list3, "files");
                AbstractC19074t.m100208f(list4, "voices");
                AbstractC19074t.m100208f(list5, "others");
                List list6 = list;
                m131511r = AbstractC25370t.m131511r(list6, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list6.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C24329j((String) it.next()));
                }
                this.f118914a = arrayList;
                List list7 = list2;
                m131511r2 = AbstractC25370t.m131511r(list7, 10);
                ArrayList arrayList2 = new ArrayList(m131511r2);
                Iterator it2 = list7.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C24329j((String) it2.next()));
                }
                this.f118915b = arrayList2;
                List list8 = list3;
                m131511r3 = AbstractC25370t.m131511r(list8, 10);
                ArrayList arrayList3 = new ArrayList(m131511r3);
                Iterator it3 = list8.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new C24329j((String) it3.next()));
                }
                this.f118916c = arrayList3;
                List list9 = list4;
                m131511r4 = AbstractC25370t.m131511r(list9, 10);
                ArrayList arrayList4 = new ArrayList(m131511r4);
                Iterator it4 = list9.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new C24329j((String) it4.next()));
                }
                this.f118917d = arrayList4;
                List list10 = list5;
                m131511r5 = AbstractC25370t.m131511r(list10, 10);
                ArrayList arrayList5 = new ArrayList(m131511r5);
                Iterator it5 = list10.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(new C24329j((String) it5.next()));
                }
                this.f118918e = arrayList5;
            }
        }
    }

    public C24759a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, Integer[][] numArr, Integer[][] numArr2, Integer[][] numArr3, int i27, String str, int i28, C24765g c24765g, int i29, a aVar, c cVar) {
        AbstractC19074t.m100208f(numArr, "newMessageQuotaGroup");
        AbstractC19074t.m100208f(numArr2, "newMessageQuota11");
        AbstractC19074t.m100208f(numArr3, "minuteSegments");
        AbstractC19074t.m100208f(str, "trackingInfo");
        AbstractC19074t.m100208f(c24765g, "forceDownloadVideoSeenLimit");
        AbstractC19074t.m100208f(aVar, "autoDownloadSetting");
        AbstractC19074t.m100208f(cVar, "whitelistDomainConfigs");
        this.f118878c = 15;
        this.f118880e = 3;
        this.f118881f = 3;
        this.f118882g = 1;
        this.f118883h = 1;
        this.f118884i = 15;
        this.f118885j = 3;
        this.f118886k = 31;
        this.f118887l = 20;
        this.f118888m = 20;
        this.f118889n = 20;
        this.f118890o = 1024;
        this.f118891p = new Integer[0];
        this.f118892q = new Integer[0];
        this.f118893r = new Integer[0];
        this.f118895t = "";
        this.f118896u = 1;
        this.f118897v = new C24765g(60L, 0.3d);
        this.f118898w = 100;
        this.f118899x = new a();
        new c();
        this.f118876a = i11;
        this.f118877b = i12;
        this.f118878c = i13;
        this.f118879d = i14;
        this.f118880e = i15;
        this.f118881f = i16;
        this.f118882g = i17;
        this.f118883h = i18;
        this.f118884i = i19;
        this.f118885j = i21;
        this.f118886k = i22;
        this.f118887l = i23;
        this.f118888m = i24;
        this.f118889n = i25;
        this.f118890o = i26;
        this.f118891p = numArr;
        this.f118892q = numArr2;
        this.f118893r = numArr3;
        this.f118894s = i27;
        this.f118895t = str;
        this.f118896u = i28;
        this.f118897v = c24765g;
        this.f118898w = i29;
        this.f118899x = aVar;
        this.f118900y = cVar;
    }
}
