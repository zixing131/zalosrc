package wm0;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.InterfaceC19068o;
import kotlin.coroutines.Continuation;

/* renamed from: wm0.l */
/* loaded from: classes.dex */
public abstract class AbstractC29104l extends AbstractC29096d implements InterfaceC19068o {

    /* renamed from: s */
    private final int f134927s;

    public AbstractC29104l(int i11, Continuation continuation) {
        super(continuation);
        this.f134927s = i11;
    }

    @Override // fn0.InterfaceC19068o
    /* renamed from: Lp */
    public int mo100147Lp() {
        return this.f134927s;
    }

    @Override // wm0.AbstractC29093a
    public String toString() {
        if (m145338m() == null) {
            String m100174g = AbstractC19061k0.m100174g(this);
            AbstractC19074t.m100207e(m100174g, "renderLambdaToString(...)");
            return m100174g;
        }
        return super.toString();
    }
}
