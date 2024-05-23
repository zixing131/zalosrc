package com.google.protobuf;

import com.google.protobuf.AbstractC6810i1;

/* renamed from: com.google.protobuf.b0 */
/* loaded from: classes3.dex */
public class C6788b0 {

    /* renamed from: a */
    private final a f37239a;

    /* renamed from: b */
    private final Object f37240b;

    /* renamed from: c */
    private final Object f37241c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.b0$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public final AbstractC6810i1.b f37242a;

        /* renamed from: b */
        public final Object f37243b;

        /* renamed from: c */
        public final AbstractC6810i1.b f37244c;

        /* renamed from: d */
        public final Object f37245d;

        public a(AbstractC6810i1.b bVar, Object obj, AbstractC6810i1.b bVar2, Object obj2) {
            this.f37242a = bVar;
            this.f37243b = obj;
            this.f37244c = bVar2;
            this.f37245d = obj2;
        }
    }

    private C6788b0(AbstractC6810i1.b bVar, Object obj, AbstractC6810i1.b bVar2, Object obj2) {
        this.f37239a = new a(bVar, obj, bVar2, obj2);
        this.f37240b = obj;
        this.f37241c = obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m34729b(a aVar, Object obj, Object obj2) {
        return C6820n.m35058b(aVar.f37242a, 1, obj) + C6820n.m35058b(aVar.f37244c, 2, obj2);
    }

    /* renamed from: d */
    public static C6788b0 m34730d(AbstractC6810i1.b bVar, Object obj, AbstractC6810i1.b bVar2, Object obj2) {
        return new C6788b0(bVar, obj, bVar2, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m34731e(CodedOutputStream codedOutputStream, a aVar, Object obj, Object obj2) {
        C6820n.m35068u(codedOutputStream, aVar.f37242a, 1, obj);
        C6820n.m35068u(codedOutputStream, aVar.f37244c, 2, obj2);
    }

    /* renamed from: a */
    public int m34732a(int i11, Object obj, Object obj2) {
        return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(m34729b(this.f37239a, obj, obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public a m34733c() {
        return this.f37239a;
    }
}
