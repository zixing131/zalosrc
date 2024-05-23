package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* loaded from: classes2.dex */
abstract /* synthetic */ class xq0 {

    /* renamed from: a */
    static final /* synthetic */ int[] f30574a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f30574a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30574a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30574a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f30574a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f30574a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
