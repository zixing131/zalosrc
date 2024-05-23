package p291k7;

import java.io.File;
import java.util.Set;

/* renamed from: k7.g0 */
/* loaded from: classes3.dex */
final class C21505g0 implements InterfaceC21528o {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m111153c(ClassLoader classLoader, Set set) {
        C21487a0.m111100c(classLoader, set, new C21499e0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m111154d(ClassLoader classLoader, File file, File file2, boolean z11) {
        return C21549v.m111208e(classLoader, file, file2, z11, new C21554x(), "path", new C21502f0());
    }

    @Override // p291k7.InterfaceC21528o
    /* renamed from: a */
    public final boolean mo111102a(ClassLoader classLoader, File file, File file2, boolean z11) {
        return m111154d(classLoader, file, file2, z11);
    }

    @Override // p291k7.InterfaceC21528o
    /* renamed from: b */
    public final void mo111103b(ClassLoader classLoader, Set set) {
        m111153c(classLoader, set);
    }
}
