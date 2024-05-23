package ll0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.work.AbstractC2147g0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import ll0.C22518f;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25378x;

/* renamed from: ll0.f */
/* loaded from: classes.dex */
public final class C22518f {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final InterfaceC24854k f110199d;

    /* renamed from: e */
    private static final InterfaceC24854k f110200e;

    /* renamed from: a */
    private final PriorityBlockingQueue f110201a = new PriorityBlockingQueue(128, new d());

    /* renamed from: b */
    private final AtomicBoolean f110202b = new AtomicBoolean(false);

    /* renamed from: c */
    private final Object f110203c = new Object();

    /* renamed from: ll0.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ll0.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32889a {

            /* renamed from: a */
            private final C22518f f110204a;

            /* renamed from: b */
            private final Runnable f110205b;

            /* renamed from: c */
            private final int f110206c;

            /* renamed from: d */
            private final int f110207d;

            /* renamed from: e */
            private final long f110208e;

            public C32889a(C22518f c22518f, Runnable runnable, int i11, int i12, long j11) {
                AbstractC19074t.m100208f(c22518f, "executor");
                AbstractC19074t.m100208f(runnable, "runnable");
                this.f110204a = c22518f;
                this.f110205b = runnable;
                this.f110206c = i11;
                this.f110207d = i12;
                this.f110208e = j11;
            }

            /* renamed from: a */
            public final C22518f m116448a() {
                return this.f110204a;
            }

            /* renamed from: b */
            public final Runnable m116449b() {
                return this.f110205b;
            }

            /* renamed from: c */
            public final int m116450c() {
                return this.f110206c;
            }

            /* renamed from: d */
            public final int m116451d() {
                return this.f110207d;
            }

