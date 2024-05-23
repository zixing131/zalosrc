package i60;

import android.content.Intent;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: i60.a */
/* loaded from: classes5.dex */
public final class C20335a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final List f100305a;

    /* renamed from: b */
    private final String f100306b;

    /* renamed from: i60.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20335a m106033a(Intent intent) {
            if (intent != null) {
                return new C20335a(GalleryPickerView.Companion.m71478a(intent), intent.getStringExtra("result_album_name"));
            }
            return null;
        }
    }

    public C20335a(List list, String str) {
        AbstractC19074t.m100208f(list, "mediaList");
        this.f100305a = list;
        this.f100306b = str;
    }

    /* renamed from: a */
    public static final C20335a m106030a(Intent intent) {
        return Companion.m106033a(intent);
    }

    /* renamed from: b */
    public final String m106031b() {
        return this.f100306b;
    }

    /* renamed from: c */
    public final List m106032c() {
        return this.f100305a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20335a)) {
            return false;
        }
        C20335a c20335a = (C20335a) obj;
        return AbstractC19074t.m100204b(this.f100305a, c20335a.f100305a) && AbstractC19074t.m100204b(this.f100306b, c20335a.f100306b);
    }

    public int hashCode() {
        int hashCode = this.f100305a.hashCode() * 31;
        String str = this.f100306b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AlbumAddPhotoResult(mediaList=" + this.f100305a + ", albumName=" + this.f100306b + ")";
    }
}
