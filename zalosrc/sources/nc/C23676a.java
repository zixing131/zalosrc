package nc;

import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.C20128b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import k30.C21459a;
import me0.AbstractC23020b3;
import ni.C23794a;
import org.json.JSONArray;
import org.json.JSONObject;
import p185gc.AbstractC19384h;
import p263jc.C21216s;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import p423pi.C24761c;
import p423pi.C24764f;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29231f;

/* renamed from: nc.a */
/* loaded from: classes3.dex */
public final class C23676a extends AbstractC19384h {

    /* renamed from: a */
    private final C21216s f114689a;

    /* renamed from: b */
    private final C23794a f114690b;

    /* renamed from: nc.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f114691a;

        /* renamed from: b */
        private final Map f114692b;

        public a(String str, Map map) {
            AbstractC19074t.m100208f(str, "date");
            AbstractC19074t.m100208f(map, "threadLogMap");
            this.f114691a = str;
            this.f114692b = map;
        }

        /* renamed from: a */
        public final String m124010a() {
            return this.f114691a;
        }

        /* renamed from: b */
        public final Map m124011b() {
            return this.f114692b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114691a, aVar.f114691a) && AbstractC19074t.m100204b(this.f114692b, aVar.f114692b);
        }

        public int hashCode() {
            return (this.f114691a.hashCode() * 31) + this.f114692b.hashCode();
        }

        public String toString() {
            return "Params(date=" + this.f114691a + ", threadLogMap=" + this.f114692b + ")";
        }
    }

    /* renamed from: nc.a$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final C23648e f114693a;

        public b(C23648e c23648e) {
            AbstractC19074t.m100208f(c23648e, "av2Log");
            this.f114693a = c23648e;
        }

        /* renamed from: a */
        public final C23648e m124012a() {
            return this.f114693a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f114693a, ((b) obj).f114693a);
        }

        public int hashCode() {
            return this.f114693a.hashCode();
        }

        public String toString() {
            return "Result(av2Log=" + this.f114693a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f114694q = new c();

        c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:            if (r2.intValue() == 1) goto L9;     */
        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128706e = c24761c.m128706e();
            if (m128706e != null) {
                z11 = true;
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f114695q = new d();

        d() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:            if (r2.intValue() == 1) goto L9;     */
        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128705d = c24761c.m128705d();
            if (m128705d != null) {
                z11 = true;
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f114696q = new e();

        e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128705d = c24761c.m128705d();
            if (m128705d != null && m128705d.intValue() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f114697q = new f();

        f() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:            if (r2.intValue() == 1) goto L9;     */
        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128702a = c24761c.m128702a();
            if (m128702a != null) {
                z11 = true;
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final g f114698q = new g();

        g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128702a = c24761c.m128702a();
            if (m128702a != null && m128702a.intValue() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final h f114699q = new h();

        h() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128702a = c24761c.m128702a();
            if (m128702a != null && m128702a.intValue() == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final i f114700q = new i();

        i() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128702a = c24761c.m128702a();
            if (m128702a != null && m128702a.intValue() == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final j f114701q = new j();

        j() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:            if (r2.intValue() == 1) goto L9;     */
        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128707f = c24761c.m128707f();
            if (m128707f != null) {
                z11 = true;
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final k f114702q = new k();

        k() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:            if (r3.m128708g() == 1) goto L11;     */
        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128706e = c24761c.m128706e();
            if (m128706e != null) {
                z11 = true;
                if (m128706e.intValue() == 1) {
                }
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.a$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final l f114703q = new l();

        l() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:            if (r2.m128708g() == 1) goto L11;     */
        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean mo205i9(C24761c c24761c) {
            boolean z11;
            AbstractC19074t.m100208f(c24761c, "log");
            Integer m128702a = c24761c.m128702a();
            if (m128702a == null || m128702a.intValue() != 0) {
                z11 = true;
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    public C23676a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: d */
    private final String[] m124008d(String str, Map map) {
        boolean z11;
        Object obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceId", AbstractC23020b3.m118021b(MainApplication.Companion.m35500c()).toString());
        if (C21459a.m111034b(C20128b.m104761h()) < this.f114689a.m109886m0().m128658t()) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str2 = "0";
        if (!z11) {
            obj = "0";
        } else {
            obj = "1";
        }
        jSONObject.put("isFull", obj);
        if (!this.f114690b.m124326d()) {
            str2 = "1";
        }
        jSONObject.put("isOffSetting", str2);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            C24764f c24764f = (C24764f) entry.getValue();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", AbstractC25495a.m132089n(str3));
                if (AbstractC25495a.m132079d(str3)) {
                    jSONObject2.put("tsz", c24764f.m128729c());
                }
                jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, c24764f.m128730d());
                jSONObject2.put("date", str);
                C23682g c23682g = C23682g.f114732a;
                jSONObject2.put("tc", c23682g.m124053d(c24764f.m128727a(), c.f114694q));
                AbstractC29231f.m145986d(jSONObject2, "qca", c23682g.m124053d(c24764f.m128727a(), d.f114695q));
                AbstractC29231f.m145986d(jSONObject2, "qcv", c23682g.m124053d(c24764f.m128727a(), e.f114696q));
                AbstractC29231f.m145986d(jSONObject2, "dca", c23682g.m124053d(c24764f.m128727a(), f.f114697q));
                AbstractC29231f.m145986d(jSONObject2, "dcv", c23682g.m124053d(c24764f.m128727a(), g.f114698q));
                AbstractC29231f.m145986d(jSONObject2, "cca", c23682g.m124053d(c24764f.m128727a(), h.f114699q));
                AbstractC29231f.m145986d(jSONObject2, "ccv", c23682g.m124053d(c24764f.m128727a(), i.f114700q));
                AbstractC29231f.m145986d(jSONObject2, "rqc", c23682g.m124057i(c24764f.m128728b()));
                AbstractC29231f.m145986d(jSONObject2, "rrqc", c23682g.m124053d(c24764f.m128727a(), j.f114701q));
                jSONArray.put(jSONObject2);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            List m128727a = c24764f.m128727a();
            if (m128727a != null) {
                arrayList.addAll(m128727a);
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        C23682g c23682g2 = C23682g.f114732a;
        AbstractC29231f.m145986d(jSONObject3, "tsc", c23682g2.m124053d(arrayList, k.f114702q));
        AbstractC29231f.m145986d(jSONObject3, "dsc", c23682g2.m124053d(arrayList, l.f114703q));
        String jSONObject4 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject4, "toString(...)");
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        String jSONObject5 = jSONObject3.toString();
        AbstractC19074t.m100207e(jSONObject5, "toString(...)");
        return new String[]{jSONObject4, jSONArray2, jSONObject5};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        String[] m124008d = m124008d(aVar.m124010a(), aVar.m124011b());
        return new b(new C23648e(1, "media_daily", 1, "chat_media_auto_download_log", (String[]) Arrays.copyOf(m124008d, m124008d.length)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C23676a(C21216s c21216s, C23794a c23794a, int i11, AbstractC19060k abstractC19060k) {
        this(c21216s, c23794a);
        if ((i11 & 1) != 0) {
            c21216s = AbstractC23306f.m120652d();
            AbstractC19074t.m100207e(c21216s, "provideAutoDownloadMsgResourcesController(...)");
        }
        if ((i11 & 2) != 0) {
            c23794a = AbstractC23306f.m120660f();
            AbstractC19074t.m100207e(c23794a, "provideAutoDownloadRepo(...)");
        }
    }

    public C23676a(C21216s c21216s, C23794a c23794a) {
        AbstractC19074t.m100208f(c21216s, "controller");
        AbstractC19074t.m100208f(c23794a, "autoDLRepo");
        this.f114689a = c21216s;
        this.f114690b = c23794a;
    }
}
