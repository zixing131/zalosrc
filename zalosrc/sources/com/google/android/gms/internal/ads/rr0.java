package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
final class rr0 implements c40 {

    /* renamed from: a */
    final /* synthetic */ tr0 f27358a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rr0(tr0 tr0Var) {
        this.f27358a = tr0Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19973a(Object obj, Map map) {
        int i11;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f27358a) {
                        try {
                            tr0 tr0Var = this.f27358a;
                            i11 = tr0Var.f28496U;
                            if (i11 != parseInt) {
                                tr0Var.f28496U = parseInt;
                                this.f27358a.requestLayout();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Exception e11) {
                    yk0.zzk("Exception occurred while getting webview content height", e11);
                }
            }
        }
    }
}
