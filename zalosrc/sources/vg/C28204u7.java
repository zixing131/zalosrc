package vg;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.p077ui.widget.chat.AnimChat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l30.AbstractC22055v0;
import l30.C22037m0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import o30.C24009b;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p542ub.InterfaceC27218a;
import p716zh.C31844ab;
import p716zh.C32123ta;

/* renamed from: vg.u7 */
/* loaded from: classes3.dex */
public class C28204u7 {

    /* renamed from: a */
    AnimChat f131411a;

    /* renamed from: b */
    ViewGroup f131412b;

    /* renamed from: c */
    InterfaceC27218a f131413c;

    /* renamed from: i */
    int f131419i = 0;

    /* renamed from: j */
    int f131420j = 0;

    /* renamed from: l */
    Runnable f131422l = new a();

    /* renamed from: d */
    Set f131414d = new HashSet();

    /* renamed from: e */
    final Queue f131415e = new LinkedList();

    /* renamed from: f */
    final Queue f131416f = new LinkedList();

    /* renamed from: g */
    AtomicInteger f131417g = new AtomicInteger(0);

    /* renamed from: h */
    Handler f131418h = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    boolean f131421k = AbstractC23309i.m121047Ie();

    /* renamed from: vg.u7$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11;
            if (C28204u7.this.f131417g.get() == 2) {
                if (C22037m0.f108553a.m115034h()) {
                    C28204u7.this.m141833l();
                    i11 = 100;
                } else {
                    C28204u7.this.m141832i();
                    i11 = 1000;
                }
                C28204u7.this.m141834n(i11);
            }
        }
    }

    public C28204u7(InterfaceC27218a interfaceC27218a, ViewGroup viewGroup) {
        this.f131413c = interfaceC27218a;
        this.f131412b = viewGroup;
    }

    /* renamed from: f */
    private void m141831f() {
        ViewGroup viewGroup;
        try {
            if (this.f131411a == null) {
                AnimChat animChat = new AnimChat(this.f131413c.getContext());
                this.f131411a = animChat;
                animChat.f69990e0 = true;
                if (C22037m0.f108553a.m115034h()) {
                    this.f131411a.setMaxTimeAddEmoji(2);
                }
            }
            if (this.f131411a.getParent() == null && (viewGroup = this.f131412b) != null) {
                viewGroup.addView(this.f131411a, new FrameLayout.LayoutParams(-1, -1));
                this.f131411a.m76125x0();
                this.f131411a.m76101A0(true, true);
                this.f131411a.setVisibility(0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m141832i() {
        C31844ab c31844ab;
        AnimChat animChat;
        try {
            synchronized (this.f131415e) {
                try {
                    if (this.f131417g.get() == 2 && (c31844ab = (C31844ab) this.f131415e.poll()) != null && (animChat = this.f131411a) != null) {
                        String str = c31844ab.f146162a;
                        animChat.m76105N(str, c31844ab.f146163b, AbstractC21935u.m114542i(str, c31844ab.f146164c), this.f131419i, this.f131420j);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m141833l() {
        C24009b c24009b;
        AnimChat animChat;
        try {
            synchronized (this.f131416f) {
                try {
                    if (this.f131417g.get() == 2 && (c24009b = (C24009b) this.f131416f.poll()) != null && !TextUtils.isEmpty(c24009b.m125886d()) && (animChat = this.f131411a) != null) {
                        animChat.m76104M(AbstractC22055v0.m115155o(c24009b.m125886d()), c24009b.m125886d(), 10, AbstractC23136l9.m118742r(34.0f), this.f131419i, this.f131420j);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m141834n(int i11) {
        Handler handler = this.f131418h;
        if (handler != null) {
            handler.removeCallbacks(this.f131422l);
            this.f131418h.postDelayed(this.f131422l, i11);
        }
    }

    /* renamed from: q */
    private void m141835q(List list) {
        synchronized (this.f131415e) {
            try {
                this.f131415e.clear();
                if (list != null) {
                    this.f131415e.addAll(list);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    private void m141836r(List list) {
        synchronized (this.f131416f) {
            try {
                this.f131416f.clear();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C24009b c24009b = (C24009b) it.next();
                        for (int i11 = 0; i11 < c24009b.m125885c(); i11++) {
                            arrayList.add(new C24009b(c24009b.m125886d(), 1));
                        }
                    }
                    int i12 = 20;
                    if (arrayList.size() <= 20) {
                        arrayList2.addAll(arrayList);
                    } else {
                        ArrayList<C24009b> arrayList3 = new ArrayList();
                        Iterator it2 = list.iterator();
                        int i13 = 0;
                        while (it2.hasNext()) {
                            C24009b c24009b2 = (C24009b) it2.next();
                            int min = Math.min(3, c24009b2.m125885c());
                            for (int i14 = 0; i14 < min; i14++) {
                                arrayList2.add(new C24009b(c24009b2.m125886d(), 1));
                            }
                            i12 -= min;
                            int m125885c = c24009b2.m125885c() - min;
                            if (m125885c > 0) {
                                arrayList3.add(c24009b2.m125884a(c24009b2.m125886d(), m125885c));
                            }
                            i13 += m125885c;
                        }
                        for (C24009b c24009b3 : arrayList3) {
                            int round = Math.round((c24009b3.m125885c() / i13) * i12);
                            for (int i15 = 0; i15 < round; i15++) {
                                arrayList2.add(new C24009b(c24009b3.m125886d(), 1));
                            }
                        }
                    }
                    Collections.shuffle(arrayList2);
                    this.f131416f.addAll(arrayList2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m141837d() {
        AnimChat animChat;
        m141845p();
        if (this.f131412b != null && (animChat = this.f131411a) != null && animChat.getParent() != null) {
            this.f131411a.m76101A0(false, false);
            this.f131412b.removeView(this.f131411a);
        }
    }

    /* renamed from: e */
    public int m141838e() {
        return this.f131417g.get();
    }

    /* renamed from: g */
    public void m141839g() {
        if (this.f131417g.get() == 2) {
            this.f131417g.set(1);
            this.f131418h.removeCallbacks(this.f131422l);
            AnimChat animChat = this.f131411a;
            if (animChat != null) {
                animChat.m76107P();
            }
        }
    }

    /* renamed from: h */
    public void m141840h(C32123ta c32123ta) {
        if (this.f131421k && c32123ta != null && !TextUtils.isEmpty(c32123ta.f148138h) && !this.f131414d.contains(c32123ta.f148138h)) {
            m141831f();
            m141845p();
            this.f131414d.add(c32123ta.f148138h);
            if (C22037m0.f108553a.m115034h()) {
                m141836r(c32123ta.f148111N);
            } else {
                m141835q(c32123ta.f148104G);
            }
            this.f131417g.set(2);
            m141834n(0);
        }
    }

    /* renamed from: j */
    public void m141841j(String str, int i11, int i12) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m141831f();
        this.f131417g.set(2);
        AnimChat animChat = this.f131411a;
        if (animChat != null) {
            animChat.m76104M(AbstractC22055v0.m115155o(str), str, 9, AbstractC23136l9.m118742r(10.0f), i11 + AbstractC23136l9.m118742r(15.0f), i12);
        }
    }

    /* renamed from: k */
    public void m141842k(String str, int i11) {
        AnimChat animChat;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m141831f();
        if (this.f131417g.get() == 2 && (animChat = this.f131411a) != null) {
            animChat.m76122t0(str, i11);
        }
    }

    /* renamed from: m */
    public void m141843m(C32123ta c32123ta) {
        if (this.f131421k && c32123ta != null && !TextUtils.isEmpty(c32123ta.f148138h) && this.f131414d.contains(c32123ta.f148138h) && this.f131417g.get() == 1) {
            m141831f();
            this.f131417g.set(2);
            m141834n(0);
        }
    }

    /* renamed from: o */
    public void m141844o(int i11, int i12) {
        this.f131419i = i11;
        this.f131420j = i12;
    }

    /* renamed from: p */
    public void m141845p() {
        if (this.f131417g.get() != 0) {
            this.f131417g.set(0);
            this.f131418h.removeCallbacks(this.f131422l);
            if (!C22037m0.f108553a.m115034h()) {
                this.f131414d.clear();
            }
            AnimChat animChat = this.f131411a;
            if (animChat != null) {
                animChat.m76107P();
            }
            synchronized (this.f131415e) {
                this.f131415e.clear();
            }
            synchronized (this.f131416f) {
                this.f131416f.clear();
            }
        }
    }
}
