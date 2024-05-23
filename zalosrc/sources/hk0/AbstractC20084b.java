package hk0;

import com.zing.zalo.zinstant.InterfaceC17139d;
import ik0.AbstractC20595r;
import ik0.AbstractC20597t;
import ik0.AbstractC20601x;
import ik0.C20588k;
import ik0.C20599v;
import ik0.InterfaceC20578a0;
import lk0.C22504b;
import lk0.C22505c;
import lk0.InterfaceC22508f;
import ll0.C22514b;
import nk0.C23855s0;

/* renamed from: hk0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC20084b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hk0.b$a */
    /* loaded from: classes7.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ int f98799p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC20083a f98800q;

        /* renamed from: r */
        final /* synthetic */ int f98801r;

        /* renamed from: s */
        final /* synthetic */ int f98802s;

        /* renamed from: t */
        final /* synthetic */ String f98803t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC17139d f98804u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC22508f f98805v;

        /* renamed from: hk0.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        class C32832a extends C20588k {
            C32832a() {
            }

            @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
            /* renamed from: b */
            public void mo61858b(AbstractC20601x abstractC20601x, Exception exc) {
                a.this.f98800q.mo15332c(exc);
            }

            @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
            /* renamed from: c */
            public void mo61859c(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
                a.this.f98800q.mo15331a(C23855s0.m124606T(interfaceC20578a0));
            }
        }

        a(int i11, InterfaceC20083a interfaceC20083a, int i12, int i13, String str, InterfaceC17139d interfaceC17139d, InterfaceC22508f interfaceC22508f) {
            this.f98799p = i11;
            this.f98800q = interfaceC20083a;
            this.f98801r = i12;
            this.f98802s = i13;
            this.f98803t = str;
            this.f98804u = interfaceC17139d;
            this.f98805v = interfaceC22508f;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC20601x mo107103c;
            try {
                int i11 = this.f98799p;
                if (i11 <= 0) {
                    this.f98800q.mo15332c(new Exception("TargetWidth is invalid"));
                    return;
                }
                AbstractC20601x.b mo107126a = AbstractC20601x.b.m107228a(i11, this.f98801r).mo107127b(this.f98802s).mo107129d(this.f98803t).mo107128c(this.f98804u).mo107126a();
                InterfaceC22508f interfaceC22508f = this.f98805v;
                if (interfaceC22508f instanceof C22505c) {
                    mo107103c = AbstractC20601x.m107225c(AbstractC20595r.m107194b((C22505c) interfaceC22508f).mo107049a()).mo107107g(this.f98805v.getFeatureType()).mo107112l(mo107126a).mo107103c();
                } else if (interfaceC22508f instanceof C22504b) {
                    mo107103c = AbstractC20601x.m107226d(AbstractC20597t.m107198a((C22504b) interfaceC22508f).mo107081a()).mo107107g(this.f98805v.getFeatureType()).mo107112l(mo107126a).mo107103c();
                } else {
                    this.f98800q.mo15332c(new Exception("ZinstantDataModel is invalid"));
                    return;
                }
                if (mo107103c == null) {
                    this.f98800q.mo15332c(new Exception("ZinstantDataModel is invalid"));
                } else {
                    C20599v.m107204a().m107219m(mo107103c, new C32832a());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f98800q.mo15332c(e11);
            }
        }
    }

    /* renamed from: a */
    public static void m104427a(InterfaceC22508f interfaceC22508f, int i11, int i12, String str, int i13, InterfaceC17139d interfaceC17139d, InterfaceC20083a interfaceC20083a) {
        C22514b.m116415b().m116416a(new a(i11, interfaceC20083a, i13, i12, str, interfaceC17139d, interfaceC22508f));
    }

    /* renamed from: b */
    public static void m104428b(InterfaceC22508f interfaceC22508f, int i11, String str, int i12, InterfaceC17139d interfaceC17139d, InterfaceC20083a interfaceC20083a) {
        m104427a(interfaceC22508f, i11, -1, str, i12, interfaceC17139d, interfaceC20083a);
    }
}
