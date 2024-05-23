package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class sv3 implements uw3 {

    /* renamed from: b */
    private static final xv3 f28040b = new qv3();

    /* renamed from: a */
    private final xv3 f28041a;

    public sv3() {
        xv3 xv3Var;
        xv3[] xv3VarArr = new xv3[2];
        xv3VarArr[0] = ou3.m25331c();
        try {
            xv3Var = (xv3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            xv3Var = f28040b;
        }
        xv3VarArr[1] = xv3Var;
        rv3 rv3Var = new rv3(xv3VarArr);
        dv3.m21551f(rv3Var, "messageInfoFactory");
        this.f28041a = rv3Var;
    }

    /* renamed from: b */
    private static boolean m26442b(wv3 wv3Var) {
        if (wv3Var.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.uw3
    /* renamed from: a */
    public final tw3 mo26443a(Class cls) {
        vw3.m27402g(cls);
        wv3 mo25332a = this.f28041a.mo25332a(cls);
        if (mo25332a.zzb()) {
            if (tu3.class.isAssignableFrom(cls)) {
                return dw3.m21557h(vw3.m27396b(), ju3.m23756b(), mo25332a.zza());
            }
            return dw3.m21557h(vw3.m27397b0(), ju3.m23755a(), mo25332a.zza());
        }
        if (tu3.class.isAssignableFrom(cls)) {
            if (m26442b(mo25332a)) {
                return cw3.m21192H(cls, mo25332a, fw3.m22197b(), ov3.m25337e(), vw3.m27396b(), ju3.m23756b(), vv3.m27359b());
            }
            return cw3.m21192H(cls, mo25332a, fw3.m22197b(), ov3.m25337e(), vw3.m27396b(), null, vv3.m27359b());
        }
        if (m26442b(mo25332a)) {
            return cw3.m21192H(cls, mo25332a, fw3.m22196a(), ov3.m25336d(), vw3.m27397b0(), ju3.m23755a(), vv3.m27358a());
        }
        return cw3.m21192H(cls, mo25332a, fw3.m22196a(), ov3.m25336d(), vw3.m27394a(), null, vv3.m27358a());
    }
}
