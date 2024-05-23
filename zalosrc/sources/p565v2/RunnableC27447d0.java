package p565v2;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC2252t;
import androidx.work.AbstractC2253u;
import androidx.work.C2244l;
import androidx.work.InterfaceC2245m;
import androidx.work.impl.utils.futures.C2230c;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import p535u2.C26976w;
import p595w2.InterfaceC28696c;

/* renamed from: v2.d0 */
/* loaded from: classes2.dex */
public class RunnableC27447d0 implements Runnable {

    /* renamed from: v */
    static final String f129154v = AbstractC2253u.m11897i("WorkForegroundRunnable");

    /* renamed from: p */
    final C2230c f129155p = C2230c.m11809t();

    /* renamed from: q */
    final Context f129156q;

    /* renamed from: r */
    final C26976w f129157r;

    /* renamed from: s */
    final AbstractC2252t f129158s;

    /* renamed from: t */
    final InterfaceC2245m f129159t;

    /* renamed from: u */
    final InterfaceC28696c f129160u;

    /* renamed from: v2.d0$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ C2230c f129161p;

        a(C2230c c2230c) {
            this.f129161p = c2230c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RunnableC27447d0.this.f129155p.isCancelled()) {
                return;
            }
            try {
                C2244l c2244l = (C2244l) this.f129161p.get();
                if (c2244l != null) {
                    AbstractC2253u.m11895e().mo11898a(RunnableC27447d0.f129154v, "Updating notification for " + RunnableC27447d0.this.f129157r.f127499c);
                    RunnableC27447d0 runnableC27447d0 = RunnableC27447d0.this;
                    runnableC27447d0.f129155p.mo11800r(runnableC27447d0.f129159t.mo11881a(runnableC27447d0.f129156q, runnableC27447d0.f129158s.getId(), c2244l));
                    return;
                }
                throw new IllegalStateException("Worker was marked important (" + RunnableC27447d0.this.f129157r.f127499c + ") but did not provide ForegroundInfo");
            } catch (Throwable th2) {
                RunnableC27447d0.this.f129155p.mo11799q(th2);
            }
        }
    }

    public RunnableC27447d0(Context context, C26976w c26976w, AbstractC2252t abstractC2252t, InterfaceC2245m interfaceC2245m, InterfaceC28696c interfaceC28696c) {
        this.f129156q = context;
        this.f129157r = c26976w;
        this.f129158s = abstractC2252t;
        this.f129159t = interfaceC2245m;
        this.f129160u = interfaceC28696c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m140486c(C2230c c2230c) {
        if (!this.f129155p.isCancelled()) {
            c2230c.mo11800r(this.f129158s.getForegroundInfoAsync());
        } else {
            c2230c.cancel(true);
        }
    }

    /* renamed from: b */
    public InterfaceFutureC6534a m140487b() {
        return this.f129155p;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f129157r.f127513q && Build.VERSION.SDK_INT < 31) {
            final C2230c m11809t = C2230c.m11809t();
            this.f129160u.mo143749a().execute(new Runnable() { // from class: v2.c0
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC27447d0.this.m140486c(m11809t);
                }
            });
            m11809t.mo5907b(new a(m11809t), this.f129160u.mo143749a());
            return;
        }
        this.f129155p.mo11798p(null);
    }
}
