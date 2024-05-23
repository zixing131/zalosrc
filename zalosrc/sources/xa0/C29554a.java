package xa0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleViewKt;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import p227i3.C20218v;

/* renamed from: xa0.a */
/* loaded from: classes6.dex */
public final class C29554a extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private final StorageUsageItemModuleViewKt.InterfaceC12460b f136441r;

    /* renamed from: s */
    private List f136442s;

    /* renamed from: xa0.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: xa0.a$b */
    /* loaded from: classes6.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private StorageUsageItemModuleViewKt f136443I;

        /* renamed from: J */
        final /* synthetic */ C29554a f136444J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29554a c29554a, View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f136444J = c29554a;
            if (i11 == 0) {
                this.f136443I = (StorageUsageItemModuleViewKt) view;
            }
        }

        /* renamed from: i0 */
        public final StorageUsageItemModuleViewKt m146943i0() {
            return this.f136443I;
        }
    }

    public C29554a(StorageUsageItemModuleViewKt.InterfaceC12460b interfaceC12460b) {
        AbstractC19074t.m100208f(interfaceC12460b, "mListener");
        this.f136441r = interfaceC12460b;
        this.f136442s = new ArrayList();
    }

    /* renamed from: L */
    public final ThreadStorageInfo m146939L(int i11) {
        if (i11 >= 0 && i11 < this.f136442s.size()) {
            return (ThreadStorageInfo) this.f136442s.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        ThreadStorageInfo m146939L = m146939L(i11);
        try {
            StorageUsageItemModuleViewKt m146943i0 = bVar.m146943i0();
            if (m146943i0 != null) {
                m146943i0.m69966Y(m146939L, i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View view;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == 0) {
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            view = new StorageUsageItemModuleViewKt(context, StorageUsageItemModuleViewKt.EnumC12461c.f65230p, this.f136441r);
        } else {
            view = new View(viewGroup.getContext());
        }
        return new b(this, view, i11);
    }

    /* renamed from: O */
    public final void m146942O(List list) {
        AbstractC19074t.m100208f(list, "threads");
        this.f136442s = list;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f136442s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (m146939L(i11) != null) {
            return 0;
        }
        return 1;
    }
}
