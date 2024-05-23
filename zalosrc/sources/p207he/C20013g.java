package p207he;

import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import pm0.C24860q;

/* renamed from: he.g */
/* loaded from: classes3.dex */
public final class C20013g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final HashMap f98394a = new HashMap();

    /* renamed from: b */
    private final HashMap f98395b = new HashMap();

    /* renamed from: he.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: a */
    public final int m103871a(ContactProfile.C7867c c7867c) {
        AbstractC19074t.m100208f(c7867c, "dept");
        int hashCode = (c7867c.m40441a() + "audio").hashCode();
        this.f98394a.put(Integer.valueOf(hashCode), c7867c);
        return hashCode;
    }

    /* renamed from: b */
    public final int m103872b(ContactProfile.C7867c c7867c) {
        AbstractC19074t.m100208f(c7867c, "dept");
        int hashCode = (c7867c.m40441a() + "video").hashCode();
        this.f98395b.put(Integer.valueOf(hashCode), c7867c);
        return hashCode;
    }

    /* renamed from: c */
    public final C24860q m103873c(int i11) {
        ContactProfile.C7867c c7867c = (ContactProfile.C7867c) this.f98394a.get(Integer.valueOf(i11));
        if (c7867c != null) {
            return new C24860q(Boolean.FALSE, c7867c);
        }
        ContactProfile.C7867c c7867c2 = (ContactProfile.C7867c) this.f98395b.get(Integer.valueOf(i11));
        if (c7867c2 != null) {
            return new C24860q(Boolean.TRUE, c7867c2);
        }
        return null;
    }

    /* renamed from: d */
    public final void m103874d() {
        this.f98394a.clear();
    }

    /* renamed from: e */
    public final void m103875e() {
        this.f98395b.clear();
    }
}
