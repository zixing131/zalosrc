package p714zf;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;

/* renamed from: zf.h */
/* loaded from: classes3.dex */
public abstract class AbstractC31817h {

    /* renamed from: d */
    protected final String f145979d;

    /* renamed from: e */
    protected long f145980e;

    /* renamed from: f */
    Handler f145981f;

    /* renamed from: g */
    b f145982g;

    /* renamed from: a */
    protected final String f145976a = getClass().getSimpleName();

    /* renamed from: b */
    private boolean f145977b = false;

    /* renamed from: c */
    private long f145978c = 0;

    /* renamed from: h */
    private final Runnable f145983h = new a();

    /* renamed from: zf.h$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC31817h abstractC31817h = AbstractC31817h.this;
            if (abstractC31817h.f145980e >= 2000 && abstractC31817h.f145977b && AbstractC31817h.this.f145981f != null) {
                long currentTimeMillis = System.currentTimeMillis() - AbstractC31817h.this.f145978c;
                AbstractC31817h abstractC31817h2 = AbstractC31817h.this;
                if (currentTimeMillis - abstractC31817h2.f145980e > 200) {
                    abstractC31817h2.m152859n();
                } else {
                    abstractC31817h2.f145981f.postDelayed(abstractC31817h2.f145983h, 100L);
                }
            }
        }
    }

    /* renamed from: zf.h$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo38629a(String str);

        /* renamed from: b */
        void mo38630b(int i11);

        /* renamed from: c */
        void mo38631c(String str, boolean z11);
    }

    public AbstractC31817h(String str, long j11, b bVar) {
        this.f145979d = str;
        this.f145982g = bVar;
        this.f145980e = j11;
        HandlerThread handlerThread = new HandlerThread("Z:MediaRecordThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f145981f = handler;
        handler.post(new Runnable() { // from class: zf.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC31817h.this.m152854f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m152854f() {
        b bVar;
        try {
            mo152840g();
        } catch (Exception e11) {
            if ((AbstractC23227u1.m119701a(e11) || ((e11 instanceof IOException) && !AbstractC23238v2.m119726k())) && (bVar = this.f145982g) != null) {
                bVar.mo38630b(601);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m152855e() {
        this.f145978c = System.currentTimeMillis();
        this.f145981f.postDelayed(this.f145983h, 100L);
    }

    protected void finalize() {
        m152856k();
        super.finalize();
    }

    /* renamed from: g */
    protected abstract void mo152840g();

    /* renamed from: h */
    public abstract void mo152841h();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo152842i();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo152843j();

    /* renamed from: k */
    protected synchronized void m152856k() {
        try {
            Handler handler = this.f145981f;
            if (handler != null) {
                handler.getLooper().quitSafely();
                this.f145981f = null;
            }
            if (this.f145982g != null) {
                this.f145982g = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: l */
    public final void m152857l() {
        Handler handler;
        if (!this.f145977b && (handler = this.f145981f) != null) {
            handler.post(new Runnable() { // from class: zf.g
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC31817h.this.mo152841h();
                }
            });
        }
    }

    /* renamed from: m */
    public final void m152858m() {
        if (this.f145977b) {
            return;
        }
        this.f145977b = true;
        this.f145981f.post(new Runnable() { // from class: zf.d
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC31817h.this.mo152842i();
            }
        });
    }

    /* renamed from: n */
    public final void m152859n() {
        Handler handler;
        if (this.f145977b && (handler = this.f145981f) != null) {
            this.f145977b = false;
            handler.post(new Runnable() { // from class: zf.f
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC31817h.this.mo152843j();
                }
            });
        }
    }
}
