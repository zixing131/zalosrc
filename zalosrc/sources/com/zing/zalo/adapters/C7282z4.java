package com.zing.zalo.adapters;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.contact.SentFriendRequestItemModuleView;
import java.util.List;
import me0.AbstractC23063f2;
import p142ey.C18644n;

/* renamed from: com.zing.zalo.adapters.z4 */
/* loaded from: classes3.dex */
public class C7282z4 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f39915r;

    /* renamed from: s */
    private boolean f39916s = false;

    /* renamed from: t */
    private final c f39917t;

    /* renamed from: u */
    private boolean f39918u;

    /* renamed from: com.zing.zalo.adapters.z4$a */
    /* loaded from: classes3.dex */
    public static class a extends b {

        /* renamed from: I */
        private final SentFriendRequestItemModuleView f39919I;

        public a(SentFriendRequestItemModuleView sentFriendRequestItemModuleView) {
            super(sentFriendRequestItemModuleView);
            this.f39919I = sentFriendRequestItemModuleView;
        }

        @Override // com.zing.zalo.adapters.C7282z4.b
        /* renamed from: i0 */
        public void mo37052i0(ContactProfile contactProfile, int i11, boolean z11) {
            super.mo37052i0(contactProfile, i11, z11);
            this.f39919I.m69725Y(contactProfile, z11, i11);
        }
    }

    /* renamed from: com.zing.zalo.adapters.z4$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {
        public b(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public void mo37052i0(ContactProfile contactProfile, int i11, boolean z11) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.z4$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: Il */
        void mo37053Il(ContactProfile contactProfile);

        /* renamed from: bA */
        void mo37054bA(ContactProfile contactProfile, int i11);
    }

    public C7282z4(boolean z11, c cVar) {
        this.f39917t = cVar;
        this.f39918u = z11;
    }

    /* renamed from: M */
    public static int m37047M(String str) {
        if (C18644n.m98531l().m98558u(str)) {
            return 2;
        }
        if (AbstractC23063f2.m118359k(str)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: L */
    public int m37048L() {
        List list = this.f39915r;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int size = this.f39915r.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            ContactProfile contactProfile = (ContactProfile) this.f39915r.get(i12);
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && m37047M(contactProfile.f42434r) == 0) {
                i11++;
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public void mo9990A(b bVar, int i11) {
        try {
            bVar.mo37052i0((ContactProfile) this.f39915r.get(i11), i11, this.f39916s);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        return new a(new SentFriendRequestItemModuleView(viewGroup.getContext(), this, this.f39918u, this.f39917t));
    }

    /* renamed from: P */
    public void m37051P(List list) {
        this.f39915r = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f39915r;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
