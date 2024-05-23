package p258j7;

/* renamed from: j7.c0 */
/* loaded from: classes3.dex */
public final class C20943c0 {

    /* renamed from: a */
    private C20954i f102827a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C20943c0(AbstractC20978u abstractC20978u) {
    }

    /* renamed from: a */
    public final C20943c0 m109475a(C20954i c20954i) {
        this.f102827a = c20954i;
        return this;
    }

    /* renamed from: b */
    public final InterfaceC20969p0 m109476b() {
        C20954i c20954i = this.f102827a;
        if (c20954i != null) {
            return new C20947e0(c20954i, null);
        }
        throw new IllegalStateException(String.valueOf(C20954i.class.getCanonicalName()).concat(" must be set"));
    }
}
