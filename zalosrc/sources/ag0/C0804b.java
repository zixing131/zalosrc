package ag0;

import ae.C0766k;
import am.AbstractC0939u;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import au.AbstractC2351i;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.receiver.AlarmSettingReceiver;
import d60.C17793b;
import gg0.AbstractC19444a;
import gu.AbstractC19601a;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23195r2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import nh0.InterfaceC23792b;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p371nv.C23952g;
import p394oj.C24275a;
import p394oj.C24276b;
import p405ov.C24559a;

/* renamed from: ag0.b */
/* loaded from: classes6.dex */
public class C0804b {

    /* renamed from: e */
    private static volatile C0804b f2775e;

    /* renamed from: b */
    private final InterfaceC23792b f2777b;

    /* renamed from: c */
    private final C24276b f2778c = new C24276b();

    /* renamed from: d */
    private boolean f2779d = false;

    /* renamed from: a */
    private final AlarmManager f2776a = (AlarmManager) MainApplication.getAppContext().getSystemService("alarm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.b$a */
    /* loaded from: classes6.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ArrayList f2780a;

        a(ArrayList arrayList) {
            this.f2780a = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42177K7(this.f2780a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.b$b */
    /* loaded from: classes6.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    public C0804b(InterfaceC23792b interfaceC23792b) {
        this.f2777b = interfaceC23792b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.zing.zalo.worker.AlarmSettingController.Chat");
        AbstractC2351i.m12327a(MainApplication.getAppContext(), new AlarmSettingReceiver(), intentFilter, true);
    }

    /* renamed from: d */
    private void m2024d(C24275a c24275a) {
        if (c24275a != null) {
            try {
                if (!c24275a.m126772i() && c24275a.m126767d() > 0) {
                    Intent intent = new Intent("com.zing.zalo.worker.AlarmSettingController.Chat");
                    intent.putExtra("uid", c24275a.m126771h());
                    this.f2776a.set(1, c24275a.m126767d(), PendingIntent.getBroadcast(MainApplication.getAppContext(), m2026h(c24275a.m126771h()), intent, AbstractC19601a.m102571a(1073741824)));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: g */
    public static synchronized C0804b m2025g() {
        C0804b c0804b;
        synchronized (C0804b.class) {
            try {
                if (f2775e == null) {
                    synchronized (C0804b.class) {
                        try {
                            if (f2775e == null) {
                                C0804b c0804b2 = new C0804b(AbstractC23306f.m120579F1());
                                c0804b2.m2034k();
                                f2775e = c0804b2;
                            }
                        } finally {
                        }
                    }
                }
                c0804b = f2775e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0804b;
    }

    /* renamed from: h */
    private int m2026h(String str) {
        return AbstractC23352g.m122788d(10000 + str).hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m2027j() {
        try {
            if (MainTabView.m67645lM() != null) {
                MainTabView.m67645lM().m67701oN();
            } else {
                C23744a.m124114c().m124116d(29, new Object[0]);
            }
            C23744a.m124114c().m124116d(119, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: m */
    private void m2028m(C24275a c24275a) {
        if (c24275a != null) {
            try {
                Intent intent = new Intent("com.zing.zalo.worker.AlarmSettingController.Chat");
                intent.putExtra("uid", c24275a.m126771h());
                this.f2776a.cancel(PendingIntent.getBroadcast(MainApplication.getAppContext(), m2026h(c24275a.m126771h()), intent, AbstractC19601a.m102571a(1073741824)));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: b */
    public void m2029b(C24275a c24275a) {
        m2030c(c24275a, true);
    }

    /* renamed from: c */
    public void m2030c(C24275a c24275a, boolean z11) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (c24275a != null) {
                if (!c24275a.m126772i() && c24275a.m126767d() <= currentTimeMillis) {
                    return;
                }
                m2035l(c24275a.m126771h(), false);
                synchronized (this) {
                    this.f2778c.add(c24275a);
                }
                f2775e.m2024d(c24275a);
                if (z11) {
                    C7960e.m41971c6().m42164J7(c24275a);
                    C24559a.m127933c("[Mute_Conversation]", "addChatSettingItem uid:" + c24275a.m126771h());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: e */
    public void m2031e() {
        synchronized (this) {
            this.f2778c.clear();
            this.f2779d = false;
        }
    }

    /* renamed from: f */
    public C24275a m2032f(String str) {
        C24275a m126781j;
        synchronized (this) {
            m126781j = this.f2778c.m126781j(str);
        }
        return m126781j;
    }

    /* renamed from: i */
    public boolean m2033i(String str) {
        if (m2032f(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public void m2034k() {
        try {
            synchronized (this) {
                try {
                    if (this.f2779d) {
                        return;
                    }
                    C17793b.m93923d().m93932l();
                    C24276b m42162J5 = C7960e.m41971c6().m42162J5();
                    C17793b.m93923d().m93931k();
                    this.f2778c.clear();
                    if (m42162J5 != null) {
                        this.f2778c.addAll(m42162J5);
                    }
                    C24559a.m127933c("[Mute_Conversation]", String.format("loadMuteFromDB size: %s - list: %s", Integer.valueOf(this.f2778c.size()), this.f2778c));
                    C23952g.m125345j("debug_mute", "Init mute: " + this.f2778c.size());
                    if (this.f2778c.size() > 0) {
                        for (int i11 = 0; i11 < this.f2778c.size(); i11++) {
                            m2024d((C24275a) this.f2778c.get(i11));
                        }
                    }
                    this.f2779d = true;
                    C7860a.Companion.m40303b().m40278V().set(true);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    public void m2035l(String str, boolean z11) {
        C24275a m126781j;
        try {
            synchronized (this) {
                try {
                    m126781j = this.f2778c.m126781j(str);
                    if (m126781j != null) {
                        this.f2778c.remove(m126781j);
                    }
                } finally {
                }
            }
            if (m126781j != null) {
                f2775e.m2028m(m126781j);
            }
            if (z11) {
                C7960e.m41971c6().m42213Nb(str);
                C24559a.m127933c("[Mute_Conversation]", "removeChatSettingItem uid:" + str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n */
    public void m2036n(JSONObject jSONObject) {
        boolean z11;
        C24559a.m127933c("[Mute_Conversation]", "Sever mute setting: " + jSONObject.toString());
        C24276b c24276b = new C24276b();
        c24276b.addAll(this.f2778c);
        try {
            try {
                long mo124314i = this.f2777b.mo124314i();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                C23952g.m125345j("debug_mute", jSONObject.toString());
                JSONArray optJSONArray = jSONObject.optJSONArray("group");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        C24275a c24275a = new C24275a();
                        c24275a.m126776m(2);
                        c24275a.m126778o("group_" + AbstractC18069a.m96089h(jSONObject2, "id"));
                        C24276b c24276b2 = c24276b;
                        c24275a.m126775l(AbstractC18069a.m96087f(jSONObject2, "start_time") * 1000);
                        c24275a.m126774k(AbstractC18069a.m96087f(jSONObject2, "duration") * 1000);
                        c24275a.m126777n(AbstractC18069a.m96086e(jSONObject2, "mention", 0));
                        if (!c24275a.m126772i() && c24275a.m126768e() > mo124314i) {
                            arrayList3.add(c24275a.m126771h());
                        } else {
                            arrayList.add(c24275a);
                        }
                        i11++;
                        c24276b = c24276b2;
                    }
                }
                C24276b c24276b3 = c24276b;
                if (arrayList3.size() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GROUP\n");
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        sb2.append((String) arrayList3.get(i12));
                        sb2.append(" ");
                    }
                    C23952g.m125345j("debug_mute", sb2.toString());
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("chat");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    for (int i13 = 0; i13 < optJSONArray2.length(); i13++) {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i13);
                        C24275a c24275a2 = new C24275a();
                        c24275a2.m126776m(1);
                        c24275a2.m126778o(AbstractC18069a.m96089h(jSONObject3, "id"));
                        c24275a2.m126775l(AbstractC18069a.m96087f(jSONObject3, "start_time") * 1000);
                        c24275a2.m126774k(AbstractC18069a.m96087f(jSONObject3, "duration") * 1000);
                        c24275a2.m126777n(AbstractC18069a.m96086e(jSONObject3, "mention", 0));
                        if (!c24275a2.m126772i() && c24275a2.m126768e() > mo124314i) {
                            arrayList2.add(c24275a2.m126771h());
                        } else {
                            arrayList.add(c24275a2);
                        }
                    }
                }
                synchronized (this) {
                    try {
                        Iterator<E> it = this.f2778c.iterator();
                        while (it.hasNext()) {
                            f2775e.m2028m((C24275a) it.next());
                        }
                        this.f2778c.clear();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            C24275a c24275a3 = (C24275a) it2.next();
                            if (c24275a3.m126772i() || c24275a3.m126767d() > System.currentTimeMillis()) {
                                this.f2778c.add(c24275a3);
                                f2775e.m2024d(c24275a3);
                            }
                        }
                    } finally {
                    }
                }
                if (!arrayList.isEmpty()) {
                    C0824j.m2153b(new a(arrayList));
                }
                if (arrayList2.size() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SINGLE\n");
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        sb3.append((String) arrayList2.get(i14));
                        sb3.append(" ");
                    }
                    C23952g.m125345j("debug_mute", sb3.toString());
                }
                if (arrayList3.size() > 0 || arrayList2.size() > 0) {
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new b());
                    c0766k.mo1463J9(arrayList2, arrayList3);
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: ag0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0804b.m2027j();
                    }
                });
                if (c24276b3.size() != 0 && c24276b3.size() != this.f2778c.size()) {
                    AbstractC20887g.m109234l(28000, "old: " + c24276b3 + "new: " + this.f2778c);
                }
                z11 = true;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                z11 = true;
            }
            AbstractC23195r2.f112445g = z11;
            C19669z.m103146Y().m103198O0();
        } catch (Throwable th2) {
            AbstractC23195r2.f112445g = true;
            C19669z.m103146Y().m103198O0();
            throw th2;
        }
    }
}
