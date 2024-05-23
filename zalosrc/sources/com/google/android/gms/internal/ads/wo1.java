package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
final class wo1 implements c40 {

    /* renamed from: a */
    private final WeakReference f30039a;

    /* renamed from: b */
    private final String f30040b;

    /* renamed from: c */
    private final c40 f30041c;

    /* renamed from: d */
    final /* synthetic */ xo1 f30042d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ wo1(xo1 xo1Var, WeakReference weakReference, String str, c40 c40Var, vo1 vo1Var) {
        this.f30042d = xo1Var;
        this.f30039a = weakReference;
        this.f30040b = str;
        this.f30041c = c40Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        Object obj2 = this.f30039a.get();
        if (obj2 == null) {
            this.f30042d.m27960k(this.f30040b, this);
        } else {
            this.f30041c.mo19973a(obj2, map);
        }
    }
}
