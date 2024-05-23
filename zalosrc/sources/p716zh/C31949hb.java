package p716zh;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import qm0.AbstractC25378x;
import vg.C28211v5;

/* renamed from: zh.hb */
/* loaded from: classes.dex */
public final class C31949hb {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C28211v5 f146828a;

    /* renamed from: b */
    private final ArrayList f146829b;

    /* renamed from: zh.hb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C31949hb m153607a(C28211v5 c28211v5, String[] strArr) {
            AbstractC19074t.m100208f(c28211v5, "name");
            AbstractC19074t.m100208f(strArr, "emojis");
            ArrayList arrayList = new ArrayList();
            AbstractC25378x.m131549y(arrayList, strArr);
            return new C31949hb(c28211v5, arrayList);
        }

        /* renamed from: b */
        public final C31949hb m153608b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                C28211v5 c28211v5 = new C28211v5(jSONObject.optJSONObject("name"));
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("emojis");
                if (optJSONArray != null) {
                    AbstractC19074t.m100205c(optJSONArray);
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        arrayList.add(optJSONArray.getString(i11));
                    }
                }
                return new C31949hb(c28211v5, arrayList);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
    }

    public C31949hb(C28211v5 c28211v5, ArrayList arrayList) {
        AbstractC19074t.m100208f(c28211v5, "name");
        AbstractC19074t.m100208f(arrayList, "emojis");
        this.f146828a = c28211v5;
        this.f146829b = arrayList;
    }

    /* renamed from: a */
    public static final C31949hb m153603a(C28211v5 c28211v5, String[] strArr) {
        return Companion.m153607a(c28211v5, strArr);
    }

    /* renamed from: b */
    public static final C31949hb m153604b(JSONObject jSONObject) {
        return Companion.m153608b(jSONObject);
    }

    /* renamed from: c */
    public final ArrayList m153605c() {
        return this.f146829b;
    }

    /* renamed from: d */
    public final C28211v5 m153606d() {
        return this.f146828a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31949hb)) {
            return false;
        }
        C31949hb c31949hb = (C31949hb) obj;
        return AbstractC19074t.m100204b(this.f146828a, c31949hb.f146828a) && AbstractC19074t.m100204b(this.f146829b, c31949hb.f146829b);
    }

    public int hashCode() {
        return (this.f146828a.hashCode() * 31) + this.f146829b.hashCode();
    }

    public String toString() {
        C28211v5 c28211v5 = this.f146828a;
        return "SystemEmojiCateInfo(name=" + ((Object) c28211v5) + ", emojis=" + this.f146829b + ")";
    }
}
