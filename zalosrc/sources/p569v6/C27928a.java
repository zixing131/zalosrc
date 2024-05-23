package p569v6;

import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: v6.a */
/* loaded from: classes3.dex */
public class C27928a {
    /* renamed from: a */
    public float m140783a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
