package yf0;

import am.AbstractC0924m0;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.WebViewMPActivity;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nh0.C23793c;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONArray;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;

/* renamed from: yf0.k */
/* loaded from: classes5.dex */
public final class C30946k {
    public static final a Companion = new a(null);

    /* renamed from: g */
    private static boolean f142837g;

    /* renamed from: h */
    private static C30946k f142838h;

    /* renamed from: a */
    private final Map f142839a = new HashMap();

    /* renamed from: b */
    private final Map f142840b = new HashMap();

    /* renamed from: c */
    private long f142841c = 20000;

    /* renamed from: d */
    private List f142842d;

    /* renamed from: e */
    private final InterfaceC24854k f142843e;

    /* renamed from: f */
    private boolean f142844f;

    /* renamed from: yf0.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C30946k m150528a() {
            if (C30946k.f142838h == null) {
                C30946k.f142838h = new C30946k();
                long m2898A6 = AbstractC0924m0.m2898A6();
                C30946k c30946k = C30946k.f142838h;
                AbstractC19074t.m100205c(c30946k);
                if (m2898A6 <= -1) {
                    m2898A6 = 20000;
                }
                c30946k.f142841c = m2898A6;
            }
            C30946k c30946k2 = C30946k.f142838h;
            AbstractC19074t.m100205c(c30946k2);
            return c30946k2;
        }

        /* renamed from: b */
        public final boolean m150529b() {
            return C30946k.f142837g;
        }

