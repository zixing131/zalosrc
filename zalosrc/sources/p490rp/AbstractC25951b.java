package p490rp;

import android.os.Bundle;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectParam;
import fn0.AbstractC19074t;

/* renamed from: rp.b */
/* loaded from: classes4.dex */
public abstract class AbstractC25951b {
    /* renamed from: a */
    public static final MusicSelectParam m133688a(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "<this>");
        MusicSelectParam musicSelectParam = (MusicSelectParam) bundle.getParcelable("EXTRA_MUSIC_PARAM");
        if (musicSelectParam == null) {
            return new MusicSelectParam(null, 0, 3, null);
        }
        return musicSelectParam;
    }

    /* renamed from: b */
    public static final Bundle m133689b(Bundle bundle, MusicSelectParam musicSelectParam) {
        AbstractC19074t.m100208f(bundle, "<this>");
        AbstractC19074t.m100208f(musicSelectParam, "param");
        bundle.putParcelable("EXTRA_MUSIC_PARAM", musicSelectParam);
        return bundle;
    }
}
