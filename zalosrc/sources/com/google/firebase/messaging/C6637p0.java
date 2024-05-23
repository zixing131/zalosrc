package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22874c;
import p665y0.C30239a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.p0 */
/* loaded from: classes.dex */
public class C6637p0 {

    /* renamed from: a */
    private final Executor f36681a;

    /* renamed from: b */
    private final Map f36682b = new C30239a();

    /* renamed from: com.google.firebase.messaging.p0$a */
    /* loaded from: classes3.dex */
    interface a {
        AbstractC22888j start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6637p0(Executor executor) {
        this.f36681a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC22888j m33929c(String str, AbstractC22888j abstractC22888j) {
        synchronized (this) {
            this.f36682b.remove(str);
        }
        return abstractC22888j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized AbstractC22888j m33930b(final String str, a aVar) {
        AbstractC22888j abstractC22888j = (AbstractC22888j) this.f36682b.get(str);
        if (abstractC22888j != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Joining ongoing request for: ");
                sb2.append(str);
            }
            return abstractC22888j;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Making new request for: ");
            sb3.append(str);
        }
        AbstractC22888j mo117581j = aVar.start().mo117581j(this.f36681a, new InterfaceC22874c() { // from class: com.google.firebase.messaging.o0
            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j2) {
                AbstractC22888j m33929c;
                m33929c = C6637p0.this.m33929c(str, abstractC22888j2);
                return m33929c;
            }
        });
        this.f36682b.put(str, mo117581j);
        return mo117581j;
    }
}
