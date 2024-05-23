package tv;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import fg0.ThreadFactoryC18928a;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: tv.b */
/* loaded from: classes4.dex */
public final class C26898b {

    /* renamed from: a */
    private final String f127289a;

    /* renamed from: c */
    private final Context f127291c;

    /* renamed from: e */
    private File f127293e;

    /* renamed from: b */
    private final Map f127290b = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private final Executor f127292d = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("VideoMetadataRetriever"));

    /* renamed from: f */
    private boolean f127294f = false;

    /* renamed from: g */
    private final Runnable f127295g = new a();

    /* renamed from: tv.b$a */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C26898b.this.f127294f) {
                    Map m138616b = AbstractC26897a.m138616b(C26898b.this.f127289a, C26898b.this.f127293e);
                    C26898b.this.f127290b.clear();
                    C26898b.this.f127290b.putAll(m138616b);
                    C26898b.this.f127294f = true;
                }
                C26898b.this.m138629j();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    public C26898b(Context context, Bundle bundle) {
        this.f127291c = context;
        this.f127289a = bundle.getString("media_uri");
        String string = bundle.getString("save_path");
        if (!TextUtils.isEmpty(string)) {
            this.f127293e = new File(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m138629j() {
        Intent intent = new Intent();
        intent.setAction("com.zing.zalo.media.metadata.VIDEO_PREVIEW_METADATA_ON_LOAD_FINISHED");
        this.f127291c.sendBroadcast(intent);
    }

    /* renamed from: g */
    public Map m138630g() {
        return this.f127290b;
    }

    /* renamed from: h */
    public boolean m138631h() {
        return this.f127294f;
    }

    /* renamed from: i */
    public void m138632i() {
        this.f127292d.execute(this.f127295g);
    }
}
