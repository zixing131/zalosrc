package com.zing.zalo.webview;

import ae.C0766k;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.zing.zalo.webview.C16792j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import im0.AbstractC20626a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import jf0.C21242e;
import me0.AbstractC23181q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p140ev.C18613b;
import p140ev.C18618g;
import p348mi.AbstractC23309i;

/* renamed from: com.zing.zalo.webview.j */
/* loaded from: classes5.dex */
public class C16792j {

    /* renamed from: c */
    private static C16792j f85216c;

    /* renamed from: a */
    private final HashMap f85217a = new HashMap();

    /* renamed from: b */
    private boolean f85218b = false;

    /* renamed from: com.zing.zalo.webview.j$a */
    /* loaded from: classes5.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f85219a;

        /* renamed from: b */
        final /* synthetic */ HashMap f85220b;

        a(boolean z11, HashMap hashMap) {
            this.f85219a = z11;
            this.f85220b = hashMap;
        }

        /* renamed from: d */
        public /* synthetic */ void m89709d(boolean z11, HashMap hashMap) {
            try {
                C16792j.this.m89706j(z11, hashMap);
                if (!z11) {
                    AbstractC23181q.m119428a();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject == null) {
                    return;
                }
                AbstractC23309i.m122178mo(Math.min(optJSONObject.optLong("cacheExpired"), 172800000L));
                AbstractC23309i.m121844dv(optJSONObject.optInt("network", 0));
                AbstractC23309i.m122477uq(System.currentTimeMillis());
                AbstractC23309i.m121838dp(jSONObject.toString());
                C16792j.this.m89707k();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.zing.zalo.webview.i

                    /* renamed from: q */
                    public final /* synthetic */ boolean f85214q;

                    /* renamed from: r */
                    public final /* synthetic */ HashMap f85215r;

                    public /* synthetic */ RunnableC16791i(boolean z11, HashMap hashMap) {
                        r2 = z11;
                        r3 = hashMap;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C16792j.a.this.m89709d(r2, r3);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    private C16792j() {
    }

    /* renamed from: d */
    public static boolean m89697d() {
        if (!AbstractC23309i.m122088ka()) {
            return false;
        }
        int m122050ja = AbstractC23309i.m122050ja();
        if (m122050ja != 0) {
            if (m122050ja != 1) {
                if (m122050ja != 2) {
                    return false;
                }
                return true;
            }
            if (AbstractC20626a.m107387c() != 0 && (AbstractC20626a.m107387c() == 0 || AbstractC20626a.m107387c() < 8)) {
                return false;
            }
            return true;
        }
        if (AbstractC20626a.m107387c() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private synchronized void m89698e() {
        if (!this.f85218b && this.f85217a.size() == 0) {
            m89707k();
        }
    }

    /* renamed from: g */
    private void m89699g() {
        m89698e();
    }

    /* renamed from: i */
    public static synchronized C16792j m89700i() {
        C16792j c16792j;
        synchronized (C16792j.class) {
            try {
                if (f85216c == null) {
                    f85216c = new C16792j();
                }
                c16792j = f85216c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c16792j;
    }

    /* renamed from: a */
    public synchronized boolean m89701a(C18613b c18613b) {
        m89698e();
        boolean z11 = false;
        if (this.f85217a.size() == 0) {
            return false;
        }
        C18618g c18618g = (C18618g) this.f85217a.get(Integer.valueOf(c18613b.m98348a()));
        if (c18618g != null) {
            if (c18618g.f93650d) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: b */
    public synchronized boolean m89702b(C18613b c18613b) {
        m89698e();
        boolean z11 = false;
        if (this.f85217a.size() == 0) {
            return false;
        }
        C18618g c18618g = (C18618g) this.f85217a.get(Integer.valueOf(c18613b.m98348a()));
        if (c18618g != null) {
            if (c18618g.f93650d) {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: c */
    public synchronized boolean m89703c() {
        m89698e();
        return false;
    }

    /* renamed from: f */
    public synchronized void m89704f() {
        this.f85218b = false;
        this.f85217a.clear();
    }

    /* renamed from: h */
    public void m89705h(boolean z11, HashMap hashMap) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(z11, hashMap));
        c0766k.mo1446H8();
    }

    /* renamed from: j */
    public synchronized void m89706j(boolean z11, HashMap hashMap) {
        try {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (!m89697d()) {
                return;
            }
            m89698e();
            if (this.f85217a.isEmpty() && z11 && TextUtils.isEmpty(AbstractC23309i.m121111K4())) {
                m89705h(true, hashMap);
            } else {
                m89699g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: k */
    synchronized void m89707k() {
        boolean z11;
        boolean z12;
        try {
            try {
                String m121111K4 = AbstractC23309i.m121111K4();
                this.f85217a.clear();
                this.f85218b = true;
                if (!TextUtils.isEmpty(m121111K4)) {
                    JSONObject optJSONObject = new JSONObject(m121111K4).optJSONObject("data");
                    if (optJSONObject == null) {
                        return;
                    }
                    JSONArray jSONArray = optJSONObject.getJSONArray("featureItems");
                    ArrayList<C18618g> arrayList = new ArrayList();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            C18613b c18613b = new C18613b(jSONObject.getInt("featureId"));
                            if (jSONObject.getInt("preLoaded") == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (jSONObject.getInt("preRender") == 1) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            C18613b c18613b2 = C18613b.f93599r;
                            if (c18613b.equals(c18613b2)) {
                                if (C21242e.m110039d().m110048i(c18613b2)) {
                                    arrayList.add(new C18618g(c18613b, "", "", z12, z11, 262, ""));
                                }
                            } else {
                                C18613b c18613b3 = C18613b.f93600s;
                                if (c18613b.equals(c18613b3)) {
                                    if (C21242e.m110039d().m110048i(c18613b3)) {
                                        arrayList.add(new C18618g(c18613b, "", "", z12, z11, 130, ""));
                                    }
                                } else {
                                    C18613b c18613b4 = C18613b.f93601t;
                                    if (c18613b.equals(c18613b4)) {
                                        if (C21242e.m110039d().m110048i(c18613b4)) {
                                            arrayList.add(new C18618g(c18613b, "", "", z12, z11, 252, ""));
                                        }
                                    } else {
                                        C18613b c18613b5 = C18613b.f93602u;
                                        if (c18613b.equals(c18613b5)) {
                                            if (C21242e.m110039d().m110048i(c18613b5)) {
                                                arrayList.add(new C18618g(c18613b, "", "", z12, z11, 262, ""));
                                            }
                                        } else if (C21242e.m110039d().m110048i(c18613b)) {
                                            arrayList.add(new C18618g(c18613b, "", "", z12, z11, 262, ""));
                                        }
                                    }
                                }
                            }
                        } catch (JSONException e11) {
                            e11.printStackTrace();
                        }
                    }
                    for (C18618g c18618g : arrayList) {
                        if (c18618g != null) {
                            HashMap hashMap = this.f85217a;
                            C18613b c18613b6 = c18618g.f93647a;
                            Objects.requireNonNull(c18613b6);
                            hashMap.put(Integer.valueOf(c18613b6.m98348a()), c18618g);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
