package fo;

import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import p137eo.C18521e;
import p185gc.AbstractC19377a;

/* renamed from: fo.d */
/* loaded from: classes4.dex */
public final class C19084d extends AbstractC19377a {

    /* renamed from: a */
    private final C18521e f94989a;

    /* renamed from: fo.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f94990a;

        /* renamed from: b */
        private final ProfileAlbumItem f94991b;

        public a(String str, ProfileAlbumItem profileAlbumItem) {
            AbstractC19074t.m100208f(str, "userId");
            AbstractC19074t.m100208f(profileAlbumItem, "albumItem");
            this.f94990a = str;
            this.f94991b = profileAlbumItem;
        }

        /* renamed from: a */
        public final ProfileAlbumItem m100251a() {
            return this.f94991b;
        }

        /* renamed from: b */
        public final String m100252b() {
            return this.f94990a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f94990a, aVar.f94990a) && AbstractC19074t.m100204b(this.f94991b, aVar.f94991b);
        }

        public int hashCode() {
            return (this.f94990a.hashCode() * 31) + this.f94991b.hashCode();
        }

        public String toString() {
            return "Param(userId=" + this.f94990a + ", albumItem=" + this.f94991b + ")";
        }
    }

    public C19084d(C18521e c18521e) {
        AbstractC19074t.m100208f(c18521e, "albumRepo");
        this.f94989a = c18521e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return this.f94989a.mo97889h(aVar.m100252b(), aVar.m100251a(), "0", 100, continuation);
    }

    public /* synthetic */ C19084d(C18521e c18521e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18521e.Companion.m97903a() : c18521e);
    }
}
