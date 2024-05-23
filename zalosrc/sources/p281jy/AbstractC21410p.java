package p281jy;

import java.util.List;
import my.AbstractC23482e;
import qm0.AbstractC25358n;
import uz.C27385a;

/* renamed from: jy.p */
/* loaded from: classes4.dex */
public abstract class AbstractC21410p extends AbstractC21395a {

    /* renamed from: b */
    private final InterfaceC21399e f104333b;

    /* renamed from: c */
    private final InterfaceC21399e f104334c;

    /* renamed from: d */
    private final InterfaceC21399e f104335d;

    /* renamed from: e */
    private a f104336e;

    /* renamed from: f */
    private boolean f104337f;

    /* renamed from: g */
    private boolean f104338g;

    /* renamed from: jy.p$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo49544a(C27385a c27385a);

        /* renamed from: b */
        void mo49545b(C27385a.a aVar);

        /* renamed from: c */
        void mo49546c(C27385a c27385a);

        /* renamed from: d */
        void mo49547d(AbstractC23482e abstractC23482e, C27385a.a aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC21410p(InterfaceC21399e interfaceC21399e, InterfaceC21399e interfaceC21399e2, InterfaceC21399e interfaceC21399e3) {
        super((InterfaceC21399e[]) r0.toArray(new InterfaceC21399e[0]));
        List m131353A;
        m131353A = AbstractC25358n.m131353A(new InterfaceC21399e[]{interfaceC21399e, interfaceC21399e2, interfaceC21399e3});
        this.f104333b = interfaceC21399e;
        this.f104334c = interfaceC21399e2;
        this.f104335d = interfaceC21399e3;
    }

    @Override // p281jy.AbstractC21395a, p281jy.InterfaceC21399e
    /* renamed from: R1 */
    public void mo110860R1() {
        super.mo110860R1();
        this.f104336e = null;
    }

    /* renamed from: b */
    public final InterfaceC21399e m110882b() {
        return this.f104333b;
    }

    /* renamed from: c */
    public final InterfaceC21399e m110883c() {
        return this.f104334c;
    }

    /* renamed from: d */
    public final a m110884d() {
        return this.f104336e;
    }

    /* renamed from: e */
    public final InterfaceC21399e m110885e() {
        return this.f104335d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean m110886f() {
        return this.f104338g;
    }

    /* renamed from: g */
    public final void m110887g() {
        this.f104338g = false;
    }

    /* renamed from: h */
    public final void m110888h(a aVar) {
        this.f104336e = aVar;
    }

    /* renamed from: i */
    public final void m110889i(boolean z11) {
        this.f104337f = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final void m110890j(boolean z11) {
        this.f104338g = z11;
    }

    /* renamed from: k */
    public abstract void mo110891k(C27385a c27385a, boolean z11);
}
