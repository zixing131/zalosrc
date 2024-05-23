package com.google.protobuf;

/* renamed from: com.google.protobuf.g */
/* loaded from: classes3.dex */
public abstract class AbstractC6802g {

    /* renamed from: a */
    int f37277a;

    /* renamed from: b */
    int f37278b;

    /* renamed from: c */
    private boolean f37279c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.g$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6802g {

        /* renamed from: d */
        private final byte[] f37280d;

        /* renamed from: e */
        private final boolean f37281e;

        /* renamed from: f */
        private int f37282f;

        /* renamed from: g */
        private int f37283g;

        /* renamed from: h */
        private int f37284h;

        /* renamed from: i */
        private int f37285i;

        /* renamed from: j */
        private int f37286j;

        /* renamed from: f */
        private void m34832f() {
            int i11 = this.f37282f + this.f37283g;
            this.f37282f = i11;
            int i12 = i11 - this.f37285i;
            int i13 = this.f37286j;
            if (i12 <= i13) {
                this.f37283g = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f37283g = i14;
            this.f37282f = i11 - i14;
        }

        /* renamed from: d */
        public int m34833d() {
            return this.f37284h - this.f37285i;
        }

        /* renamed from: e */
        public int m34834e(int i11) {
            if (i11 >= 0) {
                int m34833d = i11 + m34833d();
                if (m34833d >= 0) {
                    int i12 = this.f37286j;
                    if (m34833d <= i12) {
                        this.f37286j = m34833d;
                        m34832f();
                        return i12;
                    }
                    throw InvalidProtocolBufferException.m34709d();
                }
                throw InvalidProtocolBufferException.m34708c();
            }
            throw InvalidProtocolBufferException.m34707b();
        }

        private b(byte[] bArr, int i11, int i12, boolean z11) {
            super();
            this.f37286j = Integer.MAX_VALUE;
            this.f37280d = bArr;
            this.f37282f = i12 + i11;
            this.f37284h = i11;
            this.f37285i = i11;
            this.f37281e = z11;
        }
    }

    /* renamed from: a */
    public static AbstractC6802g m34829a(byte[] bArr) {
        return m34830b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static AbstractC6802g m34830b(byte[] bArr, int i11, int i12) {
        return m34831c(bArr, i11, i12, false);
    }

    /* renamed from: c */
    static AbstractC6802g m34831c(byte[] bArr, int i11, int i12, boolean z11) {
        b bVar = new b(bArr, i11, i12, z11);
        try {
            bVar.m34834e(i12);
            return bVar;
        } catch (InvalidProtocolBufferException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    private AbstractC6802g() {
        this.f37277a = 100;
        this.f37278b = Integer.MAX_VALUE;
        this.f37279c = false;
    }
}
