package com.zing.zalo.p077ui.toolstorage.detail;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaSkeletonView;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.detail.C13383d;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageFileItemModuleView;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageMediaItemModuleView;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageTabAllItemModuleView;
import com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageVoiceItemModuleView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import en0.InterfaceC18505l;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import h40.AbstractC19849s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import p227i3.C20218v;
import p487rl.C25821b;
import p613wl.C29086b;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.C25345g0;
import sm0.AbstractC26327c;
import tg0.C26676b;
import vg.AbstractC28054e7;

/* renamed from: com.zing.zalo.ui.toolstorage.detail.d */
/* loaded from: classes6.dex */
public final class C13383d extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final HashMap f68608A;

    /* renamed from: B */
    private Handler f68609B;

    /* renamed from: C */
    private final c f68610C;

    /* renamed from: r */
    private final ToolStorageDetailPage.EnumC13333a f68611r;

    /* renamed from: s */
    private final String f68612s;

    /* renamed from: t */
    private final InterfaceC18505l f68613t;

    /* renamed from: u */
    private final InterfaceC18505l f68614u;

    /* renamed from: v */
    private final InterfaceC18505l f68615v;

    /* renamed from: w */
    private ArrayList f68616w;

    /* renamed from: x */
    private C13380a f68617x;

    /* renamed from: y */
    private String f68618y;

    /* renamed from: z */
    private final ExecutorService f68619z;

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.d$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.d$b */
    /* loaded from: classes6.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private ToolStorageItemBaseModuleView f68620I;

        /* renamed from: J */
        private RobotoTextView f68621J;

        /* renamed from: K */
        private MediaStoreMediaSkeletonView f68622K;

        /* renamed from: L */
        final /* synthetic */ C13383d f68623L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C13383d c13383d, View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f68623L = c13383d;
            if (i11 != 0) {
                if (i11 != 100) {
                    switch (i11) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f68620I = (ToolStorageItemBaseModuleView) view;
                            return;
                        default:
                            return;
                    }
                }
                this.f68622K = (MediaStoreMediaSkeletonView) this.f7784p;
                return;
            }
            this.f68621J = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_date);
        }

        /* renamed from: i0 */
        public final MediaStoreMediaSkeletonView m75140i0() {
            return this.f68622K;
        }

        /* renamed from: j0 */
        public final ToolStorageItemBaseModuleView m75141j0() {
            return this.f68620I;
        }

        /* renamed from: k0 */
        public final RobotoTextView m75142k0() {
            return this.f68621J;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.d$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC28054e7 {
        c() {
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            super.mo16498e();
            C13380a c13380a = C13383d.this.f68617x;
            if (c13380a != null) {
                c13380a.m75078H(false);
            }
            Handler handler = C13383d.this.f68609B;
            Message message = new Message();
            message.what = 1;
            handler.sendMessage(message);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.d$d */
    /* loaded from: classes6.dex */
    public static final class d implements ToolStorageItemBaseModuleView.InterfaceC13386a {

        /* renamed from: b */
        final /* synthetic */ int f68626b;

        d(int i11) {
            this.f68626b = i11;
        }

        @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView.InterfaceC13386a
        /* renamed from: a */
        public void mo75143a(C13380a c13380a) {
            AbstractC19074t.m100208f(c13380a, "storageUsageDetailItem");
            C13383d.this.f68613t.mo205i9(c13380a);
        }

        @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView.InterfaceC13386a
        /* renamed from: b */
        public void mo75144b(C13380a c13380a) {
            C25821b c25821b;
            if (C13383d.this.f68611r == ToolStorageDetailPage.EnumC13333a.f68485s) {
                if (c13380a != null) {
                    c25821b = c13380a.m75082d();
                } else {
                    c25821b = null;
                }
                C26676b.m136957g("SMLToolStorageDetailPageAdapter", "CloudItem: " + c25821b, null, 4, null);
            }
            ToolStorageItemBaseModuleView.InterfaceC13386a.a.m75176a(this, c13380a);
            C13383d.this.f68614u.mo205i9(Integer.valueOf(this.f68626b));
        }

        @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView.InterfaceC13386a
        /* renamed from: c */
        public void mo75145c(C13380a c13380a) {
            AbstractC19074t.m100208f(c13380a, "storageUsageDetailItem");
            C13383d.this.f68615v.mo205i9(c13380a);
        }

        @Override // com.zing.zalo.p077ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView.InterfaceC13386a
        /* renamed from: d */
        public void mo75146d(C13380a c13380a) {
            AbstractC19074t.m100208f(c13380a, "storageUsageDetailItem");
            C13383d.this.m75126h0(c13380a);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.d$e */
    /* loaded from: classes6.dex */
    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C13380a) obj).m75093o()), Long.valueOf(((C13380a) obj2).m75093o()));
            return m135478b;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.d$f */
    /* loaded from: classes6.dex */
    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C13380a) obj2).m75093o()), Long.valueOf(((C13380a) obj).m75093o()));
            return m135478b;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.d$g */
    /* loaded from: classes6.dex */
    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C13380a) obj2).m75087i()), Long.valueOf(((C13380a) obj).m75087i()));
            return m135478b;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.d$h */
    /* loaded from: classes6.dex */
    public static final class h implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C13380a) obj2).m75093o()), Long.valueOf(((C13380a) obj).m75093o()));
            return m135478b;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.d$i */
    /* loaded from: classes6.dex */
    public static final class i implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C13380a) obj).m75093o()), Long.valueOf(((C13380a) obj2).m75093o()));
            return m135478b;
        }
    }

    public C13383d(ToolStorageDetailPage.EnumC13333a enumC13333a, String str, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18505l interfaceC18505l3) {
        AbstractC19074t.m100208f(enumC13333a, "accessFlow");
        AbstractC19074t.m100208f(str, "tabType");
        AbstractC19074t.m100208f(interfaceC18505l, "onCheckedChange");
        AbstractC19074t.m100208f(interfaceC18505l2, "onItemLongClick");
        AbstractC19074t.m100208f(interfaceC18505l3, "onVoiceDeleted");
        this.f68611r = enumC13333a;
        this.f68612s = str;
        this.f68613t = interfaceC18505l;
        this.f68614u = interfaceC18505l2;
        this.f68615v = interfaceC18505l3;
        this.f68616w = new ArrayList();
        this.f68619z = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("TSDetail-" + System.currentTimeMillis()));
        this.f68608A = new HashMap();
        this.f68609B = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: wa0.g
            public /* synthetic */ C28874g() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m75123a0;
                m75123a0 = C13383d.m75123a0(C13383d.this, message);
                return m75123a0;
            }
        });
        this.f68610C = new c();
    }

    /* renamed from: Y */
    private final C13380a m75122Y(int i11) {
        Object obj = this.f68616w.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return (C13380a) obj;
    }

    /* renamed from: a0 */
    public static final boolean m75123a0(C13383d c13383d, Message message) {
        AbstractC19074t.m100208f(c13383d, "this$0");
        AbstractC19074t.m100208f(message, "message");
        int i11 = message.what;
        if (i11 == 1) {
            c13383d.m10008p();
            return false;
        }
        if (i11 == 2) {
            Object obj = message.obj;
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.Int>");
            C24860q c24860q = (C24860q) obj;
            c13383d.m10015w(((Number) c24860q.m129215c()).intValue(), ((Number) c24860q.m129216d()).intValue());
            return false;
        }
        return false;
    }

    /* renamed from: c0 */
    public static final void m75124c0(C13380a c13380a, C13383d c13383d, int i11) {
        int i12;
        String m145320e;
        int i13;
        AbstractC19074t.m100208f(c13380a, "$dataRow");
        AbstractC19074t.m100208f(c13383d, "this$0");
        try {
            if (c13380a.m75102x()) {
                C17945a0 m75089k = c13380a.m75089k();
                if (m75089k != null) {
                    m75089k.m94860C2(false);
                }
            } else {
                C25821b m75082d = c13380a.m75082d();
                if (m75082d != null) {
                    if (!m75082d.m133152o()) {
                        m75082d = null;
                    }
                    if (m75082d != null) {
                        if (AbstractC16893a.m90326c(m75082d) instanceof MediaExtInfo.Video) {
                            MediaExtInfo m90326c = AbstractC16893a.m90326c(m75082d);
                            AbstractC19074t.m100206d(m90326c, "null cannot be cast to non-null type com.zing.zalo.zalocloud.utils.MediaExtInfo.Video");
                            i12 = ((MediaExtInfo.Video) m90326c).m90319d();
                        } else {
                            i12 = 0;
                        }
                        if (i12 == 0) {
                            i12 = AbstractC19849s1.m103551c() / 3;
                        }
                        if (m75082d.m133153p()) {
                            m145320e = m75082d.m133143f();
                        } else {
                            m145320e = C29086b.m145320e(m75082d);
                        }
                        String m133149l = m75082d.m133149l();
                        if (c13380a.m75101w()) {
                            i13 = 5;
                        } else {
                            i13 = 0;
                        }
                        int genThumbFromVideo = ZMediaPlayer.genThumbFromVideo(m145320e, m133149l, i12, i13);
                        if (genThumbFromVideo < 0) {
                            C26676b.m136957g("ZPL Thumb", "Load fail: " + m75082d.m133141d() + ", link: " + m145320e, null, 4, null);
                        }
                        if (genThumbFromVideo == -2) {
                            m75082d.m133157t(false);
                        }
                    }
                }
                C17945a0 m75089k2 = c13380a.m75089k();
                if (m75089k2 != null) {
                    m75089k2.m94860C2(false);
                }
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: wa0.h

                /* renamed from: q */
                public final /* synthetic */ int f133702q;

                public /* synthetic */ RunnableC28876h(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C13383d.m75125d0(C13383d.this, r2);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLToolStorageDetailPageAdapter", e11);
        }
    }

    /* renamed from: d0 */
    public static final void m75125d0(C13383d c13383d, int i11) {
        AbstractC19074t.m100208f(c13383d, "this$0");
        c13383d.m10009q(i11);
    }

    /* renamed from: h0 */
    public final void m75126h0(C13380a c13380a) {
        if (this.f68617x == null) {
            this.f68617x = c13380a;
        }
        if (!AbstractC19074t.m100204b(this.f68617x, c13380a)) {
            C13380a c13380a2 = this.f68617x;
            if (c13380a2 != null) {
                c13380a2.m75078H(false);
            }
            this.f68617x = c13380a;
            Handler handler = this.f68609B;
            Message message = new Message();
            message.what = 1;
            handler.sendMessage(message);
        }
        if (c13380a.m75072B()) {
            String m75088j = c13380a.m75088j();
            if (m75088j.length() > 0) {
                C7853b.Companion.m40150a().m40094E0(m75088j, 0, this.f68610C, true, true);
                return;
            }
            return;
        }
        C7853b.Companion.m40150a().m40136j1();
    }

    /* renamed from: k0 */
    public static final void m75127k0(C13383d c13383d, MessageId messageId) {
        AbstractC19074t.m100208f(c13383d, "this$0");
        AbstractC19074t.m100208f(messageId, "$messageId");
        Iterator it = c13383d.f68616w.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                C17945a0 m75089k = ((C13380a) it.next()).m75089k();
                if (m75089k != null && m75089k.m95135f9(messageId)) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            c13383d.m10009q(i11);
        }
    }

    /* renamed from: l0 */
    public static final void m75128l0(C13383d c13383d, C25821b c25821b) {
        Iterable m131194T0;
        Object obj;
        AbstractC19074t.m100208f(c13383d, "this$0");
        AbstractC19074t.m100208f(c25821b, "$cloudItem");
        m131194T0 = AbstractC25332a0.m131194T0(c13383d.f68616w);
        Iterator it = m131194T0.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C25821b m75082d = ((C13380a) ((C25345g0) next).m131264b()).m75082d();
            if (m75082d != null) {
                obj = m75082d.m133141d();
            }
            if (AbstractC19074t.m100204b(obj, c25821b.m133141d())) {
                obj = next;
                break;
            }
        }
        C25345g0 c25345g0 = (C25345g0) obj;
        if (c25345g0 != null) {
            c13383d.m10009q(c25345g0.m131263a());
        }
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m75129p0(C13383d c13383d, List list, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "Largest";
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c13383d.m75139o0(list, str, z11);
    }

    /* renamed from: X */
    public final List m75130X() {
        ArrayList arrayList = this.f68616w;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C13380a c13380a = (C13380a) obj;
            if (c13380a.m75094p() == 1 || c13380a.m75094p() == 3) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: Z */
    public final ArrayList m75131Z() {
        return this.f68616w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: b0 */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        C13380a m75122Y = m75122Y(i11);
        int mo10005m = mo10005m(i11);
        if (mo10005m != 0) {
            if (mo10005m != 100) {
                switch (mo10005m) {
                    case 2:
                        ToolStorageTabAllItemModuleView toolStorageTabAllItemModuleView = (ToolStorageTabAllItemModuleView) bVar.m75141j0();
                        if (toolStorageTabAllItemModuleView != null) {
                            toolStorageTabAllItemModuleView.mo75157d0(m75122Y);
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                        if (m75122Y.m75075E() && !m75122Y.m75095q()) {
                            if (!this.f68608A.containsKey(Integer.valueOf(i11))) {
                                Future<?> submit = this.f68619z.submit(new Runnable() { // from class: wa0.e

                                    /* renamed from: q */
                                    public final /* synthetic */ C13383d f133691q;

                                    /* renamed from: r */
                                    public final /* synthetic */ int f133692r;

                                    public /* synthetic */ RunnableC28870e(C13383d this, int i112) {
                                        r2 = this;
                                        r3 = i112;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C13383d.m75124c0(C13380a.this, r2, r3);
                                    }
                                });
                                Integer valueOf = Integer.valueOf(i112);
                                HashMap hashMap = this.f68608A;
                                AbstractC19074t.m100205c(submit);
                                hashMap.put(valueOf, submit);
                            }
                        }
                        ToolStorageMediaItemModuleView toolStorageMediaItemModuleView = (ToolStorageMediaItemModuleView) bVar.m75141j0();
                        if (toolStorageMediaItemModuleView != null) {
                            toolStorageMediaItemModuleView.mo75157d0(m75122Y);
                            break;
                        }
                        break;
                    case 6:
                        ToolStorageFileItemModuleView toolStorageFileItemModuleView = (ToolStorageFileItemModuleView) bVar.m75141j0();
                        if (toolStorageFileItemModuleView != null) {
                            toolStorageFileItemModuleView.mo75157d0(m75122Y);
                            break;
                        }
                        break;
                    case 7:
                        ToolStorageVoiceItemModuleView toolStorageVoiceItemModuleView = (ToolStorageVoiceItemModuleView) bVar.m75141j0();
                        if (toolStorageVoiceItemModuleView != null) {
                            toolStorageVoiceItemModuleView.mo75157d0(m75122Y);
                            break;
                        }
                        break;
                }
            } else {
                MediaStoreMediaSkeletonView m75140i0 = bVar.m75140i0();
                if (m75140i0 != null) {
                    m75140i0.setLayoutSkeletonTypeAlbumDetailsAutoCalculateRow(true);
                }
                MediaStoreMediaSkeletonView m75140i02 = bVar.m75140i0();
                if (m75140i02 != null) {
                    m75140i02.setSkeletonLayoutType(4);
                }
            }
        } else {
            RobotoTextView m75142k0 = bVar.m75142k0();
            if (m75142k0 != null) {
                m75142k0.setText(m75122Y.m75083e());
            }
        }
        ToolStorageItemBaseModuleView m75141j0 = bVar.m75141j0();
        if (m75141j0 != null) {
            m75141j0.setItemEventListener(new d(i112));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: e0 */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View inflate;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 100) {
                switch (i11) {
                    case 2:
                        inflate = new ToolStorageTabAllItemModuleView(viewGroup.getContext());
                        break;
                    case 3:
                        inflate = new ToolStorageMediaItemModuleView(viewGroup.getContext());
                        break;
                    case 4:
                    case 5:
                        inflate = new ToolStorageMediaItemModuleView(viewGroup.getContext());
                        break;
                    case 6:
                        inflate = new ToolStorageFileItemModuleView(viewGroup.getContext());
                        break;
                    case 7:
                        inflate = new ToolStorageVoiceItemModuleView(viewGroup.getContext());
                        break;
                    default:
                        inflate = new View(viewGroup.getContext());
                        break;
                }
            } else {
                inflate = new MediaStoreMediaSkeletonView(viewGroup.getContext());
                inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            }
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.layout_storage_usage_header_view, viewGroup, false);
        }
        AbstractC19074t.m100205c(inflate);
        return new b(this, inflate, i11);
    }

    /* renamed from: f0 */
    public final void m75134f0() {
        this.f68619z.shutdownNow();
        Collection values = this.f68608A.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.f68608A.clear();
    }

    /* renamed from: g0 */
    public final void m75135g0() {
        C13380a c13380a = this.f68617x;
        if (c13380a != null && c13380a.m75072B()) {
            C7853b.Companion.m40150a().m40136j1();
        }
    }

    /* renamed from: i0 */
    public final void m75136i0(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            AbstractC19444a.m101697e(new Runnable() { // from class: wa0.d

                /* renamed from: q */
                public final /* synthetic */ MessageId f133687q;

                public /* synthetic */ RunnableC28868d(MessageId messageId2) {
                    r2 = messageId2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C13383d.m75127k0(C13383d.this, r2);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j0 */
    public final void m75137j0(C25821b c25821b) {
        AbstractC19074t.m100208f(c25821b, "cloudItem");
        try {
            AbstractC19444a.m101697e(new Runnable() { // from class: wa0.f

                /* renamed from: q */
                public final /* synthetic */ C25821b f133694q;

                public /* synthetic */ RunnableC28872f(C25821b c25821b2) {
                    r2 = c25821b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C13383d.m75128l0(C13383d.this, r2);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f68616w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C13380a m75122Y = m75122Y(i11);
        if (m75122Y.m75094p() == 3) {
            return 100;
        }
        if (m75122Y.m75094p() == 0) {
            return 0;
        }
        if (AbstractC19074t.m100204b(this.f68612s, "All")) {
            if (m75122Y.m75103y()) {
                return 3;
            }
            return 2;
        }
        if (AbstractC19074t.m100204b(this.f68612s, "Photos")) {
            return 4;
        }
        if (AbstractC19074t.m100204b(this.f68612s, "Videos")) {
            return 5;
        }
        if (AbstractC19074t.m100204b(this.f68612s, "File")) {
            return 6;
        }
        return 7;
    }

    /* renamed from: m0 */
    public final void m75138m0(boolean z11, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSelect");
        Iterator it = this.f68616w.iterator();
        while (it.hasNext()) {
            ((C13380a) it.next()).m75079I(z11);
        }
        Handler handler = this.f68609B;
        Message message = new Message();
        message.what = 1;
        handler.sendMessage(message);
        ArrayList arrayList = this.f68616w;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C13380a) obj).m75094p() == 1) {
                arrayList2.add(obj);
            }
        }
        interfaceC18505l.mo205i9(arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0186, code lost:            r5 = qm0.AbstractC25332a0.m131177E0(r5, new com.zing.zalo.p077ui.toolstorage.detail.C13383d.h());     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0226, code lost:            r5 = qm0.AbstractC25332a0.m131177E0(r5, new com.zing.zalo.p077ui.toolstorage.detail.C13383d.i());     */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m75139o0(List list, String str, boolean z11) {
        List list2;
        List m131177E0;
        List m131177E02;
        List arrayList;
        List m131177E03;
        int i11;
        int i12;
        List m131177E04;
        List arrayList2;
        List m131177E05;
        AbstractC19074t.m100208f(list, "storageUsageItems");
        AbstractC19074t.m100208f(str, "filterType");
        ArrayList arrayList3 = new ArrayList();
        String str2 = this.f68612s;
        switch (str2.hashCode()) {
            case -1905167199:
                if (str2.equals("Photos")) {
                    list2 = new ArrayList();
                    for (Object obj : list) {
                        C13380a c13380a = (C13380a) obj;
                        if (c13380a.m75071A() || c13380a.m75097s()) {
                            list2.add(obj);
                        }
                    }
                    break;
                }
                list2 = list;
                break;
            case -1732810888:
                if (str2.equals("Videos")) {
                    list2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((C13380a) obj2).m75075E()) {
                            list2.add(obj2);
                        }
                    }
                    break;
                }
                list2 = list;
                break;
            case -1269867783:
                if (str2.equals("Voice message")) {
                    list2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (((C13380a) obj3).m75076F()) {
                            list2.add(obj3);
                        }
                    }
                    break;
                }
                list2 = list;
                break;
            case 65921:
                if (str2.equals("All")) {
                    list2 = new ArrayList();
                    for (Object obj4 : list) {
                        if (((C13380a) obj4).m75074D()) {
                            list2.add(obj4);
                        }
                    }
                    break;
                }
                list2 = list;
                break;
            case 2189724:
                if (str2.equals("File")) {
                    list2 = new ArrayList();
                    for (Object obj5 : list) {
                        if (((C13380a) obj5).m75100v()) {
                            list2.add(obj5);
                        }
                    }
                    break;
                }
                list2 = list;
                break;
            default:
                list2 = list;
                break;
        }
        if (AbstractC19074t.m100204b(str, "Newest")) {
            m131177E04 = AbstractC25332a0.m131177E0(list2, new f());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj6 : m131177E04) {
                String m119296v = AbstractC23160o0.m119296v(((C13380a) obj6).m75093o(), true);
                AbstractC19074t.m100207e(m119296v, "formatToolStorageHeaderTime(...)");
                Object obj7 = linkedHashMap.get(m119296v);
                if (obj7 == null) {
                    obj7 = new ArrayList();
                    linkedHashMap.put(m119296v, obj7);
                }
                ((List) obj7).add(obj6);
            }
            for (String str3 : linkedHashMap.keySet()) {
                arrayList3.add(new C13380a(0, str3, false, false, null, null, 0L, 124, null));
                List list3 = (List) linkedHashMap.get(str3);
                if (list3 != null && m131177E05 != null) {
                    arrayList2 = m131177E05;
                } else {
                    arrayList2 = new ArrayList();
                }
                arrayList3.addAll(arrayList2);
            }
        } else if (AbstractC19074t.m100204b(str, "Oldest")) {
            m131177E02 = AbstractC25332a0.m131177E0(list2, new e());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj8 : m131177E02) {
                String m119296v2 = AbstractC23160o0.m119296v(((C13380a) obj8).m75093o(), true);
                AbstractC19074t.m100207e(m119296v2, "formatToolStorageHeaderTime(...)");
                Object obj9 = linkedHashMap2.get(m119296v2);
                if (obj9 == null) {
                    obj9 = new ArrayList();
                    linkedHashMap2.put(m119296v2, obj9);
                }
                ((List) obj9).add(obj8);
            }
            for (String str4 : linkedHashMap2.keySet()) {
                arrayList3.add(new C13380a(0, str4, false, false, null, null, 0L, 124, null));
                List list4 = (List) linkedHashMap2.get(str4);
                if (list4 != null && m131177E03 != null) {
                    arrayList = m131177E03;
                } else {
                    arrayList = new ArrayList();
                }
                arrayList3.addAll(arrayList);
            }
        } else {
            m131177E0 = AbstractC25332a0.m131177E0(list2, new g());
            arrayList3.addAll(m131177E0);
        }
        int size = this.f68616w.size();
        int size2 = arrayList3.size();
        this.f68616w.clear();
        this.f68616w.addAll(arrayList3);
        if (this.f68616w.isEmpty() && z11) {
            i11 = size;
            this.f68616w.add(new C13380a(3, null, false, false, null, null, 0L, 126, null));
        } else {
            i11 = size;
        }
        this.f68608A.clear();
        if (AbstractC19074t.m100204b(this.f68618y, str) && (i12 = i11) <= size2) {
            Handler handler = this.f68609B;
            Message message = new Message();
            message.what = 2;
            message.obj = new C24860q(Integer.valueOf(i12), Integer.valueOf(size2));
            handler.sendMessage(message);
            return;
        }
        this.f68618y = str;
        Handler handler2 = this.f68609B;
        Message message2 = new Message();
        message2.what = 1;
        handler2.sendMessage(message2);
    }
}
