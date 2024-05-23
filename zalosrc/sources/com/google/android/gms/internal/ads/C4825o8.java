package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.internal.ads.o8 */
/* loaded from: classes2.dex */
public final class C4825o8 {

    /* renamed from: a */
    private final AtomicInteger f25482a;

    /* renamed from: b */
    private final Set f25483b;

    /* renamed from: c */
    private final PriorityBlockingQueue f25484c;

    /* renamed from: d */
    private final PriorityBlockingQueue f25485d;

    /* renamed from: e */
    private final InterfaceC5233z7 f25486e;

    /* renamed from: f */
    private final InterfaceC4566h8 f25487f;

    /* renamed from: g */
    private final C4603i8[] f25488g;

    /* renamed from: h */
    private C4345b8 f25489h;

    /* renamed from: i */
    private final List f25490i;

    /* renamed from: j */
    private final List f25491j;

    /* renamed from: k */
    private final C4492f8 f25492k;

    public C4825o8(InterfaceC5233z7 interfaceC5233z7, InterfaceC4566h8 interfaceC4566h8, int i11) {
        C4492f8 c4492f8 = new C4492f8(new Handler(Looper.getMainLooper()));
        this.f25482a = new AtomicInteger();
        this.f25483b = new HashSet();
        this.f25484c = new PriorityBlockingQueue();
        this.f25485d = new PriorityBlockingQueue();
        this.f25490i = new ArrayList();
        this.f25491j = new ArrayList();
        this.f25486e = interfaceC5233z7;
        this.f25487f = interfaceC4566h8;
        this.f25488g = new C4603i8[4];
        this.f25492k = c4492f8;
    }

    /* renamed from: a */
    public final AbstractC4788n8 m25097a(AbstractC4788n8 abstractC4788n8) {
        abstractC4788n8.zzf(this);
        synchronized (this.f25483b) {
            this.f25483b.add(abstractC4788n8);
        }
        abstractC4788n8.zzg(this.f25482a.incrementAndGet());
        abstractC4788n8.zzm("add-to-queue");
        m25099c(abstractC4788n8, 0);
        this.f25484c.add(abstractC4788n8);
        return abstractC4788n8;
    }

    /* renamed from: b */
    public final void m25098b(AbstractC4788n8 abstractC4788n8) {
        synchronized (this.f25483b) {
            this.f25483b.remove(abstractC4788n8);
        }
        synchronized (this.f25490i) {
            Iterator it = this.f25490i.iterator();
            if (it.hasNext()) {
                AbstractC30228a.m149044a(it.next());
                throw null;
            }
        }
        m25099c(abstractC4788n8, 5);
    }

    /* renamed from: c */
    public final void m25099c(AbstractC4788n8 abstractC4788n8, int i11) {
        synchronized (this.f25491j) {
            try {
                Iterator it = this.f25491j.iterator();
                if (it.hasNext()) {
                    AbstractC30228a.m149044a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m25100d() {
        C4345b8 c4345b8 = this.f25489h;
        if (c4345b8 != null) {
            c4345b8.m20431b();
        }
        C4603i8[] c4603i8Arr = this.f25488g;
        for (int i11 = 0; i11 < 4; i11++) {
            C4603i8 c4603i8 = c4603i8Arr[i11];
            if (c4603i8 != null) {
                c4603i8.m23136a();
            }
        }
        C4345b8 c4345b82 = new C4345b8(this.f25484c, this.f25485d, this.f25486e, this.f25492k, null);
        this.f25489h = c4345b82;
        c4345b82.start();
        for (int i12 = 0; i12 < 4; i12++) {
            C4603i8 c4603i82 = new C4603i8(this.f25485d, this.f25487f, this.f25486e, this.f25492k, null);
            this.f25488g[i12] = c4603i82;
            c4603i82.start();
        }
    }
}
