package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class h43 extends b43 {

    /* renamed from: q */
    final /* synthetic */ IBinder f21537q;

    /* renamed from: r */
    final /* synthetic */ k43 f21538r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h43(k43 k43Var, IBinder iBinder) {
        this.f21538r = k43Var;
        this.f21537q = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.b43
    /* renamed from: a */
    public final void mo20397a() {
        List list;
        List list2;
        this.f21538r.f23144p.f23743m = w33.m27524N(this.f21537q);
        l43.m24124n(this.f21538r.f23144p);
        this.f21538r.f23144p.f23737g = false;
        list = this.f21538r.f23144p.f23734d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f21538r.f23144p.f23734d;
        list2.clear();
    }
}
