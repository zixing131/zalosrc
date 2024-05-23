package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.graphics.AbstractC1425i;
import androidx.core.provider.AbstractC1460g;
import androidx.core.util.InterfaceC1479a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p665y0.C30243e;
import p665y0.C30245g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.f */
/* loaded from: classes2.dex */
public abstract class AbstractC1459f {

    /* renamed from: a */
    static final C30243e f6301a = new C30243e(16);

    /* renamed from: b */
    private static final ExecutorService f6302b = AbstractC1461h.m7414a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f6303c = new Object();

    /* renamed from: d */
    static final C30245g f6304d = new C30245g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$a */
    /* loaded from: classes2.dex */
    public class a implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f6305a;

        /* renamed from: b */
        final /* synthetic */ Context f6306b;

        /* renamed from: c */
        final /* synthetic */ C1458e f6307c;

        /* renamed from: d */
        final /* synthetic */ int f6308d;

        a(String str, Context context, C1458e c1458e, int i11) {
            this.f6305a = str;
            this.f6306b = context;
            this.f6307c = c1458e;
            this.f6308d = i11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return AbstractC1459f.m7394c(this.f6305a, this.f6306b, this.f6307c, this.f6308d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$b */
    /* loaded from: classes2.dex */
    public class b implements InterfaceC1479a {

        /* renamed from: a */
        final /* synthetic */ C1454a f6309a;

        b(C1454a c1454a) {
            this.f6309a = c1454a;
        }

        @Override // androidx.core.util.InterfaceC1479a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f6309a.m7374b(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$c */
    /* loaded from: classes2.dex */
    public class c implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f6310a;

        /* renamed from: b */
        final /* synthetic */ Context f6311b;

        /* renamed from: c */
        final /* synthetic */ C1458e f6312c;

        /* renamed from: d */
        final /* synthetic */ int f6313d;

        c(String str, Context context, C1458e c1458e, int i11) {
            this.f6310a = str;
            this.f6311b = context;
            this.f6312c = c1458e;
            this.f6313d = i11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return AbstractC1459f.m7394c(this.f6310a, this.f6311b, this.f6312c, this.f6313d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$d */
    /* loaded from: classes2.dex */
    public class d implements InterfaceC1479a {

        /* renamed from: a */
        final /* synthetic */ String f6314a;

        d(String str) {
            this.f6314a = str;
        }

        @Override // androidx.core.util.InterfaceC1479a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (AbstractC1459f.f6303c) {
                try {
                    C30245g c30245g = AbstractC1459f.f6304d;
                    ArrayList arrayList = (ArrayList) c30245g.get(this.f6314a);
                    if (arrayList == null) {
                        return;
                    }
                    c30245g.remove(this.f6314a);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((InterfaceC1479a) arrayList.get(i11)).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.f$e */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a */
        final Typeface f6315a;

        /* renamed from: b */
        final int f6316b;

        e(int i11) {
            this.f6315a = null;
            this.f6316b = i11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean m7401a() {
            return this.f6316b == 0;
        }

        e(Typeface typeface) {
            this.f6315a = typeface;
            this.f6316b = 0;
        }
    }

    /* renamed from: a */
    private static String m7392a(C1458e c1458e, int i11) {
        return c1458e.m7388d() + "-" + i11;
    }

    /* renamed from: b */
    private static int m7393b(AbstractC1460g.a aVar) {
        int i11 = 1;
        if (aVar.m7407c() != 0) {
            if (aVar.m7407c() != 1) {
                return -3;
            }
            return -2;
        }
        AbstractC1460g.b[] m7406b = aVar.m7406b();
        if (m7406b != null && m7406b.length != 0) {
            i11 = 0;
            for (AbstractC1460g.b bVar : m7406b) {
                int m7409b = bVar.m7409b();
                if (m7409b != 0) {
                    if (m7409b < 0) {
                        return -3;
                    }
                    return m7409b;
                }
            }
        }
        return i11;
    }

    /* renamed from: c */
    static e m7394c(String str, Context context, C1458e c1458e, int i11) {
        C30243e c30243e = f6301a;
        Typeface typeface = (Typeface) c30243e.m149139d(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            AbstractC1460g.a m7380e = AbstractC1457d.m7380e(context, c1458e, null);
            int m7393b = m7393b(m7380e);
            if (m7393b != 0) {
                return new e(m7393b);
            }
            Typeface m7256b = AbstractC1425i.m7256b(context, null, m7380e.m7406b(), i11);
            if (m7256b != null) {
                c30243e.m149140e(str, m7256b);
                return new e(m7256b);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Typeface m7395d(Context context, C1458e c1458e, int i11, Executor executor, C1454a c1454a) {
        String m7392a = m7392a(c1458e, i11);
        Typeface typeface = (Typeface) f6301a.m149139d(m7392a);
        if (typeface != null) {
            c1454a.m7374b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c1454a);
        synchronized (f6303c) {
            try {
                C30245g c30245g = f6304d;
                ArrayList arrayList = (ArrayList) c30245g.get(m7392a);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                c30245g.put(m7392a, arrayList2);
                c cVar = new c(m7392a, context, c1458e, i11);
                if (executor == null) {
                    executor = f6302b;
                }
                AbstractC1461h.m7415b(executor, cVar, new d(m7392a));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Typeface m7396e(Context context, C1458e c1458e, C1454a c1454a, int i11, int i12) {
        String m7392a = m7392a(c1458e, i11);
        Typeface typeface = (Typeface) f6301a.m149139d(m7392a);
        if (typeface != null) {
            c1454a.m7374b(new e(typeface));
            return typeface;
        }
        if (i12 == -1) {
            e m7394c = m7394c(m7392a, context, c1458e, i11);
            c1454a.m7374b(m7394c);
            return m7394c.f6315a;
        }
        try {
            e eVar = (e) AbstractC1461h.m7416c(f6302b, new a(m7392a, context, c1458e, i11), i12);
            c1454a.m7374b(eVar);
            return eVar.f6315a;
        } catch (InterruptedException unused) {
            c1454a.m7374b(new e(-3));
            return null;
        }
    }
}
