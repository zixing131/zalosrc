package qe0;

import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: qe0.a */
/* loaded from: classes4.dex */
final class C25245a extends BottomSheet.AbstractC16910a {

    /* renamed from: a */
    private final List f121106a = new ArrayList();

    @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
    /* renamed from: a */
    public void mo45955a() {
        Iterator it = this.f121106a.iterator();
        while (it.hasNext()) {
            ((BottomSheet.AbstractC16910a) it.next()).mo45955a();
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet.AbstractC16910a
    /* renamed from: b */
    public void mo45956b() {
        Iterator it = this.f121106a.iterator();
        while (it.hasNext()) {
            ((BottomSheet.AbstractC16910a) it.next()).mo45956b();
        }
    }

    /* renamed from: c */
    public final void m130671c(BottomSheet.AbstractC16910a abstractC16910a) {
        AbstractC19074t.m100208f(abstractC16910a, "listener");
        if (!this.f121106a.contains(abstractC16910a)) {
            this.f121106a.add(abstractC16910a);
        }
    }

    /* renamed from: d */
    public final void m130672d(BottomSheet.AbstractC16910a abstractC16910a) {
        AbstractC19074t.m100208f(abstractC16910a, "listener");
        this.f121106a.remove(abstractC16910a);
    }
}
