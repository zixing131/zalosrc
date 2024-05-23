package p052c8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p015a9.InterfaceC0662b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c8.v */
/* loaded from: classes.dex */
public class C3359v implements InterfaceC0662b {

    /* renamed from: b */
    private volatile Set f14224b = null;

    /* renamed from: a */
    private volatile Set f14223a = Collections.newSetFromMap(new ConcurrentHashMap());

    C3359v(Collection collection) {
        this.f14223a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C3359v m16924b(Collection collection) {
        return new C3359v((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m16925d() {
        try {
            Iterator it = this.f14223a.iterator();
            while (it.hasNext()) {
                this.f14224b.add(((InterfaceC0662b) it.next()).get());
            }
            this.f14223a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m16926a(InterfaceC0662b interfaceC0662b) {
        try {
            if (this.f14224b == null) {
                this.f14223a.add(interfaceC0662b);
            } else {
                this.f14224b.add(interfaceC0662b.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p015a9.InterfaceC0662b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f14224b == null) {
            synchronized (this) {
                try {
                    if (this.f14224b == null) {
                        this.f14224b = Collections.newSetFromMap(new ConcurrentHashMap());
                        m16925d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f14224b);
    }
}
