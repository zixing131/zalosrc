package com.zing.zalo.upload.video;

import ae.C0766k;
import android.text.TextUtils;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.upload.video.C16727a;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p455qo.C25436t0;

/* renamed from: com.zing.zalo.upload.video.a */
/* loaded from: classes4.dex */
public class C16727a {

    /* renamed from: d */
    private static final Map f84819d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private static C16727a f84820e;

    /* renamed from: a */
    private final Set f84821a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    private final Set f84822b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    private final Object f84823c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.upload.video.a$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String[] f84824a;

        /* renamed from: b */
        final /* synthetic */ b f84825b;

        a(String[] strArr, b bVar) {
            this.f84824a = strArr;
            this.f84825b = bVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C16727a.this.m89187h(this.f84824a, false);
            synchronized (C16727a.this.f84823c) {
                C16727a.this.f84822b.remove(this.f84825b);
            }
            c cVar = this.f84825b.f84828b;
            if (cVar != null) {
                cVar.mo44079a(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                Iterator<String> keys = jSONObject.keys();
                if (keys != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject optJSONObject = jSONObject.optJSONObject(next);
                        if (optJSONObject != null) {
                            C16728b c16728b = new C16728b(next, optJSONObject);
                            if (!c16728b.m89203g()) {
                                C16727a.f84819d.put(next, c16728b);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C16727a.this.m89187h(this.f84824a, false);
            C16727a.this.m89193n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.upload.video.a$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        String[] f84827a;

        /* renamed from: b */
        c f84828b;

        b(String[] strArr, c cVar) {
            this.f84827a = strArr;
            this.f84828b = cVar;
        }
    }

    /* renamed from: com.zing.zalo.upload.video.a$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        void mo44079a(boolean z11);
    }

    private C16727a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m89187h(String[] strArr, boolean z11) {
        synchronized (this.f84823c) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                try {
                    if (z11) {
                        this.f84821a.add(strArr[i11]);
                    } else {
                        this.f84821a.remove(strArr[i11]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: i */
    public static synchronized C16727a m89188i() {
        C16727a c16727a;
        synchronized (C16727a.class) {
            try {
                if (f84820e == null) {
                    f84820e = new C16727a();
                }
                c16727a = f84820e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c16727a;
    }

    /* renamed from: j */
    private C16728b m89189j(String str) {
        return (C16728b) f84819d.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m89190k(String str, C3020p0 c3020p0, c cVar, boolean z11) {
        VideoMediaInfo m89202a;
        if (z11) {
            try {
                C16728b m89189j = m89188i().m89189j(str);
                if (m89189j != null && (m89202a = m89189j.m89202a()) != null) {
                    C17391z c17391z = c3020p0.f12023C.f12093B;
                    c17391z.f88622e = m89202a.f84816r;
                    String str2 = m89202a.f84817s;
                    c17391z.f88620c = str2;
                    c17391z.f88621d = m89202a.f84818t;
                    if (!TextUtils.isEmpty(str2)) {
                        c17391z.m92541f(null);
                    }
                    new C25436t0().m101508a(new C25436t0.a(c3020p0.f12057p, c17391z));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (cVar != null) {
            cVar.mo44079a(z11);
        }
    }

    /* renamed from: l */
    private void m89191l(String str, boolean z11, c cVar) {
        if (TextUtils.isEmpty(str)) {
            if (cVar != null) {
                cVar.mo44079a(false);
                return;
            }
            return;
        }
        m89192m(new String[]{str}, z11, cVar);
    }

    /* renamed from: m */
    private void m89192m(String[] strArr, boolean z11, c cVar) {
        if (strArr != null && strArr.length != 0) {
            if (!z11) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    if (!TextUtils.isEmpty(strArr[i11]) && m89189j(strArr[i11]) == null) {
                        arrayList.add(strArr[i11]);
                    }
                }
                if (arrayList.isEmpty()) {
                    if (cVar != null) {
                        cVar.mo44079a(true);
                        return;
                    }
                    return;
                }
                strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
            }
            m89187h(strArr, true);
            b bVar = new b(strArr, cVar);
            synchronized (this.f84823c) {
                this.f84822b.add(bVar);
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(strArr, bVar));
            c0766k.mo1458J4(strArr);
            return;
        }
        if (cVar != null) {
            cVar.mo44079a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m89193n() {
        synchronized (this.f84823c) {
            try {
                try {
                    Iterator it = this.f84822b.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        int i11 = 0;
                        while (true) {
                            String[] strArr = bVar.f84827a;
                            if (i11 < strArr.length) {
                                if (this.f84821a.contains(strArr[i11])) {
                                    break;
                                } else {
                                    i11++;
                                }
                            } else {
                                c cVar = bVar.f84828b;
                                if (cVar != null) {
                                    cVar.mo44079a(true);
                                }
                                it.remove();
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o */
    public static void m89194o() {
        C16727a c16727a = f84820e;
        if (c16727a != null) {
            c16727a.f84821a.clear();
            f84820e.f84822b.clear();
        }
    }

    /* renamed from: g */
    public void m89195g(C3000l0 c3000l0, final C3020p0 c3020p0, final c cVar) {
        C3025q0 c3025q0;
        C17391z c17391z;
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && (c17391z = c3025q0.f12093B) != null && !c17391z.m92539d(ZMediaPlayerSettings.getVideoConfig(1))) {
            final String str = c3020p0.f12023C.f12093B.f88634q;
            if (!TextUtils.isEmpty(str)) {
                m89188i().m89191l(str, false, new c() { // from class: ud0.a
                    @Override // com.zing.zalo.upload.video.C16727a.c
                    /* renamed from: a */
                    public final void mo44079a(boolean z11) {
                        C16727a.m89190k(str, c3020p0, cVar, z11);
                    }
                });
            }
        }
    }
}