        /* renamed from: c */
        public final boolean m150530c() {
            if (C30946k.f142838h != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final void m150531d(boolean z11) {
            C30946k.f142837g = z11;
        }

        /* renamed from: e */
        public final void m150532e(long j11) {
            C30946k c30946k = C30946k.f142838h;
            if (c30946k != null) {
                c30946k.f142841c = j11;
            }
        }
    }

    /* renamed from: yf0.k$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f142845q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo12V4() {
            return new ArrayList();
        }
    }

    public C30946k() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f142845q);
        this.f142843e = m129210a;
    }

    /* renamed from: h */
    private final boolean m150508h(Context context, int i11, boolean z11, boolean z12) {
        List<ActivityManager.AppTask> list;
        boolean z13;
        ActivityManager.AppTask next;
        int i12;
        ComponentName componentName;
        String str;
        boolean m127127w;
        if (Build.VERSION.SDK_INT <= 23) {
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            list = activityManager.getAppTasks();
        } else {
            list = null;
        }
        if (list == null) {
            list = AbstractC25368s.m131502j();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ActivityManager.AppTask> it = list.iterator();
        loop0: while (true) {
            z13 = false;
            while (it.hasNext()) {
                next = it.next();
                if (next != null) {
                    try {
                        if (next.getTaskInfo() == null) {
                            continue;
                        } else {
                            if (Build.VERSION.SDK_INT >= 29) {
                                i12 = next.getTaskInfo().taskId;
                            } else {
                                i12 = next.getTaskInfo().id;
                            }
                            if (i11 == i12 && i12 != -1) {
                                if (m150509m().contains(Integer.valueOf(i11))) {
                                    break;
                                }
                                if (z11) {
                                    next.moveToFront();
                                    if (context instanceof Activity) {
                                        ((Activity) context).overridePendingTransition(0, 0);
                                    }
                                }
                                z13 = true;
                            } else if (z12) {
                                componentName = next.getTaskInfo().baseActivity;
                                if (componentName != null) {
                                    str = componentName.getClassName();
                                } else {
                                    str = null;
                                }
                                m127127w = AbstractC24341v.m127127w(str, WebViewMPActivity.class.getCanonicalName(), false, 2, null);
                                if (m127127w && z12) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            m150512u(i11);
            arrayList.add(next);
        }
        if (arrayList.size() > 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((ActivityManager.AppTask) it2.next()).finishAndRemoveTask();
            }
        }
        return z13;
    }

    /* renamed from: m */
    private final List m150509m() {
        return (List) this.f142843e.getValue();
    }

    /* renamed from: o */
    public static final boolean m150510o() {
        return Companion.m150529b();
    }

    /* renamed from: q */
    public static /* synthetic */ int m150511q(C30946k c30946k, Context context, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return c30946k.m150520p(context, str, z11, z12);
    }

    /* renamed from: u */
    private final void m150512u(int i11) {
        m150509m().remove(Integer.valueOf(i11));
    }

    /* renamed from: f */
    public final void m150513f(int i11) {
        Object obj;
        m150509m().add(Integer.valueOf(i11));
        Iterator it = this.f142839a.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Number) ((Map.Entry) obj).getValue()).intValue() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            this.f142839a.remove(entry.getKey());
        }
    }

    /* renamed from: g */
    public final boolean m150514g(String str) {
        CharSequence m127168X0;
        AbstractC19074t.m100208f(str, "id");
        if (this.f142842d == null) {
            m150526x();
        }
        List list = this.f142842d;
        if (list != null) {
            m127168X0 = AbstractC24342w.m127168X0(str);
            if (!list.contains(m127168X0.toString())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m150515i(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        m150508h(context, i11, false, true);
    }

    /* renamed from: j */
    public final void m150516j() {
        List<ActivityManager.AppTask> list;
        ComponentName componentName;
        String str;
        boolean m127127w;
        if (Build.VERSION.SDK_INT <= 23) {
            return;
        }
        ActivityManager activityManager = (ActivityManager) MainApplication.Companion.m35500c().getSystemService("activity");
        if (activityManager != null) {
            list = activityManager.getAppTasks();
        } else {
            list = null;
        }
        if (list == null) {
            list = AbstractC25368s.m131502j();
        }
        for (ActivityManager.AppTask appTask : list) {
            componentName = appTask.getTaskInfo().baseActivity;
            if (componentName != null) {
                str = componentName.getClassName();
            } else {
                str = null;
            }
            m127127w = AbstractC24341v.m127127w(str, WebViewMPActivity.class.getCanonicalName(), false, 2, null);
            if (m127127w) {
                appTask.finishAndRemoveTask();
            }
        }
        this.f142839a.clear();
    }

    /* renamed from: k */
    public final long m150517k() {
        return this.f142841c;
    }

    /* renamed from: l */
    public final Long m150518l(String str) {
        AbstractC19074t.m100208f(str, "key");
        return (Long) this.f142840b.get(str);
    }

    /* renamed from: n */
    public final boolean m150519n() {
        return this.f142844f;
    }

    /* renamed from: p */
    public final int m150520p(Context context, String str, boolean z11, boolean z12) {
        int i11;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "id");
        Integer num = (Integer) this.f142839a.get(str);
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = -1;
        }
        if (!m150508h(context, i11, z11, z12)) {
            return -1;
        }
        return i11;
    }

    /* renamed from: r */
    public final boolean m150521r() {
        return !this.f142839a.isEmpty();
    }

    /* renamed from: s */
    public final void m150522s(String str, int i11) {
        AbstractC19074t.m100208f(str, "id");
        this.f142839a.clear();
        this.f142839a.put(str, Integer.valueOf(i11));
    }

    /* renamed from: t */
    public final void m150523t(String str) {
        AbstractC19074t.m100208f(str, "key");
        this.f142840b.remove(str);
    }

    /* renamed from: v */
    public final void m150524v(boolean z11) {
        this.f142844f = z11;
    }

    /* renamed from: w */
    public final void m150525w(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            activityManager.moveTaskToFront(i11, 0);
        }
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }

    /* renamed from: x */
    public final void m150526x() {
        CharSequence m127168X0;
        try {
            if (this.f142842d == null) {
                this.f142842d = new ArrayList();
            }
            List list = this.f142842d;
            if (list != null) {
                list.clear();
            }
            JSONArray jSONArray = new JSONArray(AbstractC0924m0.m3185K3());
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                List list2 = this.f142842d;
                if (list2 != null) {
                    String optString = jSONArray.optString(i11);
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    m127168X0 = AbstractC24342w.m127168X0(optString);
                    list2.add(m127168X0.toString());
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    public final void m150527y(String str) {
        AbstractC19074t.m100208f(str, "key");
        this.f142840b.put(str, Long.valueOf(C23793c.Companion.m124321a().mo124311f()));
    }
}
