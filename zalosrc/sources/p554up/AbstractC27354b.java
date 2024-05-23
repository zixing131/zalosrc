package p554up;

import bo.C3000l0;
import com.zing.zalo.feed.models.SongInfo;
import fn0.AbstractC19074t;
import p509sp.C26361j;

/* renamed from: up.b */
/* loaded from: classes4.dex */
public abstract class AbstractC27354b {
    /* renamed from: a */
    public static final void m140049a(C27353a c27353a, C3000l0 c3000l0) {
        AbstractC19074t.m100208f(c27353a, "<this>");
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        if (C26361j.f125215a.m135701g(c3000l0.m14322a0())) {
            String str = c3000l0.m14322a0().f12057p;
            AbstractC19074t.m100207e(str, "fid");
            SongInfo songInfo = c3000l0.m14322a0().f12023C.f12108Q;
            AbstractC19074t.m100207e(songInfo, "songInfo");
            c27353a.m139997p0(str, songInfo, c3000l0.m14322a0().f12027G);
        }
    }
}
