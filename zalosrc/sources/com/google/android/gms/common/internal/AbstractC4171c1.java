package com.google.android.gms.common.internal;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.c1 */
/* loaded from: classes2.dex */
public abstract class AbstractC4171c1 {

    /* renamed from: a */
    private Object f16572a;

    /* renamed from: b */
    private boolean f16573b = false;

    /* renamed from: c */
    final /* synthetic */ AbstractC4172d f16574c;

    public AbstractC4171c1(AbstractC4172d abstractC4172d, Object obj) {
        this.f16574c = abstractC4172d;
        this.f16572a = obj;
    }

    /* renamed from: a */
    protected abstract void mo19637a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo19638b();

    /* renamed from: c */
    public final void m19639c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f16572a;
                if (this.f16573b) {
                    String obj2 = toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Callback proxy ");
                    sb2.append(obj2);
                    sb2.append(" being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            mo19637a(obj);
        }
        synchronized (this) {
            this.f16573b = true;
        }
        m19641e();
    }

    /* renamed from: d */
    public final void m19640d() {
        synchronized (this) {
            this.f16572a = null;
        }
    }

    /* renamed from: e */
    public final void m19641e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m19640d();
        arrayList = this.f16574c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f16574c.zzt;
            arrayList2.remove(this);
        }
    }
}
