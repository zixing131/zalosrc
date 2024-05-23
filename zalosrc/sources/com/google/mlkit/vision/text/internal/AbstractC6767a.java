package com.google.mlkit.vision.text.internal;

import p012a6.C0271gc;
import p012a6.C0368le;
import p012a6.C0427og;
import p012a6.C0484rg;
import p012a6.EnumC0214dc;
import p012a6.EnumC0233ec;
import p012a6.EnumC0252fc;
import p012a6.EnumC0501se;
import p012a6.InterfaceC0218dg;
import p012a6.InterfaceC0408ng;

/* renamed from: com.google.mlkit.vision.text.internal.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6767a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static EnumC0501se m34592a(int i11) {
        switch (i11) {
            case 1:
                return EnumC0501se.LATIN;
            case 2:
                return EnumC0501se.LATIN_AND_CHINESE;
            case 3:
                return EnumC0501se.LATIN_AND_DEVANAGARI;
            case 4:
                return EnumC0501se.LATIN_AND_JAPANESE;
            case 5:
                return EnumC0501se.LATIN_AND_KOREAN;
            case 6:
                return EnumC0501se.CREDIT_CARD;
            case 7:
                return EnumC0501se.DOCUMENT;
            default:
                return EnumC0501se.TYPE_UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m34593b(C0427og c0427og, final boolean z11, final EnumC0233ec enumC0233ec) {
        c0427og.m815f(new InterfaceC0408ng() { // from class: ra.e
            @Override // p012a6.InterfaceC0408ng
            public final InterfaceC0218dg zza() {
                EnumC0214dc enumC0214dc;
                boolean z12 = z11;
                EnumC0233ec enumC0233ec2 = enumC0233ec;
                C0271gc c0271gc = new C0271gc();
                if (z12) {
                    enumC0214dc = EnumC0214dc.TYPE_THICK;
                } else {
                    enumC0214dc = EnumC0214dc.TYPE_THIN;
                }
                c0271gc.m735e(enumC0214dc);
                C0368le c0368le = new C0368le();
                c0368le.m783b(enumC0233ec2);
                c0271gc.m737g(c0368le.m784c());
                return C0484rg.m868d(c0271gc);
            }
        }, EnumC0252fc.ON_DEVICE_TEXT_LOAD);
    }
}
