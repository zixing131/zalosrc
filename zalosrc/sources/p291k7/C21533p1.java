package p291k7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p152f7.InterfaceC18798a;

/* renamed from: k7.p1 */
/* loaded from: classes3.dex */
public final class C21533p1 {

    /* renamed from: a */
    protected final Set f104572a = new HashSet();

    /* renamed from: a */
    public final synchronized void m111188a(InterfaceC18798a interfaceC18798a) {
        this.f104572a.add(interfaceC18798a);
    }

    /* renamed from: b */
    public final synchronized void m111189b(Object obj) {
        Iterator it = this.f104572a.iterator();
        while (it.hasNext()) {
            ((InterfaceC18798a) it.next()).mo33367a(obj);
        }
    }
}
