package p137eo;

import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import fn0.AbstractC19074t;
import java.util.List;
import p363nh.C23744a;

/* renamed from: eo.d */
/* loaded from: classes4.dex */
public interface InterfaceC18520d {

    /* renamed from: eo.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        /* renamed from: a */
        public static void m97894a(InterfaceC18520d interfaceC18520d, String str, ProfileAlbumItem profileAlbumItem) {
            AbstractC19074t.m100208f(str, "userId");
            AbstractC19074t.m100208f(profileAlbumItem, "albumItem");
            C23744a.Companion.m124119a().m124116d(6007, profileAlbumItem, str);
        }

        /* renamed from: b */
        public static void m97895b(InterfaceC18520d interfaceC18520d, List list, long j11) {
            AbstractC19074t.m100208f(list, "photoId");
            C23744a.Companion.m124119a().m124116d(6009, list, Long.valueOf(j11));
        }

        /* renamed from: c */
        public static void m97896c(InterfaceC18520d interfaceC18520d, String str, long j11) {
            AbstractC19074t.m100208f(str, "userId");
            C23744a.Companion.m124119a().m124116d(6008, Long.valueOf(j11), str);
        }
    }
}
