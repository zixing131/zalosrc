package p091d4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: d4.d */
/* loaded from: classes.dex */
public final class C17733d {

    /* renamed from: c */
    private static final C17733d f89891c = new a().m93873a();

    /* renamed from: a */
    private final String f89892a;

    /* renamed from: b */
    private final List f89893b;

    /* renamed from: d4.d$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private String f89894a = "";

        /* renamed from: b */
        private List f89895b = new ArrayList();

        a() {
        }

        /* renamed from: a */
        public C17733d m93873a() {
            return new C17733d(this.f89894a, Collections.unmodifiableList(this.f89895b));
        }

        /* renamed from: b */
        public a m93874b(List list) {
            this.f89895b = list;
            return this;
        }

        /* renamed from: c */
        public a m93875c(String str) {
            this.f89894a = str;
            return this;
        }
    }

    C17733d(String str, List list) {
        this.f89892a = str;
        this.f89893b = list;
    }

    /* renamed from: c */
    public static a m93870c() {
        return new a();
    }

    /* renamed from: a */
    public List m93871a() {
        return this.f89893b;
    }

    /* renamed from: b */
    public String m93872b() {
        return this.f89892a;
    }
}
