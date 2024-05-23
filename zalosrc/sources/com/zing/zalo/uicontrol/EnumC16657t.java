package com.zing.zalo.uicontrol;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.zing.zalo.uicontrol.t */
/* loaded from: classes4.dex */
public final class EnumC16657t {

    /* renamed from: q */
    public static final EnumC16657t f84432q = new EnumC16657t("PTT_FREE_HAND_ACTION_STATE_NONE", 0, 0);

    /* renamed from: r */
    public static final EnumC16657t f84433r = new EnumC16657t("PTT_FREE_HAND_ACTION_STATE_SEND", 1, 1);

    /* renamed from: s */
    public static final EnumC16657t f84434s = new EnumC16657t("PTT_FREE_HAND_ACTION_STATE_CANCEL", 2, 2);

    /* renamed from: t */
    private static final /* synthetic */ EnumC16657t[] f84435t;

    /* renamed from: u */
    private static final /* synthetic */ InterfaceC30165a f84436u;

    /* renamed from: p */
    private final int f84437p;

    static {
        EnumC16657t[] m88773b = m88773b();
        f84435t = m88773b;
        f84436u = AbstractC30166b.m148796a(m88773b);
    }

    private EnumC16657t(String str, int i11, int i12) {
        this.f84437p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC16657t[] m88773b() {
        return new EnumC16657t[]{f84432q, f84433r, f84434s};
    }

    public static EnumC16657t valueOf(String str) {
        return (EnumC16657t) Enum.valueOf(EnumC16657t.class, str);
    }

    public static EnumC16657t[] values() {
        return (EnumC16657t[]) f84435t.clone();
    }
}
