package rh0;

import fg0.ThreadFactoryC18928a;
import hm0.C20096c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p171fx.AbstractC19164e;
import p405ov.C24564f;
import p405ov.InterfaceC24562d;

/* renamed from: rh0.i */
/* loaded from: classes7.dex */
public class C25801i {

    /* renamed from: b */
    private static C25801i f123024b;

    /* renamed from: a */
    private final ExecutorService f123025a = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("ZamManager"));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh0.i$a */
    /* loaded from: classes7.dex */
    public class a implements InterfaceC24562d {

        /* renamed from: a */
        final /* synthetic */ AbstractC19164e.m f123026a;

        a(AbstractC19164e.m mVar) {
            this.f123026a = mVar;
        }

        @Override // p405ov.InterfaceC24562d
        /* renamed from: a */
        public void mo127943a(C20096c c20096c) {
            this.f123026a.mo100544b(c20096c.m104491c());
        }

        @Override // p405ov.InterfaceC24562d
        /* renamed from: b */
        public void mo127944b(Object obj) {
            this.f123026a.mo100543a();
        }
    }

    /* renamed from: d */
    public static C25801i m132957d() {
        if (f123024b == null) {
            f123024b = new C25801i();
        }
        return f123024b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m132958e(AbstractC19164e.m mVar) {
        C24564f.m127962r(new a(mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m132959f(String str, final AbstractC19164e.m mVar) {
        this.f123025a.execute(new Runnable() { // from class: rh0.h
            @Override // java.lang.Runnable
            public final void run() {
                C25801i.this.m132958e(mVar);
            }
        });
    }

    /* renamed from: c */
    public AbstractC19164e.l m132960c() {
        return new AbstractC19164e.l() { // from class: rh0.g
            @Override // p171fx.AbstractC19164e.l
            /* renamed from: a */
            public final void mo100545a(String str, AbstractC19164e.m mVar) {
                C25801i.this.m132959f(str, mVar);
            }
        };
    }
}
