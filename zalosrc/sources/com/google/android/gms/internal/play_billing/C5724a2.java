package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.a2 */
/* loaded from: classes2.dex */
public final class C5724a2 implements InterfaceC5841t2 {

    /* renamed from: b */
    private static final InterfaceC5763g2 f33232b = new C5870y1();

    /* renamed from: a */
    private final InterfaceC5763g2 f33233a;

    public C5724a2() {
        InterfaceC5763g2 interfaceC5763g2;
        InterfaceC5763g2[] interfaceC5763g2Arr = new InterfaceC5763g2[2];
        interfaceC5763g2Arr[0] = C5756f1.m30219c();
        try {
            interfaceC5763g2 = (InterfaceC5763g2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC5763g2 = f33232b;
        }
        interfaceC5763g2Arr[1] = interfaceC5763g2;
        C5876z1 c5876z1 = new C5876z1(interfaceC5763g2Arr);
        byte[] bArr = AbstractC5804n1.f33378d;
        this.f33233a = c5876z1;
    }

    /* renamed from: b */
    private static boolean m30157b(InterfaceC5751e2 interfaceC5751e2) {
        if (interfaceC5751e2.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5841t2
    /* renamed from: a */
    public final InterfaceC5835s2 mo30158a(Class cls) {
        AbstractC5847u2.m30520w(cls);
        InterfaceC5751e2 mo30220a = this.f33233a.mo30220a(cls);
        if (mo30220a.zzb()) {
            if (AbstractC5774i1.class.isAssignableFrom(cls)) {
                return C5799m2.m30361g(AbstractC5847u2.m30517t(), AbstractC5730b1.m30173b(), mo30220a.zza());
            }
            return C5799m2.m30361g(AbstractC5847u2.m30516s(), AbstractC5730b1.m30172a(), mo30220a.zza());
        }
        if (AbstractC5774i1.class.isAssignableFrom(cls)) {
            if (m30157b(mo30220a)) {
                return C5793l2.m30349x(cls, mo30220a, AbstractC5811o2.m30422b(), AbstractC5858w1.m30547d(), AbstractC5847u2.m30517t(), AbstractC5730b1.m30173b(), AbstractC5745d2.m30203b());
            }
            return C5793l2.m30349x(cls, mo30220a, AbstractC5811o2.m30422b(), AbstractC5858w1.m30547d(), AbstractC5847u2.m30517t(), null, AbstractC5745d2.m30203b());
        }
        if (m30157b(mo30220a)) {
            return C5793l2.m30349x(cls, mo30220a, AbstractC5811o2.m30421a(), AbstractC5858w1.m30546c(), AbstractC5847u2.m30516s(), AbstractC5730b1.m30172a(), AbstractC5745d2.m30202a());
        }
        return C5793l2.m30349x(cls, mo30220a, AbstractC5811o2.m30421a(), AbstractC5858w1.m30546c(), AbstractC5847u2.m30516s(), null, AbstractC5745d2.m30202a());
    }
}
