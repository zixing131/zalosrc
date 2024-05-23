package p425po;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: po.j */
/* loaded from: classes4.dex */
public abstract class AbstractC24888j extends AbstractC24887i {

    /* renamed from: b */
    private final String f119415b;

    /* renamed from: c */
    private final a f119416c;

    /* renamed from: d */
    private final String f119417d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: po.j$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f119418p = new a("CATEGORY", 0);

        /* renamed from: q */
        public static final a f119419q = new a("ALPHABET", 1);

        /* renamed from: r */
        private static final /* synthetic */ a[] f119420r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f119421s;

        static {
            a[] m129411b = m129411b();
            f119420r = m129411b;
            f119421s = AbstractC30166b.m148796a(m129411b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m129411b() {
            return new a[]{f119418p, f119419q};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f119420r.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC24888j(String str, a aVar, String str2) {
        super(3);
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(aVar, "sectionType");
        AbstractC19074t.m100208f(str2, "tag");
        this.f119415b = str;
        this.f119416c = aVar;
        this.f119417d = str2;
    }

    /* renamed from: b */
    public a mo129391b() {
        return this.f119416c;
    }

    /* renamed from: c */
    public String mo129392c() {
        return this.f119417d;
    }

    /* renamed from: d */
    public abstract String mo129410d();

    public /* synthetic */ AbstractC24888j(String str, a aVar, String str2, int i11, AbstractC19060k abstractC19060k) {
        this(str, aVar, (i11 & 4) != 0 ? "" : str2);
    }
}
