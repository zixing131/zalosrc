package com.zing.zalo.p077ui.mycloud;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import am.C0943w;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import au.EnumC2382z;
import b40.C2526d;
import b40.C2550y;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.transfer.ChatOpenParam;
import com.zing.zalo.p077ui.chat.transfer.ChatWindowReference;
import com.zing.zalo.p077ui.mycloud.C12522c;
import com.zing.zalo.p077ui.mycloud.InterfaceC12507a;
import com.zing.zalo.p077ui.mycloud.InterfaceC12508b;
import com.zing.zalo.p077ui.mycloud.MyCloudMultiSelectBottomView;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17969i0;
import dj.C17978l0;
import dj.C17994q1;
import dj.C18002t0;
import dj.C18009w0;
import dj.C18013y0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.C19055h0;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kw.C21955a;
import me0.AbstractC23034c6;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.C23250w4;
import mg.C23288a;
import mm0.AbstractC23350e;
import mw.EnumC23460e;
import on0.AbstractC24341v;
import p056cj.C3535c;
import p056cj.C3554v;
import p185gc.AbstractC19378b;
import p239ih.C20556f;
import p246iw.C20843c0;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p365nk.C23805a;
import p461qu.AbstractC25495a;
import p510sq.C26365a;
import p645xh.C29628e;
import p716zh.C31943h5;
import p716zh.C31950hc;
import p716zh.C32002l4;
import p716zh.C32027n;
import p716zh.C32090r5;
import pk.C24799c;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25376w;
import qm0.AbstractC25378x;
import sm0.AbstractC26327c;
import sx.EnumC26407i;
import ws.C29210k;
import xd0.C29588d;
import xd0.C29597m;

/* renamed from: com.zing.zalo.ui.mycloud.c */
/* loaded from: classes6.dex */
public final class C12522c implements InterfaceC12507a {

    /* renamed from: a */
    private final InterfaceC12508b f65477a;

    /* renamed from: b */
    private final C23805a.e f65478b;

    /* renamed from: c */
    private final long f65479c;

    /* renamed from: d */
    private final InterfaceC24854k f65480d;

    /* renamed from: e */
    private final List f65481e;

    /* renamed from: f */
    private final int f65482f;

    /* renamed from: g */
    private final InterfaceC24854k f65483g;

    /* renamed from: h */
    private C17945a0 f65484h;

    /* renamed from: i */
    private int f65485i;

    /* renamed from: j */
    private String f65486j;

    /* renamed from: k */
    private EnumC23460e f65487k;

    /* renamed from: l */
    private Map f65488l;

    /* renamed from: m */
    private boolean f65489m;

    /* renamed from: n */
    private MyCloudMessageItem f65490n;

    /* renamed from: com.zing.zalo.ui.mycloud.c$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65491a;

        static {
            int[] iArr = new int[EnumC23460e.values().length];
            try {
                iArr[EnumC23460e.f113955q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23460e.f113956r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC23460e.f113957s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC23460e.f113958t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC23460e.f113959u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f65491a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.c$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f65492q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.c$c */
    /* loaded from: classes6.dex */
    public static final class c implements MyCloudMultiSelectBottomView.InterfaceC12492b {
        c() {
        }

