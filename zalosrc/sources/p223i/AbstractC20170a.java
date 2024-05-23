package p223i;

import org.json.JSONObject;
import p043c.C3172h;

/* renamed from: i.a */
/* loaded from: classes2.dex */
public abstract class AbstractC20170a {
    /* renamed from: a */
    protected abstract Object mo433a(JSONObject jSONObject);

    /* renamed from: b */
    protected abstract JSONObject mo434b();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object clone() {
        String m15964b;
        try {
            JSONObject mo434b = mo434b();
            if (mo434b != null && (m15964b = C3172h.m15963a().m15964b(mo434b.toString())) != null && m15964b.length() != 0) {
                return mo433a(new JSONObject(m15964b));
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
