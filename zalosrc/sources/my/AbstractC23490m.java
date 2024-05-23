package my;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: my.m */
/* loaded from: classes4.dex */
public abstract class AbstractC23490m {

    /* renamed from: a */
    private final int f114043a;

    /* renamed from: b */
    private final String f114044b;

    /* renamed from: c */
    private final String f114045c;

    /* renamed from: my.m$a */
    /* loaded from: classes4.dex */
    public static final class a extends f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, String str, String str2) {
            super(i11, str, str2, null);
            AbstractC19074t.m100208f(str, "raw");
            AbstractC19074t.m100208f(str2, "uri");
        }
    }

    /* renamed from: my.m$b */
    /* loaded from: classes4.dex */
    public static final class b extends f {

        /* renamed from: e */
        private final String f114046e;

        /* renamed from: f */
        private String f114047f;

        /* renamed from: g */
        private byte[] f114048g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, String str, String str2, String str3, String str4, byte[] bArr) {
            super(i11, str, str2, null);
            AbstractC19074t.m100208f(str, "raw");
            AbstractC19074t.m100208f(str2, "uri");
            this.f114046e = str3;
            this.f114047f = str4;
            this.f114048g = bArr;
        }

        /* renamed from: c */
        public final String m123295c() {
            return this.f114047f;
        }

        /* renamed from: d */
        public final byte[] m123296d() {
            return this.f114048g;
        }

        /* renamed from: e */
        public final String m123297e() {
            return this.f114046e;
        }

        /* renamed from: f */
        public final void m123298f(String str) {
            this.f114047f = str;
        }

        /* renamed from: g */
        public final void m123299g(byte[] bArr) {
            this.f114048g = bArr;
        }
    }

    /* renamed from: my.m$c */
    /* loaded from: classes4.dex */
    public static final class c extends e {

        /* renamed from: d */
        private final String f114049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, String str, String str2) {
            super(i11, str, str2, null);
            AbstractC19074t.m100208f(str, "raw");
            AbstractC19074t.m100208f(str2, "phoneNumber");
            this.f114049d = str2;
        }

        /* renamed from: c */
        public final String m123300c() {
            return this.f114049d;
        }
    }

    /* renamed from: my.m$d */
    /* loaded from: classes4.dex */
    public static final class d extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i11, String str) {
            super(i11, str, str, null);
            AbstractC19074t.m100208f(str, "raw");
        }
    }

    /* renamed from: my.m$e */
    /* loaded from: classes4.dex */
    public static abstract class e extends AbstractC23490m {
        public /* synthetic */ e(int i11, String str, String str2, AbstractC19060k abstractC19060k) {
            this(i11, str, str2);
        }

        private e(int i11, String str, String str2) {
            super(i11, str, str2, null);
        }
    }

    /* renamed from: my.m$f */
    /* loaded from: classes4.dex */
    public static abstract class f extends AbstractC23490m {

        /* renamed from: d */
        private final String f114050d;

        public /* synthetic */ f(int i11, String str, String str2, AbstractC19060k abstractC19060k) {
            this(i11, str, str2);
        }

        private f(int i11, String str, String str2) {
            super(i11, str, str2, null);
            this.f114050d = str2;
        }
    }

    public /* synthetic */ AbstractC23490m(int i11, String str, String str2, AbstractC19060k abstractC19060k) {
        this(i11, str, str2);
    }

    /* renamed from: a */
    public final String m123293a() {
        return this.f114044b;
    }

    /* renamed from: b */
    public final String m123294b() {
        return this.f114045c;
    }

    private AbstractC23490m(int i11, String str, String str2) {
        this.f114043a = i11;
        this.f114044b = str;
        this.f114045c = str2;
    }
}
