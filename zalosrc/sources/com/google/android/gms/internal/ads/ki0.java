package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import p229i5.InterfaceC20285f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ki0 extends ej0 {

    /* renamed from: b */
    private final InterfaceC20285f f23324b;

    /* renamed from: c */
    private final ki0 f23325c = this;

    /* renamed from: d */
    private final w04 f23326d;

    /* renamed from: e */
    private final w04 f23327e;

    /* renamed from: f */
    private final w04 f23328f;

    /* renamed from: g */
    private final w04 f23329g;

    /* renamed from: h */
    private final w04 f23330h;

    /* renamed from: i */
    private final w04 f23331i;

    /* renamed from: j */
    private final w04 f23332j;

    /* renamed from: k */
    private final w04 f23333k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ki0(Context context, InterfaceC20285f interfaceC20285f, zzg zzgVar, dj0 dj0Var, ji0 ji0Var) {
        this.f23324b = interfaceC20285f;
        j04 m23792a = k04.m23792a(context);
        this.f23326d = m23792a;
        j04 m23792a2 = k04.m23792a(zzgVar);
        this.f23327e = m23792a2;
        j04 m23792a3 = k04.m23792a(dj0Var);
        this.f23328f = m23792a3;
        this.f23329g = i04.m23104b(new bi0(m23792a, m23792a2, m23792a3));
        j04 m23792a4 = k04.m23792a(interfaceC20285f);
        this.f23330h = m23792a4;
        w04 m23104b = i04.m23104b(new di0(m23792a4, m23792a2, m23792a3));
        this.f23331i = m23104b;
        fi0 fi0Var = new fi0(m23792a4, m23104b);
        this.f23332j = fi0Var;
        this.f23333k = i04.m23104b(new kj0(m23792a, fi0Var));
    }

    @Override // com.google.android.gms.internal.ads.ej0
    /* renamed from: a */
    final ai0 mo21728a() {
        return (ai0) this.f23329g.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ej0
    /* renamed from: b */
    public final ei0 mo21729b() {
        return new ei0(this.f23324b, (ci0) this.f23331i.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ej0
    /* renamed from: c */
    final ij0 mo21730c() {
        return (ij0) this.f23333k.zzb();
    }
}
