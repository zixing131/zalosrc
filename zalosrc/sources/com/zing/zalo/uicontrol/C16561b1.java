package com.zing.zalo.uicontrol;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zing.zalo.uicontrol.b1 */
/* loaded from: classes4.dex */
public class C16561b1 {

    /* renamed from: e */
    private static C16561b1 f83642e;

    /* renamed from: a */
    final Object f83643a = new Object();

    /* renamed from: b */
    final Handler f83644b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.zing.zalo.uicontrol.a1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m88241j;
            m88241j = C16561b1.this.m88241j(message);
            return m88241j;
        }
    });

    /* renamed from: c */
    b f83645c;

    /* renamed from: d */
    b f83646d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.b1$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo88044a();

        /* renamed from: b */
        void mo88045b(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.uicontrol.b1$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        final WeakReference f83647a;

        /* renamed from: b */
        int f83648b;

        b(int i11, a aVar) {
            this.f83647a = new WeakReference(aVar);
            this.f83648b = i11;
        }

        /* renamed from: a */
        boolean m88254a(a aVar) {
            if (aVar != null && this.f83647a.get() == aVar) {
                return true;
            }
            return false;
        }
    }

    C16561b1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C16561b1 m88240d() {
        if (f83642e == null) {
            f83642e = new C16561b1();
        }
        return f83642e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ boolean m88241j(Message message) {
        if (message.what != 0) {
            return false;
        }
        m88244e((b) message.obj);
        return true;
    }

    /* renamed from: b */
    boolean m88242b(b bVar, int i11) {
        a aVar = (a) bVar.f83647a.get();
        if (aVar != null) {
            aVar.mo88045b(i11);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m88243c(a aVar, int i11) {
        synchronized (this.f83643a) {
            try {
                if (m88247h(aVar)) {
                    m88242b(this.f83645c, i11);
                } else if (m88248i(aVar)) {
                    m88242b(this.f83646d, i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    void m88244e(b bVar) {
        synchronized (this.f83643a) {
            try {
                if (this.f83645c != bVar) {
                    if (this.f83646d == bVar) {
                    }
                }
                m88242b(bVar, 2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public boolean m88245f(a aVar) {
        boolean m88247h;
        synchronized (this.f83643a) {
            m88247h = m88247h(aVar);
        }
        return m88247h;
    }

    /* renamed from: g */
    public boolean m88246g(a aVar) {
        boolean z11;
        synchronized (this.f83643a) {
            try {
                if (!m88247h(aVar) && !m88248i(aVar)) {
                    z11 = false;
                }
                z11 = true;
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: h */
    boolean m88247h(a aVar) {
        b bVar = this.f83645c;
        if (bVar != null && bVar.m88254a(aVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    boolean m88248i(a aVar) {
        b bVar = this.f83646d;
        if (bVar != null && bVar.m88254a(aVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m88249k(a aVar) {
        synchronized (this.f83643a) {
            try {
                if (m88247h(aVar)) {
                    this.f83645c = null;
                    if (this.f83646d != null) {
                        m88253o();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public void m88250l(a aVar) {
        synchronized (this.f83643a) {
            try {
                if (m88247h(aVar)) {
                    m88251m(this.f83645c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    void m88251m(b bVar) {
        int i11 = bVar.f83648b;
        if (i11 == -2) {
            return;
        }
        if (i11 <= 0) {
            if (i11 == -1) {
                i11 = 1500;
            } else {
                i11 = 2750;
            }
        }
        this.f83644b.removeCallbacksAndMessages(bVar);
        Handler handler = this.f83644b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, bVar), i11);
    }

    /* renamed from: n */
    public void m88252n(int i11, a aVar) {
        synchronized (this.f83643a) {
            try {
                if (m88247h(aVar)) {
                    b bVar = this.f83645c;
                    bVar.f83648b = i11;
                    this.f83644b.removeCallbacksAndMessages(bVar);
                    m88251m(this.f83645c);
                    return;
                }
                if (m88248i(aVar)) {
                    this.f83646d.f83648b = i11;
                } else {
                    this.f83646d = new b(i11, aVar);
                }
                b bVar2 = this.f83645c;
                if (bVar2 == null || !m88242b(bVar2, 4)) {
                    this.f83645c = null;
                    m88253o();
                }
            } finally {
            }
        }
    }

    /* renamed from: o */
    void m88253o() {
        b bVar = this.f83646d;
        if (bVar != null) {
            this.f83645c = bVar;
            this.f83646d = null;
            a aVar = (a) bVar.f83647a.get();
            if (aVar != null) {
                aVar.mo88044a();
            } else {
                this.f83645c = null;
            }
        }
    }
}
