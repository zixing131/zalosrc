package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ez2 {

    /* renamed from: a */
    private JSONObject f19871a;

    /* renamed from: b */
    private final lz2 f19872b;

    public ez2(lz2 lz2Var) {
        this.f19872b = lz2Var;
    }

    /* renamed from: a */
    public final JSONObject m21833a() {
        return this.f19871a;
    }

    /* renamed from: b */
    public final void m21834b() {
        this.f19872b.m24424b(new mz2(this, null));
    }

    /* renamed from: c */
    public final void m21835c(JSONObject jSONObject, HashSet hashSet, long j11) {
        this.f19872b.m24424b(new nz2(this, hashSet, jSONObject, j11, null));
    }

    /* renamed from: d */
    public final void m21836d(JSONObject jSONObject, HashSet hashSet, long j11) {
        this.f19872b.m24424b(new oz2(this, hashSet, jSONObject, j11, null));
    }

    /* renamed from: e */
    public final void m21837e(JSONObject jSONObject) {
        this.f19871a = jSONObject;
    }
}
