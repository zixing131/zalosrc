package c30;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3535c;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p485rj.C25810b;
import p588vw.C28644j;
import qm0.AbstractC25376w;

/* renamed from: c30.m0 */
/* loaded from: classes5.dex */
public final class C3254m0 {
    public static final a Companion = new a(null);

    /* renamed from: f */
    public int f13921f;

    /* renamed from: h */
    public int f13923h;

    /* renamed from: i */
    public int f13924i;

    /* renamed from: m */
    public int f13928m;

    /* renamed from: n */
    public int f13929n;

    /* renamed from: p */
    public boolean f13931p;

    /* renamed from: q */
    public int f13932q;

    /* renamed from: a */
    public long f13916a = -1;

    /* renamed from: b */
    public String f13917b = "";

    /* renamed from: c */
    public String f13918c = "";

    /* renamed from: d */
    public String f13919d = "";

    /* renamed from: e */
    public String f13920e = "";

    /* renamed from: g */
    public String f13922g = "";

    /* renamed from: j */
    public List f13925j = new ArrayList();

    /* renamed from: k */
    public List f13926k = new ArrayList();

    /* renamed from: l */
    private List f13927l = new ArrayList();

    /* renamed from: o */
    public List f13930o = new ArrayList();

    /* renamed from: r */
    public int f13933r = -1;

    /* renamed from: c30.m0$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: c30.m0$b */
    /* loaded from: classes5.dex */
    public static final class b extends c {
        public static final a Companion = new a(null);

        /* renamed from: b */
        public C25810b f13934b;

        /* renamed from: c */
        public C25810b f13935c;

        /* renamed from: d */
        public C25810b f13936d;

        /* renamed from: e */
        private C25810b f13937e;

        /* renamed from: f */
        public String f13938f;

        /* renamed from: c30.m0$b$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        @Override // c30.C3254m0.c
        /* renamed from: a */
        public JSONObject mo16547a() {
            JSONObject mo16547a = super.mo16547a();
            try {
                C25810b c25810b = this.f13934b;
                if (c25810b != null) {
                    AbstractC19074t.m100205c(c25810b);
                    mo16547a.put("thumbGif", c25810b.m133087b());
                }
                C25810b c25810b2 = this.f13935c;
                if (c25810b2 != null) {
                    AbstractC19074t.m100205c(c25810b2);
                    mo16547a.put("smallGif", c25810b2.m133087b());
                }
                C25810b c25810b3 = this.f13936d;
                if (c25810b3 != null) {
                    AbstractC19074t.m100205c(c25810b3);
                    mo16547a.put("mediumGif", c25810b3.m133087b());
                }
                C25810b c25810b4 = this.f13937e;
                if (c25810b4 != null) {
                    AbstractC19074t.m100205c(c25810b4);
                    mo16547a.put("largeGif", c25810b4.m133087b());
                }
                mo16547a.put("gifId", this.f13938f);
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            return mo16547a;
        }

        @Override // c30.C3254m0.c
        /* renamed from: c */
        public void mo16548c(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "json");
            super.mo16548c(jSONObject);
            try {
                if (jSONObject.has("thumbGif")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("thumbGif");
                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                    this.f13934b = new C25810b(jSONObject2);
                }
                if (jSONObject.has("smallGif")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("smallGif");
                    AbstractC19074t.m100207e(jSONObject3, "getJSONObject(...)");
                    this.f13935c = new C25810b(jSONObject3);
                }
                if (jSONObject.has("mediumGif")) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("mediumGif");
                    AbstractC19074t.m100207e(jSONObject4, "getJSONObject(...)");
                    this.f13936d = new C25810b(jSONObject4);
                }
                if (jSONObject.has("largeGif")) {
                    JSONObject jSONObject5 = jSONObject.getJSONObject("largeGif");
                    AbstractC19074t.m100207e(jSONObject5, "getJSONObject(...)");
                    this.f13937e = new C25810b(jSONObject5);
                }
                if (jSONObject.has("id")) {
                    this.f13938f = jSONObject.getString("id");
                }
                if (jSONObject.has("gifId")) {
                    this.f13938f = jSONObject.getString("gifId");
                }
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: c30.m0$c */
    /* loaded from: classes5.dex */
    public static class c {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private int f13939a;

        /* renamed from: c30.m0$c$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public JSONObject mo16547a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("order", this.f13939a);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: b */
        public final int m16549b() {
            return this.f13939a;
        }

        /* renamed from: c */
        public void mo16548c(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "json");
            this.f13939a = jSONObject.optInt("order", -1);
        }
    }

