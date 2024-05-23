package com.zing.zalo.location;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.picker.location.LiveLocationDetailsView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dj.C17945a0;
import dj.C17996r0;
import eg0.C18427b;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.C23055e5;
import mg.C23288a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3535c;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p645xh.C29628e;
import vg.AbstractC28248z6;
import vg.C28157p5;
import vg.C28203u6;
import vg.C28239y6;
import z20.AbstractC31195a;

/* renamed from: com.zing.zalo.location.m */
/* loaded from: classes4.dex */
public class C8967m {

    /* renamed from: q */
    static C8967m f47922q = null;

    /* renamed from: r */
    public static boolean f47923r = true;

    /* renamed from: s */
    public static boolean f47924s = true;

    /* renamed from: t */
    public static short f47925t = 60;

    /* renamed from: u */
    public static int f47926u = 180;

    /* renamed from: v */
    public static float f47927v = 100.0f;

    /* renamed from: w */
    public static int f47928w = 10;

    /* renamed from: x */
    public static int f47929x = 80;

    /* renamed from: y */
    public static int f47930y = 50;

    /* renamed from: b */
    Context f47932b;

    /* renamed from: k */
    private long f47941k;

    /* renamed from: o */
    public Location f47945o;

    /* renamed from: a */
    AtomicBoolean f47931a = new AtomicBoolean(false);

    /* renamed from: c */
    final Map f47933c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    final Map f47934d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    final Map f47935e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    final Set f47936f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    final Set f47937g = Collections.synchronizedSet(new HashSet());

    /* renamed from: h */
    final Set f47938h = Collections.synchronizedSet(new HashSet());

    /* renamed from: i */
    AtomicBoolean f47939i = new AtomicBoolean(false);

    /* renamed from: j */
    g f47940j = null;

    /* renamed from: l */
    C23744a.c f47942l = new C23744a.c() { // from class: com.zing.zalo.location.d
        @Override // p363nh.C23744a.c
        /* renamed from: x */
        public final void mo17795x(int i11, Object[] objArr) {
            C8967m.this.m47875X(i11, objArr);
        }
    };

    /* renamed from: m */
    private int f47943m = 0;

    /* renamed from: n */
    Map f47944n = new HashMap();

    /* renamed from: p */
    long f47946p = 0;

    /* renamed from: com.zing.zalo.location.m$a */
    /* loaded from: classes4.dex */
    class a extends AbstractC28248z6.f {

        /* renamed from: a */
        final /* synthetic */ String f47947a;

        /* renamed from: b */
        final /* synthetic */ C28239y6 f47948b;

        /* renamed from: c */
        final /* synthetic */ h f47949c;

        /* renamed from: d */
        final /* synthetic */ WeakReference f47950d;

        /* renamed from: e */
        final /* synthetic */ AtomicBoolean f47951e;

        /* renamed from: f */
        final /* synthetic */ byte f47952f;

        /* renamed from: g */
        final /* synthetic */ int f47953g;

        /* renamed from: h */
        final /* synthetic */ short f47954h;

        /* renamed from: com.zing.zalo.location.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C32713a implements InterfaceC20094a {

            /* renamed from: a */
            final /* synthetic */ Location f47956a;

