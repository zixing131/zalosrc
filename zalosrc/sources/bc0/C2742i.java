package bc0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import tg0.C26676b;

/* renamed from: bc0.i */
/* loaded from: classes6.dex */
public final class C2742i extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private final StorageUsageItemModuleViewKt.InterfaceC12460b f10881r;

    /* renamed from: s */
    private final ArrayList f10882s;

    /* renamed from: bc0.i$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: bc0.i$b */
    /* loaded from: classes6.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final StorageUsageItemModuleViewKt f10883I;

        /* renamed from: J */
        final /* synthetic */ C2742i f10884J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2742i c2742i, StorageUsageItemModuleViewKt storageUsageItemModuleViewKt) {
            super(storageUsageItemModuleViewKt);
            AbstractC19074t.m100208f(storageUsageItemModuleViewKt, "itemView");
            this.f10884J = c2742i;
            this.f10883I = storageUsageItemModuleViewKt;
        }

        /* renamed from: i0 */
        public final StorageUsageItemModuleViewKt m13304i0() {
            return this.f10883I;
        }
    }

    public C2742i(StorageUsageItemModuleViewKt.InterfaceC12460b interfaceC12460b) {
        AbstractC19074t.m100208f(interfaceC12460b, "singleThreadListener");
        this.f10881r = interfaceC12460b;
        this.f10882s = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        Object obj = this.f10882s.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        try {
            bVar.m13304i0().m69966Y((ThreadStorageInfo) obj, i11);
        } catch (Exception e11) {
            C26676b.m136954d("Cloudmedia_Threads", e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == 0) {
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new b(this, new StorageUsageItemModuleViewKt(context, StorageUsageItemModuleViewKt.EnumC12461c.f65231q, this.f10881r));
        }
        throw new IllegalArgumentException("Invalid view type");
    }

    /* renamed from: N */
    public final void m13303N(List list) {
        AbstractC19074t.m100208f(list, "list");
        this.f10882s.clear();
        this.f10882s.addAll(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f10882s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return 0;
    }
}
