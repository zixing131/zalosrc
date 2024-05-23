package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import p229i5.AbstractC20295p;

/* loaded from: classes2.dex */
public final class w52 implements q52 {

    /* renamed from: a */
    private final hi1 f29804a;

    /* renamed from: b */
    private final uc3 f29805b;

    /* renamed from: c */
    private final lm1 f29806c;

    /* renamed from: d */
    private final zr2 f29807d;

    /* renamed from: e */
    private final dp1 f29808e;

    public w52(hi1 hi1Var, uc3 uc3Var, lm1 lm1Var, zr2 zr2Var, dp1 dp1Var) {
        this.f29804a = hi1Var;
        this.f29805b = uc3Var;
        this.f29806c = lm1Var;
        this.f29807d = zr2Var;
        this.f29808e = dp1Var;
    }

    /* renamed from: g */
    private final tc3 m27532g(final tq2 tq2Var, final iq2 iq2Var, final JSONObject jSONObject) {
        final tc3 m28591a = this.f29807d.m28591a();
        final tc3 m24331a = this.f29806c.m24331a(tq2Var, iq2Var, jSONObject);
        return kc3.m23872d(m28591a, m24331a).m23601a(new Callable() { // from class: com.google.android.gms.internal.ads.r52
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return w52.this.m27533c(m24331a, m28591a, tq2Var, iq2Var, jSONObject);
            }
        }, this.f29805b);
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: a */
    public final boolean mo20789a(tq2 tq2Var, iq2 iq2Var) {
        mq2 mq2Var = iq2Var.f22348t;
        if (mq2Var != null && mq2Var.f24723c != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: b */
    public final tc3 mo20790b(final tq2 tq2Var, final iq2 iq2Var) {
        return kc3.m23882n(kc3.m23882n(this.f29807d.m28591a(), new qb3() { // from class: com.google.android.gms.internal.ads.t52
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return w52.this.m27535e(iq2Var, (xo1) obj);
            }
        }, this.f29805b), new qb3() { // from class: com.google.android.gms.internal.ads.u52
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return w52.this.m27536f(tq2Var, iq2Var, (JSONArray) obj);
            }
        }, this.f29805b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ qj1 m27533c(tc3 tc3Var, tc3 tc3Var2, tq2 tq2Var, iq2 iq2Var, JSONObject jSONObject) {
        vj1 vj1Var = (vj1) tc3Var.get();
        xo1 xo1Var = (xo1) tc3Var2.get();
        wj1 mo21062c = this.f29804a.mo21062c(new k41(tq2Var, iq2Var, null), new ik1(vj1Var), new wi1(jSONObject, xo1Var));
        mo21062c.mo24746j().m22991b();
        mo21062c.mo24747k().m26637a(xo1Var);
        mo21062c.mo24745i().m25817a(vj1Var.m27257Z());
        mo21062c.mo24748l().m20982a(this.f29808e);
        return mo21062c.mo24744h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ tc3 m27534d(xo1 xo1Var, JSONObject jSONObject) {
        this.f29807d.m28592b(kc3.m23877i(xo1Var));
        if (jSONObject.optBoolean("success")) {
            return kc3.m23877i(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbtz("process json failed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ tc3 m27535e(iq2 iq2Var, final xo1 xo1Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21344p7)).booleanValue() && AbstractC20295p.m105958l()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", iq2Var.f22348t.f24723c);
        jSONObject2.put("sdk_params", jSONObject);
        return kc3.m23882n(xo1Var.m27953d("google.afma.nativeAds.preProcessJson", jSONObject2), new qb3() { // from class: com.google.android.gms.internal.ads.s52
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return w52.this.m27534d(xo1Var, (JSONObject) obj);
            }
        }, this.f29805b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ tc3 m27536f(tq2 tq2Var, iq2 iq2Var, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return kc3.m23876h(new zzebh(3));
        }
        if (tq2Var.f28472a.f26941a.f19405k > 1) {
            int length = jSONArray.length();
            this.f29807d.m28593c(Math.min(length, tq2Var.f28472a.f26941a.f19405k));
            ArrayList arrayList = new ArrayList(tq2Var.f28472a.f26941a.f19405k);
            for (int i11 = 0; i11 < tq2Var.f28472a.f26941a.f19405k; i11++) {
                if (i11 < length) {
                    arrayList.add(m27532g(tq2Var, iq2Var, jSONArray.getJSONObject(i11)));
                } else {
                    arrayList.add(kc3.m23876h(new zzebh(3)));
                }
            }
            return kc3.m23877i(arrayList);
        }
        return kc3.m23881m(m27532g(tq2Var, iq2Var, jSONArray.getJSONObject(0)), new y43() { // from class: com.google.android.gms.internal.ads.v52
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                return Collections.singletonList(kc3.m23877i((qj1) obj));
            }
        }, this.f29805b);
    }
}
