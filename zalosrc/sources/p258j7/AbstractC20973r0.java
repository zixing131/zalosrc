package p258j7;

import java.util.concurrent.atomic.AtomicReference;
import p231i7.AbstractC20357a;

/* renamed from: j7.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC20973r0 {

    /* renamed from: a */
    private static final AtomicReference f102882a = new AtomicReference(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC20971q0 m109505a() {
        return (InterfaceC20971q0) f102882a.get();
    }

    /* renamed from: b */
    public static void m109506b(InterfaceC20971q0 interfaceC20971q0) {
        AtomicReference atomicReference = f102882a;
        while (!AbstractC20357a.m106108a(atomicReference, null, interfaceC20971q0) && atomicReference.get() == null) {
        }
    }
}
