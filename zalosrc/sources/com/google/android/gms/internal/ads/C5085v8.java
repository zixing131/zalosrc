package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.v8 */
/* loaded from: classes2.dex */
public final class C5085v8 implements InterfaceC4750m8 {

    /* renamed from: a */
    private final Map f29222a = new HashMap();

    /* renamed from: b */
    private final C4345b8 f29223b;

    /* renamed from: c */
    private final BlockingQueue f29224c;

    /* renamed from: d */
    private final C4492f8 f29225d;

    public C5085v8(C4345b8 c4345b8, BlockingQueue blockingQueue, C4492f8 c4492f8, byte[] bArr) {
        this.f29225d = c4492f8;
        this.f29223b = c4345b8;
        this.f29224c = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4750m8
    /* renamed from: a */
    public final void mo24490a(AbstractC4788n8 abstractC4788n8, C4937r8 c4937r8) {
        List list;
        C5196y7 c5196y7 = c4937r8.f27134b;
        if (c5196y7 != null && !c5196y7.m28137a(System.currentTimeMillis())) {
            String zzj = abstractC4788n8.zzj();
            synchronized (this) {
                list = (List) this.f29222a.remove(zzj);
            }
            if (list != null) {
                if (AbstractC5048u8.f28785a) {
                    AbstractC5048u8.m26869d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f29225d.m21965b((AbstractC4788n8) it.next(), c4937r8, null);
                }
                return;
            }
            return;
        }
        zza(abstractC4788n8);
    }

    /* renamed from: b */
    public final synchronized boolean m27180b(AbstractC4788n8 abstractC4788n8) {
        try {
            String zzj = abstractC4788n8.zzj();
            if (this.f29222a.containsKey(zzj)) {
                List list = (List) this.f29222a.get(zzj);
                if (list == null) {
                    list = new ArrayList();
                }
                abstractC4788n8.zzm("waiting-for-response");
                list.add(abstractC4788n8);
                this.f29222a.put(zzj, list);
                if (AbstractC5048u8.f28785a) {
                    AbstractC5048u8.m26866a("Request for cacheKey=%s is in flight, putting on hold.", zzj);
                }
                return true;
            }
            this.f29222a.put(zzj, null);
            abstractC4788n8.zzu(this);
            if (AbstractC5048u8.f28785a) {
                AbstractC5048u8.m26866a("new request, sending to network %s", zzj);
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4750m8
    public final synchronized void zza(AbstractC4788n8 abstractC4788n8) {
        try {
            String zzj = abstractC4788n8.zzj();
            List list = (List) this.f29222a.remove(zzj);
            if (list != null && !list.isEmpty()) {
                if (AbstractC5048u8.f28785a) {
                    AbstractC5048u8.m26869d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
                }
                AbstractC4788n8 abstractC4788n82 = (AbstractC4788n8) list.remove(0);
                this.f29222a.put(zzj, list);
                abstractC4788n82.zzu(this);
                try {
                    this.f29224c.put(abstractC4788n82);
                } catch (InterruptedException e11) {
                    AbstractC5048u8.m26867b("Couldn't add request to queue. %s", e11.toString());
                    Thread.currentThread().interrupt();
                    this.f29223b.m20431b();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
