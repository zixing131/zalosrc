package q40;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q40.i */
/* loaded from: classes5.dex */
public final class EnumC25120i {

    /* renamed from: p */
    public static final EnumC25120i f120644p = new EnumC25120i("COPIED", 0);

    /* renamed from: q */
    public static final EnumC25120i f120645q = new EnumC25120i("BACKUP_DRIVE_SUCCESS", 1);

    /* renamed from: r */
    public static final EnumC25120i f120646r = new EnumC25120i("ERROR_DRIVE_FULL_STORAGE", 2);

    /* renamed from: s */
    public static final EnumC25120i f120647s = new EnumC25120i("ERROR_BACKUP_DRIVE", 3);

    /* renamed from: t */
    private static final /* synthetic */ EnumC25120i[] f120648t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f120649u;

    static {
        EnumC25120i[] m130213b = m130213b();
        f120648t = m130213b;
        f120649u = AbstractC30166b.m148796a(m130213b);
    }

    private EnumC25120i(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC25120i[] m130213b() {
        return new EnumC25120i[]{f120644p, f120645q, f120646r, f120647s};
    }

    public static EnumC25120i valueOf(String str) {
        return (EnumC25120i) Enum.valueOf(EnumC25120i.class, str);
    }

    public static EnumC25120i[] values() {
        return (EnumC25120i[]) f120648t.clone();
    }
}
