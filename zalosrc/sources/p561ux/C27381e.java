package p561ux;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.zing.zalo.preferences.IPreferences;
import ho0.AbstractC20110a;

/* renamed from: ux.e */
/* loaded from: classes.dex */
public class C27381e extends AbstractC27383g {

    /* renamed from: b */
    private Handler f128999b;

    /* renamed from: ux.e$a */
    /* loaded from: classes.dex */
    class a extends HandlerThread {
        a(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            C27381e.this.f128999b = new Handler(getLooper());
            super.onLooperPrepared();
        }
    }

    public C27381e(IPreferences iPreferences) {
        super(iPreferences);
        a aVar = new a("Z:prefs-writer");
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        aVar.start();
        AbstractC20110a.m104535d("start writer thread: %d", Long.valueOf(SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m140286o(String str, boolean z11) {
        super.mo48448i(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m140287p(String str, int i11) {
        super.mo48443d(str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m140288q(String str, long j11) {
        super.mo48447h(str, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m140289r(String str, String str2) {
        super.mo48442c(str, str2);
    }

    @Override // p561ux.AbstractC27383g, com.zing.zalo.preferences.IPreferences
    /* renamed from: c */
    public void mo48442c(final String str, final String str2) {
        Handler handler;
        if (Looper.myLooper() == Looper.getMainLooper() && (handler = this.f128999b) != null) {
            handler.post(new Runnable() { // from class: ux.a
                @Override // java.lang.Runnable
                public final void run() {
                    C27381e.this.m140289r(str, str2);
                }
            });
        } else {
            super.mo48442c(str, str2);
        }
    }

    @Override // p561ux.AbstractC27383g, com.zing.zalo.preferences.IPreferences
    /* renamed from: d */
    public void mo48443d(final String str, final int i11) {
        Handler handler;
        if (Looper.myLooper() == Looper.getMainLooper() && (handler = this.f128999b) != null) {
            handler.post(new Runnable() { // from class: ux.c
                @Override // java.lang.Runnable
                public final void run() {
                    C27381e.this.m140287p(str, i11);
                }
            });
        } else {
            super.mo48443d(str, i11);
        }
    }

    @Override // p561ux.AbstractC27383g, com.zing.zalo.preferences.IPreferences
    /* renamed from: h */
    public void mo48447h(final String str, final long j11) {
        Handler handler;
        if (Looper.myLooper() == Looper.getMainLooper() && (handler = this.f128999b) != null) {
            handler.post(new Runnable() { // from class: ux.b
                @Override // java.lang.Runnable
                public final void run() {
                    C27381e.this.m140288q(str, j11);
                }
            });
        } else {
            super.mo48447h(str, j11);
        }
    }

    @Override // p561ux.AbstractC27383g, com.zing.zalo.preferences.IPreferences
    /* renamed from: i */
    public void mo48448i(final String str, final boolean z11) {
        Handler handler;
        if (Looper.myLooper() == Looper.getMainLooper() && (handler = this.f128999b) != null) {
            handler.post(new Runnable() { // from class: ux.d
                @Override // java.lang.Runnable
                public final void run() {
                    C27381e.this.m140286o(str, z11);
                }
            });
        } else {
            super.mo48448i(str, z11);
        }
    }
}
