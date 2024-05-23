package mk0;

import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* renamed from: mk0.a */
/* loaded from: classes7.dex */
public final class C23342a {

    /* renamed from: a */
    public static final C23342a f113549a = new C23342a();

    private C23342a() {
    }

    /* renamed from: a */
    public static final int m122747a(JSONObject jSONObject, boolean z11, int i11) {
        if (jSONObject == null) {
            return i11;
        }
        if (AbstractC19074t.m100204b(jSONObject.optString("source"), "zvideo")) {
            if (z11) {
                return 26050;
            }
            if (!z11) {
                return 26051;
            }
            throw new NoWhenBranchMatchedException();
        }
        return i11;
    }
}
