package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class u62 implements j04 {

    /* renamed from: a */
    private final w04 f28766a;

    /* renamed from: b */
    private final w04 f28767b;

    /* renamed from: c */
    private final w04 f28768c;

    /* renamed from: d */
    private final w04 f28769d;

    /* renamed from: e */
    private final w04 f28770e;

    /* renamed from: f */
    private final w04 f28771f;

    /* renamed from: g */
    private final w04 f28772g;

    /* renamed from: h */
    private final w04 f28773h;

    /* renamed from: i */
    private final w04 f28774i;

    /* renamed from: j */
    private final w04 f28775j;

    /* renamed from: k */
    private final w04 f28776k;

    public u62(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7, w04 w04Var8, w04 w04Var9, w04 w04Var10, w04 w04Var11) {
        this.f28766a = w04Var;
        this.f28767b = w04Var2;
        this.f28768c = w04Var3;
        this.f28769d = w04Var4;
        this.f28770e = w04Var5;
        this.f28771f = w04Var6;
        this.f28772g = w04Var7;
        this.f28773h = w04Var8;
        this.f28774i = w04Var9;
        this.f28775j = w04Var10;
        this.f28776k = w04Var11;
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t62 zzb() {
        Context m20710a = ((bt0) this.f28766a).m20710a();
        hv2 hv2Var = (hv2) this.f28767b.zzb();
        p62 p62Var = (p62) this.f28768c.zzb();
        y71 y71Var = (y71) this.f28769d.zzb();
        kx2 kx2Var = (kx2) this.f28770e.zzb();
        ox2 ox2Var = (ox2) this.f28771f.zzb();
        y31 y31Var = (y31) this.f28772g.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new t62(m20710a, hv2Var, p62Var, y71Var, kx2Var, ox2Var, y31Var, uc3Var, (ScheduledExecutorService) this.f28774i.zzb(), (g32) this.f28775j.zzb(), (vw2) this.f28776k.zzb());
    }
}
