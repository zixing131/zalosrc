package com.google.firebase.remoteconfig.internal;

import p541u9.C27201i;
import p541u9.InterfaceC27200h;

/* renamed from: com.google.firebase.remoteconfig.internal.u */
/* loaded from: classes3.dex */
public class C6737u implements InterfaceC27200h {

    /* renamed from: a */
    private final long f37084a;

    /* renamed from: b */
    private final int f37085b;

    /* renamed from: c */
    private final C27201i f37086c;

    /* renamed from: com.google.firebase.remoteconfig.internal.u$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private long f37087a;

        /* renamed from: b */
        private int f37088b;

        /* renamed from: c */
        private C27201i f37089c;

        private b() {
        }

        /* renamed from: a */
        public C6737u m34501a() {
            return new C6737u(this.f37087a, this.f37088b, this.f37089c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public b m34502b(C27201i c27201i) {
            this.f37089c = c27201i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public b m34503c(int i11) {
            this.f37088b = i11;
            return this;
        }

        /* renamed from: d */
        public b m34504d(long j11) {
            this.f37087a = j11;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static b m34499b() {
        return new b();
    }

    @Override // p541u9.InterfaceC27200h
    /* renamed from: a */
    public int mo34500a() {
        return this.f37085b;
    }

    private C6737u(long j11, int i11, C27201i c27201i) {
        this.f37084a = j11;
        this.f37085b = i11;
        this.f37086c = c27201i;
    }
}
