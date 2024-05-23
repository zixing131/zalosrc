package p620wt;

import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import org.json.JSONObject;

/* renamed from: wt.f */
/* loaded from: classes4.dex */
public abstract class AbstractC29231f {
    /* renamed from: a */
    public static final int m145983a(JSONObject jSONObject, String str, int i11, int i12, int i13) {
        int m116588k;
        AbstractC19074t.m100208f(jSONObject, "<this>");
        AbstractC19074t.m100208f(str, "name");
        m116588k = AbstractC22543l.m116588k(jSONObject.optInt(str, i11), i12, i13);
        return m116588k;
    }

    /* renamed from: b */
    public static final long m145984b(JSONObject jSONObject, String str, long j11, long j12, long j13) {
        long m116589l;
        AbstractC19074t.m100208f(jSONObject, "<this>");
        AbstractC19074t.m100208f(str, "name");
        m116589l = AbstractC22543l.m116589l(jSONObject.optLong(str, j11), j12, j13);
        return m116589l;
    }

    /* renamed from: c */
    public static /* synthetic */ long m145985c(JSONObject jSONObject, String str, long j11, long j12, long j13, int i11, Object obj) {
        long j14;
        if ((i11 & 8) != 0) {
            j14 = Long.MAX_VALUE;
        } else {
            j14 = j13;
        }
        return m145984b(jSONObject, str, j11, j12, j14);
    }

    /* renamed from: d */
    public static final void m145986d(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        AbstractC19074t.m100208f(jSONObject, "<this>");
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(jSONObject2, "jsonObject");
        if (jSONObject2.length() == 0) {
            return;
        }
        jSONObject.put(str, jSONObject2);
    }

    /* renamed from: e */
    public static final void m145987e(JSONObject jSONObject, String str, double d11) {
        AbstractC19074t.m100208f(jSONObject, "<this>");
        AbstractC19074t.m100208f(str, "key");
        if (d11 == 0.0d) {
            return;
        }
        jSONObject.put(str, d11);
    }

    /* renamed from: f */
    public static final void m145988f(JSONObject jSONObject, String str, int i11) {
        AbstractC19074t.m100208f(jSONObject, "<this>");
        AbstractC19074t.m100208f(str, "key");
        if (i11 == 0) {
            return;
        }
        jSONObject.put(str, i11);
    }

    /* renamed from: g */
    public static final void m145989g(JSONObject jSONObject, String str, long j11) {
        AbstractC19074t.m100208f(jSONObject, "<this>");
        AbstractC19074t.m100208f(str, "key");
        if (j11 == 0) {
            return;
        }
        jSONObject.put(str, j11);
    }
}