            /* renamed from: e */
            public final long m116452e() {
                return this.f110208e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32889a)) {
                    return false;
                }
                C32889a c32889a = (C32889a) obj;
                return AbstractC19074t.m100204b(this.f110204a, c32889a.f110204a) && AbstractC19074t.m100204b(this.f110205b, c32889a.f110205b) && this.f110206c == c32889a.f110206c && this.f110207d == c32889a.f110207d && this.f110208e == c32889a.f110208e;
            }

            /* renamed from: f */
            public final int m116453f() {
                return this.f110207d;
            }

            public int hashCode() {
                return (((((((this.f110204a.hashCode() * 31) + this.f110205b.hashCode()) * 31) + this.f110206c) * 31) + this.f110207d) * 31) + AbstractC2147g0.m11521a(this.f110208e);
            }

            public String toString() {
                return "ZinstantSynchronizerData(executor=" + this.f110204a + ", runnable=" + this.f110205b + ", priority=" + this.f110206c + ", key=" + this.f110207d + ", time=" + this.f110208e + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final Handler m116446c() {
            return (Handler) C22518f.f110200e.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final HandlerThread m116447d() {
            return (HandlerThread) C22518f.f110199d.getValue();
        }
    }

    /* renamed from: ll0.f$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f110209q = new b();

        b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m116455c(Message message) {
            AbstractC19074t.m100208f(message, "it");
            Object obj = message.obj;
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zinstant.worker.ZinstantSynchronizerExecutor.Companion.ZinstantSynchronizerData");
            a.C32889a c32889a = (a.C32889a) obj;
            c32889a.m116448a().m116433n(c32889a.m116449b(), c32889a.m116450c(), c32889a.m116451d(), c32889a.m116452e());
            return true;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Handler mo12V4() {
            return new Handler(C22518f.Companion.m116447d().getLooper(), new Handler.Callback() { // from class: ll0.g
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    boolean m116455c;
                    m116455c = C22518f.b.m116455c(message);
                    return m116455c;
                }
            });
        }
    }

    /* renamed from: ll0.f$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f110210q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerThread mo12V4() {
            HandlerThread handlerThread = new HandlerThread("ZinstantSynchronizerThread");
            handlerThread.start();
            return handlerThread;
        }
    }

    /* renamed from: ll0.f$d */
    /* loaded from: classes.dex */
    private static final class d implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            AbstractC19074t.m100208f(eVar, "r1");
            AbstractC19074t.m100208f(eVar2, "r2");
            if (eVar.m116460b() > eVar2.m116460b()) {
                return -1;
            }
            if (eVar.m116460b() < eVar2.m116460b()) {
                return 1;
            }
            if (eVar.m116461c() < eVar2.m116461c()) {
                return -1;
            }
            if (eVar.m116461c() > eVar2.m116461c()) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ll0.f$e */
    /* loaded from: classes7.dex */
    public static final class e implements Runnable {

        /* renamed from: p */
        private final Runnable f110211p;

        /* renamed from: q */
        private int f110212q;

        /* renamed from: r */
        private final int f110213r;

        /* renamed from: s */
        private final long f110214s;

        public e(Runnable runnable, int i11, int i12, long j11) {
            AbstractC19074t.m100208f(runnable, "runnable");
            this.f110211p = runnable;
            this.f110212q = i11;
            this.f110213r = i12;
            this.f110214s = j11;
            this.f110212q = Math.max(Math.min(i11, 10), 1);
        }

        /* renamed from: a */
        public final int m116459a() {
            return this.f110213r;
        }

        /* renamed from: b */
        public final int m116460b() {
            return this.f110212q;
        }

        /* renamed from: c */
        public final long m116461c() {
            return this.f110214s;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f110211p.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ll0.f$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ int f110215q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11) {
            super(1);
            this.f110215q = i11;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(e eVar) {
            boolean z11;
            if (eVar.m116459a() == this.f110215q) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(c.f110210q);
        f110199d = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f110209q);
        f110200e = m129210a2;
    }

    /* renamed from: f */
    private final Message m116430f(Runnable runnable, int i11, Object obj, boolean z11) {
        int hashCode;
        if (obj != null) {
            hashCode = obj.hashCode();
        } else {
            hashCode = runnable.hashCode();
        }
        int i12 = hashCode;
        if (z11) {
            Companion.m116446c().removeMessages(i12);
        }
        Message obtainMessage = Companion.m116446c().obtainMessage(i12);
        AbstractC19074t.m100207e(obtainMessage, "sHandler.obtainMessage(messageKey)");
        obtainMessage.obj = new a.C32889a(this, runnable, i11, i12, System.nanoTime());
        return obtainMessage;
    }

    /* renamed from: h */
    public static /* synthetic */ void m116431h(C22518f c22518f, Runnable runnable, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c22518f.m116438g(runnable, obj, z11);
    }

    /* renamed from: k */
    public static /* synthetic */ void m116432k(C22518f c22518f, Runnable runnable, long j11, int i11, Object obj, boolean z11, int i12, Object obj2) {
        int i13;
        boolean z12;
        if ((i12 & 4) != 0) {
            i13 = 5;
        } else {
            i13 = i11;
        }
        if ((i12 & 8) != 0) {
            obj = null;
        }
        Object obj3 = obj;
        if ((i12 & 16) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        c22518f.m116440j(runnable, j11, i13, obj3, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m116433n(Runnable runnable, int i11, int i12, long j11) {
        synchronized (this.f110203c) {
            this.f110201a.add(new e(runnable, i11, i12, j11));
            m116435q();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: p */
    private final void m116434p(int i11) {
        synchronized (this.f110203c) {
            AbstractC25378x.m131541C(this.f110201a, new f(i11));
        }
    }

    /* renamed from: q */
    private final void m116435q() {
        synchronized (this.f110203c) {
            if (this.f110202b.get()) {
                return;
            }
            this.f110202b.set(true);
            C22514b.m116415b().m116416a(new Runnable() { // from class: ll0.e
                @Override // java.lang.Runnable
                public final void run() {
                    C22518f.m116436r(C22518f.this);
                }
            });
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m116436r(C22518f c22518f) {
        Object poll;
        AbstractC19074t.m100208f(c22518f, "this$0");
        while (true) {
            synchronized (c22518f.f110203c) {
                if (c22518f.f110201a.size() > 0) {
                    poll = c22518f.f110201a.poll();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } else {
                    c22518f.f110202b.set(false);
                    return;
                }
            }
            Runnable runnable = (Runnable) poll;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: e */
    public final Looper m116437e() {
        Looper looper = Companion.m116447d().getLooper();
        AbstractC19074t.m100207e(looper, "thread.looper");
        return looper;
    }

    /* renamed from: g */
    public final void m116438g(Runnable runnable, Object obj, boolean z11) {
        AbstractC19074t.m100208f(runnable, "r");
        m116439i(runnable, 0L, obj, z11);
    }

    /* renamed from: i */
    public final void m116439i(Runnable runnable, long j11, Object obj, boolean z11) {
        AbstractC19074t.m100208f(runnable, "r");
        m116432k(this, runnable, j11, 0, obj, z11, 4, null);
    }

    /* renamed from: j */
    public final void m116440j(Runnable runnable, long j11, int i11, Object obj, boolean z11) {
        AbstractC19074t.m100208f(runnable, "r");
        Message m116430f = m116430f(runnable, i11, obj, z11);
        if (z11) {
            Object obj2 = m116430f.obj;
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.zinstant.worker.ZinstantSynchronizerExecutor.Companion.ZinstantSynchronizerData");
            m116434p(((a.C32889a) obj2).m116453f());
        }
        Companion.m116446c().sendMessageDelayed(m116430f, j11);
    }

    /* renamed from: l */
    public final boolean m116441l(Runnable runnable, Object obj) {
        AbstractC19074t.m100208f(runnable, "r");
        AbstractC19074t.m100208f(obj, "key");
        if (Companion.m116446c().hasMessages(obj.hashCode())) {
            return false;
        }
        m116431h(this, runnable, obj, false, 4, null);
        return true;
    }

    /* renamed from: m */
    public final void m116442m(Runnable runnable, int i11, Object obj, boolean z11) {
        AbstractC19074t.m100208f(runnable, "r");
        m116440j(runnable, 0L, i11, obj, z11);
    }

    /* renamed from: o */
    public final void m116443o() {
        synchronized (this.f110203c) {
            this.f110201a.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }
}
