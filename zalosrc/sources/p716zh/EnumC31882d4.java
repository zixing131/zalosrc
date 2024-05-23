package p716zh;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: zh.d4 */
/* loaded from: classes3.dex */
public final class EnumC31882d4 {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC31882d4 f146443q = new EnumC31882d4("OFF", 0, 0);

    /* renamed from: r */
    public static final EnumC31882d4 f146444r = new EnumC31882d4("INCOGNITO_FULL", 1, 1);

    /* renamed from: s */
    private static final /* synthetic */ EnumC31882d4[] f146445s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f146446t;

    /* renamed from: p */
    private final int f146447p;

    /* renamed from: zh.d4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC31882d4 m153208a(int i11) {
            EnumC31882d4 enumC31882d4 = EnumC31882d4.f146444r;
            if (i11 < enumC31882d4.m153207c()) {
                return EnumC31882d4.f146443q;
            }
            return enumC31882d4;
        }
    }

    static {
        EnumC31882d4[] m153206b = m153206b();
        f146445s = m153206b;
        f146446t = AbstractC30166b.m148796a(m153206b);
        Companion = new a(null);
    }

    private EnumC31882d4(String str, int i11, int i12) {
        this.f146447p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC31882d4[] m153206b() {
        return new EnumC31882d4[]{f146443q, f146444r};
    }

    public static EnumC31882d4 valueOf(String str) {
        return (EnumC31882d4) Enum.valueOf(EnumC31882d4.class, str);
    }

    public static EnumC31882d4[] values() {
        return (EnumC31882d4[]) f146445s.clone();
    }

    /* renamed from: c */
    public final int m153207c() {
        return this.f146447p;
    }
}
