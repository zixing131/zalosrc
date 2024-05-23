package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.j */
/* loaded from: classes3.dex */
public abstract class EnumC6749j {

    /* renamed from: p */
    public static final EnumC6749j f37133p;

    /* renamed from: q */
    public static final EnumC6749j f37134q;

    /* renamed from: r */
    private static final /* synthetic */ EnumC6749j[] f37135r;

    /* renamed from: com.google.gson.j$a */
    /* loaded from: classes3.dex */
    enum a extends EnumC6749j {
        a(String str, int i11) {
            super(str, i11, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f37133p = aVar;
        EnumC6749j enumC6749j = new EnumC6749j("STRING", 1) { // from class: com.google.gson.j.b
            {
                a aVar2 = null;
            }
        };
        f37134q = enumC6749j;
        f37135r = new EnumC6749j[]{aVar, enumC6749j};
    }

    private EnumC6749j(String str, int i11) {
    }

    public static EnumC6749j valueOf(String str) {
        return (EnumC6749j) Enum.valueOf(EnumC6749j.class, str);
    }

    public static EnumC6749j[] values() {
        return (EnumC6749j[]) f37135r.clone();
    }

    /* synthetic */ EnumC6749j(String str, int i11, a aVar) {
        this(str, i11);
    }
}
