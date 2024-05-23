package com.zing.zalo.media.download;

import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.media.download.AbstractC9003a;
import com.zing.zalo.media.download.AbstractC9010h;
import com.zing.zalo.media.download.C9006d;
import fg0.ThreadFactoryC18928a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zing.zalo.media.download.d */
/* loaded from: classes4.dex */
public class C9006d extends AbstractC9003a {

    /* renamed from: b */
    final Handler f48183b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    List f48184c;

    /* renamed from: d */
    ExecutorService f48185d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.media.download.d$a */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final AbstractC9007e f48186p;

        /* renamed from: q */
        final AbstractC9010h.b f48187q;

        /* renamed from: r */
        final AbstractC9003a.a f48188r;

        a(AbstractC9007e abstractC9007e, AbstractC9010h.b bVar, AbstractC9003a.a aVar) {
            this.f48186p = abstractC9007e;
            this.f48187q = bVar;
            this.f48188r = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m48126c(boolean z11) {
            if (z11) {
                this.f48188r.mo48123a(601);
            } else {
                this.f48188r.mo48123a(502);
            }
        }

        /* renamed from: b */
        void m48127b() {
            try {
                this.f48186p.m48136i();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            final boolean z11;
            final AbstractC9003a.a aVar;
            try {
                try {
                    this.f48186p.m48128a();
                    if (!this.f48186p.m48137j() && (aVar = this.f48188r) != null) {
                        Handler handler = C9006d.this.f48183b;
                        Objects.requireNonNull(aVar);
                        handler.post(new Runnable() { // from class: com.zing.zalo.media.download.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC9003a.a.this.mo48124c();
                            }
                        });
                    }
                    synchronized (this) {
                        try {
                            List list = C9006d.this.f48184c;
                            if (list != null) {
                                list.remove(this);
                            }
                        } finally {
                        }
                    }
                } catch (Exception e11) {
                    if (!AbstractC23227u1.m119701a(e11) && (!(e11 instanceof IOException) || AbstractC23238v2.m119726k())) {
                        z11 = false;
                        if (!this.f48186p.m48137j() && this.f48188r != null) {
                            C9006d.this.f48183b.post(new Runnable() { // from class: com.zing.zalo.media.download.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9006d.a.this.m48126c(z11);
                                }
                            });
                        }
                        synchronized (this) {
                            try {
                                List list2 = C9006d.this.f48184c;
                                if (list2 != null) {
                                    list2.remove(this);
                                }
                                return;
                            } finally {
                            }
                        }
                    }
                    z11 = true;
                    if (!this.f48186p.m48137j()) {
                        C9006d.this.f48183b.post(new Runnable() { // from class: com.zing.zalo.media.download.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                C9006d.a.this.m48126c(z11);
                            }
                        });
                    }
                    synchronized (this) {
                    }
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    try {
                        List list3 = C9006d.this.f48184c;
                        if (list3 != null) {
                            list3.remove(this);
                        }
                        throw th2;
                    } finally {
                    }
                }
            }
        }
    }

    @Override // com.zing.zalo.media.download.AbstractC9003a
    /* renamed from: a */
    public synchronized void mo48120a(AbstractC9007e abstractC9007e) {
        if (this.f48185d != null) {
            try {
                abstractC9007e.m48136i();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.media.download.AbstractC9003a
    /* renamed from: b */
    public synchronized List mo48121b(AbstractC9010h.b bVar) {
        try {
            if (this.f48185d != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (a aVar : this.f48184c) {
                        if (aVar.f48187q == bVar) {
                            aVar.m48127b();
                            arrayList2.add(aVar.f48186p);
                            arrayList.add(aVar);
                        }
                    }
                    this.f48184c.removeAll(arrayList);
                    return arrayList2;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.zing.zalo.media.download.AbstractC9003a
    /* renamed from: d */
    public synchronized void mo48122d(AbstractC9007e abstractC9007e, AbstractC9010h.b bVar, AbstractC9003a.a aVar) {
        try {
            if (this.f48185d == null) {
                this.f48185d = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("DownloadManager"));
                this.f48184c = new ArrayList();
            }
            a aVar2 = new a(abstractC9007e, bVar, aVar);
            this.f48184c.add(aVar2);
            this.f48185d.execute(aVar2);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
