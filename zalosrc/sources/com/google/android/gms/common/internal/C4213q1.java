package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.internal.q1 */
/* loaded from: classes2.dex */
public final class C4213q1 implements Handler.Callback {

    /* renamed from: p */
    final /* synthetic */ C4216r1 f16649p;

    public /* synthetic */ C4213q1(C4216r1 c4216r1, AbstractC4210p1 abstractC4210p1) {
        this.f16649p = c4216r1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i11 = message.what;
        if (i11 == 0) {
            hashMap = this.f16649p.f16653f;
            synchronized (hashMap) {
                try {
                    C4201m1 c4201m1 = (C4201m1) message.obj;
                    hashMap2 = this.f16649p.f16653f;
                    ServiceConnectionC4207o1 serviceConnectionC4207o1 = (ServiceConnectionC4207o1) hashMap2.get(c4201m1);
                    if (serviceConnectionC4207o1 != null && serviceConnectionC4207o1.m19737i()) {
                        if (serviceConnectionC4207o1.m19738j()) {
                            serviceConnectionC4207o1.m19735g("GmsClientSupervisor");
                        }
                        hashMap3 = this.f16649p.f16653f;
                        hashMap3.remove(c4201m1);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i11 == 1) {
            hashMap4 = this.f16649p.f16653f;
            synchronized (hashMap4) {
                try {
                    C4201m1 c4201m12 = (C4201m1) message.obj;
                    hashMap5 = this.f16649p.f16653f;
                    ServiceConnectionC4207o1 serviceConnectionC4207o12 = (ServiceConnectionC4207o1) hashMap5.get(c4201m12);
                    if (serviceConnectionC4207o12 != null && serviceConnectionC4207o12.m19729a() == 3) {
                        String valueOf = String.valueOf(c4201m12);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Timeout waiting for ServiceConnection callback ");
                        sb2.append(valueOf);
                        new Exception();
                        ComponentName m19730b = serviceConnectionC4207o12.m19730b();
                        if (m19730b == null) {
                            m19730b = c4201m12.m19706b();
                        }
                        if (m19730b == null) {
                            String m19708d = c4201m12.m19708d();
                            AbstractC4205o.m19722k(m19708d);
                            m19730b = new ComponentName(m19708d, "unknown");
                        }
                        serviceConnectionC4207o12.onServiceDisconnected(m19730b);
                    }
                } finally {
                }
            }
            return true;
        }
        return false;
    }
}
