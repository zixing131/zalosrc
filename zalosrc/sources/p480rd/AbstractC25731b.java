package p480rd;

import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: rd.b */
/* loaded from: classes3.dex */
public abstract class AbstractC25731b {

    /* renamed from: a */
    private final String f122850a;

    /* renamed from: b */
    private long f122851b;

    /* renamed from: rd.b$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC25731b {

        /* renamed from: c */
        private ContactProfile f122852c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j11, ContactProfile contactProfile) {
            super(str, j11, null);
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(contactProfile, "profile");
            this.f122852c = contactProfile;
        }

        @Override // p480rd.AbstractC25731b
        /* renamed from: c */
        public long mo132825c() {
            return m132826d();
        }

        @Override // p480rd.AbstractC25731b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a mo132823a() {
            return new a(m132824b(), m132826d(), this.f122852c);
        }

        /* renamed from: g */
        public final ContactProfile m132829g() {
            return this.f122852c;
        }

        public String toString() {
            return m132824b();
        }
    }

    public /* synthetic */ AbstractC25731b(String str, long j11, AbstractC19060k abstractC19060k) {
        this(str, j11);
    }

    /* renamed from: a */
    public abstract AbstractC25731b mo132823a();

    /* renamed from: b */
    public final String m132824b() {
        return this.f122850a;
    }

    /* renamed from: c */
    public abstract long mo132825c();

    /* renamed from: d */
    public final long m132826d() {
        return this.f122851b;
    }

    /* renamed from: e */
    public final void m132827e(long j11) {
        this.f122851b = j11;
    }

    private AbstractC25731b(String str, long j11) {
        this.f122850a = str;
        this.f122851b = j11;
    }
}
