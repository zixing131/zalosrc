package p232i8;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p153f8.C18821f;
import p153f8.InterfaceC18816a;
import p418p8.InterfaceC24673i;

/* renamed from: i8.q */
/* loaded from: classes.dex */
class C20413q implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final a f100551a;

    /* renamed from: b */
    private final InterfaceC24673i f100552b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f100553c;

    /* renamed from: d */
    private final InterfaceC18816a f100554d;

    /* renamed from: e */
    private final AtomicBoolean f100555e = new AtomicBoolean(false);

    /* renamed from: i8.q$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo106296a(InterfaceC24673i interfaceC24673i, Thread thread, Throwable th2);
    }

    public C20413q(a aVar, InterfaceC24673i interfaceC24673i, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC18816a interfaceC18816a) {
        this.f100551a = aVar;
        this.f100552b = interfaceC24673i;
        this.f100553c = uncaughtExceptionHandler;
        this.f100554d = interfaceC18816a;
    }

    /* renamed from: b */
    private boolean m106385b(Thread thread, Throwable th2) {
        if (thread == null) {
            C18821f.m98795f().m98798d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            C18821f.m98795f().m98798d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (this.f100554d.mo33562b()) {
            C18821f.m98795f().m98796b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m106386a() {
        return this.f100555e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f100555e.set(true);
        try {
            try {
                if (m106385b(thread, th2)) {
                    this.f100551a.mo106296a(this.f100552b, thread, th2);
                } else {
                    C18821f.m98795f().m98796b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e11) {
                C18821f.m98795f().m98799e("An error occurred in the uncaught exception handler", e11);
            }
            C18821f.m98795f().m98796b("Completed exception processing. Invoking default exception handler.");
            this.f100553c.uncaughtException(thread, th2);
            this.f100555e.set(false);
        } catch (Throwable th3) {
            C18821f.m98795f().m98796b("Completed exception processing. Invoking default exception handler.");
            this.f100553c.uncaughtException(thread, th2);
            this.f100555e.set(false);
            throw th3;
        }
    }
}
