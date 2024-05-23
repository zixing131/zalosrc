package p609wh;

import java.util.ArrayList;

/* renamed from: wh.o0 */
/* loaded from: classes.dex */
public class C29027o0 {

    /* renamed from: a */
    public final String f134373a = getClass().getSimpleName();

    /* renamed from: b */
    private final ArrayList f134374b = new ArrayList();

    /* renamed from: a */
    public void m145021a(C29037t0 c29037t0) {
        try {
            synchronized (this.f134374b) {
                this.f134374b.add(c29037t0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m145022b(C29037t0 c29037t0) {
        try {
            synchronized (this.f134374b) {
                try {
                    if (this.f134374b.size() > 0) {
                        if (((C29037t0) this.f134374b.get(0)).m110299P()) {
                            this.f134374b.add(1, c29037t0);
                        } else {
                            this.f134374b.add(0, c29037t0);
                        }
                    } else {
                        this.f134374b.add(0, c29037t0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m145023c() {
        while (this.f134374b.size() > 0) {
            ((C29037t0) this.f134374b.remove(0)).mo51554n();
        }
    }

    /* renamed from: d */
    public C29037t0 m145024d() {
        if (this.f134374b.size() > 0) {
            return (C29037t0) this.f134374b.remove(0);
        }
        return null;
    }

    /* renamed from: e */
    public C29037t0 m145025e(int i11) {
        if (this.f134374b.size() > 0 && this.f134374b.size() > i11) {
            return (C29037t0) this.f134374b.get(i11);
        }
        return null;
    }

    /* renamed from: f */
    public boolean m145026f() {
        return this.f134374b.isEmpty();
    }
}