            C32713a(Location location) {
                this.f47956a = location;
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: a */
            public void mo926a(C20096c c20096c) {
                try {
                    C8967m.this.m47869N();
                    a aVar = a.this;
                    C8967m.this.m47933q0(aVar.f47947a);
                    if (a.this.f47950d.get() != null && ((ZaloView) a.this.f47950d.get()).m92672lJ()) {
                        if (c20096c != null && c20096c.m104491c() == 50001) {
                            ToastUtils.showMess(c20096c.m104492d());
                        } else {
                            ToastUtils.m89266n(AbstractC8020f0.str_live_location_share_failed, new Object[0]);
                        }
                    }
                    a aVar2 = a.this;
                    C8967m.this.m47917g0(-6, aVar2.f47949c);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            @Override // hm0.InterfaceC20094a
            /* renamed from: b */
            public void mo927b(Object obj) {
                try {
                    try {
                        C8967m.this.m47869N();
                        JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                        if (optJSONObject != null) {
                            C8969o c8969o = new C8969o(optJSONObject);
                            c8969o.f47981b = a.this.f47947a;
                            c8969o.f47982c = CoreUtility.f89233i;
                            c8969o.f47985f = this.f47956a.getLongitude();
                            c8969o.f47984e = this.f47956a.getLatitude();
                            C8967m.this.m47924l0(c8969o, 1);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                } finally {
                    a aVar = a.this;
                    C8967m.this.m47933q0(aVar.f47947a);
                    a aVar2 = a.this;
                    C8967m.this.m47917g0(0, aVar2.f47949c);
                }
            }
        }

        a(String str, C28239y6 c28239y6, h hVar, WeakReference weakReference, AtomicBoolean atomicBoolean, byte b11, int i11, short s7) {
            this.f47947a = str;
            this.f47948b = c28239y6;
            this.f47949c = hVar;
            this.f47950d = weakReference;
            this.f47951e = atomicBoolean;
            this.f47952f = b11;
            this.f47953g = i11;
            this.f47954h = s7;
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(Location location, int i11) {
            if (!AbstractC23138m0.m118770b()) {
                return;
            }
            if (location == null) {
                C8967m.this.m47933q0(this.f47947a);
                if (this.f47948b.m142223b(C8967m.this.f47932b) == 1) {
                    C8967m.this.m47917g0(-4, this.f47949c);
                    return;
                }
                if (this.f47950d.get() != null && ((ZaloView) this.f47950d.get()).m92672lJ()) {
                    ToastUtils.m89266n(AbstractC8020f0.str_live_location_share_failed_no_location, new Object[0]);
                }
                C8967m.this.m47917g0(-5, this.f47949c);
                return;
            }
            C8967m.this.m47947x0(location, true);
            if (this.f47951e.get()) {
                return;
            }
            this.f47951e.set(true);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C32713a(location));
            c0766k.mo1384A3(this.f47952f, this.f47953g, location.getLongitude(), location.getLatitude(), this.f47954h, C8967m.this.m47868K());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.location.m$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f47958a;

        b(List list) {
            this.f47958a = list;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() == 50001) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
            } else {
                ToastUtils.showMess(c20096c.m104492d());
            }
            Iterator it = this.f47958a.iterator();
            while (it.hasNext()) {
                C8967m.this.m47931p0(((C8969o) it.next()).f47981b);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray optJSONArray;
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("fail")) != null && optJSONArray.length() > 0) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            arrayList.add(Long.valueOf(optJSONArray.optLong(i11)));
                        }
                    }
                    for (C8969o c8969o : this.f47958a) {
                        if (!arrayList.contains(Long.valueOf(c8969o.f47980a))) {
                            C8967m.this.m47919i0(c8969o);
                        }
                    }
                    Iterator it = this.f47958a.iterator();
                    while (it.hasNext()) {
                        C8967m.this.m47931p0(((C8969o) it.next()).f47981b);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    Iterator it2 = this.f47958a.iterator();
                    while (it2.hasNext()) {
                        C8967m.this.m47931p0(((C8969o) it2.next()).f47981b);
                    }
                }
            } catch (Throwable th2) {
                Iterator it3 = this.f47958a.iterator();
                while (it3.hasNext()) {
                    C8967m.this.m47931p0(((C8969o) it3.next()).f47981b);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.location.m$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C8967m.this.m47908I().m47955b();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.location.m$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f47961a;

        /* renamed from: b */
        final /* synthetic */ MessageId f47962b;

        /* renamed from: c */
        final /* synthetic */ long f47963c;

        /* renamed from: d */
        final /* synthetic */ f f47964d;

        /* renamed from: e */
        final /* synthetic */ boolean f47965e;

        d(String str, MessageId messageId, long j11, f fVar, boolean z11) {
            this.f47961a = str;
            this.f47962b = messageId;
            this.f47963c = j11;
            this.f47964d = fVar;
            this.f47965e = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    f fVar = this.f47964d;
                    if (fVar != null) {
                        fVar.mo47952Fq(this.f47963c, false, null);
                    }
                    if (this.f47965e) {
                        synchronized (C8967m.this.f47938h) {
                            C8967m.this.f47938h.remove(Long.valueOf(this.f47963c));
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    if (this.f47965e) {
                        synchronized (C8967m.this.f47938h) {
                            C8967m.this.f47938h.remove(Long.valueOf(this.f47963c));
                        }
                    }
                }
            } catch (Throwable th2) {
                if (this.f47965e) {
                    synchronized (C8967m.this.f47938h) {
                        C8967m.this.f47938h.remove(Long.valueOf(this.f47963c));
                    }
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray optJSONArray;
            long j11;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("list_live")) != null && optJSONArray.length() > 0) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                            long optLong = optJSONObject2.optLong("live_location_id");
                            long optLong2 = optJSONObject2.optLong("liveVer", -1L);
                            C8969o m47907H = C8967m.this.m47907H(optLong);
                            double optDouble = optJSONObject2.optDouble("long", 0.0d);
                            double optDouble2 = optJSONObject2.optDouble("lat", 0.0d);
                            long optLong3 = optJSONObject2.optLong("uid", 0L);
                            if (m47907H != null) {
                                if (optLong2 <= m47907H.f47995p) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13) {
                                    z14 = z13;
                                    if (AbstractC31195a.m151996a(m47907H.f47986g, m47907H.f47987h, optDouble2, optDouble) >= C8967m.f47930y) {
                                        m47907H.f47986g = m47907H.f47984e;
                                        m47907H.f47987h = m47907H.f47985f;
                                    }
                                } else {
                                    z14 = z13;
                                }
                                j11 = optLong;
                                z11 = z14;
                            } else {
                                m47907H = new C8969o();
                                m47907H.f47981b = this.f47961a;
                                m47907H.f47982c = String.valueOf(optLong3);
                                j11 = optLong;
                                z11 = true;
                            }
                            m47907H.f47980a = j11;
                            if (optJSONObject2.has("uid")) {
                                m47907H.f47982c = String.valueOf(optJSONObject2.optLong("uid"));
                            }
                            if (optJSONObject2.has("displayName")) {
                                m47907H.f47991l = optJSONObject2.optString("displayName");
                            }
                            if (optJSONObject2.has("avatar")) {
                                m47907H.f47992m = optJSONObject2.optString("avatar");
                            }
                            if (optJSONObject2.has("expired_time")) {
                                m47907H.f47990k = optJSONObject2.optLong("expired_time");
                            }
                            if (optJSONObject2.has("start_time")) {
                                m47907H.f47989j = optJSONObject2.optLong("start_time");
                            }
                            if (optJSONObject2.has("isEnd")) {
                                if (optJSONObject2.optInt("isEnd", 0) == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                m47907H.f47997r = z12;
                            }
                            if (z11) {
                                m47907H.f47985f = optDouble;
                                m47907H.f47984e = optDouble2;
                                m47907H.f47995p = optLong2;
                            }
                            arrayList.add(m47907H);
                        }
                    }
                    if (C8967m.this.f47939i.get() && this.f47962b != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C8969o c8969o = (C8969o) it.next();
                            if (c8969o.f47980a == this.f47963c) {
                                c8969o.f47988i = this.f47962b;
                            }
                            C8967m.this.m47924l0(c8969o, 3);
                        }
                    }
                    f fVar = this.f47964d;
                    if (fVar != null) {
                        fVar.mo47952Fq(this.f47963c, true, arrayList);
                    }
                    if (this.f47965e) {
                        synchronized (C8967m.this.f47938h) {
                            C8967m.this.f47938h.remove(Long.valueOf(this.f47963c));
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    if (this.f47965e) {
                        synchronized (C8967m.this.f47938h) {
                            C8967m.this.f47938h.remove(Long.valueOf(this.f47963c));
                        }
                    }
                }
            } catch (Throwable th2) {
                if (this.f47965e) {
                    synchronized (C8967m.this.f47938h) {
                        C8967m.this.f47938h.remove(Long.valueOf(this.f47963c));
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.location.m$e */
    /* loaded from: classes4.dex */
    public class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C8969o f47967a;

        e(C8969o c8969o) {
            this.f47967a = c8969o;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42522r8(this.f47967a);
        }
    }

    /* renamed from: com.zing.zalo.location.m$f */
    /* loaded from: classes4.dex */
    public interface f {
        /* renamed from: Fq */
        void mo47952Fq(long j11, boolean z11, List list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.location.m$g */
    /* loaded from: classes4.dex */
    public class g extends HandlerThread implements Handler.Callback {

        /* renamed from: p */
        CountDownLatch f47969p;

        /* renamed from: q */
        Handler f47970q;

        /* renamed from: r */
        long f47971r;

        /* renamed from: s */
        Location f47972s;

        /* renamed from: t */
        C28239y6 f47973t;

        /* renamed from: u */
        AbstractC28248z6.f f47974u;

        /* renamed from: v */
        boolean f47975v;

        /* renamed from: w */
        long f47976w;

        /* renamed from: com.zing.zalo.location.m$g$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC28248z6.f {
            a() {
            }

            @Override // vg.AbstractC28248z6.f
            /* renamed from: a */
            public void mo40758a(Location location, int i11) {
                if (location == null) {
                    g.this.f47975v = false;
                } else {
                    C8967m.this.m47947x0(location, false);
                    g.this.f47975v = false;
                }
            }
        }

        public g() {
            super("Z:LiveLocationHandlerThread");
            this.f47969p = new CountDownLatch(1);
            this.f47971r = 0L;
            this.f47972s = null;
            this.f47974u = new a();
            this.f47975v = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m47954d() {
            boolean z11;
            try {
                if (C8967m.this.f47945o == null) {
                    return;
                }
                if (Math.abs(System.currentTimeMillis() - this.f47971r) >= C8967m.f47926u * 1000) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Location location = this.f47972s;
                if (location != null && location.distanceTo(C8967m.this.f47945o) < C8967m.f47927v && !z11) {
                    return;
                }
                m47960h();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: b */
        void m47955b() {
            this.f47971r -= C8967m.f47926u * 1000;
        }

        /* renamed from: c */
        void m47956c() {
            try {
                if (C8967m.this.f47945o == null) {
                    return;
                }
                this.f47969p.await();
                this.f47970q.post(new Runnable() { // from class: com.zing.zalo.location.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8967m.g.this.m47954d();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: e */
        void m47957e() {
            try {
                this.f47969p.await();
                this.f47970q.sendEmptyMessage(1);
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        void m47958f() {
            if (!C8967m.this.m47911M()) {
                return;
            }
            if (this.f47975v) {
                if (Math.abs(System.currentTimeMillis() - this.f47976w) >= C8967m.f47928w * 1000 && C8967m.this.m47911M()) {
                    m47956c();
                    return;
                }
                return;
            }
            if (this.f47973t == null) {
                C28239y6 c28239y6 = new C28239y6();
                this.f47973t = c28239y6;
                c28239y6.m142229k(false);
                this.f47973t.m142227i(1L);
            }
            this.f47976w = System.currentTimeMillis();
            if (this.f47973t.m142226h(C8967m.this.f47932b, this.f47974u, new SensitiveData("live_location", "live_location"))) {
                this.f47975v = true;
            }
        }

        /* renamed from: g */
        void m47959g() {
            this.f47971r = 0L;
            this.f47972s = null;
            Handler handler = this.f47970q;
            if (handler != null) {
                handler.removeMessages(2);
            }
        }

        /* renamed from: h */
        void m47960h() {
            Handler handler = this.f47970q;
            if (handler != null) {
                handler.removeMessages(2);
                this.f47970q.sendEmptyMessage(2);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    C8967m c8967m = C8967m.this;
                    Location location = c8967m.f47945o;
                    if (location != null) {
                        c8967m.m47943v0(location);
                    }
                    this.f47972s = C8967m.this.f47945o;
                    this.f47971r = System.currentTimeMillis();
                    this.f47970q.sendEmptyMessageDelayed(2, C8967m.f47926u * 1000);
                    return false;
                }
                return false;
            }
            m47958f();
            return false;
        }

        /* renamed from: i */
        void m47961i() {
            Handler handler = this.f47970q;
            if (handler != null) {
                handler.removeMessages(1);
            }
            C28239y6 c28239y6 = this.f47973t;
            if (c28239y6 != null) {
                c28239y6.m142224e();
            }
            this.f47975v = false;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            if (getLooper() != null) {
                this.f47970q = new Handler(getLooper(), this);
            }
            this.f47969p.countDown();
        }

        @Override // android.os.HandlerThread
        public boolean quitSafely() {
            m47959g();
            return super.quitSafely();
        }
    }

    /* renamed from: com.zing.zalo.location.m$h */
    /* loaded from: classes4.dex */
    public interface h {
        /* renamed from: a */
        void mo47962a(int i11);
    }

    private C8967m(Context context) {
        this.f47932b = context;
        m47912O();
    }

    /* renamed from: E */
    public static C8967m m47867E() {
        if (f47922q == null) {
            f47922q = new C8967m(MainApplication.getAppContext());
        }
        return f47922q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public long m47868K() {
        long j11;
        synchronized (this) {
            try {
                if (this.f47941k <= 0) {
                    this.f47941k = C23793c.m124316k().mo124310e();
                }
                j11 = this.f47941k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m47869N() {
        synchronized (this) {
            this.f47941k++;
        }
    }

    /* renamed from: P */
    public static void m47870P() {
        m47885d0();
    }

    /* renamed from: T */
    public static boolean m47871T(String str) {
        try {
            if (!f47923r || TextUtils.isEmpty(str) || AbstractC25495a.m132086k(str)) {
                return false;
            }
            if (AbstractC25495a.m132078c(str)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: U */
    public static boolean m47872U(C8969o c8969o) {
        if (c8969o != null && !c8969o.f47997r && c8969o.f47990k > C23793c.m124316k().mo124310e()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static /* synthetic */ void m47873V() {
        try {
            long mo124310e = C23793c.m124316k().mo124310e();
            if (mo124310e - AbstractC23309i.m122010i8() >= 604800000) {
                C7960e.m41971c6().m42208N3(C23793c.m124316k().mo124310e());
                AbstractC23309i.m121098Js(mo124310e);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m47875X(int i11, Object[] objArr) {
        if (i11 == 85 || i11 == 86) {
            try {
                if (m47911M()) {
                    m47902E0();
                    C23744a.m124114c().m124116d(83, new Object[0]);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static /* synthetic */ void m47877Z(String str) {
        try {
            Iterator it = m47867E().m47896B(str, false).iterator();
            while (it.hasNext()) {
                m47867E().m47919i0((C8969o) it.next());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m47879a0() {
        try {
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (this.f47939i.get()) {
                this.f47939i.set(true);
                return;
            }
            List<C8969o> m42541t6 = C7960e.m41971c6().m42541t6(C23793c.m124316k().mo124310e());
            ArrayList arrayList = new ArrayList();
            for (C8969o c8969o : m42541t6) {
                if (c8969o != null && !c8969o.f47997r) {
                    if (TextUtils.equals(CoreUtility.f89233i, c8969o.f47982c)) {
                        if (TextUtils.isEmpty(c8969o.f47981b)) {
                            arrayList.add(c8969o);
                        } else if (AbstractC25495a.m132079d(c8969o.f47981b)) {
                            if (C0943w.m4462l().m4472f(c8969o.f47981b) == null) {
                                arrayList.add(c8969o);
                            }
                        } else if (C21927m.m114302u().m114312J().m153137g(c8969o.f47981b)) {
                            arrayList.add(c8969o);
                        }
                    }
                    m47924l0(c8969o, 4);
                }
            }
            if (!arrayList.isEmpty()) {
                long[] jArr = new long[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    jArr[i11] = ((C8969o) arrayList.get(i11)).f47980a;
                }
                C7960e.m41971c6().m42217O3(jArr);
            }
            this.f47939i.set(true);
            if (AbstractC23034c6.m118167n(this.f47932b, AbstractC23034c6.f112034k) != 0) {
                m47874W(true);
            }
        } catch (Throwable th2) {
            this.f47939i.set(true);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static /* synthetic */ void m47881b0(MessageId messageId, C8969o c8969o) {
        try {
            C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
            if (m2635r != null && (m2635r.m94929K2() instanceof C17996r0)) {
                ((C17996r0) m2635r.m94929K2()).m95682j(c8969o.f47985f, c8969o.f47984e, c8969o.f47995p);
                C7956b.m41474B().m41513J0(m2635r, m2635r.m94929K2());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static /* synthetic */ void m47883c0(MessageId messageId, double d11, double d12, long j11) {
        try {
            C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
            if (m2635r != null && (m2635r.m94929K2() instanceof C17996r0)) {
                ((C17996r0) m2635r.m94929K2()).m95680h(true, d11, d12, j11);
                C7956b.m41474B().m41513J0(m2635r, m2635r.m94929K2());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d0 */
    public static void m47885d0() {
        boolean z11;
        String m121972h8 = AbstractC23309i.m121972h8();
        if (!TextUtils.isEmpty(m121972h8)) {
            try {
                JSONObject jSONObject = new JSONObject(m121972h8);
                boolean z12 = true;
                if (jSONObject.optInt("enable", 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f47923r = z11;
                if (jSONObject.optInt("use_static_map_api", 1) != 1) {
                    z12 = false;
                }
                f47924s = z12;
                f47925t = (short) jSONObject.optInt("share_duration", 60);
                f47926u = jSONObject.optInt("update_interval", 180);
                f47927v = jSONObject.optInt("update_distance", 100);
                f47928w = jSONObject.optInt("location_request_interval", 10);
                f47929x = jSONObject.optInt("max_speed", 80);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: f0 */
    public static void m47888f0(InterfaceC27218a interfaceC27218a, MessageId messageId, String str, long j11, double d11, double d12, int i11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_MSG_ID", messageId);
            bundle.putString("extra_conversation_id", str);
            bundle.putLong("LONG_EXTRA_LIVE_LOCATION_ID", j11);
            bundle.putDouble("EXTRA_PRESET_LATITUDE", d11);
            bundle.putDouble("EXTRA_PRESET_LONGITUDE", d12);
            bundle.putInt("INT_EXTRA_TRACKING_SOURCE", i11);
            LiveLocationDetailsView liveLocationDetailsView = new LiveLocationDetailsView();
            liveLocationDetailsView.mo60305zK(bundle);
            liveLocationDetailsView.m72061jM(new SensitiveData("live_location", "live_location"));
            liveLocationDetailsView.m72060iM(interfaceC27218a.getContext());
            interfaceC27218a.mo35579p().mo89692g2(liveLocationDetailsView, 0, 1, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p */
    public static void m47893p() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.location.j
            @Override // java.lang.Runnable
            public final void run() {
                C8967m.m47873V();
            }
        });
    }

    /* renamed from: A */
    public void m47894A(String str, String str2) {
        ArrayList<C8969o> arrayList;
        try {
            synchronized (this.f47933c) {
                arrayList = new ArrayList(this.f47933c.values());
            }
            for (C8969o c8969o : arrayList) {
                if (c8969o != null && TextUtils.equals(c8969o.f47981b, str) && TextUtils.equals(c8969o.f47982c, str2) && !m47872U(c8969o)) {
                    m47919i0(c8969o);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: A0 */
    void m47895A0(C8969o c8969o) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("startLiveLocationService live id: ");
            sb2.append(c8969o.f47980a);
            LiveLocationBackgroundWorker.Companion.m47862c(c8969o);
            C23744a.m124114c().m124115b(this.f47942l, 85);
            C23744a.m124114c().m124115b(this.f47942l, 86);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: B */
    public List m47896B(String str, boolean z11) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f47933c) {
            try {
                for (C8969o c8969o : this.f47933c.values()) {
                    if (TextUtils.equals(str, c8969o.f47981b)) {
                        if (z11) {
                            if (!C21927m.m114302u().m114345m(c8969o.f47981b)) {
                                arrayList.add(c8969o);
                            }
                        } else {
                            arrayList.add(c8969o);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: B0 */
    void m47897B0() {
        C23744a.m124114c().m124116d(201, new Object[0]);
        C23744a.m124114c().m124117e(this.f47942l, 85);
        C23744a.m124114c().m124117e(this.f47942l, 86);
    }

    /* renamed from: C */
    public List m47898C(boolean z11) {
        ArrayList arrayList;
        synchronized (this.f47934d) {
            arrayList = new ArrayList(this.f47934d.values());
        }
        if (z11) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C8969o c8969o = (C8969o) it.next();
                if (c8969o != null && !TextUtils.isEmpty(c8969o.f47981b) && C21927m.m114302u().m114345m(c8969o.f47981b)) {
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: C0 */
    void m47899C0() {
        m47908I().m47961i();
        this.f47945o = null;
        this.f47946p = 0L;
    }

    /* renamed from: D */
    Location m47900D() {
        LocationManager locationManager;
        Location location = this.f47945o;
        if (location == null) {
            try {
                if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112034k) == 0 && (location = (locationManager = (LocationManager) MainApplication.getAppContext().getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)).getLastKnownLocation("gps")) == null) {
                    location = locationManager.getLastKnownLocation("network");
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return location;
            }
        }
        if (location == null) {
            return C28157p5.m141667d().m141673c();
        }
        return location;
    }

    /* renamed from: D0 */
    public void m47901D0(String str, C8956b c8956b) {
        if (m47910L(str) == null) {
            this.f47935e.put(str, c8956b);
        }
    }

    /* renamed from: E0 */
    public void m47902E0() {
        C23744a.m124114c().m124116d(200, new Object[0]);
    }

    /* renamed from: F */
    public C8956b m47903F(String str) {
        return (C8956b) this.f47935e.get(str);
    }

    /* renamed from: F0 */
    void m47904F0(final MessageId messageId, final C8969o c8969o) {
        try {
            C23288a.f113033a.mo13474a(new C18427b(messageId.m41048l(), new Runnable() { // from class: com.zing.zalo.location.e
                @Override // java.lang.Runnable
                public final void run() {
                    C8967m.m47881b0(MessageId.this, c8969o);
                }
            }));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: G */
    public void m47905G(long j11, String str, MessageId messageId, boolean z11, f fVar) {
        if (!AbstractC23138m0.m118770b()) {
            return;
        }
        if (z11) {
            synchronized (this.f47938h) {
                try {
                    if (this.f47938h.contains(Long.valueOf(j11))) {
                        return;
                    } else {
                        this.f47938h.add(Long.valueOf(j11));
                    }
                } finally {
                }
            }
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d(str, messageId, j11, fVar, z11));
        C8969o m47907H = m47907H(j11);
        if (m47907H == null) {
            m47907H = new C8969o();
            m47907H.f47980a = j11;
            m47907H.f47981b = str;
            if (messageId != null) {
                m47907H.f47982c = messageId.m41050n();
            }
            m47907H.m47967e();
        }
        c0766k.mo1784y7(m47907H, z11);
    }

    /* renamed from: G0 */
    void m47906G0(String str, final MessageId messageId, final long j11, final double d11, final double d12) {
        try {
            C23288a.f113033a.mo13474a(new C18427b(str, new Runnable() { // from class: com.zing.zalo.location.f
                @Override // java.lang.Runnable
                public final void run() {
                    C8967m.m47883c0(MessageId.this, d12, d11, j11);
                }
            }));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: H */
    public C8969o m47907H(long j11) {
        C8969o c8969o;
        synchronized (this.f47933c) {
            c8969o = (C8969o) this.f47933c.get(Long.valueOf(j11));
        }
        return c8969o;
    }

    /* renamed from: I */
    g m47908I() {
        g gVar = this.f47940j;
        if (gVar == null || !gVar.isAlive()) {
            g gVar2 = new g();
            this.f47940j = gVar2;
            gVar2.start();
        }
        return this.f47940j;
    }

    /* renamed from: J */
    public int m47909J() {
        int size;
        synchronized (this.f47934d) {
            size = this.f47934d.size();
        }
        return size;
    }

    /* renamed from: L */
    public C8969o m47910L(String str) {
        synchronized (this.f47934d) {
            try {
                for (C8969o c8969o : this.f47934d.values()) {
                    if (c8969o != null && TextUtils.equals(str, c8969o.f47981b) && !m47872U(c8969o)) {
                        return c8969o;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: M */
    public boolean m47911M() {
        boolean z11;
        synchronized (this.f47934d) {
            try {
                Iterator it = this.f47934d.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!m47872U((C8969o) it.next())) {
                            z11 = true;
                            break;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: O */
    public void m47912O() {
        if (this.f47931a.compareAndSet(false, true)) {
            m47893p();
            m47939t0();
        }
    }

    /* renamed from: Q */
    void m47913Q(C8969o c8969o) {
        C0824j.m2153b(new e(c8969o));
    }

    /* renamed from: R */
    public boolean m47914R(String str) {
        boolean contains;
        synchronized (this.f47937g) {
            contains = this.f47937g.contains(str);
        }
        return contains;
    }

    /* renamed from: S */
    public boolean m47915S(String str) {
        boolean contains;
        synchronized (this.f47936f) {
            contains = this.f47936f.contains(str);
        }
        return contains;
    }

    /* renamed from: e0 */
    void m47916e0(C8969o c8969o) {
        if (c8969o != null) {
            m47919i0(c8969o);
        }
    }

    /* renamed from: g0 */
    void m47917g0(final int i11, final h hVar) {
        if (hVar != null) {
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.location.k
                @Override // java.lang.Runnable
                public final void run() {
                    C8967m.h.this.mo47962a(i11);
                }
            });
        }
    }

    /* renamed from: h0 */
    public void m47918h0(long j11, String str, MessageId messageId, long j12, double d11, double d12) {
        C8969o c8969o;
        try {
            synchronized (this.f47933c) {
                c8969o = (C8969o) this.f47933c.get(Long.valueOf(j11));
            }
            if (c8969o != null) {
                c8969o.f47990k = C23793c.m124316k().mo124310e();
                c8969o.f47997r = true;
                c8969o.f47995p = j12;
                c8969o.f47984e = d11;
                c8969o.f47985f = d12;
                m47913Q(c8969o);
                m47937s0(j11, c8969o);
            }
            m47906G0(str, messageId, j12, d11, d12);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i0 */
    void m47919i0(C8969o c8969o) {
        m47918h0(c8969o.f47980a, c8969o.f47981b, c8969o.f47988i, c8969o.f47995p, c8969o.f47984e, c8969o.f47985f);
    }

    /* renamed from: j0 */
    public void m47920j0(String str) {
        try {
            m47948y(m47910L(str));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: k */
    void m47921k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f47937g) {
            try {
                if (!this.f47937g.contains(str)) {
                    this.f47937g.add(str);
                    C23744a.m124114c().m124116d(83, new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k0 */
    public void m47922k0(long j11) {
        C8969o c8969o;
        try {
            synchronized (this.f47934d) {
                c8969o = (C8969o) this.f47934d.get(Long.valueOf(j11));
            }
            if (c8969o != null) {
                m47948y(c8969o);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: l */
    void m47923l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f47936f) {
            try {
                if (!this.f47936f.contains(str)) {
                    this.f47936f.add(str);
                    C23744a.m124114c().m124116d(83, new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l0 */
    void m47924l0(C8969o c8969o, int i11) {
        boolean z11;
        boolean z12;
        MessageId messageId;
        if (c8969o == null) {
            return;
        }
        try {
            if (m47872U(c8969o)) {
                if (i11 == 3 && c8969o.f47998s != null) {
                    m47927n(c8969o);
                    return;
                }
                return;
            }
            synchronized (this.f47933c) {
                long j11 = c8969o.f47980a;
                C8969o c8969o2 = (C8969o) this.f47933c.get(Long.valueOf(j11));
                if (c8969o2 != null) {
                    c8969o = c8969o2;
                    z11 = false;
                } else {
                    this.f47933c.put(Long.valueOf(j11), c8969o);
                    z11 = true;
                }
            }
            if (i11 != 4 && c8969o.f47981b != null && (messageId = c8969o.f47988i) != null) {
                m47904F0(messageId, c8969o);
            }
            if (z11) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(c8969o.f47982c);
                if (m141809c != null) {
                    c8969o.f47992m = m141809c.f42446v;
                    c8969o.f47991l = m141809c.f42437s;
                }
                C23744a.m124114c().m124116d(84, 1, c8969o);
            } else {
                C23744a.m124114c().m124116d(84, 2, c8969o);
            }
            if (i11 != 4) {
                m47913Q(c8969o);
            }
            if (TextUtils.equals(CoreUtility.f89233i, c8969o.f47982c)) {
                if (i11 != 1 && i11 != 4) {
                    if (i11 == 2) {
                        synchronized (this.f47934d) {
                            this.f47934d.put(Long.valueOf(c8969o.f47980a), c8969o);
                        }
                        m47902E0();
                        C23744a.m124114c().m124116d(83, 2, c8969o);
                        return;
                    }
                    return;
                }
                if (!m47872U(c8969o)) {
                    synchronized (this.f47934d) {
                        z12 = !this.f47934d.containsKey(Long.valueOf(c8969o.f47980a));
                        this.f47934d.put(Long.valueOf(c8969o.f47980a), c8969o);
                    }
                    if (z12) {
                        m47895A0(c8969o);
                        m47902E0();
                        C23744a.m124114c().m124116d(83, 1, c8969o);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: m */
    public void m47925m() {
        try {
            if (m47908I().f47970q != null) {
                m47908I().f47970q.post(new Runnable() { // from class: com.zing.zalo.location.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8967m.this.m47934r();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: m0 */
    public void m47926m0(C17945a0 c17945a0) {
        if (c17945a0 != null) {
            try {
                if (c17945a0.m94941L6()) {
                    C17996r0 c17996r0 = (C17996r0) c17945a0.m94929K2();
                    C8969o m47907H = m47907H(c17996r0.f91147B);
                    if (m47907H == null) {
                        m47907H = new C8969o();
                    }
                    m47907H.f47980a = c17996r0.f91147B;
                    m47907H.f47990k = c17996r0.f91153H;
                    m47907H.f47989j = c17996r0.f91152G;
                    m47907H.f47985f = c17996r0.f91149D;
                    m47907H.f47984e = c17996r0.f91150E;
                    m47907H.f47995p = c17996r0.f91154I;
                    m47907H.f47981b = c17945a0.mo95039W2();
                    m47907H.f47982c = c17945a0.m94862C4();
                    m47907H.f47988i = c17945a0.m95029V3();
                    m47907H.m47967e();
                    m47924l0(m47907H, 1);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: n */
    void m47927n(C8969o c8969o) {
        boolean z11;
        try {
            C17945a0 c17945a0 = c8969o.f47998s;
            if (c17945a0 != null && (c17945a0.m94929K2() instanceof C17996r0)) {
                C17996r0 c17996r0 = (C17996r0) c17945a0.m94929K2();
                if (m47872U(c8969o) != c17996r0.f91151F) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    c17996r0.m95681i(true);
                }
                if (AbstractC31195a.m151996a(c8969o.f47984e, c8969o.f47985f, c17996r0.f91150E, c17996r0.f91149D) < f47927v && !z11) {
                    return;
                }
                m47904F0(c17945a0.m95029V3(), c8969o);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n0 */
    public void m47928n0(JSONObject jSONObject, String str, String str2) {
        double d11;
        try {
            long optLong = jSONObject.optLong("live_location_id");
            long optLong2 = jSONObject.optLong("liveVer", -1L);
            double optDouble = jSONObject.optDouble("long", 0.0d);
            double optDouble2 = jSONObject.optDouble("lat", 0.0d);
            C8969o m47907H = m47907H(optLong);
            if (m47907H != null) {
                if (optLong2 <= m47907H.f47995p) {
                    return;
                }
                d11 = optDouble;
                if (AbstractC31195a.m151996a(m47907H.f47986g, m47907H.f47987h, optDouble2, d11) >= f47930y) {
                    m47907H.f47986g = m47907H.f47984e;
                    m47907H.f47987h = m47907H.f47985f;
                }
            } else {
                d11 = optDouble;
                m47907H = new C8969o();
                m47907H.f47981b = str;
                m47907H.f47982c = str2;
            }
            m47907H.f47980a = optLong;
            if (jSONObject.has("globalMsgId") || jSONObject.has("cliMsgId")) {
                m47907H.f47988i = MessageId.m41038e(jSONObject.optString("cliMsgId"), jSONObject.optString("globalMsgId"), m47907H.f47981b, m47907H.f47982c);
            }
            if (jSONObject.has("start_time")) {
                m47907H.f47989j = jSONObject.optLong("start_time");
            }
            if (jSONObject.has("expired_time")) {
                m47907H.f47990k = jSONObject.optLong("expired_time");
            }
            m47907H.f47985f = d11;
            m47907H.f47984e = optDouble2;
            m47907H.f47995p = optLong2;
            if (this.f47939i.get()) {
                m47924l0(m47907H, 2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o */
    public void m47929o(C17945a0 c17945a0) {
        long j11;
        Long l11;
        if (c17945a0 == null || !(c17945a0.m94929K2() instanceof C17996r0) || c17945a0.m95032V6()) {
            return;
        }
        C17996r0 c17996r0 = (C17996r0) c17945a0.m94929K2();
        if (c17996r0.f91151F) {
            return;
        }
        long mo124310e = C23793c.m124316k().mo124310e() - c17996r0.f91154I;
        if (this.f47944n.containsKey(Long.valueOf(c17996r0.f91147B)) && (l11 = (Long) this.f47944n.get(Long.valueOf(c17996r0.f91147B))) != null) {
            j11 = l11.longValue();
        } else {
            j11 = Long.MIN_VALUE;
        }
        if (mo124310e > f47926u * 2 * 1000 && Math.abs(System.currentTimeMillis() - j11) > f47926u * 2 * 1000) {
            this.f47944n.put(Long.valueOf(c17996r0.f91147B), Long.valueOf(System.currentTimeMillis()));
            m47905G(c17996r0.f91147B, c17945a0.mo95039W2(), c17945a0.m95029V3(), true, null);
        }
    }

    /* renamed from: o0 */
    public void m47930o0(final String str) {
        AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: com.zing.zalo.location.h
            @Override // java.lang.Runnable
            public final void run() {
                C8967m.m47877Z(str);
            }
        });
    }

    /* renamed from: p0 */
    void m47931p0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f47937g) {
            try {
                if (this.f47937g.contains(str)) {
                    this.f47937g.remove(str);
                    C23744a.m124114c().m124116d(83, new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    public void m47932q(boolean z11) {
        try {
            try {
                this.f47939i.set(false);
                if (z11) {
                    m47874W(false);
                } else {
                    synchronized (this.f47933c) {
                        this.f47933c.clear();
                    }
                    synchronized (this.f47934d) {
                        this.f47934d.clear();
                    }
                    m47899C0();
                    m47897B0();
                }
                synchronized (this.f47936f) {
                    this.f47936f.clear();
                }
                synchronized (this.f47937g) {
                    this.f47937g.clear();
                }
                synchronized (this.f47938h) {
                    this.f47938h.clear();
                }
                g gVar = this.f47940j;
                if (gVar != null) {
                    gVar.quitSafely();
                }
                this.f47944n.clear();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            this.f47931a.set(false);
        } catch (Throwable th2) {
            this.f47931a.set(false);
            throw th2;
        }
    }

    /* renamed from: q0 */
    void m47933q0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f47936f) {
            try {
                if (this.f47936f.contains(str)) {
                    this.f47936f.remove(str);
                    C23744a.m124114c().m124116d(83, new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m47934r() {
        ArrayList<C8969o> arrayList;
        synchronized (this.f47934d) {
            arrayList = new ArrayList(this.f47934d.values());
        }
        for (C8969o c8969o : arrayList) {
            if (m47872U(c8969o)) {
                m47916e0(c8969o);
            }
        }
    }

    /* renamed from: r0 */
    public void m47935r0(String str) {
        this.f47935e.remove(str);
    }

    /* renamed from: s */
    public void m47936s() {
        ArrayList arrayList;
        synchronized (this.f47934d) {
            arrayList = new ArrayList(this.f47934d.values());
        }
        m47944w(arrayList, m47900D(), 0);
    }

    /* renamed from: s0 */
    public void m47937s0(long j11, C8969o c8969o) {
        if (c8969o != null) {
            try {
                synchronized (this.f47933c) {
                    this.f47933c.remove(Long.valueOf(c8969o.f47980a));
                }
                synchronized (this.f47934d) {
                    try {
                        if (this.f47934d.containsKey(Long.valueOf(c8969o.f47980a))) {
                            this.f47934d.remove(Long.valueOf(c8969o.f47980a));
                            if (this.f47934d.isEmpty()) {
                                m47897B0();
                            } else {
                                m47902E0();
                            }
                            C23744a.m124114c().m124116d(83, 3, c8969o);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C23744a.m124114c().m124116d(84, 3, c8969o);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: t */
    public void m47938t(C8969o c8969o) {
        if (c8969o != null) {
            m47944w(Collections.singletonList(c8969o), m47900D(), 0);
        }
    }

    /* renamed from: t0 */
    public void m47939t0() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.location.g
            @Override // java.lang.Runnable
            public final void run() {
                C8967m.this.m47879a0();
            }
        });
    }

    /* renamed from: u */
    public void m47940u(C17945a0 c17945a0) {
        if (c17945a0 != null) {
            try {
                if (c17945a0.m94929K2() instanceof C17996r0) {
                    C8969o c8969o = new C8969o();
                    c8969o.f47981b = c17945a0.mo95039W2();
                    c8969o.f47982c = c17945a0.m94862C4();
                    c8969o.m47967e();
                    c8969o.f47980a = ((C17996r0) c17945a0.m94929K2()).f91147B;
                    m47944w(Collections.singletonList(c8969o), m47900D(), 0);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: u0 */
    public void m47941u0() {
        if (m47909J() != 0 && AbstractC23034c6.m118167n(this.f47932b, AbstractC23034c6.f112034k) == 0) {
            m47908I().m47957e();
        }
    }

    /* renamed from: v */
    public void m47942v(String str) {
        try {
            C8969o m47910L = m47910L(str);
            if (m47910L != null) {
                m47938t(m47910L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: v0 */
    public void m47943v0(Location location) {
        double d11;
        ArrayList<C8969o> arrayList = new ArrayList();
        synchronized (this.f47934d) {
            try {
                for (C8969o c8969o : this.f47934d.values()) {
                    if (!m47872U(c8969o)) {
                        arrayList.add(c8969o);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m47945w0(location, arrayList, 0);
        long mo124310e = C23793c.m124316k().mo124310e();
        for (C8969o c8969o2 : arrayList) {
            double d12 = 0.0d;
            if (location != null) {
                d11 = location.getLongitude();
            } else {
                d11 = 0.0d;
            }
            c8969o2.f47985f = d11;
            if (location != null) {
                d12 = location.getLatitude();
            }
            c8969o2.f47984e = d12;
            c8969o2.f47995p = mo124310e;
            m47904F0(c8969o2.f47988i, c8969o2);
            C23744a.m124114c().m124116d(84, 2, c8969o2);
        }
    }

    /* renamed from: w */
    void m47944w(List list, Location location, int i11) {
        double d11;
        double d12;
        if (!AbstractC23138m0.m118770b() || i11 > 2) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m47921k(((C8969o) it.next()).f47981b);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(list));
        if (location != null) {
            d11 = location.getLongitude();
        } else {
            d11 = 0.0d;
        }
        if (location != null) {
            d12 = location.getLatitude();
        } else {
            d12 = 0.0d;
        }
        c0766k.mo1725r5(list, d11, d12);
    }

    /* renamed from: w0 */
    void m47945w0(Location location, List list, int i11) {
        if (!AbstractC23138m0.m118770b() || location == null || list == null || list.isEmpty() || i11 > 2) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c());
        c0766k.mo1467K5(list, location.getLongitude(), location.getLatitude());
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m47874W(final boolean z11) {
        ArrayList arrayList;
        if (C29628e.m147249E0().m93432x() && C23055e5.m118271f()) {
            this.f47943m = 0;
            synchronized (this.f47934d) {
                arrayList = new ArrayList(this.f47934d.values());
            }
            m47950z(arrayList, z11);
            return;
        }
        int i11 = this.f47943m;
        if (i11 < 5) {
            this.f47943m = i11 + 1;
            AbstractC17930e.m94545d().mo94531e(new Runnable() { // from class: com.zing.zalo.location.l
                @Override // java.lang.Runnable
                public final void run() {
                    C8967m.this.m47874W(z11);
                }
            }, this.f47943m * 5000);
        }
    }

    /* renamed from: x0 */
    void m47947x0(Location location, boolean z11) {
        float f11;
        try {
            Location location2 = this.f47945o;
            if (location2 != null && this.f47946p != 0) {
                float distanceTo = location2.distanceTo(location);
                long abs = Math.abs(System.currentTimeMillis() - this.f47946p);
                if (abs > 0) {
                    f11 = distanceTo / ((((float) abs) * 1.0f) / 1000.0f);
                } else {
                    f11 = -1.0f;
                }
                if (f11 > f47929x) {
                    return;
                }
            }
            this.f47945o = location;
            this.f47946p = System.currentTimeMillis();
            if (!z11 && m47911M()) {
                m47908I().m47956c();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: y */
    public void m47948y(C8969o c8969o) {
        if (c8969o != null) {
            m47950z(Collections.singletonList(c8969o), true);
        }
    }

    /* renamed from: y0 */
    public void m47949y0(Location location) {
        if (location != null) {
            m47947x0(location, false);
        }
    }

    /* renamed from: z */
    void m47950z(List list, boolean z11) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m47919i0((C8969o) it.next());
            }
            if (z11) {
                m47944w(list, m47900D(), 0);
            }
        }
    }

    /* renamed from: z0 */
    public void m47951z0(ZaloView zaloView, C3535c c3535c, short s7, h hVar) {
        boolean z11;
        try {
            Context context = this.f47932b;
            String[] strArr = AbstractC23034c6.f112034k;
            if (AbstractC23034c6.m118167n(context, strArr) != 0) {
                if (zaloView != null) {
                    AbstractC23034c6.m118184v0(zaloView, strArr, 120);
                }
                m47917g0(-2, hVar);
                return;
            }
            byte m47964d = C8969o.m47964d(c3535c.m17944I0());
            String m17944I0 = c3535c.m17944I0();
            int m47963c = C8969o.m47963c(m17944I0, m47964d);
            if (m47867E().m47910L(m17944I0) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!m47915S(m17944I0) && !z11) {
                WeakReference weakReference = new WeakReference(zaloView);
                m47923l(m17944I0);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                this.f47935e.remove(m17944I0);
                C28239y6 c28239y6 = new C28239y6();
                c28239y6.m142229k(false);
                SensitiveData sensitiveData = new SensitiveData("live_location", "live_location");
                if (!c28239y6.m142225f(this.f47932b, new a(m17944I0, c28239y6, hVar, weakReference, atomicBoolean, m47964d, m47963c, s7), sensitiveData)) {
                    m47933q0(m17944I0);
                    if (!C8937j0.m47663l(sensitiveData.m35528c())) {
                        m47917g0(-7, hVar);
                    } else {
                        m47917g0(-3, hVar);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
