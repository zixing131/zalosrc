package com.zing.zalo.zinstant;

import android.util.LruCache;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import j40.C20915b;
import java.lang.ref.WeakReference;
import sh0.C26253e;

/* renamed from: com.zing.zalo.zinstant.j1 */
/* loaded from: classes7.dex */
public class C17161j1 implements C20915b.d {

    /* renamed from: a */
    private final LruCache f87705a;

    public C17161j1(int i11) {
        this.f87705a = new LruCache(i11);
    }

    @Override // j40.C20915b.d
    /* renamed from: a */
    public C26253e mo91751a(String str) {
        AbstractC19074t.m100208f(str, "id");
        WeakReference weakReference = (WeakReference) this.f87705a.get(str);
        if (weakReference != null) {
            return (C26253e) weakReference.get();
        }
        return null;
    }

    @Override // j40.C20915b.d
    /* renamed from: b */
    public void mo91752b(String str, C26253e c26253e) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(c26253e, "decoder");
        this.f87705a.put(str, new WeakReference(c26253e));
    }

    public /* synthetic */ C17161j1(int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 100 : i11);
    }
}
