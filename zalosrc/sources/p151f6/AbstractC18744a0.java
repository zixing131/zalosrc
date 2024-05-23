package p151f6;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: f6.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC18744a0 {
    /* renamed from: a */
    public static Parcelable m98729a(Bundle bundle, String str) {
        ClassLoader m98732d = m98732d();
        bundle.setClassLoader(m98732d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(m98732d);
        return bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m98730b(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable m98729a = m98729a(bundle, "MapOptions");
            if (m98729a != null) {
                m98731c(bundle2, "MapOptions", m98729a);
            }
            Parcelable m98729a2 = m98729a(bundle, "StreetViewPanoramaOptions");
            if (m98729a2 != null) {
                m98731c(bundle2, "StreetViewPanoramaOptions", m98729a2);
            }
            Parcelable m98729a3 = m98729a(bundle, "camera");
            if (m98729a3 != null) {
                m98731c(bundle2, "camera", m98729a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: c */
    public static void m98731c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader m98732d = m98732d();
        bundle.setClassLoader(m98732d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(m98732d);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* renamed from: d */
    private static ClassLoader m98732d() {
        return (ClassLoader) AbstractC4205o.m19722k(AbstractC18744a0.class.getClassLoader());
    }
}
