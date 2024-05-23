package p490rp;

import android.content.Intent;
import com.zing.zalo.feed.mvp.music.transfer.MusicSelectResult;
import fn0.AbstractC19074t;

/* renamed from: rp.c */
/* loaded from: classes4.dex */
public abstract class AbstractC25952c {
    /* renamed from: a */
    public static final MusicSelectResult m133690a(Intent intent) {
        AbstractC19074t.m100208f(intent, "<this>");
        return (MusicSelectResult) intent.getParcelableExtra("EXTRA_MUSIC_SELECT");
    }

    /* renamed from: b */
    public static final Intent m133691b(Intent intent, MusicSelectResult musicSelectResult) {
        AbstractC19074t.m100208f(intent, "<this>");
        AbstractC19074t.m100208f(musicSelectResult, "result");
        intent.putExtra("EXTRA_MUSIC_SELECT", musicSelectResult);
        return intent;
    }
}
