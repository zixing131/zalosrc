package com.google.protobuf;

/* renamed from: com.google.protobuf.a0 */
/* loaded from: classes3.dex */
final class C6785a0 implements InterfaceC6841x0 {

    /* renamed from: b */
    private static final InterfaceC6806h0 f37235b = new a();

    /* renamed from: a */
    private final InterfaceC6806h0 f37236a;

    /* renamed from: com.google.protobuf.a0$a */
    /* loaded from: classes3.dex */
    static class a implements InterfaceC6806h0 {
        a() {
        }

        @Override // com.google.protobuf.InterfaceC6806h0
        /* renamed from: a */
        public InterfaceC6803g0 mo34727a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.InterfaceC6806h0
        /* renamed from: b */
        public boolean mo34728b(Class cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.a0$b */
    /* loaded from: classes3.dex */
    public static class b implements InterfaceC6806h0 {

        /* renamed from: a */
        private InterfaceC6806h0[] f37237a;

        b(InterfaceC6806h0... interfaceC6806h0Arr) {
            this.f37237a = interfaceC6806h0Arr;
        }

        @Override // com.google.protobuf.InterfaceC6806h0
        /* renamed from: a */
        public InterfaceC6803g0 mo34727a(Class cls) {
            for (InterfaceC6806h0 interfaceC6806h0 : this.f37237a) {
                if (interfaceC6806h0.mo34728b(cls)) {
                    return interfaceC6806h0.mo34727a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.InterfaceC6806h0
        /* renamed from: b */
        public boolean mo34728b(Class cls) {
            for (InterfaceC6806h0 interfaceC6806h0 : this.f37237a) {
                if (interfaceC6806h0.mo34728b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C6785a0() {
        this(m34722b());
    }

    /* renamed from: b */
    private static InterfaceC6806h0 m34722b() {
        return new b(C6824p.m35085c(), m34723c());
    }

    /* renamed from: c */
    private static InterfaceC6806h0 m34723c() {
        try {
            return (InterfaceC6806h0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f37235b;
        }
    }

    /* renamed from: d */
    private static boolean m34724d(InterfaceC6803g0 interfaceC6803g0) {
        if (interfaceC6803g0.mo34837c() == EnumC6831s0.PROTO2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static InterfaceC6839w0 m34725e(Class cls, InterfaceC6803g0 interfaceC6803g0) {
        if (AbstractC6826q.class.isAssignableFrom(cls)) {
            if (m34724d(interfaceC6803g0)) {
                return C6817l0.m35004F(cls, interfaceC6803g0, AbstractC6825p0.m35087b(), AbstractC6842y.m35161b(), AbstractC6843y0.m35176J(), AbstractC6818m.m35053b(), AbstractC6800f0.m34816b());
            }
            return C6817l0.m35004F(cls, interfaceC6803g0, AbstractC6825p0.m35087b(), AbstractC6842y.m35161b(), AbstractC6843y0.m35176J(), null, AbstractC6800f0.m34816b());
        }
        if (m34724d(interfaceC6803g0)) {
            return C6817l0.m35004F(cls, interfaceC6803g0, AbstractC6825p0.m35086a(), AbstractC6842y.m35160a(), AbstractC6843y0.m35172F(), AbstractC6818m.m35052a(), AbstractC6800f0.m34815a());
        }
        return C6817l0.m35004F(cls, interfaceC6803g0, AbstractC6825p0.m35086a(), AbstractC6842y.m35160a(), AbstractC6843y0.m35173G(), null, AbstractC6800f0.m34815a());
    }

    @Override // com.google.protobuf.InterfaceC6841x0
    /* renamed from: a */
    public InterfaceC6839w0 mo34726a(Class cls) {
        AbstractC6843y0.m35174H(cls);
        InterfaceC6803g0 mo34727a = this.f37236a.mo34727a(cls);
        if (mo34727a.mo34835a()) {
            if (AbstractC6826q.class.isAssignableFrom(cls)) {
                return C6819m0.m35056i(AbstractC6843y0.m35176J(), AbstractC6818m.m35053b(), mo34727a.mo34836b());
            }
            return C6819m0.m35056i(AbstractC6843y0.m35172F(), AbstractC6818m.m35052a(), mo34727a.mo34836b());
        }
        return m34725e(cls, mo34727a);
    }

    private C6785a0(InterfaceC6806h0 interfaceC6806h0) {
        this.f37236a = (InterfaceC6806h0) AbstractC6830s.m35130b(interfaceC6806h0, "messageInfoFactory");
    }
}
