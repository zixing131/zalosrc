package nc;

import com.zing.zalo.MainApplication;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.Map;
import me0.AbstractC23020b3;
import org.json.JSONArray;
import org.json.JSONObject;
import p185gc.AbstractC19384h;
import p361nb.C23648e;
import p423pi.C24761c;
import p423pi.C24764f;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29231f;

/* renamed from: nc.b */
/* loaded from: classes3.dex */
public final class C23677b extends AbstractC19384h {

    /* renamed from: nc.b$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f114704a;

        /* renamed from: b */
        private final Map f114705b;

        public a(String str, Map map) {
            AbstractC19074t.m100208f(str, "date");
            AbstractC19074t.m100208f(map, "threadLogMap");
            this.f114704a = str;
            this.f114705b = map;
        }

        /* renamed from: a */
        public final String m124025a() {
            return this.f114704a;
        }

        /* renamed from: b */
        public final Map m124026b() {
            return this.f114705b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114704a, aVar.f114704a) && AbstractC19074t.m100204b(this.f114705b, aVar.f114705b);
        }

        public int hashCode() {
            return (this.f114704a.hashCode() * 31) + this.f114705b.hashCode();
        }

        public String toString() {
            return "Params(date=" + this.f114704a + ", threadLogMap=" + this.f114705b + ")";
        }
    }

    /* renamed from: nc.b$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final C23648e f114706a;

        public b(C23648e c23648e) {
            AbstractC19074t.m100208f(c23648e, "av2Log");
            this.f114706a = c23648e;
        }

        /* renamed from: a */
        public final C23648e m124027a() {
            return this.f114706a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f114706a, ((b) obj).f114706a);
        }

        public int hashCode() {
            return this.f114706a.hashCode();
        }

        public String toString() {
            return "Result(av2Log=" + this.f114706a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f114707q = new c();

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
            Integer m128705d = c24761c.m128705d();
            if (m128705d != null) {
                z11 = true;
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nc.b$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f114708q = new d();

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
            Integer m128702a = c24761c.m128702a();
            if (m128702a != null) {
                z11 = true;
            }
            z11 = false;
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: d */
    private final String[] m124023d(String str, Map map) {
        String uuid = AbstractC23020b3.m118021b(MainApplication.Companion.m35500c()).toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            C24764f c24764f = (C24764f) entry.getValue();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", AbstractC25495a.m132089n(str2));
                if (AbstractC25495a.m132079d(str2)) {
                    jSONObject.put("tsz", c24764f.m128729c());
                }
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, c24764f.m128730d());
                jSONObject.put("date", str);
                C23682g c23682g = C23682g.f114732a;
                AbstractC29231f.m145986d(jSONObject, "qc", c23682g.m124053d(c24764f.m128727a(), c.f114707q));
                AbstractC29231f.m145986d(jSONObject, "dc", c23682g.m124053d(c24764f.m128727a(), d.f114708q));
                AbstractC29231f.m145986d(jSONObject, "rqc", c23682g.m124057i(c24764f.m128728b()));
                jSONArray.put(jSONObject);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return new String[]{uuid, jSONArray2};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        String[] m124023d = m124023d(aVar.m124025a(), aVar.m124026b());
        return new b(new C23648e(1, "sync_pc_daily", 1, "chat_media_auto_download_log", (String[]) Arrays.copyOf(m124023d, m124023d.length)));
    }
}
