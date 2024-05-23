package i60;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: i60.r */
/* loaded from: classes5.dex */
public final class C20352r {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Uri f100357a;

    /* renamed from: b */
    private final ClipData f100358b;

    /* renamed from: i60.r$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20352r m106097a(Intent intent) {
            if (intent != null) {
                return new C20352r(intent.getData(), intent.getClipData());
            }
            return null;
        }
    }

    public C20352r(Uri uri, ClipData clipData) {
        this.f100357a = uri;
        this.f100358b = clipData;
    }

    /* renamed from: a */
    public static final C20352r m106094a(Intent intent) {
        return Companion.m106097a(intent);
    }

    /* renamed from: b */
    public final ClipData m106095b() {
        return this.f100358b;
    }

    /* renamed from: c */
    public final Uri m106096c() {
        return this.f100357a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20352r)) {
            return false;
        }
        C20352r c20352r = (C20352r) obj;
        return AbstractC19074t.m100204b(this.f100357a, c20352r.f100357a) && AbstractC19074t.m100204b(this.f100358b, c20352r.f100358b);
    }

    public int hashCode() {
        Uri uri = this.f100357a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        ClipData clipData = this.f100358b;
        return hashCode + (clipData != null ? clipData.hashCode() : 0);
    }

    public String toString() {
        return "SelectFileAndroidQResult(uri=" + this.f100357a + ", clipData=" + this.f100358b + ")";
    }
}
