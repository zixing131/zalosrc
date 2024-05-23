package p732zy;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.C23307g;
import pm0.C24848g0;
import rd0.C25750p;

/* renamed from: zy.l */
/* loaded from: classes4.dex */
public final class C32596l {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f150638a;

    /* renamed from: b */
    private int f150639b;

    /* renamed from: c */
    private String f150640c;

    /* renamed from: d */
    private d f150641d;

    /* renamed from: e */
    private b f150642e;

    /* renamed from: f */
    private long f150643f;

    /* renamed from: g */
    private long f150644g;

    /* renamed from: zy.l$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: zy.l$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private String f150645a;

        /* renamed from: b */
        private int f150646b;

        /* renamed from: c */
        private ArrayList f150647c;

        public b(String str, int i11, ArrayList arrayList) {
            AbstractC19074t.m100208f(str, "orgJSONStr");
            this.f150645a = str;
            this.f150646b = i11;
            this.f150647c = arrayList;
        }

        /* renamed from: a */
        public final b m157838a() {
            ArrayList arrayList;
            ArrayList arrayList2 = this.f150647c;
            if (arrayList2 != null) {
                arrayList = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c) it.next()).m157842a());
                }
            } else {
                arrayList = null;
            }
            return new b(this.f150645a, this.f150646b, arrayList);
        }

        /* renamed from: b */
        public final c.C33080c m157839b() {
            c.b m157843b;
            ArrayList arrayList = this.f150647c;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (((c) arrayList.get(i11)).m157844c() == 0 && (m157843b = ((c) arrayList.get(i11)).m157843b()) != null && (m157843b instanceof c.C33080c)) {
                        return (c.C33080c) m157843b;
                    }
                }
                return null;
            }
            return null;
        }

        /* renamed from: c */
        public final String m157840c() {
            return this.f150645a;
        }

        /* renamed from: d */
        public final JSONObject m157841d() {
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = this.f150647c;
            if (arrayList != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((c) it.next()).m157845d());
                }
                jSONObject.put("size", jSONArray.length());
                jSONObject.put("items", jSONArray);
            }
            return jSONObject;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(JSONObject jSONObject) {
            this(r0, r1, r3);
            ArrayList arrayList;
            AbstractC19074t.m100208f(jSONObject, "json");
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            int optInt = jSONObject.optInt("size", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i11);
                    AbstractC19074t.m100207e(jSONObject3, "getJSONObject(...)");
                    arrayList.add(new c(jSONObject3));
                }
            } else {
                arrayList = null;
            }
        }
    }

    /* renamed from: zy.l$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private int f150648a;

        /* renamed from: b */
        private b f150649b;

        /* renamed from: zy.l$c$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: zy.l$c$b */
        /* loaded from: classes4.dex */
        public static abstract class b {

            /* renamed from: a */
            private long f150650a;

            public b(long j11) {
                this.f150650a = j11;
            }

            /* renamed from: a */
            public abstract b mo157846a();

            /* renamed from: b */
            public final long m157847b() {
                return this.f150650a;
            }

            /* renamed from: c */
            public abstract JSONObject mo157848c();
        }

        /* renamed from: zy.l$c$c */
        /* loaded from: classes4.dex */
        public static final class C33080c extends b {

            /* renamed from: b */
            private String f150651b;

            /* renamed from: c */
            private int f150652c;

            /* renamed from: d */
            private int f150653d;

            /* renamed from: e */
            private String f150654e;

            /* renamed from: f */
            private String f150655f;

            /* renamed from: g */
            private String f150656g;

            /* renamed from: h */
            private String f150657h;

            /* renamed from: i */
            private String f150658i;

            public /* synthetic */ C33080c(long j11, String str, int i11, int i12, String str2, String str3, String str4, String str5, String str6, int i13, AbstractC19060k abstractC19060k) {
                this(j11, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? "" : str2, (i13 & 32) != 0 ? "" : str3, (i13 & 64) != 0 ? "" : str4, (i13 & 128) != 0 ? "" : str5, (i13 & 256) != 0 ? "" : str6);
            }

            @Override // p732zy.C32596l.c.b
            /* renamed from: c */
            public JSONObject mo157848c() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("photoId", m157847b());
                jSONObject.put("title", this.f150651b);
                jSONObject.put("width", this.f150652c);
                jSONObject.put("height", this.f150653d);
                jSONObject.put("previewThumb", this.f150654e);
                jSONObject.put("rawUrl", this.f150655f);
                jSONObject.put("thumbUrl", this.f150656g);
                jSONObject.put("normalUrl", this.f150657h);
                jSONObject.put("hdUrl", this.f150658i);
                return jSONObject;
            }

            @Override // p732zy.C32596l.c.b
            /* renamed from: d */
            public C33080c mo157846a() {
                return new C33080c(m157847b(), this.f150651b, this.f150652c, this.f150653d, this.f150654e, this.f150655f, this.f150656g, this.f150657h, this.f150658i);
            }

            /* renamed from: e */
            public final int m157850e() {
                return this.f150653d;
            }

            /* renamed from: f */
            public final String m157851f() {
                return this.f150657h;
            }

            /* renamed from: g */
            public final String m157852g() {
                return this.f150656g;
            }

            /* renamed from: h */
            public final int m157853h() {
                return this.f150652c;
            }

            /* renamed from: i */
            public final void m157854i(int i11) {
                this.f150653d = i11;
            }

            /* renamed from: j */
            public final void m157855j(int i11) {
                this.f150652c = i11;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C33080c(long j11, String str, int i11, int i12, String str2, String str3, String str4, String str5, String str6) {
                super(j11);
                AbstractC19074t.m100208f(str, "title");
                AbstractC19074t.m100208f(str2, "previewThumb");
                AbstractC19074t.m100208f(str3, "rawUrl");
                AbstractC19074t.m100208f(str4, "thumbUrl");
                AbstractC19074t.m100208f(str5, "normalUrl");
                AbstractC19074t.m100208f(str6, "hdUrl");
                this.f150651b = str;
                this.f150652c = i11;
                this.f150653d = i12;
                this.f150654e = str2;
                this.f150655f = str3;
                this.f150656g = str4;
                this.f150657h = str5;
                this.f150658i = str6;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C33080c(JSONObject jSONObject) {
                this(r4, r6, r7, r8, r9, r10, r11, r12, r13);
                AbstractC19074t.m100208f(jSONObject, "json");
                long optLong = jSONObject.optLong("photoId", 0L);
                String optString = jSONObject.optString("title");
                AbstractC19074t.m100207e(optString, "optString(...)");
                int optInt = jSONObject.optInt("width");
                int optInt2 = jSONObject.optInt("height");
                String optString2 = jSONObject.optString("previewThumb");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                String optString3 = jSONObject.optString("rawUrl");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                String optString4 = jSONObject.optString("thumbUrl");
                AbstractC19074t.m100207e(optString4, "optString(...)");
                String optString5 = jSONObject.optString("normalUrl");
                AbstractC19074t.m100207e(optString5, "optString(...)");
                String optString6 = jSONObject.optString("hdUrl");
                AbstractC19074t.m100207e(optString6, "optString(...)");
            }
        }

        public c(int i11, b bVar) {
            this.f150648a = i11;
            this.f150649b = bVar;
        }

        /* renamed from: a */
        public final c m157842a() {
            b bVar;
            int i11 = this.f150648a;
            b bVar2 = this.f150649b;
            if (bVar2 != null) {
                bVar = bVar2.mo157846a();
            } else {
                bVar = null;
            }
            return new c(i11, bVar);
        }

        /* renamed from: b */
        public final b m157843b() {
            return this.f150649b;
        }

        /* renamed from: c */
        public final int m157844c() {
            return this.f150648a;
        }

        /* renamed from: d */
        public final JSONObject m157845d() {
            JSONObject jSONObject;
            b bVar = this.f150649b;
            if (bVar == null || (jSONObject = bVar.mo157848c()) == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f150648a);
            return jSONObject;
        }

        public /* synthetic */ c(int i11, b bVar, int i12, AbstractC19060k abstractC19060k) {
            this(i11, (i12 & 2) != 0 ? null : bVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            this(jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE), null, 2, null);
            AbstractC19074t.m100208f(jSONObject, "json");
            this.f150649b = this.f150648a == 0 ? new C33080c(jSONObject) : null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(C25750p c25750p) {
            this(0, r0);
            AbstractC19074t.m100208f(c25750p, "uploadResponse");
            C33080c c33080c = new C33080c(0L, "", 0, 0, c25750p.m132884c(), c25750p.m132885d(), c25750p.m132884c(), c25750p.m132885d(), c25750p.m132882a(), 12, null);
            C23307g c23307g = new C23307g(c25750p.m132883b());
            c33080c.m157855j(c23307g.f113474a);
            c33080c.m157854i(c23307g.f113475b);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: zy.l$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        private String f150659a;

        /* renamed from: b */
        private JSONObject f150660b;

        public d(String str, JSONObject jSONObject) {
            AbstractC19074t.m100208f(str, "title");
            this.f150659a = str;
            this.f150660b = jSONObject;
        }

        /* renamed from: a */
        public final d m157856a() {
            return new d(this.f150659a, this.f150660b);
        }

        /* renamed from: b */
        public final String m157857b() {
            return this.f150659a;
        }

        /* renamed from: c */
        public final void m157858c(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f150659a = str;
        }

        /* renamed from: d */
        public final JSONObject m157859d() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("title", this.f150659a);
            JSONObject jSONObject2 = this.f150660b;
            if (jSONObject2 != null) {
                jSONObject.put("params", jSONObject2);
            }
            return jSONObject;
        }

        public /* synthetic */ d(String str, JSONObject jSONObject, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(JSONObject jSONObject) {
            this(r0, jSONObject.optJSONObject("params"));
            AbstractC19074t.m100208f(jSONObject, "json");
            String optString = jSONObject.optString("title", "");
            AbstractC19074t.m100207e(optString, "optString(...)");
        }
    }

    public C32596l(long j11, int i11, String str, d dVar, b bVar, long j12, long j13) {
        AbstractC19074t.m100208f(str, "keyword");
        this.f150638a = j11;
        this.f150639b = i11;
        this.f150640c = str;
        this.f150641d = dVar;
        this.f150642e = bVar;
        this.f150643f = j12;
        this.f150644g = j13;
    }

    /* renamed from: a */
    public final C32596l m157826a() {
        d dVar;
        b bVar;
        long j11 = this.f150638a;
        int i11 = this.f150639b;
        String str = this.f150640c;
        d dVar2 = this.f150641d;
        if (dVar2 != null) {
            dVar = dVar2.m157856a();
        } else {
            dVar = null;
        }
        b bVar2 = this.f150642e;
        if (bVar2 != null) {
            bVar = bVar2.m157838a();
        } else {
            bVar = null;
        }
        return new C32596l(j11, i11, str, dVar, bVar, this.f150643f, this.f150644g);
    }

    /* renamed from: b */
    public final void m157827b(C32596l c32596l) {
        AbstractC19074t.m100208f(c32596l, "cloneItem");
        this.f150638a = c32596l.f150638a;
        this.f150639b = c32596l.f150639b;
        this.f150640c = c32596l.f150640c;
        this.f150641d = c32596l.f150641d;
        this.f150642e = c32596l.f150642e;
        this.f150643f = c32596l.f150643f;
        this.f150644g = c32596l.f150644g;
    }

    /* renamed from: c */
    public final long m157828c() {
        return this.f150643f;
    }

    /* renamed from: d */
    public final String m157829d() {
        String m157857b;
        String str;
        String m157857b2;
        int i11 = this.f150639b;
        String str2 = "";
        if (i11 != 0) {
            if (i11 != 1) {
                return "";
            }
            d dVar = this.f150641d;
            if (dVar != null) {
                str = dVar.m157857b();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                d dVar2 = this.f150641d;
                if (dVar2 != null && (m157857b2 = dVar2.m157857b()) != null) {
                    str2 = m157857b2;
                }
            } else {
                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_photo);
            }
            AbstractC19074t.m100205c(str2);
            return str2;
        }
        d dVar3 = this.f150641d;
        if (dVar3 == null || (m157857b = dVar3.m157857b()) == null) {
            return "";
        }
        return m157857b;
    }

    /* renamed from: e */
    public final long m157830e() {
        return this.f150638a;
    }

    /* renamed from: f */
    public final String m157831f() {
        return this.f150640c;
    }

    /* renamed from: g */
    public final long m157832g() {
        return this.f150644g;
    }

    /* renamed from: h */
    public final b m157833h() {
        return this.f150642e;
    }

    /* renamed from: i */
    public final d m157834i() {
        return this.f150641d;
    }

    /* renamed from: j */
    public final int m157835j() {
        return this.f150639b;
    }

    /* renamed from: k */
    public final void m157836k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f150640c = str;
    }

    /* renamed from: l */
    public final void m157837l(d dVar) {
        this.f150641d = dVar;
    }

    public /* synthetic */ C32596l(long j11, int i11, String str, d dVar, b bVar, long j12, long j13, int i12, AbstractC19060k abstractC19060k) {
        this(j11, i11, str, (i12 & 8) != 0 ? null : dVar, (i12 & 16) != 0 ? null : bVar, (i12 & 32) != 0 ? 0L : j12, (i12 & 64) != 0 ? 0L : j13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C32596l(JSONObject jSONObject) {
        this(r2, r4, r5, r6, r0 != null ? new b(r0) : null, jSONObject.optLong("createdTime"), jSONObject.optLong("lastModified"));
        AbstractC19074t.m100208f(jSONObject, "json");
        long optLong = jSONObject.optLong("id");
        int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        String optString = jSONObject.optString("keyword");
        AbstractC19074t.m100207e(optString, "optString(...)");
        JSONObject optJSONObject = jSONObject.optJSONObject("message");
        d dVar = optJSONObject != null ? new d(optJSONObject) : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("media");
    }
}
