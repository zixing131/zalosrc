package p40;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.drive.DriveAccountItemModuleView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p227i3.C20218v;

/* renamed from: p40.b */
/* loaded from: classes5.dex */
public final class C24637b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final InterfaceC18505l f118508r;

    /* renamed from: s */
    private final InterfaceC18494a f118509s;

    /* renamed from: t */
    private final boolean f118510t;

    /* renamed from: u */
    private final ArrayList f118511u;

    /* renamed from: p40.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private DriveAccountItemModuleView f118512I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f118512I = (DriveAccountItemModuleView) view;
        }

        /* renamed from: i0 */
        public final DriveAccountItemModuleView m128179i0() {
            return this.f118512I;
        }
    }

    public C24637b(InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a, boolean z11) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSelectedAccount");
        AbstractC19074t.m100208f(interfaceC18494a, "onChooseAnotherAccount");
        this.f118508r = interfaceC18505l;
        this.f118509s = interfaceC18494a;
        this.f118510t = z11;
        this.f118511u = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m128175O(C24637b c24637b, a aVar, View view) {
        AbstractC19074t.m100208f(c24637b, "this$0");
        AbstractC19074t.m100208f(aVar, "$viewHolder");
        if (c24637b.f118510t && aVar.m9929A() == c24637b.f118511u.size() - 1) {
            c24637b.f118509s.mo12V4();
            return;
        }
        InterfaceC18505l interfaceC18505l = c24637b.f118508r;
        Object obj = c24637b.f118511u.get(aVar.m9929A());
        AbstractC19074t.m100207e(obj, "get(...)");
        interfaceC18505l.mo205i9(obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        Object obj = this.f118511u.get(aVar.m9929A());
        AbstractC19074t.m100207e(obj, "get(...)");
        String str = (String) obj;
        DriveAccountItemModuleView m128179i0 = aVar.m128179i0();
        if (m128179i0 != null) {
            m128179i0.m57594V(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        DriveAccountItemModuleView driveAccountItemModuleView = new DriveAccountItemModuleView(viewGroup.getContext());
        final a aVar = new a(driveAccountItemModuleView);
        driveAccountItemModuleView.setOnClickListener(new View.OnClickListener() { // from class: p40.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C24637b.m128175O(C24637b.this, aVar, view);
            }
        });
        return aVar;
    }

    /* renamed from: P */
    public final void m128178P(List list) {
        AbstractC19074t.m100208f(list, "listAccount");
        this.f118511u.clear();
        this.f118511u.addAll(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f118511u.size();
    }
}
