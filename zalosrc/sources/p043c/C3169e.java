package p043c;

import org.json.JSONObject;
import p025b.AbstractC2472a;

/* renamed from: c.e */
/* loaded from: classes2.dex */
public final class C3169e implements InterfaceC3168d {

    /* renamed from: a */
    static InterfaceC3165a f13388a;

    /* renamed from: b */
    private static String f13389b;

    /* renamed from: c */
    private static String f13390c;

    /* renamed from: d */
    private static String f13391d;

    /* renamed from: e */
    private static String f13392e;

    /* renamed from: f */
    private static String f13393f;

    /* renamed from: g */
    private static String f13394g;

    /* renamed from: h */
    private static String f13395h;

    /* renamed from: i */
    private static String f13396i;

    static {
        try {
            InterfaceC3165a m15953a = new C3167c().m15953a();
            f13388a = m15953a;
            f13389b = m15953a.mo15948c(AbstractC3177m.f13401a);
            f13390c = f13388a.mo15948c(AbstractC3177m.f13402b);
            f13391d = f13388a.mo15948c(AbstractC3177m.f13403c);
            f13392e = f13388a.mo15948c(AbstractC3177m.f13404d);
            f13393f = f13388a.mo15948c(AbstractC3177m.f13406f);
            f13394g = f13388a.mo15948c(AbstractC3177m.f13407g);
            f13395h = f13388a.mo15948c(AbstractC3177m.f13408h);
            f13396i = f13388a.mo15948c(AbstractC3177m.f13405e);
        } catch (Exception unused) {
        }
    }

    @Override // p043c.InterfaceC3168d
    /* renamed from: a */
    public String mo15954a() {
        try {
            return AbstractC2472a.m12486a();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public JSONObject m15956b(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString(f13389b);
            if (optString != null && optString.equals(f13395h)) {
                optString = f13394g;
            }
            String optString2 = jSONObject.optString(f13390c);
            String mo15947b = f13388a.mo15947b(jSONObject.optString(f13392e), optString, optString2);
            if (mo15947b != null && mo15947b.length() != 0) {
                jSONObject.put(f13389b, optString);
                jSONObject.put(f13396i, mo15947b);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // p043c.InterfaceC3168d
    /* renamed from: c */
    public String mo15955c(String str) {
        if (str == null) {
            return str;
        }
        try {
            if (str.length() == 0) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return !m15957d(jSONObject) ? str : m15956b(jSONObject).toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: d */
    public boolean m15957d(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString(f13389b);
            String optString2 = jSONObject.optString(f13391d);
            String optString3 = jSONObject.optString(f13392e);
            if ((optString == null || optString.equals(f13394g) || optString.equals(f13395h)) && ((optString2 == null || !optString2.equals(f13393f)) && optString3 != null && optString3.length() != 0)) {
                if (new C3167c().m15953a().mo15946a()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
