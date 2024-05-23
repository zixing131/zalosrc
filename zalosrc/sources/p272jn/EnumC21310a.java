package p272jn;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: jn.a */
/* loaded from: classes.dex */
public final class EnumC21310a {

    /* renamed from: q */
    public static final EnumC21310a f103787q = new EnumC21310a("TENSOR_FLOW_LITE", 0, "tensorflowLite");

    /* renamed from: r */
    public static final EnumC21310a f103788r = new EnumC21310a("MEDIA_PIPE_FACE_EFFECT", 1, "mediapipe_faceeffect");

    /* renamed from: s */
    private static final /* synthetic */ EnumC21310a[] f103789s;

    /* renamed from: t */
    private static final /* synthetic */ InterfaceC30165a f103790t;

    /* renamed from: p */
    private final String f103791p;

    static {
        EnumC21310a[] m110345b = m110345b();
        f103789s = m110345b;
        f103790t = AbstractC30166b.m148796a(m110345b);
    }

    private EnumC21310a(String str, int i11, String str2) {
        this.f103791p = str2;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC21310a[] m110345b() {
        return new EnumC21310a[]{f103787q, f103788r};
    }

    public static EnumC21310a valueOf(String str) {
        return (EnumC21310a) Enum.valueOf(EnumC21310a.class, str);
    }

    public static EnumC21310a[] values() {
        return (EnumC21310a[]) f103789s.clone();
    }

    /* renamed from: c */
    public final String m110346c() {
        return this.f103791p;
    }
}
