package p342m6;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m6.j0 */
/* loaded from: classes.dex */
public final class C22889j0 {

    /* renamed from: a */
    private final Object f111509a = new Object();

    /* renamed from: b */
    private Queue f111510b;

    /* renamed from: c */
    private boolean f111511c;

    /* renamed from: a */
    public final void m117591a(InterfaceC22887i0 interfaceC22887i0) {
        synchronized (this.f111509a) {
            try {
                if (this.f111510b == null) {
                    this.f111510b = new ArrayDeque();
                }
                this.f111510b.add(interfaceC22887i0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m117592b(AbstractC22888j abstractC22888j) {
        InterfaceC22887i0 interfaceC22887i0;
        synchronized (this.f111509a) {
            if (this.f111510b != null && !this.f111511c) {
                this.f111511c = true;
                while (true) {
                    synchronized (this.f111509a) {
                        try {
                            interfaceC22887i0 = (InterfaceC22887i0) this.f111510b.poll();
                            if (interfaceC22887i0 == null) {
                                this.f111511c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC22887i0.mo117565a(abstractC22888j);
                }
            }
        }
    }
}
