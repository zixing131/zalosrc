package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ke0 {

    /* renamed from: a */
    private View f23290a;

    /* renamed from: b */
    private final Map f23291b = new HashMap();

    /* renamed from: b */
    public final ke0 m23926b(View view) {
        this.f23290a = view;
        return this;
    }

    /* renamed from: c */
    public final ke0 m23927c(Map map) {
        this.f23291b.clear();
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                this.f23291b.put((String) entry.getKey(), new WeakReference(view));
            }
        }
        return this;
    }
}
