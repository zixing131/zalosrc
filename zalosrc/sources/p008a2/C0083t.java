package p008a2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p008a2.C0080q;
import p008a2.C0083t;
import p008a2.InterfaceC0075l;
import p008a2.InterfaceC0076m;

/* renamed from: a2.t */
/* loaded from: classes2.dex */
public final class C0083t {

    /* renamed from: a */
    private final String f350a;

    /* renamed from: b */
    private final C0080q f351b;

    /* renamed from: c */
    private final Executor f352c;

    /* renamed from: d */
    private final Context f353d;

    /* renamed from: e */
    private int f354e;

    /* renamed from: f */
    public C0080q.c f355f;

    /* renamed from: g */
    private InterfaceC0076m f356g;

    /* renamed from: h */
    private final InterfaceC0075l f357h;

    /* renamed from: i */
    private final AtomicBoolean f358i;

    /* renamed from: j */
    private final ServiceConnection f359j;

    /* renamed from: k */
    private final Runnable f360k;

    /* renamed from: l */
    private final Runnable f361l;

    /* renamed from: a2.t$a */
    /* loaded from: classes2.dex */
    public static final class a extends C0080q.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // p008a2.C0080q.c
        /* renamed from: b */
        public boolean mo306b() {
            return true;
        }

        @Override // p008a2.C0080q.c
        /* renamed from: c */
        public void mo185c(Set set) {
            AbstractC19074t.m100208f(set, "tables");
            if (C0083t.this.m322j().get()) {
                return;
            }
            try {
                InterfaceC0076m m320h = C0083t.this.m320h();
                if (m320h != null) {
                    int m315c = C0083t.this.m315c();
                    Object[] array = set.toArray(new String[0]);
                    AbstractC19074t.m100206d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    m320h.mo270r2(m315c, (String[]) array);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a2.t$b */
    /* loaded from: classes2.dex */
    public static final class b extends InterfaceC0075l.a {
        b() {
        }

        /* renamed from: Q */
        public static final void m326Q(C0083t c0083t, String[] strArr) {
            AbstractC19074t.m100208f(c0083t, "this$0");
            AbstractC19074t.m100208f(strArr, "$tables");
            c0083t.m317e().m291l((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override // p008a2.InterfaceC0075l
        /* renamed from: p0 */
        public void mo266p0(String[] strArr) {
            AbstractC19074t.m100208f(strArr, "tables");
            C0083t.this.m316d().execute(new Runnable() { // from class: a2.u

                /* renamed from: q */
                public final /* synthetic */ String[] f366q;

                public /* synthetic */ RunnableC0084u(String[] strArr2) {
                    r2 = strArr2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0083t.b.m326Q(C0083t.this, r2);
                }
            });
        }
    }

    /* renamed from: a2.t$c */
    /* loaded from: classes2.dex */
    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC19074t.m100208f(componentName, "name");
            AbstractC19074t.m100208f(iBinder, "service");
            C0083t.this.m324m(InterfaceC0076m.a.m271E(iBinder));
            C0083t.this.m316d().execute(C0083t.this.m321i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            AbstractC19074t.m100208f(componentName, "name");
            C0083t.this.m316d().execute(C0083t.this.m319g());
            C0083t.this.m324m(null);
        }
    }

    public C0083t(Context context, String str, Intent intent, C0080q c0080q, Executor executor) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(intent, "serviceIntent");
        AbstractC19074t.m100208f(c0080q, "invalidationTracker");
        AbstractC19074t.m100208f(executor, "executor");
        this.f350a = str;
        this.f351b = c0080q;
        this.f352c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f353d = applicationContext;
        this.f357h = new b();
        this.f358i = new AtomicBoolean(false);
        c cVar = new c();
        this.f359j = cVar;
        this.f360k = new Runnable() { // from class: a2.r
            public /* synthetic */ RunnableC0081r() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0083t.m314n(C0083t.this);
            }
        };
        this.f361l = new Runnable() { // from class: a2.s
            public /* synthetic */ RunnableC0082s() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0083t.m313k(C0083t.this);
            }
        };
        Object[] array = c0080q.m289j().keySet().toArray(new String[0]);
        AbstractC19074t.m100206d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        m323l(new a((String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* renamed from: k */
    public static final void m313k(C0083t c0083t) {
        AbstractC19074t.m100208f(c0083t, "this$0");
        c0083t.f351b.m294o(c0083t.m318f());
    }

    /* renamed from: n */
    public static final void m314n(C0083t c0083t) {
        AbstractC19074t.m100208f(c0083t, "this$0");
        try {
            InterfaceC0076m interfaceC0076m = c0083t.f356g;
            if (interfaceC0076m != null) {
                c0083t.f354e = interfaceC0076m.mo268A2(c0083t.f357h, c0083t.f350a);
                c0083t.f351b.m281b(c0083t.m318f());
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: c */
    public final int m315c() {
        return this.f354e;
    }

    /* renamed from: d */
    public final Executor m316d() {
        return this.f352c;
    }

    /* renamed from: e */
    public final C0080q m317e() {
        return this.f351b;
    }

    /* renamed from: f */
    public final C0080q.c m318f() {
        C0080q.c cVar = this.f355f;
        if (cVar != null) {
            return cVar;
        }
        AbstractC19074t.m100223u("observer");
        return null;
    }

    /* renamed from: g */
    public final Runnable m319g() {
        return this.f361l;
    }

    /* renamed from: h */
    public final InterfaceC0076m m320h() {
        return this.f356g;
    }

    /* renamed from: i */
    public final Runnable m321i() {
        return this.f360k;
    }

    /* renamed from: j */
    public final AtomicBoolean m322j() {
        return this.f358i;
    }

    /* renamed from: l */
    public final void m323l(C0080q.c cVar) {
        AbstractC19074t.m100208f(cVar, "<set-?>");
        this.f355f = cVar;
    }

    /* renamed from: m */
    public final void m324m(InterfaceC0076m interfaceC0076m) {
        this.f356g = interfaceC0076m;
    }
}
