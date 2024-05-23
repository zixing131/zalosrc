package p509sp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionLyric;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLoadInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLocationNotSupported;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicStreaming;
import com.zing.zalo.feed.mvp.music.data.ExceptionSearchMusic;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import np.InterfaceC23923b;
import on0.AbstractC24341v;
import p361nb.C23648e;
import p458qr.C25482o;
import p458qr.InterfaceC25486s;
import p716zh.C32123ta;

/* renamed from: sp.j */
/* loaded from: classes4.dex */
public final class C26361j {

    /* renamed from: a */
    public static final C26361j f125215a = new C26361j();

    private C26361j() {
    }

    /* renamed from: a */
    public final int m135695a(int i11, int i12) {
        if (i11 != 0) {
            return (int) ((i12 / i11) * 100);
        }
        return 0;
    }

    /* renamed from: b */
    public final int m135696b(int i11, int i12) {
        return (int) ((i12 / 100) * i11);
    }

    /* renamed from: c */
    public final String m135697c(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "<this>");
        Bundle m92642L3 = zaloView.m92642L3();
        if (m92642L3 == null || !(zaloView instanceof InterfaceC23923b) || !m92642L3.containsKey("EXTRA_SCREEN_MUSIC_IDENTIFIER")) {
            return "";
        }
        String string = m92642L3.getString("EXTRA_SCREEN_MUSIC_IDENTIFIER", "");
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    /* renamed from: d */
    public final String m135698d(String str, String str2) {
        boolean m127128x;
        boolean m127128x2;
        AbstractC19074t.m100208f(str, "songName");
        AbstractC19074t.m100208f(str2, "artistName");
        m127128x = AbstractC24341v.m127128x(str);
        if (!m127128x) {
            m127128x2 = AbstractC24341v.m127128x(str2);
            if (!m127128x2) {
                return str + " - " + str2;
            }
            return str;
        }
        return "";
    }

    /* renamed from: e */
    public final boolean m135699e(C32123ta c32123ta) {
        AbstractC19074t.m100208f(c32123ta, "storyItem");
        if ((m135702h(c32123ta) && !c32123ta.m155068H()) || c32123ta.f148140i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m135700f(C3000l0 c3000l0) {
        SongInfo songInfo;
        C3020p0 m14322a0;
        C3025q0 c3025q0;
        if (c3000l0 != null && (m14322a0 = c3000l0.m14322a0()) != null && (c3025q0 = m14322a0.f12023C) != null) {
            songInfo = c3025q0.f12108Q;
        } else {
            songInfo = null;
        }
        if (songInfo != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m135701g(C3020p0 c3020p0) {
        SongInfo songInfo;
        C3025q0 c3025q0;
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null) {
            songInfo = c3025q0.f12108Q;
        } else {
            songInfo = null;
        }
        if (songInfo != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m135702h(C32123ta c32123ta) {
        SongInfo songInfo;
        if (c32123ta != null) {
            songInfo = c32123ta.f148119V;
        } else {
            songInfo = null;
        }
        if (songInfo != null && c32123ta.f148119V.m45182d().length() > 0 && !AbstractC19074t.m100204b(c32123ta.f148119V.m45182d(), "null")) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m135703i(C32123ta c32123ta) {
        StoryMusicAttachment storyMusicAttachment;
        if (c32123ta != null) {
            storyMusicAttachment = c32123ta.f148120W;
        } else {
            storyMusicAttachment = null;
        }
        if (storyMusicAttachment != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m135704j(String str, Exception exc, InterfaceC25486s interfaceC25486s, long j11) {
        int i11;
        AbstractC19074t.m100208f(str, "songId");
        AbstractC19074t.m100208f(exc, "exception");
        AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
        C23648e c23648e = new C23648e(30, "social_music_post_error", 0, "", new String[0]);
        String[] m123919l = c23648e.m123919l();
        if (AbstractC19074t.m100204b(exc, ExceptionSearchMusic.f46314p)) {
            i11 = 1;
        } else if (AbstractC19074t.m100204b(exc, ExceptionMusicLoadInfo.f46310p)) {
            i11 = 2;
        } else if (AbstractC19074t.m100204b(exc, ExceptionLyric.f46309p)) {
            i11 = 3;
        } else if (AbstractC19074t.m100204b(exc, ExceptionMusicStreaming.f46312p)) {
            i11 = 4;
        } else if (AbstractC19074t.m100204b(exc, ExceptionMusicLocationNotSupported.f46311p)) {
            i11 = 5;
        } else {
            i11 = 0;
        }
        m123919l[0] = String.valueOf(i11);
        c23648e.m123919l()[1] = str;
        interfaceC25486s.mo131967a(c23648e, false);
        C25482o.f122075a.m131999g(j11, exc);
    }

    /* renamed from: k */
    public final boolean m135705k(Context context) {
        AbstractC19074t.m100208f(context, "<this>");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.zing.mp3"));
            intent.addCategory("android.intent.category.BROWSABLE");
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m135706l(Context context, String str) {
        AbstractC19074t.m100208f(context, "<this>");
        AbstractC19074t.m100208f(str, "id");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("zingmp3://song?id=" + str + "&source=ZaloSocial"));
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
