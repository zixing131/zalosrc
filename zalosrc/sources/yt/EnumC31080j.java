package yt;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yt.j */
/* loaded from: classes4.dex */
public final class EnumC31080j {

    /* renamed from: p */
    public static final EnumC31080j f143272p = new EnumC31080j("THEME", 0);

    /* renamed from: q */
    public static final EnumC31080j f143273q = new EnumC31080j("LANGUAGE", 1);

    /* renamed from: r */
    private static final /* synthetic */ EnumC31080j[] f143274r;

    /* renamed from: s */
    private static final /* synthetic */ InterfaceC30165a f143275s;

    static {
        EnumC31080j[] m150996b = m150996b();
        f143274r = m150996b;
        f143275s = AbstractC30166b.m148796a(m150996b);
    }

    private EnumC31080j(String str, int i11) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC31080j[] m150996b() {
        return new EnumC31080j[]{f143272p, f143273q};
    }

    public static EnumC31080j valueOf(String str) {
        return (EnumC31080j) Enum.valueOf(EnumC31080j.class, str);
    }

    public static EnumC31080j[] values() {
        return (EnumC31080j[]) f143274r.clone();
    }
}
