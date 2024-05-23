package i60;

import android.content.Intent;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: i60.g */
/* loaded from: classes5.dex */
public final class C20341g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f100322a;

    /* renamed from: b */
    private final String f100323b;

    /* renamed from: c */
    private final String f100324c;

    /* renamed from: i60.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20341g m106057a(Intent intent) {
            if (intent == null || !intent.hasExtra("extra_chat_photo_action") || !intent.hasExtra("extra_chat_result_photo_path")) {
                return null;
            }
            return new C20341g(intent.getIntExtra("extra_chat_photo_action", -1), intent.getStringExtra("extra_chat_result_photo_path"), intent.getStringExtra("extra_result_camera_log"));
        }
    }

    public C20341g(int i11, String str, String str2) {
        this.f100322a = i11;
        this.f100323b = str;
        this.f100324c = str2;
    }

    /* renamed from: a */
    public static final C20341g m106053a(Intent intent) {
        return Companion.m106057a(intent);
    }

    /* renamed from: b */
    public final String m106054b() {
        return this.f100324c;
    }

    /* renamed from: c */
    public final int m106055c() {
        return this.f100322a;
    }

    /* renamed from: d */
    public final String m106056d() {
        return this.f100323b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20341g)) {
            return false;
        }
        C20341g c20341g = (C20341g) obj;
        return this.f100322a == c20341g.f100322a && AbstractC19074t.m100204b(this.f100323b, c20341g.f100323b) && AbstractC19074t.m100204b(this.f100324c, c20341g.f100324c);
    }

    public int hashCode() {
        int i11 = this.f100322a * 31;
        String str = this.f100323b;
        int hashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f100324c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ImageViewFragmentResult(photoAction=" + this.f100322a + ", photoPath=" + this.f100323b + ", cameraLog=" + this.f100324c + ")";
    }
}
