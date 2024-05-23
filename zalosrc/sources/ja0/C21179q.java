package ja0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.moduleview.search.MediaStoreItemFileModuleView;
import ea0.C18316b;
import ea0.C18333g1;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import me0.AbstractC23136l9;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29080l;
import tk.InterfaceC26722a;

/* renamed from: ja0.q */
/* loaded from: classes6.dex */
public class C21179q extends RecyclerView.AbstractC1876c0 {

    /* renamed from: I */
    private final InterfaceC18319c f103303I;

    /* renamed from: J */
    private final MediaStoreItemFileModuleView f103304J;

    /* renamed from: K */
    private boolean f103305K;

    /* renamed from: L */
    private boolean f103306L;

    /* renamed from: ja0.q$a */
    /* loaded from: classes6.dex */
    public static final class a implements MediaStoreItemFileModuleView.InterfaceC12450a {

        /* renamed from: a */
        final /* synthetic */ MediaStoreItem f103307a;

        /* renamed from: b */
        final /* synthetic */ C21179q f103308b;

        /* renamed from: c */
        final /* synthetic */ AbstractC29069a.e f103309c;

        a(MediaStoreItem mediaStoreItem, C21179q c21179q, AbstractC29069a.e eVar) {
            this.f103307a = mediaStoreItem;
            this.f103308b = c21179q;
            this.f103309c = eVar;
        }

        @Override // com.zing.zalo.p077ui.moduleview.search.MediaStoreItemFileModuleView.InterfaceC12450a
        /* renamed from: a */
        public void mo69898a(View view) {
            InterfaceC18319c m109729n0 = this.f103308b.m109729n0();
            if (m109729n0 != null) {
            }
        }

        @Override // com.zing.zalo.p077ui.moduleview.search.MediaStoreItemFileModuleView.InterfaceC12450a
        /* renamed from: b */
        public void mo69899b(View view) {
            InterfaceC18319c m109729n0 = this.f103308b.m109729n0();
            if (m109729n0 != null) {
            }
        }

        @Override // com.zing.zalo.p077ui.moduleview.search.MediaStoreItemFileModuleView.InterfaceC12450a
        /* renamed from: c */
        public void mo69900c(MediaStoreItem mediaStoreItem, boolean z11) {
        }

        @Override // com.zing.zalo.p077ui.moduleview.search.MediaStoreItemFileModuleView.InterfaceC12450a
        /* renamed from: d */
        public void mo69901d(MediaStoreItemFileModuleView mediaStoreItemFileModuleView) {
        }

        @Override // com.zing.zalo.p077ui.moduleview.search.MediaStoreItemFileModuleView.InterfaceC12450a
        /* renamed from: e */
        public void mo69902e(MediaStoreItemFileModuleView mediaStoreItemFileModuleView) {
            try {
                if (!this.f103307a.m40596j0() && !this.f103308b.m109730o0()) {
                    this.f103307a.m40610t0(false);
                    AbstractC19074t.m100205c(mediaStoreItemFileModuleView);
                    mediaStoreItemFileModuleView.m69897q0(false);
                    this.f103308b.m109726p0(this.f103309c);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21179q(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(new MediaStoreItemFileModuleView(r4, false, true));
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f103303I = interfaceC18319c;
        View view = this.f7784p;
        AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.ui.moduleview.search.MediaStoreItemFileModuleView");
        this.f103304J = (MediaStoreItemFileModuleView) view;
    }

    /* renamed from: l0 */
    private final void m109724l0(AbstractC29069a.e eVar, boolean z11) {
        MediaStoreItem m145174b = eVar.m145174b();
        String mo95039W2 = m145174b.m40599m().mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        this.f103304J.setConversationId(mo95039W2);
        this.f103304J.setShowMenuButton(false);
        this.f103304J.setTimeline(eVar.m145175c());
        this.f103304J.m69896o0(m145174b, z11);
        this.f103304J.setVisibilityCline(false);
        this.f103304J.setPaddingTopLayoutLinkFile(AbstractC23136l9.m118742r(10.0f));
        this.f103304J.setTag(m145174b.m40616y());
        this.f103304J.setFileListener(new a(m145174b, this, eVar));
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m109725m0(C21179q c21179q, AbstractC29069a.e eVar, AbstractC29080l abstractC29080l, boolean z11, Object obj, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 8) != 0) {
                obj = null;
            }
            c21179q.m109728k0(eVar, abstractC29080l, z11, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* renamed from: p0 */
    public final void m109726p0(InterfaceC26722a interfaceC26722a) {
        Object obj;
        C18316b c18316b;
        try {
            InterfaceC18319c interfaceC18319c = this.f103303I;
            Boolean bool = null;
            if (interfaceC18319c != null && (c18316b = (C18316b) interfaceC18319c.mo205i9(new C18316b("ACTION_GET_IS_HANDLING_CLICK_FILE", null, null, null, 14, null))) != null) {
                obj = c18316b.m97245a();
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            if (bool != null && bool.booleanValue()) {
                return;
            }
            InterfaceC18319c interfaceC18319c2 = this.f103303I;
            if (interfaceC18319c2 != null) {
            }
            AbstractC19444a.m101694b(new Runnable() { // from class: ja0.p
                @Override // java.lang.Runnable
                public final void run() {
                    C21179q.m109727q0(C21179q.this);
                }
            }, 500L);
            InterfaceC18319c interfaceC18319c3 = this.f103303I;
            if (interfaceC18319c3 != null) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q0 */
    public static final void m109727q0(C21179q c21179q) {
        AbstractC19074t.m100208f(c21179q, "this$0");
        InterfaceC18319c interfaceC18319c = c21179q.f103303I;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: k0 */
    public final void m109728k0(AbstractC29069a.e eVar, AbstractC29080l abstractC29080l, boolean z11, Object obj) {
        AbstractC19074t.m100208f(eVar, "data");
        try {
            if (AbstractC19074t.m100204b(obj, "PAYLOAD_SCROLL_STATE_CHANGED")) {
                if (this.f103306L && !z11) {
                    this.f103306L = false;
                    this.f103304J.m69894d0(eVar.m145174b(), z11);
                    return;
                }
                return;
            }
            if (z11) {
                this.f103306L = true;
            }
            m109724l0(eVar, z11);
            C18333g1.f92667a.m97293j(this.f103304J.getCline(), this.f103304J.getMarginLeftBottomLineStyleContent(), eVar, abstractC29080l);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n0 */
    public final InterfaceC18319c m109729n0() {
        return this.f103303I;
    }

    /* renamed from: o0 */
    public final boolean m109730o0() {
        return this.f103305K;
    }
}
