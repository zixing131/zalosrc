package p140ev;

import fn0.AbstractC19060k;
import java.io.Serializable;

/* renamed from: ev.b */
/* loaded from: classes4.dex */
public final class C18613b implements Serializable {

    /* renamed from: p */
    private final int f93608p;
    public static final a Companion = new a(null);

    /* renamed from: q */
    public static final C18613b f93598q = new C18613b(1);

    /* renamed from: r */
    public static final C18613b f93599r = new C18613b(2);

    /* renamed from: s */
    public static final C18613b f93600s = new C18613b(3);

    /* renamed from: t */
    public static final C18613b f93601t = new C18613b(4);

    /* renamed from: u */
    public static final C18613b f93602u = new C18613b(5);

    /* renamed from: v */
    public static final C18613b f93603v = new C18613b(6);

    /* renamed from: w */
    public static final C18613b f93604w = new C18613b(7);

    /* renamed from: x */
    public static final C18613b f93605x = new C18613b(8);

    /* renamed from: y */
    public static final C18613b f93606y = new C18613b(100);

    /* renamed from: z */
    public static final C18613b f93607z = new C18613b(19);

    /* renamed from: A */
    public static final C18613b f93596A = new C18613b(22);

    /* renamed from: B */
    public static final C18613b f93597B = new C18613b(23);

    /* renamed from: ev.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m98349a(int i11) {
            return i11 > 0;
        }
    }

    public C18613b(int i11) {
        this.f93608p = i11;
    }

    /* renamed from: a */
    public final int m98348a() {
        return this.f93608p;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C18613b) && ((C18613b) obj).f93608p == this.f93608p) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f93608p << 10;
    }
}
