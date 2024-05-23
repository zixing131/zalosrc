package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
abstract class x63 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (e53.m21617a(getKey(), entry.getKey()) && e53.m21617a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i11 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i11 = value.hashCode();
        }
        return hashCode ^ i11;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
