package p258j7;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j7.o0 */
/* loaded from: classes.dex */
public enum EnumC20967o0 implements InterfaceC20951g0 {
    INSTANCE;


    /* renamed from: q */
    private static final AtomicReference f102874q = new AtomicReference(null);

    /* renamed from: b */
    public final void m109503b(InterfaceC20953h0 interfaceC20953h0) {
        f102874q.set(interfaceC20953h0);
    }

    @Override // p258j7.InterfaceC20951g0
    public final InterfaceC20953h0 zza() {
        return (InterfaceC20953h0) f102874q.get();
    }
}
