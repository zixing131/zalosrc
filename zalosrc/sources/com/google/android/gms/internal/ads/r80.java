package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class r80 {

    /* renamed from: a */
    private static final Charset f27137a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final o80 f27138b = new q80();

    /* renamed from: c */
    public static final m80 f27139c = new m80() { // from class: com.google.android.gms.internal.ads.p80
        @Override // com.google.android.gms.internal.ads.m80
        /* renamed from: a */
        public final Object mo24491a(JSONObject jSONObject) {
            return r80.m25993a(jSONObject);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ InputStream m25993a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f27137a));
    }
}
