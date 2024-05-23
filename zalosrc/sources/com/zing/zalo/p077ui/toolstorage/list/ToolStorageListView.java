package com.zing.zalo.p077ui.toolstorage.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.AbstractC1388a;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailView;
import com.zing.zalo.p077ui.toolstorage.list.ToolStorageListView;
import com.zing.zalo.p077ui.toolstoragev1.list.C13466a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import j30.C20912a;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import k30.C21459a;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p213hl.C20087c;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p649xl.C29876jc;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import ui0.C27280g;
import wd0.C28923c;
import xa0.C29554a;
import xa0.C29567n;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class ToolStorageListView extends SlidableZaloView {
    public static final C13414a Companion = new C13414a(null);

    /* renamed from: P0 */
    private C29876jc f68728P0;

    /* renamed from: Q0 */
    private EditText f68729Q0;

    /* renamed from: R0 */
    private View f68730R0;

    /* renamed from: S0 */
    private C16972e0 f68731S0;

    /* renamed from: T0 */
    private final InterfaceC24854k f68732T0;

    /* renamed from: U0 */
    private C13466a f68733U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f68734V0;

    /* renamed from: W0 */
    private final InterfaceC24854k f68735W0;

    /* renamed from: X0 */
    private final C13423j f68736X0;

    /* renamed from: Y0 */
    private ActionBarMenuItem.C17435d f68737Y0;

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$a */
    /* loaded from: classes6.dex */
    public static final class C13414a {
        private C13414a() {
        }

        public /* synthetic */ C13414a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$b */
    /* loaded from: classes6.dex */
    public static final class EnumC13415b extends Enum {

        /* renamed from: p */
        public static final EnumC13415b f68738p = new EnumC13415b("DELETE_MEDIA_ONLY", 0);

        /* renamed from: q */
        public static final EnumC13415b f68739q = new EnumC13415b("NORMAL", 1);

        /* renamed from: r */
        public static final EnumC13415b f68740r = new EnumC13415b(Image.SCALE_TYPE_NONE, 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC13415b[] f68741s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f68742t;

        static {
            EnumC13415b[] m75269b = m75269b();
            f68741s = m75269b;
            f68742t = AbstractC30166b.m148796a(m75269b);
        }

        private EnumC13415b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13415b[] m75269b() {
            return new EnumC13415b[]{f68738p, f68739q, f68740r};
        }

        public static EnumC13415b valueOf(String str) {
            return (EnumC13415b) Enum.valueOf(EnumC13415b.class, str);
        }

        public static EnumC13415b[] values() {
            return (EnumC13415b[]) f68741s.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$c */
    /* loaded from: classes6.dex */
    public static final class EnumC13416c extends Enum {

        /* renamed from: p */
        public static final EnumC13416c f68743p = new EnumC13416c("DELETE", 0);

        /* renamed from: q */
        public static final EnumC13416c f68744q = new EnumC13416c("NORMAL", 1);

        /* renamed from: r */
        public static final EnumC13416c f68745r = new EnumC13416c("SEARCH", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC13416c[] f68746s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f68747t;

        static {
            EnumC13416c[] m75270b = m75270b();
            f68746s = m75270b;
            f68747t = AbstractC30166b.m148796a(m75270b);
        }

        private EnumC13416c(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13416c[] m75270b() {
            return new EnumC13416c[]{f68743p, f68744q, f68745r};
        }

        public static EnumC13416c valueOf(String str) {
            return (EnumC13416c) Enum.valueOf(EnumC13416c.class, str);
        }

        public static EnumC13416c[] values() {
            return (EnumC13416c[]) f68746s.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$d */
    /* loaded from: classes6.dex */
    public static final class C13417d extends AbstractC19075u implements InterfaceC18494a {
        C13417d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m75271a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m75271a() {
            ToolStorageListView.this.m75224GM().m10008p();
            C29876jc c29876jc = ToolStorageListView.this.f68728P0;
            if (c29876jc == null) {
                AbstractC19074t.m100223u("mBinding");
                c29876jc = null;
            }
            c29876jc.f138340t.setVisibility(8);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$e */
    /* loaded from: classes6.dex */
    public static final class C13418e extends AbstractC19075u implements InterfaceC18505l {
        C13418e() {
            super(1);
        }

        /* renamed from: a */
        public final void m75272a(int i11) {
            ToolStorageListView.this.m75245aN();
            if (!ToolStorageListView.this.mo78963ru()) {
                return;
            }
            ToolStorageListView.this.m75226IM().m75319s0(EnumC13416c.f68744q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75272a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$f */
    /* loaded from: classes6.dex */
    public static final class C13419f extends AbstractC19075u implements InterfaceC18494a {
        C13419f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m75273a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m75273a() {
            ToolStorageListView.this.m75224GM().m10008p();
            ToolStorageListView.this.m75232NM();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$g */
    /* loaded from: classes6.dex */
    public static final class C13420g extends AbstractC19075u implements InterfaceC18494a {
        C13420g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m75274a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m75274a() {
            ToolStorageListView.this.m75224GM().m10008p();
            ToolStorageListView.this.m75232NM();
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$h */
    /* loaded from: classes6.dex */
    public static final class C13421h extends RecyclerView.AbstractC1892s {

        /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$h$a */
        /* loaded from: classes6.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ ToolStorageListView f68753q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ToolStorageListView toolStorageListView) {
                super(1);
                this.f68753q = toolStorageListView;
            }

            /* renamed from: c */
            public static final void m75276c(ToolStorageListView toolStorageListView, int i11) {
                AbstractC19074t.m100208f(toolStorageListView, "this$0");
                toolStorageListView.m75224GM().m10009q(i11);
            }

            /* renamed from: b */
            public final void m75277b(int i11) {
                C29876jc c29876jc = this.f68753q.f68728P0;
                if (c29876jc == null) {
                    AbstractC19074t.m100223u("mBinding");
                    c29876jc = null;
                }
                c29876jc.f138342v.post(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.list.a

                    /* renamed from: q */
                    public final /* synthetic */ int f68770q;

                    public /* synthetic */ RunnableC13433a(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ToolStorageListView.C13421h.a.m75276c(ToolStorageListView.this, r2);
                    }
                });
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m75277b(((Number) obj).intValue());
                return C24848g0.f119245a;
            }
        }

        C13421h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                ToolStorageListView.this.m75226IM().m75302S(ToolStorageListView.this.m75225HM().m9740Y1(), ToolStorageListView.this.m75225HM().m9745c2(), new a(ToolStorageListView.this));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$i */
    /* loaded from: classes6.dex */
    static final class C13422i extends AbstractC19075u implements InterfaceC18494a {
        C13422i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29554a mo12V4() {
            return new C29554a(ToolStorageListView.this.f68736X0);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$j */
    /* loaded from: classes6.dex */
    public static final class C13423j implements StorageUsageItemModuleViewKt.InterfaceC12460b {

        /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$j$a */
        /* loaded from: classes6.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ToolStorageListView f68756q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ToolStorageListView toolStorageListView) {
                super(0);
                this.f68756q = toolStorageListView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m75279a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m75279a() {
                this.f68756q.m75232NM();
            }
        }

        C13423j() {
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: a */
        public boolean mo69967a(String str) {
            AbstractC19074t.m100208f(str, "ownerId");
            return ToolStorageListView.this.m75226IM().m75310h0(str);
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: b */
        public boolean mo69968b() {
            return ToolStorageListView.this.m75226IM().m75309g0();
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: c */
        public boolean mo69969c(ThreadStorageInfo threadStorageInfo) {
            AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
            if (!ToolStorageListView.this.m75226IM().m75309g0() && C20912a.Companion.m109411a().m109407n()) {
                if (ToolStorageListView.this.f88760a0.m92719n()) {
                    return false;
                }
                ToolStorageListView.this.m75226IM().m75319s0(EnumC13416c.f68743p);
            }
            return true;
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: d */
        public void mo69970d(ThreadStorageInfo threadStorageInfo) {
            AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
            ToolStorageListView.this.m75219C();
            ToolStorageListView.this.m75246bN(threadStorageInfo);
        }

        @Override // com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt.InterfaceC12460b
        /* renamed from: e */
        public void mo69971e(ThreadStorageInfo threadStorageInfo, boolean z11) {
            AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
            ToolStorageListView.this.m75226IM().m75314n0(threadStorageInfo, z11, new a(ToolStorageListView.this));
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$k */
    /* loaded from: classes6.dex */
    static final class C13424k extends AbstractC19075u implements InterfaceC18494a {
        C13424k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final LinearLayoutManager mo12V4() {
            return new LinearLayoutManager(ToolStorageListView.this.getContext(), 1, false);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$l */
    /* loaded from: classes6.dex */
    public static final class C13425l extends ActionBarMenuItem.C17435d {

        /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$l$a */
        /* loaded from: classes6.dex */
        static final class a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ ToolStorageListView f68759q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ToolStorageListView toolStorageListView) {
                super(2);
                this.f68759q = toolStorageListView;
            }

            /* renamed from: a */
            public final void m75281a(List list, String str) {
                AbstractC19074t.m100208f(list, "storageUsageList");
                AbstractC19074t.m100208f(str, "kw");
                this.f68759q.m75260rs(list, str);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m75281a((List) obj, (String) obj2);
                return C24848g0.f119245a;
            }
        }

        C13425l() {
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: b */
        public void mo69246b() {
            ToolStorageListView.this.m75226IM().m75318r0("");
            super.mo69246b();
        }

        @Override // com.zing.zalo.zview.actionbar.ActionBarMenuItem.C17435d
        /* renamed from: f */
        public void mo65079f(EditText editText) {
            boolean z11;
            AbstractC19074t.m100208f(editText, "editText");
            String m75227JM = ToolStorageListView.this.m75227JM();
            ToolStorageListView toolStorageListView = ToolStorageListView.this;
            if (m75227JM.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            toolStorageListView.m75230M4(z11);
            ToolStorageListView.this.m75226IM().m75318r0(m75227JM);
            ToolStorageListView.this.m75226IM().m75316p0(m75227JM, new a(ToolStorageListView.this));
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$m */
    /* loaded from: classes6.dex */
    static final class C13426m extends AbstractC19075u implements InterfaceC18494a {
        C13426m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13434b mo12V4() {
            ToolStorageListView toolStorageListView = ToolStorageListView.this;
            C20087c m120582G1 = AbstractC23306f.m120582G1();
            AbstractC19074t.m100207e(m120582G1, "provideToolStorageRepository(...)");
            C28923c m120601N = AbstractC23306f.m120601N();
            AbstractC19074t.m100207e(m120601N, "provideDeleteConversationUseCase(...)");
            return (C13434b) new C1802w0(toolStorageListView, new C29567n(m120582G1, m120601N)).m9378a(C13434b.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$n */
    /* loaded from: classes6.dex */
    public static final class C13427n extends AbstractC19075u implements InterfaceC18505l {
        C13427n() {
            super(1);
        }

        /* renamed from: a */
        public final void m75283a(List list) {
            ToolStorageListView toolStorageListView = ToolStorageListView.this;
            AbstractC19074t.m100205c(list);
            toolStorageListView.m75249iI(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75283a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$o */
    /* loaded from: classes6.dex */
    public static final class C13428o extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$o$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f68763a;

            static {
                int[] iArr = new int[EnumC13416c.values().length];
                try {
                    iArr[EnumC13416c.f68744q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC13416c.f68743p.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC13416c.f68745r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f68763a = iArr;
            }
        }

        C13428o() {
            super(1);
        }

        /* renamed from: a */
        public final void m75284a(EnumC13416c enumC13416c) {
            if (enumC13416c == null) {
                return;
            }
            int i11 = a.f68763a[enumC13416c.ordinal()];
            if (i11 == 1) {
                ToolStorageListView.this.m75240VM();
            } else if (i11 == 2) {
                ToolStorageListView.this.m75239UM();
            } else if (i11 == 3) {
                ToolStorageListView.this.m75241WM();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75284a((EnumC13416c) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$p */
    /* loaded from: classes6.dex */
    public static final class C13429p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$p$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f68765a;

            static {
                int[] iArr = new int[EnumC13415b.values().length];
                try {
                    iArr[EnumC13415b.f68738p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC13415b.f68739q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC13415b.f68740r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f68765a = iArr;
            }
        }

        C13429p() {
            super(1);
        }

        /* renamed from: a */
        public final void m75285a(EnumC13415b enumC13415b) {
            if (enumC13415b != null) {
                int i11 = a.f68765a[enumC13415b.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            ToolStorageListView.this.mo49315c4();
                            return;
                        }
                        return;
                    }
                    ToolStorageListView.this.mo49282B8(null, false);
                    return;
                }
                ToolStorageListView.this.mo49282B8(AbstractC23136l9.m118743r0(AbstractC8020f0.PROCESSING), false);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m75285a((EnumC13415b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$q */
    /* loaded from: classes6.dex */
    public static final class C13430q implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f68766p;

        C13430q(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f68766p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f68766p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f68766p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$r */
    /* loaded from: classes6.dex */
    public static final class C13431r extends AbstractC19075u implements InterfaceC18494a {
        C13431r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m75286a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m75286a() {
            ToolStorageListView.this.m75224GM().m10008p();
            C29876jc c29876jc = ToolStorageListView.this.f68728P0;
            if (c29876jc == null) {
                AbstractC19074t.m100223u("mBinding");
                c29876jc = null;
            }
            c29876jc.f138340t.setVisibility(0);
            ToolStorageListView.this.m75232NM();
            try {
                ToolStorageListView toolStorageListView = ToolStorageListView.this;
                ActionBar actionBar = toolStorageListView.f88760a0;
                if (actionBar != null) {
                    ActionBarMenu actionBarMenu = ((ZaloView) toolStorageListView).f88763d0;
                    if (actionBarMenu != null) {
                        actionBarMenu.m92750r();
                    }
                    actionBar.setTitle(toolStorageListView.m92652XI(AbstractC8020f0.str_storage_usage_delete_conversation));
                    actionBar.setTitleColor(C23212s8.m119606n(AbstractC21196a.TextColor1));
                    if (C23212s8.m119603k()) {
                        actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_black);
                    } else {
                        actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                    }
                    actionBar.setBackgroundColor(C23212s8.m119606n(AbstractC16781w.HeaderFormColor));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("CommonZaloview", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.list.ToolStorageListView$s */
    /* loaded from: classes6.dex */
    public static final class C13432s extends AbstractC19075u implements InterfaceC18509p {
        C13432s() {
            super(2);
        }

        /* renamed from: a */
        public final void m75287a(List list, String str) {
            AbstractC19074t.m100208f(list, "storageUsageList");
            AbstractC19074t.m100208f(str, "kw");
            ToolStorageListView.this.m75260rs(list, str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m75287a((List) obj, (String) obj2);
            return C24848g0.f119245a;
        }
    }

    public ToolStorageListView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(new C13426m());
        this.f68732T0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13422i());
        this.f68734V0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C13424k());
        this.f68735W0 = m129210a3;
        this.f68736X0 = new C13423j();
        this.f68737Y0 = new C13425l();
    }

    /* renamed from: C */
    public final void m75219C() {
        EditText editText = this.f68729Q0;
        if (editText != null) {
            AbstractC2379w.m12430d(editText);
        }
    }

    /* renamed from: DM */
    private final void m75221DM() {
        m75226IM().m75312j0(false, new C13417d());
    }

    /* renamed from: EM */
    private final void m75222EM() {
        m75226IM().m75318r0("");
        EditText editText = this.f68729Q0;
        if (editText != null) {
            editText.setText("");
        }
        this.f88760a0.m92708c();
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
        }
    }

    /* renamed from: FM */
    private final void m75223FM() {
        List m131185M0;
        m75238TM();
        C13434b m75226IM = m75226IM();
        Collection values = m75226IM().m75304Y().values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        m131185M0 = AbstractC25332a0.m131185M0(values);
        m75226IM.m75313k0(m131185M0, new C13418e());
    }

    /* renamed from: GM */
    public final C29554a m75224GM() {
        return (C29554a) this.f68734V0.getValue();
    }

    /* renamed from: HM */
    public final LinearLayoutManager m75225HM() {
        return (LinearLayoutManager) this.f68735W0.getValue();
    }

    /* renamed from: IM */
    public final C13434b m75226IM() {
        return (C13434b) this.f68732T0.getValue();
    }

    /* renamed from: JM */
    public final String m75227JM() {
        Editable editable;
        EditText editText = this.f68729Q0;
        if (editText != null) {
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            return String.valueOf(editable);
        }
        return "";
    }

    /* renamed from: KM */
    private final void m75228KM(boolean z11) {
        C29876jc c29876jc = this.f68728P0;
        if (c29876jc == null) {
            AbstractC19074t.m100223u("mBinding");
            c29876jc = null;
        }
        RobotoTextView robotoTextView = c29876jc.f138338r;
        if (z11) {
            robotoTextView.setText(m92652XI(AbstractC8020f0.str_tool_storage_deselect_all));
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: xa0.d
                public /* synthetic */ ViewOnClickListenerC29557d() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ToolStorageListView.m75229LM(ToolStorageListView.this, view);
                }
            });
        } else {
            robotoTextView.setText(m92652XI(AbstractC8020f0.str_tool_storage_select_all));
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: xa0.e
                public /* synthetic */ ViewOnClickListenerC29558e() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ToolStorageListView.m75231MM(ToolStorageListView.this, view);
                }
            });
        }
    }

    /* renamed from: LM */
    public static final void m75229LM(ToolStorageListView toolStorageListView, View view) {
        AbstractC19074t.m100208f(toolStorageListView, "this$0");
        toolStorageListView.m75226IM().m75301R(new C13419f());
    }

    /* renamed from: M4 */
    public final void m75230M4(boolean z11) {
        int i11;
        View view = this.f68730R0;
        if (view != null) {
            if (!z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            view.setVisibility(i11);
        }
    }

    /* renamed from: MM */
    public static final void m75231MM(ToolStorageListView toolStorageListView, View view) {
        AbstractC19074t.m100208f(toolStorageListView, "this$0");
        toolStorageListView.m75226IM().m75317q0(new C13420g());
    }

    /* renamed from: NM */
    public final void m75232NM() {
        m75228KM(m75226IM().m75311i0());
        int size = m75226IM().m75304Y().size();
        C29876jc c29876jc = null;
        String m111038f = C21459a.m111038f(m75226IM().m75308f0(), 0, 2, null);
        C29876jc c29876jc2 = this.f68728P0;
        if (c29876jc2 == null) {
            AbstractC19074t.m100223u("mBinding");
            c29876jc2 = null;
        }
        RobotoTextView robotoTextView = c29876jc2.f138344x;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m92652XI = m92652XI(AbstractC8020f0.str_selected_photo_count_unlimit);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        String format = String.format(m92652XI, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        C29876jc c29876jc3 = this.f68728P0;
        if (c29876jc3 == null) {
            AbstractC19074t.m100223u("mBinding");
            c29876jc3 = null;
        }
        c29876jc3.f138345y.setText(m111038f);
        if (size > 0) {
            C29876jc c29876jc4 = this.f68728P0;
            if (c29876jc4 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                c29876jc = c29876jc4;
            }
            ImageView imageView = c29876jc.f138337q;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            imageView.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.danger));
            imageView.setEnabled(true);
            return;
        }
        C29876jc c29876jc5 = this.f68728P0;
        if (c29876jc5 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c29876jc = c29876jc5;
        }
        ImageView imageView2 = c29876jc.f138337q;
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        imageView2.setImageDrawable(C27280g.m139660c(m92689tK2, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.icon_03));
        imageView2.setEnabled(false);
    }

    /* renamed from: OM */
    private final void m75233OM() {
        C29876jc c29876jc = this.f68728P0;
        C29876jc c29876jc2 = null;
        if (c29876jc == null) {
            AbstractC19074t.m100223u("mBinding");
            c29876jc = null;
        }
        RecyclerView recyclerView = c29876jc.f138342v;
        recyclerView.setLayoutManager(m75225HM());
        recyclerView.setAdapter(m75224GM());
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: xa0.b
            public /* synthetic */ ViewOnTouchListenerC29555b() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m75234PM;
                m75234PM = ToolStorageListView.m75234PM(ToolStorageListView.this, view, motionEvent);
                return m75234PM;
            }
        });
        recyclerView.m9826E(new C13421h());
        C29876jc c29876jc3 = this.f68728P0;
        if (c29876jc3 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c29876jc2 = c29876jc3;
        }
        c29876jc2.f138337q.setOnClickListener(new View.OnClickListener() { // from class: xa0.c
            public /* synthetic */ ViewOnClickListenerC29556c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolStorageListView.m75235QM(ToolStorageListView.this, view);
            }
        });
    }

    /* renamed from: PM */
    public static final boolean m75234PM(ToolStorageListView toolStorageListView, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(toolStorageListView, "this$0");
        toolStorageListView.m75219C();
        return false;
    }

    /* renamed from: QM */
    public static final void m75235QM(ToolStorageListView toolStorageListView, View view) {
        AbstractC19074t.m100208f(toolStorageListView, "this$0");
        toolStorageListView.m75242XM();
    }

    /* renamed from: RM */
    private final void m75236RM() {
        m75226IM().m75307b0().m9219j(m92657cJ(), new C13430q(new C13427n()));
        m75226IM().m75305Z().m9219j(m92657cJ(), new C13430q(new C13428o()));
    }

    /* renamed from: SM */
    private final void m75237SM() {
        m75226IM().m75306a0().m9219j(m92657cJ(), new C13430q(new C13429p()));
    }

    /* renamed from: TM */
    private final void m75238TM() {
        Intent intent = new Intent();
        intent.putExtra("need_reload", true);
        mo50035CK(-1, intent);
    }

    /* renamed from: UM */
    public final void m75239UM() {
        m75226IM().m75312j0(true, new C13431r());
    }

    /* renamed from: VM */
    public final void m75240VM() {
        try {
            m75222EM();
            m75221DM();
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                ActionBarMenu actionBarMenu = this.f88763d0;
                if (actionBarMenu != null) {
                    actionBarMenu.m92750r();
                }
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_list_view_conversation_data_title));
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                actionBar.setTitleColor(AbstractC23136l9.m118639A(AbstractC16801x.storage_clear_storage_text_color));
                ActionBarMenu actionBarMenu2 = this.f88763d0;
                if (actionBarMenu2 != null) {
                    actionBarMenu2.m92738e(1, AbstractC16803z.icon_header_search);
                }
                actionBar.setActionBarMenuOnItemClick(actionBar.f88827z);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: WM */
    public final void m75241WM() {
        ActionBarMenuItem actionBarMenuItem;
        EditText editText;
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
        }
        ActionBarMenu actionBarMenu2 = this.f88763d0;
        View view = null;
        boolean z11 = false;
        if (actionBarMenu2 != null && (actionBarMenuItem = actionBarMenu2.m92738e(0, 0)) != null) {
            actionBarMenuItem.m92768B(true, true, AbstractC16803z.icn_header_close_white, AbstractC16803z.search_cursor_white);
            actionBarMenuItem.f88838J = true;
            EditText searchField = actionBarMenuItem.getSearchField();
            if (searchField != null) {
                searchField.setHint(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_search_hint));
            }
            actionBarMenuItem.m92767A(this.f68737Y0);
        } else {
            actionBarMenuItem = null;
        }
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
        }
        if (actionBarMenuItem != null && (editText = actionBarMenuItem.getSearchField()) != null) {
            editText.setEllipsize(TextUtils.TruncateAt.END);
            editText.setHintTextColor(AbstractC1388a.m6961c(m92686rK(), AbstractC16801x.white_50));
            editText.setTextColor(AbstractC1388a.m6961c(m92686rK(), AbstractC16801x.white));
            AbstractC2379w.m12432f(editText);
        } else {
            editText = null;
        }
        this.f68729Q0 = editText;
        if (actionBarMenuItem != null) {
            view = actionBarMenuItem.getClearButton();
        }
        this.f68730R0 = view;
        EditText editText2 = this.f68729Q0;
        if (editText2 != null) {
            AbstractC23647d.m123897g("711225");
            if (m75226IM().m75303X().length() > 0) {
                z11 = true;
            }
            m75230M4(z11);
            if (editText2.getParent() != null) {
                Object parent = editText2.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).setBackgroundResource(AbstractC16803z.stencil_edit_text_focused_no_space_white);
            }
        }
        String m75303X = m75226IM().m75303X();
        this.f88760a0.m92723u(m75303X);
        m75226IM().m75316p0(m75303X, new C13432s());
    }

    /* renamed from: XM */
    private final void m75242XM() {
        String format;
        List m131185M0;
        try {
            if (m75226IM().m75304Y().size() == 1) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m92652XI = m92652XI(AbstractC8020f0.str_confirm_delete_dialog_single_conversation_title);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                Collection values = m75226IM().m75304Y().values();
                AbstractC19074t.m100207e(values, "<get-values>(...)");
                m131185M0 = AbstractC25332a0.m131185M0(values);
                format = String.format(m92652XI, Arrays.copyOf(new Object[]{((ThreadStorageInfo) m131185M0.get(0)).m74779R()}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
            } else {
                C19067n0 c19067n02 = C19067n0.f94947a;
                String m92652XI2 = m92652XI(AbstractC8020f0.str_tool_storage_list_view_delete_media_title_dialog);
                AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                format = String.format(m92652XI2, Arrays.copyOf(new Object[]{Integer.valueOf(m75226IM().m75304Y().size())}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
            }
            long m75308f0 = m75226IM().m75308f0();
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C16972e0.a m90918B = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION).m90918B(format);
            String m92652XI3 = m92652XI(AbstractC8020f0.str_tool_storage_list_view_delete_media_body_dialog);
            AbstractC19074t.m100207e(m92652XI3, "getString(...)");
            String format2 = String.format(m92652XI3, Arrays.copyOf(new Object[]{C21459a.m111038f(m75308f0, 0, 2, null)}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            Spanned m119746j = AbstractC23244v8.m119746j(format2);
            AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
            this.f68731S0 = m90918B.m90949z(m119746j).m90921E(true).m90942s(AbstractC8020f0.str_delete, new InterfaceC17463d.d() { // from class: xa0.f
                public /* synthetic */ C29559f() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ToolStorageListView.m75243YM(ToolStorageListView.this, interfaceC17463d, i11);
                }
            }).m90933j(AbstractC8020f0.str_cancel_delete, new InterfaceC17463d.d() { // from class: xa0.g
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ToolStorageListView.m75244ZM(interfaceC17463d, i11);
                }
            }).m90931h("delete_data_dialog").m90947x("delete_only_media_button").m90937n("close_dialog_button").m90923G();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: YM */
    public static final void m75243YM(ToolStorageListView toolStorageListView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(toolStorageListView, "this$0");
        try {
            toolStorageListView.m75223FM();
            interfaceC17463d.dismiss();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: ZM */
    public static final void m75244ZM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: aN */
    public final void m75245aN() {
        Snackbar.C16925c c16925c = Snackbar.Companion;
        View m92691vK = m92691vK();
        AbstractC19074t.m100207e(m92691vK, "requireView(...)");
        Spanned m119746j = AbstractC23244v8.m119746j(m92653YI(AbstractC8020f0.str_tool_storage_overview_clear_cache_snackbar, C21459a.m111038f(m75226IM().m75308f0(), 0, 2, null)));
        AbstractC19074t.m100207e(m119746j, "getSpannedFromStrHtml(...)");
        Snackbar m90669d = c16925c.m90669d(m92691vK, m119746j, -1);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        m90669d.m90644J(C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_check_circle_solid_24, AbstractC2808b.gr60));
        m90669d.m90648N();
    }

    /* renamed from: bN */
    public final void m75246bN(ThreadStorageInfo threadStorageInfo) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("details", threadStorageInfo);
        bundle.putString("STR_SOURCE_START_VIEW", "storage_usage");
        C17487o0 m92662fJ = this.f72421L0.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ToolStorageDetailView.class, bundle, 1, 1, true);
        }
    }

    /* renamed from: iI */
    public final void m75249iI(List list) {
        C29876jc c29876jc = null;
        if (!list.isEmpty()) {
            C29876jc c29876jc2 = this.f68728P0;
            if (c29876jc2 == null) {
                AbstractC19074t.m100223u("mBinding");
                c29876jc2 = null;
            }
            c29876jc2.f138342v.setVisibility(0);
            C29876jc c29876jc3 = this.f68728P0;
            if (c29876jc3 == null) {
                AbstractC19074t.m100223u("mBinding");
                c29876jc3 = null;
            }
            c29876jc3.f138341u.setVisibility(8);
            C29876jc c29876jc4 = this.f68728P0;
            if (c29876jc4 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                c29876jc = c29876jc4;
            }
            c29876jc.f138341u.setState(MultiStateView.EnumC15914e.CONTENT);
            m75224GM().m146942O(list);
            return;
        }
        C29876jc c29876jc5 = this.f68728P0;
        if (c29876jc5 == null) {
            AbstractC19074t.m100223u("mBinding");
            c29876jc5 = null;
        }
        c29876jc5.f138342v.setVisibility(8);
        C29876jc c29876jc6 = this.f68728P0;
        if (c29876jc6 == null) {
            AbstractC19074t.m100223u("mBinding");
            c29876jc6 = null;
        }
        c29876jc6.f138341u.setVisibility(0);
        C29876jc c29876jc7 = this.f68728P0;
        if (c29876jc7 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c29876jc = c29876jc7;
        }
        c29876jc.f138341u.setState(MultiStateView.EnumC15914e.EMPTY);
    }

    /* renamed from: rs */
    public final void m75260rs(List list, String str) {
        Editable editable;
        Editable editable2;
        int i11;
        boolean z11;
        EditText editText = this.f68729Q0;
        C29876jc c29876jc = null;
        if (editText != null) {
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            if (editable != null) {
                EditText editText2 = this.f68729Q0;
                if (editText2 != null) {
                    editable2 = editText2.getText();
                } else {
                    editable2 = null;
                }
                String valueOf = String.valueOf(editable2);
                Locale locale = Locale.getDefault();
                AbstractC19074t.m100207e(locale, "getDefault(...)");
                String lowerCase = valueOf.toLowerCase(locale);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                int length = lowerCase.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    if (!z12) {
                        i11 = i12;
                    } else {
                        i11 = length;
                    }
                    if (AbstractC19074t.m100209g(lowerCase.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (!TextUtils.equals(str, lowerCase.subSequence(i12, length + 1).toString())) {
                    return;
                }
            }
        }
        if (list.isEmpty()) {
            C29876jc c29876jc2 = this.f68728P0;
            if (c29876jc2 == null) {
                AbstractC19074t.m100223u("mBinding");
                c29876jc2 = null;
            }
            c29876jc2.f138341u.setVisibility(0);
            C29876jc c29876jc3 = this.f68728P0;
            if (c29876jc3 == null) {
                AbstractC19074t.m100223u("mBinding");
                c29876jc3 = null;
            }
            c29876jc3.f138341u.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_empty_search));
            C29876jc c29876jc4 = this.f68728P0;
            if (c29876jc4 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                c29876jc = c29876jc4;
            }
            c29876jc.f138341u.setState(MultiStateView.EnumC15914e.EMPTY);
        } else {
            C29876jc c29876jc5 = this.f68728P0;
            if (c29876jc5 == null) {
                AbstractC19074t.m100223u("mBinding");
                c29876jc5 = null;
            }
            c29876jc5.f138341u.setVisibility(8);
            C29876jc c29876jc6 = this.f68728P0;
            if (c29876jc6 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                c29876jc = c29876jc6;
            }
            c29876jc.f138341u.setState(MultiStateView.EnumC15914e.CONTENT);
        }
        m75224GM().m146942O(list);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        this.f68733U0 = C13466a.Companion.m75525a(m92642L3());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29876jc m148131c = C29876jc.m148131c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148131c, "inflate(...)");
        this.f68728P0 = m148131c;
        m75233OM();
        m75236RM();
        C29876jc c29876jc = this.f68728P0;
        if (c29876jc == null) {
            AbstractC19074t.m100223u("mBinding");
            c29876jc = null;
        }
        LinearLayout root = c29876jc.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C16972e0 c16972e0 = this.f68731S0;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 1) {
            C29876jc c29876jc = this.f68728P0;
            if (c29876jc == null) {
                AbstractC19074t.m100223u("mBinding");
                c29876jc = null;
            }
            if (c29876jc.f138341u.getState() != MultiStateView.EnumC15914e.LOADING) {
                m75226IM().m75319s0(EnumC13416c.f68745r);
                return super.mo37491QJ(i11);
            }
        }
        if (i11 == 16908332 && (this.f88760a0.m92719n() || m75226IM().m75309g0())) {
            m75226IM().m75319s0(EnumC13416c.f68744q);
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m75237SM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ToolStorageThreadList";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1 && i12 == -1 && intent != null && intent.getBooleanExtra("need_reload", false)) {
            m75226IM().m75315o0();
            m75238TM();
        }
        m75226IM().m75319s0(EnumC13416c.f68744q);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && (this.f88760a0.m92719n() || m75226IM().m75309g0())) {
            m75226IM().m75319s0(EnumC13416c.f68744q);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
