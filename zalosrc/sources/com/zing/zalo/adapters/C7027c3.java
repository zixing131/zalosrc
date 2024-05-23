package com.zing.zalo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.inappnoti.InAppNotiChatModuleView;
import java.util.ArrayList;
import java.util.List;
import p354n3.C23528a;

/* renamed from: com.zing.zalo.adapters.c3 */
/* loaded from: classes.dex */
public class C7027c3 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f38414r;

    /* renamed from: s */
    C23528a f38415s;

    /* renamed from: t */
    public InAppNotiChatModuleView.InterfaceC12418a f38416t;

    /* renamed from: com.zing.zalo.adapters.c3$a */
    /* loaded from: classes3.dex */
    public static class a extends d {

        /* renamed from: I */
        InAppNotiChatModuleView f38417I;

        public a(InAppNotiChatModuleView inAppNotiChatModuleView) {
            super(inAppNotiChatModuleView);
            this.f38417I = inAppNotiChatModuleView;
        }

        @Override // com.zing.zalo.adapters.C7027c3.d
        /* renamed from: i0 */
        public void mo35924i0(c cVar, int i11) {
            super.mo35924i0(cVar, i11);
            try {
                if (cVar instanceof b) {
                    this.f38417I.m69755W((b) cVar);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.c3$b */
    /* loaded from: classes3.dex */
    public static class b extends c {

        /* renamed from: b */
        public ContactProfile f38418b;

        /* renamed from: c */
        public boolean f38419c;

        public b(int i11, ContactProfile contactProfile) {
            super(i11);
            this.f38418b = contactProfile;
            this.f38419c = false;
        }
    }

    /* renamed from: com.zing.zalo.adapters.c3$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        private final int f38420a;

        public c(int i11) {
            this.f38420a = i11;
        }

        /* renamed from: a */
        public int m35925a() {
            return this.f38420a;
        }
    }

    /* renamed from: com.zing.zalo.adapters.c3$d */
    /* loaded from: classes3.dex */
    public static class d extends RecyclerView.AbstractC1876c0 {
        public d(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public void mo35924i0(c cVar, int i11) {
        }
    }

    /* renamed from: L */
    public c m35918L(int i11) {
        List list = this.f38414r;
        if (list != null && list.size() > i11) {
            return (c) this.f38414r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M */
    public void mo9990A(d dVar, int i11) {
        c cVar = new c(-1);
        List list = this.f38414r;
        if (list != null && list.size() > i11) {
            cVar = (c) this.f38414r.get(i11);
        }
        dVar.mo35924i0(cVar, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public d mo9992C(ViewGroup viewGroup, int i11) {
        Context context = viewGroup.getContext();
        if (i11 != 0) {
            return new d(new View(context));
        }
        return new a(new InAppNotiChatModuleView(context, this.f38415s, this));
    }

    /* renamed from: O */
    public void m35921O(C23528a c23528a) {
        this.f38415s = c23528a;
    }

    /* renamed from: P */
    public void m35922P(InAppNotiChatModuleView.InterfaceC12418a interfaceC12418a) {
        this.f38416t = interfaceC12418a;
    }

    /* renamed from: Q */
    public void m35923Q(List list) {
        this.f38414r = new ArrayList(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38414r;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        if (!m10007o()) {
            return super.mo10004l(i11);
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        c m35918L = m35918L(i11);
        if (m35918L != null) {
            return m35918L.m35925a();
        }
        return super.mo10005m(i11);
    }
}
