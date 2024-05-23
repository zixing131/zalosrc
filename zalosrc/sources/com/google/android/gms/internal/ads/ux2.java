package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ux2 {

    /* renamed from: a */
    private final by2 f29072a;

    /* renamed from: b */
    private final by2 f29073b;

    /* renamed from: c */
    private final yx2 f29074c;

    /* renamed from: d */
    private final ay2 f29075d;

    private ux2(yx2 yx2Var, ay2 ay2Var, by2 by2Var, by2 by2Var2, boolean z11) {
        this.f29074c = yx2Var;
        this.f29075d = ay2Var;
        this.f29072a = by2Var;
        if (by2Var2 == null) {
            this.f29073b = by2.NONE;
        } else {
            this.f29073b = by2Var2;
        }
    }

    /* renamed from: a */
    public static ux2 m27086a(yx2 yx2Var, ay2 ay2Var, by2 by2Var, by2 by2Var2, boolean z11) {
        az2.m20353b(ay2Var, "ImpressionType is null");
        az2.m20353b(by2Var, "Impression owner is null");
        if (by2Var != by2.NONE) {
            if (yx2Var == yx2.DEFINED_BY_JAVASCRIPT && by2Var == by2.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (ay2Var == ay2.DEFINED_BY_JAVASCRIPT && by2Var == by2.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new ux2(yx2Var, ay2Var, by2Var, by2Var2, true);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    /* renamed from: b */
    public final JSONObject m27087b() {
        JSONObject jSONObject = new JSONObject();
        yy2.m28395h(jSONObject, "impressionOwner", this.f29072a);
        yy2.m28395h(jSONObject, "mediaEventsOwner", this.f29073b);
        yy2.m28395h(jSONObject, "creativeType", this.f29074c);
        yy2.m28395h(jSONObject, "impressionType", this.f29075d);
        yy2.m28395h(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
