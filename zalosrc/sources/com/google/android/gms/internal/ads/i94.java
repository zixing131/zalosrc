package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* loaded from: classes2.dex */
public final class i94 {

    /* renamed from: b */
    public static final i94 f22123b;

    /* renamed from: a */
    private final h94 f22124a;

    static {
        i94 i94Var;
        if (g92.f20474a < 31) {
            i94Var = new i94();
        } else {
            i94Var = new i94(h94.f21591b);
        }
        f22123b = i94Var;
    }

    private i94(h94 h94Var) {
        this.f22124a = h94Var;
    }

    /* renamed from: a */
    public final LogSessionId m23146a() {
        h94 h94Var = this.f22124a;
        h94Var.getClass();
        return h94Var.f21592a;
    }

    public i94() {
        this.f22124a = null;
        v71.m27175f(g92.f20474a < 31);
    }

    public i94(LogSessionId logSessionId) {
        this.f22124a = new h94(logSessionId);
    }
}
