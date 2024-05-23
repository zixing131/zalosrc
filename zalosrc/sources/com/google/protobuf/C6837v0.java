package com.google.protobuf;

/* renamed from: com.google.protobuf.v0 */
/* loaded from: classes3.dex */
final class C6837v0 implements InterfaceC6803g0 {

    /* renamed from: a */
    private final InterfaceC6809i0 f37503a;

    /* renamed from: b */
    private final String f37504b;

    /* renamed from: c */
    private final Object[] f37505c;

    /* renamed from: d */
    private final int f37506d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6837v0(InterfaceC6809i0 interfaceC6809i0, String str, Object[] objArr) {
        String str2;
        Throwable e11;
        char charAt;
        this.f37503a = interfaceC6809i0;
        this.f37504b = str;
        this.f37505c = objArr;
        int i11 = 1;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str3 = new String(charArray);
            try {
                try {
                    charAt = str3.charAt(0);
                    str = str3;
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e12) {
                    str2 = str3;
                    e11 = e12;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e11);
                }
            } catch (StringIndexOutOfBoundsException unused2) {
                char[] cArr = new char[str3.length()];
                str3.getChars(0, str3.length(), cArr, 0);
                str2 = new String(cArr);
                try {
                    charAt = str2.charAt(0);
                    str = str2;
                } catch (ArrayIndexOutOfBoundsException e13) {
                    e11 = e13;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e11);
                } catch (StringIndexOutOfBoundsException e14) {
                    e11 = e14;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e11);
                }
            }
        }
        if (charAt < 55296) {
            this.f37506d = charAt;
            return;
        }
        int i12 = charAt & 8191;
        int i13 = 13;
        while (true) {
            int i14 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i12 |= (charAt2 & 8191) << i13;
                i13 += 13;
                i11 = i14;
            } else {
                this.f37506d = (charAt2 << i13) | i12;
                return;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC6803g0
    /* renamed from: a */
    public boolean mo34835a() {
        return (this.f37506d & 2) == 2;
    }

    @Override // com.google.protobuf.InterfaceC6803g0
    /* renamed from: b */
    public InterfaceC6809i0 mo34836b() {
        return this.f37503a;
    }

    @Override // com.google.protobuf.InterfaceC6803g0
    /* renamed from: c */
    public EnumC6831s0 mo34837c() {
        if ((this.f37506d & 1) == 1) {
            return EnumC6831s0.PROTO2;
        }
        return EnumC6831s0.PROTO3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] m35152d() {
        return this.f37505c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m35153e() {
        return this.f37504b;
    }
}