    /* renamed from: c30.m0$d */
    /* loaded from: classes5.dex */
    public static final class d extends c {
        public static final a Companion = new a(null);

        /* renamed from: b */
        public C25810b f13940b;

        /* renamed from: c */
        private C25810b f13941c;

        /* renamed from: d */
        public C25810b f13942d;

        /* renamed from: e */
        public String f13943e;

        /* renamed from: c30.m0$d$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        @Override // c30.C3254m0.c
        /* renamed from: a */
        public JSONObject mo16547a() {
            JSONObject mo16547a = super.mo16547a();
            try {
                C25810b c25810b = this.f13940b;
                if (c25810b != null) {
                    AbstractC19074t.m100205c(c25810b);
                    mo16547a.put("thumb", c25810b.m133087b());
                }
                C25810b c25810b2 = this.f13941c;
                if (c25810b2 != null) {
                    AbstractC19074t.m100205c(c25810b2);
                    mo16547a.put("small", c25810b2.m133087b());
                }
                C25810b c25810b3 = this.f13942d;
                if (c25810b3 != null) {
                    AbstractC19074t.m100205c(c25810b3);
                    mo16547a.put("normal", c25810b3.m133087b());
                }
                mo16547a.put("id", this.f13943e);
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            return mo16547a;
        }

        @Override // c30.C3254m0.c
        /* renamed from: c */
        public void mo16548c(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "json");
            super.mo16548c(jSONObject);
            try {
                if (jSONObject.has("thumb")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("thumb");
                    AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                    this.f13940b = new C25810b(jSONObject2);
                }
                if (jSONObject.has("small")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("small");
                    AbstractC19074t.m100207e(jSONObject3, "getJSONObject(...)");
                    this.f13941c = new C25810b(jSONObject3);
                }
                if (jSONObject.has("normal")) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("normal");
                    AbstractC19074t.m100207e(jSONObject4, "getJSONObject(...)");
                    this.f13942d = new C25810b(jSONObject4);
                }
                if (jSONObject.has("id")) {
                    this.f13943e = jSONObject.getString("id");
                } else if (jSONObject.has("guggy_id")) {
                    this.f13943e = jSONObject.getString("guggy_id");
                }
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: c30.m0$e */
    /* loaded from: classes5.dex */
    public static final class e extends c {
        public static final a Companion = new a(null);

        /* renamed from: b */
        public int f13944b = -1;

        /* renamed from: c */
        public int f13945c = -1;

        /* renamed from: d */
        public int f13946d = -1;

        /* renamed from: c30.m0$e$a */
        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        @Override // c30.C3254m0.c
        /* renamed from: a */
        public JSONObject mo16547a() {
            JSONObject mo16547a = super.mo16547a();
            try {
                mo16547a.put("Cate_id", this.f13944b);
                mo16547a.put("Sticker_id", this.f13945c);
                mo16547a.put("sticker_type", this.f13946d);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
            return mo16547a;
        }

        @Override // c30.C3254m0.c
        /* renamed from: c */
        public void mo16548c(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "json");
            super.mo16548c(jSONObject);
            this.f13944b = jSONObject.optInt("Cate_id", -1);
            this.f13945c = jSONObject.optInt("Sticker_id", -1);
            this.f13946d = jSONObject.optInt("sticker_type", -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c30.m0$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final f f13947q = new f();

        f() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final Integer mo240pC(c cVar, c cVar2) {
            AbstractC19074t.m100208f(cVar, "o1");
            AbstractC19074t.m100208f(cVar2, "o2");
            int m16549b = cVar.m16549b();
            int m16549b2 = cVar2.m16549b();
            if (m16549b < m16549b2) {
                return 1;
            }
            int i11 = -1;
            if (m16549b > m16549b2) {
                return -1;
            }
            if (new Random().nextInt(50) % 2 == 0) {
                i11 = 0;
            }
            return Integer.valueOf(i11);
        }
    }

    /* renamed from: m */
    private final boolean m16527m() {
        if (this.f13927l.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static final int m16528u(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: b */
    public final boolean m16529b() {
        String m119280p1 = AbstractC23160o0.m119280p1(System.currentTimeMillis());
        AbstractC19074t.m100207e(m119280p1, "timestampToYear(...)");
        int parseInt = Integer.parseInt(m119280p1);
        String m119280p12 = AbstractC23160o0.m119280p1(AbstractC23304d.f113368c0.f42400b0 * 1000);
        AbstractC19074t.m100207e(m119280p12, "timestampToYear(...)");
        int parseInt2 = parseInt - Integer.parseInt(m119280p12);
        int i11 = this.f13923h;
        if (parseInt2 > this.f13924i || i11 > parseInt2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m16530c() {
        if (this.f13932q == 0) {
            return true;
        }
        C3535c m2634q = AbstractC23306f.m120584H0().m2634q(C11318b.Companion.m60525a().m60513g());
        if (m2634q != null) {
            if (this.f13932q == 2 && m2634q.m17971y0().m41013q()) {
                return true;
            }
            if (this.f13932q == 1 && !m2634q.m17971y0().m41013q()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m16531d() {
        if (!m16539l()) {
            return true;
        }
        int i11 = Calendar.getInstance().get(7);
        Iterator it = this.f13926k.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if ((i11 == 1 && intValue == 6) || ((i11 == 2 && intValue == 0) || ((i11 == 3 && intValue == 1) || ((i11 == 4 && intValue == 2) || ((i11 == 5 && intValue == 3) || ((i11 == 6 && intValue == 4) || (i11 == 7 && intValue == 5))))))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m16532e() {
        if (!m16527m()) {
            return true;
        }
        ContactProfile m141815l = AbstractC23306f.m120642a1().m141815l(C11318b.Companion.m60525a().m60513g(), false);
        if (m141815l != null) {
            int i11 = m141815l.f42449w;
            Iterator it = this.f13927l.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (m141815l.m40374K0() || ((intValue == 0 && AbstractC23304d.f113368c0.f42449w == 0 && i11 == 0) || ((intValue == 1 && AbstractC23304d.f113368c0.f42449w == 0 && i11 == 1) || ((intValue == 3 && AbstractC23304d.f113368c0.f42449w == 1 && i11 == 0) || (intValue == 2 && AbstractC23304d.f113368c0.f42449w == 1 && i11 == 1))))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m16533f() {
        if (!m16540n()) {
            return true;
        }
        int i11 = Calendar.getInstance().get(11);
        Iterator it = this.f13925j.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if ((intValue == 0 && i11 >= 5 && i11 < 12) || ((intValue == 1 && i11 >= 12 && i11 < 18) || ((intValue == 2 && i11 >= 18 && i11 < 22) || (intValue == 3 && (i11 >= 22 || i11 < 5))))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m16534g() {
        if (this.f13933r >= 0 && C28644j.m143233Y().m143312x0(this.f13933r) && this.f13931p) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final String m16535h() {
        JSONArray jSONArray = new JSONArray();
        int size = this.f13926k.size();
        for (int i11 = 0; i11 < size; i11++) {
            jSONArray.put(((Number) this.f13926k.get(i11)).intValue());
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* renamed from: i */
    public final String m16536i() {
        JSONArray jSONArray = new JSONArray();
        int size = this.f13927l.size();
        for (int i11 = 0; i11 < size; i11++) {
            jSONArray.put(((Number) this.f13927l.get(i11)).intValue());
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* renamed from: j */
    public final String m16537j() {
        JSONArray jSONArray = new JSONArray();
        int size = this.f13925j.size();
        for (int i11 = 0; i11 < size; i11++) {
            jSONArray.put(((Number) this.f13925j.get(i11)).intValue());
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* renamed from: k */
    public final String m16538k() {
        JSONArray jSONArray = new JSONArray();
        int size = this.f13930o.size();
        for (int i11 = 0; i11 < size; i11++) {
            jSONArray.put(((c) this.f13930o.get(i11)).mo16547a());
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* renamed from: l */
    public final boolean m16539l() {
        if (this.f13926k.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m16540n() {
        if (this.f13925j.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void m16541o(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f13926k = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f13926k.add(Integer.valueOf(jSONArray.getInt(i11)));
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: p */
    public final void m16542p(JSONObject jSONObject) {
        c cVar;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONArray optJSONArray3;
        AbstractC19074t.m100208f(jSONObject, "kwdJson");
        String optString = jSONObject.optString("banner");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f13920e = optString;
        this.f13921f = jSONObject.optInt("order_id", 0);
        String optString2 = jSONObject.optString("title");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f13922g = optString2;
        String optString3 = jSONObject.optString("title_eng");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        this.f13917b = optString3;
        String optString4 = jSONObject.optString("sub_title");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        this.f13919d = optString4;
        String optString5 = jSONObject.optString("sub_title_eng");
        AbstractC19074t.m100207e(optString5, "optString(...)");
        this.f13918c = optString5;
        this.f13923h = jSONObject.optInt("age_min", -1);
        this.f13924i = jSONObject.optInt("age_max", -1);
        this.f13928m = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
        this.f13929n = jSONObject.optInt("version", -1);
        this.f13925j = new ArrayList();
        this.f13926k = new ArrayList();
        this.f13927l = new ArrayList();
        this.f13930o = new ArrayList();
        this.f13931p = jSONObject.optBoolean("show_banner", false);
        this.f13932q = jSONObject.optInt("chat_type", 0);
        this.f13916a = jSONObject.optLong("id", -1L);
        this.f13933r = jSONObject.optInt("cate_id_download", -1);
        try {
            if (jSONObject.has("time") && (optJSONArray3 = jSONObject.optJSONArray("time")) != null) {
                int length = optJSONArray3.length();
                for (int i11 = 0; i11 < length; i11++) {
                    this.f13925j.add(Integer.valueOf(optJSONArray3.getInt(i11)));
                }
            }
            if (jSONObject.has("day_of_week") && (optJSONArray2 = jSONObject.optJSONArray("day_of_week")) != null) {
                int length2 = optJSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    this.f13926k.add(Integer.valueOf(optJSONArray2.getInt(i12)));
                }
            }
            if (jSONObject.has("gender_type") && (optJSONArray = jSONObject.optJSONArray("gender_type")) != null) {
                int length3 = optJSONArray.length();
                for (int i13 = 0; i13 < length3; i13++) {
                    this.f13927l.add(Integer.valueOf(optJSONArray.getInt(i13)));
                }
            }
            if (jSONObject.has("trending_list")) {
                JSONArray jSONArray = jSONObject.getJSONArray("trending_list");
                int length4 = jSONArray.length();
                for (int i14 = 0; i14 < length4; i14++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                    int i15 = this.f13928m;
                    if (i15 == 0) {
                        cVar = new e();
                    } else if (i15 == 1) {
                        cVar = new b();
                    } else if (i15 == 2) {
                        cVar = new d();
                    } else {
                        cVar = null;
                    }
                    if (cVar != null && jSONObject2 != null) {
                        cVar.mo16548c(jSONObject2);
                        this.f13930o.add(cVar);
                    }
                }
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: q */
    public final void m16543q(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f13927l = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f13927l.add(Integer.valueOf(jSONArray.getInt(i11)));
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r */
    public final void m16544r(String str) {
        AbstractC19074t.m100208f(str, "timeStr");
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f13925j = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f13925j.add(Integer.valueOf(jSONArray.getInt(i11)));
            }
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: s */
    public final void m16545s(String str) {
        c cVar;
        AbstractC19074t.m100208f(str, "trendingListStr");
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                int i12 = this.f13928m;
                if (i12 == 0) {
                    cVar = new e();
                } else if (i12 == 1) {
                    cVar = new b();
                } else if (i12 == 2) {
                    cVar = new d();
                } else {
                    cVar = null;
                }
                if (cVar != null && jSONObject != null) {
                    cVar.mo16548c(jSONObject);
                    arrayList.add(cVar);
                }
            }
            this.f13930o.clear();
            this.f13930o.addAll(arrayList);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t */
    public final void m16546t() {
        AbstractC25376w.m131534w(this.f13930o, new Comparator() { // from class: c30.l0
            public /* synthetic */ C3252l0() {
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m16528u;
                m16528u = C3254m0.m16528u(InterfaceC18509p.this, obj, obj2);
                return m16528u;
            }
        });
    }
}
