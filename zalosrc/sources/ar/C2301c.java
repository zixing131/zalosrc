package ar;

import bo.C3000l0;
import bo.C3020p0;
import p716zh.C32002l4;

/* renamed from: ar.c */
/* loaded from: classes4.dex */
public class C2301c extends AbstractC2325z {

    /* renamed from: b */
    private final String f9710b;

    /* renamed from: c */
    private final C3000l0 f9711c;

    /* renamed from: d */
    private final C3020p0 f9712d;

    /* renamed from: e */
    private final C32002l4 f9713e;

    /* renamed from: ar.c$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        private String f9714a;

        /* renamed from: b */
        private C3000l0 f9715b;

        /* renamed from: c */
        private C3020p0 f9716c;

        /* renamed from: d */
        private C32002l4 f9717d;

        /* renamed from: a */
        public C2301c m12162a() {
            return new C2301c(this.f9714a, this.f9715b, this.f9716c, this.f9717d);
        }

        /* renamed from: b */
        public a m12163b(C32002l4 c32002l4) {
            this.f9717d = c32002l4;
            return this;
        }

        /* renamed from: c */
        public a m12164c(C3000l0 c3000l0) {
            this.f9715b = c3000l0;
            return this;
        }

        /* renamed from: d */
        public a m12165d(String str) {
            this.f9714a = str;
            return this;
        }

        /* renamed from: e */
        public a m12166e(C3020p0 c3020p0) {
            this.f9716c = c3020p0;
            return this;
        }
    }

    /* renamed from: b */
    public static a m12158b() {
        return new a();
    }

    /* renamed from: c */
    public C32002l4 m12159c() {
        return this.f9713e;
    }

    /* renamed from: d */
    public C3000l0 m12160d() {
        return this.f9711c;
    }

    /* renamed from: e */
    public String m12161e() {
        return this.f9710b;
    }

    private C2301c(String str, C3000l0 c3000l0, C3020p0 c3020p0, C32002l4 c32002l4) {
        this.f9710b = str;
        this.f9711c = c3000l0;
        this.f9712d = c3020p0;
        this.f9713e = c32002l4;
        m12283a(10);
    }
}
