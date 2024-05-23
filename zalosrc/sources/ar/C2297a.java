package ar;

import com.zing.zalo.control.ContactProfile;
import p716zh.C31973j5;

/* renamed from: ar.a */
/* loaded from: classes4.dex */
public class C2297a extends AbstractC2325z {

    /* renamed from: b */
    private final boolean f9700b;

    /* renamed from: c */
    private final ContactProfile f9701c;

    /* renamed from: d */
    private final C31973j5 f9702d;

    /* renamed from: e */
    private final String f9703e;

    /* renamed from: ar.a$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        private boolean f9704a;

        /* renamed from: b */
        private ContactProfile f9705b;

        /* renamed from: c */
        private C31973j5 f9706c;

        /* renamed from: d */
        private String f9707d;

        /* renamed from: a */
        public C2297a m12144a() {
            return new C2297a(this.f9704a, this.f9705b, this.f9706c, this.f9707d);
        }

        /* renamed from: b */
        public a m12145b(ContactProfile contactProfile) {
            this.f9705b = contactProfile;
            return this;
        }

        /* renamed from: c */
        public a m12146c(C31973j5 c31973j5) {
            this.f9706c = c31973j5;
            return this;
        }

        /* renamed from: d */
        public a m12147d(boolean z11) {
            this.f9704a = z11;
            return this;
        }

        /* renamed from: e */
        public a m12148e(String str) {
            this.f9707d = str;
            return this;
        }
    }

    /* renamed from: b */
    public static a m12139b() {
        return new a();
    }

    /* renamed from: c */
    public ContactProfile m12140c() {
        return this.f9701c;
    }

    /* renamed from: d */
    public C31973j5 m12141d() {
        return this.f9702d;
    }

    /* renamed from: e */
    public String m12142e() {
        return this.f9703e;
    }

    /* renamed from: f */
    public boolean m12143f() {
        return this.f9700b;
    }

    private C2297a(boolean z11, ContactProfile contactProfile, C31973j5 c31973j5, String str) {
        this.f9700b = z11;
        this.f9701c = contactProfile;
        this.f9702d = c31973j5;
        this.f9703e = str;
        m12283a(2);
    }
}
