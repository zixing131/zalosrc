package nz;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nz.AbstractC23968e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: nz.c */
/* loaded from: classes4.dex */
public final class C23966c {

    /* renamed from: a */
    private String f115998a;

    /* renamed from: b */
    private boolean f115999b;

    /* renamed from: c */
    private AbstractC23968e f116000c;

    /* renamed from: d */
    private final List f116001d;

    public C23966c() {
        this.f115998a = "";
        this.f116001d = new ArrayList();
    }

    /* renamed from: f */
    private final void m125421f(AbstractC23968e.b bVar, JSONArray jSONArray, HashMap hashMap) {
        String str;
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("id");
                if (bVar.m125430a().length() == 0) {
                    str = String.valueOf(optInt);
                } else {
                    str = bVar.m125430a() + "." + optInt;
                }
                AbstractC23968e abstractC23968e = (AbstractC23968e) hashMap.get(str);
                if (abstractC23968e != null) {
                    AbstractC19074t.m100205c(abstractC23968e);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("child");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        AbstractC23968e.b bVar2 = new AbstractC23968e.b(optInt, abstractC23968e.m125432c(), abstractC23968e.m125431b(), str);
                        bVar.m125436g(bVar2);
                        if (!this.f115999b) {
                            this.f115999b = true;
                        }
                        m125421f(bVar2, optJSONArray, hashMap);
                    } else {
                        bVar.m125436g(new AbstractC23968e.c(optInt, abstractC23968e.m125432c(), abstractC23968e.m125431b(), str));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final List m125422a() {
        return this.f116001d;
    }

    /* renamed from: b */
    public final String m125423b() {
        return this.f115998a;
    }

    /* renamed from: c */
    public final AbstractC23968e m125424c() {
        return this.f116000c;
    }

    /* renamed from: d */
    public final boolean m125425d() {
        return this.f115999b;
    }

    /* renamed from: e */
    public final boolean m125426e() {
        AbstractC23968e abstractC23968e = this.f116000c;
        if (this.f115998a.length() > 0 && (abstractC23968e instanceof AbstractC23968e.b) && (!((AbstractC23968e.b) abstractC23968e).m125437h().isEmpty())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C23966c(JSONObject jSONObject, HashMap hashMap) {
        this();
        AbstractC19074t.m100208f(hashMap, "mapReportReason");
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("name");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f115998a = optString;
        JSONArray optJSONArray = jSONObject.optJSONArray("reasons");
        if (optJSONArray != null) {
            String str = this.f115998a;
            AbstractC23968e.b bVar = new AbstractC23968e.b(-1, str, str, "");
            m125421f(bVar, optJSONArray, hashMap);
            this.f116000c = bVar;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("follow_action");
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i11);
                if (optJSONObject != null) {
                    AbstractC19074t.m100205c(optJSONObject);
                    String optString2 = optJSONObject.optString("action");
                    List list = this.f116001d;
                    AbstractC19074t.m100205c(optString2);
                    list.add(optString2);
                }
            }
        }
    }
}
