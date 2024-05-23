package p111du;

import androidx.core.util.C1486h;
import fn0.AbstractC19074t;

/* renamed from: du.b */
/* loaded from: classes.dex */
public abstract class AbstractC18070b extends C1486h {
    public AbstractC18070b(int i11) {
        super(i11);
    }

    @Override // androidx.core.util.C1486h, androidx.core.util.C1485g, androidx.core.util.InterfaceC1484f
    /* renamed from: b */
    public Object mo7484b() {
        Object mo7484b = super.mo7484b();
        if (mo7484b != null) {
            mo96100e(mo7484b);
        } else {
            mo7484b = null;
        }
        if (mo7484b == null) {
            return mo15431d();
        }
        return mo7484b;
    }

    /* renamed from: d */
    public abstract Object mo15431d();

    /* renamed from: e */
    public void mo96100e(Object obj) {
        AbstractC19074t.m100208f(obj, "element");
    }
}
