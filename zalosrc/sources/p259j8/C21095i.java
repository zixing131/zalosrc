package p259j8;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p231i7.AbstractC20357a;
import p232i8.AbstractC20395h;
import p232i8.C20397i;
import p259j8.C21095i;
import p359n8.C23620g;

/* renamed from: j8.i */
/* loaded from: classes.dex */
public class C21095i {

    /* renamed from: a */
    private final C21090d f103120a;

    /* renamed from: b */
    private final C20397i f103121b;

    /* renamed from: c */
    private final String f103122c;

    /* renamed from: d */
    private final a f103123d = new a(false);

    /* renamed from: e */
    private final a f103124e = new a(true);

    /* renamed from: f */
    private final AtomicMarkableReference f103125f = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j8.i$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        final AtomicMarkableReference f103126a;

        /* renamed from: b */
        private final AtomicReference f103127b = new AtomicReference(null);

        /* renamed from: c */
        private final boolean f103128c;

        public a(boolean z11) {
            int i11;
            this.f103128c = z11;
            if (z11) {
                i11 = 8192;
            } else {
                i11 = 1024;
            }
            this.f103126a = new AtomicMarkableReference(new C21088b(64, i11), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Void m109620c() {
            this.f103127b.set(null);
            m109622e();
            return null;
        }

        /* renamed from: d */
        private void m109621d() {
            Callable callable = new Callable() { // from class: j8.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m109620c;
                    m109620c = C21095i.a.this.m109620c();
                    return m109620c;
                }
            };
            if (AbstractC20357a.m106108a(this.f103127b, null, callable)) {
                C21095i.this.f103121b.m106240h(callable);
            }
        }

        /* renamed from: e */
        private void m109622e() {
            Map map;
            synchronized (this) {
                try {
                    if (this.f103126a.isMarked()) {
                        map = ((C21088b) this.f103126a.getReference()).m109553a();
                        AtomicMarkableReference atomicMarkableReference = this.f103126a;
                        atomicMarkableReference.set((C21088b) atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (map != null) {
                C21095i.this.f103120a.m109574l(C21095i.this.f103122c, map, this.f103128c);
            }
        }

        /* renamed from: b */
        public Map m109623b() {
            return ((C21088b) this.f103126a.getReference()).m109553a();
        }

        /* renamed from: f */
        public boolean m109624f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((C21088b) this.f103126a.getReference()).m109554d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f103126a;
                    atomicMarkableReference.set((C21088b) atomicMarkableReference.getReference(), true);
                    m109621d();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C21095i(String str, C23620g c23620g, C20397i c20397i) {
        this.f103122c = str;
        this.f103120a = new C21090d(c23620g);
        this.f103121b = c20397i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m109610h() {
        m109613k();
        return null;
    }

    /* renamed from: i */
    public static C21095i m109611i(String str, C23620g c23620g, C20397i c20397i) {
        C21090d c21090d = new C21090d(c23620g);
        C21095i c21095i = new C21095i(str, c23620g, c20397i);
        ((C21088b) c21095i.f103123d.f103126a.getReference()).m109555e(c21090d.m109572g(str, false));
        ((C21088b) c21095i.f103124e.f103126a.getReference()).m109555e(c21090d.m109572g(str, true));
        c21095i.f103125f.set(c21090d.m109573h(str), false);
        return c21095i;
    }

    /* renamed from: j */
    public static String m109612j(String str, C23620g c23620g) {
        return new C21090d(c23620g).m109573h(str);
    }

    /* renamed from: k */
    private void m109613k() {
        boolean z11;
        String str;
        synchronized (this.f103125f) {
            try {
                z11 = false;
                if (this.f103125f.isMarked()) {
                    str = m109616g();
                    this.f103125f.set(str, false);
                    z11 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            this.f103120a.m109575m(this.f103122c, str);
        }
    }

    /* renamed from: e */
    public Map m109614e() {
        return this.f103123d.m109623b();
    }

    /* renamed from: f */
    public Map m109615f() {
        return this.f103124e.m109623b();
    }

    /* renamed from: g */
    public String m109616g() {
        return (String) this.f103125f.getReference();
    }

    /* renamed from: l */
    public boolean m109617l(String str, String str2) {
        return this.f103123d.m109624f(str, str2);
    }

    /* renamed from: m */
    public void m109618m(String str) {
        String m109552c = C21088b.m109552c(str, 1024);
        synchronized (this.f103125f) {
            try {
                if (AbstractC20395h.m106202B(m109552c, (String) this.f103125f.getReference())) {
                    return;
                }
                this.f103125f.set(m109552c, true);
                this.f103121b.m106240h(new Callable() { // from class: j8.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object m109610h;
                        m109610h = C21095i.this.m109610h();
                        return m109610h;
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
