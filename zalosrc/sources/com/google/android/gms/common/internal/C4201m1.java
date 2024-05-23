package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: com.google.android.gms.common.internal.m1 */
/* loaded from: classes2.dex */
public final class C4201m1 {

    /* renamed from: f */
    private static final Uri f16629f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f16630a;

    /* renamed from: b */
    private final String f16631b;

    /* renamed from: c */
    private final ComponentName f16632c;

    /* renamed from: d */
    private final int f16633d;

    /* renamed from: e */
    private final boolean f16634e;

    public C4201m1(ComponentName componentName, int i11) {
        this.f16630a = null;
        this.f16631b = null;
        AbstractC4205o.m19722k(componentName);
        this.f16632c = componentName;
        this.f16633d = i11;
        this.f16634e = false;
    }

    /* renamed from: a */
    public final int m19705a() {
        return this.f16633d;
    }

    /* renamed from: b */
    public final ComponentName m19706b() {
        return this.f16632c;
    }

    /* renamed from: c */
    public final Intent m19707c(Context context) {
        Bundle bundle;
        if (this.f16630a != null) {
            Intent intent = null;
            if (this.f16634e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f16630a);
                try {
                    bundle = context.getContentResolver().call(f16629f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e11) {
                    "Dynamic intent resolution failed: ".concat(e11.toString());
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f16630a));
                }
            }
            if (intent == null) {
                return new Intent(this.f16630a).setPackage(this.f16631b);
            }
            return intent;
        }
        return new Intent().setComponent(this.f16632c);
    }

    /* renamed from: d */
    public final String m19708d() {
        return this.f16631b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4201m1)) {
            return false;
        }
        C4201m1 c4201m1 = (C4201m1) obj;
        if (AbstractC4199m.m19701a(this.f16630a, c4201m1.f16630a) && AbstractC4199m.m19701a(this.f16631b, c4201m1.f16631b) && AbstractC4199m.m19701a(this.f16632c, c4201m1.f16632c) && this.f16633d == c4201m1.f16633d && this.f16634e == c4201m1.f16634e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC4199m.m19702b(this.f16630a, this.f16631b, this.f16632c, Integer.valueOf(this.f16633d), Boolean.valueOf(this.f16634e));
    }

    public final String toString() {
        String str = this.f16630a;
        if (str == null) {
            AbstractC4205o.m19722k(this.f16632c);
            return this.f16632c.flattenToString();
        }
        return str;
    }

    public C4201m1(String str, String str2, int i11, boolean z11) {
        AbstractC4205o.m19718g(str);
        this.f16630a = str;
        AbstractC4205o.m19718g(str2);
        this.f16631b = str2;
        this.f16632c = null;
        this.f16633d = i11;
        this.f16634e = z11;
    }
}
