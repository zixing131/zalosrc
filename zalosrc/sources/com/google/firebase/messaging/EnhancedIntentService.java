package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.window.layout.ExecutorC2100e0;
import com.google.firebase.messaging.BinderC6610d1;
import java.util.concurrent.ExecutorService;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;
import p342m6.InterfaceC22878e;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes3.dex */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: q */
    private Binder f36563q;

    /* renamed from: s */
    private int f36565s;

    /* renamed from: p */
    final ExecutorService f36562p = AbstractC6630m.m33915d();

    /* renamed from: r */
    private final Object f36564r = new Object();

    /* renamed from: t */
    private int f36566t = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$a */
    /* loaded from: classes3.dex */
    class C6597a implements BinderC6610d1.a {
        C6597a() {
        }

        @Override // com.google.firebase.messaging.BinderC6610d1.a
        /* renamed from: a */
        public AbstractC22888j mo33700a(Intent intent) {
            return EnhancedIntentService.this.m33695j(intent);
        }
    }

    /* renamed from: d */
    private void m33692d(Intent intent) {
        if (intent != null) {
            AbstractC6604b1.m33780c(intent);
        }
        synchronized (this.f36564r) {
            try {
                int i11 = this.f36566t - 1;
                this.f36566t = i11;
                if (i11 == 0) {
                    m33699k(this.f36565s);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m33693h(Intent intent, AbstractC22888j abstractC22888j) {
        m33692d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m33694i(Intent intent, C22890k c22890k) {
        try {
            mo33697f(intent);
        } finally {
            c22890k.m117596c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public AbstractC22888j m33695j(final Intent intent) {
        if (m33698g(intent)) {
            return AbstractC22894m.m117604f(null);
        }
        final C22890k c22890k = new C22890k();
        this.f36562p.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.this.m33694i(intent, c22890k);
            }
        });
        return c22890k.m117594a();
    }

    /* renamed from: e */
    protected Intent mo33696e(Intent intent) {
        return intent;
    }

    /* renamed from: f */
    public abstract void mo33697f(Intent intent);

    /* renamed from: g */
    public boolean m33698g(Intent intent) {
        return false;
    }

    /* renamed from: k */
    boolean m33699k(int i11) {
        return stopSelfResult(i11);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.f36563q == null) {
                this.f36563q = new BinderC6610d1(new C6597a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f36563q;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f36562p.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i11, int i12) {
        synchronized (this.f36564r) {
            this.f36565s = i12;
            this.f36566t++;
        }
        Intent mo33696e = mo33696e(intent);
        if (mo33696e == null) {
            m33692d(intent);
            return 2;
        }
        AbstractC22888j m33695j = m33695j(mo33696e);
        if (m33695j.mo117587p()) {
            m33692d(intent);
            return 2;
        }
        m33695j.mo117573b(new ExecutorC2100e0(), new InterfaceC22878e() { // from class: com.google.firebase.messaging.g
            @Override // p342m6.InterfaceC22878e
            /* renamed from: a */
            public final void mo16804a(AbstractC22888j abstractC22888j) {
                EnhancedIntentService.this.m33693h(intent, abstractC22888j);
            }
        });
        return 3;
    }
}
