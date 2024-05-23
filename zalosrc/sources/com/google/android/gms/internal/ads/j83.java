package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class j83 extends d63 {

    /* renamed from: r */
    final /* synthetic */ Iterator f22730r;

    /* renamed from: s */
    final /* synthetic */ k53 f22731s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j83(Iterator it, k53 k53Var) {
        this.f22730r = it;
        this.f22731s = k53Var;
    }

    @Override // com.google.android.gms.internal.ads.d63
    /* renamed from: a */
    protected final Object mo21273a() {
        while (this.f22730r.hasNext()) {
            Object next = this.f22730r.next();
            if (this.f22731s.zza(next)) {
                return next;
            }
        }
        m21274c();
        return null;
    }
}
