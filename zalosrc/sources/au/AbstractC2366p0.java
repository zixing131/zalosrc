package au;

import android.os.Handler;
import ho0.AbstractC20110a;

/* renamed from: au.p0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2366p0 {

    /* renamed from: a */
    private final long f9899a;

    /* renamed from: b */
    private final int f9900b;

    /* renamed from: c */
    private final Handler f9901c;

    public AbstractC2366p0(long j11, int i11, Handler handler) {
        this.f9899a = j11;
        this.f9900b = i11;
        this.f9901c = handler;
    }

    /* renamed from: a */
    public abstract void mo604a();

    /* renamed from: b */
    public final void m12383b() {
        Handler handler = this.f9901c;
        if (handler != null) {
            if (handler.hasMessages(this.f9900b)) {
                AbstractC20110a.m104545n("Multiple click action: " + this.f9900b, new Object[0]);
                return;
            }
            this.f9901c.sendMessageDelayed(this.f9901c.obtainMessage(this.f9900b), this.f9899a);
            mo604a();
        }
    }
}
