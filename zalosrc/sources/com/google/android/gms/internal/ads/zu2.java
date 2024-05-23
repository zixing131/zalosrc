package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class zu2 extends s73 {

    /* renamed from: p */
    private final Map f31700p;

    public zu2(Map map) {
        this.f31700p = map;
    }

    @Override // com.google.android.gms.internal.ads.t73
    /* renamed from: c */
    protected final /* synthetic */ Object mo21690c() {
        return this.f31700p;
    }

    @Override // com.google.android.gms.internal.ads.s73, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && super.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.m26256g(obj);
    }

    @Override // com.google.android.gms.internal.ads.s73
    /* renamed from: d */
    protected final Map mo26254d() {
        return this.f31700p;
    }

    @Override // com.google.android.gms.internal.ads.s73, java.util.Map
    public final Set entrySet() {
        return x93.m27869b(this.f31700p.entrySet(), new k53() { // from class: com.google.android.gms.internal.ads.xs2
            @Override // com.google.android.gms.internal.ads.k53
            public final boolean zza(Object obj) {
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && super.m26257h(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f31700p.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.m26255e();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f31700p.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return x93.m27869b(this.f31700p.keySet(), new k53() { // from class: com.google.android.gms.internal.ads.yt2
            @Override // com.google.android.gms.internal.ads.k53
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.s73, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
