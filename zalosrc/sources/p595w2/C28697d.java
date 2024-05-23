package p595w2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import p565v2.C27468v;

/* renamed from: w2.d */
/* loaded from: classes.dex */
public class C28697d implements InterfaceC28696c {

    /* renamed from: a */
    private final C27468v f133173a;

    /* renamed from: b */
    private final CoroutineDispatcher f133174b;

    /* renamed from: c */
    final Handler f133175c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Executor f133176d = new a();

    /* renamed from: w2.d$a */
    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C28697d.this.f133175c.post(runnable);
        }
    }

    public C28697d(Executor executor) {
        C27468v c27468v = new C27468v(executor);
        this.f133173a = c27468v;
        this.f133174b = ExecutorsKt.m112727a(c27468v);
    }

    @Override // p595w2.InterfaceC28696c
    /* renamed from: a */
    public Executor mo143749a() {
        return this.f133176d;
    }

    @Override // p595w2.InterfaceC28696c
    /* renamed from: b */
    public CoroutineDispatcher mo143750b() {
        return this.f133174b;
    }

    @Override // p595w2.InterfaceC28696c
    /* renamed from: d */
    public /* synthetic */ void mo143752d(Runnable runnable) {
        AbstractC28695b.m143748a(this, runnable);
    }

    @Override // p595w2.InterfaceC28696c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C27468v mo143751c() {
        return this.f133173a;
    }
}
