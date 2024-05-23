package p468r0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.app.AbstractC1327c;
import androidx.core.app.AbstractC1336f;
import androidx.core.content.AbstractC1388a;
import java.util.ArrayList;
import p468r0.C25590a;

/* renamed from: r0.d */
/* loaded from: classes2.dex */
public final class C25593d {

    /* renamed from: a */
    public final Intent f122359a;

    /* renamed from: b */
    public final Bundle f122360b;

    C25593d(Intent intent, Bundle bundle) {
        this.f122359a = intent;
        this.f122360b = bundle;
    }

    /* renamed from: a */
    public void m132187a(Context context, Uri uri) {
        this.f122359a.setData(uri);
        AbstractC1388a.m6974p(context, this.f122359a, this.f122360b);
    }

    /* renamed from: r0.d$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: c */
        private ArrayList f122363c;

        /* renamed from: d */
        private Bundle f122364d;

        /* renamed from: e */
        private ArrayList f122365e;

        /* renamed from: f */
        private SparseArray f122366f;

        /* renamed from: g */
        private Bundle f122367g;

        /* renamed from: a */
        private final Intent f122361a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C25590a.a f122362b = new C25590a.a();

        /* renamed from: h */
        private int f122368h = 0;

        /* renamed from: i */
        private boolean f122369i = true;

        public a() {
        }

        /* renamed from: d */
        private void m132188d(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            AbstractC1336f.m6713b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f122361a.putExtras(bundle);
        }

        /* renamed from: a */
        public C25593d m132189a() {
            if (!this.f122361a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m132188d(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f122363c;
            if (arrayList != null) {
                this.f122361a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f122365e;
            if (arrayList2 != null) {
                this.f122361a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f122361a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f122369i);
            this.f122361a.putExtras(this.f122362b.m132180a().m132179a());
            Bundle bundle = this.f122367g;
            if (bundle != null) {
                this.f122361a.putExtras(bundle);
            }
            if (this.f122366f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f122366f);
                this.f122361a.putExtras(bundle2);
            }
            this.f122361a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f122368h);
            return new C25593d(this.f122361a, this.f122364d);
        }

        /* renamed from: b */
        public a m132190b(Context context, int i11, int i12) {
            this.f122361a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", AbstractC1327c.m6660a(context, i11, i12).mo6661b());
            return this;
        }

        /* renamed from: c */
        public a m132191c(C25595f c25595f) {
            this.f122361a.setPackage(c25595f.m132199d().getPackageName());
            m132188d(c25595f.m132198c(), c25595f.m132200e());
            return this;
        }

        /* renamed from: e */
        public a m132192e(boolean z11) {
            this.f122361a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z11 ? 1 : 0);
            return this;
        }

        /* renamed from: f */
        public a m132193f(Context context, int i11, int i12) {
            this.f122364d = AbstractC1327c.m6660a(context, i11, i12).mo6661b();
            return this;
        }

        /* renamed from: g */
        public a m132194g(int i11) {
            this.f122362b.m132181b(i11);
            return this;
        }

        public a(C25595f c25595f) {
            if (c25595f != null) {
                m132191c(c25595f);
            }
        }
    }
}
