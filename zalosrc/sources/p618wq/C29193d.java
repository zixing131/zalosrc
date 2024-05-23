package p618wq;

import androidx.work.AbstractC2144f;
import bo.C3020p0;
import bo.C3039t0;
import bo.C3051w0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.social.controls.LikeContactItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p726zr.C32546b;

/* renamed from: wq.d */
/* loaded from: classes4.dex */
public final class C29193d {

    /* renamed from: e */
    public static final a f135260e = new a(null);

    /* renamed from: a */
    private final int f135261a;

    /* renamed from: b */
    private final List f135262b;

    /* renamed from: c */
    private final boolean f135263c;

    /* renamed from: d */
    private final C32546b f135264d;

    /* renamed from: wq.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C29193d m145759a(C3020p0 c3020p0) {
            List list;
            AbstractC19074t.m100208f(c3020p0, "feedItem");
            C3039t0 c3039t0 = c3020p0.f12025E;
            if (c3039t0 != null) {
                ArrayList arrayList = new ArrayList();
                C3051w0 c3051w0 = c3039t0.f12246d;
                if (c3051w0 != null && (list = c3051w0.f12301a) != null) {
                    AbstractC19074t.m100205c(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new LikeContactItem((ContactProfile) it.next()));
                    }
                }
                return new C29193d(c3039t0.f12244b, arrayList, c3020p0.f12064w, null, 8, null);
            }
            return new C29193d(0, null, false, null, 15, null);
        }

        /* renamed from: b */
        public final C29193d m145760b(JSONObject jSONObject) {
            JSONObject optJSONObject;
            C32546b c32546b;
            if (jSONObject != null) {
                try {
                    optJSONObject = jSONObject.optJSONObject("like_info");
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            } else {
                optJSONObject = null;
            }
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("tot", 0);
                boolean optBoolean = optJSONObject.optBoolean("is_like", false);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("reaction_info");
                if (optJSONObject2 != null) {
                    c32546b = C32546b.Companion.m157609a(optJSONObject2);
                } else {
                    c32546b = null;
                }
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = optJSONObject.optJSONArray("list");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj = optJSONArray.get(i11);
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                        arrayList.add(new LikeContactItem((JSONObject) obj));
                    }
                }
                if (c32546b == null) {
                    c32546b = new C32546b(0, null, 2, null);
                }
                return new C29193d(optInt, arrayList, optBoolean, c32546b);
            }
            return new C29193d(0, null, false, null, 15, null);
        }
    }

    public C29193d(int i11, List list, boolean z11, C32546b c32546b) {
        AbstractC19074t.m100208f(list, "recentlyLikedUsers");
        AbstractC19074t.m100208f(c32546b, "feedItemReactionInfo");
        this.f135261a = i11;
        this.f135262b = list;
        this.f135263c = z11;
        this.f135264d = c32546b;
    }

    /* renamed from: a */
    public final C32546b m145754a() {
        return this.f135264d;
    }

    /* renamed from: b */
    public final List m145755b() {
        return this.f135262b;
    }

    /* renamed from: c */
    public final int m145756c() {
        return this.f135261a;
    }

    /* renamed from: d */
    public final boolean m145757d() {
        return this.f135263c;
    }

    /* renamed from: e */
    public final JSONObject m145758e() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f135262b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((LikeContactItem) it.next()).m56334e());
        }
        JSONObject m157608d = this.f135264d.m157608d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tot", this.f135261a);
        jSONObject.put("is_like", this.f135263c);
        jSONObject.put("list", jSONArray);
        jSONObject.put("reaction_info", m157608d);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29193d)) {
            return false;
        }
        C29193d c29193d = (C29193d) obj;
        return this.f135261a == c29193d.f135261a && AbstractC19074t.m100204b(this.f135262b, c29193d.f135262b) && this.f135263c == c29193d.f135263c && AbstractC19074t.m100204b(this.f135264d, c29193d.f135264d);
    }

    public int hashCode() {
        return (((((this.f135261a * 31) + this.f135262b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f135263c)) * 31) + this.f135264d.hashCode();
    }

    public String toString() {
        return "RealTimeLikeInfo(totalLike=" + this.f135261a + ", recentlyLikedUsers=" + this.f135262b + ", isLike=" + this.f135263c + ", feedItemReactionInfo=" + this.f135264d + ")";
    }

    public /* synthetic */ C29193d(int i11, List list, boolean z11, C32546b c32546b, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? new ArrayList() : list, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? new C32546b(0, null, 2, null) : c32546b);
    }
}
