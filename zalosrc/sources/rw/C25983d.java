package rw;

import android.os.Process;

/* renamed from: rw.d */
/* loaded from: classes.dex */
public class C25983d extends Thread {

    /* renamed from: p */
    int f123951p;

    /* renamed from: q */
    int f123952q;

    /* renamed from: r */
    C25984e f123953r;

    public C25983d(String str) {
        super("Z:" + str);
        this.f123952q = -1;
        this.f123951p = 0;
    }

    /* renamed from: a */
    public C25984e m133836a() {
        if (!isAlive()) {
            return null;
        }
        synchronized (this) {
            while (isAlive() && this.f123953r == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        return this.f123953r;
    }

    /* renamed from: b */
    protected void m133837b() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f123952q = Process.myTid();
        C25984e.m133840d();
        synchronized (this) {
            this.f123953r = C25984e.m133839c();
            notifyAll();
        }
        m133837b();
        C25984e.m133838b();
        Process.setThreadPriority(this.f123951p);
    }
}
