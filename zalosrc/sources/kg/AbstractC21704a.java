package kg;

import android.os.SystemClock;
import android.view.Choreographer;

/* renamed from: kg.a */
/* loaded from: classes3.dex */
abstract class AbstractC21704a {

    /* renamed from: kg.a$a */
    /* loaded from: classes3.dex */
    static class a extends AbstractC21714k {

        /* renamed from: b */
        final Choreographer f105415b;

        /* renamed from: c */
        final Choreographer.FrameCallback f105416c = new ChoreographerFrameCallbackC32873a();

        /* renamed from: d */
        boolean f105417d;

        /* renamed from: e */
        long f105418e;

        /* renamed from: kg.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class ChoreographerFrameCallbackC32873a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC32873a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j11) {
                a aVar = a.this;
                if (aVar.f105417d && aVar.f105455a != null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    a.this.f105455a.m112023h(uptimeMillis - r0.f105418e);
                    a aVar2 = a.this;
                    aVar2.f105418e = uptimeMillis;
                    aVar2.f105415b.postFrameCallback(aVar2.f105416c);
                }
            }
        }

        public a(Choreographer choreographer) {
            this.f105415b = choreographer;
        }

        /* renamed from: d */
        public static a m112013d() {
            return new a(Choreographer.getInstance());
        }

        @Override // kg.AbstractC21714k
        /* renamed from: b */
        public void mo112014b() {
            if (this.f105417d) {
                return;
            }
            this.f105417d = true;
            this.f105418e = SystemClock.uptimeMillis();
            this.f105415b.removeFrameCallback(this.f105416c);
            this.f105415b.postFrameCallback(this.f105416c);
        }

        @Override // kg.AbstractC21714k
        /* renamed from: c */
        public void mo112015c() {
            this.f105417d = false;
            this.f105415b.removeFrameCallback(this.f105416c);
        }
    }

    /* renamed from: a */
    public static AbstractC21714k m112012a() {
        return a.m112013d();
    }
}
