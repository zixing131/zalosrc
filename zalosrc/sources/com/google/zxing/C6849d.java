package com.google.zxing;

import java.util.Map;
import p017ab.C0672a;
import p522ta.C26610a;
import p638xa.C29553a;
import va.C27954b;
import za.C31729b;
import za.C31731d;
import za.C31733f;
import za.C31735h;
import za.C31737j;
import za.C31738k;
import za.C31739l;
import za.C31742o;
import za.C31746s;

/* renamed from: com.google.zxing.d */
/* loaded from: classes3.dex */
public final class C6849d implements InterfaceC6850e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.zxing.d$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f37574a;

        static {
            int[] iArr = new int[EnumC6846a.values().length];
            f37574a = iArr;
            try {
                iArr[EnumC6846a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37574a[EnumC6846a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37574a[EnumC6846a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37574a[EnumC6846a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37574a[EnumC6846a.CODE_39.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37574a[EnumC6846a.CODE_93.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37574a[EnumC6846a.CODE_128.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37574a[EnumC6846a.ITF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37574a[EnumC6846a.PDF_417.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37574a[EnumC6846a.CODABAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37574a[EnumC6846a.DATA_MATRIX.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37574a[EnumC6846a.AZTEC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @Override // com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        InterfaceC6850e c31738k;
        switch (a.f37574a[enumC6846a.ordinal()]) {
            case 1:
                c31738k = new C31738k();
                break;
            case 2:
                c31738k = new C31746s();
                break;
            case 3:
                c31738k = new C31737j();
                break;
            case 4:
                c31738k = new C31742o();
                break;
            case 5:
                c31738k = new C31733f();
                break;
            case 6:
                c31738k = new C31735h();
                break;
            case 7:
                c31738k = new C31731d();
                break;
            case 8:
                c31738k = new C31739l();
                break;
            case 9:
                c31738k = new C0672a();
                break;
            case 10:
                c31738k = new C31729b();
                break;
            case 11:
                c31738k = new C29553a();
                break;
            case 12:
                c31738k = new C26610a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + enumC6846a);
        }
        return c31738k.mo960a(str, enumC6846a, i11, i12, map);
    }
}
