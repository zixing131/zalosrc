package p042bx;

import android.os.Debug;
import android.os.SystemClock;
import android.util.Printer;
import mx.C23476m;
import p042bx.C3155j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bx.i */
/* loaded from: classes4.dex */
public class C3154i implements Printer, C3155j.a {

    /* renamed from: a */
    private long f13327a;

    /* renamed from: d */
    a f13330d;

    /* renamed from: f */
    private final boolean f13332f;

    /* renamed from: b */
    private long f13328b = 0;

    /* renamed from: c */
    private long f13329c = 0;

    /* renamed from: e */
    private boolean f13331e = false;

    /* renamed from: g */
    private boolean f13333g = false;

    /* renamed from: bx.i$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo15862a(long j11, long j12, long j13, long j14, int i11, int i12);
    }

    public C3154i(a aVar, long j11, boolean z11) {
        this.f13330d = null;
        if (aVar != null) {
            this.f13330d = aVar;
            this.f13327a = j11;
            this.f13332f = z11;
            return;
        }
        throw new IllegalArgumentException("blockListener should not be null.");
    }

    /* renamed from: c */
    private boolean m15874c(long j11) {
        return j11 - this.f13328b > this.f13327a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m15875d(long j11, long j12, long j13, long j14, int i11, int i12) {
        this.f13330d.mo15862a(j11, j12, j13, j14, i11, i12);
    }

    /* renamed from: e */
    private void m15876e(final long j11, final int i11, final int i12) {
        final long j12 = this.f13328b;
        final long j13 = this.f13329c;
        final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        AbstractC3152g.m15871d().post(new Runnable() { // from class: bx.h
            @Override // java.lang.Runnable
            public final void run() {
                C3154i.this.m15875d(j12, j11, j13, currentThreadTimeMillis, i11, i12);
            }
        });
    }

    /* renamed from: f */
    private void m15877f() {
        if (C3150e.m15857g().f13311b != null) {
            C3150e.m15857g().f13311b.m15837h();
        }
    }

    /* renamed from: g */
    private void m15878g() {
        if (C3150e.m15857g().f13311b != null) {
            C3150e.m15857g().f13311b.m15838i();
        }
    }

    @Override // p042bx.C3155j.a
    /* renamed from: a */
    public void mo15879a(int i11, int i12) {
        this.f13333g = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m15876e(elapsedRealtime, i11, i12);
        this.f13328b = elapsedRealtime;
    }

    @Override // android.util.Printer
    public void println(String str) {
        if (this.f13332f && Debug.isDebuggerConnected()) {
            return;
        }
        if (!this.f13331e) {
            this.f13328b = SystemClock.elapsedRealtime();
            this.f13329c = SystemClock.currentThreadTimeMillis();
            this.f13331e = true;
            m15877f();
            this.f13333g = false;
            return;
        }
        if (!this.f13333g) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int m15834d = C3150e.m15857g().f13311b.m15834d() + 1;
            C3150e.m15857g().f13311b.m15836g(m15834d);
            if (m15874c(elapsedRealtime) && C23476m.m123248f()) {
                m15876e(elapsedRealtime, 5, m15834d);
            }
            m15878g();
        }
        this.f13331e = false;
    }
}
