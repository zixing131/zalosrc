package com.zing.zalo.zdesign.component.avatar;

import android.content.Context;
import fn0.AbstractC19074t;
import ui0.C27276c;

/* renamed from: com.zing.zalo.zdesign.component.avatar.e */
/* loaded from: classes7.dex */
public enum EnumC16949e {
    SIZE_16,
    SIZE_24,
    SIZE_32,
    SIZE_40,
    SIZE_48,
    SIZE_58,
    SIZE_64,
    SIZE_96,
    SIZE_128;

    /* renamed from: com.zing.zalo.zdesign.component.avatar.e$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86525a;

        static {
            int[] iArr = new int[EnumC16949e.values().length];
            try {
                iArr[EnumC16949e.SIZE_16.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16949e.SIZE_24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16949e.SIZE_32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC16949e.SIZE_40.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC16949e.SIZE_48.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC16949e.SIZE_58.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC16949e.SIZE_64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC16949e.SIZE_96.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC16949e.SIZE_128.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f86525a = iArr;
        }
    }

    /* renamed from: c */
    public final int m90779c(Context context) {
        AbstractC19074t.m100208f(context, "context");
        switch (a.f86525a[ordinal()]) {
            case 1:
                return C27276c.m139649b(context, 16);
            case 2:
                return C27276c.m139649b(context, 24);
            case 3:
                return C27276c.m139649b(context, 32);
            case 4:
                return C27276c.m139649b(context, 40);
            case 5:
                return C27276c.m139649b(context, 48);
            case 6:
                return C27276c.m139649b(context, 58);
            case 7:
                return C27276c.m139649b(context, 64);
            case 8:
                return C27276c.m139649b(context, 96);
            case 9:
                return C27276c.m139649b(context, 128);
            default:
                return C27276c.m139649b(context, 48);
        }
    }
}
