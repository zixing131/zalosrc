package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.b */
/* loaded from: classes3.dex */
public abstract class EnumC6741b implements InterfaceC6742c {

    /* renamed from: p */
    public static final EnumC6741b f37095p;

    /* renamed from: q */
    public static final EnumC6741b f37096q;

    /* renamed from: r */
    public static final EnumC6741b f37097r;

    /* renamed from: s */
    public static final EnumC6741b f37098s;

    /* renamed from: t */
    public static final EnumC6741b f37099t;

    /* renamed from: u */
    public static final EnumC6741b f37100u;

    /* renamed from: v */
    private static final /* synthetic */ EnumC6741b[] f37101v;

    /* renamed from: com.google.gson.b$a */
    /* loaded from: classes3.dex */
    enum a extends EnumC6741b {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.InterfaceC6742c
        /* renamed from: b */
        public String mo34515b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f37095p = aVar;
        EnumC6741b enumC6741b = new EnumC6741b("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.b.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6742c
            /* renamed from: b */
            public String mo34515b(Field field) {
                return EnumC6741b.m34514d(field.getName());
            }
        };
        f37096q = enumC6741b;
        EnumC6741b enumC6741b2 = new EnumC6741b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.b.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6742c
            /* renamed from: b */
            public String mo34515b(Field field) {
                return EnumC6741b.m34514d(EnumC6741b.m34513c(field.getName(), " "));
            }
        };
        f37097r = enumC6741b2;
        EnumC6741b enumC6741b3 = new EnumC6741b("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.b.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6742c
            /* renamed from: b */
            public String mo34515b(Field field) {
                return EnumC6741b.m34513c(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f37098s = enumC6741b3;
        EnumC6741b enumC6741b4 = new EnumC6741b("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.b.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6742c
            /* renamed from: b */
            public String mo34515b(Field field) {
                return EnumC6741b.m34513c(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f37099t = enumC6741b4;
        EnumC6741b enumC6741b5 = new EnumC6741b("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.b.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC6742c
            /* renamed from: b */
            public String mo34515b(Field field) {
                return EnumC6741b.m34513c(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f37100u = enumC6741b5;
        f37101v = new EnumC6741b[]{aVar, enumC6741b, enumC6741b2, enumC6741b3, enumC6741b4, enumC6741b5};
    }

    private EnumC6741b(String str, int i11) {
    }

    /* renamed from: c */
    static String m34513c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    /* renamed from: d */
    static String m34514d(String str) {
        int length = str.length() - 1;
        int i11 = 0;
        while (!Character.isLetter(str.charAt(i11)) && i11 < length) {
            i11++;
        }
        char charAt = str.charAt(i11);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i11 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i11) + upperCase + str.substring(i11 + 1);
    }

    public static EnumC6741b valueOf(String str) {
        return (EnumC6741b) Enum.valueOf(EnumC6741b.class, str);
    }

    public static EnumC6741b[] values() {
        return (EnumC6741b[]) f37101v.clone();
    }

    /* synthetic */ EnumC6741b(String str, int i11, a aVar) {
        this(str, i11);
    }
}
