package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class e40 implements c40 {

    /* renamed from: a */
    private final f40 f19509a;

    public e40(f40 f40Var, byte[] bArr) {
        this.f19509a = f40Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        zq0 zq0Var = (zq0) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f11 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f11 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e11) {
            yk0.zzh("Fail to parse float", e11);
        }
        this.f19509a.m21943c(equals);
        this.f19509a.m21942b(equals2, f11);
        zq0Var.mo26672E(equals);
    }
}
