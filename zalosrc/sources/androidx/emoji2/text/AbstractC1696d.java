package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.C1458e;
import androidx.core.util.AbstractC1487i;
import androidx.emoji2.text.C1698f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.emoji2.text.d */
/* loaded from: classes2.dex */
public abstract class AbstractC1696d {

    /* renamed from: androidx.emoji2.text.d$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final b f6811a;

        public a(b bVar) {
            this.f6811a = bVar == null ? m8667e() : bVar;
        }

        /* renamed from: a */
        private C1698f.c m8664a(Context context, C1458e c1458e) {
            if (c1458e == null) {
                return null;
            }
            return new C1703k(context, c1458e);
        }

        /* renamed from: b */
        private List m8665b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: d */
        private C1458e m8666d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C1458e(str, str2, "emojicompat-emoji-font", m8665b(this.f6811a.mo8673b(packageManager, str2)));
        }

        /* renamed from: e */
        private static b m8667e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new d();
            }
            return new c();
        }

        /* renamed from: f */
        private boolean m8668f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private ProviderInfo m8669g(PackageManager packageManager) {
            Iterator it = this.f6811a.mo8674c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo mo8672a = this.f6811a.mo8672a((ResolveInfo) it.next());
                if (m8668f(mo8672a)) {
                    return mo8672a;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C1698f.c m8670c(Context context) {
            return m8664a(context, m8671h(context));
        }

        /* renamed from: h */
        C1458e m8671h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            AbstractC1487i.m7493h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo m8669g = m8669g(packageManager);
            if (m8669g == null) {
                return null;
            }
            try {
                return m8666d(m8669g, packageManager);
            } catch (PackageManager.NameNotFoundException e11) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e11);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.d$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        public abstract ProviderInfo mo8672a(ResolveInfo resolveInfo);

        /* renamed from: b */
        public Signature[] mo8673b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public abstract List mo8674c(PackageManager packageManager, Intent intent, int i11);
    }

    /* renamed from: androidx.emoji2.text.d$c */
    /* loaded from: classes2.dex */
    public static class c extends b {
        @Override // androidx.emoji2.text.AbstractC1696d.b
        /* renamed from: a */
        public ProviderInfo mo8672a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.AbstractC1696d.b
        /* renamed from: c */
        public List mo8674c(PackageManager packageManager, Intent intent, int i11) {
            return packageManager.queryIntentContentProviders(intent, i11);
        }
    }

    /* renamed from: androidx.emoji2.text.d$d */
    /* loaded from: classes2.dex */
    public static class d extends c {
        @Override // androidx.emoji2.text.AbstractC1696d.b
        /* renamed from: b */
        public Signature[] mo8673b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C1703k m8663a(Context context) {
        return (C1703k) new a(null).m8670c(context);
    }
}
