package com.google.protobuf;

/* renamed from: com.google.protobuf.p */
/* loaded from: classes3.dex */
class C6824p implements InterfaceC6806h0 {

    /* renamed from: a */
    private static final C6824p f37456a = new C6824p();

    private C6824p() {
    }

    /* renamed from: c */
    public static C6824p m35085c() {
        return f37456a;
    }

    @Override // com.google.protobuf.InterfaceC6806h0
    /* renamed from: a */
    public InterfaceC6803g0 mo34727a(Class cls) {
        if (AbstractC6826q.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC6803g0) AbstractC6826q.m35096x(cls.asSubclass(AbstractC6826q.class)).m35102q();
            } catch (Exception e11) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e11);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // com.google.protobuf.InterfaceC6806h0
    /* renamed from: b */
    public boolean mo34728b(Class cls) {
        return AbstractC6826q.class.isAssignableFrom(cls);
    }
}
