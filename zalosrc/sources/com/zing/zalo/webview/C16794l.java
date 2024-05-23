package com.zing.zalo.webview;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import org.json.JSONObject;
import p140ev.C18613b;

/* renamed from: com.zing.zalo.webview.l */
/* loaded from: classes5.dex */
public class C16794l {

    /* renamed from: a */
    public final C18613b f85224a;

    /* renamed from: b */
    public final int f85225b;

    /* renamed from: c */
    public final boolean f85226c;

    /* renamed from: d */
    public final JSONObject f85227d;

    public C16794l(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f85224a = new C18613b(jSONObject.getInt("featureId"));
        this.f85225b = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f85226c = jSONObject.getInt("status") == 1;
        this.f85227d = jSONObject.getJSONObject("data");
    }
}
