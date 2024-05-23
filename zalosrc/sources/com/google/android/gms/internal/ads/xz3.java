package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class xz3 extends b04 {

    /* renamed from: a */
    final Logger f30706a;

    public xz3(String str) {
        this.f30706a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.b04
    /* renamed from: a */
    public final void mo20368a(String str) {
        this.f30706a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
