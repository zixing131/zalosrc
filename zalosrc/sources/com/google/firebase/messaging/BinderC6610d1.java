package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import androidx.window.layout.ExecutorC2100e0;
import com.google.firebase.messaging.ServiceConnectionC6619g1;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22878e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.d1 */
/* loaded from: classes3.dex */
public class BinderC6610d1 extends Binder {

    /* renamed from: p */
    private final a f36637p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.d1$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        AbstractC22888j mo33700a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC6610d1(a aVar) {
        this.f36637p = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m33813c(final ServiceConnectionC6619g1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            this.f36637p.mo33700a(aVar.f36658a).mo117573b(new ExecutorC2100e0(), new InterfaceC22878e() { // from class: com.google.firebase.messaging.c1
                @Override // p342m6.InterfaceC22878e
                /* renamed from: a */
                public final void mo16804a(AbstractC22888j abstractC22888j) {
                    ServiceConnectionC6619g1.a.this.m33891d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
