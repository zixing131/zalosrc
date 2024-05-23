package i60;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i60.j */
/* loaded from: classes5.dex */
public final class EnumC20344j {

    /* renamed from: q */
    public static final EnumC20344j f100335q = new EnumC20344j("STATE_NONE", 0, 0);

    /* renamed from: r */
    public static final EnumC20344j f100336r = new EnumC20344j("STATE_JUMP_UP", 1, 1);

    /* renamed from: s */
    public static final EnumC20344j f100337s = new EnumC20344j("STATE_JUMP_DOWN", 2, 2);

    /* renamed from: t */
    private static final /* synthetic */ EnumC20344j[] f100338t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f100339u;

    /* renamed from: p */
    private final int f100340p;

    static {
        EnumC20344j[] m106072b = m106072b();
        f100338t = m106072b;
        f100339u = AbstractC30166b.m148796a(m106072b);
    }

    private EnumC20344j(String str, int i11, int i12) {
        this.f100340p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC20344j[] m106072b() {
        return new EnumC20344j[]{f100335q, f100336r, f100337s};
    }

    public static EnumC20344j valueOf(String str) {
        return (EnumC20344j) Enum.valueOf(EnumC20344j.class, str);
    }

    public static EnumC20344j[] values() {
        return (EnumC20344j[]) f100338t.clone();
    }
}
