package ze0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ve0.C27995d;
import ve0.InterfaceC27993b;
import ye0.C30920b;

/* renamed from: ze0.a */
/* loaded from: classes4.dex */
final class C31795a implements InterfaceC31802h {

    /* renamed from: a */
    private final InterfaceC27993b f145946a;

    /* renamed from: b */
    private final C30920b f145947b;

    /* renamed from: c */
    private final InterfaceC31803i f145948c;

    /* renamed from: d */
    private final Map f145949d = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31795a(InterfaceC27993b interfaceC27993b, C30920b c30920b, InterfaceC31803i interfaceC31803i) {
        this.f145946a = interfaceC27993b;
        this.f145947b = c30920b;
        this.f145948c = interfaceC31803i;
    }

    /* renamed from: b */
    private synchronized void m152825b(String str) {
        try {
            if (this.f145949d.containsKey(str)) {
                return;
            }
            Iterator it = m152826c(str).iterator();
            while (it.hasNext()) {
                this.f145948c.mo152828a((C27995d) it.next());
            }
            this.f145949d.put(str, str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    private Collection m152826c(String str) {
        try {
            return this.f145947b.m150209d(this.f145946a.mo141027a(str));
        } catch (IllegalArgumentException | IllegalStateException e11) {
            throw new IllegalStateException("Failed to read file " + str, e11);
        }
    }

    @Override // ze0.InterfaceC31802h
    /* renamed from: a */
    public InterfaceC31803i mo152827a(String str) {
        if (!this.f145949d.containsKey(str)) {
            m152825b(str);
        }
        return this.f145948c;
    }
}
