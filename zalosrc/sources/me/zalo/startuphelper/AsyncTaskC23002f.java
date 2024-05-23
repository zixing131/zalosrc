package me.zalo.startuphelper;

import android.content.Context;
import android.os.AsyncTask;
import hh0.AbstractC20064b;
import hh0.AbstractC20066d;
import hh0.C20063a;
import java.util.HashMap;
import java.util.Map;
import lh0.EnumC22487b;
import om.C24310c;
import p327lm.C22528h;

/* renamed from: me.zalo.startuphelper.f */
/* loaded from: classes7.dex */
public class AsyncTaskC23002f extends AsyncTask {

    /* renamed from: a */
    private final Map f111871a;

    /* renamed from: b */
    private boolean f111872b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncTaskC23002f(Map map) {
        this.f111871a = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Context... contextArr) {
        try {
            Context context = contextArr[0];
            HashMap hashMap = new HashMap();
            C24310c m104264n = AbstractC20064b.m104264n(context);
            if (m104264n != null) {
                hashMap.put("preloadDefault", C20063a.m104244m(context));
                hashMap.put("preload", m104264n.f117392a);
                if (!m104264n.m126955c()) {
                    hashMap.put("preloadFailed", m104264n.f117393b);
                }
            }
            hashMap.put("wakeupInfo", AbstractC20066d.m104299r(context));
            long m104238g = C20063a.m104238g(context);
            if (m104238g > 0) {
                hashMap.put("firstTimeOpenApp", String.valueOf(m104238g));
            }
            Map map = this.f111871a;
            if (map != null) {
                hashMap.putAll(map);
            }
            C22528h.m116533g().m116535b(EnumC22487b.OPEN_APP, hashMap);
            C22528h.m116533g().m116536c();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
