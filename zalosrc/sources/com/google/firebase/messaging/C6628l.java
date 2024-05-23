package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.window.layout.ExecutorC2100e0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p229i5.AbstractC20295p;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22874c;

/* renamed from: com.google.firebase.messaging.l */
/* loaded from: classes3.dex */
public class C6628l {

    /* renamed from: c */
    private static final Object f36671c = new Object();

    /* renamed from: d */
    private static ServiceConnectionC6619g1 f36672d;

    /* renamed from: a */
    private final Context f36673a;

    /* renamed from: b */
    private final Executor f36674b = new ExecutorC2100e0();

    public C6628l(Context context) {
        this.f36673a = context;
    }

    /* renamed from: d */
    private static AbstractC22888j m33899d(Context context, Intent intent) {
        if (C6639q0.m33932b().m33936e(context)) {
            AbstractC6604b1.m33783f(context, m33900e(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            m33900e(context, "com.google.firebase.MESSAGING_EVENT").m33885c(intent);
        }
        return AbstractC22894m.m117604f(-1);
    }

    /* renamed from: e */
    private static ServiceConnectionC6619g1 m33900e(Context context, String str) {
        ServiceConnectionC6619g1 serviceConnectionC6619g1;
        synchronized (f36671c) {
            try {
                if (f36672d == null) {
                    f36672d = new ServiceConnectionC6619g1(context, str);
                }
                serviceConnectionC6619g1 = f36672d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return serviceConnectionC6619g1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ Integer m33901f(Context context, Intent intent) {
        return Integer.valueOf(C6639q0.m33932b().m33937g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Integer m33902g(AbstractC22888j abstractC22888j) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ AbstractC22888j m33903h(Context context, Intent intent, AbstractC22888j abstractC22888j) {
        if (AbstractC20295p.m105955i() && ((Integer) abstractC22888j.mo117584m()).intValue() == 402) {
            return m33899d(context, intent).mo117579h(new ExecutorC2100e0(), new InterfaceC22874c() { // from class: com.google.firebase.messaging.k
                @Override // p342m6.InterfaceC22874c
                /* renamed from: a */
                public final Object mo27439a(AbstractC22888j abstractC22888j2) {
                    Integer m33902g;
                    m33902g = C6628l.m33902g(abstractC22888j2);
                    return m33902g;
                }
            });
        }
        return abstractC22888j;
    }

    /* renamed from: i */
    public AbstractC22888j m33904i(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m33905j(this.f36673a, intent);
    }

    /* renamed from: j */
    public AbstractC22888j m33905j(final Context context, final Intent intent) {
        boolean z11;
        boolean z12 = false;
        if (AbstractC20295p.m105955i() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z12 = true;
        }
        if (z11 && !z12) {
            return m33899d(context, intent);
        }
        return AbstractC22894m.m117601c(this.f36674b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m33901f;
                m33901f = C6628l.m33901f(context, intent);
                return m33901f;
            }
        }).mo117581j(this.f36674b, new InterfaceC22874c() { // from class: com.google.firebase.messaging.j
            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j) {
                AbstractC22888j m33903h;
                m33903h = C6628l.m33903h(context, intent, abstractC22888j);
                return m33903h;
            }
        });
    }
}
