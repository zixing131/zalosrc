package com.zing.zalo.shortvideo.p072ui.state.floating;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.AbstractC1765e;
import androidx.lifecycle.InterfaceC1767f;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.LivestreamVideoLayout;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.state.ZchMasterView;
import com.zing.zalo.shortvideo.p072ui.state.floating.C10106b;
import com.zing.zalo.shortvideo.p072ui.state.floating.C10107c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import l20.C22006a;
import l20.InterfaceC22007b;
import p227i3.C20218v;
import p354n3.AbstractC23529b;
import p354n3.C23528a;
import p379o3.C23994e;
import p379o3.C23995f;
import v00.C27415j;
import v00.C27416k;

/* loaded from: classes5.dex */
public final class FloatingManager {

    /* renamed from: h */
    private static FloatingManager f52497h;

    /* renamed from: a */
    private AbstractC23529b f52499a;

    /* renamed from: b */
    private AbstractC10105a f52500b;

    /* renamed from: c */
    private final ArrayList f52501c = new ArrayList();

    /* renamed from: d */
    private WeakReference f52502d;

    /* renamed from: e */
    private WeakReference f52503e;

    /* renamed from: f */
    private ZaloActivity f52504f;

    /* renamed from: g */
    private boolean f52505g;
    public static final C10103a Companion = new C10103a(null);

    /* renamed from: i */
    private static final ReentrantLock f52498i = new ReentrantLock();

    /* renamed from: com.zing.zalo.shortvideo.ui.state.floating.FloatingManager$a */
    /* loaded from: classes5.dex */
    public static final class C10103a {
        private C10103a() {
        }

        public /* synthetic */ C10103a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m53859a(Object obj) {
            String str = null;
            if (obj instanceof Video) {
                if (m53860b() instanceof C10107c) {
                    AbstractC10105a m53860b = m53860b();
                    if (m53860b != null) {
                        str = m53860b.mo53883i();
                    }
                    if (AbstractC19074t.m100204b(str, ((Video) obj).m52911t())) {
                        return;
                    }
                }
                m53870l(new C10107c((Video) obj));
                return;
            }
            if (obj instanceof Channel) {
                if (m53860b() instanceof C22006a) {
                    AbstractC10105a m53860b2 = m53860b();
                    if (m53860b2 != null) {
                        str = m53860b2.mo53883i();
                    }
                    if (AbstractC19074t.m100204b(str, ((Channel) obj).m50769l())) {
                        return;
                    }
                }
                m53870l(new C22006a((Channel) obj));
                return;
            }
            if (obj instanceof LivestreamData) {
                if (m53860b() instanceof C10106b) {
                    AbstractC10105a m53860b3 = m53860b();
                    if (m53860b3 != null) {
                        str = m53860b3.mo53883i();
                    }
                    if (AbstractC19074t.m100204b(str, ((LivestreamData) obj).m51016f())) {
                        return;
                    }
                }
                m53870l(new C10106b((LivestreamData) obj));
            }
        }

        /* renamed from: b */
        public final AbstractC10105a m53860b() {
            return m53862d().f52500b;
        }

        /* renamed from: c */
        public final void m53861c() {
            m53862d().m53852u();
        }

