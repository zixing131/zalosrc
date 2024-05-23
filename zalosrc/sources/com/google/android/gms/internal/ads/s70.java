package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s70 implements c40 {

    /* renamed from: a */
    final /* synthetic */ g80 f27579a;

    /* renamed from: b */
    final /* synthetic */ b70 f27580b;

    /* renamed from: c */
    final /* synthetic */ h80 f27581c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s70(h80 h80Var, g80 g80Var, b70 b70Var) {
        this.f27581c = h80Var;
        this.f27579a = g80Var;
        this.f27580b = b70Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        Object obj2;
        obj2 = this.f27581c.f21572a;
        synchronized (obj2) {
            try {
                if (this.f27579a.m27650a() != -1 && this.f27579a.m27650a() != 1) {
                    this.f27581c.f21580i = 0;
                    b70 b70Var = this.f27580b;
                    b70Var.mo23138l0("/log", b40.f17558g);
                    b70Var.mo23138l0("/result", b40.f17566o);
                    this.f27579a.m27652d(this.f27580b);
                    this.f27581c.f21579h = this.f27579a;
                    zze.zza("Successfully loaded JS Engine.");
                }
            } finally {
            }
        }
    }
}
