package p490rp;

import android.content.Intent;
import com.zing.zalo.feed.mvp.music.transfer.MusicDetailResult;
import fn0.AbstractC19074t;

/* renamed from: rp.a */
/* loaded from: classes4.dex */
public abstract class AbstractC25950a {
    /* renamed from: a */
    public static final MusicDetailResult m133686a(Intent intent) {
        AbstractC19074t.m100208f(intent, "<this>");
        return (MusicDetailResult) intent.getParcelableExtra("EXTRA_MUSIC_DETAIL");
    }

    /* renamed from: b */
    public static final Intent m133687b(Intent intent, MusicDetailResult musicDetailResult) {
        AbstractC19074t.m100208f(intent, "<this>");
        AbstractC19074t.m100208f(musicDetailResult, "result");
        intent.putExtra("EXTRA_MUSIC_DETAIL", musicDetailResult);
        return intent;
    }
}
