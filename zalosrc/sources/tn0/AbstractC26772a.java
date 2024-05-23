package tn0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC21885c;

/* renamed from: tn0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC26772a implements KSerializer {
    public /* synthetic */ AbstractC26772a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: i */
    public static /* synthetic */ void m137790i(AbstractC26772a abstractC26772a, InterfaceC21885c interfaceC21885c, int i11, Object obj, boolean z11, int i12, Object obj2) {
        if (obj2 == null) {
            if ((i12 & 8) != 0) {
                z11 = true;
            }
            abstractC26772a.mo114054h(interfaceC21885c, i11, obj, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    /* renamed from: j */
    private final int m137791j(InterfaceC21885c interfaceC21885c, Object obj) {
        int mo114013m = interfaceC21885c.mo114013m(getDescriptor());
        mo137794c(obj, mo114013m);
        return mo114013m;
    }

    /* renamed from: a */
    protected abstract Object mo137792a();

    /* renamed from: b */
    protected abstract int mo137793b(Object obj);

    /* renamed from: c */
    protected abstract void mo137794c(Object obj, int i11);

    /* renamed from: d */
    public abstract Iterator mo137795d(Object obj);

    @Override // qn0.InterfaceC25386a
    public Object deserialize(Decoder decoder) {
        AbstractC19074t.m100208f(decoder, "decoder");
        return m137796f(decoder, null);
    }

    /* renamed from: e */
    public abstract int mo114053e(Object obj);

    /* renamed from: f */
    public final Object m137796f(Decoder decoder, Object obj) {
        Object mo137792a;
        AbstractC19074t.m100208f(decoder, "decoder");
        if (obj == null || (mo137792a = mo114055k(obj)) == null) {
            mo137792a = mo137792a();
        }
        int mo137793b = mo137793b(mo137792a);
        InterfaceC21885c mo113968b = decoder.mo113968b(getDescriptor());
        if (!mo113968b.mo114015q()) {
            while (true) {
                int mo114037p = mo113968b.mo114037p(getDescriptor());
                if (mo114037p == -1) {
                    break;
                }
                m137790i(this, mo113968b, mo137793b + mo114037p, mo137792a, false, 8, null);
            }
        } else {
            mo137797g(mo113968b, mo137792a, mo137793b, m137791j(mo113968b, mo137792a));
        }
        mo113968b.mo114009c(getDescriptor());
        return mo137798l(mo137792a);
    }

    /* renamed from: g */
    protected abstract void mo137797g(InterfaceC21885c interfaceC21885c, Object obj, int i11, int i12);

    /* renamed from: h */
    protected abstract void mo114054h(InterfaceC21885c interfaceC21885c, int i11, Object obj, boolean z11);

    /* renamed from: k */
    public abstract Object mo114055k(Object obj);

    /* renamed from: l */
    protected abstract Object mo137798l(Object obj);

    private AbstractC26772a() {
    }
}
