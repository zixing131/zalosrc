package ja0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.moduleview.search.MediaStoreItemLinkModuleView;
import ea0.C18333g1;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29080l;

/* renamed from: ja0.x */
/* loaded from: classes6.dex */
public class C21193x extends RecyclerView.AbstractC1876c0 {

    /* renamed from: I */
    private final boolean f103338I;

    /* renamed from: J */
    private final InterfaceC18319c f103339J;

    /* renamed from: K */
    private final MediaStoreItemLinkModuleView f103340K;

    /* renamed from: ja0.x$a */
    /* loaded from: classes6.dex */
    public static final class a implements MediaStoreItemLinkModuleView.InterfaceC12454a {

        /* renamed from: b */
        final /* synthetic */ AbstractC29069a.j f103342b;

        a(AbstractC29069a.j jVar) {
            this.f103342b = jVar;
        }

        @Override // com.zing.zalo.p077ui.moduleview.search.MediaStoreItemLinkModuleView.InterfaceC12454a
        /* renamed from: a */
        public void mo69921a(View view) {
            InterfaceC18319c m109750j0 = C21193x.this.m109750j0();
            if (m109750j0 != null) {
            }
        }

        @Override // com.zing.zalo.p077ui.moduleview.search.MediaStoreItemLinkModuleView.InterfaceC12454a
        /* renamed from: b */
        public void mo69922b(View view) {
            InterfaceC18319c m109750j0 = C21193x.this.m109750j0();
            if (m109750j0 != null) {
            }
        }

        @Override // com.zing.zalo.p077ui.moduleview.search.MediaStoreItemLinkModuleView.InterfaceC12454a
        /* renamed from: c */
        public void mo69923c(MediaStoreItem mediaStoreItem, boolean z11) {
        }

        @Override // com.zing.zalo.p077ui.moduleview.search.MediaStoreItemLinkModuleView.InterfaceC12454a
        /* renamed from: d */
        public void mo69924d(MediaStoreItemLinkModuleView mediaStoreItemLinkModuleView) {
            InterfaceC18319c m109750j0 = C21193x.this.m109750j0();
            if (m109750j0 != null) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21193x(ViewGroup viewGroup, boolean z11, InterfaceC18319c interfaceC18319c) {
        super(new MediaStoreItemLinkModuleView(r3, false));
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f103338I = z11;
        this.f103339J = interfaceC18319c;
        View view = this.f7784p;
        AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.ui.moduleview.search.MediaStoreItemLinkModuleView");
        this.f103340K = (MediaStoreItemLinkModuleView) view;
    }

    /* renamed from: i0 */
    public final void m109749i0(AbstractC29069a.j jVar, AbstractC29080l abstractC29080l, boolean z11) {
        AbstractC19074t.m100208f(jVar, "data");
        MediaStoreItem m145186b = jVar.m145186b();
        this.f103340K.setShowMenuButton(false);
        this.f103340K.setTimeline(jVar.m145187c());
        this.f103340K.m69920j0(m145186b, z11);
        this.f103340K.setEnableMultiSelect(this.f103338I);
        this.f103340K.setVisibilityCline(false);
        this.f103340K.setPaddingTopLayoutLinkFile(AbstractC23136l9.m118742r(10.0f));
        this.f103340K.setLinkListener(new a(jVar));
        C18333g1.f92667a.m97293j(this.f103340K.getCline(), this.f103340K.getMarginLeftBottomLineStyleContent(), jVar, abstractC29080l);
    }

    /* renamed from: j0 */
    public final InterfaceC18319c m109750j0() {
        return this.f103339J;
    }
}
