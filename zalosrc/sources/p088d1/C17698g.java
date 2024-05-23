package p088d1;

import p088d1.C17697f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d1.g */
/* loaded from: classes2.dex */
public class C17698g extends C17697f {

    /* renamed from: m */
    public int f89744m;

    public C17698g(AbstractC17707p abstractC17707p) {
        super(abstractC17707p);
        if (abstractC17707p instanceof C17703l) {
            this.f89727e = C17697f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f89727e = C17697f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p088d1.C17697f
    /* renamed from: d */
    public void mo93738d(int i11) {
        if (this.f89732j) {
            return;
        }
        this.f89732j = true;
        this.f89729g = i11;
        for (InterfaceC17695d interfaceC17695d : this.f89733k) {
            interfaceC17695d.mo93716a(interfaceC17695d);
        }
    }
}
