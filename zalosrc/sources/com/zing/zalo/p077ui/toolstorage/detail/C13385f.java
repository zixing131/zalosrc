package com.zing.zalo.p077ui.toolstorage.detail;

import android.os.Parcelable;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import mm0.AbstractC23350e;

/* renamed from: com.zing.zalo.ui.toolstorage.detail.f */
/* loaded from: classes6.dex */
public final class C13385f extends AbstractC17505t0 {
    public static final a Companion = new a(null);

    /* renamed from: w */
    private final List f68628w;

    /* renamed from: x */
    private final ToolStorageDetailPage.EnumC13333a f68629x;

    /* renamed from: y */
    private boolean f68630y;

    /* renamed from: z */
    private ToolStorageDetailPage.InterfaceC13335c f68631z;

    /* renamed from: com.zing.zalo.ui.toolstorage.detail.f$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13385f(C17487o0 c17487o0, List list, ToolStorageDetailPage.EnumC13333a enumC13333a) {
        super(c17487o0);
        AbstractC19074t.m100208f(list, "tabViews");
        AbstractC19074t.m100208f(enumC13333a, "accessFlow");
        this.f68628w = list;
        this.f68629x = enumC13333a;
    }

    /* renamed from: A */
    public final void m75147A(ToolStorageDetailPage.InterfaceC13335c interfaceC13335c) {
        ToolStorageDetailPage.InterfaceC13335c interfaceC13335c2;
        this.f68631z = interfaceC13335c;
        int size = this.f89199t.size();
        for (int i11 = 0; i11 < size; i11++) {
            ZaloView zaloView = (ZaloView) this.f89199t.get(i11);
            if ((zaloView instanceof ToolStorageDetailPage) && (interfaceC13335c2 = this.f68631z) != null) {
                ((ToolStorageDetailPage) zaloView).m74882LM(interfaceC13335c2);
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f68628w.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        ZaloView zaloView;
        AbstractC19074t.m100208f(obj, "object");
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLToolStorageDetailViewPagerAdapter", e11);
        }
        if (this.f68630y) {
            this.f68630y = false;
            return -2;
        }
        if (obj instanceof ZaloView) {
            zaloView = (ZaloView) obj;
        } else {
            zaloView = null;
        }
        if (zaloView == null || !(obj instanceof ToolStorageDetailPage)) {
            return -2;
        }
        return -1;
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0, com.zing.p058v4.view.AbstractC6881a
    /* renamed from: o */
    public void mo35343o(Parcelable parcelable, ClassLoader classLoader) {
        ToolStorageDetailPage.InterfaceC13335c interfaceC13335c;
        super.mo35343o(parcelable, classLoader);
        try {
            int size = this.f89199t.size();
            for (int i11 = 0; i11 < size; i11++) {
                ZaloView zaloView = (ZaloView) this.f89199t.get(i11);
                if ((zaloView instanceof ToolStorageDetailPage) && (interfaceC13335c = this.f68631z) != null) {
                    ((ToolStorageDetailPage) zaloView).m74882LM(interfaceC13335c);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLToolStorageDetailViewPagerAdapter", e11);
        }
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ToolStorageDetailPage m74887a = ToolStorageDetailPage.Companion.m74887a((String) this.f68628w.get(i11), this.f68629x);
        ToolStorageDetailPage.InterfaceC13335c interfaceC13335c = this.f68631z;
        if (interfaceC13335c != null) {
            m74887a.m74882LM(interfaceC13335c);
        }
        return m74887a;
    }
}
