package i60;

import android.content.Intent;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: i60.m */
/* loaded from: classes5.dex */
public final class C20347m {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f100343a;

    /* renamed from: i60.m$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20347m m106081a(Intent intent) {
            if (intent != null) {
                return new C20347m(intent.getStringExtra("PHOTO_PATH_PICKED"));
            }
            return null;
        }
    }

    public C20347m(String str) {
        this.f100343a = str;
    }

    /* renamed from: a */
    public static final C20347m m106079a(Intent intent) {
        return Companion.m106081a(intent);
    }

    /* renamed from: b */
    public final String m106080b() {
        return this.f100343a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20347m) && AbstractC19074t.m100204b(this.f100343a, ((C20347m) obj).f100343a);
    }

    public int hashCode() {
        String str = this.f100343a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "OpenMediaStoreAvatarPickerResult(photoPathPicked=" + this.f100343a + ")";
    }
}
