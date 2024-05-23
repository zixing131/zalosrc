package p586vt;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: vt.c */
/* loaded from: classes4.dex */
public abstract class AbstractC28618c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f132700a;

    /* renamed from: b */
    private int f132701b;

    /* renamed from: c */
    private int f132702c;

    /* renamed from: d */
    private String f132703d;

    /* renamed from: vt.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public AbstractC28618c(int i11, int i12, int i13, String str) {
        AbstractC19074t.m100208f(str, "errorMes");
        this.f132700a = i11;
        this.f132701b = i12;
        this.f132702c = i13;
        this.f132703d = str;
    }

    /* renamed from: a */
    public final int m143140a() {
        return this.f132702c;
    }

    /* renamed from: b */
    public final String m143141b() {
        return this.f132703d;
    }

    /* renamed from: c */
    public final int m143142c() {
        return this.f132700a;
    }

    /* renamed from: d */
    public final int m143143d() {
        return this.f132701b;
    }

    /* renamed from: e */
    public abstract boolean mo97004e();

    public String toString() {
        return "JobErrorData(errorPhase=" + this.f132700a + ", errorPos=" + this.f132701b + ", errorCode=" + this.f132702c + ", errorMes='" + this.f132703d + "')";
    }
}
