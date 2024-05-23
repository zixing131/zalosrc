package je0;

import android.os.SystemClock;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import he0.InterfaceC20026a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23041d2;
import p185gc.AbstractC19383g;
import p213hl.C20086b;
import p348mi.AbstractC23306f;
import p371nv.C23952g;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: je0.c */
/* loaded from: classes4.dex */
public class C21232c extends AbstractC19383g {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f103509c;

    /* renamed from: a */
    private final C20086b f103510a;

    /* renamed from: b */
    private InterfaceC21231b f103511b;

    /* renamed from: je0.c$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f103512q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21232c mo12V4() {
            return c.f103513a.m110028a();
        }
    }

    /* renamed from: je0.c$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: je0.c$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f103513a = new c();

        /* renamed from: b */
        private static final C21232c f103514b;

        static {
            C20086b m120570C1 = AbstractC23306f.m120570C1();
            AbstractC19074t.m100207e(m120570C1, "provideStorageUsageRepository(...)");
            f103514b = new C21232c(m120570C1);
        }

        private c() {
        }

        /* renamed from: a */
        public final C21232c m110028a() {
            return f103514b;
        }
    }

    /* renamed from: je0.c$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        private final InterfaceC21231b f103515a;

        public d(InterfaceC21231b interfaceC21231b) {
            this.f103515a = interfaceC21231b;
        }

        /* renamed from: a */
        public final InterfaceC21231b m110029a() {
            return this.f103515a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f103512q);
        f103509c = m129210a;
    }

    public C21232c(C20086b c20086b) {
        AbstractC19074t.m100208f(c20086b, "storageUsageRepository");
        this.f103510a = c20086b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final InterfaceC21231b m110021c() {
        return this.f103511b;
    }

    /* renamed from: d */
    public final C20086b m110022d() {
        return this.f103510a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m110023e(InterfaceC20026a interfaceC20026a) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List m104433d = this.f103510a.m104433d();
        Iterator it = m104433d.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += AbstractC23041d2.m118223v((File) it.next());
        }
        this.f103510a.m104445p(m104433d);
        this.f103510a.m104447r(j11);
        C23952g.m125345j("Tool Storage", " loadCache takes: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
        if (interfaceC20026a != null) {
            interfaceC20026a.mo17105a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void mo110024f(InterfaceC21231b interfaceC21231b) {
    }

    /* renamed from: g */
    public final void m110025g() {
        this.f103511b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo12006b(d dVar) {
        AbstractC19074t.m100208f(dVar, "params");
        this.f103511b = dVar.m110029a();
    }
}
