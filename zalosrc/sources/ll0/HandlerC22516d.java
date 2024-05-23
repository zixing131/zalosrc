package ll0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.WeakHashMap;

/* renamed from: ll0.d */
/* loaded from: classes7.dex */
public final class HandlerC22516d extends Handler {

    /* renamed from: a */
    private WeakHashMap f110191a;

    /* renamed from: b */
    private final Object f110192b;

    /* renamed from: ll0.d$a */
    /* loaded from: classes7.dex */
    public interface a extends Runnable {

        /* renamed from: ll0.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public enum EnumC32888a {
            interval,
            loop
        }

        /* renamed from: f0 */
        long mo92027f0();

        /* renamed from: g0 */
        EnumC32888a mo92028g0();

        /* renamed from: v */
        int mo92029v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ll0.d$b */
    /* loaded from: classes7.dex */
    public static class b implements a {

        /* renamed from: p */
        int f110196p = 0;

        /* renamed from: q */
        a f110197q;

        public b(a aVar) {
            this.f110197q = aVar;
        }

        @Override // ll0.HandlerC22516d.a
        /* renamed from: f0 */
        public long mo92027f0() {
            return this.f110197q.mo92027f0();
        }

        @Override // ll0.HandlerC22516d.a
        /* renamed from: g0 */
        public a.EnumC32888a mo92028g0() {
            return this.f110197q.mo92028g0();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f110197q.run();
        }

        @Override // ll0.HandlerC22516d.a
        /* renamed from: v */
        public int mo92029v() {
            return this.f110197q.mo92029v();
        }
    }

    public HandlerC22516d(Looper looper) {
        super(looper);
        this.f110192b = new Object();
        this.f110191a = new WeakHashMap();
    }

    /* renamed from: b */
    private void m116419b(b bVar) {
        removeMessages(1, bVar);
    }

    /* renamed from: e */
    private void m116420e(b bVar, boolean z11) {
        if (!hasMessages(1, bVar)) {
            Message obtainMessage = obtainMessage(1, bVar);
            if (!z11 && bVar.mo92027f0() > 0) {
                sendMessageDelayed(obtainMessage, bVar.mo92027f0());
            } else {
                sendMessage(obtainMessage);
            }
        }
    }

    /* renamed from: a */
    public void m116421a(a aVar, boolean z11) {
        synchronized (this.f110192b) {
            if (aVar != null) {
                try {
                    if (this.f110191a.get(aVar) == null) {
                        b bVar = new b(aVar);
                        this.f110191a.put(aVar, bVar);
                        m116420e(bVar, z11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: c */
    public void m116422c(a aVar) {
        synchronized (this.f110192b) {
            if (aVar != null) {
                try {
                    b bVar = (b) this.f110191a.get(aVar);
                    if (bVar != null) {
                        m116419b(bVar);
                        this.f110191a.remove(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m116423d(a aVar) {
        boolean z11;
        synchronized (this.f110192b) {
            if (aVar != null) {
                try {
                    if (this.f110191a.get(aVar) != null) {
                        z11 = true;
                    }
                } finally {
                }
            }
            z11 = false;
        }
        return z11;
    }

    /* renamed from: f */
    public void m116424f(a aVar) {
        synchronized (this.f110192b) {
            if (aVar != null) {
                try {
                    b bVar = (b) this.f110191a.get(aVar);
                    if (bVar != null) {
                        m116419b(bVar);
                        m116420e(bVar, false);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1) {
            Object obj = message.obj;
            if (obj instanceof b) {
                b bVar = (b) obj;
                a.EnumC32888a mo92028g0 = bVar.mo92028g0();
                a.EnumC32888a enumC32888a = a.EnumC32888a.loop;
                if (mo92028g0 != enumC32888a || bVar.mo92029v() != bVar.f110196p) {
                    if (bVar.mo92028g0() == enumC32888a) {
                        bVar.f110196p++;
                    }
                    bVar.run();
                    m116420e(bVar, false);
                    return;
                }
                return;
            }
        }
        super.handleMessage(message);
    }
}
