package com.google.android.play.core.review;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p182g7.C19267i;

/* renamed from: com.google.android.play.core.review.j */
/* loaded from: classes3.dex */
public abstract class AbstractC6513j {

    /* renamed from: a */
    private static final Set f36341a = new HashSet(Arrays.asList("native", "unity"));

    /* renamed from: b */
    private static final Map f36342b = new HashMap();

    /* renamed from: c */
    private static final C19267i f36343c = new C19267i("PlayCoreVersion");

    /* renamed from: a */
    public static Bundle m33384a() {
        Bundle bundle = new Bundle();
        Map m33385b = m33385b();
        bundle.putInt("playcore_version_code", ((Integer) m33385b.get("java")).intValue());
        if (m33385b.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) m33385b.get("native")).intValue());
        }
        if (m33385b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) m33385b.get("unity")).intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static synchronized Map m33385b() {
        Map map;
        synchronized (AbstractC6513j.class) {
            map = f36342b;
            map.put("java", 11004);
        }
        return map;
    }
}
