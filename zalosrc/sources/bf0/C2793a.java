package bf0;

import android.os.HandlerThread;
import android.os.Looper;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: bf0.a */
/* loaded from: classes.dex */
public final class C2793a {

    /* renamed from: a */
    public static final C2793a f11144a = new C2793a();

    /* renamed from: b */
    private static final InterfaceC24854k f11145b;

    /* renamed from: bf0.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f11146q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerThread mo12V4() {
            AbstractC20110a.f98889a.mo104548a("init and start AppScopeHandlerThread", new Object[0]);
            HandlerThread handlerThread = new HandlerThread("Z:AppScopeHandlerThread");
            try {
                handlerThread.start();
            } catch (IllegalThreadStateException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            return handlerThread;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f11146q);
        f11145b = m129210a;
    }

    private C2793a() {
    }

    /* renamed from: a */
    private final HandlerThread m13456a() {
        return (HandlerThread) f11145b.getValue();
    }

    /* renamed from: b */
    public final Looper m13457b() {
        Looper looper = m13456a().getLooper();
        AbstractC19074t.m100207e(looper, "instance.looper");
        return looper;
    }
}
