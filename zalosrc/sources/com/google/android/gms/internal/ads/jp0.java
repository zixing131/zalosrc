package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class jp0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f22914p;

    /* renamed from: q */
    final /* synthetic */ String f22915q;

    /* renamed from: r */
    final /* synthetic */ String f22916r;

    /* renamed from: s */
    final /* synthetic */ String f22917s;

    /* renamed from: t */
    final /* synthetic */ kp0 f22918t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jp0(kp0 kp0Var, String str, String str2, String str3, String str4) {
        this.f22918t = kp0Var;
        this.f22914p = str;
        this.f22915q = str2;
        this.f22916r = str3;
        this.f22917s = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c11;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f22914p);
        if (!TextUtils.isEmpty(this.f22915q)) {
            hashMap.put("cachedSrc", this.f22915q);
        }
        String str = this.f22916r;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 96784904:
                if (str.equals(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR)) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        String str2 = "internal";
        switch (c11) {
            case 6:
            case 7:
                str2 = "io";
                break;
            case '\b':
            case '\t':
                str2 = "network";
                break;
            case '\n':
            case 11:
                str2 = "policy";
                break;
        }
        hashMap.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, str2);
        hashMap.put("reason", this.f22916r);
        if (!TextUtils.isEmpty(this.f22917s)) {
            hashMap.put("message", this.f22917s);
        }
        kp0.m23992h(this.f22918t, "onPrecacheEvent", hashMap);
    }
}
