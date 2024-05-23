package vn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC21884b;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.AbstractC25389d;
import qn0.InterfaceC25393h;
import tn0.AbstractC26776b;
import un0.AbstractC27323a;
import un0.C27328f;
import un0.InterfaceC27334l;
import wn0.AbstractC29112b;

/* renamed from: vn0.t0 */
/* loaded from: classes7.dex */
public final class C28345t0 extends AbstractC21884b implements InterfaceC27334l {

    /* renamed from: a */
    private final C28330m f132099a;

    /* renamed from: b */
    private final AbstractC27323a f132100b;

    /* renamed from: c */
    private final EnumC28357z0 f132101c;

    /* renamed from: d */
    private final InterfaceC27334l[] f132102d;

    /* renamed from: e */
    private final AbstractC29112b f132103e;

    /* renamed from: f */
    private final C27328f f132104f;

    /* renamed from: g */
    private boolean f132105g;

    /* renamed from: h */
    private String f132106h;

    /* renamed from: vn0.t0$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f132107a;

        static {
            int[] iArr = new int[EnumC28357z0.values().length];
            try {
                iArr[EnumC28357z0.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28357z0.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC28357z0.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f132107a = iArr;
        }
    }

    public C28345t0(C28330m c28330m, AbstractC27323a abstractC27323a, EnumC28357z0 enumC28357z0, InterfaceC27334l[] interfaceC27334lArr) {
        AbstractC19074t.m100208f(c28330m, "composer");
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(enumC28357z0, "mode");
        this.f132099a = c28330m;
        this.f132100b = abstractC27323a;
        this.f132101c = enumC28357z0;
        this.f132102d = interfaceC27334lArr;
        this.f132103e = mo139938d().mo131586a();
        this.f132104f = mo139938d().m139869f();
        int ordinal = enumC28357z0.ordinal();
        if (interfaceC27334lArr != null) {
            InterfaceC27334l interfaceC27334l = interfaceC27334lArr[ordinal];
            if (interfaceC27334l == null && interfaceC27334l == this) {
                return;
            }
            interfaceC27334lArr[ordinal] = this;
        }
    }

    /* renamed from: J */
    private final void m142785J(SerialDescriptor serialDescriptor) {
        this.f132099a.mo142734c();
        String str = this.f132106h;
        AbstractC19074t.m100205c(str);
        mo113982F(str);
        this.f132099a.m142736e(':');
        this.f132099a.mo142746o();
        mo113982F(serialDescriptor.mo113953i());
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: A */
    public boolean mo114019A(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return this.f132104f.m139888e();
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: B */
    public void mo113981B(int i11) {
        if (this.f132105g) {
            mo113982F(String.valueOf(i11));
        } else {
            this.f132099a.mo142739h(i11);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: F */
    public void mo113982F(String str) {
        AbstractC19074t.m100208f(str, "value");
        this.f132099a.mo142744m(str);
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b
    /* renamed from: G */
    public boolean mo114023G(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        int i12 = a.f132107a[this.f132101c.ordinal()];
        if (i12 != 1) {
            boolean z11 = false;
            if (i12 != 2) {
                if (i12 != 3) {
                    if (!this.f132099a.m142732a()) {
                        this.f132099a.m142736e(',');
                    }
                    this.f132099a.mo142734c();
                    mo113982F(AbstractC28311c0.m142669f(serialDescriptor, mo139938d(), i11));
                    this.f132099a.m142736e(':');
                    this.f132099a.mo142746o();
                } else {
                    if (i11 == 0) {
                        this.f132105g = true;
                    }
                    if (i11 == 1) {
                        this.f132099a.m142736e(',');
                        this.f132099a.mo142746o();
                        this.f132105g = false;
                    }
                }
            } else if (!this.f132099a.m142732a()) {
                if (i11 % 2 == 0) {
                    this.f132099a.m142736e(',');
                    this.f132099a.mo142734c();
                    z11 = true;
                } else {
                    this.f132099a.m142736e(':');
                    this.f132099a.mo142746o();
                }
                this.f132105g = z11;
            } else {
                this.f132105g = true;
                this.f132099a.mo142734c();
            }
        } else {
            if (!this.f132099a.m142732a()) {
                this.f132099a.m142736e(',');
            }
            this.f132099a.mo142734c();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: a */
    public AbstractC29112b mo113983a() {
        return this.f132103e;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: b */
    public InterfaceC21886d mo113984b(SerialDescriptor serialDescriptor) {
        InterfaceC27334l interfaceC27334l;
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        EnumC28357z0 m142633b = AbstractC28307a1.m142633b(mo139938d(), serialDescriptor);
        char c11 = m142633b.f132124p;
        if (c11 != 0) {
            this.f132099a.m142736e(c11);
            this.f132099a.mo142733b();
        }
        if (this.f132106h != null) {
            m142785J(serialDescriptor);
            this.f132106h = null;
        }
        if (this.f132101c == m142633b) {
            return this;
        }
        InterfaceC27334l[] interfaceC27334lArr = this.f132102d;
        if (interfaceC27334lArr == null || (interfaceC27334l = interfaceC27334lArr[m142633b.ordinal()]) == null) {
            return new C28345t0(this.f132099a, mo139938d(), m142633b, this.f132102d);
        }
        return interfaceC27334l;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: c */
    public void mo114026c(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (this.f132101c.f132125q != 0) {
            this.f132099a.mo142747p();
            this.f132099a.mo142734c();
            this.f132099a.m142736e(this.f132101c.f132125q);
        }
    }

    @Override // un0.InterfaceC27334l
    /* renamed from: d */
    public AbstractC27323a mo139938d() {
        return this.f132100b;
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: f */
    public void mo113985f(double d11) {
        if (this.f132105g) {
            mo113982F(String.valueOf(d11));
        } else {
            this.f132099a.m142737f(d11);
        }
        if (!this.f132104f.m139884a()) {
            if (Double.isInfinite(d11) || Double.isNaN(d11)) {
                throw AbstractC28309b0.m142637b(Double.valueOf(d11), this.f132099a.f132065a.toString());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: g */
    public void mo113986g(byte b11) {
        if (this.f132105g) {
            mo113982F(String.valueOf((int) b11));
        } else {
            this.f132099a.mo142735d(b11);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: h */
    public void mo114028h(SerialDescriptor serialDescriptor, int i11, InterfaceC25393h interfaceC25393h, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        if (obj != null || this.f132104f.m139889f()) {
            super.mo114028h(serialDescriptor, i11, interfaceC25393h, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: j */
    public void mo113987j(InterfaceC25393h interfaceC25393h, Object obj) {
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        if ((interfaceC25393h instanceof AbstractC26776b) && !mo139938d().m139869f().m139895l()) {
            AbstractC26776b abstractC26776b = (AbstractC26776b) interfaceC25393h;
            String m142764c = AbstractC28339q0.m142764c(interfaceC25393h.getDescriptor(), mo139938d());
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Any");
            InterfaceC25393h m131578b = AbstractC25389d.m131578b(abstractC26776b, this, obj);
            AbstractC28339q0.m142767f(abstractC26776b, m131578b, m142764c);
            AbstractC28339q0.m142763b(m131578b.getDescriptor().mo113948d());
            this.f132106h = m142764c;
            m131578b.serialize(this, obj);
            return;
        }
        interfaceC25393h.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: l */
    public void mo113989l(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "enumDescriptor");
        mo113982F(serialDescriptor.mo113950f(i11));
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: m */
    public Encoder mo113990m(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (AbstractC28347u0.m142787b(serialDescriptor)) {
            C28330m c28330m = this.f132099a;
            if (!(c28330m instanceof C28346u)) {
                c28330m = new C28346u(c28330m.f132065a, this.f132105g);
            }
            return new C28345t0(c28330m, mo139938d(), this.f132101c, (InterfaceC27334l[]) null);
        }
        if (AbstractC28347u0.m142786a(serialDescriptor)) {
            C28330m c28330m2 = this.f132099a;
            if (!(c28330m2 instanceof C28332n)) {
                c28330m2 = new C28332n(c28330m2.f132065a, this.f132105g);
            }
            return new C28345t0(c28330m2, mo139938d(), this.f132101c, (InterfaceC27334l[]) null);
        }
        return super.mo113990m(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: n */
    public void mo113991n(long j11) {
        if (this.f132105g) {
            mo113982F(String.valueOf(j11));
        } else {
            this.f132099a.mo142740i(j11);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: p */
    public void mo113992p() {
        this.f132099a.m142741j("null");
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: r */
    public void mo113993r(short s7) {
        if (this.f132105g) {
            mo113982F(String.valueOf((int) s7));
        } else {
            this.f132099a.mo142742k(s7);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: s */
    public void mo113994s(boolean z11) {
        if (this.f132105g) {
            mo113982F(String.valueOf(z11));
        } else {
            this.f132099a.m142743l(z11);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: u */
    public void mo113995u(float f11) {
        if (this.f132105g) {
            mo113982F(String.valueOf(f11));
        } else {
            this.f132099a.m142738g(f11);
        }
        if (!this.f132104f.m139884a()) {
            if (Float.isInfinite(f11) || Float.isNaN(f11)) {
                throw AbstractC28309b0.m142637b(Float.valueOf(f11), this.f132099a.f132065a.toString());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
    /* renamed from: v */
    public void mo113996v(char c11) {
        mo113982F(String.valueOf(c11));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28345t0(InterfaceC28337p0 interfaceC28337p0, AbstractC27323a abstractC27323a, EnumC28357z0 enumC28357z0, InterfaceC27334l[] interfaceC27334lArr) {
        this(AbstractC28350w.m142789a(interfaceC28337p0, abstractC27323a), abstractC27323a, enumC28357z0, interfaceC27334lArr);
        AbstractC19074t.m100208f(interfaceC28337p0, "output");
        AbstractC19074t.m100208f(abstractC27323a, "json");
        AbstractC19074t.m100208f(enumC28357z0, "mode");
        AbstractC19074t.m100208f(interfaceC27334lArr, "modeReuseCache");
    }
}
