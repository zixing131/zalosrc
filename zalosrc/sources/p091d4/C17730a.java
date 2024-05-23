package p091d4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p010a4.AbstractC0120m;

/* renamed from: d4.a */
/* loaded from: classes.dex */
public final class C17730a {

    /* renamed from: e */
    private static final C17730a f89865e = new a().m93855b();

    /* renamed from: a */
    private final C17735f f89866a;

    /* renamed from: b */
    private final List f89867b;

    /* renamed from: c */
    private final C17731b f89868c;

    /* renamed from: d */
    private final String f89869d;

    /* renamed from: d4.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private C17735f f89870a = null;

        /* renamed from: b */
        private List f89871b = new ArrayList();

        /* renamed from: c */
        private C17731b f89872c = null;

        /* renamed from: d */
        private String f89873d = "";

        a() {
        }

        /* renamed from: a */
        public a m93854a(C17733d c17733d) {
            this.f89871b.add(c17733d);
            return this;
        }

        /* renamed from: b */
        public C17730a m93855b() {
            return new C17730a(this.f89870a, Collections.unmodifiableList(this.f89871b), this.f89872c, this.f89873d);
        }

        /* renamed from: c */
        public a m93856c(String str) {
            this.f89873d = str;
            return this;
        }

        /* renamed from: d */
        public a m93857d(C17731b c17731b) {
            this.f89872c = c17731b;
            return this;
        }

        /* renamed from: e */
        public a m93858e(C17735f c17735f) {
            this.f89870a = c17735f;
            return this;
        }
    }

    C17730a(C17735f c17735f, List list, C17731b c17731b, String str) {
        this.f89866a = c17735f;
        this.f89867b = list;
        this.f89868c = c17731b;
        this.f89869d = str;
    }

    /* renamed from: e */
    public static a m93848e() {
        return new a();
    }

    /* renamed from: a */
    public String m93849a() {
        return this.f89869d;
    }

    /* renamed from: b */
    public C17731b m93850b() {
        return this.f89868c;
    }

    /* renamed from: c */
    public List m93851c() {
        return this.f89867b;
    }

    /* renamed from: d */
    public C17735f m93852d() {
        return this.f89866a;
    }

    /* renamed from: f */
    public byte[] m93853f() {
        return AbstractC0120m.m546a(this);
    }
}
