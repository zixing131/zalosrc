package com.zing.zalo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.moduleview.searchsetting.SettingSearchItemModuleView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import java.util.ArrayList;
import java.util.List;
import p716zh.C32178x9;

/* renamed from: com.zing.zalo.adapters.w6 */
/* loaded from: classes3.dex */
public class C7251w6 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final c f39782r;

    /* renamed from: s */
    private ArrayList f39783s;

    /* renamed from: t */
    private boolean f39784t = false;

    /* renamed from: com.zing.zalo.adapters.w6$a */
    /* loaded from: classes3.dex */
    public static class a extends b {

        /* renamed from: I */
        int f39785I;

        /* renamed from: J */
        RobotoTextView f39786J;

        public a(View view, int i11) {
            super(view);
            this.f39785I = i11;
            if (i11 == 0) {
                this.f39786J = (RobotoTextView) view.findViewById(AbstractC6918a0.txt_description);
            }
        }

        @Override // com.zing.zalo.adapters.C7251w6.b
        /* renamed from: i0 */
        public void mo36963i0(C32178x9 c32178x9, int i11) {
            super.mo36963i0(c32178x9, i11);
            if (this.f39785I == 0) {
                this.f39786J.setText(c32178x9.f148385s);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.w6$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {
        public b(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public void mo36963i0(C32178x9 c32178x9, int i11) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.w6$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: as */
        boolean mo36964as();

        /* renamed from: sj */
        void mo36965sj(C32178x9 c32178x9);
    }

    /* renamed from: com.zing.zalo.adapters.w6$d */
    /* loaded from: classes3.dex */
    public static class d extends b {

        /* renamed from: I */
        SettingSearchItemModuleView f39787I;

        public d(SettingSearchItemModuleView settingSearchItemModuleView) {
            super(settingSearchItemModuleView);
            this.f39787I = settingSearchItemModuleView;
        }

        @Override // com.zing.zalo.adapters.C7251w6.b
        /* renamed from: i0 */
        public void mo36963i0(C32178x9 c32178x9, int i11) {
            super.mo36963i0(c32178x9, i11);
            this.f39787I.m69954W(c32178x9);
        }
    }

    public C7251w6(List list, c cVar) {
        this.f39783s = new ArrayList(list);
        this.f39782r = cVar;
    }

    /* renamed from: L */
    public C32178x9 m36958L(int i11) {
        ArrayList arrayList = this.f39783s;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C32178x9) this.f39783s.get(i11);
        }
        return null;
    }

    /* renamed from: M */
    public boolean m36959M() {
        return this.f39784t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public void mo9990A(b bVar, int i11) {
        if (i11 < mo10003k() && i11 >= 0) {
            bVar.mo36963i0(m36958L(i11), i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 0) {
            return new d(new SettingSearchItemModuleView(viewGroup.getContext(), this.f39782r));
        }
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.search_setting_item_header, viewGroup, false), i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:            r1.f39784t = true;     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m36962P(List list) {
        this.f39783s = new ArrayList(list);
        int i11 = 0;
        try {
            this.f39784t = false;
            while (true) {
                if (i11 >= this.f39783s.size()) {
                    break;
                } else if (((C32178x9) this.f39783s.get(i11)).f148390x > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f39783s;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        if (!m10007o()) {
            super.mo10004l(i11);
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C32178x9 m36958L = m36958L(i11);
        if (m36958L != null && -1 == m36958L.f148384r) {
            return 0;
        }
        return 1;
    }
}
