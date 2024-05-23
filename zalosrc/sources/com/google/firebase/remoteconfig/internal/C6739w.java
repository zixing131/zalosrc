package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p014a8.InterfaceC0650a;
import p015a9.InterfaceC0662b;

/* renamed from: com.google.firebase.remoteconfig.internal.w */
/* loaded from: classes3.dex */
public class C6739w {

    /* renamed from: a */
    private final InterfaceC0662b f37092a;

    /* renamed from: b */
    private final Map f37093b = Collections.synchronizedMap(new HashMap());

    public C6739w(InterfaceC0662b interfaceC0662b) {
        this.f37092a = interfaceC0662b;
    }

    /* renamed from: a */
    public void m34512a(String str, C6723g c6723g) {
        JSONObject optJSONObject;
        InterfaceC0650a interfaceC0650a = (InterfaceC0650a) this.f37092a.get();
        if (interfaceC0650a == null) {
            return;
        }
        JSONObject m34386h = c6723g.m34386h();
        if (m34386h.length() < 1) {
            return;
        }
        JSONObject m34384f = c6723g.m34384f();
        if (m34384f.length() < 1 || (optJSONObject = m34386h.optJSONObject(str)) == null) {
            return;
        }
        String optString = optJSONObject.optString("choiceId");
        if (optString.isEmpty()) {
            return;
        }
        synchronized (this.f37093b) {
            try {
                if (optString.equals(this.f37093b.get(str))) {
                    return;
                }
                this.f37093b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", m34384f.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString("group", optJSONObject.optString("group"));
                interfaceC0650a.mo930a("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                interfaceC0650a.mo930a("fp", "_fpc", bundle2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
