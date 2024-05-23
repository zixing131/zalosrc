package p682yi;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p298kf.C21700a;
import p298kf.EnumC21702c;
import se.AbstractC26235a;

/* renamed from: yi.h */
/* loaded from: classes3.dex */
public final class C30993h implements InterfaceC30986a {

    /* renamed from: a */
    private final int f142963a = 19;

    /* renamed from: b */
    private final int f142964b = 1;

    /* renamed from: c */
    private final int f142965c = -6184543;

    /* renamed from: d */
    private final int[] f142966d = {-404440, -43931, -4839472, -14365720, -6953158, -2761606, -11551370, -14051205, -11163919, -1000048, -418020, -2018237, -16750340, -328966, -14540254};

    /* renamed from: e */
    private final int[] f142967e = {-1, -404440, -2018237, -4839472, -14365720, -6953158, -2761606, -11551370, -14051205, -11163919, -16750340, -13893383, -10543762, -43931, -827000, -418020, -1000048, -8224126, -12763843, -16777216};

    /* renamed from: f */
    private final int[] f142968f = {-1, -1, -14803689, -16777216, -16777216, -1, -16750340, -16750340, -1, -2018237, -2018237, -1, -2761606, -2761606, -1, -11551370, -11551370, -1, -14051205, -14051205, -1, -11163919, -11163919, -1, -1000048, -1000048, -1, -418020, -418020, -14018299, -827000, -827000, -1, -13893383, -13893383, -1, -10543762, -10543762, -1, -12763843, -12763843, -1, -8224126, -8224126, -1, -404440, -43931, -1, -827000, -4839472, -1, -4839472, -13893383, -1, -14365720, -16750340, -1, -6953158, -14051205, -1};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m150642A(int i11) {
        AbstractC0924m0.m4080oe(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m150643B(int i11) {
        AbstractC0924m0.m4231tf(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m150644C(int i11) {
        AbstractC0924m0.m4260uf(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m150645D(int i11) {
        AbstractC0924m0.m3055Fi(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m150652y() {
        AbstractC0924m0.m3402Rh(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m150653z() {
        AbstractC0924m0.m3431Sh(false);
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: a */
    public void mo150624a() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yi.c
            @Override // java.lang.Runnable
            public final void run() {
                C30993h.m150652y();
            }
        });
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: b */
    public int[] mo150625b() {
        return this.f142966d;
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: c */
    public void mo150626c(final int i11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yi.d
            @Override // java.lang.Runnable
            public final void run() {
                C30993h.m150644C(i11);
            }
        });
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: d */
    public boolean mo150627d() {
        return AbstractC0924m0.m3134Ia();
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: e */
    public void mo150628e(final int i11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yi.g
            @Override // java.lang.Runnable
            public final void run() {
                C30993h.m150642A(i11);
            }
        });
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: f */
    public int mo150629f() {
        return 0;
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: g */
    public int mo150630g() {
        return 2;
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: h */
    public List mo150631h() {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f142968f;
            if (i11 < iArr.length) {
                if (i11 == this.f142964b * 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList.add(new AbstractC26235a.a(iArr[i11], iArr[i11 + 1], iArr[i11 + 2], z11));
                i11 += 3;
            } else {
                return arrayList;
            }
        }
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: i */
    public void mo150632i() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yi.b
            @Override // java.lang.Runnable
            public final void run() {
                C30993h.m150653z();
            }
        });
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: j */
    public int mo150633j() {
        return AbstractC0924m0.m3065G();
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: k */
    public void mo150634k(final int i11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yi.e
            @Override // java.lang.Runnable
            public final void run() {
                C30993h.m150645D(i11);
            }
        });
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: l */
    public int mo150635l() {
        return this.f142963a;
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: m */
    public int[] mo150636m() {
        return this.f142967e;
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: n */
    public boolean mo150637n() {
        return AbstractC0924m0.m3105Ha();
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: o */
    public int mo150638o() {
        return AbstractC0924m0.m3096H1();
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: p */
    public void mo150639p(final int i11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yi.f
            @Override // java.lang.Runnable
            public final void run() {
                C30993h.m150643B(i11);
            }
        });
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: q */
    public List mo150640q() {
        ArrayList arrayList = new ArrayList();
        for (EnumC21702c enumC21702c : EnumC21702c.values()) {
            C21700a m111998a = C21700a.m111990a().m112000c(enumC21702c.m112006d()).m112002e(enumC21702c.m112008g()).m111999b(enumC21702c.m112005c()).m112003f(enumC21702c.m112009h()).m112001d(enumC21702c.m112007e()).m111998a();
            AbstractC19074t.m100207e(m111998a, "build(...)");
            arrayList.add(m111998a);
        }
        return arrayList;
    }

    @Override // p682yi.InterfaceC30986a
    /* renamed from: r */
    public int mo150641r() {
        return this.f142965c;
    }
}
