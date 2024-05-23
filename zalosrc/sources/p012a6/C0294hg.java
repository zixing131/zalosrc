package p012a6;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a6.hg */
/* loaded from: classes2.dex */
public final class C0294hg implements InterfaceC0237eg {

    /* renamed from: a */
    final List f1473a;

    public C0294hg(Context context, AbstractC0275gg abstractC0275gg) {
        ArrayList arrayList = new ArrayList();
        this.f1473a = arrayList;
        if (abstractC0275gg.mo652c()) {
            arrayList.add(new C0577wg(context, abstractC0275gg));
        }
    }

    @Override // p012a6.InterfaceC0237eg
    /* renamed from: a */
    public final void mo693a(InterfaceC0218dg interfaceC0218dg) {
        Iterator it = this.f1473a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0237eg) it.next()).mo693a(interfaceC0218dg);
        }
    }
}
