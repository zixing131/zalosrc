package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.AbstractC1388a;
import androidx.core.os.AbstractC1435a;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: androidx.core.app.b */
/* loaded from: classes.dex */
public abstract class AbstractC1324b extends AbstractC1388a {

    /* renamed from: androidx.core.app.b$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String[] f5881p;

        /* renamed from: q */
        final /* synthetic */ Activity f5882q;

        /* renamed from: r */
        final /* synthetic */ int f5883r;

        a(String[] strArr, Activity activity, int i11) {
            this.f5881p = strArr;
            this.f5882q = activity;
            this.f5883r = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f5881p.length];
            PackageManager packageManager = this.f5882q.getPackageManager();
            String packageName = this.f5882q.getPackageName();
            int length = this.f5881p.length;
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = packageManager.checkPermission(this.f5881p[i11], packageName);
            }
            ((d) this.f5882q).onRequestPermissionsResult(this.f5883r, this.f5881p, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.b$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        static void m6644a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        static void m6645b(Activity activity, Intent intent, int i11, Bundle bundle) {
            activity.startActivityForResult(intent, i11, bundle);
        }

        /* renamed from: c */
        static void m6646c(Activity activity, IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$c */
    /* loaded from: classes2.dex */
    static class c {
        /* renamed from: a */
        static void m6647a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        static void m6648b(Activity activity, String[] strArr, int i11) {
            activity.requestPermissions(strArr, i11);
        }

        /* renamed from: c */
        static boolean m6649c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: androidx.core.app.b$d */
    /* loaded from: classes2.dex */
    public interface d {
        void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.b$e */
    /* loaded from: classes2.dex */
    public interface e {
    }

    /* renamed from: androidx.core.app.b$f */
    /* loaded from: classes2.dex */
    public interface f {
        /* renamed from: P */
        void mo6650P(int i11);
    }

    /* renamed from: s */
    public static void m6636s(Activity activity) {
        b.m6644a(activity);
    }

    /* renamed from: t */
    public static e m6637t() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ void m6638u(Activity activity) {
        if (!activity.isFinishing() && !AbstractC1330d.m6677i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: v */
    public static void m6639v(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1324b.m6638u(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static void m6640w(Activity activity, String[] strArr, int i11) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < strArr.length; i12++) {
            if (!TextUtils.isEmpty(strArr[i12])) {
                if (!AbstractC1435a.m7336c() && TextUtils.equals(strArr[i12], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i12));
                }
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i13 = 0;
            for (int i14 = 0; i14 < strArr.length; i14++) {
                if (!hashSet.contains(Integer.valueOf(i14))) {
                    strArr2[i13] = strArr[i14];
                    i13++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof f) {
                ((f) activity).mo6650P(i11);
            }
            c.m6648b(activity, strArr, i11);
        } else if (activity instanceof d) {
            new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i11));
        }
    }

    /* renamed from: x */
    public static boolean m6641x(Activity activity, String str) {
        if ((!AbstractC1435a.m7336c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) || Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return c.m6649c(activity, str);
    }

    /* renamed from: y */
    public static void m6642y(Activity activity, Intent intent, int i11, Bundle bundle) {
        b.m6645b(activity, intent, i11, bundle);
    }

    /* renamed from: z */
    public static void m6643z(Activity activity, IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        b.m6646c(activity, intentSender, i11, intent, i12, i13, i14, bundle);
    }
}
