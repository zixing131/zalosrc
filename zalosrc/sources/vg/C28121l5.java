package vg;

import java.util.List;
import qm0.AbstractC25332a0;
import qm0.C25348i;

/* renamed from: vg.l5 */
/* loaded from: classes.dex */
public final class C28121l5 {

    /* renamed from: a */
    private final int f131129a;

    /* renamed from: b */
    private final C25348i f131130b = new C25348i();

    public C28121l5(int i11) {
        this.f131129a = i11;
    }

    /* renamed from: a */
    public final List m141606a() {
        List m131185M0;
        m131185M0 = AbstractC25332a0.m131185M0(this.f131130b);
        return m131185M0;
    }

    /* renamed from: b */
    public final void m141607b(Object obj) {
        if (this.f131130b.size() >= this.f131129a) {
            this.f131130b.removeFirst();
        }
        this.f131130b.addLast(obj);
    }
}
