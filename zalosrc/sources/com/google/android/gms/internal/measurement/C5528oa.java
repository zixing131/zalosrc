package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.oa */
/* loaded from: classes.dex */
public final class C5528oa implements InterfaceC5410hb {

    /* renamed from: b */
    private static final InterfaceC5613ta f32702b = new C5477la();

    /* renamed from: a */
    private final InterfaceC5613ta f32703a;

    public C5528oa() {
        InterfaceC5613ta interfaceC5613ta;
        InterfaceC5613ta[] interfaceC5613taArr = new InterfaceC5613ta[2];
        interfaceC5613taArr[0] = C5544p9.m29528c();
        try {
            interfaceC5613ta = (InterfaceC5613ta) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC5613ta = f32702b;
        }
        interfaceC5613taArr[1] = interfaceC5613ta;
        C5494ma c5494ma = new C5494ma(interfaceC5613taArr);
        byte[] bArr = AbstractC5290aa.f32259d;
        this.f32703a = c5494ma;
    }

    /* renamed from: b */
    private static boolean m29486b(InterfaceC5596sa interfaceC5596sa) {
        if (interfaceC5596sa.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5410hb
    /* renamed from: a */
    public final InterfaceC5393gb mo29189a(Class cls) {
        AbstractC5427ib.m29241d(cls);
        InterfaceC5596sa mo29422a = this.f32703a.mo29422a(cls);
        if (mo29422a.zzb()) {
            if (AbstractC5612t9.class.isAssignableFrom(cls)) {
                return C5715za.m30109g(AbstractC5427ib.m29238a(), AbstractC5476l9.m29421b(), mo29422a.zza());
            }
            return C5715za.m30109g(AbstractC5427ib.m29236W(), AbstractC5476l9.m29420a(), mo29422a.zza());
        }
        if (AbstractC5612t9.class.isAssignableFrom(cls)) {
            if (m29486b(mo29422a)) {
                return C5698ya.m30051E(cls, mo29422a, AbstractC5308bb.m28953b(), AbstractC5443ja.m29285d(), AbstractC5427ib.m29238a(), AbstractC5476l9.m29421b(), AbstractC5579ra.m29584b());
            }
            return C5698ya.m30051E(cls, mo29422a, AbstractC5308bb.m28953b(), AbstractC5443ja.m29285d(), AbstractC5427ib.m29238a(), null, AbstractC5579ra.m29584b());
        }
        if (m29486b(mo29422a)) {
            return C5698ya.m30051E(cls, mo29422a, AbstractC5308bb.m28952a(), AbstractC5443ja.m29284c(), AbstractC5427ib.m29236W(), AbstractC5476l9.m29420a(), AbstractC5579ra.m29583a());
        }
        return C5698ya.m30051E(cls, mo29422a, AbstractC5308bb.m28952a(), AbstractC5443ja.m29284c(), AbstractC5427ib.m29237X(), null, AbstractC5579ra.m29583a());
    }
}
