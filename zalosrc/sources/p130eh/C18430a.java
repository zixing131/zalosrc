package p130eh;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: eh.a */
/* loaded from: classes3.dex */
public final class C18430a {

    /* renamed from: a */
    private String f92921a;

    /* renamed from: b */
    private int f92922b;

    public C18430a(String str, int i11) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f92921a = str;
        this.f92922b = i11;
    }

    /* renamed from: a */
    public final int m97661a() {
        return this.f92922b;
    }

    /* renamed from: b */
    public final String m97662b() {
        return this.f92921a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18430a)) {
            return false;
        }
        C18430a c18430a = (C18430a) obj;
        return AbstractC19074t.m100204b(this.f92921a, c18430a.f92921a) && this.f92922b == c18430a.f92922b;
    }

    public int hashCode() {
        return (this.f92921a.hashCode() * 31) + this.f92922b;
    }

    public String toString() {
        return "ConversationLabelInfo(threadId=" + this.f92921a + ", labelId=" + this.f92922b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18430a(int i11, JSONObject jSONObject) {
        this("", i11);
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
        String optString = jSONObject.optString("id", "");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f92921a = optString;
        if (optInt == 1) {
            this.f92921a = "group_" + optString;
        }
    }
}
