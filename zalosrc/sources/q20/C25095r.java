package q20;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.zing.zalo.BuildConfig;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;

/* renamed from: q20.r */
/* loaded from: classes5.dex */
public final class C25095r {

    /* renamed from: a */
    public static final C25095r f120555a = new C25095r();

    private C25095r() {
    }

    /* renamed from: a */
    public final void m130133a(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Context appContext = CoreUtility.getAppContext();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        appContext.startActivity(Intent.createChooser(intent, null));
    }

    /* renamed from: b */
    public final void m130134b(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Context appContext = CoreUtility.getAppContext();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(BuildConfig.APPLICATION_ID, "com.zing.zalo.ui.TempShareViaActivity"));
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("postFeed", false);
        appContext.startActivity(intent);
    }

    /* renamed from: c */
    public final void m130135c(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        Context appContext = CoreUtility.getAppContext();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(BuildConfig.APPLICATION_ID, "com.zing.zalo.ui.TempShareViaActivity"));
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("postFeed", true);
        appContext.startActivity(intent);
    }
}
