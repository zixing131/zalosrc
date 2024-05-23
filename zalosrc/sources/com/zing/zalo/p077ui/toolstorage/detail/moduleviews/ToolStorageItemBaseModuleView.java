package com.zing.zalo.p077ui.toolstorage.detail.moduleviews;

import android.content.Context;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import me0.AbstractC23136l9;
import me0.C23055e5;
import p164fn.C19028b;
import p363nh.C23744a;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import p487rl.C25821b;

/* loaded from: classes6.dex */
public abstract class ToolStorageItemBaseModuleView extends ModulesView {

    /* renamed from: K */
    private InterfaceC13386a f68644K;

    /* renamed from: L */
    private int f68645L;

    /* renamed from: M */
    private C13380a f68646M;

    /* renamed from: N */
    private final C16719g.b f68647N;

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13386a {

        /* renamed from: com.zing.zalo.ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView$a$a */
        /* loaded from: classes6.dex */
        public static final class a {
            /* renamed from: a */
            public static void m75176a(InterfaceC13386a interfaceC13386a, C13380a c13380a) {
            }
        }

        /* renamed from: a */
        void mo75143a(C13380a c13380a);

        /* renamed from: b */
        void mo75144b(C13380a c13380a);

        /* renamed from: c */
        void mo75145c(C13380a c13380a);

        /* renamed from: d */
        void mo75146d(C13380a c13380a);
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView$b */
    /* loaded from: classes6.dex */
    public static final class C13387b implements InterfaceC24301d {

        /* renamed from: a */
        private final boolean f68648a = true;

        /* renamed from: c */
        final /* synthetic */ C13380a f68650c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18505l f68651d;

        C13387b(C13380a c13380a, InterfaceC18505l interfaceC18505l) {
            this.f68650c = c13380a;
            this.f68651d = interfaceC18505l;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return this.f68648a;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return EnumC24298a.f117297p;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "errorMessage");
            ToolStorageItemBaseModuleView.this.m75171i0(this.f68650c);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "path");
            ToolStorageItemBaseModuleView.this.m75173k0(this.f68650c, this.f68651d);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return InterfaceC24301d.a.m126884a(this);
        }
    }

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.moduleviews.ToolStorageItemBaseModuleView$c */
    /* loaded from: classes6.dex */
    public static final class C13388c implements C17945a0.x {

        /* renamed from: q */
        final /* synthetic */ C13380a f68653q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f68654r;

        C13388c(C13380a c13380a, InterfaceC18505l interfaceC18505l) {
            this.f68653q = c13380a;
            this.f68654r = interfaceC18505l;
        }

        @Override // dj.C17945a0.x
        /* renamed from: G */
        public void mo61268G(int i11, MessageId messageId) {
        }

        @Override // dj.C17945a0.x
        /* renamed from: H */
        public void mo61269H(MessageId messageId, boolean z11) {
            ToolStorageItemBaseModuleView.this.m75171i0(this.f68653q);
        }

        @Override // dj.C17945a0.x
        /* renamed from: m */
        public void mo61273m(int i11, MessageId messageId) {
        }

        @Override // dj.C17945a0.x
        /* renamed from: s */
        public void mo61274s(MessageId messageId, String str, boolean z11) {
            ToolStorageItemBaseModuleView.this.m75173k0(this.f68653q, this.f68654r);
        }
    }

    public ToolStorageItemBaseModuleView(Context context) {
        super(context);
        this.f68645L = AbstractC23136l9.m118725l0(context);
        this.f68647N = new C16719g.b() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.e
            public /* synthetic */ C13394e() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.b
            /* renamed from: a */
            public final void mo945a(C16719g c16719g, boolean z11) {
                ToolStorageItemBaseModuleView.m75168e0(ToolStorageItemBaseModuleView.this, c16719g, z11);
            }
        };
    }

    /* renamed from: e0 */
    public static final void m75168e0(ToolStorageItemBaseModuleView toolStorageItemBaseModuleView, C16719g c16719g, boolean z11) {
        AbstractC19074t.m100208f(toolStorageItemBaseModuleView, "this$0");
        C13380a c13380a = toolStorageItemBaseModuleView.f68646M;
        if (c13380a != null && c13380a.m75073C() != z11) {
            c13380a.m75079I(z11);
            InterfaceC13386a interfaceC13386a = toolStorageItemBaseModuleView.f68644K;
            if (interfaceC13386a != null) {
                interfaceC13386a.mo75143a(c13380a);
            }
        }
    }

    /* renamed from: g0 */
    public static final void m75169g0() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
    }

    /* renamed from: h0 */
    public static final void m75170h0() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
    }

    /* renamed from: i0 */
    public final void m75171i0(C13380a c13380a) {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.h

            /* renamed from: q */
            public final /* synthetic */ ToolStorageItemBaseModuleView f68701q;

            public /* synthetic */ RunnableC13397h(ToolStorageItemBaseModuleView this) {
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ToolStorageItemBaseModuleView.m75172j0(C13380a.this, r2);
            }
        });
    }

    /* renamed from: j0 */
    public static final void m75172j0(C13380a c13380a, ToolStorageItemBaseModuleView toolStorageItemBaseModuleView) {
        AbstractC19074t.m100208f(c13380a, "$storageUsageDetailItem");
        AbstractC19074t.m100208f(toolStorageItemBaseModuleView, "this$0");
        c13380a.m75098t().set(false);
        toolStorageItemBaseModuleView.mo75158m0(false);
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
    }

    /* renamed from: k0 */
    public final void m75173k0(C13380a c13380a, InterfaceC18505l interfaceC18505l) {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.i

            /* renamed from: q */
            public final /* synthetic */ ToolStorageItemBaseModuleView f68703q;

            /* renamed from: r */
            public final /* synthetic */ InterfaceC18505l f68704r;

            public /* synthetic */ RunnableC13398i(ToolStorageItemBaseModuleView this, InterfaceC18505l interfaceC18505l2) {
                r2 = this;
                r3 = interfaceC18505l2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ToolStorageItemBaseModuleView.m75174l0(C13380a.this, r2, r3);
            }
        });
    }

    /* renamed from: l0 */
    public static final void m75174l0(C13380a c13380a, ToolStorageItemBaseModuleView toolStorageItemBaseModuleView, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c13380a, "$storageUsageDetailItem");
        AbstractC19074t.m100208f(toolStorageItemBaseModuleView, "this$0");
        AbstractC19074t.m100208f(interfaceC18505l, "$doSomething");
        c13380a.m75098t().set(false);
        toolStorageItemBaseModuleView.mo75158m0(false);
        C23744a.Companion.m124119a().m124116d(150805, c13380a);
        interfaceC18505l.mo205i9(c13380a);
    }

    /* renamed from: d0 */
    public void mo75157d0(C13380a c13380a) {
        if (c13380a == null) {
            return;
        }
        if (c13380a.m75089k() == null && c13380a.m75082d() == null) {
            return;
        }
        this.f68646M = c13380a;
        mo75159n0(c13380a.m75073C(), false);
        if (c13380a.m75098t().get()) {
            mo75158m0(true);
        } else {
            mo75158m0(false);
        }
    }

    /* renamed from: f0 */
    public final void m75175f0(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "doSomething");
        C13380a c13380a = this.f68646M;
        if (c13380a != null) {
            if (!c13380a.m75071A() && !c13380a.m75097s() && !c13380a.m75075E()) {
                if (c13380a.m75099u()) {
                    interfaceC18505l.mo205i9(c13380a);
                    return;
                }
                if (!C23055e5.m118272g(true) || c13380a.m75098t().getAndSet(true)) {
                    return;
                }
                if (c13380a.m75096r()) {
                    C25821b m75082d = c13380a.m75082d();
                    if (m75082d == null) {
                        c13380a.m75098t().set(false);
                        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                ToolStorageItemBaseModuleView.m75169g0();
                            }
                        });
                        return;
                    } else {
                        mo75158m0(true);
                        C24302e.Companion.m126919j().m126908q(m75082d, new C13387b(c13380a, interfaceC18505l));
                        return;
                    }
                }
                if (c13380a.m75104z()) {
                    C17945a0 m75089k = c13380a.m75089k();
                    if (m75089k == null) {
                        c13380a.m75098t().set(false);
                        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.toolstorage.detail.moduleviews.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                ToolStorageItemBaseModuleView.m75170h0();
                            }
                        });
                        return;
                    } else {
                        mo75158m0(true);
                        m75089k.m94859Bb(new C13388c(c13380a, interfaceC18505l));
                        m75089k.m94891Fa(true);
                        m75089k.m94980Pb(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94843p, true, false, 4, null), true);
                        return;
                    }
                }
                return;
            }
            interfaceC18505l.mo205i9(c13380a);
        }
    }

    public final C16719g.b getCbCheckedChangedListener() {
        return this.f68647N;
    }

    public final InterfaceC13386a getMListener() {
        return this.f68644K;
    }

    public final int getScreenWidth() {
        return this.f68645L;
    }

    public final C13380a getStorageUsageDetailItem() {
        return this.f68646M;
    }

    /* renamed from: m0 */
    public void mo75158m0(boolean z11) {
    }

    /* renamed from: n0 */
    public abstract void mo75159n0(boolean z11, boolean z12);

    public final void setItemEventListener(InterfaceC13386a interfaceC13386a) {
        AbstractC19074t.m100208f(interfaceC13386a, "listener");
        this.f68644K = interfaceC13386a;
    }

    protected final void setMListener(InterfaceC13386a interfaceC13386a) {
        this.f68644K = interfaceC13386a;
    }

    protected final void setScreenWidth(int i11) {
        this.f68645L = i11;
    }

    protected final void setStorageUsageDetailItem(C13380a c13380a) {
        this.f68646M = c13380a;
    }
}
