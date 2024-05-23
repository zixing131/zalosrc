package p056cj;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cj.g */
/* loaded from: classes3.dex */
public final class EnumC3539g {
    public static final a Companion;

    /* renamed from: q */
    public static final EnumC3539g f14933q = new EnumC3539g("Unknown", 0, -1);

    /* renamed from: r */
    public static final EnumC3539g f14934r = new EnumC3539g("NotChanging", 1, 0);

    /* renamed from: s */
    public static final EnumC3539g f14935s = new EnumC3539g("Changed", 2, 1);

    /* renamed from: t */
    private static final /* synthetic */ EnumC3539g[] f14936t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f14937u;

    /* renamed from: p */
    private final int f14938p;

    /* renamed from: cj.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EnumC3539g m17989a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return EnumC3539g.f14933q;
                }
                return EnumC3539g.f14935s;
            }
            return EnumC3539g.f14934r;
        }
    }

    static {
        EnumC3539g[] m17987b = m17987b();
        f14936t = m17987b;
        f14937u = AbstractC30166b.m148796a(m17987b);
        Companion = new a(null);
    }

    private EnumC3539g(String str, int i11, int i12) {
        this.f14938p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC3539g[] m17987b() {
        return new EnumC3539g[]{f14933q, f14934r, f14935s};
    }

    public static EnumC3539g valueOf(String str) {
        return (EnumC3539g) Enum.valueOf(EnumC3539g.class, str);
    }

    public static EnumC3539g[] values() {
        return (EnumC3539g[]) f14936t.clone();
    }

    /* renamed from: c */
    public final int m17988c() {
        return this.f14938p;
    }
}
