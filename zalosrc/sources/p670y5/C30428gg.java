package p670y5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: y5.gg */
/* loaded from: classes2.dex */
public final class C30428gg implements InterfaceC30371dg {

    /* renamed from: a */
    final List f141205a;

    public C30428gg(Context context, AbstractC30409fg abstractC30409fg) {
        ArrayList arrayList = new ArrayList();
        this.f141205a = arrayList;
        if (abstractC30409fg.mo149460c()) {
            arrayList.add(new C30713vg(context, abstractC30409fg));
        }
    }

    @Override // p670y5.InterfaceC30371dg
    /* renamed from: a */
    public final void mo149479a(InterfaceC30352cg interfaceC30352cg) {
        Iterator it = this.f141205a.iterator();
        while (it.hasNext()) {
            ((InterfaceC30371dg) it.next()).mo149479a(interfaceC30352cg);
        }
    }
}
