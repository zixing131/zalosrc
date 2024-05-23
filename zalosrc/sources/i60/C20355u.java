package i60;

import android.content.Intent;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: i60.u */
/* loaded from: classes5.dex */
public final class C20355u {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f100363a;

    /* renamed from: b */
    private final String f100364b;

    /* renamed from: i60.u$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20355u m106103a(Intent intent) {
            if (intent != null) {
                return new C20355u(intent.getStringExtra("extra_result_output_path"), intent.getStringExtra("extra_result_camera_log"));
            }
            return null;
        }
    }

    public C20355u(String str, String str2) {
        this.f100363a = str;
        this.f100364b = str2;
    }

    /* renamed from: a */
    public static final C20355u m106100a(Intent intent) {
        return Companion.m106103a(intent);
    }

    /* renamed from: b */
    public final String m106101b() {
        return this.f100364b;
    }

    /* renamed from: c */
    public final String m106102c() {
        return this.f100363a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20355u)) {
            return false;
        }
        C20355u c20355u = (C20355u) obj;
        return AbstractC19074t.m100204b(this.f100363a, c20355u.f100363a) && AbstractC19074t.m100204b(this.f100364b, c20355u.f100364b);
    }

    public int hashCode() {
        String str = this.f100363a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f100364b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TakePictureUpdateAvatarGroupResult(imagePath=" + this.f100363a + ", cameraLog=" + this.f100364b + ")";
    }
}
