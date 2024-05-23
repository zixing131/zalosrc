package p183g8;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p153f8.C18821f;
import p201h8.InterfaceC19922a;
import p201h8.InterfaceC19923b;

/* renamed from: g8.d */
/* loaded from: classes.dex */
public class C19294d implements InterfaceC19292b, InterfaceC19923b {

    /* renamed from: a */
    private InterfaceC19922a f95808a;

    /* renamed from: b */
    private static String m101008b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p183g8.InterfaceC19292b
    /* renamed from: R */
    public void mo101007R(String str, Bundle bundle) {
        InterfaceC19922a interfaceC19922a = this.f95808a;
        if (interfaceC19922a != null) {
            try {
                interfaceC19922a.mo103697a("$A$:" + m101008b(str, bundle));
            } catch (JSONException unused) {
                C18821f.m98795f().m98804k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // p201h8.InterfaceC19923b
    /* renamed from: a */
    public void mo97166a(InterfaceC19922a interfaceC19922a) {
        this.f95808a = interfaceC19922a;
        C18821f.m98795f().m98796b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
