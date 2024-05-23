package p705z5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: z5.sb */
/* loaded from: classes2.dex */
public final class C31559sb implements InterfaceC31517pb {

    /* renamed from: a */
    final List f145124a;

    public C31559sb(Context context, AbstractC31545rb abstractC31545rb) {
        ArrayList arrayList = new ArrayList();
        this.f145124a = arrayList;
        if (abstractC31545rb.mo152325c()) {
            arrayList.add(new C31336cc(context, abstractC31545rb));
        }
    }

    @Override // p705z5.InterfaceC31517pb
    /* renamed from: a */
    public final void mo152219a(InterfaceC31503ob interfaceC31503ob) {
        Iterator it = this.f145124a.iterator();
        while (it.hasNext()) {
            ((InterfaceC31517pb) it.next()).mo152219a(interfaceC31503ob);
        }
    }
}
