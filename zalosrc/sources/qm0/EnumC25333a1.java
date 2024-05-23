package qm0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qm0.a1 */
/* loaded from: classes7.dex */
final class EnumC25333a1 {

    /* renamed from: p */
    public static final EnumC25333a1 f121513p = new EnumC25333a1("Ready", 0);

    /* renamed from: q */
    public static final EnumC25333a1 f121514q = new EnumC25333a1("NotReady", 1);

    /* renamed from: r */
    public static final EnumC25333a1 f121515r = new EnumC25333a1("Done", 2);

    /* renamed from: s */
    public static final EnumC25333a1 f121516s = new EnumC25333a1("Failed", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC25333a1[] f121517t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f121518u;

    static {
        EnumC25333a1[] m131229b = m131229b();
        f121517t = m131229b;
        f121518u = AbstractC30166b.m148796a(m131229b);
    }

    private EnumC25333a1(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25333a1[] m131229b() {
        return new EnumC25333a1[]{f121513p, f121514q, f121515r, f121516s};
    }

    public static EnumC25333a1 valueOf(String str) {
        return (EnumC25333a1) Enum.valueOf(EnumC25333a1.class, str);
    }

    public static EnumC25333a1[] values() {
        return (EnumC25333a1[]) f121517t.clone();
    }
}
