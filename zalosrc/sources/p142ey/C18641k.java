package p142ey;

import ae.C0766k;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import fg0.ThreadFactoryC18928a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18641k;

/* renamed from: ey.k */
/* loaded from: classes4.dex */
public class C18641k {

    /* renamed from: a */
    ExecutorService f93810a = Executors.newFixedThreadPool(2, new ThreadFactoryC18928a("UnknownProfile"));

    /* renamed from: ey.k$a */
    /* loaded from: classes4.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract void mo98521a(int i11);

        /* renamed from: b */
        public abstract void mo98522b(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ey.k$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        static final C18641k f93811a = new C18641k();
    }

    /* renamed from: ey.k$c */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a */
        int f93812a;

        /* renamed from: b */
        int f93813b;

        /* renamed from: c */
        ArrayList f93814c;

        /* renamed from: d */
        AtomicBoolean f93815d = new AtomicBoolean(false);

        /* renamed from: ey.k$c$a */
        /* loaded from: classes4.dex */
        public class a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ CountDownLatch f93816a;

            a(CountDownLatch countDownLatch) {
                this.f93816a = countDownLatch;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                c.this.f93815d.set(false);
                this.f93816a.countDown();
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                try {
                    try {
                        JSONArray jSONArray = new JSONObject(obj.toString()).getJSONArray("data");
                        if (jSONArray.length() > 0) {
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                                    ContactProfile contactProfile = new ContactProfile(jSONObject.optString("uid"));
                                    contactProfile.f42437s = jSONObject.optString("displayName");
                                    contactProfile.f42446v = jSONObject.optString("avatar");
                                    contactProfile.f42330D = System.currentTimeMillis();
                                    C7960e.m41971c6().m42221O7(contactProfile, false);
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                } finally {
                    c.this.f93815d.set(true);
                    this.f93816a.countDown();
                }
            }
        }

        c() {
        }

        /* renamed from: a */
        public void m98523a(CountDownLatch countDownLatch) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(countDownLatch));
            c0766k.mo1782y5(this.f93814c, new TrackingSource(-1));
        }
    }

    C18641k() {
    }

    /* renamed from: c */
    public static C18641k m98517c() {
        return b.f93811a;
    }

    /* renamed from: d */
    public /* synthetic */ void m98518d(ArrayList arrayList, int i11, a aVar) {
        int i12;
        try {
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                String str = (String) arrayList.get(i13);
                if (!TextUtils.isEmpty(str)) {
                    try {
                        i12 = Integer.parseInt(str);
                    } catch (Exception unused) {
                        i12 = -1;
                    }
                    if (i12 >= 0) {
                        arrayList2.add(Integer.valueOf(i12));
                    }
                }
            }
            List m98519b = m98519b(i11, arrayList2);
            CountDownLatch countDownLatch = new CountDownLatch(m98519b.size());
            Iterator it = m98519b.iterator();
            while (it.hasNext()) {
                ((c) it.next()).m98523a(countDownLatch);
            }
            countDownLatch.await();
            Iterator it2 = m98519b.iterator();
            while (it2.hasNext()) {
                if (((c) it2.next()).f93815d.get()) {
                    aVar.mo98522b(i11);
                    return;
                }
            }
            aVar.mo98521a(i11);
        } catch (InterruptedException e11) {
            e11.printStackTrace();
            aVar.mo98521a(i11);
        }
    }

    /* renamed from: b */
    public List m98519b(int i11, List list) {
        int ceil = (int) Math.ceil((list.size() * 1.0f) / 200.0f);
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (i12 < ceil) {
            c cVar = new c();
            cVar.f93813b = i12;
            cVar.f93812a = i11;
            int i13 = i12 * 200;
            i12++;
            cVar.f93814c = new ArrayList(list.subList(i13, Math.min(i12 * 200, list.size())));
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: e */
    public void m98520e(int i11, ArrayList arrayList, a aVar) {
        this.f93810a.execute(new Runnable() { // from class: ey.j

            /* renamed from: q */
            public final /* synthetic */ ArrayList f93807q;

            /* renamed from: r */
            public final /* synthetic */ int f93808r;

            /* renamed from: s */
            public final /* synthetic */ C18641k.a f93809s;

            public /* synthetic */ RunnableC18640j(ArrayList arrayList2, int i112, C18641k.a aVar2) {
                r2 = arrayList2;
                r3 = i112;
                r4 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18641k.this.m98518d(r2, r3, r4);
            }
        });
    }
}
