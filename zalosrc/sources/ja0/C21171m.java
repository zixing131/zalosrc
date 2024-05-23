package ja0;

import android.content.Context;
import android.view.ViewGroup;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import p354n3.C23528a;
import p612wk.AbstractC29069a;
import q80.C25180s;

/* renamed from: ja0.m */
/* loaded from: classes6.dex */
public class C21171m extends AbstractC20484a implements InterfaceC18319c {

    /* renamed from: J */
    private final InterfaceC18319c f103292J;

    /* renamed from: K */
    private AbstractC29069a.c f103293K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21171m(ViewGroup viewGroup, C23528a c23528a, InterfaceC18319c interfaceC18319c) {
        super(viewGroup, new C25180s(r2, c23528a, null, 4, null));
        AbstractC19074t.m100208f(viewGroup, "parent");
        AbstractC19074t.m100208f(c23528a, "aQ");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f103292J = interfaceC18319c;
        ((C25180s) super.m106522i0()).m130339r1(this);
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m109713k0(C21171m c21171m, AbstractC29069a.c cVar, boolean z11, Object obj, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                obj = null;
            }
            c21171m.m109714j0(cVar, z11, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* renamed from: j0 */
    public final void m109714j0(AbstractC29069a.c cVar, boolean z11, Object obj) {
        AbstractC19074t.m100208f(cVar, "data");
        try {
            this.f103293K = cVar;
            if (AbstractC19074t.m100204b(obj, "PAYLOAD_SCROLL_STATE_CHANGED")) {
                ((C25180s) m106522i0()).m130336o1(cVar.m145172b(), z11);
            } else {
                ((C25180s) m106522i0()).m130337p1(cVar.m145172b(), z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        InterfaceC18319c interfaceC18319c = this.f103292J;
        if (interfaceC18319c != null) {
            return (C18316b) interfaceC18319c.mo205i9(c18316b);
        }
        return null;
    }
}
