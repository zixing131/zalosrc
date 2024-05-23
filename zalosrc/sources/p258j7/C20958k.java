package p258j7;

import java.io.File;
import p291k7.InterfaceC21559z0;
import p343m7.C22924c;

/* renamed from: j7.k */
/* loaded from: classes3.dex */
public final class C20958k implements InterfaceC21559z0 {

    /* renamed from: a */
    private final InterfaceC21559z0 f102861a;

    public C20958k(InterfaceC21559z0 interfaceC21559z0) {
        this.f102861a = interfaceC21559z0;
    }

    @Override // p291k7.InterfaceC21559z0
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.f102861a.zza();
        if (file == null) {
            return null;
        }
        return C22924c.m117651a(file);
    }
}
