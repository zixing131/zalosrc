package be0;

import be0.C2778c;
import fn0.AbstractC19074t;
import gw.C19636i1;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONObject;
import p185gc.AbstractC19377a;
import p348mi.AbstractC23306f;
import wm0.AbstractC29094b;

/* renamed from: be0.m */
/* loaded from: classes4.dex */
public final class C2788m extends AbstractC19377a {

    /* renamed from: a */
    private final C19636i1 f11099a;

    /* renamed from: be0.m$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final JSONArray f11100a;

        public a(JSONArray jSONArray) {
            AbstractC19074t.m100208f(jSONArray, "jsArrData");
            this.f11100a = jSONArray;
        }

        /* renamed from: a */
        public final JSONArray m13429a() {
            return this.f11100a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f11100a, ((a) obj).f11100a);
        }

        public int hashCode() {
            return this.f11100a.hashCode();
        }

        public String toString() {
            return "Params(jsArrData=" + this.f11100a + ")";
        }
    }

    /* renamed from: be0.m$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final Map f11101a;

        public b(Map map) {
            AbstractC19074t.m100208f(map, "mapCountChanges");
            this.f11101a = map;
        }

        /* renamed from: a */
        public final Map m13430a() {
            return this.f11101a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f11101a, ((b) obj).f11101a);
        }

        public int hashCode() {
            return this.f11101a.hashCode();
        }

        public String toString() {
            return "Result(mapCountChanges=" + this.f11101a + ")";
        }
    }

    public C2788m(C19636i1 c19636i1) {
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        this.f11099a = c19636i1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        JSONArray jSONArray;
        int i11;
        int i12;
        JSONArray jSONArray2;
        int i13;
        HashMap hashMap = new HashMap();
        JSONArray m13429a = aVar.m13429a();
        int length = m13429a.length();
        int i14 = 0;
        while (i14 < length) {
            Object obj = m13429a.get(i14);
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            String optString = jSONObject.optString("tId");
            JSONArray optJSONArray = jSONObject.optJSONArray("ids");
            if (optJSONArray != null) {
                int length2 = optJSONArray.length();
                int i15 = 0;
                i12 = 0;
                while (i15 < length2) {
                    Object obj2 = optJSONArray.get(i15);
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    String optString2 = jSONObject2.optString("id");
                    if (AbstractC19074t.m100204b(optString2, optString)) {
                        long optLong = jSONObject2.optLong("cmiSeen");
                        jSONArray2 = m13429a;
                        i13 = length;
                        long optLong2 = jSONObject2.optLong("cmiDeliver");
                        C19636i1 c19636i1 = this.f11099a;
                        AbstractC19074t.m100205c(optString2);
                        boolean m102777n = c19636i1.m102777n(optString2, optLong2);
                        boolean m102779o = this.f11099a.m102779o(optString2, optLong);
                        if (m102777n || m102779o) {
                            i12++;
                        }
                    } else {
                        jSONArray2 = m13429a;
                        i13 = length;
                    }
                    i15++;
                    m13429a = jSONArray2;
                    length = i13;
                }
                jSONArray = m13429a;
                i11 = length;
            } else {
                jSONArray = m13429a;
                i11 = length;
                i12 = 0;
            }
            AbstractC19074t.m100205c(optString);
            hashMap.put(optString, AbstractC29094b.m145341c(i12));
            AbstractC23306f.m120631X().m101508a(new C2778c.b(optString));
            i14++;
            m13429a = jSONArray;
            length = i11;
        }
        return new b(hashMap);
    }
}
