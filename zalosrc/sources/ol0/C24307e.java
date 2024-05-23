package ol0;

import ag0.InterfaceC0806b1;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: ol0.e */
/* loaded from: classes7.dex */
public final class C24307e implements InterfaceC24305c {

    /* renamed from: a */
    private final InterfaceC0806b1 f117382a;

    /* renamed from: b */
    private final Queue f117383b = new LinkedList();

    /* renamed from: c */
    private boolean f117384c = true;

    /* renamed from: d */
    private final Object f117385d = new Object();

    public C24307e(InterfaceC0806b1 interfaceC0806b1) {
        this.f117382a = interfaceC0806b1;
    }

    /* renamed from: d */
    private void m126935d() {
        this.f117382a.mo2040a(new Runnable() { // from class: ol0.d
            @Override // java.lang.Runnable
            public final void run() {
                C24307e.this.m126939h();
            }
        });
    }

    /* renamed from: e */
    private Runnable m126936e() {
        Runnable runnable;
        synchronized (this.f117383b) {
            runnable = (Runnable) this.f117383b.poll();
        }
        return runnable;
    }

    /* renamed from: f */
    private boolean m126937f() {
        boolean isEmpty;
        synchronized (this.f117383b) {
            isEmpty = this.f117383b.isEmpty();
        }
        return isEmpty;
    }

    /* renamed from: g */
    private boolean m126938g() {
        boolean z11;
        synchronized (this.f117385d) {
            z11 = this.f117384c;
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m126939h() {
        Runnable m126936e = m126936e();
        if (m126936e != null) {
            m126936e.run();
        }
        boolean m126937f = m126937f();
        boolean z11 = !m126937f;
        m126942k(m126937f);
        if (z11) {
            m126935d();
        }
    }

    /* renamed from: i */
    private boolean m126940i(Runnable runnable) {
        boolean offer;
        synchronized (this.f117383b) {
            offer = this.f117383b.offer(runnable);
        }
        return offer;
    }

    /* renamed from: j */
    private boolean m126941j(Runnable runnable) {
        boolean remove;
        synchronized (this.f117383b) {
            remove = this.f117383b.remove(runnable);
        }
        return remove;
    }

    /* renamed from: k */
    private void m126942k(boolean z11) {
        synchronized (this.f117385d) {
            this.f117384c = z11;
        }
    }

    @Override // ol0.InterfaceC24305c
    /* renamed from: a */
    public boolean mo126932a(Runnable runnable) {
        return m126941j(runnable);
    }

    @Override // ol0.InterfaceC24305c
    /* renamed from: b */
    public void mo126933b(Runnable runnable) {
        if (m126940i(runnable) && m126938g()) {
            m126942k(false);
            m126935d();
        }
    }
}
