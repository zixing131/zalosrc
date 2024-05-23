package com.google.android.gms.internal.ads;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class dn1 {

    /* renamed from: a */
    private final Executor f19367a;

    /* renamed from: b */
    private final ym1 f19368b;

    public dn1(Executor executor, ym1 ym1Var) {
        this.f19367a = executor;
        this.f19368b = ym1Var;
    }

    /* renamed from: a */
    public final tc3 m21506a(JSONObject jSONObject, String str) {
        tc3 m23877i;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return kc3.m23877i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
            if (optJSONObject == null) {
                m23877i = kc3.m23877i(null);
            } else {
                String optString = optJSONObject.optString("name");
                if (optString == null) {
                    m23877i = kc3.m23877i(null);
                } else {
                    String optString2 = optJSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    if ("string".equals(optString2)) {
                        m23877i = kc3.m23877i(new cn1(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        m23877i = kc3.m23881m(this.f19368b.m28263e(optJSONObject, "image_value"), new y43() { // from class: com.google.android.gms.internal.ads.an1

                            /* renamed from: a */
                            public final /* synthetic */ String f17194a;

                            public /* synthetic */ an1(String optString3) {
                                r1 = optString3;
                            }

                            @Override // com.google.android.gms.internal.ads.y43
                            public final Object apply(Object obj) {
                                return new cn1(r1, (BinderC5150wz) obj);
                            }
                        }, this.f19367a);
                    } else {
                        m23877i = kc3.m23877i(null);
                    }
                }
            }
            arrayList.add(m23877i);
        }
        return kc3.m23881m(kc3.m23873e(arrayList), bn1.f17909a, this.f19367a);
    }
}
