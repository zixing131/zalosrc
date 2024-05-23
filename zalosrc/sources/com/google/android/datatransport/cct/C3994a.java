package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p010a4.InterfaceC0114g;
import p668y3.C30276b;

/* renamed from: com.google.android.datatransport.cct.a */
/* loaded from: classes.dex */
public final class C3994a implements InterfaceC0114g {

    /* renamed from: c */
    static final String f15791c;

    /* renamed from: d */
    static final String f15792d;

    /* renamed from: e */
    private static final String f15793e;

    /* renamed from: f */
    private static final Set f15794f;

    /* renamed from: g */
    public static final C3994a f15795g;

    /* renamed from: h */
    public static final C3994a f15796h;

    /* renamed from: a */
    private final String f15797a;

    /* renamed from: b */
    private final String f15798b;

    static {
        String m18905a = AbstractC3998e.m18905a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f15791c = m18905a;
        String m18905a2 = AbstractC3998e.m18905a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f15792d = m18905a2;
        String m18905a3 = AbstractC3998e.m18905a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f15793e = m18905a3;
        f15794f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C30276b.m149414b("proto"), C30276b.m149414b("json"))));
        f15795g = new C3994a(m18905a, null);
        f15796h = new C3994a(m18905a2, m18905a3);
    }

    public C3994a(String str, String str2) {
        this.f15797a = str;
        this.f15798b = str2;
    }

    /* renamed from: d */
    public static C3994a m18887d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C3994a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // p010a4.InterfaceC0113f
    /* renamed from: a */
    public String mo527a() {
        return "cct";
    }

    @Override // p010a4.InterfaceC0114g
    /* renamed from: b */
    public Set mo528b() {
        return f15794f;
    }

    /* renamed from: c */
    public byte[] m18888c() {
        String str = this.f15798b;
        if (str == null && this.f15797a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f15797a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public String m18889e() {
        return this.f15798b;
    }

    /* renamed from: f */
    public String m18890f() {
        return this.f15797a;
    }

    @Override // p010a4.InterfaceC0113f
    public byte[] getExtras() {
        return m18888c();
    }
}
