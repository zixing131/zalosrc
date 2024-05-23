package p117e0;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: e0.a */
/* loaded from: classes.dex */
public final class C18155a {

    /* renamed from: a */
    private final Set f91817a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f91818b;

    /* renamed from: a */
    public void m96451a(InterfaceC18156b interfaceC18156b) {
        if (this.f91818b != null) {
            interfaceC18156b.mo4660a(this.f91818b);
        }
        this.f91817a.add(interfaceC18156b);
    }

    /* renamed from: b */
    public void m96452b() {
        this.f91818b = null;
    }

    /* renamed from: c */
    public void m96453c(Context context) {
        this.f91818b = context;
        Iterator it = this.f91817a.iterator();
        while (it.hasNext()) {
            ((InterfaceC18156b) it.next()).mo4660a(context);
        }
    }
}
