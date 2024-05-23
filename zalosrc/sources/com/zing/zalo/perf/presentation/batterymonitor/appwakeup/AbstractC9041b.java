package com.zing.zalo.perf.presentation.batterymonitor.appwakeup;

import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import p190gx.AbstractC19676f;

/* renamed from: com.zing.zalo.perf.presentation.batterymonitor.appwakeup.b */
/* loaded from: classes4.dex */
abstract class AbstractC9041b extends AbstractC19676f {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m48318q(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        sb2.append("\t");
        sb2.append(12);
        sb2.append("\t");
        sb2.append(CoreUtility.f89233i);
        sb2.append("\t");
        sb2.append(str);
        sb2.append("\t");
        if (TextUtils.isEmpty(str2)) {
            str2 = "-";
        }
        sb2.append(str2);
        AbstractC19676f.m103249l(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static void m48319r(final String str, final String str2) {
        AbstractC19676f.m103251n(new Runnable() { // from class: com.zing.zalo.perf.presentation.batterymonitor.appwakeup.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC9041b.m48318q(str, str2);
            }
        });
    }
}