        /* renamed from: d */
        public final FloatingManager m53862d() {
            ReentrantLock reentrantLock = FloatingManager.f52498i;
            reentrantLock.lock();
            try {
                if (FloatingManager.f52497h == null) {
                    FloatingManager.f52497h = new FloatingManager();
                }
                FloatingManager floatingManager = FloatingManager.f52497h;
                AbstractC19074t.m100205c(floatingManager);
                reentrantLock.unlock();
                return floatingManager;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        /* renamed from: e */
        public final boolean m53863e() {
            return m53862d().f52505g;
        }

        /* renamed from: f */
        public final void m53864f(View view) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            AbstractC10105a m53860b = m53860b();
            if (m53860b != null) {
                m53860b.m53889o(view);
            }
        }

        /* renamed from: g */
        public final void m53865g(LivestreamVideoLayout livestreamVideoLayout) {
            AbstractC19074t.m100208f(livestreamVideoLayout, C20218v.f100059b);
            m53862d().m53853v(livestreamVideoLayout);
        }

        /* renamed from: h */
        public final void m53866h(VideoLayout videoLayout) {
            AbstractC19074t.m100208f(videoLayout, C20218v.f100059b);
            m53862d().m53854w(videoLayout);
        }

        /* renamed from: i */
        public final void m53867i(boolean z11, Object obj) {
            FloatingManager floatingManager = FloatingManager.f52497h;
            if (floatingManager != null) {
                floatingManager.m53855x(z11, obj);
            }
        }

        /* renamed from: j */
        public final void m53868j() {
            FloatingManager floatingManager = FloatingManager.f52497h;
            if (floatingManager != null) {
                floatingManager.f52505g = false;
            }
        }

        /* renamed from: k */
        public final void m53869k(InterfaceC22007b interfaceC22007b) {
            AbstractC19074t.m100208f(interfaceC22007b, "listener");
            m53862d().m53856y(interfaceC22007b);
        }

        /* renamed from: l */
        public final void m53870l(AbstractC10105a abstractC10105a) {
            m53862d().f52500b = abstractC10105a;
        }

        /* renamed from: m */
        public final void m53871m() {
            m53862d().m53830A();
        }

        /* renamed from: n */
        public final void m53872n() {
            AbstractC10105a abstractC10105a;
            FloatingManager m53862d = m53862d();
            AbstractC10105a abstractC10105a2 = m53862d.f52500b;
            View view = null;
            if (abstractC10105a2 instanceof C10107c) {
                AbstractC10105a abstractC10105a3 = m53862d.f52500b;
                if (abstractC10105a3 != null) {
                    C10107c.a aVar = C10107c.Companion;
                    WeakReference weakReference = m53862d.f52502d;
                    if (weakReference != null) {
                        view = (VideoLayout) weakReference.get();
                    }
                    abstractC10105a3.m53892r(aVar.m53898a(view));
                    return;
                }
                return;
            }
            if ((abstractC10105a2 instanceof C10106b) && (abstractC10105a = m53862d.f52500b) != null) {
                C10106b.a aVar2 = C10106b.Companion;
                WeakReference weakReference2 = m53862d.f52503e;
                if (weakReference2 != null) {
                    view = (LivestreamVideoLayout) weakReference2.get();
                }
                abstractC10105a.m53892r(aVar2.m53895a(view));
            }
        }

        /* renamed from: o */
        public final void m53873o(InterfaceC22007b interfaceC22007b) {
            AbstractC19074t.m100208f(interfaceC22007b, "listener");
            FloatingManager floatingManager = FloatingManager.f52497h;
            if (floatingManager != null) {
                floatingManager.m53831B(interfaceC22007b);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.state.floating.FloatingManager$b */
    /* loaded from: classes5.dex */
    public static final class C10104b extends C23994e {
        C10104b() {
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public void mo1932C(String str, Bitmap bitmap, C23995f c23995f) {
            AbstractC10105a abstractC10105a = FloatingManager.this.f52500b;
            if (abstractC10105a != null) {
                abstractC10105a.m53892r(bitmap);
            }
            FloatingManager.this.m53832C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m53830A() {
        Bitmap bitmap;
        AbstractC10105a abstractC10105a = this.f52500b;
        if (abstractC10105a == null) {
            return;
        }
        this.f52505g = true;
        String str = null;
        if (abstractC10105a != null) {
            bitmap = abstractC10105a.m53886l();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            m53832C();
            return;
        }
        AbstractC10105a abstractC10105a2 = this.f52500b;
        if (abstractC10105a2 instanceof C10107c) {
            AbstractC19074t.m100206d(abstractC10105a2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.state.floating.FloatingVideo");
            str = ((Video) ((C10107c) abstractC10105a2).m53888n()).m52898l();
        } else if (abstractC10105a2 instanceof C22006a) {
            AbstractC19074t.m100206d(abstractC10105a2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.state.floating.FloatingChannel");
            str = ((Channel) ((C22006a) abstractC10105a2).m53888n()).m50754c();
        } else if (abstractC10105a2 instanceof C10106b) {
            AbstractC19074t.m100206d(abstractC10105a2, "null cannot be cast to non-null type com.zing.zalo.shortvideo.ui.state.floating.FloatingLivestream");
            str = ((LivestreamData) ((C10106b) abstractC10105a2).m53888n()).m51031u();
        }
        if (str == null) {
            m53832C();
            return;
        }
        AbstractC23529b abstractC23529b = this.f52499a;
        if (abstractC23529b != null) {
            abstractC23529b.m123597b(str, Bitmap.class, new C10104b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m53831B(InterfaceC22007b interfaceC22007b) {
        this.f52501c.remove(interfaceC22007b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m53832C() {
        ZaloActivity zaloActivity = this.f52504f;
        if (zaloActivity == null || (zaloActivity.mo35579p().m93012K0() instanceof ZchMasterView)) {
            return;
        }
        C27415j m140375b = C27415j.Companion.m140375b(zaloActivity);
        AbstractC10105a abstractC10105a = this.f52500b;
        if (abstractC10105a != null) {
            if (abstractC10105a instanceof C10106b) {
                Bitmap m53887m = abstractC10105a.m53887m();
                if (m53887m == null) {
                    m53887m = AbstractC10105a.Companion.m53893a();
                }
                m140375b.mo47804f(new C27416k(m53887m, null, 2, null), true);
            } else {
                Bitmap m53886l = abstractC10105a.m53886l();
                if (m53886l == null) {
                    m53886l = AbstractC10105a.Companion.m53894b();
                }
                m140375b.mo47804f(new C27416k(m53886l, null, 2, null), true);
            }
            StateManager.Companion.m53808l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m53852u() {
        C27415j.Companion.m140374a();
        if (this.f52500b instanceof C22006a) {
            m53857z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m53853v(LivestreamVideoLayout livestreamVideoLayout) {
        LivestreamVideoLayout livestreamVideoLayout2;
        WeakReference weakReference = this.f52503e;
        if (weakReference != null) {
            livestreamVideoLayout2 = (LivestreamVideoLayout) weakReference.get();
        } else {
            livestreamVideoLayout2 = null;
        }
        if (!AbstractC19074t.m100204b(livestreamVideoLayout2, livestreamVideoLayout)) {
            if (livestreamVideoLayout.getTag() == null) {
                livestreamVideoLayout.setTag(UUID.randomUUID());
            }
            WeakReference weakReference2 = this.f52503e;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            this.f52503e = null;
            this.f52503e = new WeakReference(livestreamVideoLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m53854w(VideoLayout videoLayout) {
        VideoLayout videoLayout2;
        WeakReference weakReference = this.f52502d;
        if (weakReference != null) {
            videoLayout2 = (VideoLayout) weakReference.get();
        } else {
            videoLayout2 = null;
        }
        if (!AbstractC19074t.m100204b(videoLayout2, videoLayout)) {
            if (videoLayout.getTag() == null) {
                videoLayout.setTag(UUID.randomUUID());
            }
            WeakReference weakReference2 = this.f52502d;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            this.f52502d = null;
            this.f52502d = new WeakReference(videoLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m53855x(boolean z11, Object obj) {
        Object obj2;
        LivestreamVideoLayout livestreamVideoLayout;
        VideoLayout videoLayout;
        WeakReference weakReference = this.f52502d;
        Object obj3 = null;
        if (weakReference != null && (videoLayout = (VideoLayout) weakReference.get()) != null) {
            obj2 = videoLayout.getTag();
        } else {
            obj2 = null;
        }
        if (!AbstractC19074t.m100204b(obj2, obj)) {
            WeakReference weakReference2 = this.f52503e;
            if (weakReference2 != null && (livestreamVideoLayout = (LivestreamVideoLayout) weakReference2.get()) != null) {
                obj3 = livestreamVideoLayout.getTag();
            }
            if (!AbstractC19074t.m100204b(obj3, obj)) {
                return;
            }
        }
        Iterator it = this.f52501c.iterator();
        while (it.hasNext()) {
            ((InterfaceC22007b) it.next()).mo54538a(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final void m53856y(InterfaceC22007b interfaceC22007b) {
        this.f52501c.add(interfaceC22007b);
    }

    /* renamed from: z */
    private final void m53857z() {
        AbstractC10105a abstractC10105a = this.f52500b;
        if (abstractC10105a != null) {
            abstractC10105a.m53890p();
        }
        this.f52500b = null;
    }

    /* renamed from: t */
    public final void m53858t(ZaloActivity zaloActivity) {
        AbstractC19074t.m100208f(zaloActivity, "activity");
        if (this.f52504f == null) {
            this.f52504f = zaloActivity;
            zaloActivity.getLifecycle().mo9335a(new InterfaceC1767f() { // from class: com.zing.zalo.shortvideo.ui.state.floating.FloatingManager$inject$1
                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: D5 */
                public /* synthetic */ void mo8645D5(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9272a(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: Ro */
                public /* synthetic */ void mo8646Ro(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9275d(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: Xy */
                public void mo8647Xy(InterfaceC1801w interfaceC1801w) {
                    AbstractC19074t.m100208f(interfaceC1801w, "owner");
                    FloatingManager.this.f52504f = null;
                    FloatingManager.this.f52499a = null;
                    AbstractC1765e.m9273b(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: Zv */
                public /* synthetic */ void mo8648Zv(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9277f(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: mr */
                public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9274c(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: wC */
                public /* synthetic */ void mo8650wC(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9276e(this, interfaceC1801w);
                }
            });
            this.f52499a = new C23528a((Activity) zaloActivity);
        }
    }
}
