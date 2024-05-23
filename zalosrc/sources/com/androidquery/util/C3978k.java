package com.androidquery.util;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.androidquery.util.k */
/* loaded from: classes2.dex */
public class C3978k extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 100) {
            return true;
        }
        return false;
    }
}
