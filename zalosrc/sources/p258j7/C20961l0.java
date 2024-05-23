package p258j7;

import android.app.Activity;
import java.util.Set;
import p291k7.InterfaceC21550v0;
import p342m6.AbstractC22888j;

/* renamed from: j7.l0 */
/* loaded from: classes3.dex */
final class C20961l0 implements InterfaceC20938a {

    /* renamed from: a */
    private final InterfaceC21550v0 f102864a;

    /* renamed from: b */
    private final InterfaceC21550v0 f102865b;

    /* renamed from: c */
    private final InterfaceC21550v0 f102866c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20961l0(InterfaceC21550v0 interfaceC21550v0, InterfaceC21550v0 interfaceC21550v02, InterfaceC21550v0 interfaceC21550v03) {
        this.f102864a = interfaceC21550v0;
        this.f102865b = interfaceC21550v02;
        this.f102866c = interfaceC21550v03;
    }

    /* renamed from: f */
    private final InterfaceC20938a m109502f() {
        if (this.f102866c.zza() != null) {
            return (InterfaceC20938a) this.f102865b.zza();
        }
        return (InterfaceC20938a) this.f102864a.zza();
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: a */
    public final AbstractC22888j mo109459a(int i11) {
        return m109502f().mo109459a(i11);
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: b */
    public final Set mo109460b() {
        return m109502f().mo109460b();
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: c */
    public final AbstractC22888j mo109461c(C20942c c20942c) {
        return m109502f().mo109461c(c20942c);
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: d */
    public final void mo109462d(InterfaceC20946e interfaceC20946e) {
        m109502f().mo109462d(interfaceC20946e);
    }

    @Override // p258j7.InterfaceC20938a
    /* renamed from: e */
    public final boolean mo109463e(AbstractC20944d abstractC20944d, Activity activity, int i11) {
        return m109502f().mo109463e(abstractC20944d, activity, i11);
    }
}
