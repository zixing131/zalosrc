package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.internal.AbstractC4080b;
import com.google.android.gms.common.api.internal.C4096g0;
import com.google.android.gms.common.api.internal.C4103i1;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p257j6.AbstractC20934d;
import p257j6.C20931a;
import p665y0.C30239a;
import p704z4.C31222d;
import p704z4.C31237k0;
import p704z4.InterfaceC31220c;
import p704z4.InterfaceC31228g;
import p704z4.InterfaceC31232i;

/* renamed from: com.google.android.gms.common.api.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4073c {

    /* renamed from: a */
    private static final Set f16197a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.c$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private Account f16198a;

        /* renamed from: d */
        private int f16201d;

        /* renamed from: e */
        private View f16202e;

        /* renamed from: f */
        private String f16203f;

        /* renamed from: g */
        private String f16204g;

        /* renamed from: i */
        private final Context f16206i;

        /* renamed from: k */
        private C31222d f16208k;

        /* renamed from: m */
        private c f16210m;

        /* renamed from: n */
        private Looper f16211n;

        /* renamed from: b */
        private final Set f16199b = new HashSet();

        /* renamed from: c */
        private final Set f16200c = new HashSet();

        /* renamed from: h */
        private final Map f16205h = new C30239a();

        /* renamed from: j */
        private final Map f16207j = new C30239a();

        /* renamed from: l */
        private int f16209l = -1;

        /* renamed from: o */
        private C4070a f16212o = C4070a.m19196p();

        /* renamed from: p */
        private C4071a.a f16213p = AbstractC20934d.f102815c;

        /* renamed from: q */
        private final ArrayList f16214q = new ArrayList();

        /* renamed from: r */
        private final ArrayList f16215r = new ArrayList();

        public a(Context context) {
            this.f16206i = context;
            this.f16211n = context.getMainLooper();
            this.f16203f = context.getPackageName();
            this.f16204g = context.getClass().getName();
        }

        /* renamed from: a */
        public a m19267a(C4071a c4071a) {
            AbstractC4205o.m19723l(c4071a, "Api must not be null");
            this.f16207j.put(c4071a, null);
            List mo19231a = ((C4071a.e) AbstractC4205o.m19723l(c4071a.m19228c(), "Base client builder must not be null")).mo19231a(null);
            this.f16200c.addAll(mo19231a);
            this.f16199b.addAll(mo19231a);
            return this;
        }

        /* renamed from: b */
        public a m19268b(b bVar) {
            AbstractC4205o.m19723l(bVar, "Listener must not be null");
            this.f16214q.add(bVar);
            return this;
        }

        /* renamed from: c */
        public a m19269c(c cVar) {
            AbstractC4205o.m19723l(cVar, "Listener must not be null");
            this.f16215r.add(cVar);
            return this;
        }

        /* renamed from: d */
        public AbstractC4073c m19270d() {
            boolean z11;
            boolean z12;
            AbstractC4205o.m19713b(!this.f16207j.isEmpty(), "must call addApi() to add at least one API");
            C4175e m19271e = m19271e();
            Map m19657k = m19271e.m19657k();
            C30239a c30239a = new C30239a();
            C30239a c30239a2 = new C30239a();
            ArrayList arrayList = new ArrayList();
            C4071a c4071a = null;
            boolean z13 = false;
            for (C4071a c4071a2 : this.f16207j.keySet()) {
                Object obj = this.f16207j.get(c4071a2);
                if (m19657k.get(c4071a2) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c30239a.put(c4071a2, Boolean.valueOf(z12));
                C31237k0 c31237k0 = new C31237k0(c4071a2, z12);
                arrayList.add(c31237k0);
                C4071a.a aVar = (C4071a.a) AbstractC4205o.m19722k(c4071a2.m19226a());
                C4071a.f mo19230c = aVar.mo19230c(this.f16206i, this.f16211n, m19271e, obj, c31237k0, c31237k0);
                c30239a2.put(c4071a2.m19227b(), mo19230c);
                if (aVar.m19232b() == 1) {
                    if (obj != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (mo19230c.providesSignIn()) {
                    if (c4071a == null) {
                        c4071a = c4071a2;
                    } else {
                        throw new IllegalStateException(c4071a2.m19229d() + " cannot be used with " + c4071a.m19229d());
                    }
                }
            }
            if (c4071a != null) {
                if (!z13) {
                    if (this.f16198a == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC4205o.m19728q(z11, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", c4071a.m19229d());
                    AbstractC4205o.m19728q(this.f16199b.equals(this.f16200c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c4071a.m19229d());
                } else {
                    throw new IllegalStateException("With using " + c4071a.m19229d() + ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                }
            }
            C4096g0 c4096g0 = new C4096g0(this.f16206i, new ReentrantLock(), this.f16211n, m19271e, this.f16212o, this.f16213p, c30239a, this.f16214q, this.f16215r, c30239a2, this.f16209l, C4096g0.m19417r(c30239a2.values(), true), arrayList);
            synchronized (AbstractC4073c.f16197a) {
                AbstractC4073c.f16197a.add(c4096g0);
            }
            if (this.f16209l >= 0) {
                C4103i1.m19446t(this.f16208k).m19450u(this.f16209l, c4096g0, this.f16210m);
            }
            return c4096g0;
        }

        /* renamed from: e */
        public final C4175e m19271e() {
            C20931a c20931a = C20931a.f102803y;
            Map map = this.f16207j;
            C4071a c4071a = AbstractC20934d.f102819g;
            if (map.containsKey(c4071a)) {
                c20931a = (C20931a) this.f16207j.get(c4071a);
            }
            return new C4175e(this.f16198a, this.f16199b, this.f16205h, this.f16201d, this.f16202e, this.f16203f, this.f16204g, c20931a, false);
        }
    }

    /* renamed from: com.google.android.gms.common.api.c$b */
    /* loaded from: classes2.dex */
    public interface b extends InterfaceC31220c {
    }

    /* renamed from: com.google.android.gms.common.api.c$c */
    /* loaded from: classes2.dex */
    public interface c extends InterfaceC31228g {
    }

    /* renamed from: h */
    public static Set m19254h() {
        Set set = f16197a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: d */
    public abstract void mo19256d();

    /* renamed from: e */
    public abstract void mo19257e();

    /* renamed from: f */
    public abstract void mo19258f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: g */
    public abstract AbstractC4080b mo19259g(AbstractC4080b abstractC4080b);

    /* renamed from: i */
    public C4071a.f mo19260i(C4071a.c cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public abstract Context mo19261j();

    /* renamed from: k */
    public abstract Looper mo19262k();

    /* renamed from: l */
    public boolean mo19263l(InterfaceC31232i interfaceC31232i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: m */
    public void mo19264m() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public abstract void mo19265n(c cVar);

    /* renamed from: o */
    public abstract void mo19266o(c cVar);
}
