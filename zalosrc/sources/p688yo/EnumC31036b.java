package p688yo;

import kotlin.NoWhenBranchMatchedException;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yo.b */
/* loaded from: classes4.dex */
public final class EnumC31036b {

    /* renamed from: p */
    public static final EnumC31036b f143137p = new EnumC31036b("MAIN", 0);

    /* renamed from: q */
    public static final EnumC31036b f143138q = new EnumC31036b("OTHER", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC31036b[] f143139r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f143140s;

    /* renamed from: yo.b$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f143141a;

        static {
            int[] iArr = new int[EnumC31036b.values().length];
            try {
                iArr[EnumC31036b.f143137p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31036b.f143138q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f143141a = iArr;
        }
    }

    static {
        EnumC31036b[] m150863b = m150863b();
        f143139r = m150863b;
        f143140s = AbstractC30166b.m148796a(m150863b);
    }

    private EnumC31036b(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC31036b[] m150863b() {
        return new EnumC31036b[]{f143137p, f143138q};
    }

    public static EnumC31036b valueOf(String str) {
        return (EnumC31036b) Enum.valueOf(EnumC31036b.class, str);
    }

    public static EnumC31036b[] values() {
        return (EnumC31036b[]) f143139r.clone();
    }

    /* renamed from: c */
    public final int m150864c() {
        int i11 = a.f143141a[ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }
}
