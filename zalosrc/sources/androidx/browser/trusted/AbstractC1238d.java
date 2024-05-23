package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: androidx.browser.trusted.d */
/* loaded from: classes2.dex */
public abstract class AbstractC1238d {

    /* renamed from: androidx.browser.trusted.d$a */
    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a */
        public final Parcelable[] f4808a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Parcelable[] parcelableArr) {
            this.f4808a = parcelableArr;
        }

        /* renamed from: a */
        public Bundle m5855a() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f4808a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.d$b */
    /* loaded from: classes2.dex */
    static class b {

        /* renamed from: a */
        public final String f4809a;

        /* renamed from: b */
        public final int f4810b;

        b(String str, int i11) {
            this.f4809a = str;
            this.f4810b = i11;
        }

        /* renamed from: a */
        public static b m5856a(Bundle bundle) {
            AbstractC1238d.m5854a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            AbstractC1238d.m5854a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new b(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    /* renamed from: androidx.browser.trusted.d$c */
    /* loaded from: classes2.dex */
    static class c {

        /* renamed from: a */
        public final String f4811a;

        c(String str) {
            this.f4811a = str;
        }

        /* renamed from: a */
        public static c m5857a(Bundle bundle) {
            AbstractC1238d.m5854a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new c(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.d$d */
    /* loaded from: classes2.dex */
    static class d {

        /* renamed from: a */
        public final String f4812a;

        /* renamed from: b */
        public final int f4813b;

        /* renamed from: c */
        public final Notification f4814c;

        /* renamed from: d */
        public final String f4815d;

        d(String str, int i11, Notification notification, String str2) {
            this.f4812a = str;
            this.f4813b = i11;
            this.f4814c = notification;
            this.f4815d = str2;
        }

        /* renamed from: a */
        public static d m5858a(Bundle bundle) {
            AbstractC1238d.m5854a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            AbstractC1238d.m5854a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            AbstractC1238d.m5854a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            AbstractC1238d.m5854a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new d(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* renamed from: androidx.browser.trusted.d$e */
    /* loaded from: classes2.dex */
    static class e {

        /* renamed from: a */
        public final boolean f4816a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(boolean z11) {
            this.f4816a = z11;
        }

        /* renamed from: a */
        public Bundle m5859a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f4816a);
            return bundle;
        }
    }

    /* renamed from: a */
    static void m5854a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }
}
