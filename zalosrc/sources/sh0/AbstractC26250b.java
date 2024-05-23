package sh0;

import ag0.AbstractC0837p0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import p098dc.InterfaceC17872f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: sh0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC26250b implements InterfaceC17872f {

    /* renamed from: a */
    private boolean f124661a;

    /* renamed from: b */
    private final InterfaceC24854k f124662b;

    /* renamed from: sh0.b$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo1281a();
    }

    /* renamed from: sh0.b$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f124663q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    public AbstractC26250b() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f124663q);
        this.f124662b = m129210a;
    }

    /* renamed from: g */
    private final void m134976g(a aVar) {
        try {
            List m134978i = m134978i();
            if (!(m134978i instanceof Collection) || !m134978i.isEmpty()) {
                Iterator it = m134978i.iterator();
                while (it.hasNext()) {
                    if (AbstractC19074t.m100204b(((WeakReference) it.next()).get(), aVar)) {
                        return;
                    }
                }
            }
            m134978i().add(new WeakReference(aVar));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h */
    private final void m134977h() {
        try {
            Iterator it = m134978i().iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.mo1281a();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i */
    private final List m134978i() {
        return (List) this.f124662b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m134979l(AbstractC26250b abstractC26250b) {
        AbstractC19074t.m100208f(abstractC26250b, "this$0");
        if (abstractC26250b.mo88375b() > 0) {
            int i11 = 0;
            while (i11 < abstractC26250b.mo88375b() - 1) {
                i11++;
                abstractC26250b.mo88378e(i11 % abstractC26250b.mo88375b(), true);
            }
        }
        abstractC26250b.f124661a = false;
        abstractC26250b.m134977h();
    }

    /* renamed from: j */
    public abstract boolean mo88379j();

    /* renamed from: k */
    public final void m134980k(a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        try {
            m134976g(aVar);
            if (this.f124661a) {
                return;
            }
            this.f124661a = true;
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: sh0.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26250b.m134979l(AbstractC26250b.this);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
