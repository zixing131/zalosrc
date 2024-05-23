package ck;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p577vj.C28266a;

/* renamed from: ck.c */
/* loaded from: classes3.dex */
public final class C3562c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public int f15088a = -1;

    /* renamed from: b */
    public C28266a f15089b;

    /* renamed from: ck.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3562c m18096a(String str, String str2) {
            AbstractC19074t.m100208f(str2, "ownerId");
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    C3562c c3562c = new C3562c();
                    c3562c.f15088a = jSONObject.optInt("countUnread", 1);
                    String optString = jSONObject.optString("reactionInfo");
                    AbstractC19074t.m100205c(optString);
                    if (optString.length() > 0) {
                        c3562c.f15089b = C28266a.Companion.m142390a(optString, str2);
                    }
                    return c3562c;
                } catch (JSONException e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            return null;
        }
    }

    public String toString() {
        return "MsgExtraInfo(reactionInfo=" + this.f15089b + ")";
    }
}
