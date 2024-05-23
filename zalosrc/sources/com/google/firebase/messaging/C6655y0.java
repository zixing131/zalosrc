package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;
import p665y0.C30239a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.y0 */
/* loaded from: classes.dex */
public class C6655y0 {

    /* renamed from: i */
    private static final long f36732i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f36733a;

    /* renamed from: b */
    private final C6615f0 f36734b;

    /* renamed from: c */
    private final C6600a0 f36735c;

    /* renamed from: d */
    private final FirebaseMessaging f36736d;

    /* renamed from: f */
    private final ScheduledExecutorService f36738f;

    /* renamed from: h */
    private final C6651w0 f36740h;

    /* renamed from: e */
    private final Map f36737e = new C30239a();

    /* renamed from: g */
    private boolean f36739g = false;

    private C6655y0(FirebaseMessaging firebaseMessaging, C6615f0 c6615f0, C6651w0 c6651w0, C6600a0 c6600a0, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f36736d = firebaseMessaging;
        this.f36734b = c6615f0;
        this.f36740h = c6651w0;
        this.f36735c = c6600a0;
        this.f36733a = context;
        this.f36738f = scheduledExecutorService;
    }

    /* renamed from: b */
    private static void m33974b(AbstractC22888j abstractC22888j) {
        try {
            AbstractC22894m.m117600b(abstractC22888j, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e11) {
            e = e11;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e12);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e13) {
            e = e13;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: c */
    private void m33975c(String str) {
        m33974b(this.f36735c.m33771l(this.f36736d.m33727j(), str));
    }

    /* renamed from: d */
    private void m33976d(String str) {
        m33974b(this.f36735c.m33772m(this.f36736d.m33727j(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static AbstractC22888j m33977e(final FirebaseMessaging firebaseMessaging, final C6615f0 c6615f0, final C6600a0 c6600a0, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return AbstractC22894m.m117601c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6655y0 m33979i;
                m33979i = C6655y0.m33979i(context, scheduledExecutorService, firebaseMessaging, c6615f0, c6600a0);
                return m33979i;
            }
        });
    }

    /* renamed from: g */
    static boolean m33978g() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ C6655y0 m33979i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C6615f0 c6615f0, C6600a0 c6600a0) {
        return new C6655y0(firebaseMessaging, c6615f0, C6651w0.m33969a(context, scheduledExecutorService), c6600a0, context, scheduledExecutorService);
    }

    /* renamed from: j */
    private void m33980j(C6649v0 c6649v0) {
        synchronized (this.f36737e) {
            try {
                String m33967e = c6649v0.m33967e();
                if (!this.f36737e.containsKey(m33967e)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.f36737e.get(m33967e);
                C22890k c22890k = (C22890k) arrayDeque.poll();
                if (c22890k != null) {
                    c22890k.m117596c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f36737e.remove(m33967e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    private void m33981n() {
        if (!m33983h()) {
            m33989q(0L);
        }
    }

    /* renamed from: f */
    boolean m33982f() {
        if (this.f36740h.m33971b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    synchronized boolean m33983h() {
        return this.f36739g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[Catch: IOException -> 0x001d, TryCatch #0 {IOException -> 0x001d, blocks: (B:3:0x0001, B:12:0x0030, B:14:0x0036, B:17:0x0049, B:19:0x0056, B:20:0x006b, B:22:0x0078, B:23:0x0013, B:26:0x001f), top: B:2:0x0001 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m33984k(C6649v0 c6649v0) {
        char c11;
        try {
            String m33965b = c6649v0.m33965b();
            int hashCode = m33965b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && m33965b.equals("U")) {
                    c11 = 1;
                    if (c11 == 0) {
                        if (c11 != 1) {
                            if (m33978g()) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unknown topic operation");
                                sb2.append(c6649v0);
                                sb2.append(".");
                            }
                        } else {
                            m33976d(c6649v0.m33966c());
                            if (m33978g()) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Unsubscribe from topic: ");
                                sb3.append(c6649v0.m33966c());
                                sb3.append(" succeeded.");
                            }
                        }
                    } else {
                        m33975c(c6649v0.m33966c());
                        if (m33978g()) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Subscribe to topic: ");
                            sb4.append(c6649v0.m33966c());
                            sb4.append(" succeeded.");
                        }
                    }
                    return true;
                }
                c11 = 65535;
                if (c11 == 0) {
                }
                return true;
            }
            if (m33965b.equals("S")) {
                c11 = 0;
                if (c11 == 0) {
                }
                return true;
            }
            c11 = 65535;
            if (c11 == 0) {
            }
            return true;
        } catch (IOException e11) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e11.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e11.getMessage())) {
                if (e11.getMessage() == null) {
                    return false;
                }
                throw e11;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Topic operation failed: ");
            sb5.append(e11.getMessage());
            sb5.append(". Will retry Topic operation.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m33985l(Runnable runnable, long j11) {
        this.f36738f.schedule(runnable, j11, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized void m33986m(boolean z11) {
        this.f36739g = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m33987o() {
        if (m33982f()) {
            m33981n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m33988p() {
        while (true) {
            synchronized (this) {
                try {
                    C6649v0 m33971b = this.f36740h.m33971b();
                    if (m33971b == null) {
                        m33978g();
                        return true;
                    }
                    if (!m33984k(m33971b)) {
                        return false;
                    }
                    this.f36740h.m33972d(m33971b);
                    m33980j(m33971b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m33989q(long j11) {
        m33985l(new RunnableC6657z0(this, this.f36733a, this.f36734b, Math.min(Math.max(30L, 2 * j11), f36732i)), j11);
        m33986m(true);
    }
}