        /* renamed from: i */
        public static final void m70593i(C12522c c12522c) {
            int m131511r;
            AbstractC19074t.m100208f(c12522c, "this$0");
            List list = c12522c.f65481e;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SelectedItemData) it.next()).m72576a().m95029V3());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r((MessageId) it2.next());
                if (m2635r != null) {
                    arrayList2.add(m2635r);
                }
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: u80.k1

                /* renamed from: q */
                public final /* synthetic */ List f127853q;

                /* renamed from: r */
                public final /* synthetic */ ArrayList f127854r;

                public /* synthetic */ RunnableC27141k1(List arrayList3, ArrayList arrayList22) {
                    r2 = arrayList3;
                    r3 = arrayList22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C12522c.c.m70594j(C12522c.this, r2, r3);
                }
            });
        }

        /* renamed from: j */
        public static final void m70594j(C12522c c12522c, List list, ArrayList arrayList) {
            AbstractC19074t.m100208f(c12522c, "this$0");
            AbstractC19074t.m100208f(list, "$listMsgId");
            AbstractC19074t.m100208f(arrayList, "$listMsg");
            c12522c.m70576L().mo70142F(new ArrayList(list), C21955a.f108070a.m114643j(arrayList));
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudMultiSelectBottomView.InterfaceC12492b
        /* renamed from: a */
        public void mo70220a() {
            C12522c.this.m70586h0();
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudMultiSelectBottomView.InterfaceC12492b
        /* renamed from: b */
        public void mo70221b() {
            C12522c.this.m70587k0();
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudMultiSelectBottomView.InterfaceC12492b
        /* renamed from: c */
        public void mo70222c() {
            C12522c.this.m70585f0();
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudMultiSelectBottomView.InterfaceC12492b
        /* renamed from: d */
        public void mo70223d() {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u80.j1
                public /* synthetic */ RunnableC27137j1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C12522c.c.m70593i(C12522c.this);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudMultiSelectBottomView.InterfaceC12492b
        /* renamed from: e */
        public void mo70224e() {
            C12522c.this.m70588m0();
        }

        @Override // com.zing.zalo.p077ui.mycloud.MyCloudMultiSelectBottomView.InterfaceC12492b
        /* renamed from: f */
        public void mo70225f() {
            int m131511r;
            List list = C12522c.this.f65481e;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SelectedItemData) it.next()).m72576a().m95029V3());
            }
            HashMap hashMap = new HashMap();
            Iterator it2 = C12522c.this.f65481e.iterator();
            while (it2.hasNext()) {
                String valueOf = String.valueOf(AbstractC19646n0.m102878B(((SelectedItemData) it2.next()).m72576a().m95041W4(), false));
                if (hashMap.containsKey(valueOf)) {
                    Integer num = (Integer) hashMap.get(valueOf);
                    if (num == null) {
                        num = 0;
                    }
                    hashMap.put(valueOf, Integer.valueOf(num.intValue() + 1));
                } else {
                    hashMap.put(valueOf, 1);
                }
            }
            C12522c.this.m70562o0(arrayList, hashMap);
            C12522c.this.m70576L().mo70176e();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.c$d */
    /* loaded from: classes6.dex */
    public static final class d extends BaseMyCloudTabView.AbstractC12510b {
        d() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: A */
        public void mo70379A(boolean z11) {
            C12522c.this.m70576L().setKeepScreenOn(z11);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: B */
        public void mo70380B(boolean z11) {
            C12522c.this.m70536S(z11);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: C */
        public void mo70381C(AnimationTarget animationTarget, C17945a0 c17945a0) {
            AbstractC19074t.m100208f(animationTarget, "animationView");
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70576L().mo70137B(animationTarget, c17945a0, false, null);
            C12522c.this.m70543b0(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: a */
        public boolean mo70382a(View view) {
            AbstractC19074t.m100208f(view, "gridItemView");
            return C12522c.this.m70576L().mo70158S(view);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: b */
        public boolean mo70383b(SelectedItemData selectedItemData, boolean z11) {
            return C12522c.this.m70577N(selectedItemData, z11);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: c */
        public int mo70384c() {
            return C12522c.this.m70576L().getCollapsableHeaderHeight();
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: d */
        public String mo70385d() {
            return C12522c.this.m70575I();
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: e */
        public int mo70386e() {
            return C12522c.this.m70529F();
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: f */
        public float mo70387f() {
            return C12522c.this.m70576L().getCollapsableHeaderTranslationY();
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: g */
        public List mo70388g() {
            return C12522c.this.m70531H();
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: h */
        public List mo70389h() {
            List m131187O0;
            List list = C12522c.this.f65481e;
            C12522c c12522c = C12522c.this;
            synchronized (list) {
                m131187O0 = AbstractC25332a0.m131187O0(c12522c.f65481e);
            }
            return m131187O0;
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: j */
        public void mo70391j(View view) {
            float f11;
            C12522c c12522c = C12522c.this;
            if (view != null) {
                f11 = (int) view.getY();
            } else {
                f11 = -c12522c.m70576L().getCollapsableHeaderHeight();
            }
            c12522c.m70567r0(f11);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: k */
        public void mo70392k(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70576L().mo70184j(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: l */
        public void mo70393l(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70576L().mo70184j(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: m */
        public void mo70394m(SelectedItemData selectedItemData, boolean z11) {
            AbstractC19074t.m100208f(selectedItemData, "item");
            C12522c.this.m70578P(selectedItemData, z11);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: n */
        public void mo70395n(C17945a0 c17945a0, String str) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70582V(str);
            C2526d c2526d = C2526d.f10270a;
            String m70532J = C12522c.this.m70532J(false);
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            c2526d.m12705b0(c17945a0, -1, m70532J, c2526d.m12733y(mo95039W2));
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: o */
        public void mo70396o(MyCloudMessageItem myCloudMessageItem) {
            AbstractC19074t.m100208f(myCloudMessageItem, "item");
            C12522c.this.m70581U(myCloudMessageItem);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: p */
        public void mo70397p(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70576L().mo70184j(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: q */
        public void mo70398q(String str) {
            C12522c.this.m70579R(str);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: r */
        public void mo70399r(Context context, C17945a0 c17945a0) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70576L().mo70184j(c17945a0);
            C12522c.this.m70543b0(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: s */
        public void mo70400s() {
            C12522c.this.m70576L().mo70195v();
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: t */
        public void mo70401t() {
            C12522c.this.m70576L().mo70156R();
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: u */
        public void mo70402u(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70538X(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: v */
        public void mo70403v(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70580T(c17945a0);
            C12522c.this.m70543b0(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: w */
        public void mo70404w(MyCloudMessageItem myCloudMessageItem, AnimationTarget animationTarget) {
            boolean z11;
            AbstractC19074t.m100208f(myCloudMessageItem, "itemMessage");
            AbstractC19074t.m100208f(animationTarget, "animationView");
            InterfaceC12508b m70576L = C12522c.this.m70576L();
            C12522c c12522c = C12522c.this;
            if (c12522c.f65487k == EnumC23460e.f113955q) {
                z11 = true;
            } else {
                z11 = false;
            }
            m70576L.mo70180g(myCloudMessageItem, animationTarget, c12522c.m70532J(z11));
            C12522c.this.m70543b0(myCloudMessageItem.m71033m());
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: x */
        public void mo70405x(C17945a0 c17945a0, C20556f c20556f) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            AbstractC19074t.m100208f(c20556f, "file");
            C12522c.this.m70576L().mo70165W(c20556f);
            C12522c.this.m70543b0(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: y */
        public void mo70406y(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70584e0(c17945a0);
            C12522c.this.m70543b0(c17945a0);
        }

        @Override // com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView.AbstractC12510b
        /* renamed from: z */
        public void mo70407z(C17945a0 c17945a0) {
            AbstractC19074t.m100208f(c17945a0, "chatContent");
            C12522c.this.m70537W(c17945a0);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.c$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ SelectedItemData f65495q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SelectedItemData selectedItemData) {
            super(1);
            this.f65495q = selectedItemData;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(SelectedItemData selectedItemData) {
            AbstractC19074t.m100208f(selectedItemData, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(selectedItemData.m72576a().m95029V3(), this.f65495q.m72576a().m95029V3()));
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.c$f */
    /* loaded from: classes6.dex */
    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(((C3554v) obj2).m18064f(), ((C3554v) obj).m18064f());
            return m135478b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.c$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f65496q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    public C12522c(InterfaceC12508b interfaceC12508b, C23805a.e eVar, long j11) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(interfaceC12508b, "view");
        AbstractC19074t.m100208f(eVar, "viewMode");
        this.f65477a = interfaceC12508b;
        this.f65478b = eVar;
        this.f65479c = j11;
        m129210a = AbstractC24856m.m129210a(b.f65492q);
        this.f65480d = m129210a;
        this.f65481e = new ArrayList();
        this.f65482f = AbstractC23309i.m120819C8();
        m129210a2 = AbstractC24856m.m129210a(g.f65496q);
        this.f65483g = m129210a2;
        this.f65486j = "";
        this.f65487k = EnumC23460e.f113955q;
        this.f65488l = new LinkedHashMap();
    }

    /* renamed from: B */
    private final void m70525B() {
        C17945a0 c17945a0 = this.f65484h;
        if (c17945a0 == null) {
            return;
        }
        this.f65484h = null;
        C23288a c23288a = C23288a.f113033a;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        AbstractC18428c.m97658a(c23288a, mo95039W2, 5, new Runnable() { // from class: u80.a1
            public /* synthetic */ RunnableC27101a1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C12522c.m70526C(C17945a0.this);
            }
        });
    }

    /* renamed from: C */
    public static final void m70526C(C17945a0 c17945a0) {
        boolean m127120J;
        AbstractC19074t.m100208f(c17945a0, "$finalChatContent");
        try {
            String m94983Q3 = c17945a0.m94983Q3();
            AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
            m127120J = AbstractC24341v.m127120J(m94983Q3, C20131e.m104909A(), false, 2, null);
            if (m127120J) {
                c17945a0.m95194m2(m94983Q3, true);
            } else {
                c17945a0.m95214o2(true, false);
            }
        } catch (Exception e11) {
            ToastUtils.showMess(MainApplication.Companion.m35500c().getString(AbstractC8020f0.error_general));
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: D */
    private final void m70527D() {
        synchronized (m70534M()) {
            C32090r5.m154810i().m154826q(m70534M(), new C3535c(new Conversation("204278670", null, null, null, 14, null), false, 2, null));
            m70534M().clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: E */
    private final void m70528E() {
        C31950hc c31950hc = C31950hc.f146830a;
        if (c31950hc.m153634E()) {
            c31950hc.m153640o();
        }
        m70565q0(false, null);
    }

    /* renamed from: F */
    public final int m70529F() {
        int i11;
        int multiSelectBottomViewHeight;
        if (this.f65489m) {
            i11 = AbstractC23136l9.m118655I(AbstractC16802y.min_height_mc_context_menu_view) - AbstractC23136l9.m118742r(6.0f);
        } else {
            i11 = 0;
        }
        if (this.f65489m && (multiSelectBottomViewHeight = this.f65477a.getMultiSelectBottomViewHeight()) > 0) {
            return multiSelectBottomViewHeight;
        }
        return i11;
    }

    /* renamed from: G */
    private final int m70530G() {
        if (this.f65478b == C23805a.e.f115064q) {
            return C11598e.e.f60097q.ordinal();
        }
        if (!C21373a.f104231a.m110807w().m110825b()) {
            return C11598e.e.f60096p.ordinal();
        }
        C11598e.e currMyCloudChatMode = this.f65477a.getCurrMyCloudChatMode();
        if (currMyCloudChatMode != null) {
            return currMyCloudChatMode.ordinal();
        }
        return AbstractC0924m0.m3446T3();
    }

    /* renamed from: H */
    public final List m70531H() {
        return (List) this.f65480d.getValue();
    }

    /* renamed from: J */
    public final String m70532J(boolean z11) {
        if (z11) {
            if (this.f65478b != C23805a.e.f115063p) {
                return "collection_detail";
            }
            return "mycloud_listing";
        }
        if (this.f65478b != C23805a.e.f115063p) {
            return "collection_detail";
        }
        return "chat_storedmedia";
    }

    /* renamed from: K */
    private final int m70533K() {
        int i11;
        synchronized (this.f65481e) {
            try {
                Iterator it = this.f65481e.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (((SelectedItemData) it.next()).m72576a().m95022U7()) {
                        i11++;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    /* renamed from: M */
    private final List m70534M() {
        return (List) this.f65483g.getValue();
    }

    /* renamed from: O */
    private final void m70535O(MessageId messageId) {
        boolean mo70146I = this.f65477a.mo70146I(messageId);
        C21373a.f104231a.m110788K(C11598e.e.f60096p.ordinal());
        if (mo70146I) {
            InterfaceC12508b.a.m70302a(this.f65477a, false, 1, null);
        }
    }

    /* renamed from: S */
    public final void m70536S(boolean z11) {
        if (this.f65489m == z11) {
            return;
        }
        this.f65489m = z11;
        m70574z();
    }

    /* renamed from: W */
    public final void m70537W(C17945a0 c17945a0) {
        if (!this.f65477a.mo70182h(c17945a0)) {
            if (c17945a0.m95089b4() == 0) {
                if (c17945a0.m94929K2() instanceof C18009w0) {
                    C17969i0 m94929K2 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentPhoto");
                    C18009w0 c18009w0 = (C18009w0) m94929K2;
                    if (c18009w0.m95743H()) {
                        c18009w0.m95746K(false);
                        c18009w0.m95754T(0L);
                        c18009w0.m95755U(0);
                        c18009w0.m95760Z(0);
                        c18009w0.m95778m0();
                    }
                } else if (c17945a0.m94929K2() instanceof C17961f1) {
                    C17969i0 m94929K22 = c17945a0.m94929K2();
                    AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentVideo");
                    C17961f1 c17961f1 = (C17961f1) m94929K22;
                    if (c17961f1.m95460N()) {
                        c17961f1.m95467U(false);
                        c17961f1.m95474d0(0L);
                        c17961f1.m95475e0(0);
                        c17961f1.m95480h0(0);
                        c17961f1.m95449D0();
                    }
                }
                C29597m m120674i1 = AbstractC23306f.m120674i1();
                AbstractC19074t.m100207e(m120674i1, "provideRetrySendMessageUseCase(...)");
                AbstractC19378b.m101499c(m120674i1, new C29597m.a(AbstractC23306f.m120584H0().m2640w("204278670"), c17945a0), null, 2, null);
                return;
            }
            m70589p0(c17945a0);
        }
    }

    /* renamed from: X */
    public final void m70538X(C17945a0 c17945a0) {
        C32027n c32027n;
        C17994q1 m95239r4 = c17945a0.m95239r4();
        if (m95239r4 != null) {
            c32027n = m95239r4.f91143e;
        } else {
            c32027n = null;
        }
        if (c32027n == null) {
            ToastUtils.m89266n(AbstractC8020f0.str_reply_msg_not_found, new Object[0]);
            return;
        }
        if (c32027n.m154474o() == 6 && C0943w.m4462l().m4472f(String.valueOf(c32027n.m154473n())) == null) {
            ToastUtils.m89266n(AbstractC8020f0.str_reply_msg_not_found, new Object[0]);
        } else {
            ChatOpenParam chatOpenParam = new ChatOpenParam(false, MessageId.Companion.m41065d(c32027n.m154460a(), c32027n.m154463d(), c32027n.m154462c(), String.valueOf(c32027n.m154472m())), new ChatWindowReference("204278670", C21373a.f104231a.m110805u(), c17945a0.m95029V3(), false, 8, null), "", null, 16, null);
            String valueOf = String.valueOf(c32027n.m154473n());
            if (c32027n.m154474o() == 6) {
                this.f65477a.mo70189p(valueOf, chatOpenParam);
            } else {
                this.f65477a.mo70178f(valueOf, chatOpenParam);
            }
        }
        C2550y.f10429a.m12892a();
    }

    /* renamed from: Y */
    private final void m70539Y() {
        this.f65488l.clear();
        Map map = this.f65488l;
        String m123172c = EnumC23460e.f113955q.m123172c();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_all_lowercase);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        map.put(m123172c, m118743r0);
        if (C21373a.f104231a.m110807w().m110825b()) {
            Map map2 = this.f65488l;
            String m123172c2 = EnumC23460e.f113956r.m123172c();
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_tab_message);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            map2.put(m123172c2, m118743r02);
        }
        Map map3 = this.f65488l;
        String m123172c3 = EnumC23460e.f113957s.m123172c();
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_photo_lowercase);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        map3.put(m123172c3, m118743r03);
        Map map4 = this.f65488l;
        String m123172c4 = EnumC23460e.f113958t.m123172c();
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_document);
        AbstractC19074t.m100207e(m118743r04, "getString(...)");
        map4.put(m123172c4, m118743r04);
        Map map5 = this.f65488l;
        String m123172c5 = EnumC23460e.f113959u.m123172c();
        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_link_lowercase);
        AbstractC19074t.m100207e(m118743r05, "getString(...)");
        map5.put(m123172c5, m118743r05);
    }

    /* renamed from: Z */
    private final boolean m70540Z(int i11, C23805a.e eVar) {
        if (i11 == 0 || i11 == 1 || i11 == 3) {
            return true;
        }
        if ((i11 == 5 || i11 == 6) && eVar == C23805a.e.f115064q) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public final void m70543b0(C17945a0 c17945a0) {
        boolean z11;
        C2526d c2526d = C2526d.f10270a;
        if (this.f65487k == EnumC23460e.f113955q) {
            z11 = true;
        } else {
            z11 = false;
        }
        String m70532J = m70532J(z11);
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        c2526d.m12705b0(c17945a0, -1, m70532J, c2526d.m12733y(mo95039W2));
    }

    /* renamed from: c0 */
    public static final void m70545c0(C12522c c12522c, ArrayList arrayList, String str, String str2) {
        AbstractC19074t.m100208f(c12522c, "this$0");
        AbstractC19074t.m100208f(arrayList, "$listMsgId");
        AbstractC19074t.m100208f(str, "$entryPoint");
        AbstractC19074t.m100208f(str2, "$jsDataLog");
        c12522c.f65477a.mo70138C(arrayList, str, str2);
    }

    /* renamed from: g0 */
    public static final void m70550g0(C12522c c12522c) {
        AbstractC19074t.m100208f(c12522c, "this$0");
        synchronized (c12522c.f65481e) {
            try {
                boolean z11 = true;
                if (!c12522c.f65481e.isEmpty()) {
                    C17945a0 m72576a = ((SelectedItemData) c12522c.f65481e.get(0)).m72576a();
                    c12522c.f65477a.mo70145H(m72576a);
                    C2526d c2526d = C2526d.f10270a;
                    if (c12522c.f65487k != EnumC23460e.f113955q) {
                        z11 = false;
                    }
                    c2526d.m12678G(m72576a, -1, c12522c.m70532J(z11), "4");
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j0 */
    public static final void m70554j0(C12522c c12522c) {
        int m131511r;
        int m131511r2;
        AbstractC19074t.m100208f(c12522c, "this$0");
        synchronized (c12522c.f65481e) {
            try {
                ArrayList arrayList = new ArrayList();
                if (c12522c.f65478b == C23805a.e.f115063p) {
                    List list = c12522c.f65481e;
                    m131511r2 = AbstractC25370t.m131511r(list, 10);
                    ArrayList arrayList2 = new ArrayList(m131511r2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((SelectedItemData) it.next()).m72576a());
                    }
                    arrayList.addAll(arrayList2);
                } else {
                    List list2 = c12522c.f65481e;
                    m131511r = AbstractC25370t.m131511r(list2, 10);
                    ArrayList arrayList3 = new ArrayList(m131511r);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((SelectedItemData) it2.next()).m72576a().m95029V3());
                    }
                    arrayList.addAll(AbstractC23306f.m120602N0().m109088v0(c12522c.f65479c, arrayList3));
                }
                c12522c.f65477a.mo70188n(arrayList);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l0 */
    public static final void m70557l0(C12522c c12522c) {
        int m131511r;
        List m131187O0;
        String str;
        AbstractC19074t.m100208f(c12522c, "this$0");
        synchronized (c12522c.f65481e) {
            if (C32090r5.m154810i().m154824o()) {
                ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_allow_group_downloading_once));
                return;
            }
            c12522c.m70534M().clear();
            List m70534M = c12522c.m70534M();
            List list = c12522c.f65481e;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SelectedItemData) it.next()).m72576a());
            }
            m70534M.addAll(arrayList);
            InterfaceC12508b interfaceC12508b = c12522c.f65477a;
            m131187O0 = AbstractC25332a0.m131187O0(c12522c.m70534M());
            interfaceC12508b.mo70187m(m131187O0);
            if (C21373a.f104231a.m110807w().m110825b()) {
                if (c12522c.f65478b == C23805a.e.f115063p) {
                    str = "mycloud_listing_menu";
                } else {
                    str = "collection_detail";
                }
                C2526d.f10270a.m12717k0(c12522c.m70534M(), -1, str, "4");
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: n0 */
    public static final void m70560n0(C12522c c12522c) {
        int m131511r;
        int m131511r2;
        AbstractC19074t.m100208f(c12522c, "this$0");
        synchronized (c12522c.f65481e) {
            try {
                ArrayList arrayList = new ArrayList();
                if (c12522c.f65478b == C23805a.e.f115063p) {
                    for (SelectedItemData selectedItemData : c12522c.f65481e) {
                        if (selectedItemData.m72576a().m94954N0()) {
                            arrayList.add(selectedItemData.m72576a());
                        }
                    }
                } else {
                    List list = c12522c.f65481e;
                    m131511r = AbstractC25370t.m131511r(list, 10);
                    ArrayList arrayList2 = new ArrayList(m131511r);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((SelectedItemData) it.next()).m72576a().m95029V3());
                    }
                    List m109088v0 = AbstractC23306f.m120602N0().m109088v0(c12522c.f65479c, arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : m109088v0) {
                        if (((C17945a0) obj).m94954N0()) {
                            arrayList3.add(obj);
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
                if (!arrayList.isEmpty()) {
                    InterfaceC12508b interfaceC12508b = c12522c.f65477a;
                    m131511r2 = AbstractC25370t.m131511r(arrayList, 10);
                    ArrayList arrayList4 = new ArrayList(m131511r2);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((C17945a0) it2.next()).m95029V3());
                    }
                    interfaceC12508b.mo70194u(new ArrayList(arrayList4));
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_cannot_forward_rolled_msg));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o0 */
    public final void m70562o0(ArrayList arrayList, HashMap hashMap) {
        C20843c0 m120602N0 = AbstractC23306f.m120602N0();
        C24799c m109091x0 = m120602N0.m109091x0(this.f65479c);
        if (m109091x0 != null) {
            String m114637d = C21955a.f108070a.m114637d("collection_detail", hashMap, m109091x0.m128832l());
            AbstractC19074t.m100205c(m120602N0);
            C20843c0.m108969V(m120602N0, m109091x0.m128824d(), arrayList, (byte) 1, m109091x0.m128825e(), false, m114637d, false, 64, null);
        }
    }

    /* renamed from: q0 */
    private final void m70565q0(boolean z11, List list) {
        this.f65477a.mo70198z(z11, list);
    }

    /* renamed from: r0 */
    public final void m70567r0(float f11) {
        if (this.f65478b == C23805a.e.f115064q) {
            this.f65477a.mo70135A(f11);
        }
    }

    /* renamed from: u */
    public static final void m70570u(C19055h0 c19055h0, C12522c c12522c) {
        AbstractC19074t.m100208f(c19055h0, "$finalState");
        AbstractC19074t.m100208f(c12522c, "this$0");
        int i11 = c19055h0.f94931p;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 6) {
                    c12522c.f65477a.mo70172c();
                    return;
                }
            } else {
                c12522c.f65477a.mo70160T();
                return;
            }
        }
        c12522c.f65477a.mo70140E();
    }

    /* renamed from: v */
    public static final void m70571v(C12522c c12522c, boolean z11, boolean z12, C19051f0 c19051f0) {
        boolean z13;
        AbstractC19074t.m100208f(c12522c, "this$0");
        AbstractC19074t.m100208f(c19051f0, "$isShow");
        InterfaceC12508b interfaceC12508b = c12522c.f65477a;
        if (!z11 && (z12 || !c19051f0.f94928p)) {
            z13 = false;
        } else {
            z13 = true;
        }
        interfaceC12508b.mo70191r(z13);
    }

    /* renamed from: w */
    private final void m70572w() {
        synchronized (this.f65481e) {
            this.f65481e.clear();
            this.f65485i = 0;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: y */
    public static final void m70573y(String str, List list) {
        AbstractC19074t.m100208f(str, "$uid");
        AbstractC23306f.m120604O().m101508a(new C29588d.c(str, list, null, 4, null));
        AbstractC23306f.m120607P().m102641o(list);
    }

    /* renamed from: z */
    private final void m70574z() {
        if (!this.f65489m) {
            m70572w();
        }
        this.f65477a.mo70186l(this.f65489m, mo70291c4(), !C21373a.f104231a.m110807w().m110825b());
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: A */
    public void mo70276A() {
        C31950hc.f146830a.m153639l();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: A1 */
    public void mo70277A1() {
        m70531H().clear();
        this.f65486j = "";
    }

    /* renamed from: I */
    public final String m70575I() {
        return this.f65486j;
    }

    /* renamed from: L */
    public final InterfaceC12508b m70576L() {
        return this.f65477a;
    }

    /* renamed from: N */
    public final boolean m70577N(SelectedItemData selectedItemData, boolean z11) {
        boolean z12;
        MessageId messageId;
        C17945a0 m72576a;
        synchronized (this.f65481e) {
            try {
                if (this.f65481e.size() >= this.f65482f) {
                    List list = this.f65481e;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            MessageId m95029V3 = ((SelectedItemData) it.next()).m72576a().m95029V3();
                            if (selectedItemData != null && (m72576a = selectedItemData.m72576a()) != null) {
                                messageId = m72576a.m95029V3();
                            } else {
                                messageId = null;
                            }
                            if (AbstractC19074t.m100204b(m95029V3, messageId)) {
                            }
                        }
                    }
                    z12 = false;
                    if (!z12 && z11) {
                        ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_select_max_messages_prompt, Integer.valueOf(this.f65482f)));
                        this.f65477a.mo70153O();
                    }
                }
                z12 = true;
                if (!z12) {
                    ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_select_max_messages_prompt, Integer.valueOf(this.f65482f)));
                    this.f65477a.mo70153O();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12;
    }

    /* renamed from: P */
    public final void m70578P(SelectedItemData selectedItemData, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(selectedItemData, "selectedItem");
        synchronized (this.f65481e) {
            try {
                int i12 = this.f65485i;
                if (!z11) {
                    AbstractC25378x.m131542D(this.f65481e, new e(selectedItemData));
                } else {
                    List list = this.f65481e;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC19074t.m100204b(((SelectedItemData) it.next()).m72576a().m95029V3(), selectedItemData.m72576a().m95029V3())) {
                                break;
                            }
                        }
                    }
                    this.f65481e.add(selectedItemData);
                }
                this.f65485i = m70533K();
                int size = this.f65481e.size();
                if (size > 1) {
                    i11 = AbstractC8020f0.str_multi_selection_count;
                } else {
                    i11 = AbstractC8020f0.str_multi_selection_singular_count;
                }
                String m118746s0 = AbstractC23136l9.m118746s0(i11, Integer.valueOf(size));
                AbstractC19074t.m100207e(m118746s0, "getString(...)");
                this.f65477a.mo70170a(m118746s0);
                this.f65477a.mo70192s(this.f65481e);
                if (z11 && i12 == 0 && this.f65485i == 1) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_cannot_forward_rolled_msg));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: Q */
    public boolean mo70278Q() {
        if (mo70297i0()) {
            this.f65477a.mo70176e();
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public final void m70579R(String str) {
        String str2;
        Bundle bundle = new Bundle();
        if (str != null) {
            str2 = str.substring(4);
            AbstractC19074t.m100207e(str2, "substring(...)");
        } else {
            str2 = null;
        }
        bundle.putString("text", str2);
        bundle.putParcelable("span", new URLSpan(str));
        bundle.putBoolean("is_link", false);
        this.f65477a.mo70139D(bundle);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: R3 */
    public void mo70279R3(String str, List list) {
        List m131187O0;
        AbstractC19074t.m100208f(str, "keySearch");
        AbstractC19074t.m100208f(list, "searchResults");
        if (AbstractC19074t.m100204b(this.f65486j, str)) {
            return;
        }
        this.f65486j = str;
        m131187O0 = AbstractC25332a0.m131187O0(list);
        if (m131187O0.size() > 1) {
            AbstractC25376w.m131534w(m131187O0, new f());
        }
        m70531H().clear();
        m70531H().addAll(m131187O0);
        this.f65477a.mo70183i(str, m131187O0);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: S3 */
    public String mo70280S3() {
        if (this.f65478b == C23805a.e.f115063p) {
            return "csc_msg_multiselect";
        }
        return "collection_detail";
    }

    /* renamed from: T */
    public final void m70580T(C17945a0 c17945a0) {
        boolean z11;
        int i11;
        C18013y0 c18013y0;
        C17978l0 c17978l0;
        String str;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        String str2 = c17945a0.m94929K2().f91017v;
        if (TextUtils.isEmpty(str2)) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C18013y0) {
                c18013y0 = (C18013y0) m94929K2;
            } else {
                c18013y0 = null;
            }
            if (c18013y0 != null && (c17978l0 = c18013y0.f91253D) != null && (str = c17978l0.f91055c) != null && (str2 = C31943h5.f146766a.m153507i(str, false)) == null) {
                str2 = "";
            }
        }
        if (TextUtils.isEmpty(str2)) {
            ToastUtils.m89266n(AbstractC8020f0.str_contact_info_loading, new Object[0]);
            return;
        }
        C32002l4 m154287a = C32002l4.Companion.m154287a(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
        if (!AbstractC19074t.m100204b(str2, CoreUtility.f89233i)) {
            if (AbstractC21935u.m114518H(str2) && !AbstractC25495a.m132086k(str2)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11 = 292;
            } else {
                i11 = 32;
            }
            TrackingSource trackingSource = new TrackingSource(i11);
            if (c17945a0.m94847A6()) {
                trackingSource.m40678b("shareSource", 1);
                trackingSource.m40678b("uidTo", c17945a0.mo95039W2());
            } else {
                trackingSource.m40678b("shareSource", 0);
                trackingSource.m40678b("uidTo", c17945a0.m94862C4());
                trackingSource.m40678b("nameHolder", c17945a0.m94854B4());
            }
            C21927m.m114302u().m114330e0(str2, trackingSource);
        }
        this.f65477a.mo70136A0(new C26365a.b(str2, m154287a).m135743b());
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: T3 */
    public void mo70281T3(EnumC23460e enumC23460e, boolean z11) {
        AbstractC19074t.m100208f(enumC23460e, "tab");
        if (enumC23460e == this.f65487k && !z11) {
            return;
        }
        this.f65487k = enumC23460e;
        int i11 = a.f65491a[enumC23460e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            this.f65477a.mo70190q();
                            C2550y.f10429a.m12895d();
                        }
                    } else {
                        this.f65477a.mo70149K();
                        C2550y.f10429a.m12894c();
                    }
                } else {
                    this.f65477a.mo70197y();
                    C2550y.f10429a.m12896e();
                }
            } else {
                this.f65477a.mo70196w();
                C2550y.f10429a.m12897f();
            }
        } else {
            mo70293e4(true, z11);
            C2550y.f10429a.m12893b();
        }
        m70528E();
    }

    /* renamed from: U */
    public final void m70581U(MyCloudMessageItem myCloudMessageItem) {
        EnumC2382z enumC2382z;
        boolean z11;
        AbstractC19074t.m100208f(myCloudMessageItem, "item");
        try {
            this.f65490n = myCloudMessageItem;
            if (AbstractC19646n0.m103003m1(myCloudMessageItem.m71033m().m95041W4())) {
                enumC2382z = EnumC2382z.f9947t;
            } else {
                enumC2382z = EnumC2382z.f9946s;
            }
            C23250w4 c23250w4 = C23250w4.f112644a;
            if (this.f65478b == C23805a.e.f115064q) {
                z11 = true;
            } else {
                z11 = false;
            }
            List m119835f = c23250w4.m119835f(enumC2382z, z11, "204278670", myCloudMessageItem.m71033m());
            if (!m119835f.isEmpty()) {
                this.f65477a.mo70150L(m119835f);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: U3 */
    public int mo70282U3() {
        if (this.f65478b == C23805a.e.f115063p) {
            return AbstractC23306f.m120602N0().m109063N0();
        }
        return AbstractC23306f.m120602N0().m109061M0();
    }

    /* renamed from: V */
    public final void m70582V(String str) {
        int m40666e = TrackingSource.m40666e();
        String m40669h = TrackingSource.m40669h(m40666e);
        AbstractC19074t.m100207e(m40669h, "genSourceParamChat(...)");
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_WEB_URL", str);
        bundle.putInt("EXTRA_SOURCE_LINK", m40666e);
        if (!TextUtils.isEmpty(m40669h)) {
            bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
        }
        this.f65477a.mo70185k(str, bundle);
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: V3 */
    public void mo70283V3(List list) {
        try {
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                C31950hc c31950hc = C31950hc.f146830a;
                if (c31950hc.m153644w()) {
                    c31950hc.m153637J("204278670", list);
                    m70565q0(true, list);
                } else {
                    AbstractC18428c.m97659b(C23288a.f113033a, "204278670", 0, new Runnable() { // from class: u80.i1

                        /* renamed from: p */
                        public final /* synthetic */ String f127838p;

                        /* renamed from: q */
                        public final /* synthetic */ List f127839q;

                        public /* synthetic */ RunnableC27133i1(String str, List list3) {
                            r1 = str;
                            r2 = list3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C12522c.m70573y(r1, r2);
                        }
                    }, 2, null);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPresenter", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: W3 */
    public EnumC23460e mo70284W3() {
        return this.f65487k;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: X3 */
    public BaseMyCloudTabView.AbstractC12510b mo70285X3() {
        return new d();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: Y3 */
    public void mo70286Y3(int i11) {
        EnumC2382z enumC2382z;
        String m95131f5;
        ArrayList m131500h;
        MyCloudMessageItem myCloudMessageItem = this.f65490n;
        if (myCloudMessageItem == null) {
            return;
        }
        if (AbstractC19646n0.m103003m1(myCloudMessageItem.m71033m().m95041W4())) {
            enumC2382z = EnumC2382z.f9947t;
        } else {
            enumC2382z = EnumC2382z.f9946s;
        }
        try {
            if (i11 == AbstractC8020f0.share) {
                InterfaceC12508b interfaceC12508b = this.f65477a;
                MessageId m95029V3 = myCloudMessageItem.m71033m().m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                m131500h = AbstractC25368s.m131500h(m95029V3);
                interfaceC12508b.mo70194u(m131500h);
                return;
            }
            if (i11 == AbstractC8020f0.str_media_store_copy_link) {
                InterfaceC12508b interfaceC12508b2 = this.f65477a;
                if (!TextUtils.isEmpty(myCloudMessageItem.m71033m().m95090b5())) {
                    m95131f5 = myCloudMessageItem.m71033m().m95090b5();
                } else {
                    m95131f5 = myCloudMessageItem.m71033m().m95131f5();
                }
                AbstractC19074t.m100205c(m95131f5);
                interfaceC12508b2.mo70154P(m95131f5);
                return;
            }
            if (i11 == C23250w4.f112644a.m119819C(myCloudMessageItem.m71033m())) {
                m70583d0(myCloudMessageItem.m71033m());
                return;
            }
            if (i11 == AbstractC8020f0.str_view_original_msg) {
                MessageId m95029V32 = myCloudMessageItem.m71033m().m95029V3();
                AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                m70535O(m95029V32);
                return;
            }
            if (i11 == AbstractC8020f0.delete) {
                this.f65477a.mo70152N(myCloudMessageItem);
                return;
            }
            String str = "item_file_menu_more";
            if (i11 == AbstractC8020f0.str_btn_add_item_to_collection) {
                if (enumC2382z == EnumC2382z.f9946s) {
                    str = "item_link_menu_more";
                }
                C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(myCloudMessageItem.m71033m().m95029V3());
                if (m2635r != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.add(m2635r);
                    arrayList2.add(m2635r.m95029V3());
                    AbstractC19444a.m101697e(new Runnable() { // from class: u80.g1

                        /* renamed from: q */
                        public final /* synthetic */ ArrayList f127826q;

                        /* renamed from: r */
                        public final /* synthetic */ String f127827r;

                        /* renamed from: s */
                        public final /* synthetic */ String f127828s;

                        public /* synthetic */ RunnableC27125g1(ArrayList arrayList22, String str2, String str3) {
                            r2 = arrayList22;
                            r3 = str2;
                            r4 = str3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C12522c.m70545c0(C12522c.this, r2, r3, r4);
                        }
                    });
                    return;
                }
                return;
            }
            if (i11 == AbstractC8020f0.str_remove_from_collection) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(myCloudMessageItem.m71033m().m95029V3());
                hashMap.put(String.valueOf(AbstractC19646n0.m102878B(myCloudMessageItem.m71033m().m95041W4(), false)), 1);
                if (!arrayList3.isEmpty()) {
                    C20843c0 m120602N0 = AbstractC23306f.m120602N0();
                    C24799c m109091x0 = m120602N0.m109091x0(this.f65479c);
                    if (m109091x0 != null) {
                        if (enumC2382z == EnumC2382z.f9946s) {
                            str2 = "item_link_menu_more";
                        }
                        String m114637d = C21955a.f108070a.m114637d(str2, hashMap, m109091x0.m128832l());
                        AbstractC19074t.m100205c(m120602N0);
                        C20843c0.m108969V(m120602N0, m109091x0.m128824d(), arrayList3, (byte) 1, m109091x0.m128825e(), false, m114637d, false, 64, null);
                        return;
                    }
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no_selected_item));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: Z3 */
    public void mo70287Z3() {
        if (C29628e.m147249E0().m93432x()) {
            C29210k m145896a = C29210k.Companion.m145896a();
            if (!AbstractC0924m0.m3807fb() && m145896a.m145857Z() && !m145896a.m145871j0() && m145896a.m145893y()) {
                if (!AbstractC0924m0.m3867hb() || (AbstractC0924m0.m3867hb() && !AbstractC0924m0.m3807fb())) {
                    AbstractC0924m0.m3637Zk(true);
                }
                m145896a.m145828D();
                m145896a.m145853V0(false, true);
            }
            if (this.f65478b == C23805a.e.f115064q && !AbstractC0924m0.m3777eb()) {
                AbstractC23306f.m120602N0().m109046A1(this.f65479c);
                return;
            }
            return;
        }
        this.f65477a.mo70151M();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: a0 */
    public Map mo70288a0() {
        if (this.f65488l.isEmpty()) {
            m70539Y();
        }
        return this.f65488l;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: a4 */
    public void mo70289a4(int i11, int i12, int i13) {
        if (i11 != i13 - i12) {
            C23744a.Companion.m124119a().m124116d(5208, Integer.valueOf(this.f65477a.getCollapsableHeaderHeight()), this.f65478b);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: b4 */
    public MyCloudMultiSelectBottomView.InterfaceC12492b mo70290b4() {
        return new c();
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: c4 */
    public String mo70291c4() {
        C24799c m109091x0;
        C23805a.e eVar = this.f65478b;
        if (eVar == C23805a.e.f115063p) {
            return C21373a.f104231a.m110805u();
        }
        if (eVar == C23805a.e.f115064q && (m109091x0 = C20843c0.Companion.m109092a().m109091x0(this.f65479c)) != null) {
            return m109091x0.m128821a();
        }
        return "";
    }

    /* renamed from: d0 */
    public void m70583d0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        this.f65484h = c17945a0;
        if (!AbstractC23034c6.m118118E()) {
            this.f65477a.mo70193s4(109);
        } else {
            m70525B();
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: d4 */
    public void mo70292d4(int i11, int i12) {
        if (i11 == 1048 && i12 == -1) {
            this.f65477a.mo70176e();
        }
    }

    /* renamed from: e0 */
    public final void m70584e0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatline");
        try {
            if (c17945a0.m94929K2() instanceof C18002t0) {
                String str = c17945a0.m94929K2().f91015t;
                C17969i0 m94929K2 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentLocation");
                double m153170b = ((C18002t0) m94929K2).f91181B.m153170b();
                C17969i0 m94929K22 = c17945a0.m94929K2();
                AbstractC19074t.m100206d(m94929K22, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentLocation");
                this.f65477a.mo70162U(str, m153170b, ((C18002t0) m94929K22).f91181B.m153169a());
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: e4 */
    public void mo70293e4(boolean z11, boolean z12) {
        if (m70530G() != C11598e.e.f60097q.ordinal() && !this.f65489m) {
            if (AbstractC23112j7.m118500J() == EnumC26407i.f125523y) {
                AbstractC23112j7.m118566y0(EnumC26407i.f125515q);
            }
            this.f65477a.mo70174d();
            return;
        }
        this.f65477a.mo70171b(z11, z12);
    }

    /* renamed from: f0 */
    public final void m70585f0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u80.f1
            public /* synthetic */ RunnableC27121f1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C12522c.m70550g0(C12522c.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: f4 */
    public void mo70294f4(int i11, boolean z11, boolean z12) {
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                AbstractC23306f.m120602N0().m109074U1(i11);
                break;
            case 5:
            case 6:
            case 7:
                if (this.f65478b == C23805a.e.f115064q) {
                    AbstractC23306f.m120602N0().m109072T1(i11);
                    break;
                } else {
                    return;
                }
        }
        C19055h0 c19055h0 = new C19055h0();
        C19051f0 c19051f0 = new C19051f0();
        int m109063N0 = AbstractC23306f.m120602N0().m109063N0();
        C23805a.e eVar = C23805a.e.f115063p;
        boolean m70540Z = m70540Z(m109063N0, eVar);
        boolean m70540Z2 = m70540Z(AbstractC23306f.m120602N0().m109061M0(), C23805a.e.f115064q);
        if (this.f65478b == eVar) {
            c19051f0.f94928p = m70540Z;
            c19055h0.f94931p = AbstractC23306f.m120602N0().m109063N0();
        } else {
            c19051f0.f94928p = m70540Z2;
            c19055h0.f94931p = AbstractC23306f.m120602N0().m109061M0();
            if (!c19051f0.f94928p) {
                if (i11 != 4) {
                    c19051f0.f94928p = m70540Z;
                    if (m70540Z) {
                        c19055h0.f94931p = AbstractC23306f.m120602N0().m109063N0();
                    }
                }
            } else if (m70540Z) {
                c19055h0.f94931p = AbstractC23306f.m120602N0().m109063N0();
            }
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.b1

            /* renamed from: q */
            public final /* synthetic */ C12522c f127789q;

            public /* synthetic */ RunnableC27105b1(C12522c this) {
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C12522c.m70570u(C19055h0.this, r2);
            }
        });
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.c1

            /* renamed from: q */
            public final /* synthetic */ boolean f127793q;

            /* renamed from: r */
            public final /* synthetic */ boolean f127794r;

            /* renamed from: s */
            public final /* synthetic */ C19051f0 f127795s;

            public /* synthetic */ RunnableC27109c1(boolean z112, boolean z122, C19051f0 c19051f02) {
                r2 = z112;
                r3 = z122;
                r4 = c19051f02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C12522c.m70571v(C12522c.this, r2, r3, r4);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: g4 */
    public void mo70295g4() {
        if (!AbstractC23034c6.m118118E()) {
            this.f65477a.mo70193s4(109);
        } else {
            m70527D();
            this.f65477a.mo70176e();
        }
    }

    /* renamed from: h0 */
    public final void m70586h0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u80.h1
            public /* synthetic */ RunnableC27129h1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C12522c.m70554j0(C12522c.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: h4 */
    public void mo70296h4() {
        synchronized (m70534M()) {
            try {
                if (!m70534M().isEmpty()) {
                    m70527D();
                }
                if (this.f65484h != null) {
                    m70525B();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: i0 */
    public boolean mo70297i0() {
        return this.f65489m;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: i4 */
    public int mo70298i4(MessageId messageId, List list) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(list, "photoList");
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!AbstractC19074t.m100204b(((ItemAlbumMobile) it.next()).m40496C(), messageId)) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: j4 */
    public void mo70299j4() {
        if (C21373a.f104231a.m110807w().m110825b() && this.f65478b == C23805a.e.f115063p && this.f65487k == EnumC23460e.f113955q) {
            this.f65477a.mo70143G();
        } else if (this.f65478b == C23805a.e.f115064q) {
            this.f65477a.mo70155Q();
        }
    }

    /* renamed from: k0 */
    public final void m70587k0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u80.e1
            public /* synthetic */ RunnableC27117e1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C12522c.m70557l0(C12522c.this);
            }
        });
    }

    /* renamed from: m0 */
    public final void m70588m0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: u80.d1
            public /* synthetic */ RunnableC27113d1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C12522c.m70560n0(C12522c.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    public void onDetachedFromWindow() {
        if (this.f65478b == C23805a.e.f115064q && AbstractC23306f.m120602N0().m109063N0() != -1) {
            C23744a.Companion.m124119a().m124116d(5207, Integer.valueOf(AbstractC23306f.m120602N0().m109063N0()));
        }
    }

    /* renamed from: p0 */
    public final void m70589p0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        try {
            c17945a0.m95023U9();
            c17945a0.m94934Ka("");
            c17945a0.m95165ic(4, true);
            c17945a0.m94978P9();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPresenter", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.InterfaceC12507a
    /* renamed from: x */
    public void mo70300x(int i11, Object... objArr) {
        boolean z11;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 5207) {
            if (i11 == 5210) {
                this.f65477a.mo70176e();
                return;
            }
            return;
        }
        if (objArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            switch (intValue) {
                case 0:
                case 3:
                    InterfaceC12507a.a.m70301a(this, intValue, true, false, 4, null);
                    return;
                case 1:
                    InterfaceC12507a.a.m70301a(this, intValue, true, false, 4, null);
                    return;
                case 2:
                    InterfaceC12507a.a.m70301a(this, intValue, false, true, 2, null);
                    return;
                case 4:
                    InterfaceC12507a.a.m70301a(this, intValue, false, false, 2, null);
                    return;
                case 5:
                    InterfaceC12507a.a.m70301a(this, intValue, false, false, 6, null);
                    return;
                case 6:
                    InterfaceC12507a.a.m70301a(this, intValue, false, false, 4, null);
                    return;
                case 7:
                    InterfaceC12507a.a.m70301a(this, intValue, false, false, 6, null);
                    return;
                default:
                    InterfaceC12507a.a.m70301a(this, intValue, false, false, 6, null);
                    return;
            }
        }
    }
}
