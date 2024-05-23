package p726zr;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: zr.b */
/* loaded from: classes4.dex */
public final class C32546b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f150398a;

    /* renamed from: b */
    private List f150399b;

    /* renamed from: zr.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C32546b m157609a(JSONObject jSONObject) {
            int i11 = 0;
            if (jSONObject != null) {
                try {
                    int optInt = jSONObject.optInt("current_reaction_id", 1);
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = jSONObject.optJSONArray("top_reactions");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i12 = 0; i12 < length; i12++) {
                            Object obj = optJSONArray.get(i12);
                            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject2 = (JSONObject) obj;
                            arrayList.add(new C32550f(jSONObject2.optInt("id", 0), jSONObject2.optInt("count", 0)));
                        }
                    }
                    return new C32546b(optInt, arrayList);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            return new C32546b(i11, null, 2, 0 == true ? 1 : 0);
        }
    }

    public C32546b(int i11, List list) {
        AbstractC19074t.m100208f(list, "topReactions");
        this.f150398a = i11;
        this.f150399b = list;
    }

    /* renamed from: a */
    public final int m157605a() {
        return this.f150398a;
    }

    /* renamed from: b */
    public final List m157606b() {
        int m131511r;
        List list = this.f150399b;
        m131511r = AbstractC25370t.m131511r(list, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C32550f) it.next()).m157624d()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List m157607c() {
        return this.f150399b;
    }

    /* renamed from: d */
    public final JSONObject m157608d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("current_reaction_id", this.f150398a);
            JSONArray jSONArray = new JSONArray();
            for (C32550f c32550f : this.f150399b) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", c32550f.m157624d());
                jSONObject2.put("count", c32550f.m157623c());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("top_reactions", jSONArray);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32546b)) {
            return false;
        }
        C32546b c32546b = (C32546b) obj;
        return this.f150398a == c32546b.f150398a && AbstractC19074t.m100204b(this.f150399b, c32546b.f150399b);
    }

    public int hashCode() {
        return (this.f150398a * 31) + this.f150399b.hashCode();
    }

    public String toString() {
        return "FeedReactionDetailContent(currentReactionId=" + this.f150398a + ", topReactions=" + this.f150399b + ")";
    }

    public /* synthetic */ C32546b(int i11, List list, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? AbstractC25368s.m131502j() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32546b(C32546b c32546b) {
        this(c32546b.f150398a, c32546b.f150399b);
        AbstractC19074t.m100208f(c32546b, "feedReactionDetailContent");
    }
}
