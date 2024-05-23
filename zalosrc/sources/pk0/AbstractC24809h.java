package pk0;

import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;
import nk0.AbstractC23825g0;
import qk0.InterfaceC25307c;
import uk0.C27291e;

/* renamed from: pk0.h */
/* loaded from: classes7.dex */
public abstract class AbstractC24809h implements InterfaceC24808g {

    /* renamed from: p */
    private InterfaceC24808g f119076p;

    @Override // pk0.InterfaceC24808g
    public void invalidate() {
        InterfaceC24808g interfaceC24808g = this.f119076p;
        if (interfaceC24808g != null) {
            interfaceC24808g.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC19074t.m100208f(drawable, "who");
        InterfaceC24808g interfaceC24808g = this.f119076p;
        if (interfaceC24808g != null) {
            interfaceC24808g.invalidateDrawable(drawable);
        }
    }

    @Override // pk0.InterfaceC24808g
    /* renamed from: o */
    public void mo128878o(AbstractC23825g0 abstractC23825g0, InterfaceC25307c.a aVar) {
        AbstractC19074t.m100208f(abstractC23825g0, "node");
        AbstractC19074t.m100208f(aVar, "callback");
        InterfaceC24808g interfaceC24808g = this.f119076p;
        if (interfaceC24808g != null) {
            interfaceC24808g.mo128878o(abstractC23825g0, aVar);
        } else {
            InterfaceC25307c.a.b.m130964a(aVar, null, 1, null);
        }
    }

    @Override // pk0.InterfaceC24808g
    public void postInvalidate() {
        InterfaceC24808g interfaceC24808g = this.f119076p;
        if (interfaceC24808g != null) {
            interfaceC24808g.postInvalidate();
        }
    }

    @Override // pk0.InterfaceC24808g
    public void requestLayout() {
        InterfaceC24808g interfaceC24808g = this.f119076p;
        if (interfaceC24808g != null) {
            interfaceC24808g.requestLayout();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        AbstractC19074t.m100208f(drawable, "who");
        AbstractC19074t.m100208f(runnable, "what");
        InterfaceC24808g interfaceC24808g = this.f119076p;
        if (interfaceC24808g != null) {
            interfaceC24808g.scheduleDrawable(drawable, runnable, j11);
        }
    }

    @Override // pk0.InterfaceC24808g
    /* renamed from: t */
    public boolean mo128879t(C27291e c27291e) {
        AbstractC19074t.m100208f(c27291e, "interaction");
        InterfaceC24808g interfaceC24808g = this.f119076p;
        if (interfaceC24808g != null) {
            return interfaceC24808g.mo128879t(c27291e);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC19074t.m100208f(drawable, "who");
        AbstractC19074t.m100208f(runnable, "what");
        InterfaceC24808g interfaceC24808g = this.f119076p;
        if (interfaceC24808g != null) {
            interfaceC24808g.unscheduleDrawable(drawable, runnable);
        }
    }
}
