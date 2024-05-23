package og0;

import fn0.AbstractC19060k;
import java.util.NoSuchElementException;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: og0.b */
/* loaded from: classes7.dex */
public final class EnumC24251b extends Enum {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC24251b f117146q = new EnumC24251b("CLOUD_MEDIA", 0, 1);

    /* renamed from: r */
    public static final EnumC24251b f117147r = new EnumC24251b("MY_CLOUD", 1, 2);

    /* renamed from: s */
    public static final EnumC24251b f117148s = new EnumC24251b("TEXT_MESSAGE_BACKUP", 2, 4);

    /* renamed from: t */
    private static final /* synthetic */ EnumC24251b[] f117149t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f117150u;

    /* renamed from: p */
    private final int f117151p;

    /* renamed from: og0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC24251b m126593a(int i11) {
            for (EnumC24251b enumC24251b : EnumC24251b.values()) {
                if (enumC24251b.m126592c() == i11) {
                    return enumC24251b;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    static {
        EnumC24251b[] m126591b = m126591b();
        f117149t = m126591b;
        f117150u = AbstractC30166b.m148796a(m126591b);
        Companion = new a(null);
    }

    private EnumC24251b(String str, int i11, int i12) {
        super(str, i11);
        this.f117151p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC24251b[] m126591b() {
        return new EnumC24251b[]{f117146q, f117147r, f117148s};
    }

    public static EnumC24251b valueOf(String str) {
        return (EnumC24251b) Enum.valueOf(EnumC24251b.class, str);
    }

    public static EnumC24251b[] values() {
        return (EnumC24251b[]) f117149t.clone();
    }

    /* renamed from: c */
    public final int m126592c() {
        return this.f117151p;
    }
}
