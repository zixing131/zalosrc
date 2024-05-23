package mh0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import jh0.AbstractC21254a;
import lh0.EnumC22487b;
import mh0.C23300b;
import p327lm.C22528h;

/* renamed from: mh0.a */
/* loaded from: classes7.dex */
public class C23299a {

    /* renamed from: c */
    public static C23299a f113233c = new C23299a();

    /* renamed from: a */
    private C23300b f113234a;

    /* renamed from: b */
    private C23300b.b f113235b = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh0.a$a */
    /* loaded from: classes7.dex */
    public class a implements C23300b.b {
        a() {
        }

        @Override // mh0.C23300b.b
        /* renamed from: a */
        public void mo120496a(WeakReference weakReference) {
            try {
                C22528h.m116533g().m116535b(EnumC22487b.OPEN_APP, null);
                Activity activity = (Activity) weakReference.get();
                if (activity != null) {
                    Intent intent = activity.getIntent();
                    Uri data = intent.getData();
                    ComponentName callingActivity = activity.getCallingActivity();
                    HashMap hashMap = new HashMap();
                    if (intent.hasCategory("android.intent.category.BROWSABLE") && data != null) {
                        hashMap.put("source", "com.google.android.browser");
                        hashMap.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, data.toString());
                    } else if (callingActivity != null) {
                        hashMap.put("source", callingActivity.getPackageName());
                        hashMap.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, callingActivity.getClassName());
                    }
                    if (hashMap.size() > 0) {
                        C22528h.m116533g().m116535b(EnumC22487b.DEEP_LINKING, hashMap);
                    }
                }
                C22528h.m116533g().m116536c();
            } catch (Exception e11) {
                AbstractC21254a.m110061c(e11);
            }
        }

        @Override // mh0.C23300b.b
        /* renamed from: b */
        public void mo120497b(WeakReference weakReference) {
        }

        @Override // mh0.C23300b.b
        /* renamed from: c */
        public void mo120498c(WeakReference weakReference) {
        }
    }

    /* renamed from: a */
    public void m120495a(Application application) {
        C23300b m120504g = C23300b.m120504g(application);
        this.f113234a = m120504g;
        m120504g.m120506f(this.f113235b);
    }
}
