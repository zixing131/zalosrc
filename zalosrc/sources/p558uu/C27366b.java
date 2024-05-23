package p558uu;

import androidx.core.graphics.C1421e;
import androidx.core.view.C1580n1;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: uu.b */
/* loaded from: classes.dex */
public final class C27366b implements InterfaceC27365a, InterfaceC27370f {

    /* renamed from: p */
    private final InterfaceC18505l f128923p;

    /* renamed from: q */
    private C1421e f128924q;

    /* renamed from: r */
    private final List f128925r;

    public C27366b(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "onWindowInsetsChangedAction");
        this.f128923p = interfaceC18505l;
        C1421e c1421e = C1421e.f6229e;
        AbstractC19074t.m100207e(c1421e, Image.SCALE_TYPE_NONE);
        this.f128924q = c1421e;
        this.f128925r = new ArrayList();
    }

    @Override // p558uu.InterfaceC27365a
    /* renamed from: a */
    public void mo140205a(InterfaceC27367c interfaceC27367c) {
        AbstractC19074t.m100208f(interfaceC27367c, "watcher");
        this.f128925r.remove(interfaceC27367c);
    }

    @Override // p558uu.InterfaceC27365a
    /* renamed from: b */
    public void mo140206b(InterfaceC27367c interfaceC27367c) {
        AbstractC19074t.m100208f(interfaceC27367c, "watcher");
        if (!this.f128925r.contains(interfaceC27367c)) {
            this.f128925r.add(interfaceC27367c);
        }
    }

    @Override // p558uu.InterfaceC27365a
    /* renamed from: c */
    public C1421e mo140207c() {
        return this.f128924q;
    }

    @Override // p558uu.InterfaceC27370f
    /* renamed from: d */
    public void mo89428d(C1580n1 c1580n1) {
        AbstractC19074t.m100208f(c1580n1, "insets");
        C1421e c1421e = (C1421e) this.f128923p.mo205i9(c1580n1);
        if (!AbstractC19074t.m100204b(c1421e, mo140207c())) {
            m140208e(c1421e);
        }
    }

    /* renamed from: e */
    public final void m140208e(C1421e c1421e) {
        AbstractC19074t.m100208f(c1421e, "insets");
        m140209f(c1421e);
        Iterator it = this.f128925r.iterator();
        while (it.hasNext()) {
            ((InterfaceC27367c) it.next()).mo87294b(c1421e);
        }
    }

    /* renamed from: f */
    public void m140209f(C1421e c1421e) {
        AbstractC19074t.m100208f(c1421e, "<set-?>");
        this.f128924q = c1421e;
    }
}
