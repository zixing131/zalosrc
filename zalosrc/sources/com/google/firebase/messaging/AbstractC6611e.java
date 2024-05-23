package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import p665y0.C30239a;

/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6611e {

    /* renamed from: a */
    public static final long f36638a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static C30239a m33814a(Bundle bundle) {
            C30239a c30239a = new C30239a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c30239a.put(str, str2);
                    }
                }
            }
            return c30239a;
        }
    }
}
